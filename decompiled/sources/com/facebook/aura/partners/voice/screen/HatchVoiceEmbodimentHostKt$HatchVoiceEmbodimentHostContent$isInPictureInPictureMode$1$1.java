package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchVoiceEmbodimentHostKt$HatchVoiceEmbodimentHostContent$isInPictureInPictureMode$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $fullScreen;
    public final /* synthetic */ HatchStatusPillMetrics $metrics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceEmbodimentHostKt$HatchVoiceEmbodimentHostContent$isInPictureInPictureMode$1$1(boolean z, HatchStatusPillMetrics hatchStatusPillMetrics) {
        super(0);
        this.$fullScreen = z;
        this.$metrics = hatchStatusPillMetrics;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$fullScreen) {
            return;
        }
        this.$metrics.setAvatarExpanded(false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
