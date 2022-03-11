# *PFS-UC11-ER1-DesenhodeTeste*

Relatório Resumo de Teste
Senai SP –
Campo de Busca



# Objetivo
Este documento tem por objetivo apresentar o relatório dos casos de testes aplicados sobre a plataforma do Senai SP de informática. Para melhor entendimento dos 
resultados e para mais informações com relação ao planejamento ou o passo a passo dos testes, procurar os documentos “Plano de Teste AO1” e “Casos de Teste AO1”.


# Responsáveis
    Os responsáveis pela execução, elaboração e publicação deste documento será a equipe:

Representante: 	Igor dos Santos Nunes;

Descrição:	Responsável pelo planejamento, execução e avaliação do teste;

Tipo de Formação:	Graduando em Engenharia da Computação e Programador Full-Stack;

Responsabilidade:	Testar a funcionalidade do componente escolhido, além de garantir integridade do teste, deste documento e dos outros relatórios advindos do projeto.



# Resultados
Inicialmente, é importante verificar que até o momento que os documentos “Plano de teste”, o “Caso de Teste” e este relatório, a pesquisa do Termo “excel” 
retorna 2 possibilidades de cursos enquanto que a pesquisa de “jornalismo”, retorna nenhuma.

Caso “Pesquisa por ‘Excel’”: 

Após o primeiro caso de teste, foi constatado que, independentemente da forma como foi pesquisado o termo “Excel” (letras maiúsculas, minúsculas ou misturado), 
o resultado da pesquisa retorna 2 cursos relacionados ao tema (como mencionado anteriormente), contudo, a mensagem de zero cursos encontrados é apresentada em 
uma tag < p > que tem a classe “lead”, indicando um erro neste elemento.

Caso “Pesquisa por ‘Jornalismo’”:
  
Neste caso, a pesquisa não retorna algum curso e a mensagem de zero cursos encontrados é apresentada na tag < p > que tem a classe “lead”. Apesar desse caso 
seguir como o esperado, não há como ter certeza de que esse elemento da página tenha apresentado o valor correto ou se apenas apresenta sempre o resultado 0. Com isso, 
futuros testes podem vir a ser necessários.


# Conclusão
Por fim, é recomendado que a equipe de front-end responsável pelo desenvolvimento do site verifique a codificação do elemento citado (< p > com a classe “lead”) 
para correção de sua funcionalidade. Após essa verificação, novos testes deverão ser realizados para averiguação da funcionalidade do campo de pesquisa. A partir 
de futuros testes, novas recomendações podem ser feitas.

