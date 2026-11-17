package com.facebook.aura.partners.voice.screen;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceGlobalEffectsKt$LiveAvatarUnavailableToast$1$1", f = "VoiceGlobalEffects.kt", l = {127}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceGlobalEffectsKt$LiveAvatarUnavailableToast$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<String> $avatar$delegate;
    public final /* synthetic */ C3Em<Unit> $events;
    public final /* synthetic */ VoiceCallStateHolder $voiceCallStateHolder;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceGlobalEffectsKt$LiveAvatarUnavailableToast$1$1(VoiceCallStateHolder voiceCallStateHolder, C3Em<Unit> c3Em, MutableState<String> mutableState, HtJ<? super VoiceGlobalEffectsKt$LiveAvatarUnavailableToast$1$1> htJ) {
        super(2, htJ);
        this.$voiceCallStateHolder = voiceCallStateHolder;
        this.$events = c3Em;
        this.$avatar$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceGlobalEffectsKt$LiveAvatarUnavailableToast$1$1(this.$voiceCallStateHolder, this.$events, this.$avatar$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<String> c22i = this.$voiceCallStateHolder.liveAvatarUnavailableEvents;
            final C3Em<Unit> c3Em = this.$events;
            final MutableState<String> mutableState = this.$avatar$delegate;
            C20Z<? super String> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.screen.VoiceGlobalEffectsKt$LiveAvatarUnavailableToast$1$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((String) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(String str, HtJ<? super Unit> htJ) {
                    mutableState.Af8(str);
                    C3Em<Unit> c3Em2 = c3Em;
                    Unit unit = Unit.INSTANCE;
                    Object objEmit = c3Em2.emit(unit, htJ);
                    if (objEmit == EnumC10460Hji.A02) {
                        return objEmit;
                    }
                    return unit;
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
        throw C3cG.A0p();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((VoiceGlobalEffectsKt$LiveAvatarUnavailableToast$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
