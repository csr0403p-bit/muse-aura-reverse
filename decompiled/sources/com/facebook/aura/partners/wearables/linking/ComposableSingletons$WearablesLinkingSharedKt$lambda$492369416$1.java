package com.facebook.aura.partners.wearables.linking;

import X.AGI;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0V;
import com.facebook.aura.R;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ComposableSingletons$WearablesLinkingSharedKt$lambda$492369416$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$WearablesLinkingSharedKt$lambda$492369416$1 INSTANCE = new ComposableSingletons$WearablesLinkingSharedKt$lambda$492369416$1();

    public ComposableSingletons$WearablesLinkingSharedKt$lambda$492369416$1() {
        super(2);
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            WearablesLinkingSharedKt.UnavailableFeaturesGrid(AGI.A0E(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c0e), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c0d), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c0f), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c11), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c10)), null, null, bfm, 0, 6);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
