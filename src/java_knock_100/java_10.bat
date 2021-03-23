@ECHO OFF
@REM -------------------------------------------------------
@REM java-100practices
@REM answer001.bat
@REM author: jswaf
@REM -------------------------------------------------------

SET CLASSES=classes
SET MATEINFO=MATE-INFO


IF NOT EXIST %CLASSES% (
    MKDIR %CLASSES%
    IF ERRORLEVEL 1 GOTO FAILURE
)

IF NOT EXIST %MATEINFO% (
    MKDIR %MATEINFO%
    IF ERRORLEVEL 1 GOTO FAILURE
)

touch %MATEINFO%/MANIFEST.MF
IF ERRORLEVEL 1 GOTO FAILURE
echo Main-Class: java_knock_100.java_01 > %MATEINFO%/MANIFEST.MF
IF ERRORLEVEL 1 GOTO FAILURE

javac -sourcepath . -d %CLASSES% -encoding UTF-8 java_01.java
IF ERRORLEVEL 1 GOTO FAILURE

jar cvfm java01.jar %MATEINFO%/MANIFEST.MF -C %CLASSES% .
IF ERRORLEVEL 1 GOTO FAILURE

java -jar java01.jar
IF ERRORLEVEL 1 GOTO FAILURE

GOTO SUCCESS

:FAILURE
EXIT /B %ERRORLEVEL%

:SUCCESS
