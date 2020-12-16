1) Não havera erro de compilação pois o Java inicia a variaveis
com valor padrão, no caso de int 0.

2) Erro pois a classe hotel não pede nenhum parametro (não tem contrutor).

3) A saída é 0, pois a saida da função teste usa o this para fazer terefencia 
ao "a" do objeto teste, não o a passado como paramentro para a função Teste.

4) O valor utilizado trabalha apenas com o parametro passado, não modificando o atributo da classe. 
Para alterar o valor da classe e acumular com o valor passado como parametro  seria "this.valor += valor".

5) O construtor está sem argumentos. Em vez de tentar alterar o atributo diretamente, passar o 2 como paramentro 
no contrutor da classe radio. "Radio r = new Radio(10);".

6) 
	a) As dois prints são de 90 pois c1 e c2 apontam para o mesmo objeto.
	b) Um processo de otimização de memória do Java apaga o objeto  da memória para livera-lá.

