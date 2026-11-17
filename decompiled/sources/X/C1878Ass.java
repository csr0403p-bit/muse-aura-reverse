package X;

/* renamed from: X.Ass, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1878Ass {
    public static final C1878Ass A05 = new C1878Ass(C79.A00, 0.0f, 9205357640488583168L, false, false);
    public final float A00;
    public final long A01;
    public final Integer A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1878Ass) {
                C1878Ass c1878Ass = (C1878Ass) obj;
                if (this.A04 != c1878Ass.A04 || this.A01 != c1878Ass.A01 || Float.compare(this.A00, c1878Ass.A00) != 0 || this.A02 != c1878Ass.A02 || this.A03 != c1878Ass.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iA02 = AnonymousClass005.A02(C60R.A00(this.A01, C0KA.A02(this.A04)), this.A00);
        int iIntValue = this.A02.intValue();
        return C0KA.A00((iA02 + (iIntValue != 0 ? "Rtl" : "Ltr").hashCode() + iIntValue) * 31, this.A03);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TextFieldHandleState(visible=");
        sbA0x.append(this.A04);
        sbA0x.append(", position=");
        AWx.A0E(this.A01, sbA0x);
        sbA0x.append(", lineHeight=");
        sbA0x.append(this.A00);
        sbA0x.append(", direction=");
        sbA0x.append(AbstractC2052AxP.A00(this.A02));
        sbA0x.append(", handlesCrossed=");
        sbA0x.append(this.A03);
        return AnonymousClass006.A0z(sbA0x);
    }

    public C1878Ass(Integer num, float f, long j, boolean z, boolean z2) {
        this.A04 = z;
        this.A01 = j;
        this.A00 = f;
        this.A02 = num;
        this.A03 = z2;
    }
}
