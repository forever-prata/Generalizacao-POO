package exerc2;

public class Midia extends Item {
	private String gravadora;
	private float duracao;
	
	public Midia(int codigo, String descricao, String gravadora, float duracao) {
		super(codigo, descricao);
		this.gravadora = gravadora;
		this.duracao = duracao;
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

	public float getDuracao() {
		return duracao;
	}

	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - Midia [gravadora=");
		builder.append(gravadora);
		builder.append(", duracao=");
		builder.append(duracao);
		builder.append("]");
		return builder.toString();
	}
	
	
}
