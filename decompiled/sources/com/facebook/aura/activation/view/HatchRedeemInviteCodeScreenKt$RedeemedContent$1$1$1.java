package com.facebook.aura.activation.view;

import X.AOW;
import X.ASj;
import X.AT5;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C2HU;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.activation.view.HatchRedeemInviteCodeScreenKt$RedeemedContent$1$1$1", f = "HatchRedeemInviteCodeScreen.kt", l = {187}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchRedeemInviteCodeScreenKt$RedeemedContent$1$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AT5<Float, AOW> $copyAlpha;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRedeemInviteCodeScreenKt$RedeemedContent$1$1$1(AT5<Float, AOW> at5, HtJ<? super HatchRedeemInviteCodeScreenKt$RedeemedContent$1$1$1> htJ) {
        super(2, htJ);
        this.$copyAlpha = at5;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchRedeemInviteCodeScreenKt$RedeemedContent$1$1$1(this.$copyAlpha, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AT5<Float, AOW> at5 = this.$copyAlpha;
            Float fA0m = AnonymousClass001.A0m();
            ASj aSj = new ASj(C2HU.A02, 420, 90);
            this.label = 1;
            if (AnonymousClass002.A0i(at5, aSj, fA0m, this, null) == enumC10460Hji) {
                return enumC10460Hji;
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
        return new HatchRedeemInviteCodeScreenKt$RedeemedContent$1$1$1(this.$copyAlpha, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
