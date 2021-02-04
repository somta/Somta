//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package net.somta.common.utils.encrypt;

/**
 * 加密解密公共接口
 */
public interface Coder {

    String encode(byte[] var1);

    byte[] decode(String var1);
}
