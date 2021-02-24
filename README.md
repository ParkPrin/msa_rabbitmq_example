# msa_rabbitmq_example


## Rabbitmq의 Docker 컨테이너 생성하기
$ docker run -d -p 5672:5672 -p 15672:15672 --name my-rabbit rabbitmq:3-management

```
user: guest
password: guest
```
## gradle build
$ ./gradlew build

## 터미널 추가

## Rabbitmq로 메세지 보내기
$ cd sender/build/libs
$ java -jar sender-1.0-SNAPHOT.jar

## Rabbitmq에서 메세지 받기
$ cd receiver/build/libs
$ java -jar receiver-1.0-SNAPSHOT.jar