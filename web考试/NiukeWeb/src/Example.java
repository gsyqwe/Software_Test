import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Example {

    // Mooctest Selenium Example


    // <!> Check if selenium-standalone.jar is added to build path.

    public static void test(WebDriver driver) throws InterruptedException {
        // TODO Test script
        // eg:driver.get("https://www.baidu.com/")
        // eg:driver.findElement(By.id("wd"));
    	driver.get("https://www.nowcoder.com/");
    	//操作1，点击题库
    	WebElement tiku = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/ul[1]/li[2]/a"));
    	tiku.click();
    	Thread.sleep(1000);
    	
    	//操作2，选择安卓工程师进行切换
    	WebElement professor = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[2]/div/a[3]"));
    	professor.click();
    	Thread.sleep(1000);
    	
    	//操作3，点击重选
    	WebElement recheck = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/a"));
    	recheck.click();
    	Thread.sleep(1000);
    	
    	//操作4，JAVA工程师，C++工程师，2019，最热
    	professor = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[2]/div/a[1]"));
    	professor.click();
    	Thread.sleep(1000);
    	professor = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[2]/div/a[2]"));
    	professor.click();
    	Thread.sleep(1000);
    	WebElement year = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[3]/div[2]/div/a[1]"));
    	year.click();
    	Thread.sleep(1000);
    	WebElement recent = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/ul/li[2]/a"));
    	recent.click();
    	Thread.sleep(1000);
    	
    	//操作5，点击第一套试卷
    	//有可能待提高的分数
    	WebElement exam = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/ul/li[1]/a"));
    	exam.click();
    	Thread.sleep(1000);
    	
    	//操作6，开始做题，进行扫码，时间设置稍长
    	WebElement start = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[2]/a/span"));
    	start.click();
    	Thread.sleep(20000);
    	start = driver.findElement(By.xpath("//*[@id='next']"));
    	start.click();
    	
    	//操作7,点击运行
    	WebElement run = driver.findElement(By.xpath("//*[@id='runCode']"));
    	run.click();
    	Thread.sleep(3000);
    	
    	//操作8空代码点击确定
    	WebElement sure = driver.findElement(By.xpath("//*[@id='jsCpn_9_popup_0']/div[2]/a"));
    	sure.click();
    	Thread.sleep(4000);
    	
    	//操作9，点击收藏本题，添加测试标签，并点击确定
    	WebElement collect = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[4]/span[1]/a"));
    	collect.click();
    	Thread.sleep(3000);
    	WebElement input1 = driver.findElement(By.className("pop-content"));
    	WebElement insd = input1.findElement(By.tagName("input"));
    	insd.sendKeys("测试");
    	Thread.sleep(1000);
    	WebElement sdwa = driver.findElement(By.cssSelector("[class='btn btn-primary confirm-btn'"));
    	sdwa.click();
    	Thread.sleep(2000);

        
        //操作10，点击标记一下
        WebElement label = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[4]/span[2]/a"));
        label.click();
        Thread.sleep(1500);
        
        //操作11，点击下一题
        WebElement next = driver.findElement(By.xpath("//*[@id='next']"));
        next.click();
        Thread.sleep(1000);
        
        //操作12点击提前交卷并点击确定
        WebElement submit = driver.findElement(By.xpath("//*[@id='aheadFinish']"));
        submit.click();
        Thread.sleep(1000);
        sure = driver.findElement(By.xpath("//*[@id='jsCpn_9_popup_0']/div[2]/a[1]"));
        sure.click();
        Thread.sleep(1000);
        
        //操作13，查看答案解析
        WebElement checkanswer = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/ul/li[2]/a"));
        checkanswer.click();
        Thread.sleep(1000);
        
        //操作14，回复
        WebElement s1 = driver.findElement(By.xpath("//*[@id='commentList']/div[1]/div[2]/div[3]/a"));
        s1.click();
        Thread.sleep(1000);
        WebElement s2 = driver.findElement(By.xpath("//*[@id='jsCpn_26_component_0']/div[2]/div[2]/div/textarea"));
        s2.sendKeys("123");
        Thread.sleep(1000);
        WebElement s3 = driver.findElement(By.xpath("//*[@id='jsCpn_26_component_0']/div[2]/div[2]/a"));
        s3.click();
    }

    public static void main(String[] args) {
        // Run main function to test your script.
        WebDriver driver = new ChromeDriver();
        try { test(driver); } 
        catch(Exception e) { e.printStackTrace(); }
        finally { }
    }

}
