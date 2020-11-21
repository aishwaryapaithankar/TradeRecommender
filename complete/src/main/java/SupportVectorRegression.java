
public class SupportVectorRegression {

	public static void main(String[] args) {
try {
			
			ProcessBuilder pb = new ProcessBuilder("python", "./src/main/python/svr.py");
Process p = pb.start();
p.waitFor();
System.out.println("OK- SVR");




		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
