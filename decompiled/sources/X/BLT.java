package X;

import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes4.dex */
public final class BLT {
    public final Uri A00;
    public final Bundle A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BLT) {
                BLT blt = (BLT) obj;
                if (!C7384Etj.areEqual(this.A00, blt.A00) || !C7384Etj.areEqual(this.A01, blt.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, C60R.A01(this.A00) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("PlatformTransferableContent(linkUri=");
        sbA0x.append(this.A00);
        sbA0x.append(", extras=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public BLT(Uri uri, Bundle bundle) {
        this.A00 = uri;
        this.A01 = bundle;
    }
}
