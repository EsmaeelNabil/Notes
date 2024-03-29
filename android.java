

coroutines work -> suspend is the function type => suspend fun getData(){}
It uses this word to specify that this function is a coroutine function
To call a suspend fun it has to be called form a suspend func

coroutines have three dispatchers that define the thread type
- dispatcher.Main -> for UI code , calling suspend fun’s , updating LiveData
- dispatcher.IO -> for file reading writing , network calls , database work
- dispatcher.Default -> for intensive CPU code => sorting a list , parsing JSON , DiffUtils(RecyclerView) look at this

// Dispatchers.Main
suspend fun fetchDocs() {
    // Dispatchers.Main
    val result = get("developer.android.com")
    // Dispatchers.Main
    show(result)
}

// Dispatchers.Main
suspend fun get(url: String) =
    // Dispatchers.IO
    withContext(Dispatchers.IO) {
        // Dispatchers.IO
        /* perform blocking network IO here */
    }
    // Dispatchers.Main



♦ Glide: https://goo.gl/Br1LzA
♦ Circular ImageView: https://goo.gl/wDtRqz
♦ SwipeCards: https://goo.gl/pfvT6Y
♦ AppIntro: https://goo.gl/c6e925
♦ MPAndroidChart: https://goo.gl/u8B3bq

Facebook Shimmer : https://facebook.github.io/shimmer-android/

https://github.com/Diolor/Swipecards

1. Long Shadows 
https://github.com/harjot-oberai/Long...

2. TextPathView
https://github.com/totond/TextPathView

3. ShapeOfView
https://github.com/florent37/ShapeOfView

4. Ferris-Wheel
https://github.com/iglaweb/Ferris-Wheel

5. PhotoEditor
https://github.com/burhanrashid52/Pho...

6. ColorPickerPreference
https://github.com/skydoves/ColorPick...

7. RadiusTransition
https://github.com/alexstyl/RadiusTra...

8. TreeView
https://github.com/Team-Blox/TreeView

9. inline-youtube-view
https://github.com/flipkart-incubator...

10. Floating Action Button Speed Dial
https://github.com/leinardi/FloatingA...

11. ElevationImageView
https://github.com/qhutch/ElevationIm...

12. ModalBottomSheetDialogFragment
https://github.com/Commit451/ModalBot...