package problem_statement_8_1;

class Printer implements Runnable
{
	private Storage storage;

	Printer(Storage s) { storage = new Storage(s); }

	public void run()
	{
	System.out.println(storage.GetX());
	}
}
