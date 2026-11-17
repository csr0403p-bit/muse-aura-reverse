package com.facebook.aura.settings;

import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.ApQ;
import X.B6A;
import X.BFM;
import X.BO6;
import X.BRg;
import X.C06H;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1822Arm;
import X.C1YL;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.settings.api.SettingsConnectionsRowContributor;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSettingsScreenKt$HatchSettingsScreen$24$1$3$1 extends AbstractC7559F3s implements G0V<HatchSectionScope, Boolean, Unit> {
    public final /* synthetic */ HatchSettingsConfig $config;
    public final /* synthetic */ List<SettingsConnectionsRowContributor> $connectionsRows;
    public final /* synthetic */ Function0<Unit> $onChannelsSettingsClick;
    public final /* synthetic */ Function0<Unit> $onConnectedAppsSettingsClick;
    public final /* synthetic */ Function0<Unit> $onConnectedDevicesSettingsClick;
    public final /* synthetic */ Function0<Unit> $onEncryptionSettingsClick;
    public final /* synthetic */ Function0<Unit> $onPermissionsSettingsClick;
    public final /* synthetic */ Function0<Unit> $onWalletSettingsClick;
    public final /* synthetic */ boolean $showChannelsRow;

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$HatchSettingsScreen$24$1$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onConnectedAppsSettingsClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0) {
            super(3);
            this.$onConnectedAppsSettingsClick = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AuraCardType.ChevronNavigation chevronNavigation = new AuraCardType.ChevronNavigation(null);
                BRg bRgA00 = AbstractC07539Wl.A00(C10G.A02, "hatch-settings-connected-apps-button");
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass006.A0Y(bfm, R.string._name_removed__res_0x7f120ee4), AuraIconAndHeadlineStyle.BODY_REGULAR, (BO6) null, (B6A) null, (ApQ) null, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097148, (C06H) null);
                G0V<BFM, Integer, Unit> g0v = ComposableSingletons$HatchSettingsScreenKt.f250lambda$132385128;
                boolean zA65 = bfm.A65(this.$onConnectedAppsSettingsClick);
                Function0<Unit> function0 = this.$onConnectedAppsSettingsClick;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchSettingsScreenKt$HatchSettingsScreen$24$1$3$1$1$1$1(function0);
                    bfm.Ai0(objAaT);
                }
                AuraCardKt.m2484AuraCardjQVUvHA(bRgA00, auraCardStyleCardStyleForSettings, auraCardContent, chevronNavigation, g0v, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 27654, 0, 262048);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$HatchSettingsScreen$24$1$3$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onWalletSettingsClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0) {
            super(3);
            this.$onWalletSettingsClick = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AuraCardType.ChevronNavigation chevronNavigation = new AuraCardType.ChevronNavigation(null);
                BRg bRgA00 = AbstractC07539Wl.A00(C10G.A02, "hatch-settings-wallet-button");
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass006.A0Y(bfm, R.string._name_removed__res_0x7f120235), AuraIconAndHeadlineStyle.BODY_REGULAR, (BO6) null, (B6A) null, (ApQ) null, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097148, (C06H) null);
                G0V<BFM, Integer, Unit> g0v = ComposableSingletons$HatchSettingsScreenKt.f252lambda$1970878079;
                boolean zA65 = bfm.A65(this.$onWalletSettingsClick);
                Function0<Unit> function0 = this.$onWalletSettingsClick;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchSettingsScreenKt$HatchSettingsScreen$24$1$3$1$2$1$1(function0);
                    bfm.Ai0(objAaT);
                }
                AuraCardKt.m2484AuraCardjQVUvHA(bRgA00, auraCardStyleCardStyleForSettings, auraCardContent, chevronNavigation, g0v, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 27654, 0, 262048);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$HatchSettingsScreen$24$1$3$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onPermissionsSettingsClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Function0<Unit> function0) {
            super(3);
            this.$onPermissionsSettingsClick = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f52);
                C1062ATq c1062ATq = C10G.A02;
                Integer numValueOf = Integer.valueOf(R.drawable.ic_permission_hand);
                boolean zA65 = bfm.A65(this.$onPermissionsSettingsClick);
                Function0<Unit> function0 = this.$onPermissionsSettingsClick;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchSettingsScreenKt$HatchSettingsScreen$24$1$3$1$3$1$1(function0);
                    bfm.Ai0(objAaT);
                }
                HatchSettingsCardsKt.HatchSettingsNavigationCard(strA01, numValueOf, (Function0) objAaT, c1062ATq, null, bfm, 3072, 16);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$HatchSettingsScreen$24$1$3$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onChannelsSettingsClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Function0<Unit> function0) {
            super(3);
            this.$onChannelsSettingsClick = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AuraCardType.ChevronNavigation chevronNavigation = new AuraCardType.ChevronNavigation(null);
                C1062ATq c1062ATq = C10G.A02;
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass006.A0Y(bfm, R.string._name_removed__res_0x7f120ee1), AuraIconAndHeadlineStyle.BODY_REGULAR, (BO6) null, (B6A) null, (ApQ) null, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097148, (C06H) null);
                G0V<BFM, Integer, Unit> g0v = ComposableSingletons$HatchSettingsScreenKt.f255lambda$602898881;
                boolean zA65 = bfm.A65(this.$onChannelsSettingsClick);
                Function0<Unit> function0 = this.$onChannelsSettingsClick;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchSettingsScreenKt$HatchSettingsScreen$24$1$3$1$4$1$1(function0);
                    bfm.Ai0(objAaT);
                }
                AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, chevronNavigation, g0v, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 27654, 0, 262048);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$HatchSettingsScreen$24$1$3$1$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onConnectedDevicesSettingsClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Function0<Unit> function0) {
            super(3);
            this.$onConnectedDevicesSettingsClick = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AuraCardType.ChevronNavigation chevronNavigation = new AuraCardType.ChevronNavigation(null);
                C1062ATq c1062ATq = C10G.A02;
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass006.A0Y(bfm, R.string._name_removed__res_0x7f120ee6), AuraIconAndHeadlineStyle.BODY_REGULAR, (BO6) null, (B6A) null, (ApQ) null, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097148, (C06H) null);
                G0V<BFM, Integer, Unit> g0v = ComposableSingletons$HatchSettingsScreenKt.lambda$81090718;
                boolean zA65 = bfm.A65(this.$onConnectedDevicesSettingsClick);
                Function0<Unit> function0 = this.$onConnectedDevicesSettingsClick;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchSettingsScreenKt$HatchSettingsScreen$24$1$3$1$5$1$1(function0);
                    bfm.Ai0(objAaT);
                }
                AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, chevronNavigation, g0v, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 27654, 0, 262048);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$HatchSettingsScreen$24$1$3$1$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onEncryptionSettingsClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(Function0<Unit> function0) {
            super(3);
            this.$onEncryptionSettingsClick = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                HatchSettingsScreenKt.EncryptionCard(this.$onEncryptionSettingsClick, null, bfm, 0, 2);
            } else {
                bfm.Afo();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSettingsScreenKt$HatchSettingsScreen$24$1$3$1(HatchSettingsConfig hatchSettingsConfig, boolean z, List<? extends SettingsConnectionsRowContributor> list, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06) {
        super(2);
        this.$config = hatchSettingsConfig;
        this.$showChannelsRow = z;
        this.$connectionsRows = list;
        this.$onConnectedAppsSettingsClick = function0;
        this.$onWalletSettingsClick = function02;
        this.$onPermissionsSettingsClick = function03;
        this.$onChannelsSettingsClick = function04;
        this.$onConnectedDevicesSettingsClick = function05;
        this.$onEncryptionSettingsClick = function06;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope, Boolean bool) {
        invoke(hatchSectionScope, AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    public final void invoke(HatchSectionScope hatchSectionScope, boolean z) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        if (this.$config.showConnectedApps) {
            AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(this.$onConnectedAppsSettingsClick), -1139995972);
        }
        if (this.$config.showWallet) {
            AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass2(this.$onWalletSettingsClick), 377709733);
        }
        hatchSectionScope.item(ComposableSingletons$HatchSettingsScreenKt.lambda$917215543);
        if (this.$config.showPermissions) {
            AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass3(this.$onPermissionsSettingsClick), 1061699332);
        }
        if (this.$showChannelsRow) {
            AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass4(this.$onChannelsSettingsClick), 1745688931);
        }
        if (this.$config.showConnectedDevices) {
            AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass5(this.$onConnectedDevicesSettingsClick), -1865288766);
        }
        if (this.$config.showEncryption && z) {
            AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass6(this.$onEncryptionSettingsClick), -1181299167);
        }
        Iterator<SettingsConnectionsRowContributor> it = this.$connectionsRows.iterator();
        while (it.hasNext()) {
            AnonymousClass005.A0u(hatchSectionScope, new HatchSettingsScreenKt$HatchSettingsScreen$24$1$3$1$7$1(it.next()), 1390170331);
        }
    }
}
