@startuml atividade
start
:Abrir o aplicativo;
:Digitar nome de usuário;
:Digitar senha;
: clicar no botão "Entrar";
if (Login bem-sucedido?) then (sim)
:Acessar o sistema;
else (não)
:Exibir mensagem de erro;
endif
stop
@enduml
