package com.facebook.aura.pairs;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ConnectionsRuleEditorScreenKt$ConnectionsRuleEditorFooter$1$3$1 extends C7438Evz implements Function0<Unit> {
    public ConnectionsRuleEditorScreenKt$ConnectionsRuleEditorFooter$1$3$1(Object obj) {
        super(0, obj, ConnectionsRuleEditorViewModel.class, "delete", "delete()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ConnectionsRuleEditorViewModel) this.receiver).delete();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
