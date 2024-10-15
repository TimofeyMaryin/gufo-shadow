package com.gufo.custom.shadow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gufo.custom.gufoshadow.shadow
import com.gufo.custom.shadow.ui.theme.GufoShadowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GufoShadowTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceEvenly
                        ) {

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceEvenly
                            ) {

                                Box(
                                    modifier = Modifier
                                        .shadow(
                                            borderRadius = 35.dp,
                                            blurRadius = 25.dp,
                                        )
                                        .clip(RoundedCornerShape(35.dp))
                                        .size(150.dp)
                                        .background(MaterialTheme.colorScheme.background)
                                )

                                Box(
                                    modifier = Modifier
                                        .shadow(
                                            borderRadius = 35.dp,
                                            blurRadius = 25.dp,
                                        )
                                        .clip(RoundedCornerShape(35.dp))
                                        .size(150.dp)
                                        .background(MaterialTheme.colorScheme.background)
                                )

                            }

                            Box(
                                modifier = Modifier
                                    .shadow(
                                        borderRadius = 35.dp,
                                        blurRadius = 25.dp,
                                        spread = 0.dp,
                                        color = Color.Black.copy(.6f)
                                    )
                                    .clip(RoundedCornerShape(35.dp))
                                    .size(250.dp)
                                    .background(MaterialTheme.colorScheme.primary)

                            )

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceAround
                            ) {
                                Box(
                                    modifier = Modifier
                                        .shadow(borderRadius = 35.dp)
                                        .clip(RoundedCornerShape(35.dp))
                                        .size(130.dp)
                                        .background(MaterialTheme.colorScheme.background)
                                )

                                Box(
                                    modifier = Modifier
                                        .shadow(borderRadius = 35.dp)
                                        .clip(RoundedCornerShape(35.dp))
                                        .size(130.dp)
                                        .background(MaterialTheme.colorScheme.background)
                                )

                                Box(
                                    modifier = Modifier
                                        .shadow(borderRadius = 35.dp)
                                        .clip(RoundedCornerShape(35.dp))
                                        .size(130.dp)
                                        .background(MaterialTheme.colorScheme.background)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

