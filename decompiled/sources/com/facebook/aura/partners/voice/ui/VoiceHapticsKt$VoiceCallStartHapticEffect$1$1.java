package com.facebook.aura.partners.voice.ui;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C0dx;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C5303Dfm;
import X.EnumC10460Hji;
import X.EnumC10573Huf;
import X.F2N;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.ui.VoiceHapticsKt$VoiceCallStartHapticEffect$1$1", f = "VoiceHaptics.kt", l = {23}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class VoiceHapticsKt$VoiceCallStartHapticEffect$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C0dx $haptic;
    public final /* synthetic */ F2N $lifecycle;
    public final /* synthetic */ VoiceCallStateHolder $stateHolder;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceHapticsKt$VoiceCallStartHapticEffect$1$1(VoiceCallStateHolder voiceCallStateHolder, F2N f2n, C0dx c0dx, HtJ<? super VoiceHapticsKt$VoiceCallStartHapticEffect$1$1> htJ) {
        super(2, htJ);
        this.$stateHolder = voiceCallStateHolder;
        this.$lifecycle = f2n;
        this.$haptic = c0dx;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceHapticsKt$VoiceCallStartHapticEffect$1$1(this.$stateHolder, this.$lifecycle, this.$haptic, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            final VoiceCallStateHolder voiceCallStateHolder = this.$stateHolder;
            C22I<Long> c22i = voiceCallStateHolder.callStartHapticEvents;
            final F2N f2n = this.$lifecycle;
            final C0dx c0dx = this.$haptic;
            C20Z<? super Long> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.ui.VoiceHapticsKt$VoiceCallStartHapticEffect$1$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit(((Number) obj2).longValue(), (HtJ<? super Unit>) htJ);
                }

                public final Object emit(long j, HtJ<? super Unit> htJ) {
                    if (((C5303Dfm) f2n).A01.A00(EnumC10573Huf.A06) && voiceCallStateHolder.consumeCallStartHaptic(j)) {
                        c0dx.AXr(AuraHaptics.SUCCESS);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c22i.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((VoiceHapticsKt$VoiceCallStartHapticEffect$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
