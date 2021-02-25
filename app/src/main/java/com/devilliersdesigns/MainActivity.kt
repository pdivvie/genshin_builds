package com.devilliersdesigns

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var albedoBtn = findViewById<Button>(R.id.albedoBtn)
        albedoBtn.setOnClickListener {
            val intent = Intent(this, Albedo::class.java)
            startActivity(intent)
        }
        var amberBtn = findViewById<Button>(R.id.amberBtn)
        amberBtn.setOnClickListener {
            val intent = Intent(this, Amber::class.java)
            startActivity(intent)
        }
        var barbaraBtn = findViewById<Button>(R.id.barbaraBtn)
        barbaraBtn.setOnClickListener {
            val intent = Intent(this, Barbara::class.java)
            startActivity(intent)
        }
        var beidouBtn = findViewById<Button>(R.id.beidouBtn)
        beidouBtn.setOnClickListener {
            val intent = Intent(this, Beidou::class.java)
            startActivity(intent)
        }
        var bennetBtn = findViewById<Button>(R.id.bennetBtn)
        bennetBtn.setOnClickListener {
            val intent = Intent(this, Bennet::class.java)
            startActivity(intent)
        }
        var chongyunBtn = findViewById<Button>(R.id.chongyunBtn)
        chongyunBtn.setOnClickListener {
            val intent = Intent(this, Chongyun::class.java)
            startActivity(intent)
        }
        var dilucBtn = findViewById<Button>(R.id.dilucBtn)
        dilucBtn.setOnClickListener {
            val intent = Intent(this, Diluc::class.java)
            startActivity(intent)
        }
        var dionaBtn = findViewById<Button>(R.id.dionaBtn)
        dionaBtn.setOnClickListener {
            val intent = Intent(this, Diona::class.java)
            startActivity(intent)
        }
        var fischlBtn = findViewById<Button>(R.id.fischlBtn)
        fischlBtn.setOnClickListener {
            val intent = Intent(this, Fischl::class.java)
            startActivity(intent)
        }
        var ganyuBtn = findViewById<Button>(R.id.ganyuBtn)
        ganyuBtn.setOnClickListener {
            val intent = Intent(this, Ganyu::class.java)
            startActivity(intent)
        }
        var jeanBtn = findViewById<Button>(R.id.jeanBtn)
        jeanBtn.setOnClickListener {
            val intent = Intent(this, Jean::class.java)
            startActivity(intent)
        }
        var kaeyaBtn = findViewById<Button>(R.id.kaeyaBtn)
        kaeyaBtn.setOnClickListener {
            val intent = Intent(this, Kaeya::class.java)
            startActivity(intent)
        }
        var keqingBtn = findViewById<Button>(R.id.keqingBtn)
        keqingBtn.setOnClickListener {
            val intent = Intent(this, Keqing::class.java)
            startActivity(intent)
        }
        var kleeBtn = findViewById<Button>(R.id.kleeBtn)
        kleeBtn.setOnClickListener {
            val intent = Intent(this, Klee::class.java)
            startActivity(intent)
        }
        var lisaBtn = findViewById<Button>(R.id.lisaBtn)
        lisaBtn.setOnClickListener {
            val intent = Intent(this, Lisa::class.java)
            startActivity(intent)
        }
        var monaBtn = findViewById<Button>(R.id.monaBtn)
        monaBtn.setOnClickListener {
            val intent = Intent(this, Mona::class.java)
            startActivity(intent)
        }
        var ninggaungBtn = findViewById<Button>(R.id.ningguangBtn)
        ninggaungBtn.setOnClickListener {
            val intent = Intent(this, Ningguang::class.java)
            startActivity(intent)
        }
        var noelleBtn = findViewById<Button>(R.id.noelleBtn)
        noelleBtn.setOnClickListener {
            val intent = Intent(this, Noelle::class.java)
            startActivity(intent)
        }
    }

}