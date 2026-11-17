package com.facebook.aura.ageverification;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.ageverification.AgeVerificationClient$uploadAndSubmit$2", f = "AgeVerificationClient.kt", l = {HatchWidgetWebViewKt.HTTP_NO_CONTENT}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class AgeVerificationClient$uploadAndSubmit$2 extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends Unit>>, Object> {
    public final /* synthetic */ AgeVerificationAttempt $attempt;
    public final /* synthetic */ List<String> $fileHandles;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgeVerificationClient$uploadAndSubmit$2(AgeVerificationAttempt ageVerificationAttempt, List<String> list, HtJ<? super AgeVerificationClient$uploadAndSubmit$2> htJ) {
        super(1, htJ);
        this.$attempt = ageVerificationAttempt;
        this.$fileHandles = list;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new AgeVerificationClient$uploadAndSubmit$2(this.$attempt, this.$fileHandles, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM218submit0E7RQCE;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AgeVerificationClient ageVerificationClient = AgeVerificationClient.INSTANCE;
            String str = this.$attempt.id;
            List<String> list = this.$fileHandles;
            this.label = 1;
            objM218submit0E7RQCE = ageVerificationClient.m218submit0E7RQCE(str, list, this);
            if (objM218submit0E7RQCE == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM218submit0E7RQCE = AnonymousClass001.A0q(obj);
        }
        return new HsJ(objM218submit0E7RQCE);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(HtJ<? super HsJ<Unit>> htJ) {
        return ((AgeVerificationClient$uploadAndSubmit$2) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Object invoke(HtJ<? super HsJ<? extends Unit>> htJ) {
        return invoke2((HtJ<? super HsJ<Unit>>) htJ);
    }
}
