package rmuti.arrayliststack;

import java.util.ArrayList;

public class ArrayListStack {

	private ArrayList arr = new ArrayList();

	public void push(Object e) {
		arr.add(e);
	}

	public void pop(int value) {
		int n = (int) arr.size() - 1;
		for (int i = n; i >= value; i--) {
			arr.remove(i);
		}

	}
	public Object peek() {
        return arr.get(arr.size()-1);
    }

	public Object getData() {
		return arr;
	}

}
