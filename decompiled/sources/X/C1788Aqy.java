package X;

/* renamed from: X.Aqy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1788Aqy implements InterfaceC1829Art {
    public final long A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1788Aqy) {
                long j = this.A00;
                long j2 = ((C1788Aqy) obj).A00;
                long j3 = B6A.A01;
                if (j == j2) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1829Art
    public final C1EQ AD4() {
        return null;
    }

    @Override // X.InterfaceC1829Art
    public final long ADn() {
        return this.A00;
    }

    @Override // X.InterfaceC1829Art
    public final float getAlpha() {
        return B6A.A00(this.A00);
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = B6A.A01;
        return AnonymousClass002.A0A(j);
    }

    public final String toString() {
        return AnonymousClass007.A0Z(B6A.A07(this.A00), C60O.A0x("ColorStyle(value="));
    }

    public C1788Aqy(long j) {
        this.A00 = j;
        if (j == 16) {
            throw C60O.A0i("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }
}
