package X;

import android.content.Context;

/* renamed from: X.72q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C059372q implements C76X {
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C059372q) {
                C059372q c059372q = (C059372q) obj;
                long j = this.A00;
                long j2 = c059372q.A00;
                long j3 = B6A.A01;
                if (j != j2 || this.A01 != c059372q.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = B6A.A01;
        return AnonymousClass005.A07(j) + C3cG.A02(this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("DayNightColorProvider(day=");
        AnonymousClass005.A0m(this.A00, sbA0x);
        sbA0x.append(", night=");
        return AnonymousClass007.A0Z(B6A.A07(this.A01), sbA0x);
    }

    public C059372q(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
    }

    @Override // X.C76X
    public final long ADo(Context context) {
        return C60P.A00(context) == 32 ? this.A01 : this.A00;
    }
}
