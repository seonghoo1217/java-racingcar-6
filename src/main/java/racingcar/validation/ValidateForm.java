package racingcar.validation;

import racingcar.property.ValidateType;

import static racingcar.validation.NameValidation.*;

public class ValidateForm {

    public static void validateForValidateType(ValidateType validateType,String inputValue){
        if (validateType == ValidateType.NAME){
            verifyForRacerName(inputValue);
            return;
        }

        if (validateType == ValidateType.NAME_LIST){
            verifyForRacerNameList(inputValue);
            return;
        }
    }

    private static void verifyForRacerName(String inputValue){
        verifyForEmptyValue(inputValue);
        verifyForSpaceValue(inputValue);
        verifyForRacerNameIsLengthNotOver(inputValue);
        verifyForRacerNameIsEngOrKor(inputValue);
    }

    private static void verifyForRacerNameList(String racerNameList){

    }
}
