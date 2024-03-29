# 🔍 Ktlint-Android-Sample

This proejct introduce how to apply ktlint on an android project.

📌 자세한 설명은 [블로그](https://haenarashin.github.io/kotlin,/android,/ktlint/2020/12/27/Ktlint-on-your-project.html)에서 확인하실 수 있습니다.

## ⭐️ What is a `Ktlint`?

`ktlint` is a lint for Kotlin. It is a static code analytics tool that checks
if your codes fits on Kotlin coding convention or style guide line.🔎

By applying Ktlint, consistency of kotlin codes in your project would be maintained strongly.
As a result, unnecessary communication costs because of low readability and
differences in coding styles among team members can be reduced.

**💁‍♂️ Read more about ktlint here**

- [Ktlint Page](https://ktlint.github.io/)
- [Ktlint Plugin GitHub Repository](https://github.com/jlleitschuh/ktlint-gradle)

## 🚀 How to apply ktlint

### 1. build.gradle(root)

- Add plugin `org.jlleitschuh.gradle.ktlint`
- Add repository maven `https://plugins.gradle.org/m2/`
- Add classpath dependency `org.jlleitschuh.gradle:ktlint-gradle:9.3.0`

```groovy
apply plugin: 'org.jlleitschuh.gradle.ktlint'
...
    repositories {
        maven {
            url "https://plugins.gradle.org/m2/"
        }
    }
...
    dependencies {
        classpath "org.jlleitschuh.gradle:ktlint-gradle:9.3.0"
    }
}

```

💁‍♂️ Check an example file on [here](build.gradle).
### 2. build.gradle(android module)

- Add plugin `org.jlleitschuh.gradle.ktlint`.
- Add ktlint plugin setting.

```groovy
plugins {
    id 'org.jlleitschuh.gradle.ktlint'
}
...
ktlint {
    android = true
    outputColorName ="RED"
    verbose = true
    disabledRules.addAll("import-ordering")
}
```

💁‍♂️ Check an example file on [here](app/build.gradle).

### 3. build.gradle(non-android module)

- Add plugin `org.jlleitschuh.gradle.ktlint`.
- Add ktlint plugin setting.

```groovy
plugins {
    id 'org.jlleitschuh.gradle.ktlint'
}
...
ktlint {
    android = false
    outputColorName ="RED"
    verbose = true
    disabledRules.addAll("import-ordering")
}
```

💁‍♂️ Check an example file on [here](lib/build.gradle).

## 🌈 How to use ktlint

### 1. Ktlint check

Execute a following gradle task on Android Studio's gradle tab.

-  ProjectName > Tasks > verification > ktlintCheck

Otherwise, on type following command on console.

```shell
./gradlew ktlintCheck
```

### 2. Check ktlint on git commit (Usubg Git hook)

Execute a following gradle task on Android Studio's gradle tab.

- ClassNote > Tasks > help > addKtlintCheckGitPreCommitHook

Otherwise, on type following command on console.

```shell
./gradlew addKtlintCheckGitPreCommitHook
```
- If follwoing error is occurred, create a directory `./.git/hooks` on your project directory.

> Execution failed for task ':addKtlintCheckGitPreCommitHook'.
> java.io.IOException: No such file or directory


### 3. Make your Android Studio formatter following rule of Ktlint.

Execute a following gradle task on Android Studio's gradle tab.

- ClassNote > Tasks > help > ktlintApplyToIdea

Otherwise, on type following command on console.

```shell
./gradlew ktlintApplyToIdea
```

# 👀 Reference

Sample codes and instructions of this project refers to following list

- [Ktlint Page](https://ktlint.github.io/)
- [Ktlint Plugin GitHub Repository](https://github.com/jlleitschuh/ktlint-gradle)

# License

```
MIT License

Copyright (c) 2020 Haenala Shin

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

```
