package pack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		
		String filePath = "C:\\Temp\\config.txt";
		
		Map<String, String> chaveValor = new LinkedHashMap<>();
		Map<String, Vertice> listaVertices = new LinkedHashMap<>();
		ArrayList<String> contadorIguais = new ArrayList<String>();
		ArrayList<String> contadorNegativos = new ArrayList<String>();
//		ArrayList<String> listaVertices = new ArrayList<String>();
		
		int resultadoNegativo = 0;
		int resultadoRepetido = 0;
		Grafo g = new Grafo();
		Vertice v = null;
		
		try {
			InputStream is = new FileInputStream(filePath);
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader reader = new BufferedReader(isr);
			
			OutputStream os = new FileOutputStream("C:\\Temp\\resposta.txt");
			OutputStreamWriter osr = new OutputStreamWriter(os);
			BufferedWriter writer = new BufferedWriter(osr);
			
			String linha = "";
			
			while((linha = reader.readLine()) != null) {
				String[] partes = linha.split(":");
				String chave = partes[0].trim();
				String valor = partes[1].trim();
				
				try {
					if(Integer.parseInt(valor) <= -1) {
						resultadoNegativo++;
						contadorNegativos.add(chave);
					}else {
						if(chaveValor.containsValue(valor)) {
							contadorIguais.add(chave);
							resultadoRepetido++;
						}else {					
							chaveValor.put(chave, valor);
							v = g.addVertice(valor);
							listaVertices.put(valor, v);
						}						
					}
				}
				catch(Exception e){
					
				}				
			}
			
			for (Map.Entry<String, Vertice> lv : listaVertices.entrySet()) {
				if(lv.getKey().endsWith("1")) {
					for (Map.Entry<String, Vertice> lvd : listaVertices.entrySet()) {
						if(lvd.getKey().endsWith("2")) {
							g.addAresta(lv.getValue(), lvd.getValue());							
						}
					}
				} else if(lv.getKey().endsWith("2")) {
					for (Map.Entry<String, Vertice> lvd : listaVertices.entrySet()) {
						if(lvd.getKey().endsWith("1") || lvd.getKey().endsWith("3")) {
							g.addAresta(lv.getValue(), lvd.getValue());							
						}
					}
				} else if(lv.getKey().endsWith("3")) {
					for (Map.Entry<String, Vertice> lvd : listaVertices.entrySet()) {
						if(lvd.getKey().endsWith("2") || lvd.getKey().endsWith("4")) {
							g.addAresta(lv.getValue(), lvd.getValue());							
						}
					}
				}else if(lv.getKey().endsWith("4")) {
					for (Map.Entry<String, Vertice> lvd : listaVertices.entrySet()) {
						if(lvd.getKey().endsWith("4")) {
							g.addAresta(lv.getValue(), lvd.getValue());							
						}
					}
				}
			}
			
			
			for (Map.Entry<String, Vertice> entry : listaVertices.entrySet()) {
		        String nomeVertice = entry.getKey();
		        Vertice vertice = entry.getValue();

		        writer.write(nomeVertice + " -> ");
		        for (Aresta a : vertice.getAdj()) {
		            Vertice destino = a.getDestino();
		            writer.write("[" + destino.getNome() + "] -> ");
		        }
		        writer.write("[/]");
		        writer.newLine();
		    }
			reader.close();
			writer.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}	
		
		System.out.println("Lista de adjacencia: ");
		System.out.println(g);
		
		System.out.println("\n ---------------------- \n");
		
		System.out.println("Este arquivo possuia " + resultadoNegativo + " números negativos");
		for(String cn : contadorNegativos) {
			System.out.println(cn);
		}
		
		System.out.println("\n ---------------------- \n");
		
		
		System.out.println("Houveram " + resultadoRepetido + " numeros que repetiram e se encontram nas linhas: ");
		for (String ci : contadorIguais) {
            System.out.println(ci);
        }
	}
	
//	public static void retornaVertice(ArrayList<Vertice> resVertice) {
//		for(Vertice rv : resVertice) {
//			if(rv.toString().endsWith("1")) {
//				Aresta a = new Aresta(rv, );
//			}
//		}
//	}

}
