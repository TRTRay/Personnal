# Learn OpenGL



## 环境配置

Visual Studio Code + GLFW + GLAD



Visual Studio Code 下 OpenGL 的环境配置，见

[Github]: https://github.com/yocover/start-learning-opengl

详细安装过程见B站视频



## Start



### 窗口

初始化

```C++
// 初始化GLFW
glfwInit();
// Set all the required options for GLFW
glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 3);
glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 3);
glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE);
glfwWindowHint(GLFW_RESIZABLE, GL_FALSE);

// 创建一个名叫LearnOpenGL的窗口
GLFWwindow* window = glfwCreateWindow(WIDTH, HEIGHT, "LearnOpenGL", nullptr, nullptr);
glfwMakeContextCurrent(window);

// 初始化GLAD
if (!gladLoadGLLoader((GLADloadproc)glfwGetProcAddress))
{
    std::cout << "Failed to initialize glad" << std::endl;
    return -1;
}
```





### 着色器



#### 图形渲染管线(Graphics Pipeline)

![image-20211012205334736](C:\Users\admin\AppData\Roaming\Typora\typora-user-images\image-20211012205334736.png)

顶点着色器，几何着色器和片段着色器是可以加入自定义内容的部分



#### 准备阶段

##### 顶点着色器和片段着色器的编写和编译

着色器使用GLSL(OpenGL Shading Language)编写的，在程序运行阶段动态编译

```C++
// 在函数体外编写的着色器
// GLSL编写的顶点着色器
const GLchar* vertexShaderSource = "#version 330 core\n"
"layout (location = 0) in vec3 position;\n"
"void main()\n"
"{\n"
"gl_Position = vec4(position.x, position.y, position.z, 1.0);\n"
"}\0";

// GLSL编写的片段着色器
const GLchar* fragmentShaderSource = "#version 330 core\n"
"out vec4 color;\n"
"void main()\n"
"{\n"
"color = vec4(1.0f, 0.5f, 0.2f, 1.0f);\n"
"}\n\0";
```

```C++
// 在程序运行时动态编译生成着色器
// 创建并编译顶点着色器，检查错误信息
// Vertex shader
GLuint vertexShader = glCreateShader(GL_VERTEX_SHADER);
glShaderSource(vertexShader, 1, &vertexShaderSource, NULL);
glCompileShader(vertexShader);
// Check for compile time errors
GLint success;
GLchar infoLog[512];
glGetShaderiv(vertexShader, GL_COMPILE_STATUS, &success);
if (!success)
{
    glGetShaderInfoLog(vertexShader, 512, NULL, infoLog);
    std::cout << "ERROR::SHADER::VERTEX::COMPILATION_FAILED\n" << infoLog << std::endl;
}

// 创建并编译片段着色器，检查错误信息
// Fragment shader
GLuint fragmentShader = glCreateShader(GL_FRAGMENT_SHADER);
glShaderSource(fragmentShader, 1, &fragmentShaderSource, NULL);
glCompileShader(fragmentShader);
// Check for compile time errors
glGetShaderiv(fragmentShader, GL_COMPILE_STATUS, &success);
if (!success)
{
    glGetShaderInfoLog(fragmentShader, 512, NULL, infoLog);
    std::cout << "ERROR::SHADER::FRAGMENT::COMPILATION_FAILED\n" << infoLog << std::endl;
}

// 链接着色器和着色器程序，检查错误信息
// Link shaders
GLuint shaderProgram = glCreateProgram();
glAttachShader(shaderProgram, vertexShader);
glAttachShader(shaderProgram, fragmentShader);
glLinkProgram(shaderProgram);
// Check for linking errors
glGetProgramiv(shaderProgram, GL_LINK_STATUS, &success);
if (!success) {
    glGetProgramInfoLog(shaderProgram, 512, NULL, infoLog);
    std::cout << "ERROR::SHADER::PROGRAM::LINKING_FAILED\n" << infoLog << std::endl;
}
//删除不需要的着色器
glDeleteShader(vertexShader);
glDeleteShader(fragmentShader);
```

