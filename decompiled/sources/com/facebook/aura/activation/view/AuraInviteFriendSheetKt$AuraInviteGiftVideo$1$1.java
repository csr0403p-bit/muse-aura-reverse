package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraInviteFriendSheetKt$AuraInviteGiftVideo$1$1 extends AbstractC7559F3s implements G0U<Exception, Unit> {
    public final /* synthetic */ Function0<Unit> $onMediaError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraInviteFriendSheetKt$AuraInviteGiftVideo$1$1(Function0<Unit> function0) {
        super(1);
        this.$onMediaError = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
        this.$onMediaError.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Exception exc) {
        this.$onMediaError.invoke();
    }
}
