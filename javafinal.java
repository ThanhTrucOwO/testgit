// import java.util.Scanner;

// public class Bai7 {
// 	private String ers;
// 	private int n;
// 	private int m;
// 	private int init;
// 	private String swc;
// 	private Scanner sc = new Scanner(System.in);
// 	public Bai7() {
// 		// TODO Auto-generated constructor stub
// 	}
	
// 	public String getErs() {
// 		return ers;
// 	}

// 	public void setErs(String ers) {
// 		this.ers = ers;
// 	}

// 	public int getM() {
// 		return m;
// 	}

// 	public void setM(int m) {
// 		this.m = m;
// 	}

// 	public int getN() {
// 		return n;
// 	}
// 	public void setN(int n) {
// 		this.n = n;
// 	}
// 	public int getInit() {
// 		return init;
// 	}
// 	public void setInit(int init) {
// 		this.init = init;
// 	}
// 	public String getSwc() {
// 		return swc;
// 	}
// 	public void setSwc(String swc) {
// 		this.swc = swc;
// 	}
// 	public Scanner getSc() {
// 		return sc;
// 	}
// 	public void setSc(Scanner sc) {
// 		this.sc = sc;
// 	}
// 	public void nhap() {
// 		System.out.print("Mời bạn nhập n: ");
// 		setN(Integer.parseInt(sc.nextLine()));
// 	}
// 	public void cauA() {
// 		String x = "";
// 		int v = 0;
// 		for (int i = 0 ; i <= getN(); i++) {
// 			System.out.println(i);
// 			v+=i;
// 			x+=i+";";
// 		}
// 		System.out.println("Tổng của chúng là: " + v);
// 		setErs(x + "Tổng là: " + v +";");
// 	}
// 	public void cauB() {
// 		int v = 0;
// 		String x = "";
// 		for (int i = 0 ; i <= getN(); i++) {
// 			if (i%2==0) {
// 				System.out.println(i);
// 				v+=i;
// 				x+=i+";";
// 			}
// 		}
// 		setErs(x + "Tổng là: " + v +";");
// 		System.out.println("Tổng của chúng là: " + v);
// 	}
// 	public void cauC() {
// 		int v = 0;
// 		String x = "";
// 		for (int i = 0 ; i <= getN(); i++) {
// 			if (i%2==1) {
// 				System.out.println(i);
// 				v+=i;
// 				x+=i+";";
// 			}
// 		}
// 		System.out.println("Tổng của chúng là: " + v);
// 		setErs(x + "Tổng là: " + v +";");
// 	}
// 	public void cauD() {
// 		int v = 0;
// 		String x = "";
// 		for (int i = 0; i <= getN(); i++) {
// 			if (checkSNT(i)==1) {
// 				System.out.println(i);
// 				v+=i;
// 				x+=i+";";
// 			}
// 		}
// 		setErs(x + "Tổng là: " + v +";");
// 		System.out.println("Tổng của chúng là: " + v);
// 	}
// 	public void cauE(int y) {
// 		setErs("");
// 		int flag = 0;
// 		String x = "";
// 		int solid = y + 1;
// 		System.out.println(solid);
// 		if (solid >=1) {
// 			System.out.println("Các số tự nhiên là số nguyên tố: ");
// 			for (int i = 0; i <= getN(); i++) {
// 				if (checkSNT(i)==1) {
// 					flag = 1;
// 					System.out.println(i);
// 					x+=i+";";
// 					solid--;
// 				}
// 				if (solid == 0) {break;}
// 			}
// 			if (flag == 0) {
// 				System.out.println("Không có số nguyên tố nào để xuất!");
// 				setErs("Không có số nguyên tố nào để xuất!");
// 			}
// 			setErs(x);
// 		} else {
// 		}
// 	}
// 	public int checkSNT(int k) {
// 		int flag = 0;
// 		for (int i = 1; i <= Math.sqrt(k); i++) {
// 			if (k%i==0) {
// 				flag++;
// 			}
// 		}
// 		if (flag == 1 && k!=1) {
// 			return 1;
// 		} else {
// 			return 0;
// 		}
// 	}
// 	public int numberOSNT() {
// 		int v = 0;
// 		for (int i = 0; i <= getN(); i++) {
// 			if (checkSNT(i) == 1) {
// 				v+=1;
// 			}
// 		}
// 		return v;
// 	}
// 	public void menu() {
// 		Bai7 a = new Bai7();
// 		a.setSwc("");
// 		a.setInit(0);
// 		while (getSwc()!="2") {
// 			System.out.println("1. Nhập số tự nhiên n");
// 			System.out.println("a. Các số tự nhiên <=n và tổng của chúng");
// 			System.out.println("b. Các số tự nhiên chẵn <=n và tổng của chúng");
// 			System.out.println("c. Các số tự nhiên lẻ <= n và tổng của chúng");
// 			System.out.println("d. Các số tự nhiên là số nguyên tố và tổng của chúng");
// 			System.out.println("e. N số nguyên tố đầu tiên");
// 			System.out.println("2. Thoát");
// 			System.out.print("Mời chọn: ");
// 			String x = sc.nextLine();
// 			switch (x) {
// 			case "1": {
// 				try {
// 					a.nhap();
// 					a.setInit(1);
// 				} catch (Exception e) {
// 					System.out.println(e.getMessage());
// 					a.setInit(0);
// 				}
// 				break;
// 			}
// 			case "a": {
// 				if (a.getInit()==1) {
// 					a.cauA();
// 				} else {
// 					System.out.println("Chưa khởi tạo hoặc giá trị sai!");
// 				}
// 				break;
// 			}
// 			case "b": {
// 				if (a.getInit()==1) {
// 					a.cauB();
// 				} else {
// 					System.out.println("Chưa khởi tạo hoặc giá trị sai!");
// 				}
// 				break;
// 			}
// 			case "c": {
// 				if (a.getInit()==1) {
// 					a.cauC();
// 				} else {
// 					System.out.println("Chưa khởi tạo hoặc giá trị sai!");
// 				}
// 				break;
// 			}
// 			case "d": {
// 				if (a.getInit()==1) {
// 					a.cauD();;
// 				} else {
// 					System.out.println("Chưa khởi tạo hoặc giá trị sai!");
// 				}
// 				break;
// 			}
// 			case "e": {
// 				if (a.getInit()==1) {
// //					a.cauE();;
// 				} else {
// 					System.out.println("Chưa khởi tạo hoặc giá trị sai!");
// 				}
// 				break;
// 			}
// 			case "2": {
// 				setSwc("2");
// 				break;
// 			}
// 			default:
// 				System.out.println("Sai giá trị");
// 				break;
// 			}
// 		}
		
// 	}
// }

