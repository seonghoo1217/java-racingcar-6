package racingcar.property;

public class ErrorProperty {

    public static final String VALUE_IS_EMPTY="[ERROR] 입력값이 공백일 수는 없습니다.";
    public static final String VALUE_CONTAINS_SPACE="[ERROR] 입력값에 공백이 포함되었습니다.";
    public static final String NAME_VALUE_IS_NOT_CORRECT_FORM="[ERROR] 이름은 한글 혹은 숫자 값만 들어가야 합니다.";
    public static final String NAME_VALUE_LENGTH_IS_OVER="[ERROR] 이름의 길이는 %s 자리 이하여야합니다.".formatted(ValidateProperty.NAME_LENGTH_STANDARD);
}