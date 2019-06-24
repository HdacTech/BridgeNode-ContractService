Bridge Node Contract Service
======================

### License

Hdac private platform is licensed under the [MIT License](http://opensource.org/licenses/MIT).

Copyright (c) 2018-2019 Hdac Technology AG


### Execution environment 

Contract service module is a JAVA application operated periodically through CRONTAB.  
CRONTAB operate [main java files](com/hdac/main/) including contractLib-0.0.1.jar

About docker image
>- Centos
>- Crontab


### Related docker image 

You can download docker image in [Bridgenode docker hub](https://hub.docker.com/r/hdac/bridgenode).
>1. contract_v09 (docker-compose: [contract-docker-compose](docker/docker-compose/contract))
>2. nfsserver_v09 (docker-compose: [nfsserver-docker-compose](docker/docker-compose/nfsserver))


### How to update docker image

This package is only about execution Environment of contractLib.
All library files are managed by nfsserver, copy the contractLib jar file to the nfsserver docker container.  
>- $ docker cp ContractLib-0.0.1.jar nfsserver:/opt/shareUtil/lib (After running nfsserver container)


### How to operate service

>1. Operate nfsserver docker container
>2. Operate contract docker container
>3. Checking share library inside contract container  
>- $ docker exec -it contract bash  
>- $ cd /opt/contract/shareLib  
>4. configure database config file and CRONTAB shedule (contract/com/hdac/config, crontab -e)
>5. After configuration, start crontab serivce  
>- $ systemctl start crond


_A detailed description of the docker setting and operation can be found here [Bridgenode docker hub](https://hub.docker.com/r/hdac/bridgenode)._






