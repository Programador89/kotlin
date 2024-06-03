
// NÃO ENTENDI ESSA FUNCIONALIDADE - PESQUISAR COMO O SET PODE SER ALTERADO EM MUTABLESETOF()
fun main() {
    // Praticando Colecao SET

    // Set imutavel
    val fruits: Set<String> = setOf("Pera", "Uva", "Banana", "Pera");

    println(fruits) // Nao imprimiu o valor duplicado

    // Set mutavel
    val eat: Set<String> = mutableSetOf("Arroz", "Bife", "Salada", "Aipim");
    println(eat)

    val carros_velhos = mutableSetOf("Corsa", "Palio", "Gol", "Uno");
    println(carros_velhos)

    // CONTANDO O NUMERO DE ITENS DO CONJUNTO:
    println("O conjunto carros velhos possue ${carros_velhos.count()} modelos de carros cadastrados.");

    // verificando o item dentro do conjunto
    val validador = "Corsa" in carros_velhos
    println("Modelo Corsa cadastrado na lista: ${validador}");

    // Adicionando e removendo itens na colicao
    carros_velhos.add("Monza")
    carros_velhos.remove("Uno")
    println("Modelos de carros cadastrados: \n${carros_velhos}");
    
}