package com.kacozsoft.yasinenschn

import android.content.Intent
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var mInterstitialAd: InterstitialAd
    lateinit var mAdView : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        mAdView = findViewById(R.id.adView2)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = "ca-app-pub-3385721623773501/2592630364"
        mInterstitialAd.loadAd(AdRequest.Builder().build())
        tv_yasin.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, UcluMenu::class.java)
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }
            intent.putExtra("baslik","Yasin Suresi")
            intent.putExtra("arapca","Yasin Suresi Arapça Metni")
            intent.putExtra("meal","Yasin Suresi Meali")
            intent.putExtra("okunus","Yasin Suresi Okunuşu")
            startActivity(intent)

        })

        tv_tebareke.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, UcluMenu::class.java)
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }
            intent.putExtra("baslik","Mülk Suresi")
            intent.putExtra("arapca","Mülk Suresi Arapça Metni")
            intent.putExtra("meal","Mülk Suresi Meali")
            intent.putExtra("okunus","Mülk Suresi Okunuşu")
            startActivity(intent)

        })

        tv_nebe.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, UcluMenu::class.java)
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }
            intent.putExtra("baslik","Nebe Suresi")
            intent.putExtra("arapca","Nebe Suresi Arapça Metni")
            intent.putExtra("meal","Nebe Suresi Meali")
            intent.putExtra("okunus","Nebe Suresi Okunuşu")
            startActivity(intent)

        })

        tv_meryem.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, UcluMenu::class.java)
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }
            intent.putExtra("baslik","Meryem Suresi")
            intent.putExtra("arapca","Meryem Suresi Arapça Metni")
            intent.putExtra("meal","Meryem Suresi Meali")
            intent.putExtra("okunus","Meryem Suresi Okunuşu")
            startActivity(intent)

        })

        tv_taha.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, UcluMenu::class.java)
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }
            intent.putExtra("baslik","Taha Suresi")
            intent.putExtra("arapca","Taha Suresi Arapça Metni")
            intent.putExtra("meal","Taha Suresi Meali")
            intent.putExtra("okunus","Taha Suresi Okunuşu")
            startActivity(intent)

        })

        tv_fetih.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, UcluMenu::class.java)
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }
            intent.putExtra("baslik","Fetih Suresi")
            intent.putExtra("arapca","Fetih Suresi Arapça Metni")
            intent.putExtra("meal","Fetih Suresi Meali")
            intent.putExtra("okunus","Fetih Suresi Okunuşu")
            startActivity(intent)

        })

        tv_vakia.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, UcluMenu::class.java)
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }
            intent.putExtra("baslik","Vakıa Suresi")
            intent.putExtra("arapca","Vakıa Suresi Arapça Metni")
            intent.putExtra("meal","Vakıa Suresi Meali")
            intent.putExtra("okunus","Vakıa Suresi Okunuşu")
            startActivity(intent)

        })

        tv_cuma.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, UcluMenu::class.java)
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }
            intent.putExtra("baslik","Cuma Suresi")
            intent.putExtra("arapca","Cuma Suresi Arapça Metni")
            intent.putExtra("meal","Cuma Suresi Meali")
            intent.putExtra("okunus","Cuma Suresi Okunuşu")
            startActivity(intent)

        })

        tv_insan.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, UcluMenu::class.java)
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }
            intent.putExtra("baslik","İnsan Suresi")
            intent.putExtra("arapca","İnsan Suresi Arapça Metni")
            intent.putExtra("meal","İnsan Suresi Meali")
            intent.putExtra("okunus","İnsan Suresi Okunuşu")
            startActivity(intent)

        })

        tv_rahman.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, UcluMenu::class.java)
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }
            intent.putExtra("baslik","Rahman Suresi")
            intent.putExtra("arapca","Rahman Suresi Arapça Metni")
            intent.putExtra("meal","Rahman Suresi Meali")
            intent.putExtra("okunus","Rahman Suresi Okunuşu")
            startActivity(intent)

        })

        tv_kehf.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, UcluMenu::class.java)
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }
            intent.putExtra("baslik","Kehf Suresi")
            intent.putExtra("arapca","Kehf Suresi Arapça Metni")
            intent.putExtra("meal","Kehf Suresi Meali")
            intent.putExtra("okunus","Kehf Suresi Okunuşu")
            startActivity(intent)

        })




        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.ana_sayfa, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            //R.id.action_settings -> return true

            R.id.action_paylas -> {

                val sharingIntent = Intent(Intent.ACTION_SEND)
                sharingIntent.type = "text/plain"
                val shareBodyText = "http://play.google.com/store/apps/details?id=" + application.packageName
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, " Sureler")
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBodyText)
                startActivity(Intent.createChooser(sharingIntent, "Sureler"))

                return true
            }
            R.id.action_degerlendir -> {
                rateApp()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
    fun rateApp() {
        try {
            val rateIntent = rateIntentForUrl("market://details")
            startActivity(rateIntent)
        } catch (e: Exception) {
            val rateIntent = rateIntentForUrl("https://play.google.com/store/apps/details")
            startActivity(rateIntent)
        }

    }
    private fun rateIntentForUrl(url: String): Intent {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(String.format("%s?id=%s", url, packageName)))
        var flags = Intent.FLAG_ACTIVITY_NO_HISTORY or Intent.FLAG_ACTIVITY_MULTIPLE_TASK
        if (Build.VERSION.SDK_INT >= 21) {
            flags = flags or Intent.FLAG_ACTIVITY_NEW_DOCUMENT
        } else {

            flags = flags or Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET
        }
        intent.addFlags(flags)
        return intent
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_anasayfa -> {
                val intent = Intent(this, MainActivity::class.java)
                if (mInterstitialAd.isLoaded) {
                    mInterstitialAd.show()
                }
                startActivity(intent)
            }
            R.id.nav_yasin -> {
                val intent = Intent(this, UcluMenu::class.java)
                if (mInterstitialAd.isLoaded) {
                    mInterstitialAd.show()
                }
                intent.putExtra("baslik","Yasin Suresi")
                intent.putExtra("arapca","Yasin Suresi Arapça Metni")
                intent.putExtra("meal","Yasin Suresi Meali")
                intent.putExtra("okunus","Yasin Suresi Okunuşu")
                startActivity(intent)

            }
            R.id.nav_mulk -> {
                val intent = Intent(this, UcluMenu::class.java)
                if (mInterstitialAd.isLoaded) {
                    mInterstitialAd.show()
                }
                intent.putExtra("baslik","Mülk Suresi")
                intent.putExtra("arapca","Mülk Suresi Arapça Metni")
                intent.putExtra("meal","Mülk Suresi Meali")
                intent.putExtra("okunus","Mülk Suresi Okunuşu")
                startActivity(intent)

            }
            R.id.nav_amme -> {
                val intent = Intent(this, UcluMenu::class.java)
                if (mInterstitialAd.isLoaded) {
                    mInterstitialAd.show()
                }
                intent.putExtra("baslik","Nebe Suresi")
                intent.putExtra("arapca","Nebe Suresi Arapça Metni")
                intent.putExtra("meal","Nebe Suresi Meali")
                intent.putExtra("okunus","Nebe Suresi Okunuşu")
                startActivity(intent)

            }
            R.id.nav_meryem -> {
                val intent = Intent(this, UcluMenu::class.java)
                if (mInterstitialAd.isLoaded) {
                    mInterstitialAd.show()
                }
                intent.putExtra("baslik","Meryem Suresi")
                intent.putExtra("arapca","Meryem Suresi Arapça Metni")
                intent.putExtra("meal","Meryem Suresi Meali")
                intent.putExtra("okunus","Meryem Suresi Okunuşu")
                startActivity(intent)

            }
            R.id.nav_taha -> {
                val intent = Intent(this, UcluMenu::class.java)
                if (mInterstitialAd.isLoaded) {
                    mInterstitialAd.show()
                }
                intent.putExtra("baslik","Taha Suresi")
                intent.putExtra("arapca","Taha Suresi Arapça Metni")
                intent.putExtra("meal","Taha Suresi Meali")
                intent.putExtra("okunus","Taha Suresi Okunuşu")
                startActivity(intent)

            }
            R.id.nav_fetih -> {
                val intent = Intent(this, UcluMenu::class.java)
                if (mInterstitialAd.isLoaded) {
                    mInterstitialAd.show()
                }
                intent.putExtra("baslik","Fetih Suresi")
                intent.putExtra("arapca","Fetih Suresi Arapça Metni")
                intent.putExtra("meal","Fetih Suresi Meali")
                intent.putExtra("okunus","Fetih Suresi Okunuşu")
                startActivity(intent)

            }
            R.id.nav_vakia -> {
                val intent = Intent(this, UcluMenu::class.java)
                if (mInterstitialAd.isLoaded) {
                    mInterstitialAd.show()
                }
                intent.putExtra("baslik","Vakıa Suresi")
                intent.putExtra("arapca","Vakıa Suresi Arapça Metni")
                intent.putExtra("meal","Vakıa Suresi Meali")
                intent.putExtra("okunus","Vakıa Suresi Okunuşu")
                startActivity(intent)

            }
            R.id.nav_cuma-> {
                val intent = Intent(this, UcluMenu::class.java)
                if (mInterstitialAd.isLoaded) {
                    mInterstitialAd.show()
                }
                intent.putExtra("baslik","Cuma Suresi")
                intent.putExtra("arapca","Cuma Suresi Arapça Metni")
                intent.putExtra("meal","Cuma Suresi Meali")
                intent.putExtra("okunus","Cuma Suresi Okunuşu")
                startActivity(intent)

            }
            R.id.nav_insan -> {
                val intent = Intent(this, UcluMenu::class.java)
                if (mInterstitialAd.isLoaded) {
                    mInterstitialAd.show()
                }
                intent.putExtra("baslik","İnsan Suresi")
                intent.putExtra("arapca","İnsan Suresi Arapça Metni")
                intent.putExtra("meal","İnsan Suresi Meali")
                intent.putExtra("okunus","İnsan Suresi Okunuşu")
                startActivity(intent)

            }
            R.id.nav_rahman -> {
                val intent = Intent(this, UcluMenu::class.java)
                if (mInterstitialAd.isLoaded) {
                    mInterstitialAd.show()
                }
                intent.putExtra("baslik","Rahman Suresi")
                intent.putExtra("arapca","Rahman Suresi Arapça Metni")
                intent.putExtra("meal","Rahman Suresi Meali")
                intent.putExtra("okunus","Rahman Suresi Okunuşu")
                startActivity(intent)

            }
            R.id.nav_kehf -> {
                val intent = Intent(this, UcluMenu::class.java)
                if (mInterstitialAd.isLoaded) {
                    mInterstitialAd.show()
                }
                intent.putExtra("baslik","Kehf Suresi")
                intent.putExtra("arapca","Kehf Suresi Arapça Metni")
                intent.putExtra("meal","Kehf Suresi Meali")
                intent.putExtra("okunus","Kehf Suresi Okunuşu")
                startActivity(intent)

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
