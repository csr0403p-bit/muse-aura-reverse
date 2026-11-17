package X;

/* renamed from: X.Arz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1835Arz implements C1OS {
    public static final long A05 = C19U.A04(8589934592L, 1.0f);
    public static final C1835Arz A06;
    public final long A00;
    public final long A01;
    public final long A02;
    public final C1DM A03;
    public final C16b A04;

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            z = false;
            if (obj != null && (obj instanceof C1835Arz) && this.A03.equals(((C1835Arz) obj).A03)) {
                C1813ArX[] c1813ArXArr = C1809ArT.A02;
            }
        }
        return z;
    }

    public final int hashCode() {
        int iA0E = AnonymousClass005.A0E(this.A03);
        long j = this.A02;
        C1813ArX[] c1813ArXArr = C1809ArT.A02;
        return AnonymousClass005.A0G(this.A04, AnonymousClass005.A02(AnonymousClass006.A06(this.A01, AnonymousClass006.A06(this.A00, AnonymousClass006.A06(j, iA0E))) * 31, Float.NaN));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Bullet(shape=");
        sbA0x.append(this.A03);
        sbA0x.append(", size=(");
        sbA0x.append((Object) C1809ArT.A02(this.A02));
        C8j3.A1K(sbA0x);
        sbA0x.append((Object) C1809ArT.A02(this.A00));
        sbA0x.append("), padding=");
        sbA0x.append((Object) C1809ArT.A02(this.A01));
        C8j4.A1R(sbA0x, ", brush=");
        sbA0x.append(", alpha=");
        sbA0x.append(Float.NaN);
        sbA0x.append(", drawStyle=");
        return AnonymousClass007.A0Z(this.A04, sbA0x);
    }

    public C1835Arz(C1DM c1dm, C16b c16b, long j, long j2, long j3) {
        this.A03 = c1dm;
        this.A02 = j;
        this.A00 = j2;
        this.A01 = j3;
        this.A04 = c16b;
    }

    static {
        long jA00 = C19U.A00(0.25d);
        A06 = new C1835Arz(C1DF.A00, C16a.A00, jA00, jA00, C19U.A00(0.25d));
    }
}
