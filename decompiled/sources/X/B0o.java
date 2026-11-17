package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class B0o extends AbstractC2181B0z implements Iterable<AbstractC2181B0z>, BOA {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final String A07;
    public final List<AbstractC2181B0z> A08;
    public final List<AbstractC8825Fld> A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof B0o)) {
                B0o b0o = (B0o) obj;
                if (!C7384Etj.areEqual(this.A07, b0o.A07) || this.A02 != b0o.A02 || this.A00 != b0o.A00 || this.A01 != b0o.A01 || this.A03 != b0o.A03 || this.A04 != b0o.A04 || this.A05 != b0o.A05 || this.A06 != b0o.A06 || !C7384Etj.areEqual(this.A09, b0o.A09) || !C7384Etj.areEqual(this.A08, b0o.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public B0o() {
        this("", AbstractC2176B0u.A00, C0881AGi.A00, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f);
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A08, AnonymousClass005.A0F(this.A09, AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass001.A0G(this.A07), this.A02), this.A00), this.A01), this.A03), this.A04), this.A05), this.A06)));
    }

    @Override // java.lang.Iterable
    public final Iterator<AbstractC2181B0z> iterator() {
        return new C7591F5e(this);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;FFFFFFFLjava/util/List<+LX/Fld;>;Ljava/util/List<+LX/B0z;>;)V */
    public B0o(String str, List list, List list2, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.A07 = str;
        this.A02 = f;
        this.A00 = f2;
        this.A01 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = f6;
        this.A06 = f7;
        this.A09 = list;
        this.A08 = list2;
    }
}
