package com.facebook.aura.ageverification;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.ageverification.AgeVerificationClient$uploadAndSubmit$uploads$1$1$1", f = "AgeVerificationClient.kt", l = {195}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class AgeVerificationClient$uploadAndSubmit$uploads$1$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends String>>, Object> {
    public final /* synthetic */ AgeVerificationAttempt $attempt;
    public final /* synthetic */ AgeVerificationUpload $expected;
    public final /* synthetic */ File $file;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.ageverification.AgeVerificationClient$uploadAndSubmit$uploads$1$1$1$1", f = "AgeVerificationClient.kt", l = {195}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ageverification.AgeVerificationClient$uploadAndSubmit$uploads$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends String>>, Object> {
        public final /* synthetic */ AgeVerificationAttempt $attempt;
        public final /* synthetic */ AgeVerificationUpload $expected;
        public final /* synthetic */ File $file;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AgeVerificationAttempt ageVerificationAttempt, AgeVerificationUpload ageVerificationUpload, File file, HtJ<? super AnonymousClass1> htJ) {
            super(1, htJ);
            this.$attempt = ageVerificationAttempt;
            this.$expected = ageVerificationUpload;
            this.$file = file;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass1(this.$attempt, this.$expected, this.$file, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM219uploadBWLJW6A;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AgeVerificationClient ageVerificationClient = AgeVerificationClient.INSTANCE;
                String str = this.$attempt.id;
                AgeVerificationUploadKind ageVerificationUploadKind = this.$expected.kind;
                File file = this.$file;
                this.label = 1;
                objM219uploadBWLJW6A = ageVerificationClient.m219uploadBWLJW6A(str, ageVerificationUploadKind, file, this);
                if (objM219uploadBWLJW6A == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM219uploadBWLJW6A = AnonymousClass001.A0q(obj);
            }
            return new HsJ(objM219uploadBWLJW6A);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HtJ<? super HsJ<String>> htJ) {
            return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(HtJ<? super HsJ<? extends String>> htJ) {
            return invoke2((HtJ<? super HsJ<String>>) htJ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgeVerificationClient$uploadAndSubmit$uploads$1$1$1(AgeVerificationAttempt ageVerificationAttempt, AgeVerificationUpload ageVerificationUpload, File file, HtJ<? super AgeVerificationClient$uploadAndSubmit$uploads$1$1$1> htJ) {
        super(2, htJ);
        this.$attempt = ageVerificationAttempt;
        this.$expected = ageVerificationUpload;
        this.$file = file;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AgeVerificationClient$uploadAndSubmit$uploads$1$1$1(this.$attempt, this.$expected, this.$file, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM216retryServerFailureOncegIAlus;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AgeVerificationClient ageVerificationClient = AgeVerificationClient.INSTANCE;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$attempt, this.$expected, this.$file, null);
            this.label = 1;
            objM216retryServerFailureOncegIAlus = ageVerificationClient.m216retryServerFailureOncegIAlus(anonymousClass1, this);
            if (objM216retryServerFailureOncegIAlus == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM216retryServerFailureOncegIAlus = AnonymousClass001.A0q(obj);
        }
        return new HsJ(objM216retryServerFailureOncegIAlus);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<String>> htJ) {
        return ((AgeVerificationClient$uploadAndSubmit$uploads$1$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends String>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<String>>) htJ);
    }
}
