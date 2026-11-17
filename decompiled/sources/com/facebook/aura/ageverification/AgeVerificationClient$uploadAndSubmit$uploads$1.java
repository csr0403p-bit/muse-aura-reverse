package com.facebook.aura.ageverification;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C3UX;
import X.C60Q;
import X.EnumC10460Hji;
import X.EsN;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.ageverification.AgeVerificationClient$uploadAndSubmit$uploads$1", f = "AgeVerificationClient.kt", l = {HatchMessageShareDocumentRenderer.CONTENT_TOP_PX}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class AgeVerificationClient$uploadAndSubmit$uploads$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<? extends HsJ<? extends String>>>, Object> {
    public final /* synthetic */ AgeVerificationAttempt $attempt;
    public final /* synthetic */ List<HxE<AgeVerificationUpload, File>> $captured;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AgeVerificationClient$uploadAndSubmit$uploads$1(List<? extends HxE<AgeVerificationUpload, ? extends File>> list, AgeVerificationAttempt ageVerificationAttempt, HtJ<? super AgeVerificationClient$uploadAndSubmit$uploads$1> htJ) {
        super(2, htJ);
        this.$captured = list;
        this.$attempt = ageVerificationAttempt;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        AgeVerificationClient$uploadAndSubmit$uploads$1 ageVerificationClient$uploadAndSubmit$uploads$1 = new AgeVerificationClient$uploadAndSubmit$uploads$1(this.$captured, this.$attempt, htJ);
        ageVerificationClient$uploadAndSubmit$uploads$1.L$0 = obj;
        return ageVerificationClient$uploadAndSubmit$uploads$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C3UX c3ux = (C3UX) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            List<HxE<AgeVerificationUpload, File>> list = this.$captured;
            AgeVerificationAttempt ageVerificationAttempt = this.$attempt;
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            Iterator<HxE<AgeVerificationUpload, File>> it = list.iterator();
            while (it.hasNext()) {
                HxE hxEA10 = C60Q.A10(it);
                arrayListA0i.add(AnonymousClass001.A10(new AgeVerificationClient$uploadAndSubmit$uploads$1$1$1(ageVerificationAttempt, (AgeVerificationUpload) hxEA10.first, (File) hxEA10.second, null), c3ux));
            }
            this.L$0 = null;
            this.label = 1;
            obj = EsN.A00(arrayListA0i, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super List<HsJ<String>>> htJ) {
        return ((AgeVerificationClient$uploadAndSubmit$uploads$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super List<? extends HsJ<? extends String>>> htJ) {
        return invoke2(c3ux, (HtJ<? super List<HsJ<String>>>) htJ);
    }
}
