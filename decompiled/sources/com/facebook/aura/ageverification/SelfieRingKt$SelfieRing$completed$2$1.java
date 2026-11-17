package com.facebook.aura.ageverification;

import X.AHD;
import X.AbstractC7559F3s;
import X.C1BO;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SelfieRingKt$SelfieRing$completed$2$1 extends AbstractC7559F3s implements Function0<AHD<? extends HeadMovement>> {
    public final /* synthetic */ C1BO<SelfieCaptureState> $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieRingKt$SelfieRing$completed$2$1(C1BO<SelfieCaptureState> c1bo) {
        super(0);
        this.$state = c1bo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AHD<? extends HeadMovement> invoke() {
        return this.$state.getValue().completed;
    }
}
