# bitcoin-paper-wallet

Generate a Bitcoin paper wallet offline, without the need for a browser.

## Usage

`lein run`

The program will print out a private key and a public bitcoin address, and a wallet.png file
that you can send to your printer (hopefully not connected to the internet). 
The paper wallet is unencrypted, so keep it in a safe place.

The wallet will look like this:

 ![wallet](https://raw.github.com/dbasch/bitcoin-paper-wallet/master/wallet.png)
 
You may want to do this on a computer that's never been connected to the internet. For example, you could:

* Boot a live CD/USB of Ubuntu, don't connect it to a network.
* run `lein uberjar` on a trusted computer, copy the jar file to a pen drive and then to the Ubuntu box.
* run `java -jar bitcoin-[version]-SNAPSHOT-standalone.jar` on the Ubuntu box. 
 

## WARNING WARNING WARNING 

Be very careful when using this program. It uses the bitcoinj library for key generation
 so I'm not responsible for any bugs that might generate insecure wallets. Use at your own risk.

Find this useful? Send me a tip at **1EmwBbfgH7BPMoCpcFzyzgAN9Ya7jm8L1Z** :)

## License

Copyright © 2014 Diego Basch

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
