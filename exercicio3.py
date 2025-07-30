# exercicio3.py
def soma_harmonica(n):
	if n == 1:
		return 1.0
	else:
		return 1 / n + soma_harmonica(n - 1)

N = int(input("Digite o valor de N: "))
soma = soma_harmonica(N)
print(f"Soma: {soma}")