# YAMF

[![GitHub license](https://img.shields.io/github/license/duzhaokun123/YAMF?style=flat-square)](https://github.com/duzhaokun123/YAFM/blob/main/LICENSE)
![Android SDK min 31](https://img.shields.io/badge/Android%20SDK-%3E%3D%2031-brightgreen?style=flat-square&logo=android)
![Android SDK target 33](https://img.shields.io/badge/Android%20SDK-target%2033-brightgreen?style=flat-square&logo=android)
![Xposed Module](https://img.shields.io/badge/Xposed-Module-blue?style=flat-square)
[![Channel](https://img.shields.io/badge/Follow-Telegram-blue.svg?logo=telegram&style=flat-square)](https://t.me/YAMF_channel)

Yet Another [Mi-FreeForm](https://github.com/sunshine0523/Mi-FreeForm)

因为 Mi-FreeForm 非常不好用 只好重写一个

|                  |                   YAMF                    |           Mi-FreeForm            |
|------------------|:-----------------------------------------:|:--------------------------------:|
| Android 版本限制     | 13(api 33)<br/>12L(api 32)<br/>12(api 31) |          >= 8.1(api 27)          |
| 需要权限             |                Xposed(必须)                 | Shizuku(必须) <br/>Xposed, 无障碍(可选) |
| 免 root           |                  ❌(不会支持)                  |                ✅                 |
| 支持 FLAG_SECURE   |                     ✅                     |                ❌                 |
| 系统级叠加层           |                     ✅                     |                ❌                 |
| 多实例的应用支持         |                     ✅                     |                ❌                 |
| 重写其他应用的通知以在小窗中打开 |                  ❌(或许会有)                  |                ✅                 |
| 从最近任务启动小窗        |                     ✅                     |                ✅                 |
| 暂时隐藏小窗           |               ❌(移到边上看不见就好了)               |                ✅                 |
| 挂起小窗             |                     ✅                     |                ✅                 |
| 记住位置             |                  ❌(不会支持)                  |                ✅                 |
| 侧边启动栏            |                  ❌(TODO)                  |                ✅                 |
| 手动调整方向           |                     ✅                     |                ✅                 |
| 自动调整方向           |                     ✅                     |                ✅                 |
| 缩放 (scale)       |                  ❌(不会支持)                  |                ✅                 |
| 调整大小 (resize)    |                     ✅                     |                ✅                 |            
| open api         |                  ❌(或许会有)                  |                ✅                 |
| 无需关心保活           |               ✅(因为注入了系统进程)                |                ❌                 |
| 高刷新率             |                     ❓                     |                ❓                 |
| HDR              |                     ❌                     |                ❌                 |

## 下载

https://github.com/Xposed-Modules-Repo/io.github.duzhaokun123.yamf

## 已知问题

- 模块与注入的版本不同时系统会崩溃
    - 常见 xposed 模块问题
- 某些应用似乎无法在小窗中启动
- 某些应用在某些尺寸下缩放异常

## TODO

- 好看的图标
- 侧边启动栏
- RtL 支持

## 捐赠

你的捐赠并不能直接加快开发 也不会给你带来特权

https://duzhaokun123.github.io/donate.html

## Thanks

### 贡献者

[Nitsuya](https://github.com/Nitsuya)

### 库

[AOSP](https://source.android.com/)

[EzXHelper](https://github.com/KyuubiRan/EzXHelper)

[Hide-My-Applist](https://github.com/Dr-TSNG/Hide-My-Applist)

[LSPosed](https://github.com/LSPosed/LSPosed)

[Material](https://material.io/)

[Mi-FreeForm](https://github.com/sunshine0523/Mi-FreeForm)

[QAuxiliary](https://github.com/cinit/QAuxiliary)

[ViewBindingUtil](https://github.com/matsudamper/ViewBindingUtil)

[gson](https://github.com/google/gson)

[xposed](https://forum.xda-developers.com/xposed)


