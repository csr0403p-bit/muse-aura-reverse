package com.facebook.aura.settings;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFM;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchPermissionsSettingsScreenKt$HatchPermissionsSettingsScreen$1$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ int $connectorCount;
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: com.facebook.aura.settings.HatchPermissionsSettingsScreenKt$HatchPermissionsSettingsScreen$1$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ int $connectorCount;
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, AuraNavigator auraNavigator) {
            super(3);
            this.$connectorCount = i;
            this.$navigator = auraNavigator;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ee4);
                C1062ATq c1062ATq = C10G.A02;
                String strValueOf = String.valueOf(this.$connectorCount);
                boolean zA67 = bfm.A67(this.$navigator);
                AuraNavigator auraNavigator = this.$navigator;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchPermissionsSettingsScreenKt$HatchPermissionsSettingsScreen$1$1$1$1$1$1$1(auraNavigator);
                    bfm.Ai0(objAaT);
                }
                HatchSettingsCardsKt.HatchSettingsNavigationCard(strA01, null, (Function0) objAaT, c1062ATq, strValueOf, bfm, 3120, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchPermissionsSettingsScreenKt$HatchPermissionsSettingsScreen$1$1$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AuraNavigator auraNavigator) {
            super(3);
            this.$navigator = auraNavigator;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f51);
                C1062ATq c1062ATq = C10G.A02;
                boolean zA67 = bfm.A67(this.$navigator);
                AuraNavigator auraNavigator = this.$navigator;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchPermissionsSettingsScreenKt$HatchPermissionsSettingsScreen$1$1$1$1$2$1$1(auraNavigator);
                    bfm.Ai0(objAaT);
                }
                HatchSettingsCardsKt.HatchSettingsNavigationCard(strA01, null, (Function0) objAaT, c1062ATq, null, bfm, 3120, 16);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(this.$connectorCount, this.$navigator), 2046782267);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass2(this.$navigator), -319721422);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPermissionsSettingsScreenKt$HatchPermissionsSettingsScreen$1$1$1$1(int i, AuraNavigator auraNavigator) {
        super(1);
        this.$connectorCount = i;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
