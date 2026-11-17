package X;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: X.Ddi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5225Ddi {
    public final String A00;
    public final String[] A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5225Ddi)) {
            return false;
        }
        C5225Ddi c5225Ddi = (C5225Ddi) obj;
        if (C7384Etj.areEqual(this.A02, c5225Ddi.A02) && Arrays.deepEquals(this.A01, c5225Ddi.A01)) {
            return C8j3.A1W(this.A00, c5225Ddi.A00, false);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        return Arrays.deepHashCode(new Serializable[]{(Serializable) this.A01, this.A02, this.A00});
    }

    public final String toString() {
        return FGI.A0k("QueryArguments(providerPath=", this.A02, ", projection=", Arrays.toString(this.A01), ", selection=", this.A00, ")");
    }

    public C5225Ddi(String str, String str2, String[] strArr) {
        this.A02 = str;
        this.A01 = strArr;
        this.A00 = str2;
    }
}
