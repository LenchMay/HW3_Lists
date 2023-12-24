package com.example.hw3lists

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract

class EditItemContract : ActivityResultContract<Unit, Fox?>() {
    override fun createIntent(context: Context, input: Unit): Intent {
        return Intent(context, FoxAddActivity::class.java)
    }

    override fun parseResult(resultCode: Int, intent: Intent?): Fox? = when {
        resultCode != Activity.RESULT_OK -> null
        else -> intent?.getSerializableExtra("Fox") as Fox
    }

}