echo off
rem ==============================================================================
rem  This shell script xxx
rem ==============================================================================

rem set FROM_TS=2013-04-10
rem set TO_TS=2013-04-10T19:00:00+02:00
rem java -cp %CLASSPATH%  %MAINCLASS% -f %FROM_TS% -t %TO_TS%


set CLASSPATH="./lib/*;." 
set MAINCLASS=ch.heb.nrg16.desktop.DesktopController


java -cp %CLASSPATH%  %MAINCLASS%