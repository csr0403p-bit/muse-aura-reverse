package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.C0jP;
import X.CFK;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class SubscriptionSheetHelpersKt$optOutMessage$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $groupUrl;
    public final /* synthetic */ C0jP $uriHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionSheetHelpersKt$optOutMessage$1$1(C0jP c0jP, String str) {
        super(0);
        this.$uriHandler = c0jP;
        this.$groupUrl = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        try {
            this.$uriHandler.openUri(this.$groupUrl);
        } catch (Exception e) {
            CFK.A0A(SubscriptionSheetHelpersKt.TAG, "Failed to open opt-out workplace group URL", e);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
