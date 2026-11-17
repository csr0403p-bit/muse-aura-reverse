package X;

import com.facebook.tigon.TigonError;
import java.io.InputStream;

/* renamed from: X.Clj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4086Clj {
    public CYF A01 = null;
    public InputStream A03 = null;
    public CY1 A02 = null;
    public TigonError A00 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4086Clj) {
                C4086Clj c4086Clj = (C4086Clj) obj;
                if (!C7384Etj.areEqual(this.A01, c4086Clj.A01) || !C7384Etj.areEqual(this.A03, c4086Clj.A03) || !C7384Etj.areEqual(this.A02, c4086Clj.A02) || !C7384Etj.areEqual(this.A00, c4086Clj.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass006.A0D(this.A01) * 31) + AnonymousClass006.A0D(this.A03)) * 31) + AnonymousClass006.A0D(this.A02)) * 31) + AnonymousClass006.A0D(this.A00)) * 31;
    }

    public final String toString() {
        CYF cyf = this.A01;
        InputStream inputStream = this.A03;
        CY1 cy1 = this.A02;
        TigonError tigonError = this.A00;
        StringBuilder sbA0f = C3cG.A0f(cyf, "TigonResult(response=");
        sbA0f.append(", body=");
        sbA0f.append(inputStream);
        sbA0f.append(", summary=");
        sbA0f.append(cy1);
        sbA0f.append(", error=");
        sbA0f.append(tigonError);
        return C3cJ.A0L(null, ", token=", sbA0f);
    }
}
