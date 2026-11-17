package com.facebook.aura.navigation;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class BlockingOverlayScene$content$1$4$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ BlockingOverlayScene<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockingOverlayScene$content$1$4$1(BlockingOverlayScene<T> blockingOverlayScene) {
        super(2);
        this.this$0 = blockingOverlayScene;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            this.this$0.entry.A00(bfm, 0);
        } else {
            bfm.Afo();
        }
    }
}
