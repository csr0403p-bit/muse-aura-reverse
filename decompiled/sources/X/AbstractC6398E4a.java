package X;

/* renamed from: X.E4a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6398E4a {
    public final int A00;

    public static String A00(int i) {
        StringBuilder sbA0x = C60O.A0x("");
        sbA0x.append((char) ((i >> 24) & 255));
        sbA0x.append((char) ((i >> 16) & 255));
        sbA0x.append((char) ((i >> 8) & 255));
        return C8j3.A16(sbA0x, (char) (i & 255));
    }

    public String toString() {
        return A00(this.A00);
    }

    public AbstractC6398E4a(int i) {
        this.A00 = i;
    }
}
