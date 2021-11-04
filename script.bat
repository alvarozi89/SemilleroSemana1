@echo off
::Realizado por: ALV
echo "*****SCRIPT******"
start cmd /k mvn clean install
echo Si el proyecto compilo con exito, presiona cualquier tecla...
pause >nul
cd /D "C:\wildfly-15.0.1.Final\standalone\deployments"
echo Limpiando directorio...
del /F /S /Q *.ear
del /F /S /Q *.deployed
echo Copiando .ear
xcopy D:\Escritorio\Alv UNAD\Heinsohn\HerramientasSemilleroHBT2019\HerramientasSemilleroHBT2019\semillero-hbt\semillero-hbt\semillero-padre\semillero-ear\target\semillero-ear-1.0-SNAPSHOT.ear "C:\wildfly-15.0.1.Final\standalone\deployments"  
echo Ejecutando .bat
cd /D "C:\wildfly-15.0.1.Final\bin\"  
call standalone.bat
pause
:exit
