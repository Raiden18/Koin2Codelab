package me.vponamorenko.modular.navigation.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.vponamorenko.modular.navigation.router.Router

abstract class NavigationActivity : AppCompatActivity() {
    abstract val router: Router
    abstract fun layoutId(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId())
    }

    override fun onResume() {
        super.onResume()
        router.bind(this)
    }

    override fun onPause() {
        super.onPause()
        router.unBind()
    }

    override fun onSupportNavigateUp(): Boolean = router.navigateUp()
}