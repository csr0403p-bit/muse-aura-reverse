package com.facebook.aura.partners.voice.screen;

import X.C7438Evz;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class HatchSystemPipController$hideAvatarHandler$1 extends C7438Evz implements Function0<Boolean> {
    public HatchSystemPipController$hideAvatarHandler$1(Object obj) {
        super(0, obj, HatchSystemPipController.class, "moveTaskToBack", "moveTaskToBack()Z", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((HatchSystemPipController) this.receiver).moveTaskToBack());
    }
}
