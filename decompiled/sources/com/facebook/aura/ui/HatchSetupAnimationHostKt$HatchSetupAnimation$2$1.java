package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.C18j;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSetupAnimationHostKt$HatchSetupAnimation$2$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ C18j $lottie;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSetupAnimationHostKt$HatchSetupAnimation$2$1(C18j c18j) {
        super(0);
        this.$lottie = c18j;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.$lottie.getProgress());
    }
}
