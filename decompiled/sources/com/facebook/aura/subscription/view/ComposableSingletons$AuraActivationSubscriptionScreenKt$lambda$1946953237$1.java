package com.facebook.aura.subscription.view;

import X.AVy;
import X.AYD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C10G;
import X.C1SA;
import X.G0V;
import com.facebook.aura.R;
import kotlin.Unit;

/* renamed from: com.facebook.aura.subscription.view.ComposableSingletons$AuraActivationSubscriptionScreenKt$lambda$-1946953237$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$AuraActivationSubscriptionScreenKt$lambda$1946953237$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$AuraActivationSubscriptionScreenKt$lambda$1946953237$1 INSTANCE = new ComposableSingletons$AuraActivationSubscriptionScreenKt$lambda$1946953237$1();

    public ComposableSingletons$AuraActivationSubscriptionScreenKt$lambda$1946953237$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
            C1SA.A00(bfm, null, AYD.A01(C10G.A07(BRg.A00, AnonymousClass002.A0d(bfm).icon.xLarge), 0.0f, AuraActivationSubscriptionScreenKt.ActivationLogoDrop), null, BOf.A00(bfm, R.drawable.hatch_logo, 0), null, null, 0.0f, AVy.$stable | 48, 120);
        } else {
            bfm.Afo();
        }
    }
}
