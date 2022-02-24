import java.time.LocalDateTime
class Produto {
    var nome: String? = null
        get() = if (field.isNullOrEmpty()) "Nome não foi informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var dataDeValidade: LocalDateTime? = null
        set(value) {
            if (value == null) {
                field = LocalDateTime.now()
            } else {
                field = value
            }
        }

    var dataDeFabricacao: LocalDateTime? = null
        set(value) {
            if (value == null) {
                field = LocalDateTime.now()
            } else {
                field = value
            }
        }

    var valorDeVenda: String? = null
        get() = if (field.isNullOrEmpty()) "Valor não foi informado" else field
        set(value) {
            field = if (value?.length == 5) value else null

        }

    constructor(
        nome: String,
        dataDeValidade: LocalDateTime,
        dataDeFabricacao: LocalDateTime,
        valorDeVenda: String,
    ) {
        this.nome = nome
        this.dataDeValidade = dataDeValidade
        this.dataDeFabricacao = dataDeFabricacao
        this.valorDeVenda = valorDeVenda
    }

    override fun toString(): String {
        return "Nome: $nome\nData de validade: $dataDeValidade\nData de fabricação: $dataDeFabricacao\nValor de venda: $valorDeVenda"
    }
}