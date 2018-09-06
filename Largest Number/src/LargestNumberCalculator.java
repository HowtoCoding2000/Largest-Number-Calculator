
public class LargestNumberCalculator
	{

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				calculateLargestNumber();
			}
		public static void calculateLargestNumber()
			{
				int [] numbers = {3,2,5,6,8,4,7,4};
				int largestNumber = numbers[0];
				for (int i = 0; i < numbers.length; i++)
					{
						if (numbers[i] > largestNumber)
							{
								largestNumber = numbers[i];
							}
					}
				System.out.println(largestNumber);
				System.out.println(Integer.MIN_VALUE);
				System.out.println(Integer.MAX_VALUE);
				System.out.println(Integer.MIN_VALUE - 1);
			}
	}
