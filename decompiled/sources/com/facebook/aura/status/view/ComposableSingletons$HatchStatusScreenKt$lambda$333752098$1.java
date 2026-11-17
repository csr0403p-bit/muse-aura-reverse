package com.facebook.aura.status.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C06G;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.status.view.ComposableSingletons$HatchStatusScreenKt$lambda$-333752098$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$HatchStatusScreenKt$lambda$333752098$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchStatusScreenKt$lambda$333752098$1 INSTANCE = new ComposableSingletons$HatchStatusScreenKt$lambda$333752098$1();

    public ComposableSingletons$HatchStatusScreenKt$lambda$333752098$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12102b), null, C06G.A0C(bfm), C06G.A0V(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            return;
        }
        bfm.Afo();
    }
}
