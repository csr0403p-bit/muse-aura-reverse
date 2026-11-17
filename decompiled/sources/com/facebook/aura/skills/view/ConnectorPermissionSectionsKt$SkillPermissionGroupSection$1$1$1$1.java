package com.facebook.aura.skills.view;

import X.AHD;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C07C;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import com.facebook.aura.skills.viewmodel.SkillPermissionMethodUiModel;
import com.facebook.aura.skills.viewmodel.SkillPermissionsUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectorPermissionSectionsKt$SkillPermissionGroupSection$1$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ boolean $isUpdatingMethod;
    public final /* synthetic */ String $menuMethodKey;
    public final /* synthetic */ SkillPermissionMethodUiModel $method;
    public final /* synthetic */ G0U<SkillPermissionMethodUiModel, Unit> $onAdditionalAccessRequested;
    public final /* synthetic */ Function0<Unit> $onDismissMenu;
    public final /* synthetic */ G0U<String, Unit> $onMenuRequested;
    public final /* synthetic */ G0V<SkillPermissionMethodUiModel, ConnectorPermissionMode, Unit> $onMethodModeSelected;
    public final /* synthetic */ SkillPermissionsUiState $uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectorPermissionSectionsKt$SkillPermissionGroupSection$1$1$1$1(SkillPermissionMethodUiModel skillPermissionMethodUiModel, G0U<? super SkillPermissionMethodUiModel, Unit> g0u, boolean z, SkillPermissionsUiState skillPermissionsUiState, String str, G0U<? super String, Unit> g0u2, Function0<Unit> function0, G0V<? super SkillPermissionMethodUiModel, ? super ConnectorPermissionMode, Unit> g0v) {
        super(3);
        this.$method = skillPermissionMethodUiModel;
        this.$onAdditionalAccessRequested = g0u;
        this.$isUpdatingMethod = z;
        this.$uiState = skillPermissionsUiState;
        this.$menuMethodKey = str;
        this.$onMenuRequested = g0u2;
        this.$onDismissMenu = function0;
        this.$onMethodModeSelected = g0v;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        ConnectorPermissionMode connectorPermissionMode;
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            bfm.Afo();
            return;
        }
        if (this.$method.restricted) {
            bfm.AgE(-1360118148);
            String str = this.$method.label;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120136);
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$method, bfm.A65(this.$onAdditionalAccessRequested));
            G0U<SkillPermissionMethodUiModel, Unit> g0u = this.$onAdditionalAccessRequested;
            SkillPermissionMethodUiModel skillPermissionMethodUiModel = this.$method;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new ConnectorPermissionSectionsKt$SkillPermissionGroupSection$1$1$1$1$1$1(g0u, skillPermissionMethodUiModel);
                bfm.Ai0(objAaT);
            }
            ConnectorPermissionSectionsKt.RestrictedPermissionTargetRow(str, strA01, (Function0) objAaT, bfm, 0);
        } else {
            bfm.AgE(-1359838001);
            SkillPermissionMethodUiModel skillPermissionMethodUiModel2 = this.$method;
            String str2 = skillPermissionMethodUiModel2.label;
            if (!this.$isUpdatingMethod || (connectorPermissionMode = this.$uiState.updatingMode) == null) {
                connectorPermissionMode = skillPermissionMethodUiModel2.mode;
            }
            AHD<ConnectorPermissionMode> ahd = skillPermissionMethodUiModel2.modeOptions;
            boolean zAreEqual = C7384Etj.areEqual(this.$menuMethodKey, skillPermissionMethodUiModel2.key);
            boolean z = this.$uiState.updatingMethodKey == null;
            boolean z2 = this.$isUpdatingMethod;
            boolean zA1T2 = AnonymousClass001.A1T(bfm, this.$method, bfm.A65(this.$onMenuRequested));
            G0U<String, Unit> g0u2 = this.$onMenuRequested;
            SkillPermissionMethodUiModel skillPermissionMethodUiModel3 = this.$method;
            Object objAaT2 = bfm.AaT();
            if (zA1T2 || objAaT2 == C78N.A00) {
                objAaT2 = new ConnectorPermissionSectionsKt$SkillPermissionGroupSection$1$1$1$1$2$1(g0u2, skillPermissionMethodUiModel3);
                bfm.Ai0(objAaT2);
            }
            Function0 function0 = (Function0) objAaT2;
            Function0<Unit> function02 = this.$onDismissMenu;
            boolean zA1T3 = AnonymousClass001.A1T(bfm, this.$method, bfm.A65(this.$onMethodModeSelected));
            G0V<SkillPermissionMethodUiModel, ConnectorPermissionMode, Unit> g0v = this.$onMethodModeSelected;
            SkillPermissionMethodUiModel skillPermissionMethodUiModel4 = this.$method;
            Object objAaT3 = bfm.AaT();
            if (zA1T3 || objAaT3 == C78N.A00) {
                objAaT3 = new ConnectorPermissionSectionsKt$SkillPermissionGroupSection$1$1$1$1$3$1(g0v, skillPermissionMethodUiModel4);
                bfm.Ai0(objAaT3);
            }
            ConnectorPermissionSectionsKt.ConnectorPermissionTargetWithContextMenu(str2, connectorPermissionMode, ahd, zAreEqual, z, z2, function0, function02, (G0U) objAaT3, bfm, 0, 0);
        }
        AnonymousClass002.A19(bfm);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
