package X;

/* loaded from: classes4.dex */
public final class B09 implements B9B {
    public final int A00;
    public final B08 A01;
    public final C1736ApY A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof B09) {
                B09 b09 = (B09) obj;
                if (this.A00 != b09.A00 || !this.A02.equals(b09.A02) || !this.A01.equals(b09.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.B9B
    /* renamed from: getLoadingStrategy-PKNRLFQ */
    public final int mo20getLoadingStrategyPKNRLFQ() {
        return 0;
    }

    @Override // X.B9B
    /* renamed from: getStyle-_-LCdwA, reason: not valid java name */
    public final int mo21getStyle_LCdwA() {
        return 0;
    }

    @Override // X.B9B
    public final C1736ApY getWeight() {
        return this.A02;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0F(this.A02, this.A00 * 31) * 31 * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ResourceFont(resId=");
        sbA0x.append(this.A00);
        sbA0x.append(", weight=");
        sbA0x.append(this.A02);
        sbA0x.append(", style=");
        sbA0x.append((Object) "Normal");
        sbA0x.append(", loadingStrategy=");
        return AnonymousClass007.A0Z("Blocking", sbA0x);
    }

    public B09(B08 b08, C1736ApY c1736ApY, int i) {
        this.A00 = i;
        this.A02 = c1736ApY;
        this.A01 = b08;
    }
}
