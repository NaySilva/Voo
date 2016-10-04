package modelo;


public class TrechoComposto implements TrechoAereo{
	
	public TrechoAereo primeiro;
	public TrechoAereo segundo;
	public Double taxaConexao;
	public Double preco;

	public TrechoComposto(TrechoAereo primeiro, TrechoAereo segundo, Double taxaConexao) {
		super();
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.taxaConexao = taxaConexao;
		if(primeiro.getDestino()!=segundo.getOrigem()){
			throw new RuntimeException("Não vai ser possivel fazer a conexão");
		}
		}

	@Override
	public String getOrigem() {
		// TODO Auto-generated method stub
		return primeiro.getOrigem();
	}

	@Override
	public String getDestino() {
		// TODO Auto-generated method stub
		return segundo.getDestino();
	}

	@Override
	public Double getPreco() {
		// TODO Auto-generated method stub
		return primeiro.getPreco() + segundo.getPreco() + taxaConexao;
	}

}
