package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: X.FRw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8068FRw implements Hqo {
    public int A00;
    public int A01;
    public ClipData A02;
    public Uri A03;
    public Bundle A04;

    @Override // X.Hqo
    public final C8071FRz A5P() {
        return new C8071FRz(new C8067FRv(this));
    }

    @Override // X.Hqo
    public final void Ad1(ClipData clipData) {
        this.A02 = clipData;
    }

    @Override // X.Hqo
    public final void AdQ(int i) {
        this.A00 = i;
    }

    @Override // X.Hqo
    public final void Add(Uri uri) {
        this.A03 = uri;
    }

    @Override // X.Hqo
    public final void setExtras(Bundle bundle) {
        this.A04 = bundle;
    }
}
