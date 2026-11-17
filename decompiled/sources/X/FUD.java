package X;

import android.view.ScrollFeedbackProvider;
import android.view.View;

/* loaded from: classes6.dex */
public final class FUD implements FUI {
    public final ScrollFeedbackProvider A00;

    @Override // X.FUI
    public final void AVd(int i, int i2, int i3, boolean z) {
        this.A00.onScrollLimit(i, i2, i3, z);
    }

    @Override // X.FUI
    public final void AVe(int i, int i2, int i3, int i4) {
        this.A00.onScrollProgress(i, i2, i3, i4);
    }

    public FUD(View view) {
        this.A00 = ScrollFeedbackProvider.createProvider(view);
    }
}
