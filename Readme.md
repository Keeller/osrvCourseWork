Порядок запуска окружения (чтобы не забыть)
Выполнить для публичного и приватного блокчейна
1. Создать аккаунт под пуюличные приватные блокчеины в volumes
   geth account new --datadir .\pub\
2. Создать генезис блоки geth --datadir .\pub\ init ..\genesis.json
3. поднять докера коммандами
   docker run -p 8545:8545 -p 30303:30303 -v C:\Users\kolya\volumes\pub:/eth/ ethereum/client-go --networkid 20 --port 30303 --http --http.port 8545 --http.addr 0.0.0.0 --http.corsdomain * --nodiscover --http.api admin,db,eth,net,web3,personal,miner,debug --ipcdisable --rpc.allow-unprotected-txs   --datadir /eth --password 1234567890 --mine
4. подсосатья geth attach <url> к блокчейнам и запустить майнинг
5. записать кей файл в ямл и прописать там остальные настройки