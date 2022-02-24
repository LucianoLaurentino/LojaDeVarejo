import java.time.LocalDateTime

class Venda {
    var vendedor: Vendedor? = null
        get() = if (field == null) Vendedor(
            nome = "lucas",
            salario = "1.400 reais",
            cargaHoraria = "6 horas por dia",
            cpf = "000.000.000-01",
            telefone = "90000-0000",
            endereco = "rua são lucas") else field
        set(value) {
            if (value != null) {
                field = value
            }
        }
    var produto: Produto? = null
        get() = if (field == null) Produto(
            nome = "Suco",
            dataDeValidade = LocalDateTime.of(2022, 10, 23, 10, 50),
            dataDeFabricacao = LocalDateTime.of(2021, 10, 23, 10, 50),
            valorDeVenda = "R$1.19") else field
        set(value) {
            if (value != null) {
                field = value
            }
        }
    var estoque: String? = null
        get() = if (field.isNullOrEmpty()) "Estoque não foi informado" else
            field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var formaDePagamento: String? = null
        get() = if (field.isNullOrEmpty()) "Forma de pagamento não foi informada" else
            field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    public constructor(
        produto: Produto,
        estoque: String,
        vendedor: Vendedor,
        formaDePagamento: String
    ) {
        this.produto = produto
        this.estoque = estoque
        this.vendedor = vendedor
        this.formaDePagamento = formaDePagamento

    }

    override fun toString(): String {
        return "Nome do produto: $produto\nEstoque: $estoque\nVendedor: $vendedor\nForma de pagamento: $formaDePagamento"
    }
}