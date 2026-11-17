package com.facebook.aura.messenger.skills.read.view;

import X.C7438Evz;
import com.facebook.aura.messenger.skills.read.viewmodel.MessengerConnectorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class MessengerPinScreenKt$MessengerPinScreen$4$1 extends C7438Evz implements Function0<Unit> {
    public MessengerPinScreenKt$MessengerPinScreen$4$1(Object obj) {
        super(0, obj, MessengerConnectorViewModel.class, "onTroubleshootingDismissed", "onTroubleshootingDismissed()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((MessengerConnectorViewModel) this.receiver).onTroubleshootingDismissed();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
