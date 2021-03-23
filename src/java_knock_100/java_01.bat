@ECHO OFF
@REM -------------------------------------------------------
@REM java-100practices
@REM answer001.bat
@REM author: jswaf
@REM -------------------------------------------------------

SET CLASSES=classes

IF NOT EXIST %CLASSES% (
    MKDIR %CLASSES%
    IF ERRORLEVEL 1 GOTO FAILURE
)



javac -sourcepath . -d %CLASSES% -encoding UTF-8 java_01.java
IF ERRORLEVEL 1 GOTO FAILURE

java -cp %CLASSES% java_knock_100.java_01
IF ERRORLEVEL 1 GOTO FAILURE

GOTO SUCCESS

:FAILURE
EXIT /B %ERRORLEVEL%

:SUCCESS
