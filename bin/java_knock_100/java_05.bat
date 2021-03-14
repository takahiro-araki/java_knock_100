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

java -Dhttp.proxyHost=proxy.example.com -Dhttp.proxyPort=80 -Dhttp.nonProxyHosts=*.noproxy.example.com -cp %CLASSES% java_knock_100.java_01
IF ERRORLEVEL 1 GOTO FAILURE

GOTO SUCCESS

:FAILURE
EXIT /B %ERRORLEVEL%

:SUCCESS