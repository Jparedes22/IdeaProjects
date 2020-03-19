#GOOGLE
$urlsp='https://www.google.com/search?q=coronavirus&sxsrf=ALeKk01T9vQjxFz47IMDEokW-d37HF5Owg:1584388952996&source=lnms&tbm=nws&sa=X&ved=2ahUKEwjLuurl5J_oAhVKTBoKHSbRANgQ_AUoAXoECBQQAw'
Start-Process chrome $urlsp
Start-Sleep -Seconds 3

#PAG 1
$MouseEventSig=@’
[DllImport("user32.dll",CharSet=CharSet.Auto, CallingConvention=CallingConvention.StdCall)]
public static extern void mouse_event(long dwFlags, long dx, long dy, long cButtons, long dwExtraInfo);
‘@
 
$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name 'MouseEventWinApi' -passThru
 
    [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(321,460)
    $MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
    $MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)
    Start-Sleep -Seconds 3

    #LINK 1

    $MouseEventSig=@’
[DllImport("user32.dll",CharSet=CharSet.Auto, CallingConvention=CallingConvention.StdCall)]
public static extern void mouse_event(long dwFlags, long dx, long dy, long cButtons, long dwExtraInfo);
‘@
 
$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name 'MouseEventWinApi' -passThru
 
    [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(587,70)
    $MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
    $MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)
    Start-Sleep -Seconds 3

    [System.Windows.Forms.SendKeys]::SendWait("^{c}") 
    Start-Sleep -Seconds 3
    #BLOC
$MouseEventSig=@’
[DllImport("user32.dll",CharSet=CharSet.Auto, CallingConvention=CallingConvention.StdCall)]
public static extern void mouse_event(long dwFlags, long dx, long dy, long cButtons, long dwExtraInfo);
‘@
 
$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name 'MouseEventWinApi' -passThru
 
    [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(1149,1042)
    $MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
    $MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)
    Start-Sleep -Seconds 3

    $MouseEventSig=@’
[DllImport("user32.dll",CharSet=CharSet.Auto, CallingConvention=CallingConvention.StdCall)]
public static extern void mouse_event(long dwFlags, long dx, long dy, long cButtons, long dwExtraInfo);
‘@

 #BLOC 2
$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name 'MouseEventWinApi' -passThru
 
    [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(1111,901)
    $MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
    $MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)
    Start-Sleep -Seconds 3

    [System.Windows.Forms.SendKeys]::SendWait("^V")
     Start-Sleep -Seconds 1
    [System.Windows.Forms.SendKeys]::SendWait("{ENTER}") 
    Start-Sleep -Seconds 1

    #GOOGLE 2
$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name 'MouseEventWinApi' -passThru
 
    [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(678,1043)
    $MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
    $MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)
    Start-Sleep -Seconds 3

     #ATRAS
$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name 'MouseEventWinApi' -passThru
 
    [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(31,63)
    $MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
    $MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)
    Start-Sleep -Seconds 2

    #PAG 2
$MouseEventSig=@’
[DllImport("user32.dll",CharSet=CharSet.Auto, CallingConvention=CallingConvention.StdCall)]
public static extern void mouse_event(long dwFlags, long dx, long dy, long cButtons, long dwExtraInfo);
‘@
 
$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name 'MouseEventWinApi' -passThru
 
    [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(336,641)
    $MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
    $MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)
    Start-Sleep -Seconds 3

    #LINK 

    $MouseEventSig=@’
[DllImport("user32.dll",CharSet=CharSet.Auto, CallingConvention=CallingConvention.StdCall)]
public static extern void mouse_event(long dwFlags, long dx, long dy, long cButtons, long dwExtraInfo);
‘@
 
$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name 'MouseEventWinApi' -passThru
 
    [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(587,70)
    $MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
    $MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)
    Start-Sleep -Seconds 3

    [System.Windows.Forms.SendKeys]::SendWait("^{c}") 
    Start-Sleep -Seconds 3
    #BLOC
$MouseEventSig=@’
[DllImport("user32.dll",CharSet=CharSet.Auto, CallingConvention=CallingConvention.StdCall)]
public static extern void mouse_event(long dwFlags, long dx, long dy, long cButtons, long dwExtraInfo);
‘@
 
$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name 'MouseEventWinApi' -passThru
 
    [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(1149,1042)
    $MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
    $MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)
    Start-Sleep -Seconds 3

    $MouseEventSig=@’
[DllImport("user32.dll",CharSet=CharSet.Auto, CallingConvention=CallingConvention.StdCall)]
public static extern void mouse_event(long dwFlags, long dx, long dy, long cButtons, long dwExtraInfo);
‘@

 #BLOC 2
$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name 'MouseEventWinApi' -passThru
 
    [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(1111,901)
    $MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
    $MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)
    Start-Sleep -Seconds 3

    [System.Windows.Forms.SendKeys]::SendWait("^V")
    Start-Sleep -Seconds 1
    [System.Windows.Forms.SendKeys]::SendWait("{ENTER}") 
    Start-Sleep -Seconds 1

    #GOOGLE 2
$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name 'MouseEventWinApi' -passThru
 
    [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(678,1043)
    $MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
    $MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)
    Start-Sleep -Seconds 3

     #ATRAS
$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name 'MouseEventWinApi' -passThru
 
    [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(31,63)
    $MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
    $MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)
    Start-Sleep -Seconds 2

    #PAG 3
$MouseEventSig=@’
[DllImport("user32.dll",CharSet=CharSet.Auto, CallingConvention=CallingConvention.StdCall)]
public static extern void mouse_event(long dwFlags, long dx, long dy, long cButtons, long dwExtraInfo);
‘@
 
$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name 'MouseEventWinApi' -passThru
 
    [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(330,832)
    $MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
    $MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)
    Start-Sleep -Seconds 3

    #LINK 

    $MouseEventSig=@’
[DllImport("user32.dll",CharSet=CharSet.Auto, CallingConvention=CallingConvention.StdCall)]
public static extern void mouse_event(long dwFlags, long dx, long dy, long cButtons, long dwExtraInfo);
‘@
 
$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name 'MouseEventWinApi' -passThru
 
    [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(587,70)
    $MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
    $MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)
    Start-Sleep -Seconds 3

    [System.Windows.Forms.SendKeys]::SendWait("^{c}") 
    Start-Sleep -Seconds 3
    #BLOC
$MouseEventSig=@’
[DllImport("user32.dll",CharSet=CharSet.Auto, CallingConvention=CallingConvention.StdCall)]
public static extern void mouse_event(long dwFlags, long dx, long dy, long cButtons, long dwExtraInfo);
‘@
 
$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name 'MouseEventWinApi' -passThru
 
    [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(1149,1042)
    $MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
    $MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)
    Start-Sleep -Seconds 3

    $MouseEventSig=@’
[DllImport("user32.dll",CharSet=CharSet.Auto, CallingConvention=CallingConvention.StdCall)]
public static extern void mouse_event(long dwFlags, long dx, long dy, long cButtons, long dwExtraInfo);
‘@

 #BLOC 2
$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name 'MouseEventWinApi' -passThru
 
    [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(1111,901)
    $MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
    $MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)
    Start-Sleep -Seconds 3

    [System.Windows.Forms.SendKeys]::SendWait("^V")
    Start-Sleep -Seconds 1
    [System.Windows.Forms.SendKeys]::SendWait("{ENTER}") 
    Start-Sleep -Seconds 1

   