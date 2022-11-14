# tsd-heroku
GS1 TSD implementation for Research and SMEs

[![Build Status](https://travis-ci.org/oliot-tsd/tsd-heroku.svg?branch=master)](https://travis-ci.org/oliot-tsd/tsd-heroku)
[![Coverage Status](https://coveralls.io/repos/github/oliot-tsd/tsd-heroku/badge.svg?branch=master)](https://coveralls.io/github/oliot-tsd/tsd-heroku?branch=master)

Prerequisits
-----------------
JAVA 1.8  
docker  
docker-compose  
heroku cli  

Deploying
-----------------
```
# Start DB
sudo docker-compose up -d

# Build tsd-heroku
./mvnw -DskipTests clean dependency:list install

# Run on local heroku cli
heroku local web -e .env -p 8080
```

License
-----------------
```text
Copyright 2017 Open Language for Internet of Things (Oliot)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
