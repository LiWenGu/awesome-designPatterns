package interpreter;

import java.util.HashMap;

public abstract class Expression {
    // 解析公式和数值，其中 var 中的 key 值是公式中的参数，value 值是具体的数字
    public abstract int interpreter(HashMap<String, Integer> var);
}
