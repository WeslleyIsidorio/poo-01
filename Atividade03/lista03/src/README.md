1) N�o havera erro de compila��o pois o Java inicia a variaveis
com valor padr�o, no caso de int 0.

2) Erro pois a classe hotel n�o pede nenhum parametro (n�o tem contrutor).

3) A sa�da � 0, pois a saida da fun��o teste usa o this para fazer terefencia 
ao "a" do objeto teste, n�o o a passado como paramentro para a fun��o Teste.

4) O valor utilizado trabalha apenas com o parametro passado, n�o modificando o atributo da classe. 
Para alterar o valor da classe e acumular com o valor passado como parametro  seria "this.valor += valor".

5) O construtor est� sem argumentos. Em vez de tentar alterar o atributo diretamente, passar o 2 como paramentro 
no contrutor da classe radio. "Radio r = new Radio(10);".

6) 
	a) As dois prints s�o de 90 pois c1 e c2 apontam para o mesmo objeto.
	b) Um processo de otimiza��o de mem�ria do Java apaga o objeto  da mem�ria para livera-l�.

