import java.util.*;
import java.util.stream.Collectors;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = sc.nextInt();
		List<Vertex> vertices = new ArrayList<>();
		for (int j = 0; j < i; j++) {
			Vertex aVertex = new Vertex(Integer.toString(sc.nextInt()));
			Vertex bVertex = new Vertex(Integer.toString(sc.nextInt()));
			if (vertices.contains(aVertex)) {
				bVertex.setPais(vertices.get(vertices.indexOf(aVertex)).getPais());
				aVertex.setPais(bVertex.getPais());
			} else if (vertices.contains(bVertex)) {
				aVertex.setPais(vertices.get(vertices.indexOf(bVertex)).getPais());
				bVertex.setPais(aVertex.getPais());
			} else {
				aVertex.setPais(j);
				bVertex.setPais(j);
			}
			aVertex.setUniones(
					vertices.stream().filter(v -> v.getPais() != aVertex.getPais()).collect(Collectors.toList()));
			bVertex.setUniones(
					vertices.stream().filter(v -> v.getPais() != bVertex.getPais()).collect(Collectors.toList()));
			vertices.add(aVertex);
			vertices.add(bVertex);
		}
		int posibilidades = 0;
		List<Integer> paises = new ArrayList<>();
		for (int j = 0; j < vertices.size() - 1; j++) {
			Vertex tmp = vertices.get(j);
			if (!paises.contains(tmp.getPais())) {
				posibilidades += tmp.getUniones().size();
				paises.add(tmp.getPais());
			}
		}
		System.out.println(posibilidades);
	}

	static class Vertex {
		private String id;
		private List<Vertex> uniones = new ArrayList<>();
		private int pais;

		public int getPais() {
			return pais;
		}

		public void setPais(int pais) {
			this.pais = pais;
		}

		public Vertex(String id) {
			this.id = id;
		}

		public List<Vertex> getUniones() {
			return this.uniones;
		}

		public void setUniones(List<Vertex> uniones) {
			this.uniones = new ArrayList<>(uniones);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Vertex other = (Vertex) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}

		public String toString() {
			return "ID: " + this.id + "  Pais: " + this.pais;
		}

	}

}