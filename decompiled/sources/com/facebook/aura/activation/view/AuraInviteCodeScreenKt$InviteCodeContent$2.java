package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0U;
import X.G0V;
import com.facebook.aura.activation.data.HatchActivationWaitlistInviteCopy;
import com.facebook.aura.activation.model.InviteCodeError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraInviteCodeScreenKt$InviteCodeContent$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ String $code;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ InviteCodeError $error;
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ G0U<String, Unit> $onCodeChange;
    public final /* synthetic */ Function0<Unit> $onContinueClick;
    public final /* synthetic */ HatchActivationWaitlistInviteCopy.Screen $screenCopy;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraInviteCodeScreenKt$InviteCodeContent$2(float f, float f2, String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, boolean z, boolean z2, InviteCodeError inviteCodeError, HatchActivationWaitlistInviteCopy.Screen screen, int i) {
        super(2);
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$code = str;
        this.$onCodeChange = g0u;
        this.$onContinueClick = function0;
        this.$isLoading = z;
        this.$enabled = z2;
        this.$error = inviteCodeError;
        this.$screenCopy = screen;
        this.$$changed = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraInviteCodeScreenKt.m124InviteCodeContentlVwrFTI(this.$topPadding, this.$bottomPadding, this.$code, this.$onCodeChange, this.$onContinueClick, this.$isLoading, this.$enabled, this.$error, this.$screenCopy, bfm, AnonymousClass011.A00(this.$$changed));
    }
}
