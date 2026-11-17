package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C60R;
import X.C78N;
import X.G0V;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.StatusSettingsScreenKey;
import com.facebook.aura.settings.internal.AuraInternalStatusSettingsScreenKt;
import com.facebook.aura.settings.internal.AuraInternalStatusViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ComposableSingletons$AuraInternalStatusSettingsEntryProviderKt$lambda$548569093$1 extends AbstractC7559F3s implements G0W<StatusSettingsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$AuraInternalStatusSettingsEntryProviderKt$lambda$548569093$1 INSTANCE = new ComposableSingletons$AuraInternalStatusSettingsEntryProviderKt$lambda$548569093$1();

    /* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$AuraInternalStatusSettingsEntryProviderKt$lambda$548569093$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraNavigator auraNavigator) {
            super(2);
            this.$navigator = auraNavigator;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            boolean zA67 = bfm.A67(this.$navigator);
            AuraNavigator auraNavigator = this.$navigator;
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ComposableSingletons$AuraInternalStatusSettingsEntryProviderKt$lambda$548569093$1$1$1$1(auraNavigator);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            boolean zA672 = bfm.A67(this.$navigator);
            AuraNavigator auraNavigator2 = this.$navigator;
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new ComposableSingletons$AuraInternalStatusSettingsEntryProviderKt$lambda$548569093$1$1$2$1(auraNavigator2);
                bfm.Ai0(objAaT2);
            }
            AuraInternalStatusSettingsScreenKt.AuraInternalStatusSettingsScreen(function0, (Function0) objAaT2, (BRg) null, (AuraInternalStatusViewModel) null, bfm, 0, 12);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public ComposableSingletons$AuraInternalStatusSettingsEntryProviderKt$lambda$548569093$1() {
        super(3);
    }

    public final void invoke(StatusSettingsScreenKey statusSettingsScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            C60R.A14(bfm, new AnonymousClass1(AnonymousClass002.A0b(bfm)), 1431677724);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(StatusSettingsScreenKey statusSettingsScreenKey, BFM bfm, Integer num) {
        invoke(statusSettingsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
