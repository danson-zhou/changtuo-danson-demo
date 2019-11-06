## changtuo-danson-demo
### core-ng getting started
* gradle
    * task,configure,dependency
* specification
    * URL AJAX 特定英文缩写词全大写
    * 数据库表名用复数，部分不可数名词也会加s,flyway文件名用执行动作命名,各单词下划线隔开,全小写
    * 配置文件命名，sys.properties
* app/module
    * modulecontext
    * actionlog
    * LogManage
### core-ng api
* interface
    * 只有站点（back-office、front-end/xxx-site)提供给外部访问，其他模块提供接口给这些模块使用。
    * controller和webservice使用场景，controller主要应用于需要访问页面的情况，webservice主要应用于数据传输
* restful/http status code
    * 1xx--5xx response状态码标识
    * restful风格 crud对应的请求方式
* WebService/BOWebService/AjaxWebService
    * URL命名规范
    * 各模块各包的作用
    * 在back-office模块中定义Request、webservice时可以省略bo前缀（因为已经能从模块名中反映）
### core-ng db
* domain
    * 表名复数
    * domain类中enum类可以存储成varchar类型
    * mongo id一般设置成String类型
* crud
    * Repository<> MongoCollection<> Query Database
    * mysql事务 Transaction
    * 自定义sql
* mysql/mongodb
    * 区别、应用场景
### core-ng async
* executor
    * 延时任务、正常任务
* scheduler
    * 固定频率、自定义触发器、年月日任务、时区设置
* kafka
    * kafkauri、message、publish、subscribe、messageHandler
### core-ng debug
* logprocessor/logcollector
    * logcollector日志收集，发送到kafka，logprocessor日志处理日志数据解析，存储到elasticsearch数据库；
* elasticsearch/kibana
    * kibana查看日志，日志分析
* junit5
    * mock调用本地api
### core-ng cd
* git
    * rebase merge
* mysql flyway db migration
    * sql脚本的编写
    * V模式、R模式;v模式脚本只执行一次，R模式脚本可重复执行，v模式脚本先于R模式脚本运行；
* mongo migration
    * 创建索引（升序、降序），联合索引
