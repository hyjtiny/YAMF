package io.github.duzhaokun123.yamf.model

data class Config(
    var densityDpi: Int = 200,
    /*
     * VIRTUAL_DISPLAY_FLAG_SECURE                          1 << 2
     * VIRTUAL_DISPLAY_FLAG_ROTATES_WITH_CONTENT            1 << 7
     * VIRTUAL_DISPLAY_FLAG_SHOULD_SHOW_SYSTEM_DECORATIONS  1 << 9
     * VIRTUAL_DISPLAY_FLAG_TRUSTED                         1 << 10
     */
    var flags: Int = 1668,
    var coloredController: Boolean = false,
    /*
     * 0: move task only
     * 1: start activity only
     * 2: move task, failback to start activity
     */
    var windowfy: Int = 0,
    /*
     * 0: TextureView
     * 1: SurfaceView
     */
    var surfaceView: Int = 0,
    var recentsBackHome: Boolean = false
)