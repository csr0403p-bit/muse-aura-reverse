package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.NodeDebugScreenKey;
import com.facebook.aura.settings.HatchNodeDebugScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$NodeDebugEntryProviderKt$lambda$-1455109289$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$NodeDebugEntryProviderKt$lambda$1455109289$1 extends AbstractC7559F3s implements G0W<NodeDebugScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$NodeDebugEntryProviderKt$lambda$1455109289$1 INSTANCE = new ComposableSingletons$NodeDebugEntryProviderKt$lambda$1455109289$1();

    public ComposableSingletons$NodeDebugEntryProviderKt$lambda$1455109289$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(NodeDebugScreenKey nodeDebugScreenKey, BFM bfm, Integer num) {
        invoke(nodeDebugScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(NodeDebugScreenKey nodeDebugScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ComposableSingletons$NodeDebugEntryProviderKt$lambda$1455109289$1$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            HatchNodeDebugScreenKt.HatchNodeDebugScreen((Function0) objAaT, null, null, bfm, 0, 6);
            return;
        }
        bfm.Afo();
    }
}
