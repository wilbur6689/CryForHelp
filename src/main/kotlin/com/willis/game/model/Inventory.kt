package com.willis.game.model

import lombok.Data

@Data
data class Inventory (

    // this will keep track of all resources the survivor has
    // wood, stone, ore, time
    var curResources: Map<String, Int>,

    // this will keep track of what tools the survivor has
    // pick, axe, shovel
    var curTools: Map<String, Boolean>
)