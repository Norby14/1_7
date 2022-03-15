class Main {
  public static void main(String[] args) {
    String znakChoinki = "*";
		for (int x=1; x<21; x=x+2)
			{
				for (int y=1; y<21; y++)
					{
						if (y<(1+x))
						{
								System.out.print(znakChoinki);
						}
						else
						{
							System.out.print(" ");
						}
					}
				System.out.println();
			}
  }
}