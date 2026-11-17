package X;

import java.util.Arrays;

/* renamed from: X.6x6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6x6 {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6x6) {
                C6x6 c6x6 = (C6x6) obj;
                if (!C6xC.A00(this.A00, c6x6.A00) || !C6xC.A00(this.A02, c6x6.A02) || !C6xC.A00(this.A01, c6x6.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A02, this.A01});
    }

    public final String toString() {
        return FGI.A0h(this.A00, ",", this.A02, ",", this.A01);
    }

    public C6x6(String str, String str2, String str3) {
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }
}
