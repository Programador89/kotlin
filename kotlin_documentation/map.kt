fun main() {
    /*
    *   MAPA:
    *       Os mapas armazenam itens como pares chave-valor. Você acessa o valor fazendo referência à chave. Você pode
    *       imaginar um mapa como um menu de comida. Você pode encontrar o preço (valor), encontrando o alimento (chave)
    *       que você quer comer. Os mapas são úteis se você quiser procurar um valor sem usar um índice numerado,
    *       como em uma lista.
    * */

    val detalhes_novo_testamento: Map <String, Int> = mapOf("Mateus" to 28, "Marcos" to 16, "Joao" to 28)

    val indice_habitacional: MutableMap<String, Int> = mutableMapOf("Brasil" to 218, "Noruega" to 5, "Canada" to 39);

    indice_habitacional.put("Argentina", 20)

    println("Indice habitacional: \nPaís:Brasil \nPopulação: ${indice_habitacional["Brasil"]} milhões de habitantes.")

    // Para verificar se uma chave ja esta no mapa use a funcao containsKey()
    println(indice_habitacional.containsKey("Argentina"))

}

