object book extends App{
  def discount(x:Double)=x*24.95*0.4;
  def cost(y:Double)=y*24.95-discount(y);
  def netcost(n:Double)=cost(n)+(if(n>50) 50*3+(n-50)*0.75 else n*3);
  println(netcost(60));
}                         
