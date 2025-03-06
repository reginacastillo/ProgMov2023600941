class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { UIPrincipal() }
    }
}

@Composable
fun UIPrincipal() {
    val contexto= LocalContext.current
    var nombre by rememberSaveable { mutableStateOf("") }
    Column(modifier=Modifier
        .fillMaxWidth()
        .offset(y=30.dp)
        .padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
    Text(text="Nombre:")
    OutlinedTextField(
        modifier=Modifier
            .fillMaxWidth(),
        value = nombre,
        onValueChange = {nombre=it},
        label = {Text("Introduce tu nombre") }
    )

    Button(
        onClick ={ Toast.makeText(contexto, "Hola $nombre !!", Toast.LENGTH_SHORT).show() })
    {
    Text ("Saludar!")
     }
    }
}

@Preview(showBackground = true)
@Composable
fun Previsualizacion() {
    UIPrincipal()
}
