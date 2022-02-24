class Vendedor {
    var nome: String? = null
        get() = if (field.isNullOrEmpty()) "Nome do vendedor não foi informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var salario: String? = null
        get() = if (field.isNullOrEmpty()) "Salario não foi informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var cargaHoraria: String? = null
        get() = if (field.isNullOrEmpty()) "Carga horaria não foi informada" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var cpf: String? = null
        get() = if (field.isNullOrEmpty()) "CPF não foi informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var telefone: String? = null
        get() = if (field.isNullOrEmpty()) "Telefone não foi informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var endereco: String? = null
        get() = if (field.isNullOrEmpty()) "Endereço não foi informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    public constructor(
        nome: String,
        salario: String,
        cargaHoraria: String,
        cpf: String,
        telefone: String,
        endereco: String
    ) {
        this.nome = nome
        this.salario = salario
        this.cargaHoraria = cargaHoraria
        this.cpf = cpf
        this.telefone = telefone
        this.endereco = endereco
    }

    override fun toString(): String {
        return "Nome do vendedor: $nome\nCargaHoraria: $cargaHoraria\nSalario: $salario\nTelefone: $telefone\nEndereço: $endereco."
    }
}
