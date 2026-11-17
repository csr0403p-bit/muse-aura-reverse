package X;

import android.text.TextUtils;

/* renamed from: X.DyD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6222DyD {
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && obj.getClass() == C6222DyD.class) {
                C6222DyD c6222DyD = (C6222DyD) obj;
                if (!TextUtils.equals(this.A00, c6222DyD.A00) || this.A01 != c6222DyD.A01 || this.A02 != c6222DyD.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.A00.hashCode() + 31) * 31) + BV7.A02(this.A01 ? 1 : 0)) * 31) + (this.A02 ? 1231 : 1237);
    }

    public C6222DyD(String str, boolean z, boolean z2) {
        this.A00 = str;
        this.A01 = z;
        this.A02 = z2;
    }
}
