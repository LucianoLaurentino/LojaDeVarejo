import java.time.LocalDateTime

class Fornecedor {
    var nomeFantasia: String? = null
        get() = if (field.isNullOrEmpty()) "Nome fantasia não foi informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var telefoneComercial: String? = null
        get() = if (field.isNullOrEmpty()) "Telefone comercial não foi informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var razaoSocial: String? = null
        get() = if (field.isNullOrEmpty()) "Razão social não foi informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var endereco: String? = null
        get() = if (field.isNullOrEmpty()) "Endereço não foi informado" else field
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
            field = if (value != null) null else value
        }

    constructor(
        nomeFantasia: String,
        telefoneComercial: String,
        razaoSocial: String,
        endereco: String,
        produto: Produto
    ) {
        this.nomeFantasia = nomeFantasia
        this.telefoneComercial = telefoneComercial
        this.razaoSocial = razaoSocial
        this.endereco = endereco
        this.produto = produto
    }

    override fun toString(): String {
        return "fornecedor: $nomeFantasia\nTelefone comercial: $telefoneComercial\nRazão social: $razaoSocial\nEndereço: $endereco\nProduto $produto"
    }
}