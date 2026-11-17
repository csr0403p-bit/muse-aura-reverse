package X;

import java.io.Serializable;

/* renamed from: X.DJs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4976DJs implements Serializable {
    public static final long serialVersionUID = 0;
    public final String algorithmName;
    public final int bytes;
    public final String toString;

    private Object readResolve() {
        return new C4973DJo(this.algorithmName, this.bytes, this.toString);
    }

    public C4976DJs(String algorithmName, int bytes, String toString) {
        this.algorithmName = algorithmName;
        this.bytes = bytes;
        this.toString = toString;
    }
}
