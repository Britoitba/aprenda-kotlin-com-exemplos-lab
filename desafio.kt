import java.lang.reflect.Array

// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Aluno(var nome: String)

class ConteudoEducacional(var nome: String = "", val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Aluno>()

    fun matricular(aluno: Aluno){
        inscritos.add(aluno)
        println("O aluno ${aluno.nome} foi matriculado com sucesso na formacao $nome, de nivel: $nivel")
        for (conteudo in conteudos){
            println("Conteudos do curso $nome: ${conteudo.nome}")
        }
        println("")

    }
}

fun main() {
    var aluno1 = Aluno("Francisco")
    var aluno2 = Aluno("Felipe")
    var aluno3 = Aluno("Maria")
    var aluno4 = Aluno("Joao")


    var conteudosBackend = mutableListOf<ConteudoEducacional>()
    var conteudosFrontend = mutableListOf<ConteudoEducacional>()
    var conteudosSimples = mutableListOf<ConteudoEducacional>()
    var conteudosComplexa = mutableListOf<ConteudoEducacional>()

    conteudosFrontend.add(ConteudoEducacional("Curso de HTML", 60))
    conteudosFrontend.add(ConteudoEducacional("Curso de Angular",80))
    conteudosFrontend.add(ConteudoEducacional("Curso de CSS",50))

    conteudosBackend.add(ConteudoEducacional("Curso de Java", 60))
    conteudosBackend.add(ConteudoEducacional("Curso de Kotlin",80))
    conteudosBackend.add(ConteudoEducacional("Curso de Spring",50))

    conteudosSimples.add(ConteudoEducacional("Curso Facil 1", 60))
    conteudosSimples.add(ConteudoEducacional("Curso Facil 2",80))
    conteudosSimples.add(ConteudoEducacional("Curso Facil 3",50))

    conteudosComplexa.add(ConteudoEducacional("Curso Dificil 1", 60))
    conteudosComplexa.add(ConteudoEducacional("Curso Dificil 2",80))
    conteudosComplexa.add(ConteudoEducacional("Curso Dificil 3",50))


    Formacao("Backend", conteudosBackend, Nivel.INTERMEDIARIO).matricular(aluno1)
    Formacao("Frontend", conteudosFrontend, Nivel.INTERMEDIARIO).matricular(aluno1)
    Formacao("Backend", conteudosBackend, Nivel.INTERMEDIARIO).matricular(aluno2)
    Formacao("Simples", conteudosSimples, Nivel.BASICO).matricular(aluno3)
    Formacao("Complexa", conteudosComplexa, Nivel.AVANCADO).matricular(aluno4)

}
