const axios = require('axios');

async function getTop10CoinsByMarketCap() {
    let response = await axios.get('https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&order=market_cap_desc&per_page=10&page=1&sparkline=false');
    let data = response.data;
    
    for (let coin of data) {
        console.log(`Coin: ${coin.id}, Market Cap: ${coin.market_cap}`);
    }
}

getTop10CoinsByMarketCap();
