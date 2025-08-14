# Lab 26 - GUI Apps

For this lab assignment you will practice developing Java GUI applications with Maven. **Maven** is a dependency management and build tool for Java projects. We will be using Maven since it is the most popular project management tool for Java.

## Before you start

The project structure is slightly different from the structure we're used to. Your java files can be found in the `src/main/java/com/example` directory and your class files in the `target/classes/com/example` directory. You will also notice a line `package com.example;` at the top of all your files. `com.example` is the **groupId** of our project, whenever you create a new Maven project you need a unique groupId in the format of *org.example*, *com.myproject*, *edu.utrgv*, etc. 

Maven projects require a groupId and artifactId, you can find both in the `pom.xml` file.

## Let's get started!

Codespaces doesn't support GUI applications by default, so we will be using desktop-lite. **Desktop-lite** is a lightweight desktop for our Codespace container that can be accessed through the web.

To view our lightweight desktop simply follow the steps below.

### 1. Find Port 6080

Open a new terminal in your Codespace and click on the **Ports** tab to find port 6080. Contact the instructor if you do not see this port.

<img src="screenshots/find-port.png" width="400px">

### 2. Make Port 6080 Public

Next, right-click on port number 6080, select **Visibility** and change it to **Public**.

<img src="screenshots/make-public.png" width="400px">

### 3. Open Forwarded Address in Browser

Next, right-click on the forwarding address of port 6080 and select **Open in browser**.

<img src="screenshots/open-browser.png" width="400px">

### 4. Connect to Desktop-Lite through noVNC

Once you open the forwarding address url in your browser you will see the screen below. Go ahead and click on **Connect**.

<img src="screenshots/connect.png" width="400px">

### 5. You're All Set!

You should now see the following screen. This is the desktop for your Codespace, so any GUI apps you run on VS Code will appear here.

<img src="screenshots/desktop-lite.png" width="400px">
