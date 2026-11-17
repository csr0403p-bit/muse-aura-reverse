package X;

import java.util.Map;

/* renamed from: X.DVb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5082DVb {
    public static final Map<String, Object> A04 = BV4.A0u();
    public final byte A00;
    public final String A01;
    public final Map<String, Object> A02;
    public final short A03;

    public C5082DVb() {
        this("", (byte) 0, (short) 0);
    }

    public final String toString() {
        return String.format("<TField name:'%s' type:%d field-id:%d metadata='%s'>", this.A01, Byte.valueOf(this.A00), Short.valueOf(this.A03), this.A02);
    }

    public C5082DVb(String str, byte b, short s) {
        Map<String, Object> map = A04;
        this.A01 = str;
        this.A00 = b;
        this.A03 = s;
        this.A02 = map;
    }
}
