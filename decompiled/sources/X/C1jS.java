package X;

import java.util.Arrays;

/* renamed from: X.1jS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1jS {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1jS)) {
            return super.equals(obj);
        }
        C1jS c1jS = (C1jS) obj;
        return AbstractC7213Eib.A00(this.A01, c1jS.A01) && AbstractC7213Eib.A00(this.A02, c1jS.A02) && AbstractC7213Eib.A00(this.A00, c1jS.A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, this.A00});
    }

    public C1jS(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }
}
