package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$EmbodimentActivityVideo$4$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ Function0<Float> $bottomAlignmentFraction;
    public final /* synthetic */ EmbodimentClip $clip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbodimentMediaKt$EmbodimentActivityVideo$4$1(EmbodimentClip embodimentClip, Function0<Float> function0) {
        super(0);
        this.$clip = embodimentClip;
        this.$bottomAlignmentFraction = function0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.$clip.kind.isActivity() ? AnonymousClass003.A04(this.$bottomAlignmentFraction) : 0.0f);
    }
}
