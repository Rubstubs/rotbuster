# rotbuster
Command-line tool for encoding or decoding ROT-ciphers

----------------
RUBENS ROTBUSTER
----------------

USAGE:

	[ENCODE OR DECODE] [ROT FORMAT] [LANGUAGE] [TEXT]
	
	
FUNCTIONS:

	-h, -help			help screen

	[EN-/DECODE]			-enc/enc (encode) or -dec/dec (decode)

	[ROT FORMAT]			number representing ROT format, or -all/all(Only for decode-mode)

	[LANGUAGE]			-nor/nor or -eng/eng

	[PLAINTEXT]/[CIPHERTEXT]	"text" (no spaces or special characters)
	
	
Example: rotbuster -enc 13 -eng "helloworld"
