package com.facebook.aura.partners.voice.runtime;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C1BN;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.partners.voice.api.VoiceCallManager;
import com.facebook.aura.partners.voice.intf.VoiceCallPhase;
import com.facebook.aura.partners.voice.intf.VoiceCallUiState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.runtime.VoiceCallSessionOwner$acquireUntilEnded$1$started$1", f = "VoiceCallSessionOwner.kt", l = {AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceCallSessionOwner$acquireUntilEnded$1$started$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super VoiceCallUiState>, Object> {
    public final /* synthetic */ VoiceCallManager $manager;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.runtime.VoiceCallSessionOwner$acquireUntilEnded$1$started$1$1", f = "VoiceCallSessionOwner.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.runtime.VoiceCallSessionOwner$acquireUntilEnded$1$started$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<VoiceCallUiState, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            VoiceCallUiState voiceCallUiState = (VoiceCallUiState) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(AnonymousClass006.A1Z(voiceCallUiState.phase, VoiceCallPhase.ENDED));
        }

        @Override // X.G0V
        public final Object invoke(VoiceCallUiState voiceCallUiState, HtJ<? super Boolean> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.L$0 = voiceCallUiState;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallSessionOwner$acquireUntilEnded$1$started$1(VoiceCallManager voiceCallManager, HtJ<? super VoiceCallSessionOwner$acquireUntilEnded$1$started$1> htJ) {
        super(2, htJ);
        this.$manager = voiceCallManager;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceCallSessionOwner$acquireUntilEnded$1$started$1(this.$manager, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C1BN<VoiceCallUiState> callState = this.$manager.getCallState();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            obj = AbstractC9777Gfy.A00(this, anonymousClass1, callState);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super VoiceCallUiState> htJ) {
        return new VoiceCallSessionOwner$acquireUntilEnded$1$started$1(this.$manager, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
