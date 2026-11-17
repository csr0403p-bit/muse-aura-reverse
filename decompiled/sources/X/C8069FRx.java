package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* renamed from: X.FRx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8069FRx implements Hqo {
    public final ContentInfo.Builder A00;

    @Override // X.Hqo
    public final C8071FRz A5P() {
        return new C8071FRz(new C8070FRy(this.A00.build()));
    }

    @Override // X.Hqo
    public final void Ad1(ClipData clipData) {
        this.A00.setClip(clipData);
    }

    @Override // X.Hqo
    public final void AdQ(int i) {
        this.A00.setFlags(i);
    }

    @Override // X.Hqo
    public final void Add(Uri uri) {
        this.A00.setLinkUri(uri);
    }

    @Override // X.Hqo
    public final void setExtras(Bundle bundle) {
        this.A00.setExtras(bundle);
    }

    public C8069FRx(C8071FRz c8071FRz) {
        this.A00 = new ContentInfo.Builder(c8071FRz.A01());
    }

    public C8069FRx(ClipData clipData, int i) {
        this.A00 = new ContentInfo.Builder(clipData, i);
    }
}
