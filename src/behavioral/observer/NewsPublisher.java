package behavioral.observer;

import java.util.ArrayList;

// Sujeto (observable)
public class NewsPublisher {
	
	// Mantiene una lista de todos los observadores (en este caso subscribers).
	private ArrayList<Subscriber> subscribers;
	private String latestNews;
	
	public NewsPublisher() {
		subscribers = new ArrayList<Subscriber>();
	}
	
	/**
	 * Para añadir un observador a la lista que lleva el sujeto
	 * @param subscriber
	 */
	public void attach(Subscriber subscriber){
		subscribers.add(subscriber);
	}
	
	/**
	 * Para eliminar un observador de la lista que lleva el sujeto
	 * @param subscriber
	 */
	public void detach(Subscriber subscriber){
		subscribers.remove(subscriber);
	}
	
	/**
	 * Mediante este metodo el sujeto informa a los observadores que hay noticias nuevas
	 * 
	 */
	private void notifySubscribers(){
		for (Subscriber subscriber : subscribers) {
			subscriber.update(this);
		}
	}
	
	public void addNews(String news){
		latestNews = news;
		// Notificar a los observadores desde que recibo una noticia nueva
		notifySubscribers();
	}
	
	
	/**
	 * Los observadores utilizaran este metodo para obtener las ultimas noticias,
	 * luego de recibir una notificacion
	 * @return
	 */
	public String getLatestNews(){
		return latestNews;
	}
	
}
