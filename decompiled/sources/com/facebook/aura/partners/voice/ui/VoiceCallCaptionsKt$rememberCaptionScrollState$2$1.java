package com.facebook.aura.partners.voice.ui;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1110AYw;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.partners.voice.ui.VoiceCallCaptionsKt$rememberCaptionScrollState$2$1", f = "VoiceCallCaptions.kt", l = {182}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class VoiceCallCaptionsKt$rememberCaptionScrollState$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AtomicBoolean $autoScroll;
    public final /* synthetic */ C1110AYw $scroll;
    public int label;

    /* renamed from: com.facebook.aura.partners.voice.ui.VoiceCallCaptionsKt$rememberCaptionScrollState$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ C1110AYw $scroll;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C1110AYw c1110AYw) {
            super(0);
            this.$scroll = c1110AYw;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.$scroll.AOz());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallCaptionsKt$rememberCaptionScrollState$2$1(C1110AYw c1110AYw, AtomicBoolean atomicBoolean, HtJ<? super VoiceCallCaptionsKt$rememberCaptionScrollState$2$1> htJ) {
        super(2, htJ);
        this.$scroll = c1110AYw;
        this.$autoScroll = atomicBoolean;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceCallCaptionsKt$rememberCaptionScrollState$2$1(this.$scroll, this.$autoScroll, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            VoiceCallCaptionsKt$rememberCaptionScrollState$2$1$invokeSuspend$$inlined$filter$1 voiceCallCaptionsKt$rememberCaptionScrollState$2$1$invokeSuspend$$inlined$filter$1 = new VoiceCallCaptionsKt$rememberCaptionScrollState$2$1$invokeSuspend$$inlined$filter$1(C6v3.A01(new AnonymousClass1(this.$scroll)));
            final AtomicBoolean atomicBoolean = this.$autoScroll;
            final C1110AYw c1110AYw = this.$scroll;
            C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.ui.VoiceCallCaptionsKt$rememberCaptionScrollState$2$1.3
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                }

                public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    boolean z2 = false;
                    if (c1110AYw.A04.AGd() >= c1110AYw.A01.AGd()) {
                        z2 = true;
                    }
                    atomicBoolean2.set(z2);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (voiceCallCaptionsKt$rememberCaptionScrollState$2$1$invokeSuspend$$inlined$filter$1.collect(c20z, this) == enumC10460Hji) {
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
        return ((VoiceCallCaptionsKt$rememberCaptionScrollState$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
