package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass007;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDataPrivacySettingsScreenKt$DataExportResultDialog$1$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ String $dismissText;
    public final /* synthetic */ Function0<Unit> $onDismiss;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupScope auraButtonGroupScope) {
        C7384Etj.A0Y(auraButtonGroupScope, 0);
        AnonymousClass007.A18(auraButtonGroupScope, this.$dismissText, this.$onDismiss);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDataPrivacySettingsScreenKt$DataExportResultDialog$1$1$1(String str, Function0<Unit> function0) {
        super(1);
        this.$dismissText = str;
        this.$onDismiss = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
