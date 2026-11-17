package X;

import X.Ht9;

/* renamed from: X.A6l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0864A6l<T extends Ht9<? extends Boolean>> {
    public final String A00;
    public final T A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0864A6l) {
                C0864A6l c0864A6l = (C0864A6l) obj;
                if (!C7384Etj.areEqual(this.A00, c0864A6l.A00) || !C7384Etj.areEqual(this.A01, c0864A6l.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        return ((str != null ? str.hashCode() : 0) * 31) + C8j4.A0E(this.A01, 0);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AccessibilityAction(label=");
        sbA0x.append(this.A00);
        sbA0x.append(", action=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public C0864A6l(String str, T t) {
        this.A00 = str;
        this.A01 = t;
    }
}
