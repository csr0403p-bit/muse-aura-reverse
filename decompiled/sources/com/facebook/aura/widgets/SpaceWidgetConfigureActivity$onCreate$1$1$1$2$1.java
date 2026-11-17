package com.facebook.aura.widgets;

import X.C7438Evz;
import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class SpaceWidgetConfigureActivity$onCreate$1$1$1$2$1 extends C7438Evz implements Function0<Unit> {
    public SpaceWidgetConfigureActivity$onCreate$1$1$1$2$1(Object obj) {
        super(0, obj, SpaceWidgetConfigureActivity.class, "finish", "finish()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((Activity) this.receiver).finish();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
