MAIN ?= Java_20

all: bin 
	@echo "Caso 1"
	@java -cp bin/ ${MAIN} < Casos/1/entrada.txt | tee tmp.txt
	@-VAR=$$(diff -i -b -B -w "Casos/1/saida/saida.txt" "tmp.txt"); \
		if [[ -n "$${VAR}" ]]; then \
			echo "Há diferença entre os arquivos:";\
			echo "$${VAR}"; \
		else \
			echo "Não há diferença entre os arquivos";\
		fi
	@echo "Caso 2"
	@java -cp bin/ ${MAIN} < Casos/2/entrada.txt | tee tmp.txt
	@-VAR=$$(diff -i -b -B -w "Casos/2/saida/saida.txt" "tmp.txt"); \
		if [[ -n "$${VAR}" ]]; then \
			echo "Há diferença entre os arquivos:";\
			echo "$${VAR}"; \
		else \
			echo "Não há diferença entre os arquivos";\
		fi
	@rm tmp.txt

bin: 
	javac src/${MAIN} -d bin/ 

