package com.facebook.aura.activation.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C1110AYw;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.activation.view.HatchRedeemInviteCodeScreenKt$RedeemInviteCodeContent$1$1$1", f = "HatchRedeemInviteCodeScreen.kt", l = {248}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchRedeemInviteCodeScreenKt$RedeemInviteCodeContent$1$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1110AYw $scrollState;
    public final /* synthetic */ HatchRedeemInviteCodeViewModel.UiState $uiState;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRedeemInviteCodeScreenKt$RedeemInviteCodeContent$1$1$1(HatchRedeemInviteCodeViewModel.UiState uiState, C1110AYw c1110AYw, HtJ<? super HatchRedeemInviteCodeScreenKt$RedeemInviteCodeContent$1$1$1> htJ) {
        super(2, htJ);
        this.$uiState = uiState;
        this.$scrollState = c1110AYw;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchRedeemInviteCodeScreenKt$RedeemInviteCodeContent$1$1$1(this.$uiState, this.$scrollState, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$uiState.error != null) {
                C1110AYw c1110AYw = this.$scrollState;
                int iAGd = c1110AYw.A01.AGd();
                this.label = 1;
                if (C3cG.A0U(ScrollExtensionsKt.A00(AnonymousClass003.A0Q(null), c1110AYw, this, iAGd - c1110AYw.A04.AGd())) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchRedeemInviteCodeScreenKt$RedeemInviteCodeContent$1$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
