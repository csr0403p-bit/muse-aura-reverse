package com.facebook.aura.whatsapp.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1518AkS;
import X.C1C3;
import X.C3UX;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.whatsapp.view.WhatsAppCompanionPhoneInputContentKt$WhatsAppCompanionPhoneInputContent$1$1", f = "WhatsAppCompanionPhoneInputContent.kt", l = {141}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class WhatsAppCompanionPhoneInputContentKt$WhatsAppCompanionPhoneInputContent$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1518AkS $focusRequester;
    public final /* synthetic */ C1C3 $keyboardController;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhatsAppCompanionPhoneInputContentKt$WhatsAppCompanionPhoneInputContent$1$1(C1518AkS c1518AkS, C1C3 c1c3, HtJ<? super WhatsAppCompanionPhoneInputContentKt$WhatsAppCompanionPhoneInputContent$1$1> htJ) {
        super(2, htJ);
        this.$focusRequester = c1518AkS;
        this.$keyboardController = c1c3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new WhatsAppCompanionPhoneInputContentKt$WhatsAppCompanionPhoneInputContent$1$1(this.$focusRequester, this.$keyboardController, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            this.label = 1;
            if (C7Bq.A01(400L, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        C1518AkS.A00(this.$focusRequester);
        C1C3 c1c3 = this.$keyboardController;
        if (c1c3 != null) {
            c1c3.Afd();
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((WhatsAppCompanionPhoneInputContentKt$WhatsAppCompanionPhoneInputContent$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
