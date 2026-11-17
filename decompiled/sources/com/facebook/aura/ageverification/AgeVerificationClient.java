package com.facebook.aura.ageverification;

import X.C3cG;
import X.C7BY;
import X.CFK;
import X.HsJ;
import com.facebook.aura.json.HatchProblemJson;
import com.facebook.aura.json.HatchProblemJsonKt;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.network.transport.HatchMultipartPart;
import java.util.concurrent.CancellationException;

/* loaded from: classes6.dex */
public final class AgeVerificationClient {
    public static final int $stable = 0;
    public static final AgeVerificationClient INSTANCE = new AgeVerificationClient();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* renamed from: start-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m217start0E7RQCE(com.facebook.aura.ageverification.AgeVerificationMethod r15, java.lang.Integer r16, X.HtJ<? super X.HsJ<com.facebook.aura.ageverification.AgeVerificationAttempt>> r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.AgeVerificationClient.m217start0E7RQCE(com.facebook.aura.ageverification.AgeVerificationMethod, java.lang.Integer, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* renamed from: submit-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m218submit0E7RQCE(java.lang.String r15, java.util.List<java.lang.String> r16, X.HtJ<? super X.HsJ<kotlin.Unit>> r17) throws java.lang.Throwable {
        /*
            r14 = this;
            r1 = r14
            r5 = r17
            boolean r0 = r5 instanceof com.facebook.aura.ageverification.AgeVerificationClient$submit$1
            if (r0 == 0) goto L6f
            r4 = r5
            com.facebook.aura.ageverification.AgeVerificationClient$submit$1 r4 = (com.facebook.aura.ageverification.AgeVerificationClient$submit$1) r4
            int r3 = r4.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L6f
            int r3 = r3 - r2
            r4.label = r3
        L15:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r13 = 1
            if (r0 == 0) goto L35
            if (r0 != r13) goto L75
            java.lang.Object r1 = r4.L$7
            com.facebook.aura.ageverification.AgeVerificationClient r1 = (com.facebook.aura.ageverification.AgeVerificationClient) r1
            java.lang.Object r0 = X.AnonymousClass001.A0q(r3)
        L28:
            java.lang.Object r2 = r1.m215mapFailurebjn95JY(r0)
            boolean r0 = r2 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L34
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L34:
            return r2
        L35:
            X.Hwg.A00(r3)
            com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.ageverification.AgeVerificationStefiPath$Submit r9 = com.facebook.aura.ageverification.AgeVerificationStefiPath.Submit.INSTANCE
            com.facebook.aura.ageverification.AgeVerificationSubmitRequestJson r10 = new com.facebook.aura.ageverification.AgeVerificationSubmitRequestJson
            r0 = r16
            r10.<init>(r15, r0)
            com.facebook.aura.network.http.RequestType r11 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r12 = X.C9jH.A00
            com.facebook.aura.ageverification.AgeVerificationClient$submit-0E7RQCE$$inlined$executeStefiRequest-tZkwj4A$default$1 r6 = com.facebook.aura.ageverification.AgeVerificationClient$submit0E7RQCE$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE
            com.facebook.aura.ageverification.AgeVerificationClient$submit-0E7RQCE$$inlined$executeStefiRequest-tZkwj4A$default$2 r7 = com.facebook.aura.ageverification.AgeVerificationClient$submit0E7RQCE$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE
            r8 = 0
            r14 = 0
            r4.L$0 = r14
            r4.L$1 = r14
            r4.L$2 = r14
            r4.L$3 = r14
            r4.L$4 = r14
            r4.L$5 = r14
            r4.L$6 = r14
            r4.L$7 = r1
            r4.I$0 = r13
            r4.I$1 = r8
            r4.label = r13
            r15 = r8
            r16 = r14
            r17 = r4
            java.lang.Object r0 = r5.m1604executeStefiRequestWithjLovISM(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r0 != r2) goto L28
            return r2
        L6f:
            com.facebook.aura.ageverification.AgeVerificationClient$submit$1 r4 = new com.facebook.aura.ageverification.AgeVerificationClient$submit$1
            r4.<init>(r14, r5)
            goto L15
        L75:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.AgeVerificationClient.m218submit0E7RQCE(java.lang.String, java.util.List, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* renamed from: retryServerFailureOnce-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object m216retryServerFailureOncegIAlus(X.G0U<? super X.HtJ<? super X.HsJ<? extends T>>, ? extends java.lang.Object> r7, X.HtJ<? super X.HsJ<? extends T>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.ageverification.AgeVerificationClient$retryServerFailureOnce$1
            if (r0 == 0) goto L7d
            r3 = r8
            com.facebook.aura.ageverification.AgeVerificationClient$retryServerFailureOnce$1 r3 = (com.facebook.aura.ageverification.AgeVerificationClient$retryServerFailureOnce$1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7d
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r2 = r3.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r3.label
            r4 = 2
            r0 = 1
            if (r1 == 0) goto L28
            if (r1 == r0) goto L36
            if (r1 != r4) goto L83
            X.Hwg.A00(r2)
        L23:
            X.HsJ r2 = (X.HsJ) r2
            java.lang.Object r0 = r2.value
            return r0
        L28:
            X.Hwg.A00(r2)
            r3.L$0 = r7
            r3.label = r0
            java.lang.Object r2 = r7.invoke(r3)
            if (r2 != r5) goto L3d
            return r5
        L36:
            java.lang.Object r7 = r3.L$0
            X.G0U r7 = (X.G0U) r7
            X.Hwg.A00(r2)
        L3d:
            X.HsJ r2 = (X.HsJ) r2
            java.lang.Object r6 = r2.value
            java.lang.Throwable r2 = X.HsJ.A00(r6)
            boolean r0 = r2 instanceof com.facebook.aura.ageverification.AgeVerificationException
            if (r0 == 0) goto L88
            com.facebook.aura.ageverification.AgeVerificationException r2 = (com.facebook.aura.ageverification.AgeVerificationException) r2
            if (r2 == 0) goto L88
            int r1 = r2.httpResponseCode
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 != r0) goto L88
            java.lang.String r1 = r2.problemType
            r0 = 104(0x68, float:1.46E-43)
            java.lang.String r0 = X.C60N.A00(r0)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6d
            r0 = 100
            java.lang.String r0 = X.C60N.A00(r0)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L88
        L6d:
            r0 = 0
            r3.L$0 = r0
            r3.L$1 = r0
            r3.L$2 = r0
            r3.label = r4
            java.lang.Object r2 = r7.invoke(r3)
            if (r2 != r5) goto L23
            return r5
        L7d:
            com.facebook.aura.ageverification.AgeVerificationClient$retryServerFailureOnce$1 r3 = new com.facebook.aura.ageverification.AgeVerificationClient$retryServerFailureOnce$1
            r3.<init>(r6, r8)
            goto L12
        L83:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L88:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.AgeVerificationClient.m216retryServerFailureOncegIAlus(X.G0U, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* renamed from: upload-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m219uploadBWLJW6A(java.lang.String r15, com.facebook.aura.ageverification.AgeVerificationUploadKind r16, java.io.File r17, X.HtJ<? super X.HsJ<java.lang.String>> r18) throws java.lang.Throwable {
        /*
            r14 = this;
            r3 = r18
            boolean r0 = r3 instanceof com.facebook.aura.ageverification.AgeVerificationClient$upload$1
            if (r0 == 0) goto L8d
            r13 = r3
            com.facebook.aura.ageverification.AgeVerificationClient$upload$1 r13 = (com.facebook.aura.ageverification.AgeVerificationClient$upload$1) r13
            int r2 = r13.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8d
            int r2 = r2 - r1
            r13.label = r2
        L14:
            java.lang.Object r1 = r13.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r13.label
            r4 = 1
            if (r0 == 0) goto L32
            if (r0 != r4) goto Lad
            java.lang.Object r14 = r13.L$7
            com.facebook.aura.ageverification.AgeVerificationClient r14 = (com.facebook.aura.ageverification.AgeVerificationClient) r14
            java.lang.Object r0 = X.AnonymousClass001.A0q(r1)
        L27:
            java.lang.Object r1 = r14.m215mapFailurebjn95JY(r0)
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto Lac
            goto L93
        L32:
            X.Hwg.A00(r1)
            com.facebook.aura.network.http.HatchHttpApi r7 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.ageverification.AgeVerificationStefiPath$Upload r10 = com.facebook.aura.ageverification.AgeVerificationStefiPath.Upload.INSTANCE
            java.lang.String r0 = "attempt_id"
            com.facebook.aura.network.transport.HatchMultipartPart r3 = r14.formField(r0, r15)
            r9 = 0
            java.lang.String r1 = "kind"
            java.lang.String r0 = r16.name()
            com.facebook.aura.network.transport.HatchMultipartPart r2 = r14.formField(r1, r0)
            java.lang.String r1 = "upload_medium"
            java.lang.String r0 = r16.getUploadMedium()
            com.facebook.aura.network.transport.HatchMultipartPart r0 = r14.formField(r1, r0)
            com.facebook.aura.network.transport.HatchMultipartPart[] r0 = new com.facebook.aura.network.transport.HatchMultipartPart[]{r3, r2, r0}
            java.util.List r11 = java.util.Arrays.asList(r0)
            java.lang.String r3 = r16.getFilename()
            java.lang.String r2 = r16.getMimeType()
            java.lang.String r1 = "file"
            com.facebook.aura.network.transport.HatchMultipartFilePart r0 = new com.facebook.aura.network.transport.HatchMultipartFilePart
            r6 = r17
            r0.<init>(r1, r3, r2, r6)
            java.util.List r12 = java.util.Collections.singletonList(r0)
            com.facebook.aura.ageverification.AgeVerificationClient$upload-BWLJW6A$$inlined$executeStefiMultipartRequest-BWLJW6A$1 r8 = com.facebook.aura.ageverification.AgeVerificationClient$uploadBWLJW6A$$inlined$executeStefiMultipartRequestBWLJW6A$1.INSTANCE
            r0 = 0
            r13.L$0 = r0
            r13.L$1 = r0
            r13.L$2 = r0
            r13.L$3 = r0
            r13.L$4 = r0
            r13.L$5 = r0
            r13.L$6 = r0
            r13.L$7 = r14
            r13.label = r4
            java.lang.Object r0 = r7.m1601executeStefiMultipartRequestWithhUnOzRk(r8, r9, r10, r11, r12, r13)
            if (r0 != r5) goto L27
            return r5
        L8d:
            com.facebook.aura.ageverification.AgeVerificationClient$upload$1 r13 = new com.facebook.aura.ageverification.AgeVerificationClient$upload$1
            r13.<init>(r14, r3)
            goto L14
        L93:
            com.facebook.aura.ageverification.AgeVerificationUploadResponseJson r1 = (com.facebook.aura.ageverification.AgeVerificationUploadResponseJson) r1     // Catch: java.lang.Throwable -> La7
            java.lang.String r1 = r1.file_handle     // Catch: java.lang.Throwable -> La7
            boolean r0 = X.C7BY.A0j(r1)     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto Lac
            java.lang.String r2 = "invalid_response"
            r1 = 200(0xc8, float:2.8E-43)
            com.facebook.aura.ageverification.AgeVerificationException r0 = new com.facebook.aura.ageverification.AgeVerificationException     // Catch: java.lang.Throwable -> La7
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> La7
            throw r0     // Catch: java.lang.Throwable -> La7
        La7:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        Lac:
            return r1
        Lad:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.AgeVerificationClient.m219uploadBWLJW6A(java.lang.String, com.facebook.aura.ageverification.AgeVerificationUploadKind, java.io.File, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* renamed from: uploadAndSubmit-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m220uploadAndSubmit0E7RQCE(com.facebook.aura.ageverification.AgeVerificationAttempt r12, java.util.Map<com.facebook.aura.ageverification.AgeVerificationUploadKind, ? extends java.io.File> r13, X.HtJ<? super X.HsJ<kotlin.Unit>> r14) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.AgeVerificationClient.m220uploadAndSubmit0E7RQCE(com.facebook.aura.ageverification.AgeVerificationAttempt, java.util.Map, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: startAndSubmit-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m221startAndSubmitBWLJW6A(com.facebook.aura.ageverification.AgeVerificationMethod r10, java.lang.Integer r11, java.util.Map<com.facebook.aura.ageverification.AgeVerificationUploadKind, ? extends java.io.File> r12, X.HtJ<? super X.HsJ<kotlin.Unit>> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.AgeVerificationClient.m221startAndSubmitBWLJW6A(com.facebook.aura.ageverification.AgeVerificationMethod, java.lang.Integer, java.util.Map, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* renamed from: status-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m222statusIoAF18A(X.HtJ<? super X.HsJ<com.facebook.aura.ageverification.AgeVerificationStatus>> r14) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.facebook.aura.ageverification.AgeVerificationClient$status$1
            if (r0 == 0) goto L5c
            r12 = r14
            com.facebook.aura.ageverification.AgeVerificationClient$status$1 r12 = (com.facebook.aura.ageverification.AgeVerificationClient$status$1) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5c
            int r2 = r2 - r1
            r12.label = r2
        L12:
            java.lang.Object r3 = r12.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r12.label
            r0 = 1
            if (r1 == 0) goto L36
            if (r1 != r0) goto L62
            java.lang.Object r13 = r12.L$5
            com.facebook.aura.ageverification.AgeVerificationClient r13 = (com.facebook.aura.ageverification.AgeVerificationClient) r13
            java.lang.Object r0 = X.AnonymousClass001.A0q(r3)
        L25:
            java.lang.Object r2 = r13.m215mapFailurebjn95JY(r0)
            boolean r0 = r2 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L35
            com.facebook.aura.ageverification.AgeVerificationStatusResponseJson r2 = (com.facebook.aura.ageverification.AgeVerificationStatusResponseJson) r2
            com.facebook.aura.ageverification.AgeVerificationStatus r2 = r2.toDomain()
        L35:
            return r2
        L36:
            X.Hwg.A00(r3)
            com.facebook.aura.network.http.HatchHttpApi r3 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.ageverification.AgeVerificationStefiPath$Status r6 = com.facebook.aura.ageverification.AgeVerificationStefiPath.Status.INSTANCE
            com.facebook.aura.network.http.RequestType r7 = com.facebook.aura.network.http.RequestType.GET
            X.9jH r10 = X.C9jH.A00
            com.facebook.aura.ageverification.AgeVerificationClient$status-IoAF18A$$inlined$executeStefiRequest-bMdYcbs$default$1 r4 = com.facebook.aura.ageverification.AgeVerificationClient$statusIoAF18A$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE
            r5 = 0
            r8 = 0
            r12.L$0 = r8
            r12.L$1 = r8
            r12.L$2 = r8
            r12.L$3 = r8
            r12.L$4 = r8
            r12.L$5 = r13
            r12.label = r0
            r9 = r8
            r11 = r10
            java.lang.Object r0 = r3.m1596executeBodylessStefiRequestWithtZkwj4A(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r0 != r2) goto L25
            return r2
        L5c:
            com.facebook.aura.ageverification.AgeVerificationClient$status$1 r12 = new com.facebook.aura.ageverification.AgeVerificationClient$status$1
            r12.<init>(r13, r14)
            goto L12
        L62:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.AgeVerificationClient.m222statusIoAF18A(X.HtJ):java.lang.Object");
    }

    private final HatchMultipartPart formField(String str, String str2) {
        return new HatchMultipartPart(str, null, "text/plain", C3cG.A1S(str2));
    }

    /* renamed from: mapFailure-bjn95JY, reason: not valid java name */
    private final <T> Object m215mapFailurebjn95JY(Object obj) throws Throwable {
        NetworkException networkException;
        String str;
        Throwable thA00 = HsJ.A00(obj);
        String str2 = null;
        if (thA00 instanceof CancellationException) {
            if (thA00 != null) {
                throw thA00;
            }
        } else if (thA00 != null) {
            try {
                if (!(thA00 instanceof NetworkException) || (networkException = (NetworkException) thA00) == null) {
                    throw thA00;
                }
                HatchProblemJson hatchProblemJsonHatchProblemOf = HatchProblemJsonKt.hatchProblemOf(networkException.getMessage());
                if (hatchProblemJsonHatchProblemOf != null && (str = hatchProblemJsonHatchProblemOf.type) != null && !C7BY.A0j(str)) {
                    str2 = str;
                }
                CFK.A0H(AgeVerificationClientKt.TAG, "Request failed: http=%d type=%s", Integer.valueOf(networkException.httpResponseCode), str2);
                throw new AgeVerificationException(str2, networkException.httpResponseCode);
            } catch (Throwable th) {
                return C3cG.A0s(th);
            }
        }
        return obj;
    }
}
