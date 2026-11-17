package X;

import android.net.Uri;

/* loaded from: classes6.dex */
public final class FJ1 extends C06G {
    public final Uri A00;
    public final String A01;
    public final Float A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FJ1) {
                FJ1 fj1 = (FJ1) obj;
                if (!C7384Etj.areEqual(this.A00, fj1.A00) || !C7384Etj.areEqual(this.A02, fj1.A02) || !C7384Etj.areEqual(this.A01, fj1.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A01, (AnonymousClass005.A0E(this.A00) + AnonymousClass006.A0D(this.A02)) * 31);
    }

    public FJ1(Uri uri, Float f, String str) {
        this.A00 = uri;
        this.A02 = f;
        this.A01 = str;
    }
}
