
# Guess The Word

Éum jogo de charadas para dois jogadores , onde os jogadores colaboram para alcançar a maior pontuação possível.

O primeiro jogador olha para as palavras no aplicativo e representa cada uma por vez, certificando-se de não mostrar a palavra ao segundo jogador.

O segundo jogador tenta adivinhar a palavra.

Arquitetura do aplicativo

<img width="769" alt="Screen Shot 2021-06-08 at 10 18 34" src="https://user-images.githubusercontent.com/49947803/121192115-fb090080-c842-11eb-81fa-6340178b4ce7.png">

O aplicativo agora usa ViewModel objetos, para que os dados do aplicativo sobrevivam às alterações de configuração do dispositivo,
como rotações de tela e alterações na disponibilidade do teclado. 
Também adicionnei observáveis LiveData, para que as visualizações sejam notificadas automaticamente quando os dados observados forem alterados.




