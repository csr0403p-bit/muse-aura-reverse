package X;

/* renamed from: X.ArU, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1810ArU {
    public static final C1810ArU A02 = new C1810ArU(C19U.A03(0), C19U.A03(0));
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1810ArU) {
                long j = this.A00;
                C1810ArU c1810ArU = (C1810ArU) obj;
                long j2 = c1810ArU.A00;
                C1813ArX[] c1813ArXArr = C1809ArT.A02;
                if (j != j2 || this.A01 != c1810ArU.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        C1813ArX[] c1813ArXArr = C1809ArT.A02;
        return C8j4.A0B(this.A01, AnonymousClass005.A07(j));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TextIndent(firstLine=");
        sbA0x.append((Object) C1809ArT.A02(this.A00));
        sbA0x.append(", restLine=");
        return AnonymousClass007.A0Z(C1809ArT.A02(this.A01), sbA0x);
    }

    public C1810ArU(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
    }
}
