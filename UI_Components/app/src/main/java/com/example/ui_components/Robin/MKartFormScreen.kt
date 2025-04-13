package com.example.ui_components.Robin

import android.icu.util.Calendar
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusProperties
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui_components.R
import com.example.ui_components.ui.theme.inactiveGrey
import com.example.ui_components.ui.theme.primaryBg
import com.example.ui_components.ui.theme.primaryText
import java.text.SimpleDateFormat
import java.time.Instant
import java.util.Date
import java.util.Locale

@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = false)
@Composable
fun MKartFormPreviewScreen()
{
    MKartFormScreen()
}

@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MKartFormScreen() {

    val calendar = Calendar.getInstance()
    var start_date by remember { mutableStateOf("") }

    var end_date by remember { mutableStateOf("") }
    val formatter = SimpleDateFormat("yyyy-MM-dd",Locale.getDefault())

    val startDatePickerState = rememberDatePickerState(
        initialSelectedDateMillis = Instant.now().toEpochMilli()
    )

    val endDatePickerState = rememberDatePickerState(
        initialSelectedDateMillis = Instant.now().toEpochMilli()
    )

    var showStartDatePicker by remember {
        mutableStateOf(false)
    }

    var showEndDatePicker by remember {
        mutableStateOf(false)
    }

    var selectedStartDate by remember {
        mutableStateOf(calendar.timeInMillis)
    }

    var selectedEndDate by remember {
        mutableStateOf(calendar.timeInMillis)
    }

    val radioOptions = listOf("Rent", "Sell")
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(radioOptions[0]) }
    val categories = listOf("Furniture","Electronics","Games","Clothes")

    var isExpanded by remember { mutableStateOf(false) }
    var selectedState = remember { mutableStateOf("") }
    var product_name by remember { mutableStateOf("") }
    var rent_amount by remember { mutableStateOf("") }
    var isChecked by remember { mutableStateOf(false) }

    var name by remember { mutableStateOf("") }

    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = primaryBg
    ) {
        Column() {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                tonalElevation = 1024.dp,
                shadowElevation = 16.dp,
                color = Color.White
            )
            {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 25.dp)
                )
                {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(onClick = { }) {
                            Icon(
                                imageVector = Icons.Default.Menu,
                                contentDescription = "Menu",
                                tint = primaryText,
                                modifier = Modifier.size(30.dp)
                            )
                        }

                        Spacer(modifier = Modifier.weight(1f))

                        Icon(
                            imageVector = Icons.Default.Notifications,
                            contentDescription = "Notification",
                            tint = primaryText,
                            modifier = Modifier.size(30.dp)
                        )
                    }

                    Text(
                        text = "MonashHub",
                        style = TextStyle(
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold,
                            color = primaryText
                        ),
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
            }

            Spacer(modifier = Modifier.height(36.dp))

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                )
                {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Notification",
                        tint = primaryText,
                        modifier = Modifier.size(26.dp)
                    )
                    Spacer(
                        modifier = Modifier.width(5.dp)
                    )
                    Text(
                        text = "Add product for rent or sell",
                        style = TextStyle(
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold,
                            color = primaryText
                        )
                    )
                }

                HorizontalDivider(
                    thickness = 2.dp,
                    color = primaryText,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp)
                )

                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color(0xFF000044),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        ) {
                            append("Product Name ")
                        }
                        withStyle(
                            style = SpanStyle(
                                color = Color.Red,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            )
                        ) {
                            append("*")
                        }
                    },
                    modifier = Modifier.padding(top = 10.dp)
                )
                Spacer(
                    modifier = Modifier.height(5.dp)
                )
                OutlinedTextField(
                    value = product_name,
                    onValueChange = {
                        product_name = it
                    },
                    placeholder = { Text("Enter Product Name") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp),
                    shape = RectangleShape,
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent,
                        errorContainerColor = Color.Red,
                        focusedLabelColor = primaryText,
                        unfocusedLabelColor = inactiveGrey,
                        focusedIndicatorColor = primaryText,
                        unfocusedIndicatorColor = inactiveGrey,
                    )
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color(0xFF000044),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        ) {
                            append("Product Category ")
                        }
                        withStyle(
                            style = SpanStyle(
                                color = Color.Red,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            )
                        ) {
                            append("*")
                        }
                    },
                )
                Spacer(
                    modifier = Modifier.height(5.dp)
                )

                Column(){
                    ExposedDropdownMenuBox(
                        expanded = isExpanded,
                        onExpandedChange = { isExpanded = it}
                    ) {

                        OutlinedTextField(
                            modifier = Modifier
                                .menuAnchor()
                                .fillMaxWidth()
                                .height(55.dp)
                                .focusProperties {
                                    canFocus = false
                                },
                            placeholder = {Text("Enter Category")},
                            readOnly = true,
                            shape = RectangleShape,
                            value = selectedState.value,
                            onValueChange = {},
                            trailingIcon = {
                                ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded)
                            },
                        )
                        ExposedDropdownMenu(
                            expanded = isExpanded,
                            onDismissRequest = { isExpanded = false }
                        ) {
                            categories.forEach { selectedOption ->
                                DropdownMenuItem(
                                    text = { Text(selectedOption) },
                                    onClick = {
                                        selectedState.value = selectedOption
                                        isExpanded = false
                                    },
                                    contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding,
                                )
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color(0xFF000044),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        ) {
                            append("Do you want to keep it for rent / sell ")
                        }
                        withStyle(
                            style = SpanStyle(
                                color = Color.Red,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            )
                        ) {
                            append("*")
                        }
                    },
                )
                Spacer(
                    modifier = Modifier.height(5.dp)
                )
                Row(Modifier
                    .selectableGroup(),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    radioOptions.forEach { text ->
                        Surface(
                            Modifier.weight(1f),
                            color = primaryBg
                        ) {
                            Row(
                                Modifier
                                    .selectable(
                                        selected = (text == selectedOption),
                                        onClick = { onOptionSelected(text) },
                                        role = Role.RadioButton
                                    ),
                                verticalAlignment = Alignment.CenterVertically,
                            ) {
                                RadioButton(
                                    selected = (text == selectedOption),
                                    onClick = null // null recommended for accessibility with screen readers
                                )
                                Text(
                                    text = text,
                                    style = MaterialTheme.typography.bodyLarge,
                                    modifier = Modifier.padding(start = 5.dp, end = 20.dp)
                                )
                            }
                        }

                    }
                }

                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color(0xFF000044),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        ) {
                            append("Start Date ")
                        }
                        withStyle(
                            style = SpanStyle(
                                color = Color.Red,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            )
                        ) {
                            append("*")
                        }
                    },
                )
                Spacer(
                    modifier = Modifier.height(5.dp)
                )
                Column(){
                    OutlinedTextField (
                        value = start_date,
                        onValueChange = {},
                        placeholder = {Text("Start Date")},
                        readOnly = true,
                        shape = RectangleShape,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(55.dp)
                            .focusProperties {
                                canFocus = false
                            }
                            .clickable{showStartDatePicker = true},
                        trailingIcon = {
                            Icon(
                                painter = painterResource(R.drawable.calendar),
                                tint = Color.Unspecified,
                                contentDescription = "Select Date",
                                modifier = Modifier
                                    .clickable{showStartDatePicker = true}
                                    .size(30.dp)
                            )
                        }
                    )
                    if(showStartDatePicker)
                    {
                        DatePickerDialog(
                            onDismissRequest = {
                                showStartDatePicker = false
                            },
                            confirmButton = {
                                TextButton(
                                    onClick = {
                                        showStartDatePicker = false
                                        selectedStartDate = startDatePickerState.selectedDateMillis!!
                                        start_date = formatter.format(Date(selectedStartDate))
                                    }
                                ) {
                                    Text("OK")
                                }
                            },
                            dismissButton = {
                                TextButton(
                                    onClick = {
                                        showStartDatePicker = false
                                    }
                                ) {
                                    Text("Cancel")
                                }
                            }
                        ){
                            DatePicker(
                                state = startDatePickerState
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color(0xFF000044),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        ) {
                            append("End Date ")
                        }
                        withStyle(
                            style = SpanStyle(
                                color = Color.Red,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            )
                        ) {
                            append("*")
                        }
                    },
                )
                Spacer(
                    modifier = Modifier.height(5.dp)
                )
                Column(){
                    OutlinedTextField (
                        value = end_date,
                        onValueChange = {},
                        placeholder = {Text("End Date")},
                        readOnly = true,
                        shape = RectangleShape,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(55.dp)
                            .clickable{showEndDatePicker = true},
                        trailingIcon = {
                            Icon(
                                painter = painterResource(R.drawable.calendar),
                                tint = Color.Unspecified,
                                contentDescription = "Select Date",
                                modifier = Modifier
                                    .clickable{showEndDatePicker = true}
                                    .size(30.dp)
                            )
                        }
                    )
                    if(showEndDatePicker)
                    {
                        DatePickerDialog(
                            onDismissRequest = {
                                showEndDatePicker = false
                            },
                            confirmButton = {
                                TextButton(
                                    onClick = {
                                        showEndDatePicker = false
                                        selectedEndDate = endDatePickerState.selectedDateMillis!!
                                        end_date = formatter.format(Date(selectedEndDate))
                                    }
                                ) {
                                    Text("OK")
                                }
                            },
                            dismissButton = {
                                TextButton(
                                    onClick = {
                                        showEndDatePicker = false
                                    }
                                ) {
                                    Text("Cancel")
                                }
                            }
                        ){
                            DatePicker(
                                state = endDatePickerState
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color(0xFF000044),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        ) {
                            append("Rent Amount (AUD): ")
                        }
                        withStyle(
                            style = SpanStyle(
                                color = Color.Red,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            )
                        ) {
                            append("*")
                        }
                    },
               )
                Spacer(
                    modifier = Modifier.height(5.dp)
                )
                OutlinedTextField(
                    value = rent_amount,
                    onValueChange = {
                        rent_amount = it
                    },
                    placeholder = { Text("Enter Rent Amount") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp),
                    shape = RectangleShape,
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent,
                        errorContainerColor = Color.Red,
                        focusedLabelColor = primaryText,
                        unfocusedLabelColor = inactiveGrey,
                        focusedIndicatorColor = primaryText,
                        unfocusedIndicatorColor = inactiveGrey,
                    )
                )


                Spacer(
                    modifier = Modifier.height(15.dp)
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Checkbox(
                        modifier = Modifier
                            .size(20.dp)  // Set a desired size
                            .align(Alignment.CenterVertically),
                        checked = isChecked,
                        onCheckedChange = { isChecked = it }
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Optional spacing for clarity
                    Text(
                        text = "Rent it - completely free!",
                        fontSize = 18.sp
                    )
                }

                Spacer(
                    modifier = Modifier.height(15.dp)
                )

                Button(
                    modifier = Modifier.align(Alignment.CenterHorizontally).width(150.dp),
                    colors = ButtonDefaults.buttonColors(contentColor = primaryText),
                    onClick = {}
                ) {
                    Text("Next", color = primaryBg,  fontSize = 18.sp)
                }
            }
        }
    }
}