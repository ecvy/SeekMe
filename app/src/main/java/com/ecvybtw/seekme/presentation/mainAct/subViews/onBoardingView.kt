package com.ecvybtw.seekme.presentation.mainAct.subViews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ecvybtw.seekme.R


@Composable
fun WelcomeOnBStep(onNavigateToPINOnBStep: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {

        Text(
            text = stringResource(id = R.string.Welcome), fontSize = 28.sp,
            modifier = Modifier
                .padding(32.dp)
                .padding(top = 30.dp),

            )


        Spacer(Modifier.height(8.dp))
        Text(
            text = stringResource(id = R.string.WelcomeTxt), fontSize = 16.sp,
            modifier = Modifier.padding(horizontal = 30.dp)
        )



        Spacer(Modifier.weight(1f))


        Button(
            onClick = onNavigateToPINOnBStep,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(text = stringResource(id = R.string.GetS))
        }

    }
}

@Composable
fun PINOnBStep(onNavigateToSMSAccess: () -> Unit) {
    var code by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize()) {

        Text(
            text = stringResource(id = R.string.PINEnter), fontSize = 28.sp,
            modifier = Modifier
                .padding(32.dp)
                .padding(top = 30.dp),

            )


        Spacer(Modifier.height(8.dp))
        Text(
            text = stringResource(id = R.string.PINEnter2), fontSize = 16.sp,
            modifier = Modifier.padding(horizontal = 30.dp)
        )



        Spacer(Modifier.weight(1f))

        BasicTextField(
            value = code,
            onValueChange = { newValue ->
                if (newValue.length <= 4) {
                    code = newValue
                }
            },
            singleLine = true,
//            keyboardOptions = KeyboardType.NumberPassword.copy(imeAction = ImeAction.Done),
            decorationBox = { innerTextField ->
                Row(horizontalArrangement = Arrangement.SpaceBetween) {
                    repeat(4) { index ->
                        Box(
                            modifier = Modifier
                                .size(48.dp)
                                .background(Color.LightGray, RoundedCornerShape(4.dp))
                                .align(Alignment.CenterVertically),
                            contentAlignment = Alignment.Center
                        ) {
                            if (index < code.length) {
                                Text(text = code[index].toString(), color = Color.Black)
                            } else {
                                Text(text = "•", color = Color.Gray)
                            }
                        }
                    }
                }
                innerTextField()
            }
        )
    }

}


@Composable
fun SMSAccess(onNavigateToSMSAccess: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {

        Text(
            text = stringResource(id = R.string.SMSEnter), fontSize = 28.sp,
            modifier = Modifier
                .padding(32.dp)
                .padding(top = 30.dp),

            )


        Spacer(Modifier.height(8.dp))
        Text(
            text = stringResource(id = R.string.SMSEnter2), fontSize = 16.sp,
            modifier = Modifier.padding(horizontal = 30.dp)
        )



        Spacer(Modifier.weight(1f))


        Button(
            onClick = { /* Handle button click */ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(text = stringResource(id = R.string.GrantAccessSMS))
        }

    }

}
