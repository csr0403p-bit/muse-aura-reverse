package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.composer.dictation.WaveformBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$HatchComposer$stopDictation$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ Function0<Unit> $stop;
    public final /* synthetic */ String $threadId;
    public final /* synthetic */ WaveformBuffer $waveformBuffer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$HatchComposer$stopDictation$1$1$1(WaveformBuffer waveformBuffer, boolean z, String str, Function0<Unit> function0) {
        super(0);
        this.$waveformBuffer = waveformBuffer;
        this.$isPrimaryThread = z;
        this.$threadId = str;
        this.$stop = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (MutableState.A0A(this.$waveformBuffer.isProcessing$delegate)) {
            return;
        }
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.CHAT;
        HatchSubsurface hatchSubsurface = HatchSubsurface.COMPOSER;
        boolean z = this.$isPrimaryThread;
        hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, HatchInteractionEnumsKt.chatScreen(z), HatchComponent.VOICE_DICTATION_STOP_BUTTON, null, AnonymousClass002.A0o(null, this.$threadId, z), null);
        this.$stop.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
