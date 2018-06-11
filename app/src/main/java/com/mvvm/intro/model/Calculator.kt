package com.mvvm.intro.model

import java.math.RoundingMode

/**
 * Created by teo on 11/6/2018.
 */
class Calculator {

    fun calculateTip(checkAmount: Double, tipPct: Int): TipCalculation {

        val tipAmount = checkAmount * (tipPct.toDouble() / 100.00)
                .toBigDecimal()
                .setScale(2, RoundingMode.HALF_UP)
                .toDouble()

        val grandTotal = checkAmount + tipAmount

        return TipCalculation(
                checkAmount = checkAmount,
                tipPct = tipPct,
                tipAmount = tipAmount,
                grantTotal =  grandTotal
        )
    }

}
