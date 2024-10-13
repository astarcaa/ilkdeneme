package com.kacozsoft.yasinenschn

import android.content.Intent
import android.os.Bundle

import android.support.v7.app.AppCompatActivity
import android.view.View
import androidx.appcompat.app.AppCompatActivity

import com.kacozsoft.yasinenschn.R.id.*


import kotlinx.android.synthetic.main.activity_uclu_menu.*
import kotlinx.android.synthetic.main.content_uclu_menu.*

class UcluMenu : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uclu_menu)
        setSupportActionBar(toolbar)
        mAdView = findViewById(R.id.adView3)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = "ca-app-pub-3385721623773501/2592630364"
        mInterstitialAd.loadAd(AdRequest.Builder().build())

        val bundle = intent.extras
        var baslik = bundle.getString("baslik")
        var arapca = bundle.getString("arapca")
        var meal = bundle.getString("meal")
        var okunus = bundle.getString("okunus")
        getSupportActionBar()!!.setTitle(baslik)

        btn_arapca.text = arapca
        btn_meal.text = meal
        btn_okunus.text = okunus

        btn_arapca.setOnClickListener(View.OnClickListener {

            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }
            if (arapca.toString().equals("Yasin Suresi Arapça Metni")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Yasin Suresi")
                intent.putExtra("metin","Yasin Arapça")
                intent.putExtra("mp3","https://firebasestorage.googleapis.com/v0/b/sureler-app.appspot.com/o/yasin.mp3?alt=media&token=916eb6d0-d239-454c-aacd-c6781eb0cd5e")
                startActivity(intent)

            } else if (arapca.toString().equals("Mülk Suresi Arapça Metni")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Mülk Suresi")
                intent.putExtra("metin","Mülk Arapça")
                intent.putExtra("mp3","https://firebasestorage.googleapis.com/v0/b/sureler-app.appspot.com/o/mulk.mp3?alt=media&token=537a7fbe-b90a-4f29-9fba-cb0db42b3bb9")
                startActivity(intent)

            }
            else if (arapca.toString().equals("Nebe Suresi Arapça Metni")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Nebe Suresi")
                intent.putExtra("metin","Nebe Arapça")
                intent.putExtra("mp3","https://firebasestorage.googleapis.com/v0/b/sureler-app.appspot.com/o/nebe.mp3?alt=media&token=82733f9f-963d-4742-983e-0335f9ff2de8")
                startActivity(intent)

            }
            else if (arapca.toString().equals("Meryem Suresi Arapça Metni")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Meryem Suresi")
                intent.putExtra("metin","Meryem Arapça")
                intent.putExtra("mp3","https://firebasestorage.googleapis.com/v0/b/sureler-app.appspot.com/o/meryem.mp3?alt=media&token=a72219f7-444e-4ba7-a79d-40da1936f8d7")
                startActivity(intent)

            }
            else if (arapca.toString().equals("Taha Suresi Arapça Metni")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Taha Suresi")
                intent.putExtra("metin","Taha Arapça")
                intent.putExtra("mp3","https://firebasestorage.googleapis.com/v0/b/sureler-app.appspot.com/o/taha.mp3?alt=media&token=c1122f15-79ad-43f8-af01-35592f967f21")
                startActivity(intent)

            }
            else if (arapca.toString().equals("Fetih Suresi Arapça Metni")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Fetih Suresi")
                intent.putExtra("metin","Fetih Arapça")
                intent.putExtra("mp3","https://firebasestorage.googleapis.com/v0/b/sureler-app.appspot.com/o/fetih.mp3?alt=media&token=a103b0bc-2323-497d-8da7-ac6c5943010b")
                startActivity(intent)

            }
            else if (arapca.toString().equals("Vakıa Suresi Arapça Metni")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Vakıa Suresi")
                intent.putExtra("metin","Vakıa Arapça")
                intent.putExtra("mp3","https://firebasestorage.googleapis.com/v0/b/sureler-app.appspot.com/o/vakia.mp3?alt=media&token=e016d39b-bf5f-49a7-a474-3d39483cfcf1")
                startActivity(intent)

            }
            else if (arapca.toString().equals("Cuma Suresi Arapça Metni")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Cuma Suresi")
                intent.putExtra("metin","Cuma Arapça")
                intent.putExtra("mp3","https://firebasestorage.googleapis.com/v0/b/sureler-app.appspot.com/o/cuma.mp3?alt=media&token=17c2a29c-47a0-4575-929b-fec72da5edc8")
                startActivity(intent)

            }
            else if (arapca.toString().equals("İnsan Suresi Arapça Metni")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","İnsan Suresi")
                intent.putExtra("metin","İnsan Arapça")
                intent.putExtra("mp3","https://firebasestorage.googleapis.com/v0/b/sureler-app.appspot.com/o/insan.mp3?alt=media&token=f1368eee-600a-49ec-9315-0d669d64c7a5")
                startActivity(intent)

            }
            else if (arapca.toString().equals("Rahman Suresi Arapça Metni")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Rahman Suresi")
                intent.putExtra("metin","Rahman Arapça")
                intent.putExtra("mp3","https://firebasestorage.googleapis.com/v0/b/sureler-app.appspot.com/o/rahman.mp3?alt=media&token=511361c8-00f3-4fad-946d-e0869ca4f7ae")
                startActivity(intent)

            }
            else if (arapca.toString().equals("Kehf Suresi Arapça Metni")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Kehf Suresi")
                intent.putExtra("metin","Kehf Arapça")
                intent.putExtra("mp3","https://firebasestorage.googleapis.com/v0/b/sureler-app.appspot.com/o/kehf.mp3?alt=media&token=629e794c-dacb-4259-8eab-b51c1e119596")
                startActivity(intent)

            }

        })

        btn_meal.setOnClickListener(View.OnClickListener {
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }

            if (meal.toString().equals("Yasin Suresi Meali")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Yasin Suresi")
                intent.putExtra("metin","Yasin Meal")
                intent.putExtra("mp3","https://archive.org/download/kabeimamihatim/Yasin.mp3")
                startActivity(intent)

            } else if (meal.toString().equals("Mülk Suresi Meali")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Mülk Suresi")
                intent.putExtra("metin","Mülk Meal")
                intent.putExtra("mp3","https://archive.org/download/kabeimamihatim/Mulk.mp3")
                startActivity(intent)

            }
            else if (meal.toString().equals("Nebe Suresi Meali")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Nebe Suresi")
                intent.putExtra("metin","Nebe Meal")
                intent.putExtra("mp3","https://archive.org/download/kabeimamihatim/Nebe.mp3")
                startActivity(intent)

            }
            else if (meal.toString().equals("Meryem Suresi Meali")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Meryem Suresi")
                intent.putExtra("metin","Meryem Meal")
                intent.putExtra("mp3","https://archive.org/download/kabeimamihatim/Meryem.mp3")
                startActivity(intent)

            }
            else if (meal.toString().equals("Taha Suresi Meali")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Taha Suresi")
                intent.putExtra("metin","Taha Meal")
                intent.putExtra("mp3","https://archive.org/download/kabeimamihatim/Taha.mp3")
                startActivity(intent)

            }
            else if (meal.toString().equals("Fetih Suresi Meali")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Fetih Suresi")
                intent.putExtra("metin","Fetih Meal")
                intent.putExtra("mp3","https://archive.org/download/kabeimamihatim/Fetih.mp3")
                startActivity(intent)

            }
            else if (meal.toString().equals("Vakıa Suresi Meali")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Vakıa Suresi")
                intent.putExtra("metin","Vakıa Meal")
                intent.putExtra("mp3","https://archive.org/download/kabeimamihatim/Vakia.mp3")
                startActivity(intent)

            }
            else if (meal.toString().equals("Cuma Suresi Meali")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Cuma Suresi")
                intent.putExtra("metin","Cuma Meal")
                intent.putExtra("mp3","https://archive.org/download/kabeimamihatim/Cuma.mp3")
                startActivity(intent)

            }
            else if (meal.toString().equals("İnsan Suresi Meali")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","İnsan Suresi")
                intent.putExtra("metin","İnsan Meal")
                intent.putExtra("mp3","https://archive.org/download/kabeimamihatim/insan.mp3")
                startActivity(intent)

            }
            else if (meal.toString().equals("Rahman Suresi Meali")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Rahman Suresi")
                intent.putExtra("metin","Rahman Meal")
                intent.putExtra("mp3","https://archive.org/download/kabeimamihatim/Rahman.mp3")
                startActivity(intent)

            }
            else if (meal.toString().equals("Kehf Suresi Meali")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Kehf Suresi")
                intent.putExtra("metin","Kehf Meal")
                intent.putExtra("mp3","https://archive.org/download/kabeimamihatim/Kehf.mp3")
                startActivity(intent)

            }

        })

        btn_okunus.setOnClickListener(View.OnClickListener {
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }

            if (okunus.toString().equals("Yasin Suresi Okunuşu")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Yasin Suresi")
                intent.putExtra("metin","Yasin Okunus")
                intent.putExtra("mp3","https://archive.org/download/kabeimamihatim/Yasin.mp3")
                startActivity(intent)

            } else if (okunus.toString().equals("Mülk Suresi Okunuşu")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Mülk Suresi")
                intent.putExtra("metin","Mülk Okunus")
                intent.putExtra("mp3","https://archive.org/download/kabeimamihatim/Mulk.mp3")
                startActivity(intent)

            }
            else if (okunus.toString().equals("Nebe Suresi Okunuşu")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Nebe Suresi")
                intent.putExtra("metin","Nebe Okunus")
                intent.putExtra("mp3","https://archive.org/download/kabeimamihatim/Nebe.mp3")
                startActivity(intent)

            }
            else if (okunus.toString().equals("Meryem Suresi Okunuşu")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Meryem Suresi")
                intent.putExtra("metin","Meryem Okunus")
                intent.putExtra("mp3","https://archive.org/download/kabeimamihatim/Meryem.mp3")
                startActivity(intent)

            }
            else if (okunus.toString().equals("Taha Suresi Okunuşu")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Taha Suresi")
                intent.putExtra("metin","Taha Okunus")
                intent.putExtra("mp3","https://archive.org/download/kabeimamihatim/Taha.mp3")
                startActivity(intent)

            }
            else if (okunus.toString().equals("Fetih Suresi Okunuşu")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Fetih Suresi")
                intent.putExtra("metin","Fetih Okunus")
                intent.putExtra("mp3","https://archive.org/download/kabeimamihatim/Fetih.mp3")
                startActivity(intent)

            }
            else if (okunus.toString().equals("Vakıa Suresi Okunuşu")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Vakıa Suresi")
                intent.putExtra("metin","Vakıa Okunus")
                intent.putExtra("mp3","https://archive.org/download/kabeimamihatim/Vakia.mp3")
                startActivity(intent)

            }
            else if (okunus.toString().equals("Cuma Suresi Okunuşu")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Cuma Suresi")
                intent.putExtra("metin","Cuma Okunus")
                intent.putExtra("mp3","https://archive.org/download/kabeimamihatim/Cuma.mp3")
                startActivity(intent)

            }
            else if (okunus.toString().equals("İnsan Suresi Okunuşu")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","İnsan Suresi")
                intent.putExtra("metin","İnsan Okunus")
                intent.putExtra("mp3","https://archive.org/download/kabeimamihatim/insan.mp3")
                startActivity(intent)

            }
            else if (okunus.toString().equals("Rahman Suresi Okunuşu")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Rahman Suresi")
                intent.putExtra("metin","Rahman Okunus")
                intent.putExtra("mp3","https://archive.org/download/kabeimamihatim/Rahman.mp3")
                startActivity(intent)

            }
            else if (okunus.toString().equals("Kehf Suresi Okunuşu")) {
                val intent = Intent(this, IcerikDetay::class.java)
                intent.putExtra("baslik","Kehf Suresi")
                intent.putExtra("metin","Kehf Okunus")
                intent.putExtra("mp3","https://archive.org/download/kabeimamihatim/Kehf.mp3")
                startActivity(intent)

            }



        })




    }

}
