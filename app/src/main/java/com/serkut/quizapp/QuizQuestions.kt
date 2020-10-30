package com.serkut.quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewManager
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QuizQuestions : AppCompatActivity(), View.OnClickListener{

    private var mCurrentPosition:Int =1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOptionPosition : Int = 0
    private var mCorrectAnswers : Int = 0
    private var mUsername : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        mUsername=intent.getStringExtra(Constants.USER_NAME)

        mQuestionList = Constants.getQuestions()
        setQuestion()

        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)

    }

    private fun setQuestion() {

        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)


        val question = mQuestionList!![mCurrentPosition - 1] // Getting the question from the list with the help of current position.

        defaultOptionsView() // all the options back to the normal apperance for going to new  question

        if(mCurrentPosition == mQuestionList!!.size) {
            btn_submit.text = "Finished"
        } else {
            btn_submit.text = "Sumbit"
        }
        progressBar.progress = mCurrentPosition // Setting the current progress in the progressbar using the position of question
        tv_progress.text = "$mCurrentPosition" + "/" + progressBar.getMax() // Setting up the progress text

        // Now set the current question and the options in the UI
        tv_question.text = question!!.question
        iv_image.setImageResource(question.image)
        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optionTwo
        tv_option_three.text = question.optionThree
        tv_option_four.text = question.optionFour
    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        options.add(0,tv_option_one )
        options.add(1,tv_option_two)
        options.add(2,tv_option_three)
        options.add(3,tv_option_four)

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT // YaztıTipi
            option.background = ContextCompat.getDrawable(this,R.drawable.default_option_border_bg)
        }
    }
    override fun onClick(v : View?) {
        when (v?.id) {
            R.id.tv_option_one ->{
                selectedOptionView(tv_option_one,1)
        } R.id.tv_option_two -> {
            selectedOptionView(tv_option_two,2)
        } R.id.tv_option_three -> {
            selectedOptionView(tv_option_three,3)
        } R.id.tv_option_four -> {
            selectedOptionView(tv_option_four,4)
        } R.id.btn_submit -> {
            if (btn_submit.isPressed) {
                tv_option_one.setOnClickListener(null)
                tv_option_two.setOnClickListener(null)
                tv_option_three.setOnClickListener(null)
                tv_option_four.setOnClickListener(null)
            }
            if(mSelectedOptionPosition == 0) {
                mCurrentPosition++

                when {
                    mCurrentPosition <= mQuestionList!!.size ->{
                        setQuestion()
                    } else -> {
                    val intent = Intent(this,ResultActivity :: class.java)
                    intent.putExtra(Constants.USER_NAME,mUsername)
                    intent.putExtra(Constants.CORRECT_ANSWERS,mCorrectAnswers)
                    intent.putExtra(Constants.TOTAL_QUESTIONS,mQuestionList!!.size)
                    startActivity(intent)
                }
                }
            } else {
                val question = mQuestionList?.get(mCurrentPosition - 1)
                if (question!!.correctAnswer != mSelectedOptionPosition) {
                    answerView(mSelectedOptionPosition,R.drawable.wrong_option_border_bg)
                } else {
                    mCorrectAnswers++
                }
                answerView(question.correctAnswer,R.drawable.correct_option_border_bg)

                if(mCurrentPosition == mQuestionList!!.size) {
                    btn_submit.text = "Finished"
                } else {
                    btn_submit.text= "Go to next Question"
                }

                mSelectedOptionPosition = 0
            }

        }
        }
    }

    private fun answerView(answer : Int , drawableView : Int) {
        when (answer) {
            1 -> {
                tv_option_one.background = ContextCompat.
                getDrawable(this,drawableView)
            }
            2 -> {
                tv_option_two.background = ContextCompat.
                getDrawable(this,drawableView)
            }
            3 -> {
                tv_option_three.background = ContextCompat.
                getDrawable(this,drawableView)
            }
            4 -> {
                tv_option_four.background = ContextCompat.
                getDrawable(this,drawableView)
            }
        }
    }

    private fun selectedOptionView(tv : TextView ,selectedOptionNumber : Int) {
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNumber

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD) // YaztıTipi
        tv.background = ContextCompat.getDrawable(this,R.drawable.selected_option_border_bg)


    }
}