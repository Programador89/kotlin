fun main(){
    // Declarando tipos basicos
    val name: String = "Rafael Dantas";
    var age: Int = 34
    var saldo_banco: Double = -10.00
    val sexo: Char = 'm';

    val person = listOf(name, age, saldo_banco, sexo.uppercaseChar());

    if(person.last() == 'M'){
        println("Nome:${person.first()}\nIdade: ${person[1]}\nSaldo bancario: R$${person[2]}");
    }else {
        print("Dados invalidos!")
    }

}