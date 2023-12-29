package com.example.hw3lists

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract

class EditItemContract : ActivityResultContract<Unit, Fox>() {
    override fun createIntent(context: Context, input: Unit) = Intent(context, FoxAddActivity::class.java)

    override fun parseResult(resultCode: Int, result: Intent?): Fox {
        return Fox(
            result?.getStringExtra(FoxAddActivity.EXTRA_NAME) ?: "",
            result?.getStringExtra(FoxAddActivity.EXTRA_AGE) ?: "",
            result?.getStringExtra(FoxAddActivity.EXTRA_COLOR) ?: ""
        )
    }

}