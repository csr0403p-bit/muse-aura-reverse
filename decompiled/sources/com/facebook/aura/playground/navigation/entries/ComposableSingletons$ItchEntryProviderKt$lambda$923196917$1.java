package com.facebook.aura.playground.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.playground.itch.ItchScreenKt;
import com.facebook.aura.playground.navigation.key.ItchScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$ItchEntryProviderKt$lambda$923196917$1 extends AbstractC7559F3s implements G0W<ItchScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ItchEntryProviderKt$lambda$923196917$1 INSTANCE = new ComposableSingletons$ItchEntryProviderKt$lambda$923196917$1();

    public ComposableSingletons$ItchEntryProviderKt$lambda$923196917$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ItchScreenKey itchScreenKey, BFM bfm, Integer num) {
        invoke(itchScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ItchScreenKey itchScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ComposableSingletons$ItchEntryProviderKt$lambda$923196917$1$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            ItchScreenKt.ItchScreen((Function0) objAaT, null, bfm, 0, 2);
            return;
        }
        bfm.Afo();
    }
}
