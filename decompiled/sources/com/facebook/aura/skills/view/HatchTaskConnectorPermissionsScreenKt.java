package com.facebook.aura.skills.view;

import X.AIW;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C07C;
import X.C0924AIa;
import X.C3cG;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.G2j;
import android.text.BidiFormatter;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.skills.repo.TaskPermissionMethod;
import com.facebook.aura.skills.viewmodel.TaskPermissionsUiState;
import com.facebook.aura.skills.viewmodel.TaskPermissionsViewModel;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HatchTaskConnectorPermissionsScreenKt {

    /* renamed from: com.facebook.aura.skills.view.HatchTaskConnectorPermissionsScreenKt$HatchTaskConnectorPermissionsScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C07C, TaskPermissionsUiState, BFM, Integer, Unit> {
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ String $taskName;
        public final /* synthetic */ TaskPermissionsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, TaskPermissionsViewModel taskPermissionsViewModel, String str2) {
            super(4);
            this.$connectorId = str;
            this.$viewModel = taskPermissionsViewModel;
            this.$taskName = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.C07C r16, com.facebook.aura.skills.viewmodel.TaskPermissionsUiState r17, X.BFM r18, int r19) {
            /*
                r15 = this;
                r5 = r16
                r14 = r17
                boolean r6 = X.AnonymousClass004.A1b(r5, r14)
                com.facebook.aura.skills.repo.TaskPermissions r0 = r14.permissions
                r13 = 0
                r11 = r18
                if (r0 == 0) goto L84
                X.AHD<com.facebook.aura.skills.repo.TaskConnectorPermissions> r0 = r0.connectors
                if (r0 == 0) goto L84
                java.lang.String r3 = r15.$connectorId
                java.util.Iterator r2 = r0.iterator()
            L19:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L2f
                java.lang.Object r1 = r2.next()
                r0 = r1
                com.facebook.aura.skills.repo.TaskConnectorPermissions r0 = (com.facebook.aura.skills.repo.TaskConnectorPermissions) r0
                java.lang.String r0 = r0.id
                boolean r0 = X.C7384Etj.areEqual(r0, r3)
                if (r0 == 0) goto L19
                r13 = r1
            L2f:
                com.facebook.aura.skills.repo.TaskConnectorPermissions r13 = (com.facebook.aura.skills.repo.TaskConnectorPermissions) r13
                if (r13 == 0) goto L84
                X.AHD<com.facebook.aura.skills.repo.TaskPermissionMethod> r0 = r13.methods
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L84
                r0 = -1519105051(0xffffffffa5744be5, float:-2.118934E-16)
                r11.AgE(r0)
                boolean r1 = X.AnonymousClass003.A1M(r11, r13, r14)
                java.lang.String r0 = r15.$connectorId
                boolean r1 = X.AnonymousClass001.A1R(r11, r0, r1)
                com.facebook.aura.skills.viewmodel.TaskPermissionsViewModel r0 = r15.$viewModel
                boolean r1 = X.AnonymousClass001.A1T(r11, r0, r1)
                java.lang.String r0 = r15.$taskName
                boolean r0 = X.AnonymousClass001.A1R(r11, r0, r1)
                java.lang.String r3 = r15.$connectorId
                com.facebook.aura.skills.viewmodel.TaskPermissionsViewModel r2 = r15.$viewModel
                java.lang.String r1 = r15.$taskName
                java.lang.Object r10 = r11.AaT()
                if (r0 != 0) goto L67
                java.lang.Object r0 = X.C78N.A00
                if (r10 != r0) goto L75
            L67:
                com.facebook.aura.skills.view.HatchTaskConnectorPermissionsScreenKt$HatchTaskConnectorPermissionsScreen$1$1$1 r10 = new com.facebook.aura.skills.view.HatchTaskConnectorPermissionsScreenKt$HatchTaskConnectorPermissionsScreen$1$1$1
                r12 = r10
                r15 = r3
                r16 = r2
                r17 = r1
                r12.<init>(r13, r14, r15, r16, r17)
                r11.Ai0(r10)
            L75:
                X.G0U r10 = (X.G0U) r10
                r12 = r19 & 14
                r13 = 7
                r7 = 0
                r8 = 0
                com.facebook.aura.ui.HatchSectionKt.m2326HatchSectionuDo3WH8(r5, r6, r7, r8, r10, r11, r12, r13)
            L80:
                X.AnonymousClass001.A1D(r11)
                return
            L84:
                r0 = -1519222386(0xffffffffa572818e, float:-2.1034049E-16)
                r11.AgE(r0)
                r0 = 2131890398(0x7f1210de, float:1.9415487E38)
                java.lang.String r0 = X.AbstractC2271BQs.A01(r11, r0)
                com.facebook.aura.skills.view.ConnectorPermissionSectionsKt.EmptySkillDetailState(r0, r11, r6)
                goto L80
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.view.HatchTaskConnectorPermissionsScreenKt.AnonymousClass1.invoke(X.07C, com.facebook.aura.skills.viewmodel.TaskPermissionsUiState, X.BFM, int):void");
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, TaskPermissionsUiState taskPermissionsUiState, BFM bfm, Integer num) {
            invoke(c07c, taskPermissionsUiState, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchTaskConnectorPermissionsScreenKt$HatchTaskConnectorPermissionsScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ String $connectorName;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $taskId;
        public final /* synthetic */ String $taskName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, String str3, String str4, BRg bRg, int i, int i2) {
            super(2);
            this.$taskId = str;
            this.$taskName = str2;
            this.$connectorId = str3;
            this.$connectorName = str4;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchTaskConnectorPermissionsScreenKt.HatchTaskConnectorPermissionsScreen(this.$taskId, this.$taskName, this.$connectorId, this.$connectorName, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchTaskConnectorPermissionsScreenKt$TaskPermissionMethodRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C138652 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $isUpdating;
        public final /* synthetic */ TaskPermissionMethod $method;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onMenuOpened;
        public final /* synthetic */ G0U<ConnectorPermissionMode, Unit> $onModeSelected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C138652(TaskPermissionMethod taskPermissionMethod, boolean z, boolean z2, G0U<? super ConnectorPermissionMode, Unit> g0u, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$method = taskPermissionMethod;
            this.$enabled = z;
            this.$isUpdating = z2;
            this.$onModeSelected = g0u;
            this.$onMenuOpened = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchTaskConnectorPermissionsScreenKt.TaskPermissionMethodRow(this.$method, this.$enabled, this.$isUpdating, this.$onModeSelected, this.$onMenuOpened, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchTaskConnectorPermissionsScreen(String str, String str2, String str3, String str4, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A11(str2, str3, str4, 1);
        bfm.AgG(-772438486);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str4);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            TaskPermissionsViewModel taskPermissionsViewModelRememberTaskPermissionsViewModel = HatchTaskPermissionsScreenKt.rememberTaskPermissionsViewModel(str, bfm, iA0d & 14);
            String strUnicodeWrap = BidiFormatter.getInstance().unicodeWrap(str2);
            C7384Etj.A0U(strUnicodeWrap);
            HatchTaskPermissionsScreenKt.TaskPermissionsPage(str4, AnonymousClass001.A0t(bfm, strUnicodeWrap, R.string._name_removed__res_0x7f1210dc), taskPermissionsViewModelRememberTaskPermissionsViewModel, HatchScreen.CONNECTOR_PERMISSIONS, bRg2, B1V.A00(bfm, new AnonymousClass1(str3, taskPermissionsViewModelRememberTaskPermissionsViewModel, str2), -802501002), bfm, (iA0d & 57344) | ((iA0d >> 9) & 14) | 199680, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, str3, str4, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TaskPermissionMethodRow(com.facebook.aura.skills.repo.TaskPermissionMethod r42, boolean r43, boolean r44, X.G0U<? super com.facebook.aura.agentpermission.ConnectorPermissionMode, kotlin.Unit> r45, kotlin.jvm.functions.Function0<kotlin.Unit> r46, X.BRg r47, X.BFM r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.view.HatchTaskConnectorPermissionsScreenKt.TaskPermissionMethodRow(com.facebook.aura.skills.repo.TaskPermissionMethod, boolean, boolean, X.G0U, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    public static final void logTaskMethodMenuClick(String str, String str2) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.STATUS, HatchSubsurface.PERMISSIONS, HatchScreen.CONNECTOR_PERMISSIONS, HatchComponent.THREE_DOTS_MENU, str2, AnonymousClass007.A0c(HatchMetadataKey.PROVIDER, str), null);
    }

    public static final void logTaskMethodModeClick(String str, String str2, ConnectorPermissionMode connectorPermissionMode) {
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.STATUS;
        HatchSubsurface hatchSubsurface = HatchSubsurface.PERMISSIONS;
        HatchScreen hatchScreen = HatchScreen.CONNECTOR_PERMISSIONS;
        HatchComponent hatchComponent = connectorPermissionMode != null ? HatchComponent.PERMISSION_ROW : HatchComponent.RESET_DEFAULTS_BUTTON;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        if (connectorPermissionMode != null) {
            c0924AIaA0u.put(HatchMetadataKey.PERMISSION_MODE.getValue(), connectorPermissionMode.getWireValue());
        }
        AnonymousClass001.A1C(HatchMetadataKey.PROVIDER, str, c0924AIaA0u);
        hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, str2, AIW.A0K(c0924AIaA0u), null);
    }
}
