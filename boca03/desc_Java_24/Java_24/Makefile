MAIN ?= Java_24

all: bin 
	@echo "Caso 01"
	@java -cp bin/ ${MAIN} < Casos/01/entrada.txt | tee tmp.txt
	@-VAR=$$(diff -i -b -B -w "Casos/01/saida/saida.txt" "tmp.txt"); \
		if [[ -n "$${VAR}" ]]; then \
			echo "Há diferença entre os arquivos:";\
			echo "$${VAR}"; \
		else \
			echo "Não há diferença entre os arquivos";\
		fi
	@echo "Caso 02"
	@java -cp bin/ ${MAIN} < Casos/02/entrada.txt | tee tmp.txt
	@-VAR=$$(diff -i -b -B -w "Casos/02/saida/saida.txt" "tmp.txt"); \
		if [[ -n "$${VAR}" ]]; then \
			echo "Há diferença entre os arquivos:";\
			echo "$${VAR}"; \
		else \
			echo "Não há diferença entre os arquivos";\
		fi
	@echo "Caso 03"
	@java -cp bin/ ${MAIN} < Casos/03/entrada.txt | tee tmp.txt
	@-VAR=$$(diff -i -b -B -w "Casos/03/saida/saida.txt" "tmp.txt"); \
		if [[ -n "$${VAR}" ]]; then \
			echo "Há diferença entre os arquivos:";\
			echo "$${VAR}"; \
		else \
			echo "Não há diferença entre os arquivos";\
		fi
	@echo "Caso 04"
	@java -cp bin/ ${MAIN} < Casos/04/entrada.txt | tee tmp.txt
	@-VAR=$$(diff -i -b -B -w "Casos/04/saida/saida.txt" "tmp.txt"); \
		if [[ -n "$${VAR}" ]]; then \
			echo "Há diferença entre os arquivos:";\
			echo "$${VAR}"; \
		else \
			echo "Não há diferença entre os arquivos";\
		fi
	@echo "Caso 05"
	@java -cp bin/ ${MAIN} < Casos/05/entrada.txt | tee tmp.txt
	@-VAR=$$(diff -i -b -B -w "Casos/05/saida/saida.txt" "tmp.txt"); \
		if [[ -n "$${VAR}" ]]; then \
			echo "Há diferença entre os arquivos:";\
			echo "$${VAR}"; \
		else \
			echo "Não há diferença entre os arquivos";\
		fi
	@echo "Caso 06"
	@java -cp bin/ ${MAIN} < Casos/06/entrada.txt | tee tmp.txt
	@-VAR=$$(diff -i -b -B -w "Casos/06/saida/saida.txt" "tmp.txt"); \
		if [[ -n "$${VAR}" ]]; then \
			echo "Há diferença entre os arquivos:";\
			echo "$${VAR}"; \
		else \
			echo "Não há diferença entre os arquivos";\
		fi
	@echo "Caso 07"
	@java -cp bin/ ${MAIN} < Casos/07/entrada.txt | tee tmp.txt
	@-VAR=$$(diff -i -b -B -w "Casos/07/saida/saida.txt" "tmp.txt"); \
		if [[ -n "$${VAR}" ]]; then \
			echo "Há diferença entre os arquivos:";\
			echo "$${VAR}"; \
		else \
			echo "Não há diferença entre os arquivos";\
		fi
	@echo "Caso 08"
	@java -cp bin/ ${MAIN} < Casos/08/entrada.txt | tee tmp.txt
	@-VAR=$$(diff -i -b -B -w "Casos/08/saida/saida.txt" "tmp.txt"); \
		if [[ -n "$${VAR}" ]]; then \
			echo "Há diferença entre os arquivos:";\
			echo "$${VAR}"; \
		else \
			echo "Não há diferença entre os arquivos";\
		fi
	@rm tmp.txt

bin: 
	javac src/${MAIN} -d bin/ 

