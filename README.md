# pictureYun
一款基于SSM框架的个人照片云盘
## ☆项目描述：用户可以将自己的照片上传到网站并且随时可以查看 
## ☆登录状态维护：没有使用session 而是使用 Model 包装用户信息，在与 jsp 页面交互时进行传递 
## ☆图片上传功能：获取 servlet 的运行路径下的 imgs 文件夹作为上传图片的存 储路径，后端使用 MultipartFile 类型来接受用户上传的照 片，使用 file. transferTo()去将储存至 servlet 的运行路 径下的 imgs 文件夹
## ☆实现技术：Spring，SpringMVC，MyBatis，Jsp
