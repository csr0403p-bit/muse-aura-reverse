package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.C78N;
import X.G0W;
import com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsScreenKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ActivePermissionsScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$ActivePermissionsEntryProviderKt$lambda$-387200796$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ActivePermissionsEntryProviderKt$lambda$387200796$1 extends AbstractC7559F3s implements G0W<ActivePermissionsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ActivePermissionsEntryProviderKt$lambda$387200796$1 INSTANCE = new ComposableSingletons$ActivePermissionsEntryProviderKt$lambda$387200796$1();

    public ComposableSingletons$ActivePermissionsEntryProviderKt$lambda$387200796$1() {
        super(3);
    }

    public final void invoke(ActivePermissionsScreenKey activePermissionsScreenKey, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            bfm.Afo();
            return;
        }
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$ActivePermissionsEntryProviderKt$lambda$387200796$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        ActivePermissionsScreenKt.ActivePermissionsScreen((Function0) objAaT, null, null, bfm, 0, 6);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ActivePermissionsScreenKey activePermissionsScreenKey, BFM bfm, Integer num) {
        invoke(activePermissionsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
