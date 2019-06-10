package Fuxi;
/*
第一题：分析以下需求，并用代码实现
	一共有1000张电影票,可以在两个窗口领取,假设每次领取的时间为3000毫秒,
	要求:请用多线程模拟卖票过程并打印剩余电影票的数量

 */
public class T3 {
    public int Piao=1000;

    public T3(int piao) {
        Piao = piao;
    }

    public T3() {
    }

    public int getPiao() {
        return Piao;
    }

    public void setPiao(int piao) {
        Piao = piao;
    }

    @Override
    public String toString() {
        return "T3{" +
                "Piao=" + Piao +
                '}';
    }
}
