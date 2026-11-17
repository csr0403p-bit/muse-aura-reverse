package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchCcvCardEntryScreenKt$HatchCcvCardEntryScreen$3$1$4$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ String $confirmLabel;
    public final /* synthetic */ boolean $isResolvingLinking;
    public final /* synthetic */ Function0<Unit> $onSubmit;
    public final /* synthetic */ HatchCcvUiState $uiState;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope r11) {
        /*
            r10 = this;
            r0 = 0
            r2 = r11
            X.C7384Etj.A0Y(r11, r0)
            java.lang.String r3 = r10.$confirmLabel
            com.facebook.aura.ccv.nativeflow.ui.HatchCcvUiState r1 = r10.$uiState
            boolean r0 = r1.isSubmitEnabled
            if (r0 == 0) goto L16
            boolean r0 = r1.isSubmitting
            if (r0 != 0) goto L16
            boolean r0 = r10.$isResolvingLinking
            r5 = 1
            if (r0 == 0) goto L17
        L16:
            r5 = 0
        L17:
            boolean r6 = r1.isSubmitting
            kotlin.jvm.functions.Function0<kotlin.Unit> r8 = r10.$onSubmit
            r4 = 0
            java.lang.String r7 = "primary_button"
            r10 = 2147483647(0x7fffffff, float:NaN)
            X.BS0 r11 = X.BRg.A00
            r9 = r4
            r2.primaryButton(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryScreenKt$HatchCcvCardEntryScreen$3$1$4$1.invoke2(com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCcvCardEntryScreenKt$HatchCcvCardEntryScreen$3$1$4$1(String str, HatchCcvUiState hatchCcvUiState, boolean z, Function0<Unit> function0) {
        super(1);
        this.$confirmLabel = str;
        this.$uiState = hatchCcvUiState;
        this.$isResolvingLinking = z;
        this.$onSubmit = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
