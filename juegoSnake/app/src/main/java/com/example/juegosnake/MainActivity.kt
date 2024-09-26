package com.example.juegosnake

import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var gameView: GameView
    var direction = Direction.RIGHT // Initial direction of snake

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the game view
        gameView = GameView(this)
        findViewById<FrameLayout>(R.id.gameView).addView(gameView)

        // Start the game
        startGame()
    }

    private fun startGame() {
        gameView.startGame()
    }

    // Movement methods triggered by touch zones
    fun moveUp(view: View) {
        if (direction != Direction.DOWN) {
            direction = Direction.UP
            gameView.setDirection(Direction.UP)
        }
    }

    fun moveDown(view: View) {
        if (direction != Direction.UP) {
            direction = Direction.DOWN
            gameView.setDirection(Direction.DOWN)
        }
    }

    fun moveLeft(view: View) {
        if (direction != Direction.RIGHT) {
            direction = Direction.LEFT
            gameView.setDirection(Direction.LEFT)
        }
    }

    fun moveRight(view: View) {
        if (direction != Direction.LEFT) {
            direction = Direction.RIGHT
            gameView.setDirection(Direction.RIGHT)
        }
    }
}
