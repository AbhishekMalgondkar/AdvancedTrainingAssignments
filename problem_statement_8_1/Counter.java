package problem_statement_8_1;

class Counter implements Runnable
{
	private int N;
	
	public Counter(int n) { N=n; }
	
	public int GetN() { return(N); }
	
	public void run()
	
	{
	
	for (int iLoop=1; iLoop<=N; iLoop++)
	
	{
	
	Storage storage = new Storage(iLoop);
	
	Printer printer = new Printer(storage);
	
	Thread.yield();
	
	printer.run();

}

}

}
