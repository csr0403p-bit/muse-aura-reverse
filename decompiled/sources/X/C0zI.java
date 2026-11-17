package X;

/* renamed from: X.0zI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0zI extends AVy {
    public float A00 = 1.0f;
    public C1423Ais A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0zI) {
                long j = this.A02;
                long j2 = ((C0zI) obj).A02;
                long j3 = B6A.A01;
                if (j == j2) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AVy
    public final boolean applyAlpha(float f) {
        this.A00 = f;
        return true;
    }

    @Override // X.AVy
    public final boolean applyColorFilter(C1423Ais c1423Ais) {
        this.A01 = c1423Ais;
        return true;
    }

    public final int hashCode() {
        long j = this.A02;
        long j2 = B6A.A01;
        return AnonymousClass002.A0A(j);
    }

    @Override // X.AVy
    public final void onDraw(AT3 at3) {
        long j = this.A02;
        ART.A03(this.A01, at3, this.A00, 86, j, 0L, 0L);
    }

    public final String toString() {
        return AnonymousClass007.A0Z(B6A.A07(this.A02), new StringBuilder("ColorPainter(color="));
    }

    public C0zI(long j) {
        this.A02 = j;
    }

    @Override // X.AVy
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo0getIntrinsicSizeNHjbRc() {
        return 9205357640488583168L;
    }
}
