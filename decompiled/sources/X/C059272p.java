package X;

import android.content.Context;

/* renamed from: X.72p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C059272p implements C76X {
    public final long A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C059272p) {
                long j = this.A00;
                long j2 = ((C059272p) obj).A00;
                long j3 = B6A.A01;
                if (j == j2) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C76X
    public final long ADo(Context context) {
        return this.A00;
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = B6A.A01;
        return AnonymousClass002.A0A(j);
    }

    public final String toString() {
        return AnonymousClass007.A0Z(B6A.A07(this.A00), C60O.A0x("FixedColorProvider(color="));
    }

    public C059272p(long j) {
        this.A00 = j;
    }
}
