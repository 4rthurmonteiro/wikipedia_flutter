package org.wikipedia.games

import io.flutter.embedding.android.FlutterFragment

class GamesFragment : FlutterFragment() {
    companion object {
        fun makeFragment() : GamesFragment {
            return NewEngineFragmentBuilder(GamesFragment::class.java).build()
        }
    }
}