package X;

/* renamed from: X.BRq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2273BRq<T> {
    public final int A00;
    public final T A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2273BRq) {
                C2273BRq c2273BRq = (C2273BRq) obj;
                if (this.A00 != c2273BRq.A00 || !C7384Etj.areEqual(this.A01, c2273BRq.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + AnonymousClass006.A0D(this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("IndexedValue(index=");
        sbA0x.append(this.A00);
        sbA0x.append(", value=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public C2273BRq(int i, T t) {
        this.A00 = i;
        this.A01 = t;
    }
}
