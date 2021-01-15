IF EXIST %USERPROFILE%\rotbuster @RD /S /Q %USERPROFILE%\rotbuster
mkdir %USERPROFILE%\rotbuster
copy rotbuster.bat %USERPROFILE%\rotbuster
copy rotbuster.jar %USERPROFILE%\rotbuster
copy README.txt %USERPROFILE%\rotbuster

setx PATH "%PATH%;%USERPROFILE%\rotbuster\"