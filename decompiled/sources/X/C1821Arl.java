package X;

/* renamed from: X.Arl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1821Arl {
    public final int A00;
    public final long A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1821Arl) {
                long j = this.A02;
                C1821Arl c1821Arl = (C1821Arl) obj;
                long j2 = c1821Arl.A02;
                C1813ArX[] c1813ArXArr = C1809ArT.A02;
                if (j != j2 || this.A01 != c1821Arl.A01 || this.A00 != c1821Arl.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A02;
        C1813ArX[] c1813ArXArr = C1809ArT.A02;
        return AnonymousClass006.A06(this.A01, AnonymousClass005.A07(j)) + this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Placeholder(width=");
        sbA0x.append((Object) C1809ArT.A02(this.A02));
        sbA0x.append(", height=");
        sbA0x.append((Object) C1809ArT.A02(this.A01));
        sbA0x.append(", placeholderVerticalAlign=");
        int i = this.A00;
        return AnonymousClass007.A0Z(i == 4 ? "Center" : i == 5 ? "TextTop" : "TextCenter", sbA0x);
    }

    public C1821Arl(long j, long j2, int i) {
        String str;
        this.A02 = j;
        this.A01 = j2;
        this.A00 = i;
        C1813ArX[] c1813ArXArr = C1809ArT.A02;
        if ((j & 1095216660480L) == 0) {
            str = "width cannot be TextUnit.Unspecified";
        } else if ((j2 & 1095216660480L) != 0) {
            return;
        } else {
            str = "height cannot be TextUnit.Unspecified";
        }
        throw C60O.A0i(str);
    }
}
