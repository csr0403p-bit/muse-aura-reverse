package com.facebook.aura.microphone.view;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1BN;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.microphone.api.MicrophonePriority;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.microphone.view.SilencedByMicrophoneKt$rememberSilencedByMicrophone$1$1", f = "SilencedByMicrophone.kt", l = {21}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class SilencedByMicrophoneKt$rememberSilencedByMicrophone$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BN<MicrophonePriority> $holder;
    public final /* synthetic */ MutableState<Boolean> $wasOpen;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.microphone.view.SilencedByMicrophoneKt$rememberSilencedByMicrophone$1$1$1", f = "SilencedByMicrophone.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.microphone.view.SilencedByMicrophoneKt$rememberSilencedByMicrophone$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<MicrophonePriority, HtJ<? super Boolean>, Object> {
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
            Object obj2 = this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(AnonymousClass002.A1X(obj2));
        }

        @Override // X.G0V
        public final Object invoke(MicrophonePriority microphonePriority, HtJ<? super Boolean> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.L$0 = microphonePriority;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SilencedByMicrophoneKt$rememberSilencedByMicrophone$1$1(C1BN<? extends MicrophonePriority> c1bn, MutableState<Boolean> mutableState, HtJ<? super SilencedByMicrophoneKt$rememberSilencedByMicrophone$1$1> htJ) {
        super(2, htJ);
        this.$holder = c1bn;
        this.$wasOpen = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SilencedByMicrophoneKt$rememberSilencedByMicrophone$1$1(this.$holder, this.$wasOpen, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C1BN<MicrophonePriority> c1bn = this.$holder;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (AbstractC9777Gfy.A00(this, anonymousClass1, c1bn) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        MutableState.A09(true, this.$wasOpen);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((SilencedByMicrophoneKt$rememberSilencedByMicrophone$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
