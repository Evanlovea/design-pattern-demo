package builder;

public class Client {
    public static void main(String args[]) {
    	ComputerBuilder cb=(ComputerBuilder)XMLUtil.getBean();
    	Worker worker=new Worker();
    	worker.setComputerBuilder(cb);
    	Computer computer =worker.construct();
    	System.out.println("µçÄÔ×é³É£º");
    	System.out.println(computer.getRam());
    	System.out.println(computer.getCpu());
    	System.out.println(computer.getHardDisk());
    	System.out.println(computer.getIndicator());
    	System.out.println(computer.getMaster());
    }
}
