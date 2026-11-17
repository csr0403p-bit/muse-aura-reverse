package com.facebook.aura.ui;

import X.Ab3;
import X.AbstractC7559F3s;
import X.C1BO;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchMeshGradientKt$HatchMeshGradient$quantizedTime$2$1 extends AbstractC7559F3s implements Function0<Integer> {
    public final /* synthetic */ C1BO<Float> $time$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMeshGradientKt$HatchMeshGradient$quantizedTime$2$1(C1BO<Float> c1bo) {
        super(0);
        this.$time$delegate = c1bo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(Ab3.A02(C1BO.A01(this.$time$delegate), 30.0f));
    }
}
