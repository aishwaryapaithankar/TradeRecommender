
public class Prophet {

	public static void main(String[] args) {
try {
			
			ProcessBuilder pb = new ProcessBuilder("python", "./src/main/python/prophet.py");
Process p = pb.start();
p.waitFor();
System.out.println("OK- Prophet");




		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
