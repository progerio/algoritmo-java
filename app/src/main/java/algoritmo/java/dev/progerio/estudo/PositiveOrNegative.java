package algoritmo.java.dev.progerio.estudo;

public class PositiveOrNegative {

    public static ResultEnum byOperator(Integer integer) {
        if (integer > 0) {
            return ResultEnum.POSITIVE;
        } else if (integer < 0) {
            return ResultEnum.NEGATIVE;
        }

        return ResultEnum.ZERO;
    }

    public static ResultEnum bySignum(Integer integer) {
        int result = Integer.signum(integer);

        if (result == 1) {
            return ResultEnum.POSITIVE;
        } else if (result == -1) {
            return ResultEnum.NEGATIVE;
        }

        return ResultEnum.ZERO;
    }

    public static ResultEnum bySignum(Float floatNumber) {
        float result = Math.signum(floatNumber);
       
        if (result == 1.0f) {
            return ResultEnum.POSITIVE;
        } else if (result == -1.0f) {
            return ResultEnum.NEGATIVE;
        }
        return ResultEnum.ZERO;
    }
}
