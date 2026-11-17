package com.facebook.aura.navigation.entries;

import X.AKO;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BBI;
import X.BFM;
import X.BOD;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C60R;
import X.C78N;
import X.G0V;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.key.AuraOverlayConfigDebugScreenKey;
import com.facebook.aura.settings.internal.mcdebug.AuraMCDebugScreenKt;
import com.facebook.aura.settings.internal.mcdebug.AuraMCDebugViewModel;
import com.facebook.aura.settings.internal.mcdebug.MCDebugConfigFilter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$MCDebugEntryProviderKt$lambda$1149678249$1 extends AbstractC7559F3s implements G0W<AuraOverlayConfigDebugScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$MCDebugEntryProviderKt$lambda$1149678249$1 INSTANCE = new ComposableSingletons$MCDebugEntryProviderKt$lambda$1149678249$1();

    /* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$MCDebugEntryProviderKt$lambda$1149678249$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraNavigator auraNavigator) {
            super(2);
            this.$navigator = auraNavigator;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                bfm.Afo();
                return;
            }
            AuraMCDebugViewModel.Factory factory = new AuraMCDebugViewModel.Factory(MCDebugConfigFilter.OVERLAY_CONFIGS, false, 2, (C06H) null);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            AuraMCDebugViewModel auraMCDebugViewModelA0H = C3cH.A0H(factory, bodA00, AnonymousClass005.A0Y(bodA00), C3cG.A0x(AuraMCDebugViewModel.class));
            boolean zA67 = bfm.A67(this.$navigator);
            AuraNavigator auraNavigator = this.$navigator;
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ComposableSingletons$MCDebugEntryProviderKt$lambda$1149678249$1$1$1$1(auraNavigator);
                BBI.A0T(bfm, objAaT);
            }
            AuraMCDebugScreenKt.AuraMCDebugScreenContent(auraMCDebugViewModelA0H, R.string._name_removed__res_0x7f120451, (Function0) objAaT, (Function0) null, bfm, AuraMCDebugViewModel.$stable, 8);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public ComposableSingletons$MCDebugEntryProviderKt$lambda$1149678249$1() {
        super(3);
    }

    public final void invoke(AuraOverlayConfigDebugScreenKey auraOverlayConfigDebugScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            C60R.A14(bfm, new AnonymousClass1(AKO.A05(AuraNavigatorKt.LocalNavigator, (BBI) bfm)), 485267008);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AuraOverlayConfigDebugScreenKey auraOverlayConfigDebugScreenKey, BFM bfm, Integer num) {
        invoke(auraOverlayConfigDebugScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
