package com.facebook.aura.partners.voice.screen;

import X.AbstractC07127nr;
import X.BO7;
import X.C1BO;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.os.SystemClock;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceGlobalEffectsKt$ThrottledToast$3$1", f = "VoiceGlobalEffects.kt", l = {313}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceGlobalEffectsKt$ThrottledToast$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ VoiceCallErrorToastAction $action;
    public final /* synthetic */ C1BO<Function0<AuraToast.ToastArgs>> $currentToast$delegate;
    public final /* synthetic */ C20Q<Unit> $events;
    public final /* synthetic */ long $minIntervalMs;
    public final /* synthetic */ VoiceCallErrorToastReason $reason;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceGlobalEffectsKt$ThrottledToast$3$1(C20Q<Unit> c20q, long j, VoiceCallErrorToastReason voiceCallErrorToastReason, C1BO<? extends Function0<AuraToast.ToastArgs>> c1bo, VoiceCallErrorToastAction voiceCallErrorToastAction, HtJ<? super VoiceGlobalEffectsKt$ThrottledToast$3$1> htJ) {
        super(2, htJ);
        this.$events = c20q;
        this.$minIntervalMs = j;
        this.$reason = voiceCallErrorToastReason;
        this.$currentToast$delegate = c1bo;
        this.$action = voiceCallErrorToastAction;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceGlobalEffectsKt$ThrottledToast$3$1(this.$events, this.$minIntervalMs, this.$reason, this.$currentToast$delegate, this.$action, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            final BO7 bo7 = new BO7();
            bo7.element = -4611686018427387904L;
            C20Q<Unit> c20q = this.$events;
            final long j = this.$minIntervalMs;
            final VoiceCallErrorToastReason voiceCallErrorToastReason = this.$reason;
            final C1BO<Function0<AuraToast.ToastArgs>> c1bo = this.$currentToast$delegate;
            final VoiceCallErrorToastAction voiceCallErrorToastAction = this.$action;
            C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.screen.VoiceGlobalEffectsKt$ThrottledToast$3$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((Unit) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    BO7 bo72 = bo7;
                    if (jElapsedRealtime - bo72.element >= j) {
                        bo72.element = jElapsedRealtime;
                        ToastApi.INSTANCE.showToast((AuraToast.ToastArgs) C1BO.A0A(c1bo).invoke());
                        VoiceCallErrorToastReason voiceCallErrorToastReason2 = voiceCallErrorToastReason;
                        if (voiceCallErrorToastReason2 != null) {
                            VoiceCallErrorToastTelemetry.INSTANCE.logShown(voiceCallErrorToastReason2, voiceCallErrorToastAction);
                        }
                    } else if (voiceCallErrorToastReason == VoiceCallErrorToastReason.LIVE_AVATAR_UNAVAILABLE) {
                        CFK.A05(VoiceGlobalEffectsKt.TAG, "live_avatar.unavailable_toast decision=suppressed why=throttled");
                    }
                    return Unit.INSTANCE;
                }
            };
            this.L$0 = null;
            this.label = 1;
            if (c20q.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((VoiceGlobalEffectsKt$ThrottledToast$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
