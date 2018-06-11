package com.mvvm.intro.viewmodel

import com.mvvm.intro.model.Calculator
import com.mvvm.intro.model.TipCalculation

class CalculatorViewModel(val calculator: Calculator = Calculator()) {

    var inputCheckAmount = ""

    var inputTipPercentage = ""

    var tipCalculation = TipCalculation()

    fun calculateTip() {

        val checkAmount  = inputCheckAmount.toDoubleOrNull()
        val tipPct = inputTipPercentage.toIntOrNull()

        if (checkAmount != null && tipPct != null) {
            tipCalculation = calculator.calculateTip(checkAmount, tipPct)
        }

    }

}