package X;

import java.util.Arrays;

/* renamed from: X.CcD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3660CcD {
    public final EnumC3668CcP A00;
    public final Integer A01;

    public /* synthetic */ C3660CcD(EnumC3668CcP enumC3668CcP, Integer num) {
        this.A00 = enumC3668CcP;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C3660CcD) {
                C3660CcD c3660CcD = (C3660CcD) obj;
                if (!CS7.A01(this.A00, c3660CcD.A00) || !CS7.A01(this.A01, c3660CcD.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01, null, null});
    }
}
