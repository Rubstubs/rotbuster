[![Build with Maven](https://github.com/Rubstubs/rotbuster/actions/workflows/maven.yml/badge.svg)](https://github.com/Rubstubs/rotbuster/actions/workflows/maven.yml)

# ROTBUSTER

Command-line tool for encoding or decoding ROT-ciphers

### Setup
1. Clone this repository
``` 
git clone https://github.com/Rubstubs/rotbuster.git
```
2. Package with maven from project root
```
mvn package
```
3. Runnable jar will appear inside /target/

### Usage

    [MODE] [ROT FORMAT] [TEXT]


### Functions

	[MODE]              dec / enc / help
                        
                        dec:    Decrypt
                        enc:    Encrypt
                        help:   Help screen

	[ROT FORMAT]        1-25 / all

                        1-25:   Number representing ROT format
                        all:    Show all possible decryptions (only for dec mode)

	[TEXT]	            "text" (no spaces or special characters outside english alphabet)

Example
    
    java -jar .\target\rotbuster-1.0-SNAPSHOT.jar enc 13 helloworld

### Additional Notes
* Only supporting english for now