# TagViewDemo

### 自定义 AndroidTagView，禁止拦截点击事件

效果图：
![image](https://github.com/hw20101101/TagViewDemo/blob/master/WechatIMG45.jpeg)

#### 实现思路：

- 创建一个类并继承 TagContainerLayout，重写 dispatchTouchEvent 方法：
 ![image](https://github.com/hw20101101/TagViewDemo/blob/master/WX20170824-113927%402x.png)

xml 布局文件：
![image](https://github.com/hw20101101/TagViewDemo/blob/master/WX20170824-113911%402x.png)

> 此 Demo 使用了第三方框架 [AndroidTagView](https://github.com/whilu/AndroidTagView)

