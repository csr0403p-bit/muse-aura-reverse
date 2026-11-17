package X;

import android.net.Uri;

/* loaded from: classes5.dex */
public final class DEC extends EuH {
    public final int A00;
    public final int A01;
    public final String A02;

    @Override // X.EuH
    public final String toString() {
        String str = this.A02;
        return str != null ? FGI.A0U(str, ", ", super.toString()) : super.toString();
    }

    public DEC(Uri uri, String str, int i, int i2) {
        super(uri);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }
}
