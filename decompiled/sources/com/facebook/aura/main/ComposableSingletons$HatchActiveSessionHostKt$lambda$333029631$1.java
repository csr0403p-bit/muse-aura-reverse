package com.facebook.aura.main;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.C7384Etj;
import X.G0V;
import X.G2k;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import com.facebook.aura.tabs.AuraTabPageKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.main.ComposableSingletons$HatchActiveSessionHostKt$lambda$-333029631$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$HatchActiveSessionHostKt$lambda$333029631$1 extends AbstractC7559F3s implements G2k<AuraTabRootNavKey, AuraNavKey, G0V<? super BFM, ? super Integer, ? extends Unit>, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchActiveSessionHostKt$lambda$333029631$1 INSTANCE = new ComposableSingletons$HatchActiveSessionHostKt$lambda$333029631$1();

    public ComposableSingletons$HatchActiveSessionHostKt$lambda$333029631$1() {
        super(5);
    }

    public final void invoke(AuraTabRootNavKey auraTabRootNavKey, AuraNavKey auraNavKey, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        C7384Etj.A0Y(g0v, 2);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(auraTabRootNavKey, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(auraNavKey, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            AuraTabPageKt.AuraTabPage(auraTabRootNavKey, auraNavKey, g0v, null, bfm, iA05 & 1022, 8);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G2k
    public /* bridge */ /* synthetic */ Unit invoke(AuraTabRootNavKey auraTabRootNavKey, AuraNavKey auraNavKey, G0V<? super BFM, ? super Integer, ? extends Unit> g0v, BFM bfm, Integer num) {
        invoke(auraTabRootNavKey, auraNavKey, (G0V<? super BFM, ? super Integer, Unit>) g0v, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
