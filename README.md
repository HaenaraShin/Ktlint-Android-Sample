# Ktlint-Android-Sample
This proejct introduce how to apply ktlint on an android project.

## What is a `Ktlint`?

`ktlint` is a lint for Kotlin. It is a static code analytics tool that checks
if your codes fits on Kotlin coding convention or style guide line.🔎

By applying Ktlint, consistency of kotlin codes in your project would be maintained strongly.
As a result, unnecessary communication costs because of low readability and
differences in coding styles among team members can be reduced.

**💁‍♂️Read more about ktlint on here**

- [Ktlint Page](https://ktlint.github.io/)
- [Ktlint Plugin GitHub Repository](https://github.com/jlleitschuh/ktlint-gradle)

## How to use Ktlint

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

# Reference

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