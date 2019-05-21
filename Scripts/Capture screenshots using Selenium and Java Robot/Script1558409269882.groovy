import java.awt.Rectangle
import java.awt.Robot
import java.awt.Toolkit
import java.awt.image.BufferedImage
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

import javax.imageio.ImageIO

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://www.youtube.com/watch?v=YQHsXMglC9A')
WebUI.delay(10)

File file1 = new File(GlobalVariable.output, "adele-selenium.png")
WebUI.takeScreenshot(file1.absolutePath)
println file1.absolutePath

BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()))
File file2 = new File(GlobalVariable.output, "adele-javarobot.png")
ImageIO.write(image, "png", file2)
println file2.absolutePath
WebUI.closeBrowser()