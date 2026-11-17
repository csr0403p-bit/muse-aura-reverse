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
import X.C3cH;
import X.C5wL;
import X.C60R;
import X.C78N;
import X.G0V;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.key.AuraMCDebugScreenKey;
import com.facebook.aura.settings.internal.mcdebug.AuraMCDebugScreenKt;
import com.facebook.aura.settings.internal.mcdebug.AuraMCDebugViewModel;
import com.facebook.aura.settings.internal.mcdebug.MCDebugConfigFilter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$MCDebugEntryProviderKt$lambda$-1212729344$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$MCDebugEntryProviderKt$lambda$1212729344$1 extends AbstractC7559F3s implements G0W<AuraMCDebugScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$MCDebugEntryProviderKt$lambda$1212729344$1 INSTANCE = new ComposableSingletons$MCDebugEntryProviderKt$lambda$1212729344$1();

    /* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$MCDebugEntryProviderKt$lambda$-1212729344$1$1, reason: invalid class name */
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
            AuraMCDebugViewModel.Factory factory = new AuraMCDebugViewModel.Factory((MCDebugConfigFilter) null, false, 3, (C06H) null);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            AuraMCDebugViewModel auraMCDebugViewModelA0G = C3cH.A0G(factory, bodA00, AnonymousClass005.A0Y(bodA00), AuraMCDebugViewModel.class);
            boolean zA67 = bfm.A67(this.$navigator);
            AuraNavigator auraNavigator = this.$navigator;
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ComposableSingletons$MCDebugEntryProviderKt$lambda$1212729344$1$1$1$1(auraNavigator);
                BBI.A0T(bfm, objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            boolean zA672 = bfm.A67(this.$navigator);
            AuraNavigator auraNavigator2 = this.$navigator;
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new ComposableSingletons$MCDebugEntryProviderKt$lambda$1212729344$1$1$2$1(auraNavigator2);
                BBI.A0T(bfm, objAaT2);
            }
            AuraMCDebugScreenKt.AuraMCDebugScreenContent(auraMCDebugViewModelA0G, 0, function0, (Function0) objAaT2, bfm, AuraMCDebugViewModel.$stable, 2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public ComposableSingletons$MCDebugEntryProviderKt$lambda$1212729344$1() {
        super(3);
    }

    public final void invoke(AuraMCDebugScreenKey auraMCDebugScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            C60R.A14(bfm, new AnonymousClass1(AKO.A05(AuraNavigatorKt.LocalNavigator, (BBI) bfm)), 1496599305);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AuraMCDebugScreenKey auraMCDebugScreenKey, BFM bfm, Integer num) {
        invoke(auraMCDebugScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
