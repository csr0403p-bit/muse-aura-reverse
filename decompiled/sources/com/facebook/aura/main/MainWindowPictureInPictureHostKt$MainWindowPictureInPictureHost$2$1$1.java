package com.facebook.aura.main;

import X.C7438Evz;
import com.facebook.aura.json.ClockCardWireActionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class MainWindowPictureInPictureHostKt$MainWindowPictureInPictureHost$2$1$1 extends C7438Evz implements Function0<Unit> {
    public MainWindowPictureInPictureHostKt$MainWindowPictureInPictureHost$2$1$1(Object obj) {
        super(0, obj, MainWindowPipController.class, ClockCardWireActionsKt.CLOCK_ACTION_DISMISS, "dismiss()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((MainWindowPipController) this.receiver).dismiss();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
