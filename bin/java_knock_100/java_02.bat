@ECHO OFF
@REM -------------------------------------------------------
@REM java-100practices
@REM answer001.bat
@REM author: jswaf
@REM -------------------------------------------------------

javac -version
java -version

IF NOT EXIST %CLASSES% (
    MKDIR %CLASSES%
    IF ERRORLEVEL 1 GOTO FAILURE
)

:FAILURE
EXIT /B %ERRORLEVEL%

:SUCCESS
