package com.facebook.aura.partners.voice.runtime;

import X.AbstractC7559F3s;
import X.BLG;
import X.C3cH;
import X.G0U;
import com.facebook.aura.partners.voice.api.VoiceCallManager;
import com.facebook.aura.partners.voice.intf.VoiceCallPhase;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoiceCallUiState;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceCallSessionOwner$observeCallState$4 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
    public final /* synthetic */ long $callGeneration;
    public final /* synthetic */ VoiceCallStateHolder $holder;
    public final /* synthetic */ VoiceCallManager $manager;
    public final /* synthetic */ BLG<VoiceCallUiState> $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallSessionOwner$observeCallState$4(BLG<VoiceCallUiState> blg, VoiceCallManager voiceCallManager, VoiceCallStateHolder voiceCallStateHolder, long j) {
        super(1);
        this.$state = blg;
        this.$manager = voiceCallManager;
        this.$holder = voiceCallStateHolder;
        this.$callGeneration = j;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        VoiceCallUiState value;
        VoiceCallUiState value2;
        BLG<VoiceCallUiState> blg = this.$state;
        VoiceCallManager voiceCallManager = this.$manager;
        VoiceCallStateHolder voiceCallStateHolder = this.$holder;
        long j = this.$callGeneration;
        do {
            value = blg.getValue();
            VoiceCallUiState voiceCallUiState = value;
            value2 = voiceCallManager.getCallState().getValue();
            VoiceCallUiState voiceCallUiState2 = value2;
            VoiceCallPhase voiceCallPhase = voiceCallUiState2.phase;
            VoiceCallPhase voiceCallPhase2 = VoiceCallPhase.ENDED;
            if (voiceCallPhase != voiceCallPhase2 || voiceCallUiState2.callAttemptGeneration != C3cH.A09(voiceCallStateHolder.callAttemptGeneration) || C3cH.A09(voiceCallStateHolder.callGeneration) != j || value2 == null) {
                value2 = VoiceCallUiState.copy$default(voiceCallUiState, voiceCallPhase2, 0L, null, null, null, null, false, false, false, false, null, null, null, 0L, 0, false, null, 131070, null);
            }
        } while (!blg.A6e(value, value2));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }
}
