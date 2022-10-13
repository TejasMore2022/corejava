package enumdatatype;

public class EnumClass {

	public enum WorkingDays {
		MON, TUE, WED, THU, FRI
	}

	public static void main(String[] args) {

		int a = 88;

		YearsOFEngg y = YearsOFEngg.FIRSTYEAR;
		System.out.println(y);
		WorkingDays abc = WorkingDays.MON;
		System.out.println(abc);

		switch (YearsOFEngg.SECONDYEAR) {
		case FIRSTYEAR:
			System.out.println("You are first year student and your subjects are M1, Graphics");

			break;
		case SECONDYEAR:
			System.out.println("You are second year student and your subjects are M3, TOM");
			break;
		case THIRDYEAR:
			System.out.println("You are third year student and your subjects are MB, JAVA");
			break;
		case FORTHYEAR:
			System.out.println("You are forth year student and your subjects are Project, CADCAM, DSM");
			break;

		default:
			System.out.println("You are drop out/YD student please check your subjects on University Website");
			break;
		}

	}

}
