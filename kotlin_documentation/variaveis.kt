fun main(){
    // variavel de leitura [RECOMENDADA]
    val married_name: String = "Rafael Dantas Gomes de Araujo Sather";
    val cpf: Long = 13002958727;

    // variaveis mutaveis [use somente quando necessario]
    var status_of_day: String = "Sol com ventos gelados";
    var saldo_conta: Double = -10.00;
    var age: Int = 34;

    if(married_name != " "){
        println("Menu nome é ${married_name}, tenho ${age} anos.");
        println("CPF: ${cpf}.")
        println("Saldo da conta Santander: R$${saldo_conta}")
    }
}