import java.time.LocalDateTime

class Transportadora {
    var nomeFantasia: String? = null
        get() = if (field.isNullOrEmpty()) "Nome não foi informado" else
            field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
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
    var endereco: String? = null
        get() = if (field.isNullOrEmpty()) "Endereço não foi informado" else
            field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var dataDeEntrega: LocalDateTime? = null
        set(value) {
            if (value == null) {
                field = LocalDateTime.now()
            } else {
                field = value
            }
        }
    var razaoSocial: String? = null
        get() = if (field.isNullOrEmpty()) "Razão social não foi informado" else
            field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var telefoneComercial: String? = null
        get() = if (field.isNullOrEmpty()) "Telefone comercial não foi informado" else
            field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var tempoEntrega: String? = null
        get() = if (field.isNullOrEmpty()) "Tempo De Entrega não foi informado" else
            field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    constructor(
        nomeFantasia: String,
        dataDeEntrega: LocalDateTime,
        telefoneComercial: String,
        tempoEntrega: String,
        produto: Produto,
        razaoSocial: String,
        endereco: String
    ) {
        this.nomeFantasia = nomeFantasia
        this.dataDeEntrega = dataDeEntrega
        this.telefoneComercial = telefoneComercial
        this.tempoEntrega = tempoEntrega
        this.produto = produto
        this.razaoSocial = razaoSocial
        this.endereco = endereco
    } override fun toString(): String {
        return "Nome fantasia: $nomeFantasia\nData de entrega: $dataDeEntrega\nTelefone comercial: $telefoneComercial\nTempo de entrega: $tempoEntrega\nProduto: $produto\nRazão social: $razaoSocial\nEndereço: $endereco"
    }
}