package net.somta.common.utils.encrypt;

/**
 * 加密解密公共接口
 */
public interface Coder {

    /**
     * 加密
     * @param var1
     * @return
     */
    String encode(byte[] var1);

    /**
     * 解密
     * @param var1
     * @return
     */
    byte[] decode(String var1);
}
