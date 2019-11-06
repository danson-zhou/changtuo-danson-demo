



# NOTE:

- Java时间类型和==Mysql==数据类型对应关系

| Java          | Mysql     |
| ------------- | --------- |
| LocalDate     | date      |
| LocalDateTime | datetime  |
| ZoneDateTime  | timestamp |

- ==mongodb==服务端常用命令
  - rs.status()        -------- 状态查询命令 
  - rs.initiate()      ---------单机版初始化命令
  
  ### kafka
  
  - 拓扑结构图
  
  ![kafka_structure](C:\Danson\notes\image\kafka_structure.png)
  
  - 消息新增到partition
  
    ![message_append](C:\Danson\notes\image\message_append.png)
  
  - consumer group
  
    ![consumer_group](C:\Danson\notes\image\consumer_group.png)
  
  - 一个topic分成多个partition，消息根据策略分布到不同的partition。通过$KAFKA_HOME/config/server.properties配置topic的partition数量。
  
  - kafka中consumer采用pull模式，即可以单条消费消息，也可以接受到多条消息后一起处理。
  
  - kafka传输保证：  At least once 消息可能会丢失，但绝不会重复传输；未来可能需要exactly once即每条消息肯定会被且传输一次。
  
- flyway

  - mysql db migration
  - sql文件名小写，以执行动作命名；
  - flyway先执行v模式sql，之后执行r模式sql

- 其他
  - gradle
  - es/kibana
  - zookeeper
  - undertow
  - kafka
  - HTTP status code
  - docker/nginx
  
- jdk10

  - var 声明局部变量，避免繁琐
  
- jdk9

  - module模块化系统

# core-ng:

- sys.properties和app.properties
  - sys存放系统环境变量；
  - app存放第三方环境变量
- action的概念
- 服务的拆分：
  - 部分服务用户访问量大，需要更多的资源支持 ；
  - 核心和非核心，如天猫订单服务（核心服务需要稳定运行）、积分游戏服务（非核心稳定性要求不高）；
  - 模块复用（如多个产品可以共用用户信息服务，多个模块可以共享用户信息）；
- 日志（类似于ELK）
  - 日志收集没有采用logstash,主要是系统部署方式不适合；
  - logcollector将日志发送到kafka队列，logprocessor解析日志并按格式存储到es服务器；
  - kibana负责日志信息的展示
 - controller和webservice区别
   - controller：当url有页面跳转时尽量用controller，仅有数据请求时尽量用webservice
