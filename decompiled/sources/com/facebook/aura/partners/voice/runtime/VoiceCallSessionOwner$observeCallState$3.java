package com.facebook.aura.partners.voice.runtime;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass603;
import X.BLG;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C3rb;
import X.EnumC10460Hji;
import X.G0V;
import X.G2k;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.partners.voice.api.VoiceCallManager;
import com.facebook.aura.partners.voice.intf.VoiceCallPhase;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoiceCallUiState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.runtime.VoiceCallSessionOwner$observeCallState$3", f = "VoiceCallSessionOwner.kt", l = {AuraWaitlistConfettiKt.StandardParticleCount}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceCallSessionOwner$observeCallState$3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ long $callGeneration;
    public final /* synthetic */ VoiceCallStateHolder $holder;
    public final /* synthetic */ VoiceCallManager $manager;
    public final /* synthetic */ BLG<VoiceCallUiState> $state;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.runtime.VoiceCallSessionOwner$observeCallState$3$1", f = "VoiceCallSessionOwner.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.runtime.VoiceCallSessionOwner$observeCallState$3$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G2k<VoiceCallUiState, Boolean, Long, Long, HtJ<? super VoiceCallUiState>, Object> {
        public final /* synthetic */ long $callGeneration;
        public final /* synthetic */ BLG<VoiceCallUiState> $state;
        public /* synthetic */ long J$0;
        public /* synthetic */ long J$1;
        public /* synthetic */ Object L$0;
        public /* synthetic */ boolean Z$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, BLG<VoiceCallUiState> blg, HtJ<? super AnonymousClass1> htJ) {
            super(5, htJ);
            this.$callGeneration = j;
            this.$state = blg;
        }

        public final Object invoke(VoiceCallUiState voiceCallUiState, boolean z, long j, long j2, HtJ<? super VoiceCallUiState> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$callGeneration, this.$state, htJ);
            anonymousClass1.L$0 = voiceCallUiState;
            anonymousClass1.Z$0 = z;
            anonymousClass1.J$0 = j;
            anonymousClass1.J$1 = j2;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            VoiceCallUiState voiceCallUiState = (VoiceCallUiState) this.L$0;
            boolean z = this.Z$0;
            long j = this.J$0;
            long j2 = this.J$1;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return j != this.$callGeneration ? VoiceCallUiState.copy$default(this.$state.getValue(), VoiceCallPhase.ENDED, 0L, null, null, null, null, false, false, false, false, null, null, null, 0L, 0, false, null, 131070, null) : (voiceCallUiState.callAttemptGeneration == j2 && (z || voiceCallUiState.phase == VoiceCallPhase.ENDED)) ? voiceCallUiState : this.$state.getValue();
        }

        @Override // X.G2k
        public /* bridge */ /* synthetic */ Object invoke(VoiceCallUiState voiceCallUiState, Boolean bool, Long l, Long l2, HtJ<? super VoiceCallUiState> htJ) {
            return invoke(voiceCallUiState, AnonymousClass001.A1X(bool), C3cG.A05(l), C3cG.A05(l2), htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.runtime.VoiceCallSessionOwner$observeCallState$3$2", f = "VoiceCallSessionOwner.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.runtime.VoiceCallSessionOwner$observeCallState$3$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<VoiceCallUiState, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ BLG<VoiceCallUiState> $state;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BLG<VoiceCallUiState> blg, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$state = blg;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$state, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            VoiceCallUiState voiceCallUiState = (VoiceCallUiState) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            this.$state.Af8(voiceCallUiState);
            return Boolean.valueOf(AnonymousClass002.A1Z(voiceCallUiState.phase, VoiceCallPhase.ENDED));
        }

        @Override // X.G0V
        public final Object invoke(VoiceCallUiState voiceCallUiState, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass2) create(voiceCallUiState, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallSessionOwner$observeCallState$3(VoiceCallManager voiceCallManager, VoiceCallStateHolder voiceCallStateHolder, long j, BLG<VoiceCallUiState> blg, HtJ<? super VoiceCallSessionOwner$observeCallState$3> htJ) {
        super(2, htJ);
        this.$manager = voiceCallManager;
        this.$holder = voiceCallStateHolder;
        this.$callGeneration = j;
        this.$state = blg;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceCallSessionOwner$observeCallState$3(this.$manager, this.$holder, this.$callGeneration, this.$state, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C1BN<VoiceCallUiState> callState = this.$manager.getCallState();
            VoiceCallStateHolder voiceCallStateHolder = this.$holder;
            AnonymousClass603 anonymousClass603A01 = C3rb.A01(new AnonymousClass1(this.$callGeneration, this.$state, null), callState, voiceCallStateHolder.isCallActive, voiceCallStateHolder.callGeneration, voiceCallStateHolder.callAttemptGeneration);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$state, null);
            this.label = 1;
            if (AbstractC9777Gfy.A00(this, anonymousClass2, anonymousClass603A01) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((VoiceCallSessionOwner$observeCallState$3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
