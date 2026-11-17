package X;

import android.net.Uri;

/* loaded from: classes5.dex */
public final class Cbb {
    public static final Uri A03 = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String A00;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Cbb) {
                Cbb cbb = (Cbb) obj;
                if (!CS7.A01(this.A00, cbb.A00) || !CS7.A01(this.A01, cbb.A01) || this.A02 != cbb.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV7.A0F(this.A00, this.A01, null, 4225, Boolean.valueOf(this.A02));
    }

    public final String toString() {
        return this.A00;
    }

    public Cbb(String str, String str2, boolean z) {
        CRy.A05(str);
        this.A00 = str;
        CRy.A05(str2);
        this.A01 = str2;
        this.A02 = z;
    }
}
