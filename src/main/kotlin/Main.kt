import java.time.LocalDateTime

fun main() {
    val vendedor = Vendedor(
        nome = "Lucas",
        salario = "1.400 reais",
        cargaHoraria = "6 horas por dia",
        cpf = "000.000.000-01",
        telefone = "90000-0000",
        endereco = "Rua são lucas"
    )
    val cliente = Cliente (
        nome = "Bruno",
        cpf = "000.000.000-02",
        telefone = "90000-0001",
        endereco = "Rua São Benedito",
        email = "Bruno.maia@gmail.com"
        )
    val produto = Produto (
        nome = "Suco",
        dataDeValidade = LocalDateTime.of(2022, 10, 23, 10, 50),
        dataDeFabricacao = LocalDateTime.of(2021, 10, 23, 10, 50),
        valorDeVenda = "R$1.19"
    )
    val fornecedor = Fornecedor(
        "Fornece+", "3300-0000","Almeidas LTDA","Av Carlos marcio filho", produto = Produto(nome = "Suco",
            dataDeValidade = LocalDateTime.of(2022, 10, 23, 10, 50),
            dataDeFabricacao = LocalDateTime.of(2021, 10, 23, 10, 50),
            valorDeVenda = "R$1.19")
    )
    val transportadora = Transportadora(
        "transporta+", dataDeEntrega = LocalDateTime.of(2022, 2, 24, 14, 0), "3300-0001", "Todo dia as 18:00 horas", produto = Produto(nome = "Suco", dataDeValidade = LocalDateTime.of(2022, 10, 23, 10, 50), dataDeFabricacao = LocalDateTime.of(2021, 10, 23, 10, 50), valorDeVenda = "R$1.19"), "Almeida LTDA", "Rua Vicente Lucas"
    )
    val venda = Venda(produto = Produto(nome = "Suco", dataDeValidade = LocalDateTime.of(2022, 10, 23, 10, 50), dataDeFabricacao = LocalDateTime.of(2021, 10, 23, 10, 50), valorDeVenda = "R$1.19"), "estoque número 2", Vendedor(nome = "Lucas", salario = "1.400 reais", cargaHoraria = "6 horas por dia", cpf = "000.000.000-01", telefone = "90000-0000", endereco = "Rua são lucas"), "Cartão de crédito")
    println("Vendedor:")
    println(vendedor)
    println("Cliente:")
    println(cliente)
    println("Produto:")
    println(produto)
    println("Fornecedor:")
    println(fornecedor)
    println("Transportadora:")
    println(transportadora)
    println("Venda:")
    println(venda)
}
