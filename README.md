# java-spring-web-upload-server
uploadをserveするアプリ

bintrayみたいな感じで使う

- http://192.168.1.109:8080/

- http://localhost:8080/

ポータブルな単一実行可能なjarファイルの作成

引数に格納ディレクトリを与えて実行できるようにしたい

ディレクトリの階層にかかわらず、ダウンロードできるようにしたい

今は最大深度1まで

```
pom.xmlファイルが存在するディレクトリに移動
$ cd /home/aine/java-spring-web-upload-server

ライフサイクルのパッケージをダブルクリックでも作成可能
$ ./mvnw package

実行ディレクトリにコピー
$ cp /home/aine/java-spring-web-upload-server/nnn/target/nnn-0.0.1-SNAPSHOT.jar /home/aine/

実行ディレクトリに移動
$ cd /home/aine

実行
$ java -jar nnn-0.0.1-SNAPSHOT.jar
```
