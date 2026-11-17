package X;

import androidx.media3.common.util.Util;

/* renamed from: X.DyA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6219DyA {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C6219DyA c6219DyA = (C6219DyA) obj;
                if (!C6xC.A00(this.A00, c6219DyA.A00) || !C6xC.A00(this.A01, c6219DyA.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0G(this.A01) + BV7.A0I(this.A00);
    }

    public C6219DyA(String str, String str2) {
        this.A00 = Util.A0I(str);
        this.A01 = str2;
    }
}
