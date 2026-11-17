package com.facebook.aura.partners.voice.screen;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C20Q;
import X.C20Z;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceGlobalEffectsKt$ForegroundOnlyToast$1$1", f = "VoiceGlobalEffects.kt", l = {264}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceGlobalEffectsKt$ForegroundOnlyToast$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Boolean> $currentForeground$delegate;
    public final /* synthetic */ C20Q<T> $events;
    public final /* synthetic */ MutableState<T> $pendingUntilForeground$delegate;
    public final /* synthetic */ C3Em<Unit> $toasts;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceGlobalEffectsKt$ForegroundOnlyToast$1$1(C20Q<? extends T> c20q, C3Em<Unit> c3Em, C1BO<Boolean> c1bo, MutableState<T> mutableState, HtJ<? super VoiceGlobalEffectsKt$ForegroundOnlyToast$1$1> htJ) {
        super(2, htJ);
        this.$events = c20q;
        this.$toasts = c3Em;
        this.$currentForeground$delegate = c1bo;
        this.$pendingUntilForeground$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceGlobalEffectsKt$ForegroundOnlyToast$1$1(this.$events, this.$toasts, this.$currentForeground$delegate, this.$pendingUntilForeground$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q<T> c20q = this.$events;
            final C3Em<Unit> c3Em = this.$toasts;
            final C1BO<Boolean> c1bo = this.$currentForeground$delegate;
            final MutableState<T> mutableState = this.$pendingUntilForeground$delegate;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.screen.VoiceGlobalEffectsKt$ForegroundOnlyToast$1$1.1
                @Override // X.C20Z
                public final Object emit(T t, HtJ<? super Unit> htJ) {
                    if (C1BO.A0F(c1bo)) {
                        C3cG.A1I(c3Em);
                    } else {
                        mutableState.Af8(t);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c20q.collect(c20z, this) == enumC10460Hji) {
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
        return ((VoiceGlobalEffectsKt$ForegroundOnlyToast$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
