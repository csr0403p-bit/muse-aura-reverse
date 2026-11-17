package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.RedeemInviteCodeScreenKey;
import com.facebook.aura.sharesheet.HatchShareDismissLogging;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraInviteFriendSheetKt$AuraInviteFriendSheet$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchShareDismissLogging $dismissLogging;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraInviteFriendSheetKt$AuraInviteFriendSheet$4$1(HatchShareDismissLogging hatchShareDismissLogging, AuraNavigator auraNavigator) {
        super(0);
        this.$dismissLogging = hatchShareDismissLogging;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$dismissLogging.isSuppressed = true;
        this.$navigator.navigate((AuraNavKey) new RedeemInviteCodeScreenKey(null), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
