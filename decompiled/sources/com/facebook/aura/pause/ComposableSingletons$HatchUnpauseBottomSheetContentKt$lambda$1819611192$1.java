package com.facebook.aura.pause;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C06G;
import X.G0V;
import com.facebook.aura.R;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$HatchUnpauseBottomSheetContentKt$lambda$1819611192$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchUnpauseBottomSheetContentKt$lambda$1819611192$1 INSTANCE = new ComposableSingletons$HatchUnpauseBottomSheetContentKt$lambda$1819611192$1();

    public ComposableSingletons$HatchUnpauseBottomSheetContentKt$lambda$1819611192$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            C06G.A0f(bfm, R.string._name_removed__res_0x7f120db8);
        } else {
            bfm.Afo();
        }
    }
}
