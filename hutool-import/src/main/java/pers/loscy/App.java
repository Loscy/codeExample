package pers.loscy;

import cn.hutool.core.util.StrUtil;

/**
 * Hello world!
 */
public class App {
    private static final String AUTHOR = "Loscy";

    public static void main(String[] args) {
        StringBuilder builder = StrUtil.builder();
        builder.append("Hello World! ");
        builder.append(AUTHOR);
        System.out.println(builder);
    }
}
