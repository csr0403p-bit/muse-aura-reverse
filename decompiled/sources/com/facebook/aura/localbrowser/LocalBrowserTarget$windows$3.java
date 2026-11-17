package com.facebook.aura.localbrowser;

import X.C7438Evz;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryJsonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class LocalBrowserTarget$windows$3 extends C7438Evz implements Function0<Unit> {
    public LocalBrowserTarget$windows$3(Object obj) {
        super(0, obj, LocalBrowserFileChooser.class, AuraSubscriptionRepositoryJsonKt.CHANGE_ACTION_CANCEL, "cancel()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((LocalBrowserFileChooser) this.receiver).cancel();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
