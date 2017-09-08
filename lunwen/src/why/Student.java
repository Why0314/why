package why;

public class Student {
	private int stuBianhao;
	private String stuXuehao;
	private String stuName;
	private String stuXingbie;
	private String stuZhuanye;
	private String stuPassword;
	private String stuLunwen;
	private String stuDaoshi;
	public int getStuBianhao() {
		return stuBianhao;
	}
	public String getStuXuehao() {
		return stuXuehao;
	}
	public String getStuName() {
		return stuName;
	}
	public String getStuXingbie() {
		return stuXingbie;
	}
	public String getStuZhuanye() {
		return stuZhuanye;
	}
	public String getStuPassword() {
		return stuPassword;
	}
	public String getStuLunwen() {
		return stuLunwen;
	}
	public String getStuDaoshi() {
		return stuDaoshi;
	}
	public void setStuBianhao(int stuBianhao) {
		this.stuBianhao = stuBianhao;
	}
	public void setStuXuehao(String stuXuehao) {
		this.stuXuehao = stuXuehao;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public void setStuXingbie(String stuXingbie) {
		this.stuXingbie = stuXingbie;
	}
	public void setStuZhuanye(String stuZhuanye) {
		this.stuZhuanye = stuZhuanye;
	}
	public void setStuPassword(String stuPassword) {
		this.stuPassword = stuPassword;
	}
	public void setStuLunwen(String stuLunwen) {
		this.stuLunwen = stuLunwen;
	}
	public void setStuDaoshi(String stuDaoshi) {
		this.stuDaoshi = stuDaoshi;
	}
	public Student(int stuBianhao, String stuXuehao, String stuName,
			String stuXingbie, String stuZhuanye, String stuPassword,
			String stuLunwen, String stuDaoshi) {
		super();
		this.stuBianhao = stuBianhao;
		this.stuXuehao = stuXuehao;
		this.stuName = stuName;
		this.stuXingbie = stuXingbie;
		this.stuZhuanye = stuZhuanye;
		this.stuPassword = stuPassword;
		this.stuLunwen = stuLunwen;
		this.stuDaoshi = stuDaoshi;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}