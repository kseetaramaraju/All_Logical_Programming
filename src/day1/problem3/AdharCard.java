package day1.problem3;

public class AdharCard {

	private static AdharCard ad;

	private long adharNumber;
	private String name;

	private AdharCard(long adharNumber,String name)
	{
		this.adharNumber=adharNumber;
		this.name=name;
	}

	public static AdharCard creteAdharCard()
	{
		if(ad==null)
		{
			ad=new AdharCard(215703260000l,"SeetaRamaRajuKalle");
		}
		else 
		{
			System.out.println(" Already One Instance Is Created and  Second Instance Can Not Be Created !! ");
		}
		return ad;
	}

	@Override
	public String toString() {
		return "AdharCard [adharNumber=" + adharNumber + ", name=" + name + "]";
	}

}
