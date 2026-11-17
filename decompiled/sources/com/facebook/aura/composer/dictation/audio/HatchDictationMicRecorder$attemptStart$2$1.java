package com.facebook.aura.composer.dictation.audio;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.composer.dictation.audio.HatchDictationMicRecorder;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class HatchDictationMicRecorder$attemptStart$2$1 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
    public final /* synthetic */ HatchDictationMicRecorder.RecorderSession $recorderSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDictationMicRecorder$attemptStart$2$1(HatchDictationMicRecorder.RecorderSession recorderSession) {
        super(1);
        this.$recorderSession = recorderSession;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        this.$recorderSession.release();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$recorderSession.release();
    }
}
