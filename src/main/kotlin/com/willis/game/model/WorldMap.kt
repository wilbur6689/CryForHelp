package com.willis.game.model

data class WorldMap (

    // The World Map will contain information that will
    //      - Generate a visual map for the user to see
    //      - tell the survivor what resources are available in each square
    //

    val worldMap: Map<Double, String>
)