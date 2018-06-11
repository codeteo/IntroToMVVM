package com.mvvm.intro

import com.mvvm.intro.model.Calculator
import com.mvvm.intro.model.TipCalculation
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class RestaurantCalculatorTest {

    lateinit var calculator: Calculator

    @Before
    fun setup() {
        calculator = Calculator()
    }

    @Test
    fun testCalculateTip() {
        val checkInput = 10.00
        val tipPct = 25

        val expectedTipResult = TipCalculation(
                checkAmount = checkInput,
                tipPct = 25,
                tipAmount = 2.50,
                grantTotal = 12.50
        )

        assertEquals(expectedTipResult,
                calculator.calculateTip(checkInput, tipPct))

    }

}