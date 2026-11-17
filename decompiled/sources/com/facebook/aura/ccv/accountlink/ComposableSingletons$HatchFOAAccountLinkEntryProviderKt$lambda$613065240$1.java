package com.facebook.aura.ccv.accountlink;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchFOAAccountLinkScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.ccv.accountlink.ComposableSingletons$HatchFOAAccountLinkEntryProviderKt$lambda$-613065240$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$HatchFOAAccountLinkEntryProviderKt$lambda$613065240$1 extends AbstractC7559F3s implements G0W<HatchFOAAccountLinkScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchFOAAccountLinkEntryProviderKt$lambda$613065240$1 INSTANCE = new ComposableSingletons$HatchFOAAccountLinkEntryProviderKt$lambda$613065240$1();

    public ComposableSingletons$HatchFOAAccountLinkEntryProviderKt$lambda$613065240$1() {
        super(3);
    }

    public final void invoke(HatchFOAAccountLinkScreenKey hatchFOAAccountLinkScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(hatchFOAAccountLinkScreenKey, 0);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        String str = hatchFOAAccountLinkScreenKey.accountTypeWire;
        boolean zA1M = AnonymousClass003.A1M(bfm, auraNavigatorA0b, hatchFOAAccountLinkScreenKey);
        Object objAaT = bfm.AaT();
        if (zA1M || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$HatchFOAAccountLinkEntryProviderKt$lambda$613065240$1$1$1(auraNavigatorA0b, hatchFOAAccountLinkScreenKey);
            bfm.Ai0(objAaT);
        }
        HatchFOAAccountLinkScreenKt.HatchFOAAccountLinkContent(str, (Function0) objAaT, bfm, 0);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HatchFOAAccountLinkScreenKey hatchFOAAccountLinkScreenKey, BFM bfm, Integer num) {
        invoke(hatchFOAAccountLinkScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
