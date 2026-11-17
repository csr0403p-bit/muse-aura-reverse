package com.facebook.aura.partners.voice.ui;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1110AYw;
import X.C1qN;
import X.C1rU;
import X.C20Z;
import X.C3Em;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC04911Xu;
import com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.ui.VoiceCallCaptionsKt$rememberCaptionScrollState$1$1", f = "VoiceCallCaptions.kt", l = {HatchVoiceAnnouncementSheetKt.NUX_FADE_IN_DELAY_MS}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class VoiceCallCaptionsKt$rememberCaptionScrollState$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AtomicBoolean $autoScroll;
    public final /* synthetic */ C1110AYw $scroll;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallCaptionsKt$rememberCaptionScrollState$1$1(C1110AYw c1110AYw, AtomicBoolean atomicBoolean, HtJ<? super VoiceCallCaptionsKt$rememberCaptionScrollState$1$1> htJ) {
        super(2, htJ);
        this.$scroll = c1110AYw;
        this.$autoScroll = atomicBoolean;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceCallCaptionsKt$rememberCaptionScrollState$1$1(this.$scroll, this.$autoScroll, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C3Em<InterfaceC04911Xu> c3Em = ((C1qN) this.$scroll.A02).A00;
            final AtomicBoolean atomicBoolean = this.$autoScroll;
            C20Z<? super InterfaceC04911Xu> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.ui.VoiceCallCaptionsKt$rememberCaptionScrollState$1$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((InterfaceC04911Xu) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(InterfaceC04911Xu interfaceC04911Xu, HtJ<? super Unit> htJ) {
                    if (interfaceC04911Xu instanceof C1rU) {
                        atomicBoolean.set(false);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c3Em.collect(c20z, this) == enumC10460Hji) {
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
        return ((VoiceCallCaptionsKt$rememberCaptionScrollState$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
