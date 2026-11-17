package X;

import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public abstract class CxH {
    public static final byte[] A00;
    public static final byte[] A01;

    static {
        Charset charset = DCl.A05;
        A00 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".getBytes(charset);
        A01 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".getBytes(charset);
    }
}
