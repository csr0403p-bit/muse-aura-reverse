package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchStatusScreenKey;
import com.facebook.aura.navigation.key.HatchStatusTab;
import com.facebook.aura.status.view.HatchStatusScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ComposableSingletons$HatchStatusEntryProviderKt$lambda$1333053720$1 extends AbstractC7559F3s implements G0W<HatchStatusScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchStatusEntryProviderKt$lambda$1333053720$1 INSTANCE = new ComposableSingletons$HatchStatusEntryProviderKt$lambda$1333053720$1();

    public ComposableSingletons$HatchStatusEntryProviderKt$lambda$1333053720$1() {
        super(3);
    }

    public final void invoke(HatchStatusScreenKey hatchStatusScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(hatchStatusScreenKey, 0);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        HatchStatusTab hatchStatusTab = hatchStatusScreenKey.initialTab;
        String str = hatchStatusScreenKey.initialExtensionTab;
        String str2 = hatchStatusScreenKey.initialExtensionAction;
        String str3 = hatchStatusScreenKey.sessionId;
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$HatchStatusEntryProviderKt$lambda$1333053720$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        HatchStatusScreenKt.HatchStatusScreen((Function0) objAaT, null, hatchStatusTab, str, str2, str3, null, null, bfm, 0, 194);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HatchStatusScreenKey hatchStatusScreenKey, BFM bfm, Integer num) {
        invoke(hatchStatusScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
