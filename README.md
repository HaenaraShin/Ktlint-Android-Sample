# Ktlint-Android-Sample
This proejct introduce how to apply ktlint on an android project.

## What is a `Ktlint`?

`ktlint` is a lint for Kotlin. It is a static code analytics tool that checks
if your codes fits on Kotlin coding convention or style guide line.🔎

By applying Ktlint, consistency of kotlin codes in your project would be maintained strongly.
As a result, unnecessary communication costs because of low readability and
differences in coding styles among team members can be reduced.

- [Ktlint Page](https://ktlint.github.io/)
- [Ktlint Plugin GitHub Repository](https://github.com/jlleitschuh/ktlint-gradle)

## How to use Ktlint

### 1. Ktlint check

Execute a following gradle task on Android Studio's gradle tab.

-  ProjectName > Tasks > verification > ktlintCheck

Otherwise, on type following command on console.

```
./gradlew ktlintCheck
```

### 2. Check ktlint on git commit (Usubg Git hook)

Execute a following gradle task on Android Studio's gradle tab.

- ClassNote > Tasks > help > addKtlintCheckGitPreCommitHook

Otherwise, on type following command on console.

```
./gradlew addKtlintCheckGitPreCommitHook
```
- If follwoing error is occurred, create a directory `./.git/hooks` on your project directory.

> Execution failed for task ':addKtlintCheckGitPreCommitHook'.
> java.io.IOException: No such file or directory


### 3. Make your Android Studio formatter following rule of Ktlint.

Execute a following gradle task on Android Studio's gradle tab.

- ClassNote > Tasks > help > ktlintApplyToIdea

Otherwise, on type following command on console.

```
./gradlew ktlintApplyToIdea
```