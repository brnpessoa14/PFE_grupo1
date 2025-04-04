@startuml login
[*] --> AberturaAplicativo
AberturaAplicativo --> DigitarUsuario : Abrir aplicativo
DigitarUsuario --> DigitarSenha : Digitar nome de usuário
DigitarSenha --> ClicarEntrar : Digitar senha
ClicarEntrar --> VerificarLogin : Clicar "Entrar"
VerificarLogin --> LoginBemSucedido : Sucesso
VerificarLogin --> ErroLogin : Falha
ErroLogin --> [*] : Exibir mensagem de erro
LoginBemSucedido --> [*] : Acessar sistema
@enduml
