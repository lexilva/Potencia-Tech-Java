package edu.alex.poo.colecoes.map;

import java.util.*;

/*Dado os modelos do carros e seus respectivos consumos na
* estrada faça?
* modelo = gol - consumo = 14,4km/l
* modelo = uno - consumo = 15,6km/l
* modelo = mobi - consumo = 16,1km/l
* modelo = hb20 - consumo = 14,5km/l
* modelo = kwid - consumo = 15,6km/l
* */
public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos valores:");
        Map<String,Double>carrpsPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi",16.1);
            put("hb20", 14.5);
            put("kwid",15.6);
        }};
        System.out.println(carrpsPopulares.toString());
        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrpsPopulares.put("gol", 15.2);
        System.out.println(carrpsPopulares);
        System.out.println("Confira se o modelo tucson está no dicionário: "+carrpsPopulares.containsKey("tucson"));
        System.out.println("Exiba o consumo do uno: "+ carrpsPopulares.get("uno")+ " km/l");
        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrpsPopulares.keySet();
        System.out.println(modelos);
        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrpsPopulares.values();
        System.out.println(consumos);
        System.out.println("Exiba o modelo mais econômico: ");
        Double consumoMaisEficiente = Collections.max(carrpsPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrpsPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double>entry:entries){
            if (entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente +" - " + consumoMaisEficiente + " km/l");
            }
        }
        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrpsPopulares.values());
        String modeloMenosEficiente ="";
        for (Map.Entry<String,Double> entry:carrpsPopulares.entrySet()){
            if (entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: "+modeloMenosEficiente+" - "+ consumoMenosEficiente);
            }
        }

        Iterator<Double> iterator = carrpsPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: "+soma);
        System.out.println("Exiba a média dos consumos deste dicionário de carros: "+ soma/carrpsPopulares.size());
        System.out.println("Remova os modelos com o consumo igual a 15,6 Km/l: ");
        Iterator<Double> iterator1 = carrpsPopulares.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6))iterator1.remove();
        }
        System.out.println(carrpsPopulares);
        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String,Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi",16.1);
            put("hb20", 14.5);
            put("kwid",15.6);
        }};
        System.out.println(carrosPopulares1);
        System.out.println("Exiba o dicionário ordenado pelo modelo");
        Map<String,Double>carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());
        System.out.println("Apague o dicionário de carros: ");
        carrpsPopulares.clear();
        System.out.println("Confira se o dicionário está vazio: "+ carrpsPopulares.isEmpty());
    }
}
