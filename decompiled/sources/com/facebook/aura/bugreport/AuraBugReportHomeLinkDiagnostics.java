package com.facebook.aura.bugreport;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class AuraBugReportHomeLinkDiagnostics {
    public static final int $stable = 0;
    public static final AuraBugReportHomeLinkDiagnostics INSTANCE = new AuraBugReportHomeLinkDiagnostics();
    public static final long MAX_RESPONSE_BYTES = 10485760;

    @DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportHomeLinkDiagnostics", f = "AuraBugReportHomeLinkDiagnostics.kt", l = {26}, m = "collect", v = 2)
    /* renamed from: com.facebook.aura.bugreport.AuraBugReportHomeLinkDiagnostics$collect$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraBugReportHomeLinkDiagnostics.this.collect(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportHomeLinkDiagnostics", f = "AuraBugReportHomeLinkDiagnostics.kt", l = {73}, m = "collectReport", v = 2)
    /* renamed from: com.facebook.aura.bugreport.AuraBugReportHomeLinkDiagnostics$collectReport$1, reason: invalid class name and case insensitive filesystem */
    public final class C110051 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C110051(HtJ<? super C110051> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraBugReportHomeLinkDiagnostics.this.collectReport(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collectReport(X.AbstractC3358CGz r13, X.HtJ<? super byte[]> r14) {
        /*
            r12 = this;
            r10 = r13
            r3 = r14
            boolean r0 = r14 instanceof com.facebook.aura.bugreport.AuraBugReportHomeLinkDiagnostics.C110051
            if (r0 == 0) goto Lc3
            r14 = r3
            com.facebook.aura.bugreport.AuraBugReportHomeLinkDiagnostics$collectReport$1 r14 = (com.facebook.aura.bugreport.AuraBugReportHomeLinkDiagnostics.C110051) r14
            int r2 = r14.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc3
            int r2 = r2 - r1
            r14.label = r2
        L14:
            java.lang.Object r1 = r14.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r14.label
            r3 = 1
            r6 = 0
            if (r0 == 0) goto L80
            if (r0 != r3) goto Ldf
            java.lang.Object r9 = r14.L$3
            java.io.ByteArrayOutputStream r9 = (java.io.ByteArrayOutputStream) r9
            java.lang.Object r2 = r14.L$2
            java.lang.Object r5 = r14.L$1
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore r5 = (com.facebook.aura.gateway.store.HatchGatewayPrefsStore) r5
            java.lang.Object r0 = r14.L$0
            X.CGz r10 = X.C60O.A0D(r0, r1)
        L30:
            com.facebook.aura.network.transport.HatchHttpResponse r1 = (com.facebook.aura.network.transport.HatchHttpResponse) r1
            X.C3cG.A1H(r14)
            com.facebook.aura.auth.AuraSessionManager r0 = com.facebook.aura.auth.AuraSessionManager.INSTANCE
            boolean r0 = r0.isCurrentSession(r10)
            if (r0 == 0) goto Le4
            java.lang.String r0 = r5.getGatewayUrl()
            boolean r0 = X.C7384Etj.areEqual(r0, r2)
            if (r0 == 0) goto Le4
            if (r1 == 0) goto Ld8
            boolean r0 = r1.isSuccessful
            if (r0 != r3) goto Ld8
            byte[] r4 = r9.toByteArray()
            X.9sU r3 = com.facebook.aura.json.HatchJsonKt.HatchJson
            X.C7384Etj.A0X(r4)
            java.nio.charset.Charset r0 = X.DCl.A05
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4, r0)
            com.facebook.aura.json.HatchEnvelope$Companion r1 = com.facebook.aura.json.HatchEnvelope.Companion
            int r0 = com.facebook.aura.bugreport.HomeLinkBugReportsJson.$stable
            com.facebook.aura.bugreport.HomeLinkBugReportsJson$$serializer r0 = com.facebook.aura.bugreport.HomeLinkBugReportsJson$$serializer.INSTANCE
            X.9hr r0 = r1.serializer(r0)
            java.lang.Object r1 = r3.A00(r2, r0)
            com.facebook.aura.json.HatchEnvelope r1 = (com.facebook.aura.json.HatchEnvelope) r1
            boolean r0 = r1.ok
            if (r0 == 0) goto Ld1
            T r0 = r1.result
            if (r0 == 0) goto Lca
            com.facebook.aura.bugreport.HomeLinkBugReportsJson r0 = (com.facebook.aura.bugreport.HomeLinkBugReportsJson) r0
            java.util.List<com.facebook.aura.bugreport.HomeLinkBugReportJson> r0 = r0.reports
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Le4
            return r4
        L80:
            X.Hwg.A00(r1)
            X.C3cG.A1H(r14)
            com.facebook.aura.auth.AuraSessionManager r0 = com.facebook.aura.auth.AuraSessionManager.INSTANCE
            boolean r0 = r0.isCurrentSession(r13)
            if (r0 == 0) goto Le4
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore r5 = X.C3cG.A0D(r13)
            java.lang.String r2 = r5.getGatewayUrl()
            boolean r0 = X.C7BY.A0j(r2)
            if (r0 != 0) goto Le4
            com.facebook.aura.bugreport.AuraBugReportHomeLinkDiagnostics$collectReport$sink$1 r9 = new com.facebook.aura.bugreport.AuraBugReportHomeLinkDiagnostics$collectReport$sink$1
            r9.<init>()
            com.facebook.aura.network.http.HatchHttpApi r7 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.bugreport.BugReportJarvisPath$HomeLinkBugReports r8 = com.facebook.aura.bugreport.BugReportJarvisPath.HomeLinkBugReports.INSTANCE
            r0 = 35000(0x88b8, double:1.72923E-319)
            java.lang.Long r12 = X.C3cG.A0S(r0)
            java.lang.Long r13 = X.C3cG.A0S(r0)
            r14.L$0 = r10
            r14.L$1 = r5
            r14.L$2 = r2
            r14.L$3 = r9
            r14.label = r3
            java.lang.String r11 = "application/json"
            java.lang.Object r1 = r7.makeJarvisHttpStreamingPost(r8, r9, r10, r11, r12, r13, r14)
            if (r1 != r4) goto L30
            return r4
        Lc3:
            com.facebook.aura.bugreport.AuraBugReportHomeLinkDiagnostics$collectReport$1 r14 = new com.facebook.aura.bugreport.AuraBugReportHomeLinkDiagnostics$collectReport$1
            r14.<init>(r3)
            goto L14
        Lca:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        Ld1:
            java.lang.String r0 = "Home Link diagnostics collection failed"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        Ld8:
            java.lang.String r0 = "Home Link diagnostics request failed"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        Ldf:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Le4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bugreport.AuraBugReportHomeLinkDiagnostics.collectReport(X.CGz, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(android.content.Context r7, X.AbstractC3358CGz r8, java.lang.String r9, X.HtJ<? super java.io.File> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.bugreport.AuraBugReportHomeLinkDiagnostics.AnonymousClass1
            if (r0 == 0) goto L27
            r5 = r10
            com.facebook.aura.bugreport.AuraBugReportHomeLinkDiagnostics$collect$1 r5 = (com.facebook.aura.bugreport.AuraBugReportHomeLinkDiagnostics.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r3 = 0
            r0 = 1
            if (r1 == 0) goto L32
            if (r1 != r0) goto L2d
            java.lang.Object r9 = r5.L$2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = r5.L$0
            android.content.Context r7 = (android.content.Context) r7
            goto L44
        L27:
            com.facebook.aura.bugreport.AuraBugReportHomeLinkDiagnostics$collect$1 r5 = new com.facebook.aura.bugreport.AuraBugReportHomeLinkDiagnostics$collect$1
            r5.<init>(r10)
            goto L12
        L2d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L32:
            X.Hwg.A00(r4)
            r5.L$0 = r7     // Catch: java.lang.Exception -> L53 java.util.concurrent.CancellationException -> L80
            r5.L$1 = r3     // Catch: java.lang.Exception -> L53 java.util.concurrent.CancellationException -> L80
            r5.L$2 = r9     // Catch: java.lang.Exception -> L53 java.util.concurrent.CancellationException -> L80
            r5.label = r0     // Catch: java.lang.Exception -> L53 java.util.concurrent.CancellationException -> L80
            java.lang.Object r4 = r6.collectReport(r8, r5)     // Catch: java.lang.Exception -> L53 java.util.concurrent.CancellationException -> L80
            if (r4 != r2) goto L47
            return r2
        L44:
            X.Hwg.A00(r4)     // Catch: java.lang.Exception -> L53 java.util.concurrent.CancellationException -> L80
        L47:
            byte[] r4 = (byte[]) r4     // Catch: java.lang.Exception -> L53 java.util.concurrent.CancellationException -> L80
            if (r4 == 0) goto L52
            java.lang.String r0 = "home_link_bug_reports.json"
            X.HxE r0 = X.C3cG.A0r(r0, r4)     // Catch: java.lang.Exception -> L53 java.util.concurrent.CancellationException -> L80
            goto L5f
        L52:
            return r3
        L53:
            java.lang.String r0 = "Home Link diagnostics collection failed; Home Link diagnostics are not included."
            byte[] r1 = X.C3cG.A1S(r0)
            java.lang.String r0 = "home_link_bug_reports_status.txt"
            X.HxE r0 = X.C3cG.A0r(r0, r1)
        L5f:
            A r2 = r0.first
            java.lang.String r2 = (java.lang.String) r2
            B r1 = r0.second
            byte[] r1 = (byte[]) r1
            com.facebook.aura.bugreport.AuraBugReportCollector r0 = com.facebook.aura.bugreport.AuraBugReportCollector.INSTANCE
            java.io.File r0 = r0.ensureAttachmentsDir$fbandroid_express_aura_java_com_facebook_aura_bugreport_bugreport(r7, r9)
            java.io.File r0 = X.C3cG.A0O(r0, r2)
            X.CFP.A06(r0, r1)     // Catch: java.io.IOException -> L75
            return r0
        L75:
            r0.delete()
            java.lang.String r1 = "AuraBugReportHomeLinkDiagnostics"
            java.lang.String r0 = "Could not write Home Link diagnostic attachment"
            X.CFK.A06(r1, r0)
            return r3
        L80:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bugreport.AuraBugReportHomeLinkDiagnostics.collect(android.content.Context, X.CGz, java.lang.String, X.HtJ):java.lang.Object");
    }
}
