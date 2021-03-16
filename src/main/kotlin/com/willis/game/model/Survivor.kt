package com.willis.game.model

import lombok.Data

@Data
data class Survivor (

    var name:String,
    var curtInv:Inventory,
    var numbOfWorkers:Int
)