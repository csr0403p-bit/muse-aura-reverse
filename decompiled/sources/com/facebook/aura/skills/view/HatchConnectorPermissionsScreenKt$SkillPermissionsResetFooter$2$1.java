package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchConnectorPermissionsScreenKt$SkillPermissionsResetFooter$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $connectorId;
    public final /* synthetic */ SkillPermissionsViewModel $skillPermissionsViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorPermissionsScreenKt$SkillPermissionsResetFooter$2$1(String str, SkillPermissionsViewModel skillPermissionsViewModel) {
        super(0);
        this.$connectorId = str;
        this.$skillPermissionsViewModel = skillPermissionsViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchConnectorPermissionsScreenKt.logPermissionsReset(this.$connectorId);
        this.$skillPermissionsViewModel.resetToDefaults();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
