package com.mvvm.intro.viewmodel

import junit.framework.Assert
import org.junit.Before
import org.junit.Test

class CalculatorViewModelTest {

    lateinit var calculatorViewModel: CalculatorViewModel

    @Before
    fun setup() {
        calculatorViewModel = CalculatorViewModel()
    }


    @Test
    fun testCalculateTip() {

        calculatorViewModel.inputCheckAmount = "10.00"
        calculatorViewModel.inputTipPercentage = "15"

        calculatorViewModel.calculateTip()

        Assert.assertEquals(10.00, calculatorViewModel.tipCalculation.checkAmount)
        Assert.assertEquals(1.50, calculatorViewModel.tipCalculation.tipAmount)
        Assert.assertEquals(11.50, calculatorViewModel.tipCalculation.grantTotal)
    }

}