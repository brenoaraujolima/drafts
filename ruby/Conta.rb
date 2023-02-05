class Conta
    def initialize(numero, titular)
        @numero = numero
        @titular = titular
    end

    def numero
        @numero
    end

    def titular
        @titular
    end

    def numero=(valor)
        @numero = valor
    end

    def titular=(valor)
        @titular = valor
    end

end

minhaConta = Conta.new 80, "Zezim"

puts minhaConta.numero
puts minhaConta.titular

minhaConta.numero = 90
minhaConta.titular = "Breno"

puts minhaConta.numero
puts minhaConta.titular

# Blocks

def myBlock
    puts "estou na funcao"
    yield 4
    yield 5
    yield 6
end

myBlock do |a|
    puts a
end

def funcaoRecebeBloco(&rotina)
    rotina.call 2
end

funcaoRecebeBloco { |n|
    n*n
}