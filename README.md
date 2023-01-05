
# POC - Microserviço Envio de Email - Java, Spring, Mensageria, API

Microserviço para envio de email com armazenamento das mensagens no banco de dados e  envio de forma síncrona e assíncrona por meio de mensageria.





## Stack utilizada

**Back-end:** Java


## Utilizado

- Spring WEB
- Spring Data JPA
- Spring for RabbitMQ
- Lombok
- Validation
- Java Mail Sender
- PostgreSQL
- Plataforma CloudAMQP - Broker de Mensageria
- Plataforma Gmail - SMTP para envio do e-mail
- Git & GitHub
- Insomnia ou Postman


## Documentação

Necessário:
- PostgreSQL porta padrão, criar banco de dados sendemail
- Configurar o application.properties de acordo com seus dados (application.properties.model de exemplo)
- Configurar o STMP do Gmail para Apps
- Instância Broker AMQP Cloud

## Uso/Exemplos

```javascript

Uso de forma síncrona:
-Enviar requisição POST no "/sending-email" com o body JSON 
{
    "ownerRef": "Rodolfo",
    "emailFrom": "ro.camarotto@gmail.com",
    "emailTo": "ro.camarotto@gmail.com",
    "subject": "Test Microservice",
    "text": "test by /post synchronous"
}

Uso de forma assíncrona - Mensageria:
-Publicar mensagem na fila ms.email 
{
    "ownerRef": "Rodolfo",
    "emailFrom": "ro.camarotto@gmail.com",
    "emailTo": "ro.camarotto@gmail.com",
    "subject": "Test Microservice - Message Broker",
    "text": "test by Message Broker asynchronous"
}

```


## Referência

- [Habilitar SMTP Gmail Apps](https://support.google.com/accounts/answer/185833)
- [Plataforma CloudAMQP](https://www.cloudamqp.com/)
- [Insomnia - Teste API /post](https://insomnia.rest/download)
- [Postman - Teste API /post](https://www.postman.com/)
- [Michelli Brito](https://www.youtube.com/@MichelliBrito)

