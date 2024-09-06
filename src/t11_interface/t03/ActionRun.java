package t11_interface.t03;

public class ActionRun {
	public static void main(String[] args) {
		Action[] actions = {new PoliceMan(), new FireMan(), new Chef()};
		String[] title = {"경찰관", "소방관", "요리사"};
		
		int cnt = 0;
		// 향상된 for문
		for(Action action : actions) {
			action.person(title[cnt]);
			action.search();
			action.catching();
			action.fire();
			action.rescue();
			action.spagetti();
			action.pizza();
			System.out.println();
			cnt++;
		}
	}
}
