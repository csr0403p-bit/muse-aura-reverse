package X;

import android.net.Uri;

/* loaded from: classes5.dex */
public final class ELN {
    public final Uri A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(BV5.A0N(obj))) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
                ELN eln = (ELN) obj;
                if (!this.A00.equals(eln.A00) || this.A01 != eln.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A00(AnonymousClass005.A0E(this.A00), this.A01);
    }

    public ELN(boolean z, Uri uri) {
        this.A00 = uri;
        this.A01 = z;
    }
}
