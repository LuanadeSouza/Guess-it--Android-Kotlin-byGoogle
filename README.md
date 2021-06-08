
# Guess The Word

Éum jogo de charadas para dois jogadores , onde os jogadores colaboram para alcançar a maior pontuação possível.

O primeiro jogador olha para as palavras no aplicativo e representa cada uma por vez, certificando-se de não mostrar a palavra ao segundo jogador.

O segundo jogador tenta adivinhar a palavra.

Arquitetura do aplicativo

<img width="769" alt="Screen Shot 2021-06-08 at 10 18 34" src="https://user-images.githubusercontent.com/49947803/121192115-fb090080-c842-11eb-81fa-6340178b4ce7.png">

O aplicativo agora usa ViewModel objetos, para que os dados do aplicativo sobrevivam às alterações de configuração do dispositivo,
como rotações de tela e alterações na disponibilidade do teclado. 
Também adicionnei observáveis LiveData, para que as visualizações sejam notificadas automaticamente quando os dados observados forem alterados.

<img width="200" alt="device-2021-06-08-160738" src="https://user-images.githubusercontent.com/49947803/121243829-8e0e5e80-c874-11eb-8792-8679df11c324.gif">

<img width="200" alt="Screenshot_1623179596" src="https://user-images.githubusercontent.com/49947803/121243873-9cf51100-c874-11eb-981f-4075d1942804.png">
<img width="200" alt="Screenshot_1623179602" src="https://user-images.githubusercontent.com/49947803/121243877-9e263e00-c874-11eb-84cc-88f168500f5f.png">
<img width="200" alt="Screenshot_1623179605" src="https://user-images.githubusercontent.com/49947803/121243884-9ebed480-c874-11eb-9d00-55fa29e61f88.png">
<img width="200" alt="Screenshot_1623179608" src="https://user-images.githubusercontent.com/49947803/121243887-9f576b00-c874-11eb-98f9-654c487a8971.png">
<img width="200" alt="Screenshot_1623179615" src="https://user-images.githubusercontent.com/49947803/121243889-9f576b00-c874-11eb-8919-0d820b91005e.png">
