package javaClass;

public class GoodsStock { // ��ǰ ��� Ŭ����
	String goodsCode; // ��ǰ �ĺ� ��
	int stockNum; // ���
	
	void AddStock(int stock) { // ��ǰ �԰� �ż���
		stockNum+=stock;
	}
	
	int SubtrakStock(int stock) { // ��ǰ ��� �ż���
		if(stockNum<stock) {
			return 0;
		}
		stockNum-=stock;
		return stock;
	}
	

}
