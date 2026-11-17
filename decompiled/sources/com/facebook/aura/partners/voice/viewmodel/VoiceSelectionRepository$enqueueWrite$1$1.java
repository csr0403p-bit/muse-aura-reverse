package com.facebook.aura.partners.voice.viewmodel;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Add missing generic type declarations: [T] */
@DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$enqueueWrite$1$1", f = "VoiceSelectionRepository.kt", l = {117, 118}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class VoiceSelectionRepository$enqueueWrite$1$1<T> extends AbstractC07127nr implements G0V<C3UX, HtJ<? super T>, Object> {
    public final /* synthetic */ HoC $previous;
    public final /* synthetic */ G0U<HtJ<? super T>, Object> $write;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceSelectionRepository$enqueueWrite$1$1(HoC hoC, G0U<? super HtJ<? super T>, ? extends Object> g0u, HtJ<? super VoiceSelectionRepository$enqueueWrite$1$1> htJ) {
        super(2, htJ);
        this.$previous = hoC;
        this.$write = g0u;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceSelectionRepository$enqueueWrite$1$1(this.$previous, this.$write, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HoC hoC = this.$previous;
            if (hoC != null) {
                this.label = 1;
                if (hoC.APQ(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    Hwg.A00(obj);
                }
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        G0U<HtJ<? super T>, Object> g0u = this.$write;
        this.label = 2;
        obj = g0u.invoke(this);
        return obj == enumC10460Hji ? enumC10460Hji : obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super T> htJ) {
        return ((VoiceSelectionRepository$enqueueWrite$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
