package X;

import android.net.Uri;

/* renamed from: X.Evq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7433Evq implements CCV {
    public final String A00;
    public final boolean A01;

    @Override // X.CCV
    public final boolean A75(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        String strA0o = C60O.A0o(uri);
        String str = this.A00;
        C7384Etj.A0Y(str, 1);
        return strA0o.startsWith(str);
    }

    @Override // X.CCV
    public final String AMJ() {
        return this.A00;
    }

    @Override // X.CCV
    public final boolean equals(Object obj) {
        if (!this.A01) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !BV5.A1T(this, obj)) {
            return false;
        }
        return C7384Etj.areEqual(this.A00, ((C7433Evq) obj).A00);
    }

    @Override // X.CCV
    public final int hashCode() {
        return !this.A01 ? super.hashCode() : this.A00.hashCode();
    }

    public C7433Evq(int i, boolean z) {
        this.A01 = z;
        this.A00 = FGI.A0H("anim://", i);
    }
}
