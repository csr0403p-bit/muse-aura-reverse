package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.activation.model.HatchInviteLogging;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraInviteFriendSheetKt$AuraInviteFriendSheet$6$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $isInviteCodeRevealed$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraInviteFriendSheetKt$AuraInviteFriendSheet$6$1$1$1$1(MutableState<Boolean> mutableState) {
        super(0);
        this.$isInviteCodeRevealed$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInviteLogging.INSTANCE.logTicketCardReveal();
        MutableState.A09(true, this.$isInviteCodeRevealed$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
