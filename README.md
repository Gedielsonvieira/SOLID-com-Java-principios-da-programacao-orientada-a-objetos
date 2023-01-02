# SOLID com Java: princípios da programação orientada a objetos

* **S**ingle Responsability Principle **(Princípio - responsabilidade única)**
* **O**pen Closed Principle **(Princípio - aberto e fechado)**
* **L**iskov Substitution Principle **(Princípio - substituição de Liskov)**
* **I**nterface Segregation Principle **(Princípio - segregação de interface)**
* **D**ependency Inversion Principle **(Princípio - inversão de dependência)**

> Esses princípios visam justamente simplificar o processo de manutenção do código e
> Cada um desses princípios formam o SOLID, que são princípios focados em boas práticas de programação e de orientação a
> objetos.

## Princípios de Orientação a objetos

> Os princípios do SOLID estão diretamente ligados com esses princípios da orientação a objetos. Então quando aplicamos
> os princípios do SOLID, vamos acabar aplicando também esses princípios da orientação a objetos, favorecendo uma
> melhor orientação a objetos no nosso código.

- Coesão **(união harmônica seria as coisas que tem dentro de uma classe - devem tratar da mesma coisa)**
    - > Cada classe deve ser responsável por apenas uma coisa, e deve executar esta tarefa muito bem

- Encapsulamento **(Proteger/blindar uma classe contra manipulações externas)**
    - Getters e setters por si só não fornecem nenhum tipo de encapsulamento. **(O fato de criar getters e setters para
      tudo, na verdade, quebra o encapsulamento da nossa classe.)**
    - Encapsulamento ajuda no uso correto dos objetos.
    - > Encapsulamento não é só pegar a classe, colocar os atributos como o "private", para deixar como privado e
      colocar os métodos "getters" e "setters", encapsulamento também diz a respeito a não violação da regra de negócio
      do projeto

- Acoplamento