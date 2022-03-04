FROM node:16.13.1

ARG NODE_ENV=production

ENV NODE_ENV $NODE_ENV

WORKDIR /app

COPY package.json .

RUN npm i -g dotenv-cli

RUN if [ "$NODE_ENV" = "development" ]; \
        then npm install; \
        else npm install --only=production; \
        fi

COPY . . 

CMD ["node", "index.js"]
