package com.mvvm.intro.viewmodel

import com.mvvm.intro.model.Calculator
import com.mvvm.intro.model.TipCalculation
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentMatchers
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations

class CalculatorViewModelTest {

    lateinit var calculatorViewModel: CalculatorViewModel

    @Mock
    lateinit var mockCalculator: Calculator

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)

        calculatorViewModel = CalculatorViewModel(mockCalculator)
    }


    @Test
    fun testCalculateTip() {

        calculatorViewModel.inputCheckAmount = "10.00"
        calculatorViewModel.inputTipPercentage = "15"

        val stub = TipCalculation(10.00, tipAmount = 1.5, grantTotal =  11.5)
        `when`(mockCalculator.calculateTip(10.00, 15)).thenReturn(stub)

        calculatorViewModel.calculateTip()

        assertEquals(stub, calculatorViewModel.calculateTip())
    }

    @Test
    fun testCalculateTipBadTipPercent() {

        calculatorViewModel.inputCheckAmount = "10.00"
        calculatorViewModel.inputTipPercentage = ""

        calculatorViewModel.calculateTip()

        verify(mockCalculator,  never()).calculateTip(ArgumentMatchers.anyDouble(), ArgumentMatchers.anyInt())

    }

}