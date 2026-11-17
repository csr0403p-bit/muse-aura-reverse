package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import android.content.Context;
import android.widget.Toast;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraInviteFriendSheetKt$AuraInviteFriendSheet$onInviteUnavailable$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $inviteUnavailableMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraInviteFriendSheetKt$AuraInviteFriendSheet$onInviteUnavailable$1$1(Context context, String str) {
        super(0);
        this.$context = context;
        this.$inviteUnavailableMessage = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Toast.makeText(this.$context, this.$inviteUnavailableMessage, 0).show();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
