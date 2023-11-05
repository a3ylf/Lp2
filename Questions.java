public record Questions(String difficulty, String answer, String question) {
    public static Questions[] easyQuestions = new Questions[10];
    public static Questions[] hardQuestions = new Questions[10];
    public static Questions[] mediumQuestions = new Questions[10];


    static {
        easyQuestions[0] = new Questions("Fácil",
            "a",
            "O que é uma thread em Java?\n" +
            "a) Um fluxo de execução independente que pode ser usado para realizar tarefas simultaneamente.\n" +
            "b) Um tipo de classe abstrata em Java.\n" +
            "c) Um método de controle de fluxo de execução em um programa Java.\n" +
            "d) Um tipo de café especial consumido por programadores altamente produtivos.");

        
        easyQuestions[1] = new Questions("Fácil",
            "a",
            "Qual método é usado para iniciar uma thread em Java?\n" +
            "a) start()\n" +
            "b) run()\n" +
            "c) execute()\n" +
            "d) jogue uma moeda para decidir se a Thread deve ser iniciada ou não.");

        
        mediumQuestions[0] = new Questions("Médio",
            "b",
            "Qual é o propósito do método join() em Java quando chamado em uma thread?\n" +
            "a) O método join() pausa a thread atual indefinidamente até que outra thread seja encerrada.\n" +
            "b) Ele faz com que a thread atual aguarde até que a outra thread termine sua execução.\n" +
            "c) O método join() força a thread atual a esperar por um tempo específico antes de continuar a execução.\n" +
            "d) Ele encerra a thread atual e se conecta a outra thread para formar uma nova thread combinada.");

        
        mediumQuestions[1] = new Questions("Médio",
            "a",
            "Como você pode definir a prioridade de uma thread em Java?\n" +
            "a) Usando o método setPriority() da classe Thread.\n" +
            "b) A prioridade de uma thread é determinada automaticamente pelo sistema operacional.\n" +
            "c) A prioridade de uma thread não pode ser alterada em tempo de execução.\n" +
            "d) A prioridade é definida apenas no momento da criação e não pode ser modificada.");

        
        hardQuestions[0] = new Questions("Difícil",
            "c",
            "Qual é o ciclo de vida típico de uma thread em Java?\n" +
            "a) Novo, Pronto, Em execução, Encerrado.\n" +
            "b) Inicializada, Em execução, Aguardando, Concluída.\n" +
            "c) Novo, Pronto, Em execução, Bloqueado, Encerrado.\n" +
            "d) Criada, Esperando, Em execução, Pausada, Finalizada.");

        
        hardQuestions[1] = new Questions("Difícil",
            "b",
            "O que é um 'pool de threads' em Java?\n" +
            "a) Um agrupamento de threads de alta prioridade.\n" +
            "b) Um mecanismo para limitar o número de threads em execução simultaneamente.\n" +
            "c) Uma coleção de threads compartilhadas entre várias classes.\n" +
            "d) Uma pilha de threads.");

        easyQuestions[2] = new Questions("Fácil",
            "a",
            "Qual classe Java é usada para criar um socket cliente em Java?\n" +
            "a) Socket\n" +
            "b) ClientSocket\n" +
            "c) ServerSocket\n" +
            "d) DatagramSocket");
        
        easyQuestions[3] = new Questions("Fácil",
            "c",
            "Qual protocolo de transporte é comumente usado com sockets em Java para comunicação confiável e orientada à conexão?\n" +
            "a) UDP\n" +
            "b) HTTP\n" +
            "c) TCP\n" +
            "d) FTP");
        
        mediumQuestions[2] = new Questions("Médio",
            "b",
            "O que acontece quando um socket em Java está bloqueado ou em espera?\n" +
            "a) Ele aguarda até que o sistema operacional o destrave automaticamente.\n" +
            "b) Fica bloqueado até que ocorra uma ação que permita sua continuação, como uma conexão bem-sucedida.\n" +
            "c) Ele fecha a conexão imediatamente.\n" +
            "d) Ocorre um erro irrecuperável.");
        
        mediumQuestions[3] = new Questions("Médio",
            "a",
            "O que é um endereço IP loopback em Java e qual é o seu valor padrão?\n" +
            "a) O endereço IP loopback é usado para se comunicar com a própria máquina e seu valor padrão é '127.0.0.1'.\n" +
            "b) O endereço IP loopback é usado para se comunicar com outras máquinas em uma rede local.\n" +
            "c) O valor padrão do endereço IP loopback é '0.0.0.0'.\n" +
            "d) O endereço IP loopback não é suportado em Java.");
        
        hardQuestions[2] = new Questions("Difícil",
            "b",
            "Qual é a diferença entre sockets TCP e UDP em Java em termos de confiabilidade de entrega de dados?\n" +
            "a) Ambos os protocolos oferecem a mesma confiabilidade na entrega de dados.\n" +
            "b) TCP é orientado a conexão e oferece garantia de entrega de dados, enquanto UDP é não orientado a conexão e pode perder pacotes de dados.\n" +
            "c) UDP é mais confiável que TCP na entrega de dados.\n" +
            "d) Ambos os protocolos são igualmente rápidos na entrega de dados.");
        
        hardQuestions[3] = new Questions("Difícil",
            "a",
            "Qual é a principal diferença entre um servidor de soquetes (socket server) e um servidor da web em Java?\n" +
            "a) Um servidor de soquetes é geralmente usado para comunicação de baixo nível, enquanto um servidor da web lida com solicitações HTTP em um nível mais alto.\n" +
            "b) Ambos são idênticos e podem ser usados de forma intercambiável.\n" +
            "c) Um servidor da web é apenas um exemplo de uso de soquetes, e um servidor de soquetes é outro exemplo de uso.\n" +
            "d) Não há diferença significativa entre eles em termos de funcionalidade.");

        easyQuestions[4] = new Questions("Fácil",
            "a",
            "O que é um semáforo em Java?\n" +
            "a) Um mecanismo de sincronização usado para controlar o acesso concorrente a recursos compartilhados.\n" +
            "b) Uma classe abstrata que não tem utilidade prática em Java.\n" +
            "c) Um tipo de variável que só pode ser usada em ambientes de múltiplas threads.\n" +
            "d) Um tipo de sinal luminoso usado para alertar sobre condições de erro no código.");
        
        easyQuestions[5] = new Questions("Fácil",
            "b",
            "Qual é o principal objetivo do uso de monitores em Java?\n" +
            "a) Controlar a execução de um programa Java.\n" +
            "b) Fornecer uma forma de sincronização e exclusão mútua em ambientes de múltiplas threads.\n" +
            "c) Gerenciar as exceções de E/S (Input/Output) em Java.\n" +
            "d) Facilitar a coleta de lixo (garbage collection) em Java.");
        
        mediumQuestions[4] = new Questions("Médio",
            "a",
            "Qual é a diferença entre um semáforo de contagem (counting semaphore) e um semáforo binário (binary semaphore) em Java?\n" +
            "a) Um semáforo de contagem permite um número específico de threads acessar um recurso, enquanto um semáforo binário permite ou impede o acesso de apenas uma thread.\n" +
            "b) Ambos são idênticos e podem ser usados de forma intercambiável.\n" +
            "c) Um semáforo de contagem é usado apenas em sistemas operacionais Windows, enquanto um semáforo binário é usado em sistemas Linux.\n" +
            "d) Um semáforo binário é usado para contar o número de threads em execução.");
        
        mediumQuestions[5] = new Questions("Médio",
            "b",
            "Como um monitor em Java garante a exclusão mútua ao acessar recursos compartilhados?\n" +
            "a) Por meio do uso de threads não sincronizadas.\n" +
            "b) Através da utilização de métodos synchronized para bloquear o acesso concorrente aos recursos.\n" +
            "c) Usando uma fila de espera de threads sem qualquer bloqueio.\n" +
            "d) Pela aplicação de permissões de acesso a recursos compartilhados.");
        
        hardQuestions[4] = new Questions("Difícil",
            "a",
            "O que é deadlock em Java no contexto de semáforos e monitores?\n" +
            "a) Deadlock é uma situação em que duas ou mais threads ficam permanentemente bloqueadas, esperando umas pelas outras para liberar recursos, impedindo assim o progresso do programa.\n" +
            "b) Deadlock ocorre quando uma thread é interrompida abruptamente por uma exceção não tratada.\n" +
            "c) Deadlock é uma situação que ocorre quando um semáforo binário é usado em vez de um semáforo de contagem.\n" +
            "d) Deadlock é uma otimização de desempenho em Java.");
        
        hardQuestions[5] = new Questions("Difícil",
            "b",
            "Qual é o propósito do método wait() e notify() em um monitor em Java?\n" +
            "a) O método wait() é usado para encerrar uma thread, e notify() é usado para iniciar uma nova thread.\n" +
            "b) O método wait() é usado por uma thread para liberar o monitor e entrar em estado de espera, enquanto notify() é usado para acordar uma thread em espera quando um recurso está disponível.\n" +
            "c) Ambos os métodos são usados para encerrar a execução de uma thread.\n" +
            "d) Wait() e notify() são métodos obsoletos e não devem ser usados em Java.");

            //TEMA GERAL

        easyQuestions[6] = new Questions("Fácil",
            "c",
            "Qual é o lema principal da linguagem de programação Java?\n" +
            "a) Escreva uma vez, compile em qualquer lugar.\n" +
            "b) Código simples, resultados incríveis.\n" +
            "c) Escreva uma vez, execute em qualquer lugar.\n" +
            "d) Programação fácil, problemas resolvidos.");

        easyQuestions[7] = new Questions("Fácil",
            "b",
            "Quem é creditado como o criador da linguagem Java?\n" +
            "a) Bill Gates\n" +
            "b) James Gosling\n" +
            "c) Linus Torvalds\n" +
            "d) Larry Page");

        easyQuestions[8] = new Questions("Fácil",
            "a",
            "Qual é o tipo de dados primitivo em Java para números inteiros?\n" +
            "a) int\n" +
            "b) float\n" +
            "c) char\n" +
            "d) boolean");

        easyQuestions[9] = new Questions("Fácil",
            "d",
            "O que é um objeto em Java?\n" +
            "a) Uma variável que armazena apenas números inteiros.\n" +
            "b) Uma função que retorna um valor.\n" +
            "c) Uma estrutura de controle de fluxo.\n" +
            "d) Uma instância de uma classe que pode conter dados e métodos.");

        mediumQuestions[6] = new Questions("Médio",
            "c",
            "O que é a palavra-chave 'this' em Java?\n" +
            "a) Referência para o objeto anterior.\n" +
            "b) Palavra-chave reservada que não tem uso em Java.\n" +
            "c) Referência para o próprio objeto em que o código está sendo executado.\n" +
            "d) Um tipo de dado primitivo.");

        mediumQuestions[7] = new Questions("Médio",
            "a",
            "Qual é a diferença entre '==' e '.equals()' em Java?\n" +
            "a) '==' verifica se duas referências de objeto apontam para o mesmo objeto na memória, enquanto '.equals()' verifica se o conteúdo dos objetos é igual.\n" +
            "b) Ambos são usados para comparar valores de variáveis primitivas.\n" +
            "c) '==' é uma maneira mais eficiente de comparar objetos do que '.equals()'.\n" +
            "d) '.equals()' só pode ser usado para comparar strings em Java.");

        mediumQuestions[8] = new Questions("Médio",
            "b",
            "O que é o Java Virtual Machine (JVM)?\n" +
            "a) Um compilador Java que converte código fonte em código de máquina.\n" +
            "b) Um ambiente de execução que permite que código Java seja executado em qualquer plataforma.\n" +
            "c) Um ambiente de desenvolvimento integrado (IDE) para Java.\n" +
            "d) Um servidor web desenvolvido pela Oracle.");

        mediumQuestions[9] = new Questions("Médio",
            "d",
            "O que é o conceito de polimorfismo em Java?\n" +
            "a) Capacidade de uma classe ter várias interfaces.\n" +
            "b) Capacidade de ocultar a implementação dos métodos.\n" +
            "c) Capacidade de uma classe herdar de várias classes base.\n" +
            "d) Capacidade de um objeto ser referenciado por várias classes base.");

        hardQuestions[6] = new Questions("Difícil",
            "a",
            "O que é a palavra-chave 'final' em Java?\n" +
            "a) 'final' é usada para declarar uma constante, um método que não pode ser sobrescrito ou uma classe que não pode ser estendida.\n" +
            "b) 'final' é usado para forçar a execução de um bloco de código, independentemente de exceções.\n" +
            "c) 'final' é usado para marcar um método como opcional.\n" +
            "d) 'final' é usado para definir um objeto como nulo.");

        hardQuestions[7] = new Questions("Difícil",
            "c",
            "O que é o garbage collection em Java?\n" +
            "a) Um processo de compactação de dados em arrays.\n" +
            "b) Um método para criar novos objetos dinamicamente durante a execução.\n" +
            "c) Um processo automático de gerenciamento de memória que remove objetos não referenciados para liberar espaço de memória.\n" +
            "d) Um mecanismo para criar referências circulares entre objetos.");

        hardQuestions[8] = new Questions("Difícil",
            "b",
            "O que são classes abstratas e interfaces em Java?\n" +
            "a) Classes abstratas são interfaces com métodos implementados.\n" +
            "b) Classes abstratas permitem a definição de métodos sem implementação, enquanto interfaces são coleções de métodos abstratos e constantes.\n" +
            "c) Classes abstratas não podem ter variáveis de instância, enquanto interfaces podem.\n" +
            "d) Classes abstratas são equivalentes a classes finais em Java.");

        hardQuestions[9] = new Questions("Difícil",
            "a",
            "O que é um aninhamento de classes em Java?\n" +
            "a) Aninhamento de classes é a capacidade de definir uma classe dentro de outra classe, permitindo a criação de classes internas e classes externas.\n" +
            "b) Aninhamento de classes refere-se à herança múltipla em Java.\n" +
            "c) Aninhamento de classes é uma técnica para esconder a implementação dos métodos em uma classe.\n" +
            "d) Aninhamento de classes é uma forma de agrupar classes em um pacote.");
        
    }

    public static void main(String[] args) {

    }
}