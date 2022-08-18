package interfaces;

public class PoohToyImpl implements ILight, IMoveArmLeg{

	public PoohToyImpl() {
		System.out.println("곰돌이 푸우에요");
		canLight();
		canMoveArmLeg();
		System.out.println("==================================");
	}
	
	@Override
	public void canMoveArmLeg() {
		System.out.println("팔다리를 움직일 수 있습니다.");
	}

	@Override
	public void canLight() {
		System.out.println("불빛을 반짝입니다.");
	}

}
