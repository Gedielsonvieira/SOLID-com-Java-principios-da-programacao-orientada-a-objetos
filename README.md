# SOLID com Java: princípios da programação orientada a objetos

* **S**ingle Responsability Principle **(Princípio - responsabilidade única)**
  > O foco deste princípio é justamente em coesão.<br>
  **Definição**: Uma classe (ou módulo, função, etc) deve ter um e apenas um motivo para mudar
* **O**pen Closed Principle **(Princípio - aberto e fechado)**
  > Um sistema deve ser aberto para a extensão, mas fechado para a modificação.<br>
  > Isso significa que devemos poder criar novas funcionalidades e estender o sistema sem precisar modificar muitas
  classes já existentes
* **L**iskov Substitution Principle **(Princípio - substituição de Liskov)**
  > Diz que devemos poder substituir classes base por suas classes derivadas(filhas) em qualquer lugar, sem problema.
* **I**nterface Segregation Principle **(Princípio - segregação de interface)**
* **D**ependency Inversion Principle **(Princípio - inversão de dependência)**

> Esses princípios visam justamente simplificar o processo de manutenção do código e
> Cada um desses princípios formam o SOLID, que são princípios focados em boas práticas de programação e de orientação a
> objetos.

## Princípios de Orientação a objetos

> Os princípios do SOLID estão diretamente ligados com esses princípios da orientação a objetos. Então quando aplicamos
> os princípios do SOLID, vamos acabar aplicando também esses princípios da orientação a objetos, favorecendo uma
> melhor orientação a objetos no nosso código.

### Coesão (união harmônica seria as coisas que tem dentro de uma classe - devem tratar da mesma coisa)

> Cada classe deve ser responsável por apenas uma coisa, e deve executar esta tarefa muito bem

### Encapsulamento (Proteger/blindar uma classe contra manipulações externas)

> Encapsulamento não é só pegar a classe, colocar os atributos como o "private", para deixar como privado e
> colocar os métodos "getters" e "setters", encapsulamento também diz a respeito a não violação da regra de negócio
> do projeto

* Getters e setters por si só não fornecem nenhum tipo de encapsulamento. **(O fato de criar getters e setters para
  tudo, na verdade, quebra o encapsulamento da nossa classe.)**

* Encapsulamento ajuda no uso correto dos objetos.

* É interessante fornecer acesso apenas ao que é necessário em nossas classes

* O encapsulamento torna o uso das nossas classes mais fácil e intuitivo

### Acoplamento

> A ideia de acoplamento é quando temos dois componentes que estão interligados entre si causando uma
> dependência entre eles. Por exemplo, quando temos uma classe que faz a utilização de uma outra classe.
> Uma classe A que chama uma classe B.

* **Classes muito acopladas, devido a não ter um bom encapsulamento, causam fragilidade no código da aplicação, o
  que dificulta sua manutenção.**

## Melhorando a coesão

> Este tópico nos ensina sobre - **Single Responsability Principle**

<i> Foi extraido a lógica de uma função da classe Funcionario para a classe ReajusteService assim
 melhorando a coesão e estando dentro do princípio SRP.</i>

* **O que é uma refatoração?**
  É uma alteração no código que visa melhorar sua clareza e entendimento.
  Refatorações servem para melhorar o design do código, e não o funcionamento do sistema. Uma
  refatoração não deve influenciar em nada no funcionamento.

## Reduzindo o acomplamento

> Este tópico nos ensina sobre - **Open Closed Principle**

- Cada classe deve conhecer e ser responsável por suas próprias regras de negócio;

- Uma classe que tende a crescer "para sempre" é uma forte candidata a sofrer alguma espécie de refatoração.

- **Como adicionar um novo comportamento sem alterar o código fonte já existente?**

    - O Uncle Bob resumiu a solução em uma frase:
      **"Separe o comportamento extensível por trás de uma interface e inverta as dependências".**
      > O que devemos fazer é concentrar nos aspectos essências do contexto, abstraindo-os para uma interface, Exemplo:
      Interface ValidacaoReajuste que nos dá a abstração das validações. Se as
      abstrações são bem definidas, logo o software estará aberto para extensão.

## Herança indesejada

> Este tópico nos ensina sobre - **Liskov Substitution Principle**

Herança nos permite ter um reaproveitamento de código porém as vezes podemos estar gerando algum efeito colateral,
**devemos pensar tudo o que está na classe pai faz sentido na classe filha?** - **Se não fizer sentido, devemos utilizar
a composição**

## ! Importante

<i>Nem sempre será possível seguir a risca todos os padrões e princípios em um projeto, sendo que em alguns casos
podemos
abrir mão de algum deles em prol de outros benefícios. Devemos então sempre analisar os pontos positivos e negativos de
cada decisão em um projeto.</i>