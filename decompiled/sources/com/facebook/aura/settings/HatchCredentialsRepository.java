package com.facebook.aura.settings;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C3UX;
import X.C7384Etj;
import X.C7BY;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.qpl.module.MC;
import com.facebook.aura.settings.CredentialCaptureResult;
import com.facebook.aura.settings.ExternalProviderGrantResult;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchCredentialsRepository {
    public static final int $stable = 8;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.settings.HatchCredentialsRepository$requestExternalProviderGrant$2", f = "HatchCredentialsRepository.kt", l = {MC.mwa_qpl_metadata.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchCredentialsRepository$requestExternalProviderGrant$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ExternalProviderGrantResult>, Object> {
        public final /* synthetic */ String $authProvider;
        public final /* synthetic */ String $captureAuthorization;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public final /* synthetic */ HatchCredentialsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, HatchCredentialsRepository hatchCredentialsRepository, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$captureAuthorization = str;
            this.$authProvider = str2;
            this.this$0 = hatchCredentialsRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$captureAuthorization, this.$authProvider, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            NetworkException networkException;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchCredentialsRepository$requestExternalProviderGrant$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hatchCredentialsRepository$requestExternalProviderGrant$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HatchCredentialsRepository$requestExternalProviderGrant$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                HatchCredentialsRepository$requestExternalProviderGrant$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hatchCredentialsRepository$requestExternalProviderGrant$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HatchCredentialsRepository$requestExternalProviderGrant$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.I$0 = 0;
                this.I$1 = 0;
                this.I$2 = 1;
                this.I$3 = 1;
                this.I$4 = 1;
                this.I$5 = 0;
                this.I$6 = 0;
                this.label = 1;
                objM1599executeJarvisRequestWithFof5HsY = HatchHttpApi.INSTANCE.m1599executeJarvisRequestWithFof5HsY(hatchCredentialsRepository$requestExternalProviderGrant$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hatchCredentialsRepository$requestExternalProviderGrant$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, JarvisPath.CredentialsCaptureExternalProviderRequest.INSTANCE, new CredentialExternalProviderRequestJson(this.$captureAuthorization, this.$authProvider), RequestType.POST, this.this$0.userSession, null, null, new HxE[0], setA18, false, false, c9jHA0E, null, true, true, true, false, null, false, this);
                if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
            }
            Throwable thA00 = HsJ.A00(objM1599executeJarvisRequestWithFof5HsY);
            return thA00 == null ? new ExternalProviderGrantResult.Requested(((CredentialExternalProviderResponseJson) objM1599executeJarvisRequestWithFof5HsY).grant_request) : ((thA00 instanceof NetworkException) && (networkException = (NetworkException) thA00) != null && networkException.httpResponseCode == 404) ? ExternalProviderGrantResult.Expired.INSTANCE : ExternalProviderGrantResult.Failed.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ExternalProviderGrantResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchCredentialsRepository$submitCapture$2", f = "HatchCredentialsRepository.kt", l = {425}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchCredentialsRepository$submitCapture$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C134972 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super CredentialCaptureResult>, Object> {
        public final /* synthetic */ CredentialCaptureRequestJson $body;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public final /* synthetic */ HatchCredentialsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134972(CredentialCaptureRequestJson credentialCaptureRequestJson, HatchCredentialsRepository hatchCredentialsRepository, HtJ<? super C134972> htJ) {
            super(2, htJ);
            this.$body = credentialCaptureRequestJson;
            this.this$0 = hatchCredentialsRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C134972(this.$body, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchCredentialsRepository$submitCapture$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hatchCredentialsRepository$submitCapture$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HatchCredentialsRepository$submitCapture$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                HatchCredentialsRepository$submitCapture$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hatchCredentialsRepository$submitCapture$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HatchCredentialsRepository$submitCapture$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.I$0 = 0;
                this.I$1 = 1;
                this.I$2 = 1;
                this.I$3 = 1;
                this.I$4 = 1;
                this.I$5 = 1;
                this.I$6 = 0;
                this.label = 1;
                objM1599executeJarvisRequestWithFof5HsY = HatchHttpApi.INSTANCE.m1599executeJarvisRequestWithFof5HsY(hatchCredentialsRepository$submitCapture$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hatchCredentialsRepository$submitCapture$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, JarvisPath.CredentialsCapture.INSTANCE, this.$body, RequestType.POST, this.this$0.userSession, null, null, new HxE[0], setA18, false, true, c9jHA0E, null, true, true, true, true, null, false, this);
                if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
            }
            Throwable thA00 = HsJ.A00(objM1599executeJarvisRequestWithFof5HsY);
            if (thA00 != null) {
                return HatchCredentialCaptureErrorKt.credentialCaptureResult(thA00);
            }
            CredentialCaptureResponseJson credentialCaptureResponseJson = (CredentialCaptureResponseJson) objM1599executeJarvisRequestWithFof5HsY;
            return C7BY.A0j(credentialCaptureResponseJson.id) ? new CredentialCaptureResult.Error(CredentialCaptureError.FAILED, true) : new CredentialCaptureResult.Success(credentialCaptureResponseJson.id);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super CredentialCaptureResult> htJ) {
            return ((C134972) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HatchCredentialsRepository(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
    }

    public final Object capture(String str, String str2, List<CredentialCaptureFieldJson> list, String str3, String str4, String str5, HtJ<? super CredentialCaptureResult> htJ) {
        return submitCapture(new CredentialCaptureRequestJson(str, str2, str4, null, list, str5, str3, null, null), htJ);
    }

    public final Object captureExternalGrant(String str, String str2, String str3, String str4, String str5, String str6, HtJ<? super CredentialCaptureResult> htJ) {
        return submitCapture(new CredentialCaptureRequestJson(str, str2, str6, null, null, "persist", str5, str3, str4), htJ);
    }

    public static /* synthetic */ Object capture$default(HatchCredentialsRepository hatchCredentialsRepository, String str, String str2, List list, String str3, String str4, String str5, HtJ htJ, int i, Object obj) {
        if ((i & 32) != 0) {
            str5 = "persist";
        }
        return hatchCredentialsRepository.capture(str, str2, list, str3, str4, str5, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    /* renamed from: update-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1941updateBWLJW6A(java.lang.String r26, java.util.List<com.facebook.aura.settings.CredentialCatalogUpdateFieldJson> r27, java.lang.String r28, X.HtJ<? super X.HsJ<com.facebook.aura.settings.CredentialCatalogUpdateResponseJson>> r29) {
        /*
            r25 = this;
            r4 = r29
            boolean r0 = r4 instanceof com.facebook.aura.settings.HatchCredentialsRepository$update$3
            r5 = r25
            if (r0 == 0) goto L91
            r3 = r4
            com.facebook.aura.settings.HatchCredentialsRepository$update$3 r3 = (com.facebook.aura.settings.HatchCredentialsRepository$update$3) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L91
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r4 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 != r1) goto L97
            java.lang.Object r2 = X.AnonymousClass001.A0q(r4)
        L25:
            return r2
        L26:
            X.Hwg.A00(r4)
            com.facebook.aura.network.http.HatchHttpApi r7 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.api.JarvisPath$CredentialsCatalogUpdate r11 = com.facebook.aura.network.api.JarvisPath.CredentialsCatalogUpdate.INSTANCE
            com.facebook.aura.settings.CredentialCatalogUpdateRequestJson r12 = new com.facebook.aura.settings.CredentialCatalogUpdateRequestJson
            r6 = r26
            r4 = r27
            r0 = r28
            r12.<init>(r6, r4, r0)
            com.facebook.aura.network.http.RequestType r13 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r14 = r5.userSession
            r10 = 0
            X.HxE[] r0 = new X.HxE[r10]
            java.util.Set r18 = X.AnonymousClass004.A18()
            X.9jH r21 = X.AGH.A0E()
            com.facebook.aura.settings.HatchCredentialsRepository$update-BWLJW6A$$inlined$executeJarvisRequest-Z6QaZII$default$1 r8 = com.facebook.aura.settings.HatchCredentialsRepository$updateBWLJW6A$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.settings.HatchCredentialsRepository$update-BWLJW6A$$inlined$executeJarvisRequest-Z6QaZII$default$2 r9 = com.facebook.aura.settings.HatchCredentialsRepository$updateBWLJW6A$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r15 = 0
            r3.L$0 = r15
            r3.L$1 = r15
            r3.L$2 = r15
            r3.L$3 = r15
            r3.L$4 = r15
            r3.L$5 = r15
            r3.L$6 = r15
            r3.L$7 = r15
            r3.L$8 = r15
            r3.L$9 = r15
            r3.L$10 = r15
            r3.I$0 = r10
            r3.I$1 = r1
            r3.I$2 = r10
            r3.I$3 = r1
            r3.I$4 = r10
            r3.I$5 = r10
            r3.I$6 = r10
            r3.label = r1
            r16 = r15
            r19 = r10
            r22 = r15
            r23 = r10
            r24 = r1
            r25 = r10
            r26 = r10
            r27 = r15
            r28 = r10
            r29 = r3
            r17 = r0
            r20 = r1
            java.lang.Object r0 = r7.m1599executeJarvisRequestWithFof5HsY(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            if (r0 == r2) goto L25
            return r0
        L91:
            com.facebook.aura.settings.HatchCredentialsRepository$update$3 r3 = new com.facebook.aura.settings.HatchCredentialsRepository$update$3
            r3.<init>(r5, r4)
            goto L16
        L97:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchCredentialsRepository.m1941updateBWLJW6A(java.lang.String, java.util.List, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final Object captureVerificationCode(String str, String str2, String str3, String str4, String str5, HtJ<? super CredentialCaptureResult> htJ) {
        return capture(str, str3, Collections.singletonList(new CredentialCaptureFieldJson("verification_code", str2, true)), str4, str5, "on_read", htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* renamed from: catalogAll-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1942catalogAllIoAF18A(X.HtJ<? super X.HsJ<? extends X.AHD<com.facebook.aura.settings.CredentialCandidate>>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.settings.HatchCredentialsRepository$catalogAll$1
            if (r0 == 0) goto L38
            r5 = r7
            com.facebook.aura.settings.HatchCredentialsRepository$catalogAll$1 r5 = (com.facebook.aura.settings.HatchCredentialsRepository$catalogAll$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L38
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L3e
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.settings.HatchCredentialsRepository$catalogAll$2 r0 = new com.facebook.aura.settings.HatchCredentialsRepository$catalogAll$2
            r0.<init>(r6, r1)
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L38:
            com.facebook.aura.settings.HatchCredentialsRepository$catalogAll$1 r5 = new com.facebook.aura.settings.HatchCredentialsRepository$catalogAll$1
            r5.<init>(r6, r7)
            goto L12
        L3e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchCredentialsRepository.m1942catalogAllIoAF18A(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* renamed from: delete-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1943deletegIAlus(java.lang.String r7, X.HtJ<? super X.HsJ<kotlin.Unit>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.settings.HatchCredentialsRepository$delete$1
            if (r0 == 0) goto L3a
            r5 = r8
            com.facebook.aura.settings.HatchCredentialsRepository$delete$1 r5 = (com.facebook.aura.settings.HatchCredentialsRepository$delete$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L40
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.settings.HatchCredentialsRepository$delete$2 r0 = new com.facebook.aura.settings.HatchCredentialsRepository$delete$2
            r0.<init>(r7, r6, r1)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3a:
            com.facebook.aura.settings.HatchCredentialsRepository$delete$1 r5 = new com.facebook.aura.settings.HatchCredentialsRepository$delete$1
            r5.<init>(r6, r8)
            goto L12
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchCredentialsRepository.m1943deletegIAlus(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* renamed from: details-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1944detailsgIAlus(java.lang.String r7, X.HtJ<? super X.HsJ<com.facebook.aura.settings.CredentialDetails>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.settings.HatchCredentialsRepository$details$1
            if (r0 == 0) goto L3a
            r5 = r8
            com.facebook.aura.settings.HatchCredentialsRepository$details$1 r5 = (com.facebook.aura.settings.HatchCredentialsRepository$details$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L40
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.settings.HatchCredentialsRepository$details$2 r0 = new com.facebook.aura.settings.HatchCredentialsRepository$details$2
            r0.<init>(r6, r7, r1)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3a:
            com.facebook.aura.settings.HatchCredentialsRepository$details$1 r5 = new com.facebook.aura.settings.HatchCredentialsRepository$details$1
            r5.<init>(r6, r8)
            goto L12
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchCredentialsRepository.m1944detailsgIAlus(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* renamed from: listCustomConnectors-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1945listCustomConnectorsIoAF18A(X.HtJ<? super X.HsJ<? extends X.AHD<com.facebook.aura.settings.CustomConnectorCandidate>>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.settings.HatchCredentialsRepository$listCustomConnectors$1
            if (r0 == 0) goto L38
            r5 = r7
            com.facebook.aura.settings.HatchCredentialsRepository$listCustomConnectors$1 r5 = (com.facebook.aura.settings.HatchCredentialsRepository$listCustomConnectors$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L38
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L3e
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.settings.HatchCredentialsRepository$listCustomConnectors$2 r0 = new com.facebook.aura.settings.HatchCredentialsRepository$listCustomConnectors$2
            r0.<init>(r6, r1)
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L38:
            com.facebook.aura.settings.HatchCredentialsRepository$listCustomConnectors$1 r5 = new com.facebook.aura.settings.HatchCredentialsRepository$listCustomConnectors$1
            r5.<init>(r6, r7)
            goto L12
        L3e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchCredentialsRepository.m1945listCustomConnectorsIoAF18A(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* renamed from: update-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1946updateyxL6bBk(java.lang.String r12, java.lang.String r13, java.lang.String r14, com.facebook.aura.settings.CredentialAgentPermission r15, X.HtJ<? super X.HsJ<? extends com.facebook.aura.settings.CredentialAgentPermission>> r16) {
        /*
            r11 = this;
            r3 = r16
            boolean r0 = r3 instanceof com.facebook.aura.settings.HatchCredentialsRepository$update$1
            r8 = r11
            if (r0 == 0) goto L47
            r4 = r3
            com.facebook.aura.settings.HatchCredentialsRepository$update$1 r4 = (com.facebook.aura.settings.HatchCredentialsRepository$update$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r4.label = r2
        L15:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 != r1) goto L4d
            X.Hwg.A00(r3)
        L23:
            X.HsJ r3 = (X.HsJ) r3
            java.lang.Object r0 = r3.value
            return r0
        L28:
            X.78T r0 = X.AnonymousClass002.A0s(r3)
            r11 = 0
            com.facebook.aura.settings.HatchCredentialsRepository$update$2 r5 = new com.facebook.aura.settings.HatchCredentialsRepository$update$2
            r9 = r12
            r6 = r13
            r7 = r14
            r10 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r4.L$0 = r11
            r4.L$1 = r11
            r4.L$2 = r11
            r4.L$3 = r11
            r4.label = r1
            java.lang.Object r3 = X.GAo.A00(r4, r0, r5)
            if (r3 != r2) goto L23
            return r2
        L47:
            com.facebook.aura.settings.HatchCredentialsRepository$update$1 r4 = new com.facebook.aura.settings.HatchCredentialsRepository$update$1
            r4.<init>(r11, r3)
            goto L15
        L4d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchCredentialsRepository.m1946updateyxL6bBk(java.lang.String, java.lang.String, java.lang.String, com.facebook.aura.settings.CredentialAgentPermission, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object submitCapture(CredentialCaptureRequestJson credentialCaptureRequestJson, HtJ<? super CredentialCaptureResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C134972(credentialCaptureRequestJson, this, null));
    }

    public final Object requestExternalProviderGrant(String str, String str2, HtJ<? super ExternalProviderGrantResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(str, str2, this, null));
    }
}
