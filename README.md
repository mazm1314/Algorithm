echo "# Algroithm" >> README.md    （创建一个文件）
git init  （初始化一个新本地仓库,它在工作目录下生成一个名为.git的隐藏文件夹）
git add README.md  (只是一个文件的情况下)
git commit -m "first commit"（提交）
git remote add origin git@github.com:mazm1314/Algroithm.git  如果提示错误：$ git remote rm origin
（命令git remote add <shortname> <url>：将远程仓库唯一的URL<url> 映射成为 在本地仓库中对远程仓库起的别名<shortname>。
（注意：git remote add <shortname> <url>只负责映射！它不会产生下载或上传的流量）
git push -u origin master
