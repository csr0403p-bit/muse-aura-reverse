package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C00q;
import X.G0U;
import com.facebook.aura.audio.HatchAudioPlayerRepository;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchCompactAudioPlayerKt$ActiveCompactAudioWaveform$2$1 extends AbstractC7559F3s implements G0U<Float, Unit> {
    public final /* synthetic */ int $durationMs;
    public final /* synthetic */ C00q $scrubFraction;
    public final /* synthetic */ HatchAudioPlayerRepository $service;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCompactAudioPlayerKt$ActiveCompactAudioWaveform$2$1(HatchAudioPlayerRepository hatchAudioPlayerRepository, int i, C00q c00q) {
        super(1);
        this.$service = hatchAudioPlayerRepository;
        this.$durationMs = i;
        this.$scrubFraction = c00q;
    }

    public final void invoke(float f) {
        this.$service.seekTo((int) (f * this.$durationMs));
        this.$scrubFraction.AdS(-1.0f);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke(AnonymousClass001.A02(f));
        return Unit.INSTANCE;
    }
}
