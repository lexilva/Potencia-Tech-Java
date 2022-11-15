package edu.alex.poo.colecoes.exercicios;

import java.util.*;

/*
* Dada a população estimada de alguns estados do NE brasileiro, faça:
* Estado = PE - População = 9.616.621
* Estado = AL - População = 3.351.543
* - Crie um dicionário e relacione os estados e suas populações;
* - Substitua a população do estado do RN por 3.534;
* Confira se o estado PB está no dicionário, caso não adicion: PB-
*  4.039.277;
* - Exiba a população PE;
* - Exiba todos os estado e suas populações na orde que foram informados;
* - Exiba os estados e suas populações em ordem algabética;
* - Exiba o estado com a menor população e sua quantidade;
* - Exiba o estado com a maior população e sua quantidade;
* - Exiba a soma da população desses estados;
* - Exiba a média da população deste dicionário de estados;
* - Remova os estados com a população menor que 4.000.000;
* - Apague o dicionário de estados;
* - Confira se o dicionário está vazio;
*
* */
public class ExeMap1 {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário e relacione os estados e suas populações:");
        Map<String, Integer> estadosNe = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3354543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estadosNe);
        System.out.println("Substitua a população do Rj por #.534.165:");
        estadosNe.put("RN", 3534165);
        System.out.println(estadosNe);
        System.out.println("Confira se o estado PB está no dicionário, caso não" +
                "adicione: PB - 4.039.277");
        if (!estadosNe.containsKey("PB")) {
            System.out.println("O estado PB não está no dicionário e será adicionado!");
            estadosNe.put("PB", 4039277);
            System.out.println(estadosNe);
        }
        System.out.print("Exiba a População de Pernambuco: ");
        if (estadosNe.containsKey("PE")) System.out.println(estadosNe.get("PE"));
        System.out.println();
        System.out.println("Exiba todos os estados e suas populações na ordem  que foi informado: ");
        System.out.println("------------*******-----------");
        Map<String, Integer> estadosNe1 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3354543);
            put("CE", 9187103);
            put("RN", 3534165);
            put("PB", 4039277);
        }};
        for (Map.Entry<String, Integer> estados : estadosNe1.entrySet()) {
            System.out.println("Estados: " + estados.getKey() + "      População: " + estados.getValue());
        }
        System.out.println("Exiba os estados e suas populações em ordem alfabéica: ");
        Set<Map.Entry<String, Integer>> estadosNe2 = new TreeSet<>(new ComparatorNome());
        estadosNe2.addAll(estadosNe1.entrySet());
        for (Map.Entry<String, Integer> estados1 : estadosNe2) {
            System.out.println(estados1);
        }
        System.out.println("Exiba o estado com menor população e sua quanidade: ");
        Collection<Integer> populacaoEstados = estadosNe1.values();
        System.out.println(populacaoEstados);
        Set<Map.Entry<String, Integer>> entries = estadosNe1.entrySet();
        Integer menorPopulacao = Collections.min(populacaoEstados);
        String estadoMenosPopuloso ="";
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(menorPopulacao)) {
                estadoMenosPopuloso = entry.getKey();
                System.out.println("Estado com menor população: "+ estadoMenosPopuloso+"   População: "+menorPopulacao+" habitantes"   );
            }
        }
        System.out.println("Exiba o estado com maior população e sua quantidade: ");
        Integer maiorPopulacao = Collections.max(populacaoEstados);
        String estadoMaisPopuloso ="";
        for (Map.Entry<String,Integer>entry:entries){
            if (entry.getValue().equals(maiorPopulacao)){
                estadoMaisPopuloso = entry.getKey();
                System.out.println("Estado: "+estadoMaisPopuloso+"   População: "+ maiorPopulacao);
            }
        }
        System.out.print("Exiba a soma da Popuação dos Estados: ");
        Iterator<Integer> iterator = estadosNe1.values().iterator();
        Integer soma = 0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);
        System.out.println("Exiba a média da população dos estados: "+soma/estadosNe.size());
        System.out.println("Remover os estados com população menor do que 4.000.000 :");
        Iterator<Integer> iterator1 = estadosNe1.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next() < 4000000){
                iterator1.remove();
            }
        }
        System.out.println(estadosNe1);
        System.out.println("Apague o dicionário: ");
        estadosNe1.clear();
        System.out.println(estadosNe1);
        System.out.println("Confira se o dicionário está vazio: "+estadosNe1.isEmpty());
    }
}
class ComparatorNome implements Comparator<Map.Entry<String,Integer>>{

    @Override
    public int compare(Map.Entry<String, Integer> estado1, Map.Entry<String, Integer> estado2) {
        return estado1.getKey().compareTo(estado2.getKey());
    }
}



























