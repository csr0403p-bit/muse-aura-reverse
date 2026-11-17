package X;

import android.view.View;

/* renamed from: X.FQx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8046FQx implements FQJ {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C8040FQr A01;

    public C8046FQx(View view, C8040FQr c8040FQr) {
        this.A00 = view;
        this.A01 = c8040FQr;
    }

    @Override // X.FQJ
    public final void AVx() {
        AbstractC8043FQu.A00(this.A01, 0.0f);
    }

    @Override // X.FQJ
    public final void AVy(int i) {
        int height = this.A00.getHeight();
        if (height > 0) {
            AbstractC8043FQu.A00(this.A01, (i * 1.0f) / height);
        }
    }

    @Override // X.FQJ
    public final void AVz(int i) {
        int height = this.A00.getHeight();
        if (height > 0) {
            AbstractC8043FQu.A00(this.A01, (i * 1.0f) / height);
        }
    }
}
