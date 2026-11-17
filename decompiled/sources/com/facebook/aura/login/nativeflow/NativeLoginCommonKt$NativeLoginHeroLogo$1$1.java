package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C3VB;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginCommonKt$NativeLoginHeroLogo$1$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ C3VB $progress$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginCommonKt$NativeLoginHeroLogo$1$1(C3VB c3vb) {
        super(0);
        this.$progress$delegate = c3vb;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        C3VB c3vb = this.$progress$delegate;
        int i = NativeLoginCommonKt.IME_EDGE_UNSET;
        return Float.valueOf(C1BO.A01(c3vb));
    }
}
