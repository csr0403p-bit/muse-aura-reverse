package X;

import android.graphics.Typeface;

/* renamed from: X.Hld, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10484Hld {
    public final int A00;
    public final Typeface A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10484Hld)) {
            return false;
        }
        C10484Hld c10484Hld = (C10484Hld) obj;
        return this.A00 == c10484Hld.A00 && C6xC.A00(this.A01, c10484Hld.A01) && C6xC.A00(this.A02, c10484Hld.A02);
    }

    public final int hashCode() {
        return BV7.A0E(this.A01, this.A02, Integer.valueOf(this.A00));
    }

    public C10484Hld(Typeface typeface, String str, int i) {
        this.A01 = typeface;
        this.A02 = str;
        this.A00 = i;
    }
}
