package br.com.fiap.appiadas

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.appiadas.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btTellJoker.setOnClickListener {
            showJoker()
        }
    }

    private fun showJoker() {
        val jokers = resources.getStringArray(R.array.jokers)
        val jokerNumber = Random().nextInt(jokers.size)
        val joker = jokers[jokerNumber]
        binding.tvJoker.text = joker
        playSong()
    }

    private fun playSong() {
        val mediaPlayer = MediaPlayer.create(this, R.raw.badumtss)
        mediaPlayer.start()
    }

}