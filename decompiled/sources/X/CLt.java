package X;

import android.net.Uri;

/* loaded from: classes5.dex */
public final class CLt {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Uri A03;
    public final String A04;
    public final boolean A05;

    public CLt(String str, String str2) {
        this.A03 = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.A01 = 0;
        this.A02 = 400;
        this.A05 = false;
        this.A04 = str2;
        this.A00 = 0;
    }

    public CLt(Uri uri, String str, int i, int i2, int i3, boolean z) {
        uri.getClass();
        this.A03 = uri;
        this.A01 = i;
        this.A02 = i2;
        this.A05 = z;
        this.A04 = str;
        this.A00 = i3;
    }
}
