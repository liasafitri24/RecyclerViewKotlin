package com.lia.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tiara.recyclerviewkotlin.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.antmant,
                "Ant-Man",
                "Ant-Man bisa memanipulasi ukuran tubuhnya"

            ),
            Superhero(
                R.drawable.black,
                "Black Panter",
                "Black Panther adalah film superhero Amerika Serikat tahun 2018"
            ),
            Superhero(
                R.drawable.captain,
                "Captain America",
                "Captain America adalah sosok pahlawan super fiktif dari Marvel Comic"
            ),
            Superhero(
                R.drawable.doctor,
                "Doctor Strange",
                "Doctor Strange memiliki kekuatan memutar balikkan waktu"

            ),
            Superhero(
                R.drawable.gamora,
                "Gamora",
                "Gamora adalah putri angkat Thanos"

            ),
            Superhero(
                R.drawable.hawkeye,
                "Hawkeye",
                "Hawkeye menceritakan kisah Clint Barton (Jeremy Renner) menebus waktu yang hilang bersama keluarga tercintanya."

            ),
            Superhero(
                R.drawable.hulk,
                "Hulk",
                "Kelemahan Hulk yang lain adalah egonya sendiri"

            ),
            Superhero(
                R.drawable.iron,
                "Iron-Man",
                "Iron Man memiliki armor bertenaga"

            ),
            Superhero(
                R.drawable.loki,
                "Loki",
                "Loki adalah dewa tipuan Jermanik"

            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){

        }

    }
}