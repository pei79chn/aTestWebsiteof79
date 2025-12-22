
<!DOCTYPE html>
<html lang="zh-CN">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>我的个人主页</title>
  <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">

</head>
<body class="bg-gray-50 text-gray-800">

  <!-- 导航栏 -->
  <header class="fixed w-full bg-white shadow z-10">
    <div class="container mx-auto px-4 py-3 flex justify-between items-center">
      <h1 class="text-xl font-bold text-indigo-600">我的主页</h1>
      <nav class="space-x-6 hidden md:block">
        <a href="#home" class="hover:text-indigo-600">首页</a>
        <a href="#about" class="hover:text-indigo-600">关于我</a>
        <a href="#skills" class="hover:text-indigo-600">技能</a>
        <a href="#projects" class="hover:text-indigo-600">项目</a>
        <a href="#contact" class="hover:text-indigo-600">联系我</a>
      </nav>
      <button class="md:hidden text-2xl">
        <i class="fas fa-bars"></i>
      </button>
    </div>
  </header>

  <!-- 首页 Hero 区域 -->
  <section id="home" class="hero-bg text-white min-h-screen flex items-center justify-center">
    <div class="text-center px-4">
      <img src="https://picsum.photos/200/200?person" alt="个人头像" class="w-32 h-32 rounded-full mx-auto mb-6 border-4 border-white shadow">
      <h1 class="text-4xl md:text-5xl font-extrabold mb-4">你好，我是张三</h1>
      <p class="text-xl mb-6">一名热爱技术和设计的前端开发者</p>
      <a href="#projects" class="bg-white text-indigo-600 px-6 py-3 rounded-full font-semibold shadow hover:bg-gray-100 transition">查看我的项目</a>
    </div>
  </section>

  <!-- 关于我 -->
  <section id="about" class="section-bg py-20">
    <div class="container mx-auto px-4">
      <h2 class="text-3xl font-bold text-center mb-12">关于我</h2>
      <div class="max-w-3xl mx-auto text-lg text-gray-700">
        <p class="mb-4">
          我是一名热爱前端开发和用户体验设计的开发者，专注于使用现代技术构建美观、响应迅速的网页应用。
          我热衷于学习新技术，并乐于将创意转化为实际产品。
        </p>
        <p>
          在业余时间，我喜欢阅读技术博客、参与开源项目，以及探索新的编程语言和框架。
        </p>
      </div>
    </div>
  </section>

  <!-- 技能 -->
  <section id="skills" class="py-20">
    <div class="container mx-auto px-4">
      <h2 class="text-3xl font-bold text-center mb-12">我的技能</h2>
      <div class="grid grid-cols-1 md:grid-cols-2 gap-8 max-w-4xl mx-auto">
        <div>
          <h3 class="font-semibold mb-2">HTML & CSS</h3>
          <div class="skill-bar">
            <div class="skill-progress bg-indigo-500" style="width: 95%"></div>
          </div>
        </div>
        <div>
          <h3 class="font-semibold mb-2">JavaScript</h3>
          <div class="skill-bar">
            <div class="skill-progress bg-indigo-500" style="width: 90%"></div>
          </div>
        </div>
        <div>
          <h3 class="font-semibold mb-2">React</h3>
          <div class="skill-bar">
            <div class="skill-progress bg-indigo-500" style="width: 85%"></div>
          </div>
        </div>
        <div>
          <h3 class="font-semibold mb-2">TailwindCSS</h3>
          <div class="skill-bar">
            <div class="skill-progress bg-indigo-500" style="width: 80%"></div>
          </div>
        </div>
      </div>
    </div>
  </section>

  <!-- 项目 -->
  <section id="projects" class="section-bg py-20">
    <div class="container mx-auto px-4">
      <h2 class="text-3xl font-bold text-center mb-12">我的项目</h2>
      <div class="grid grid-cols-1 md:grid-cols-3 gap-8">
        <div class="bg-white p-6 rounded-lg shadow hover-card transition">
          <img src="https://picsum.photos/400/200?tech" alt="项目一展示图" class="rounded mb-4">
          <h3 class="text-xl font-bold mb-2">在线任务管理器</h3>
          <p class="text-gray-600 mb-4">一个基于React的任务管理应用，支持本地存储和任务分类。</p>
          <a href="#" class="text-indigo-600 hover:underline">查看项目</a>
        </div>
        <div class="bg-white p-6 rounded-lg shadow hover-card transition">
          <img src="https://picsum.photos/400/200?design" alt="项目二展示图" class="rounded mb-4">
          <h3 class="text-xl font-bold mb-2">响应式网页设计</h3>
          <p class="text-gray-600 mb-4">使用TailwindCSS构建的现代化响应式网页模板。</p>
          <a href="#" class="text-indigo-600 hover:underline">查看项目</a>
        </div>
        <div class="bg-white p-6 rounded-lg shadow hover-card transition">
          <img src="https://picsum.photos/400/200?game" alt="项目三展示图" class="rounded mb-4">
          <h3 class="text-xl font-bold mb-2">网页小游戏</h3>
          <p class="text-gray-600 mb-4">一个基于Canvas的简单网页小游戏，支持移动端操作。</p>
          <a href="#" class="text-indigo-600 hover:underline">查看项目</a>
        </div>
      </div>
    </div>
  </section>

  <!-- 联系方式 -->
  <section id="contact" class="py-20">
    <div class="container mx-auto px-4">
      <h2 class="text-3xl font-bold text-center mb-12">联系我</h2>
      <div class="max-w-xl mx-auto bg-white p-8 rounded-lg shadow">
        <form>
          <div class="mb-4">
            <label class="block text-gray-700 mb-2">姓名</label>
            <input type="text" class="w-full px-4 py-2 border rounded-lg focus:outline-none focus:ring-2 focus:ring-indigo-500">
          </div>
          <div class="mb-4">
            <label class="block text-gray-700 mb-2">邮箱</label>
            <input type="email" class="w-full px-4 py-2 border rounded-lg focus:outline-none focus:ring-2 focus:ring-indigo-500">
          </div>
          <div class="mb-4">
            <label class="block text-gray-700 mb-2">留言</label>
            <textarea class="w-full px-4 py-2 border rounded-lg focus:outline-none focus:ring-2 focus:ring-indigo-500" rows="4"></textarea>
          </div>
          <button type="submit" class="w-full bg-indigo-600 text-white py-2 rounded-lg font-semibold hover:bg-indigo-700 transition">发送消息</button>
        </form>
      </div>
    </div>
  </section>

  <!-- 页脚 -->
  <footer class="bg-gray-800 text-white py-8">
    <div class="container mx-auto px-4 text-center">
      <p class="mb-4">© 2025 张三的个人网站. 保留所有权利.</p>
      <div class="flex justify-center space-x-4">
        <a href="#" class="text-gray-400 hover:text-white"><i class="fab fa-github"></i></a>
        <a href="#" class="text-gray-400 hover:text-white"><i class="fab fa-linkedin"></i></a>
        <a href="#" class="text-gray-400 hover:text-white"><i class="fab fa-twitter"></i></a>
      </div>
    </div>
  </footer>

</body>
</html>
