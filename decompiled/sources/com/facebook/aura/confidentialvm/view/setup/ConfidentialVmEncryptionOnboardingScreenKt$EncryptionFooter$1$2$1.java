package com.facebook.aura.confidentialvm.view.setup;

import X.AbstractC7559F3s;
import X.BRg;
import X.BS0;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupStyleByScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmEncryptionOnboardingScreenKt$EncryptionFooter$1$2$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupStyleByScope, Unit> {
    public final /* synthetic */ Function0<Unit> $onSkipClick;
    public final /* synthetic */ Function0<Unit> $onTryClick;
    public final /* synthetic */ String $skipText;
    public final /* synthetic */ String $tryText;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope) {
        C7384Etj.A0Y(auraButtonGroupStyleByScope, 0);
        String str = this.$tryText;
        Function0<Unit> function0 = this.$onTryClick;
        BS0 bs0 = BRg.A00;
        int i = AuraHaptics.BUTTON_TAP;
        auraButtonGroupStyleByScope.mo2449buttonLKWACpY(str, null, null, true, false, null, function0, null, bs0, i);
        auraButtonGroupStyleByScope.mo2449buttonLKWACpY(this.$skipText, null, null, true, false, null, this.$onSkipClick, null, bs0, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmEncryptionOnboardingScreenKt$EncryptionFooter$1$2$1(String str, Function0<Unit> function0, String str2, Function0<Unit> function02) {
        super(1);
        this.$tryText = str;
        this.$onTryClick = function0;
        this.$skipText = str2;
        this.$onSkipClick = function02;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope) {
        invoke2(auraButtonGroupStyleByScope);
        return Unit.INSTANCE;
    }
}
