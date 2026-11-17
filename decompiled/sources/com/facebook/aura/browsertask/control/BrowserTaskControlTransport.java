package com.facebook.aura.browsertask.control;

import X.AbstractC3358CGz;
import X.C06H;
import X.C7384Etj;
import X.HtJ;
import com.facebook.aura.network.http.RequestType;

/* loaded from: classes6.dex */
public final class BrowserTaskControlTransport {
    public static final int $stable = 8;

    @Deprecated
    public static final long CONTROL_REQUEST_TIMEOUT_SECONDS = 10;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final long TRANSITION_TIMEOUT_SECONDS = 390;
    public final AbstractC3358CGz userSession;

    public BrowserTaskControlTransport(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* renamed from: request-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m293requesthUnOzRk(java.lang.String r14, java.lang.String r15, com.facebook.aura.network.http.RequestType r16, com.facebook.aura.browsertask.control.BrowserViewerPreference r17, long r18, X.HtJ<? super X.HsJ<com.facebook.aura.browsertask.control.BrowserTaskSnapshotJson>> r20) {
        /*
            r13 = this;
            r3 = r20
            boolean r0 = r3 instanceof com.facebook.aura.browsertask.control.BrowserTaskControlTransport$request$1
            r10 = r13
            if (r0 == 0) goto L4d
            r4 = r3
            com.facebook.aura.browsertask.control.BrowserTaskControlTransport$request$1 r4 = (com.facebook.aura.browsertask.control.BrowserTaskControlTransport$request$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r4.label = r2
        L15:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 != r1) goto L53
            X.Hwg.A00(r3)
        L23:
            X.HsJ r3 = (X.HsJ) r3
            java.lang.Object r0 = r3.value
            return r0
        L28:
            X.78T r0 = X.AnonymousClass002.A0s(r3)
            r13 = 0
            com.facebook.aura.browsertask.control.BrowserTaskControlTransport$request$2 r5 = new com.facebook.aura.browsertask.control.BrowserTaskControlTransport$request$2
            r6 = r14
            r7 = r15
            r9 = r16
            r8 = r17
            r11 = r18
            r5.<init>(r6, r7, r8, r9, r10, r11, r13)
            r4.L$0 = r13
            r4.L$1 = r13
            r4.L$2 = r13
            r4.L$3 = r13
            r4.J$0 = r11
            r4.label = r1
            java.lang.Object r3 = X.GAo.A00(r4, r0, r5)
            if (r3 != r2) goto L23
            return r2
        L4d:
            com.facebook.aura.browsertask.control.BrowserTaskControlTransport$request$1 r4 = new com.facebook.aura.browsertask.control.BrowserTaskControlTransport$request$1
            r4.<init>(r13, r3)
            goto L15
        L53:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.control.BrowserTaskControlTransport.m293requesthUnOzRk(java.lang.String, java.lang.String, com.facebook.aura.network.http.RequestType, com.facebook.aura.browsertask.control.BrowserViewerPreference, long, X.HtJ):java.lang.Object");
    }

    /* renamed from: request-hUnOzRk$default, reason: not valid java name */
    public static /* synthetic */ Object m294requesthUnOzRk$default(BrowserTaskControlTransport browserTaskControlTransport, String str, String str2, RequestType requestType, BrowserViewerPreference browserViewerPreference, long j, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            requestType = RequestType.POST;
        }
        if ((i & 8) != 0) {
            browserViewerPreference = null;
        }
        if ((i & 16) != 0) {
            j = 10;
        }
        return browserTaskControlTransport.m293requesthUnOzRk(str, str2, requestType, browserViewerPreference, j, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* renamed from: heartbeat-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m295heartbeatgIAlus(java.lang.String r12, X.HtJ<? super X.HsJ<com.facebook.aura.browsertask.control.BrowserTaskSnapshotJson>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.facebook.aura.browsertask.control.BrowserTaskControlTransport$heartbeat$1
            r4 = r11
            if (r0 == 0) goto L39
            r11 = r13
            com.facebook.aura.browsertask.control.BrowserTaskControlTransport$heartbeat$1 r11 = (com.facebook.aura.browsertask.control.BrowserTaskControlTransport$heartbeat$1) r11
            int r2 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r11.label = r2
        L13:
            java.lang.Object r3 = r11.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r11.label
            r0 = 1
            if (r1 == 0) goto L23
            if (r1 != r0) goto L3f
            java.lang.Object r0 = X.AnonymousClass001.A0q(r3)
        L22:
            return r0
        L23:
            X.Hwg.A00(r3)
            r8 = 0
            r11.L$0 = r8
            r11.label = r0
            java.lang.String r6 = "heartbeat"
            com.facebook.aura.network.http.RequestType r7 = com.facebook.aura.network.http.RequestType.POST
            r9 = 10
            r5 = r12
            java.lang.Object r0 = r4.m293requesthUnOzRk(r5, r6, r7, r8, r9, r11)
            if (r0 != r2) goto L22
            return r2
        L39:
            com.facebook.aura.browsertask.control.BrowserTaskControlTransport$heartbeat$1 r11 = new com.facebook.aura.browsertask.control.BrowserTaskControlTransport$heartbeat$1
            r11.<init>(r4, r13)
            goto L13
        L3f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.control.BrowserTaskControlTransport.m295heartbeatgIAlus(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* renamed from: present-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m296present0E7RQCE(java.lang.String r12, com.facebook.aura.browsertask.control.BrowserViewerPreference r13, X.HtJ<? super X.HsJ<com.facebook.aura.browsertask.control.BrowserTaskSnapshotJson>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.facebook.aura.browsertask.control.BrowserTaskControlTransport$present$1
            r4 = r11
            if (r0 == 0) goto L3c
            r11 = r14
            com.facebook.aura.browsertask.control.BrowserTaskControlTransport$present$1 r11 = (com.facebook.aura.browsertask.control.BrowserTaskControlTransport$present$1) r11
            int r2 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3c
            int r2 = r2 - r1
            r11.label = r2
        L13:
            java.lang.Object r3 = r11.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r11.label
            r1 = 1
            if (r0 == 0) goto L23
            if (r0 != r1) goto L42
            java.lang.Object r0 = X.AnonymousClass001.A0q(r3)
        L22:
            return r0
        L23:
            X.Hwg.A00(r3)
            r0 = 0
            r11.L$0 = r0
            r11.L$1 = r0
            r11.label = r1
            java.lang.String r6 = "present"
            r9 = 390(0x186, double:1.927E-321)
            com.facebook.aura.network.http.RequestType r7 = com.facebook.aura.network.http.RequestType.POST
            r5 = r12
            r8 = r13
            java.lang.Object r0 = r4.m293requesthUnOzRk(r5, r6, r7, r8, r9, r11)
            if (r0 != r2) goto L22
            return r2
        L3c:
            com.facebook.aura.browsertask.control.BrowserTaskControlTransport$present$1 r11 = new com.facebook.aura.browsertask.control.BrowserTaskControlTransport$present$1
            r11.<init>(r4, r14)
            goto L13
        L42:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.control.BrowserTaskControlTransport.m296present0E7RQCE(java.lang.String, com.facebook.aura.browsertask.control.BrowserViewerPreference, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* renamed from: release-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m297releasegIAlus(java.lang.String r12, X.HtJ<? super X.HsJ<com.facebook.aura.browsertask.control.BrowserTaskSnapshotJson>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.facebook.aura.browsertask.control.BrowserTaskControlTransport$release$1
            r4 = r11
            if (r0 == 0) goto L39
            r11 = r13
            com.facebook.aura.browsertask.control.BrowserTaskControlTransport$release$1 r11 = (com.facebook.aura.browsertask.control.BrowserTaskControlTransport$release$1) r11
            int r2 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r11.label = r2
        L13:
            java.lang.Object r3 = r11.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r11.label
            r0 = 1
            if (r1 == 0) goto L23
            if (r1 != r0) goto L3f
            java.lang.Object r0 = X.AnonymousClass001.A0q(r3)
        L22:
            return r0
        L23:
            X.Hwg.A00(r3)
            r8 = 0
            r11.L$0 = r8
            r11.label = r0
            java.lang.String r6 = "release"
            com.facebook.aura.network.http.RequestType r7 = com.facebook.aura.network.http.RequestType.POST
            r9 = 10
            r5 = r12
            java.lang.Object r0 = r4.m293requesthUnOzRk(r5, r6, r7, r8, r9, r11)
            if (r0 != r2) goto L22
            return r2
        L39:
            com.facebook.aura.browsertask.control.BrowserTaskControlTransport$release$1 r11 = new com.facebook.aura.browsertask.control.BrowserTaskControlTransport$release$1
            r11.<init>(r4, r13)
            goto L13
        L3f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.control.BrowserTaskControlTransport.m297releasegIAlus(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* renamed from: stop-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m298stopgIAlus(java.lang.String r12, X.HtJ<? super X.HsJ<com.facebook.aura.browsertask.control.BrowserTaskSnapshotJson>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.facebook.aura.browsertask.control.BrowserTaskControlTransport$stop$1
            r4 = r11
            if (r0 == 0) goto L39
            r11 = r13
            com.facebook.aura.browsertask.control.BrowserTaskControlTransport$stop$1 r11 = (com.facebook.aura.browsertask.control.BrowserTaskControlTransport$stop$1) r11
            int r2 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r11.label = r2
        L13:
            java.lang.Object r3 = r11.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r11.label
            r0 = 1
            if (r1 == 0) goto L23
            if (r1 != r0) goto L3f
            java.lang.Object r0 = X.AnonymousClass001.A0q(r3)
        L22:
            return r0
        L23:
            X.Hwg.A00(r3)
            r8 = 0
            r11.L$0 = r8
            r11.label = r0
            java.lang.String r6 = "stop"
            com.facebook.aura.network.http.RequestType r7 = com.facebook.aura.network.http.RequestType.POST
            r9 = 10
            r5 = r12
            java.lang.Object r0 = r4.m293requesthUnOzRk(r5, r6, r7, r8, r9, r11)
            if (r0 != r2) goto L22
            return r2
        L39:
            com.facebook.aura.browsertask.control.BrowserTaskControlTransport$stop$1 r11 = new com.facebook.aura.browsertask.control.BrowserTaskControlTransport$stop$1
            r11.<init>(r4, r13)
            goto L13
        L3f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.control.BrowserTaskControlTransport.m298stopgIAlus(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* renamed from: takeover-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m299takeover0E7RQCE(java.lang.String r12, com.facebook.aura.browsertask.control.BrowserViewerPreference r13, X.HtJ<? super X.HsJ<com.facebook.aura.browsertask.control.BrowserTaskSnapshotJson>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.facebook.aura.browsertask.control.BrowserTaskControlTransport$takeover$1
            r4 = r11
            if (r0 == 0) goto L3c
            r11 = r14
            com.facebook.aura.browsertask.control.BrowserTaskControlTransport$takeover$1 r11 = (com.facebook.aura.browsertask.control.BrowserTaskControlTransport$takeover$1) r11
            int r2 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3c
            int r2 = r2 - r1
            r11.label = r2
        L13:
            java.lang.Object r3 = r11.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r11.label
            r1 = 1
            if (r0 == 0) goto L23
            if (r0 != r1) goto L42
            java.lang.Object r0 = X.AnonymousClass001.A0q(r3)
        L22:
            return r0
        L23:
            X.Hwg.A00(r3)
            r0 = 0
            r11.L$0 = r0
            r11.L$1 = r0
            r11.label = r1
            java.lang.String r6 = "takeover"
            r9 = 390(0x186, double:1.927E-321)
            com.facebook.aura.network.http.RequestType r7 = com.facebook.aura.network.http.RequestType.POST
            r5 = r12
            r8 = r13
            java.lang.Object r0 = r4.m293requesthUnOzRk(r5, r6, r7, r8, r9, r11)
            if (r0 != r2) goto L22
            return r2
        L3c:
            com.facebook.aura.browsertask.control.BrowserTaskControlTransport$takeover$1 r11 = new com.facebook.aura.browsertask.control.BrowserTaskControlTransport$takeover$1
            r11.<init>(r4, r14)
            goto L13
        L42:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.control.BrowserTaskControlTransport.m299takeover0E7RQCE(java.lang.String, com.facebook.aura.browsertask.control.BrowserViewerPreference, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* renamed from: updateViewer-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m300updateViewer0E7RQCE(java.lang.String r12, com.facebook.aura.browsertask.control.BrowserViewerPreference r13, X.HtJ<? super X.HsJ<com.facebook.aura.browsertask.control.BrowserTaskSnapshotJson>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.facebook.aura.browsertask.control.BrowserTaskControlTransport$updateViewer$1
            r4 = r11
            if (r0 == 0) goto L3c
            r11 = r14
            com.facebook.aura.browsertask.control.BrowserTaskControlTransport$updateViewer$1 r11 = (com.facebook.aura.browsertask.control.BrowserTaskControlTransport$updateViewer$1) r11
            int r2 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3c
            int r2 = r2 - r1
            r11.label = r2
        L13:
            java.lang.Object r3 = r11.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r11.label
            r1 = 1
            if (r0 == 0) goto L23
            if (r0 != r1) goto L42
            java.lang.Object r0 = X.AnonymousClass001.A0q(r3)
        L22:
            return r0
        L23:
            X.Hwg.A00(r3)
            com.facebook.aura.network.http.RequestType r7 = com.facebook.aura.network.http.RequestType.PATCH
            r0 = 0
            r11.L$0 = r0
            r11.L$1 = r0
            r11.label = r1
            java.lang.String r6 = "viewer"
            r9 = 10
            r5 = r12
            r8 = r13
            java.lang.Object r0 = r4.m293requesthUnOzRk(r5, r6, r7, r8, r9, r11)
            if (r0 != r2) goto L22
            return r2
        L3c:
            com.facebook.aura.browsertask.control.BrowserTaskControlTransport$updateViewer$1 r11 = new com.facebook.aura.browsertask.control.BrowserTaskControlTransport$updateViewer$1
            r11.<init>(r4, r14)
            goto L13
        L42:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.control.BrowserTaskControlTransport.m300updateViewer0E7RQCE(java.lang.String, com.facebook.aura.browsertask.control.BrowserViewerPreference, X.HtJ):java.lang.Object");
    }
}
