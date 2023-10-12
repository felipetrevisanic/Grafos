////package pack;
////
////public class Backup {
////	package pack;
////
////	import java.io.BufferedReader;
////	import java.io.FileInputStream;
////	import java.io.FileNotFoundException;
////	import java.io.IOException;
////	import java.io.InputStream;
////	import java.io.InputStreamReader;
////	import java.util.ArrayList;
////	import java.util.LinkedHashMap;
////	import java.util.Map;
////
////	public class Main {
////		
////		public static void main(String[] args) {
////			
////			String filePath = "C:\\Temp\\config.txt";
////			
////			Map<String, String> chaveValor = new LinkedHashMap<>();
////			ArrayList<String> contadorIguais = new ArrayList<String>();
////			ArrayList<String> contadorNegativos = new ArrayList<String>();
////			int resultadoNegativo = 0;
////			int resultadoRepetido = 0;
////			
////			try {
////				InputStream is = new FileInputStream(filePath);
////				InputStreamReader isr = new InputStreamReader(is);
////				BufferedReader buffer = new BufferedReader(isr);
////				
////				String linha = "";
////				
////				while((linha = buffer.readLine()) != null) {
////					String[] partes = linha.split(":");
////					String chave = partes[0].trim();
////					String valor = partes[1].trim();
////					
////					try {
////						if(Integer.parseInt(valor) <= -1) {
////							resultadoNegativo++;
////							contadorNegativos.add(chave);
////						}else {
////							if(chaveValor.containsValue(valor)) {
////								contadorIguais.add(chave);
////								resultadoRepetido++;
////							}else {					
////								chaveValor.put(chave, valor);
//////								Grafo g = new Grafo(); preciso instanciar um grafo
//////								adicionar os vertices depois definir as arestas e printar o grafo
////								
////							}						
////						}
////					}
////					catch(Exception e){
////						
////					}
////					
////
////				
////					
////				}
////			} catch (FileNotFoundException e) {
////				e.printStackTrace();
////			} catch(IOException e) {
////				e.printStackTrace();
////			}
////			
////
////			for (Map.Entry<String, String> entry : chaveValor.entrySet()) {
////				System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
////			}
////			
////			System.out.println("\n ---------------------- \n");
////			
////			System.out.println("Este arquivo possuia " + resultadoNegativo + " números negativos");
////			for(String cn : contadorNegativos) {
////				System.out.println("linha com números negativos: " + cn);
////			}
////			
////			System.out.println("\n ---------------------- \n");
////			
////			
////			System.out.println("Houveram " + resultadoRepetido + " numeros que repetiram e se encontram nas linhas: ");
////			for (String ci : contadorIguais) {
////	            System.out.println("linha com número repetido: " + ci);
////	        }
////		}
////		
////
////
////	}
////
////}
//
//
//package pack;
//
//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		String filePath = "C:\\Temp\\config.txt";
//		
//		Map<String, Vertice> chaveValor = new LinkedHashMap<>();
//		ArrayList<String> contadorIguais = new ArrayList<String>();
//		ArrayList<String> contadorNegativos = new ArrayList<String>();
//		ArrayList<String> resultados = new ArrayList<String>();
//		int resultadoNegativo = 0;
//		int resultadoRepetido = 0;
//		
//		try {
//			InputStream is = new FileInputStream(filePath);
//			InputStreamReader isr = new InputStreamReader(is);
//			BufferedReader buffer = new BufferedReader(isr);
//			
//			String linha = "";
//			
//			while((linha = buffer.readLine()) != null) {
//				String[] partes = linha.split(":");
//				String chave = partes[0].trim();
//				String valor = partes[1].trim();
//				
//				try {
//					if(Integer.parseInt(valor) <= -1) {
//						resultadoNegativo++;
//						contadorNegativos.add(chave);
//					}else {
//						if(chaveValor.containsValue(valor)) {
//							contadorIguais.add(chave);
//							resultadoRepetido++;
//						}else {					
//							chaveValor.put(chave, valor);
//							resultados.add(valor);
////							adicionar os vertices depois definir as arestas e printar o grafo
//						
//						}						
//					}
//				}
//				catch(Exception e){
//					
//				}
//				
//				System.out.println(resultados);
////				for(String r : resultados) {
////					System.out.println(r);								
////				}
//
//			
//				
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
//		
//		Grafo g = new Grafo();
//		
//		for(int i = 0; i < resultados.size();i++) {
//			Vertice v[i] = g.addVertice(resultados[i]);		
//		}
//		
//
////		for (Map.Entry<String, String> entry : chaveValor.entrySet()) {
////			System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
////		}
//		
//		System.out.println("\n ---------------------- \n");
//		
//		System.out.println("Este arquivo possuia " + resultadoNegativo + " números negativos");
//		for(String cn : contadorNegativos) {
//			System.out.println("linha com números negativos: " + cn);
//		}
//		
//		System.out.println("\n ---------------------- \n");
//		
//		
//		System.out.println("Houveram " + resultadoRepetido + " numeros que repetiram e se encontram nas linhas: ");
//		for (String ci : contadorIguais) {
//            System.out.println("linha com número repetido: " + ci);
//        }
//	}
//	
//
//
//}
//
