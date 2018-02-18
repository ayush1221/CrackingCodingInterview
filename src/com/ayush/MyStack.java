package com.ayush;

public class MyStack<T> {

	private static class StackNode<T> {
		private T data;
		private StackNode<T> next;

		public StackNode(T data) {
			this.data = data;
		}

		private StackNode<T> top;

		public void push(T data) {
			StackNode<T> node = new StackNode(data);
			node.next = top;
			top = node;
		}

		public T pop() {
			if (top == null) {
				System.out.println("Stack is empty");
			}
			T item = top.data;
			top = top.next;
			return item;

		}

	}

}
