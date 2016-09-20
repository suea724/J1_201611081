class Subway{
int line;
void run() {
System.out.println(line+" line runs");
}
void setLine(int l) {
line=l;
}
}
Subway s=new Subway();
s.setLine(3);
s.run()
