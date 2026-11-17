package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$4$1$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ Function0<Float> $activityBottomAlignmentFraction;
    public final /* synthetic */ RetainedActivityCover $cover;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$4$1$1(RetainedActivityCover retainedActivityCover, Function0<Float> function0) {
        super(0);
        this.$cover = retainedActivityCover;
        this.$activityBottomAlignmentFraction = function0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        EmbodimentClipKind embodimentClipKind = this.$cover.clipKind;
        return Float.valueOf((embodimentClipKind == null || !embodimentClipKind.isActivity()) ? 0.0f : AnonymousClass003.A04(this.$activityBottomAlignmentFraction));
    }
}
