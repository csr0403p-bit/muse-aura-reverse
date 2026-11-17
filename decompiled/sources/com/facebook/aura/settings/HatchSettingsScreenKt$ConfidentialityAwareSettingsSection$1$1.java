package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSettingsScreenKt$ConfidentialityAwareSettingsSection$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ G0V<HatchSectionScope, Boolean, Unit> $content;
    public final /* synthetic */ C1BO<ConfidentialVmSwitchUiState> $switchState$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        this.$content.invoke(hatchSectionScope, Boolean.valueOf(this.$switchState$delegate.getValue().isEncryptionShown()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSettingsScreenKt$ConfidentialityAwareSettingsSection$1$1(G0V<? super HatchSectionScope, ? super Boolean, Unit> g0v, C1BO<ConfidentialVmSwitchUiState> c1bo) {
        super(1);
        this.$content = g0v;
        this.$switchState$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
