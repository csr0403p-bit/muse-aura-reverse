package com.facebook.aura.ccv.nativeflow.ui;

import X.C7438Evz;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$6$1 extends C7438Evz implements Function0<Boolean> {
    public HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$6$1(Object obj) {
        super(0, obj, HatchCcvViewModel.class, "canStartLinking", "canStartLinking()Z", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((HatchCcvViewModel) this.receiver).canStartLinking());
    }
}
