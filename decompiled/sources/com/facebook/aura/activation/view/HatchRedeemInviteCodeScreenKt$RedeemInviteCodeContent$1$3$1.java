package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchRedeemInviteCodeScreenKt$RedeemInviteCodeContent$1$3$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ Function0<Unit> $onConfirmClick;
    public final /* synthetic */ String $redeemText;
    public final /* synthetic */ HatchRedeemInviteCodeViewModel.UiState $uiState;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope r12) {
        /*
            r11 = this;
            r0 = 0
            r3 = r12
            X.C7384Etj.A0Y(r12, r0)
            java.lang.String r4 = r11.$redeemText
            com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$UiState r2 = r11.$uiState
            java.lang.String r0 = r2.inviteCode
            int r1 = r0.length()
            r0 = 6
            if (r1 < r0) goto L17
            boolean r0 = r2.isLoading
            r6 = 1
            if (r0 == 0) goto L18
        L17:
            r6 = 0
        L18:
            boolean r7 = r2.isLoading
            kotlin.jvm.functions.Function0<kotlin.Unit> r9 = r11.$onConfirmClick
            r5 = 0
            java.lang.String r8 = "primary_button"
            r11 = 2147483647(0x7fffffff, float:NaN)
            X.BS0 r12 = X.BRg.A00
            r10 = r5
            r3.primaryButton(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.view.HatchRedeemInviteCodeScreenKt$RedeemInviteCodeContent$1$3$1.invoke2(com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRedeemInviteCodeScreenKt$RedeemInviteCodeContent$1$3$1(String str, HatchRedeemInviteCodeViewModel.UiState uiState, Function0<Unit> function0) {
        super(1);
        this.$redeemText = str;
        this.$uiState = uiState;
        this.$onConfirmClick = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
