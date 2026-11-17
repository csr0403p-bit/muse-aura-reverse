package X;

import java.util.List;

/* renamed from: X.ApT, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1732ApT<T> {
    public int A00;
    public final int A01;
    public final T A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1732ApT) {
                C1732ApT c1732ApT = (C1732ApT) obj;
                if (!C7384Etj.areEqual(this.A02, c1732ApT.A02) || this.A01 != c1732ApT.A01 || this.A00 != c1732ApT.A00 || !C7384Etj.areEqual(this.A03, c1732ApT.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(Object obj, String str, List list, int i, int i2) {
        list.add(new C1732ApT(obj, str, i, i2));
    }

    public final C1733ApU<T> A01(int i) {
        int i2 = this.A00;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        } else if (i == Integer.MIN_VALUE) {
            throw C3cG.A0Q("Item.end should be set first");
        }
        return new C1733ApU<>(this.A02, this.A03, this.A01, i);
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A03, ((((AnonymousClass006.A0D(this.A02) * 31) + this.A01) * 31) + this.A00) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("MutableRange(item=");
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
    public C1732ApT(Object obj, String str, int i, int i2) {
        this.A02 = obj;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str;
    }
}
