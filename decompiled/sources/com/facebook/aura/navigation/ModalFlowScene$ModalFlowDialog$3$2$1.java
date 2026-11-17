package com.facebook.aura.navigation;

import X.AbstractC7559F3s;
import X.C1BO;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ModalFlowScene$ModalFlowDialog$3$2$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ C1BO<Float> $progress$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalFlowScene$ModalFlowDialog$3$2$1(C1BO<Float> c1bo) {
        super(0);
        this.$progress$delegate = c1bo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(C1BO.A01(this.$progress$delegate));
    }
}
