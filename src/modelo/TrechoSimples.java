package modelo;
public class TrechoSimples implements TrechoAereo{
	
	public String origem;
	public String destino;
	public Double preco;
	
	public TrechoSimples(String origem, String destino, Double preco) {
		this.origem = origem;
		this.destino = destino;
		this.preco = preco;
	}

	@Override
	public String getOrigem() {
		// TODO Auto-generated method stub
		return origem;
	}

	@Override
	public String getDestino() {
		// TODO Auto-generated method stub
		return destino;
	}

	@Override
	public Double getPreco() {
		// TODO Auto-generated method stub
		return preco;
	}
	
	

}
