$tw=Read-Host 'Introduzca 1 para retuitear, introduzca 0 para dar me gusta'

if ($tw-eq1){
$tw2=Read-Host '¿Tiene más de 66 caracteres? 1=Sí 0=No'
if($tw2-eq1){
$urlsp1='https://twitter.com/search?q=esjesusparedes&src=typed_query&f=live'
Start-Process chrome $urlsp1
Start-Sleep -Seconds 3

$MouseEventSig=@’
[DllImport("user32.dll",CharSet=CharSet.Auto, CallingConvention=CallingConvention.StdCall)]
public static extern void mouse_event(long dwFlags, long dx, long dy, long cButtons, long dwExtraInfo);
‘@
 
$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name 'MouseEventWinApi' -passThru
 


    [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(603,421)
    $MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
    $MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)
    Start-Sleep -Seconds 1
$MouseEventSig=@’
[DllImport("user32.dll",CharSet=CharSet.Auto, CallingConvention=CallingConvention.StdCall)]
public static extern void mouse_event(long dwFlags, long dx, long dy, long cButtons, long dwExtraInfo);
‘@
 
$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name 'MouseEventWinApi' -passThru
 


    [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(603,421)
    $MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
    $MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)
    Start-Sleep -Seconds 1

}else{
$urlsp1='https://twitter.com/search?q=esjesusparedes&src=typed_query&f=live'
Start-Process chrome $urlsp1
Start-Sleep -Seconds 3

$MouseEventSig=@’
[DllImport("user32.dll",CharSet=CharSet.Auto, CallingConvention=CallingConvention.StdCall)]
public static extern void mouse_event(long dwFlags, long dx, long dy, long cButtons, long dwExtraInfo);
‘@
 
$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name 'MouseEventWinApi' -passThru
 

    [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(603,380)
    $MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
    $MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)
    Start-Sleep -Seconds 1

   $MouseEventSig=@’
[DllImport("user32.dll",CharSet=CharSet.Auto, CallingConvention=CallingConvention.StdCall)]
public static extern void mouse_event(long dwFlags, long dx, long dy, long cButtons, long dwExtraInfo);
‘@
 
$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name 'MouseEventWinApi' -passThru
 

    [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(603,380)
    $MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
    $MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)
    Start-Sleep -Seconds 1

    }

}else{

$tw3=Read-Host '¿Tiene más de 66 caracteres? 1=Sí 0=No'
if($tw3-eq1){
$urlsp2='https://twitter.com/search?q=jesusparedeses&src=typed_query&f=live'
Start-Process chrome $urlsp2
Start-Sleep -Seconds 3
 
 $MouseEventSig=@’
[DllImport("user32.dll",CharSet=CharSet.Auto, CallingConvention=CallingConvention.StdCall)]
public static extern void mouse_event(long dwFlags, long dx, long dy, long cButtons, long dwExtraInfo);
‘@
 
$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name 'MouseEventWinApi' -passThru
 

    [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(700,421)
    $MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
    $MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)

    
    }else{
    
$urlsp2='https://twitter.com/search?q=jesusparedeses&src=typed_query&f=live'
Start-Process chrome $urlsp2
Start-Sleep -Seconds 3

$MouseEventSig=@’
[DllImport("user32.dll",CharSet=CharSet.Auto, CallingConvention=CallingConvention.StdCall)]
public static extern void mouse_event(long dwFlags, long dx, long dy, long cButtons, long dwExtraInfo);
‘@
 
$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name 'MouseEventWinApi' -passThru
 

    [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(705,380)
    $MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
    $MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)
    
    }
    }
    