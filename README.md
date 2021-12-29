[![Build with Maven](https://github.com/Rubstubs/rotbuster/actions/workflows/maven.yml/badge.svg)](https://github.com/Rubstubs/rotbuster/actions/workflows/maven.yml)

# Rubens RotBuster

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

    [ENCODE OR DECODE] [ROT FORMAT] [LANGUAGE] [TEXT]

	
Example
    
    java -jar .\target\rotbuster-1.0-SNAPSHOT.jar -enc 13 -eng "helloworld"


### Functions

        -h, -help                       help screen

	[EN-/DECODE]			-enc/enc (encode) or -dec/dec (decode)

	[ROT FORMAT]			number representing ROT format, or -all/all(Only for decode-mode)

	[LANGUAGE]			-nor/nor or -eng/eng

	[PLAINTEXT]/[CIPHERTEXT]	"text" (no spaces or special characters)


### Additional Notes
* Currently supporting norwegian and english languages only