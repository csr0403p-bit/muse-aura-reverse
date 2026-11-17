package X;

import java.util.AbstractCollection;

/* renamed from: X.ApU, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1733ApU<T> {
    public final int A00;
    public final int A01;
    public final T A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1733ApU) {
                C1733ApU c1733ApU = (C1733ApU) obj;
                if (!C7384Etj.areEqual(this.A02, c1733ApU.A02) || this.A01 != c1733ApU.A01 || this.A00 != c1733ApU.A00 || !C7384Etj.areEqual(this.A03, c1733ApU.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public C1733ApU(T t, int i, int i2) {
        this(t, "", i, i2);
    }

    public static void A00(Object obj, AbstractCollection abstractCollection, int i, int i2) {
        abstractCollection.add(new C1733ApU(obj, i, i2));
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A03, ((((AnonymousClass006.A0D(this.A02) * 31) + this.A01) * 31) + this.A00) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Range(item=");
        sbA0x.append(this.A02);
        sbA0x.append(", start=");
        sbA0x.append(this.A01);
        sbA0x.append(", end=");
        sbA0x.append(this.A00);
        sbA0x.append(", tag=");
        sbA0x.append(this.A03);
        return AnonymousClass006.A0z(sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (TT;IILjava/lang/String;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public C1733ApU(Object obj, String str, int i, int i2) {
        this.A02 = obj;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str;
        if (i <= i2) {
        } else {
            throw C60O.A0i("Reversed range is not supported");
        }
    }
}
