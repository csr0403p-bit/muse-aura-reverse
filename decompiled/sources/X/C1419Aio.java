package X;

import android.graphics.BlendModeColorFilter;

/* renamed from: X.Aio, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1419Aio extends C1423Ais {
    public final int A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1419Aio) {
                long j = this.A01;
                C1419Aio c1419Aio = (C1419Aio) obj;
                long j2 = c1419Aio.A01;
                long j3 = B6A.A01;
                if (j != j2 || this.A00 != c1419Aio.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        long j2 = B6A.A01;
        return C3cI.A01(j) + this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("BlendModeColorFilter(color=");
        AnonymousClass005.A0m(this.A01, sbA0x);
        sbA0x.append(", blendMode=");
        return AnonymousClass007.A0Z(C1422Air.A00(this.A00), sbA0x);
    }

    public C1419Aio(long j, int i) {
        super(new BlendModeColorFilter(HxS.A01(j), AbstractC8721FjM.A00(i)));
        this.A01 = j;
        this.A00 = i;
    }
}
