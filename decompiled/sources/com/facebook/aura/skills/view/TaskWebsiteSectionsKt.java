package com.facebook.aura.skills.view;

import X.AHD;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C10G;
import X.C1515AkP;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C78N;
import X.C90l;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.skills.repo.TaskPermissions;
import com.facebook.aura.skills.repo.TaskWebsitePermission;
import com.facebook.aura.skills.view.common.HatchConnectorIconKt;
import com.facebook.aura.skills.viewmodel.TaskPermissionsUiState;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class TaskWebsiteSectionsKt {

    /* renamed from: com.facebook.aura.skills.view.TaskWebsiteSectionsKt$TaskWebsiteRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $isRevoking;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRevoke;
        public final /* synthetic */ TaskWebsitePermission $website;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TaskWebsitePermission taskWebsitePermission, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$website = taskWebsitePermission;
            this.$enabled = z;
            this.$isRevoking = z2;
            this.$onRevoke = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            TaskWebsiteSectionsKt.TaskWebsiteRow(this.$website, this.$enabled, this.$isRevoking, this.$onRevoke, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.TaskWebsiteSectionsKt$TaskWebsiteSections$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onRevoke;
        public final /* synthetic */ TaskPermissionsUiState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(TaskPermissionsUiState taskPermissionsUiState, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$state = taskPermissionsUiState;
            this.$onRevoke = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            TaskWebsiteSectionsKt.TaskWebsiteSections(this.$state, this.$onRevoke, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.TaskWebsiteSectionsKt$TaskWebsiteSections$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onRevoke;
        public final /* synthetic */ TaskPermissionsUiState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(TaskPermissionsUiState taskPermissionsUiState, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$state = taskPermissionsUiState;
            this.$onRevoke = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            TaskWebsiteSectionsKt.TaskWebsiteSections(this.$state, this.$onRevoke, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void TaskWebsiteRow(TaskWebsitePermission taskWebsitePermission, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(-20754685);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, taskWebsitePermission) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long j = auraTheme.getColors(bfm, 6).destructiveText;
            BRg bRgA09 = C3U4.A09(C10G.A09(AnonymousClass001.A0R(bRgA0Q), Float.NaN, 64.0f), AuraDimensKt.SpacingSmall);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 12.0f);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0V);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            HatchConnectorIconKt.m2169ConnectorIconVRRgpyE(taskWebsitePermission.iconUrl, null, null, 0.0f, 0.0f, R.drawable.globe_outline_28, 0.0f, null, null, bfm, 48, 476);
            BS0 bs0 = BRg.A00;
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(taskWebsitePermission.title, null, C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
            String str = taskWebsitePermission.caption;
            if (str == null) {
                bfm.AgE(-1448137182);
                BBI.A0R(bbi, false);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, -1448137181).footnoteRegular, null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            if (taskWebsitePermission.revocable) {
                bfm.AgE(29908115);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120137);
                AuraLabelButtonStyle auraLabelButtonStyleTertiary = AuraButtonStyles.INSTANCE.tertiary(null, bfm, 48, 1);
                AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
                BRg bRgA092 = C10G.A09(bs0, Float.NaN, 48.0f);
                boolean zA1X = AnonymousClass006.A1X(iA0T);
                Object objAaT = bfm.AaT();
                if (zA1X || objAaT == C78N.A00) {
                    objAaT = new TaskWebsiteSectionsKt$TaskWebsiteRow$1$2$1(function0);
                    bfm.Ai0(objAaT);
                }
                Function0 function03 = (Function0) objAaT;
                boolean zA64 = bfm.A64(j);
                Object objAaT2 = bfm.AaT();
                if (zA64 || objAaT2 == C78N.A00) {
                    objAaT2 = new TaskWebsiteSectionsKt$TaskWebsiteRow$1$3$1(j);
                    bfm.Ai0(objAaT2);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgA092, auraLabelButtonStyleTertiary, auraButtonSize, null, false, false, z, z2, false, null, null, function03, null, null, (Function0) objAaT2, null, null, null, null, null, false, 0, false, 0, bfm, ((iA0T << 24) & 1879048192) | 199680, (iA0T >> 6) & 14, 0, 134068677);
            } else {
                bfm.AgE(30359971);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(taskWebsitePermission, z, z2, function0, bRgA0Q, i, i2);
        }
    }

    public static final void TaskWebsiteSections(TaskPermissionsUiState taskPermissionsUiState, G0U<? super String, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass3;
        AHD<TaskWebsitePermission> ahd;
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(taskPermissionsUiState, g0u);
        bfm.AgG(-1012807891);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, taskPermissionsUiState) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            TaskPermissions taskPermissions = taskPermissionsUiState.permissions;
            if (taskPermissions == null || (ahd = taskPermissions.websites) == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new TaskWebsiteSectionsKt$TaskWebsiteSections$websites$1(taskPermissionsUiState, g0u, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass3);
                }
                return;
            }
            if (ahd.isEmpty()) {
                BBb bBbAAc2 = bfm.AAc();
                if (bBbAAc2 != null) {
                    bBbAAc2.A06 = new AnonymousClass1(taskPermissionsUiState, g0u, bRg2, i, i2);
                    return;
                }
                return;
            }
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0D);
            C90l c90l = C90l.A00;
            int iA00 = C01N.A00(bfm, BRg.A00, 24.0f);
            HatchTaskPermissionsScreenKt.TaskPermissionSectionTitle(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210df), null, bfm, 0, 2);
            boolean zA1M = AnonymousClass003.A1M(bfm, ahd, taskPermissionsUiState) | AnonymousClass003.A1C(iA0T);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new TaskWebsiteSectionsKt$TaskWebsiteSections$2$1$1(ahd, taskPermissionsUiState, g0u);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT, bfm, iA00, 7);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(taskPermissionsUiState, g0u, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass3);
        }
    }

    public static final void logTaskWebsiteRevokeClick() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.STATUS, HatchSubsurface.PERMISSIONS, HatchScreen.CONNECTOR_PERMISSIONS_LIST, HatchComponent.PERMISSION_ROW, null, AnonymousClass007.A0d(HatchMetadataKey.PERMISSION_MODE.getValue(), "revoke", C3cG.A0r(HatchMetadataKey.PERMISSION_KEY.getValue(), "websites")), null);
    }
}
