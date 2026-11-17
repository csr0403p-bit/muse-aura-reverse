package com.facebook.aura.nodes.cards;

import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.utils.HatchPermissionUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchNotificationOptInCardKt$rememberNotificationOptInAction$openSettings$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ NotificationOptInStore $store;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNotificationOptInCardKt$rememberNotificationOptInAction$openSettings$1$1(NotificationOptInStore notificationOptInStore, Context context) {
        super(0);
        this.$store = notificationOptInStore;
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$store.logEvent("outcome", "opened_settings");
        this.$store.logInteraction("opened_settings");
        HatchPermissionUtils.INSTANCE.openNotificationSettings(this.$context);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
