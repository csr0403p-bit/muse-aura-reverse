package com.facebook.aura.assist;

import X.AnonymousClass003;
import X.C7438Evz;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class HatchAssistOverlayActivity$onCreate$1$1$1$2$1$1$3$1 extends C7438Evz implements G0V<String, Function0<? extends Unit>, Unit> {
    public HatchAssistOverlayActivity$onCreate$1$1$1$2$1$1$3$1(Object obj) {
        super(2, obj, HatchAssistOverlayActivity.class, "requestPermissionThenRun", "requestPermissionThenRun(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", 0);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, Function0<? extends Unit> function0) {
        invoke2(str, (Function0<Unit>) function0);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, Function0<Unit> function0) {
        AnonymousClass003.A0u(str, function0);
        ((HatchAssistOverlayActivity) this.receiver).requestPermissionThenRun(str, function0);
    }
}
