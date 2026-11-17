package X;

import android.graphics.Bitmap;

/* renamed from: X.2ad, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05202ad extends AVy {
    public int A00 = 1;
    public float A01;
    public C1423Ais A02;
    public final InterfaceC2178B0w A03;
    public final long A04;
    public final long A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C05202ad) {
                C05202ad c05202ad = (C05202ad) obj;
                if (!C7384Etj.areEqual(this.A03, c05202ad.A03) || this.A05 != c05202ad.A05 || this.A00 != c05202ad.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public C05202ad(InterfaceC2178B0w interfaceC2178B0w, long j) {
        int i;
        int i2;
        this.A03 = interfaceC2178B0w;
        this.A05 = j;
        if (((int) (0 >> 32)) >= 0 && (i = (int) (j >> 32)) >= 0 && (i2 = (int) (4294967295L & j)) >= 0) {
            Bitmap bitmap = ((B1T) interfaceC2178B0w).A00;
            if (i <= bitmap.getWidth() && i2 <= bitmap.getHeight()) {
                this.A04 = j;
                this.A01 = 1.0f;
                return;
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // X.AVy
    public final boolean applyAlpha(float f) {
        this.A01 = f;
        return true;
    }

    @Override // X.AVy
    public final boolean applyColorFilter(C1423Ais c1423Ais) {
        this.A02 = c1423Ais;
        return true;
    }

    @Override // X.AVy
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo0getIntrinsicSizeNHjbRc() {
        return AQY.A01(this.A04);
    }

    public final int hashCode() {
        return AnonymousClass006.A06(this.A05, (AnonymousClass005.A0E(this.A03) + ((int) (0 >>> 32))) * 31) + this.A00;
    }

    @Override // X.AVy
    public final void onDraw(AT3 at3) {
        InterfaceC2178B0w interfaceC2178B0w = this.A03;
        long j = this.A05;
        int iRound = Math.round(AnonymousClass001.A00(at3.AKb()));
        float f = this.A01;
        C1423Ais c1423Ais = this.A02;
        int i = this.A00;
        at3.A9Q(c1423Ais, interfaceC2178B0w, C16a.A00, f, 3, i, 0L, j, 0L, (Math.round(AnonymousClass001.A01(r0, 4294967295L)) & 4294967295L) | (iRound << 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.A03);
        sb.append(", srcOffset=");
        sb.append((Object) FGI.A0Q("(", ", ", ')', (int) (0 >> 32), AnonymousClass002.A09(0L)));
        sb.append(", srcSize=");
        sb.append((Object) BL4.A01(this.A05));
        sb.append(", filterQuality=");
        sb.append((Object) (this.A00 == 0 ? "None" : "Low"));
        sb.append(')');
        return sb.toString();
    }
}
