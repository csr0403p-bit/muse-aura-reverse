package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C7384Etj;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$2$1$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ String $imageKey;
    public final /* synthetic */ C1BO<Float> $staticAlpha;
    public final /* synthetic */ String $stillKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$2$1$1(String str, String str2, C1BO<Float> c1bo) {
        super(0);
        this.$imageKey = str;
        this.$stillKey = str2;
        this.$staticAlpha = c1bo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(C7384Etj.areEqual(this.$imageKey, this.$stillKey) ? C1BO.A01(this.$staticAlpha) : 0.0f);
    }
}
