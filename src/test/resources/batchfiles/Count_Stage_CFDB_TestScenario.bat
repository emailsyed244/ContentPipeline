@echo off
SETLOCAL ENABLEDELAYEDEXPANSION

set cliPath=C:\Program Files\QuerySurge\cli\qscli
set hostname=localhost
set port=90
set username=admin
;:add corresponding username and password to the qsapi.properties file to authenticate
set suiteIdList=Count_Test_Suite01,Count_Test_Suite02

;:  ' ********************* END OF CONFIGURATION VARIABLES **************************

;: Execute a QuerySurge Scenario for each of the identified Suites by Suite ID
for %%i in (%suiteIdList%) do (
  echo Running Suite %%i
  FOR /F "tokens=*" %%a in ('call "%cliPath%" runTestSuiteByName --hostname %hostname% --port %port% --username %username% %%i') do (
    SET scenarioIdList=!scenarioIdList! %%a
  )

)

SET scenarioIdList=%scenarioIdList:~1%

;: Loop until the Scenario has completed
:DoUntil

for %%j in (%scenarioIdList%) do (
  
  :; Get the scenario outcome/status using the Scenario ID that was handed back
  FOR /F "tokens=*" %%a in ('call "%cliPath%" getScenarioOutcome --hostname %hostname% --port %port% --username %username% %%j') do (
    set outcome=%%a
   
    ;: Wait for the outcome/status to be neither 'Not Run' nor 'Running' (meaning wait for completion)
    IF "%%a"=="Not Run" GOTO DoUntil
    IF "%%a"=="Running" GOTO DoUntil
    
  )
)


;: Output each of the Scenario results
for %%k in (%scenarioIdList%) do (

  ;: Get the Outcomes
  FOR /F "tokens=*" %%a in ('call "%cliPath%" getScenarioOutcome --hostname %hostname% --port %port% --username %username% %%k') do (
       echo %%a
     
  )
)
