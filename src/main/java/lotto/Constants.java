package lotto;

public class Constants {

    public static final String ASK_PURCHASE_AMOUNT = "구입금액을 입력해 주세요.";
    public static final int MINIMUM_PURCHASE_AMOUNT = 1000;

    private static final String PREV_ERROR_MESSAGE = "[Error] ";

    public static final String PURCHASE_AMOUNT_IS_NOT_NUMBER_ERROR_MESSAGE = PREV_ERROR_MESSAGE + "숫자가 아닙니다.";
    public static final String PURCHASE_AMOUNT_IS_NOT_IN_RANGE_ERROR_MESSAGE = PREV_ERROR_MESSAGE + "1000원 이상이어야합니다.";
    public static final String PURCHASE_AMOUNT_IS_NOT_DIVIDED_ERROR_MESSAGE =
            PREV_ERROR_MESSAGE + "1000원으로 나누어떨어져야합니다.";

}
