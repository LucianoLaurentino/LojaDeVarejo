class Cliente {
    var nome: String? = null
        get() = if (field.isNullOrEmpty()) "Nome não foi informado" else
            field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var cpf: String? = null
        get() = if (field.isNullOrEmpty()) "CPF não foi informado" else
            field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var telefone: String? = null
        get() = if (field.isNullOrEmpty()) "Telefone não foi informado" else
            field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var endereco: String? = null
        get() = if (field.isNullOrEmpty()) "endereço não foi informado" else
            field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var email: String? = null
        get() = if (field.isNullOrEmpty()) "Email não foi informado" else
            field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    constructor(
        nome: String,
        cpf: String,
        telefone: String,
        endereco: String,
        email: String
    ) {
        this.nome = nome
        this.cpf = cpf
        this.telefone = telefone
        this.endereco = endereco
        this.email = email
    }

    override fun toString(): String {
        return "Nome do cliete: $nome\nCPF: $cpf\nTelefone: $telefone\nEndereço: $endereco\nEmail: $email "
    }
}
