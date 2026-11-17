package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C1BO;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class InviteCodeScratcherKt$InviteCodeScratcher$isFoilVisible$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ C1BO<Float> $foilAlpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteCodeScratcherKt$InviteCodeScratcher$isFoilVisible$2$1(C1BO<Float> c1bo) {
        super(0);
        this.$foilAlpha = c1bo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(AnonymousClass002.A1N((C1BO.A01(this.$foilAlpha) > 0.0f ? 1 : (C1BO.A01(this.$foilAlpha) == 0.0f ? 0 : -1))));
    }
}
