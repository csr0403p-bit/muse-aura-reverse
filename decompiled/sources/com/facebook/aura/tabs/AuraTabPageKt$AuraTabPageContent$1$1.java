package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C1BO;
import X.EnumC10573Huf;
import X.G0V;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraTabPageKt$AuraTabPageContent$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ C1BO<EnumC10573Huf> $lifecycleState$delegate;
    public final /* synthetic */ AuraTabRootNavKey $tabRoot;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraTabPageKt$AuraTabPageContent$1$1(AuraTabRootNavKey auraTabRootNavKey, C1BO<? extends EnumC10573Huf> c1bo) {
        super(2);
        this.$tabRoot = auraTabRootNavKey;
        this.$lifecycleState$delegate = c1bo;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AuraTabBarHostKt.AuraTabBarHost(this.$tabRoot, (AuraTabBarHostState) bfm.A6v(AuraTabBarHostKt.LocalAuraTabBarHostState), null, this.$lifecycleState$delegate.getValue().A00(EnumC10573Huf.A05), bfm, 0, 4);
        } else {
            bfm.Afo();
        }
    }
}
