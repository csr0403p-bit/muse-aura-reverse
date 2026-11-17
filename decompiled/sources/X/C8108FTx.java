package X;

import androidx.core.widget.NestedScrollView;

/* renamed from: X.FTx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8108FTx implements FUR {
    public final /* synthetic */ NestedScrollView A00;

    @Override // X.FUR
    public final boolean Afz(float f) {
        if (f == 0.0f) {
            return false;
        }
        AgS();
        this.A00.A0D((int) f);
        return true;
    }

    public C8108FTx(NestedScrollView nestedScrollView) {
        this.A00 = nestedScrollView;
    }

    @Override // X.FUR
    public final float AJy() {
        return -this.A00.getVerticalScrollFactorCompat();
    }

    @Override // X.FUR
    public final void AgS() {
        NestedScrollView nestedScrollView = this.A00;
        float f = NestedScrollView.A0U;
        nestedScrollView.A09.abortAnimation();
    }
}
