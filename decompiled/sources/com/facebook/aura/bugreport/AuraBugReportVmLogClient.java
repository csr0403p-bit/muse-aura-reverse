package com.facebook.aura.bugreport;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C3UX;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.bugreport.AuraVmLogOutcome;
import com.facebook.aura.bugreport.BugReportJarvisPath;
import com.facebook.aura.settings.HatchDataExportLoggingKt;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class AuraBugReportVmLogClient {
    public static final int $stable = 0;
    public static final long CREATE_TIMEOUT_SECONDS = 120;
    public static final long DOWNLOAD_TIMEOUT_SECONDS = 120;
    public static final long MAX_ARTIFACT_BYTES = 10485760;
    public static final String TAG = "AuraBugReportVmLogClient";
    public static final AuraBugReportVmLogClient INSTANCE = new AuraBugReportVmLogClient();
    public static final String route = FGI.A0M(CustomConnectorRegisterRepositoryKt.ROOT_PATH, BugReportJarvisPath.BugReportLogs.INSTANCE.getValue());
    public static final AtomicBoolean collecting = C60O.A1E();

    @DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportVmLogClient", f = "AuraBugReportVmLogClient.kt", l = {123}, m = "collect", v = 2)
    /* renamed from: com.facebook.aura.bugreport.AuraBugReportVmLogClient$collect$1, reason: invalid class name */
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
            return AuraBugReportVmLogClient.this.collect(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportVmLogClient$collect$2", f = "AuraBugReportVmLogClient.kt", l = {123}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.bugreport.AuraBugReportVmLogClient$collect$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super AuraVmLogOutcome>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $submissionId;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, AbstractC3358CGz abstractC3358CGz, String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$userSession = abstractC3358CGz;
            this.$submissionId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$context, this.$userSession, this.$submissionId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws IOException {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraBugReportVmLogClient auraBugReportVmLogClient = AuraBugReportVmLogClient.INSTANCE;
                Context context = this.$context;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                String str = this.$submissionId;
                this.label = 1;
                obj = auraBugReportVmLogClient.createAndDownload(context, abstractC3358CGz, str, this);
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

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super AuraVmLogOutcome> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportVmLogClient", f = "AuraBugReportVmLogClient.kt", l = {327, 173}, m = "createAndDownload", v = 2)
    /* renamed from: com.facebook.aura.bugreport.AuraBugReportVmLogClient$createAndDownload$1, reason: invalid class name and case insensitive filesystem */
    public final class C110121 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C110121(HtJ<? super C110121> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraBugReportVmLogClient.this.createAndDownload(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportVmLogClient", f = "AuraBugReportVmLogClient.kt", l = {194}, m = HatchDataExportLoggingKt.PHASE_DOWNLOAD, v = 2)
    /* renamed from: com.facebook.aura.bugreport.AuraBugReportVmLogClient$download$1, reason: invalid class name and case insensitive filesystem */
    public final class C110131 extends HzP {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C110131(HtJ<? super C110131> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraBugReportVmLogClient.this.download(null, null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.bugreport.AuraVmLogOutcome outcomeFor(int r5, java.lang.String r6) {
        /*
            r4 = this;
            r3 = 0
            if (r6 == 0) goto L7
            java.lang.String r3 = X.C60Q.A0g(r6)
        L7:
            r0 = 400(0x190, float:5.6E-43)
            r2 = 0
            if (r5 != r0) goto L1f
            r0 = 48
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L7b
            java.lang.String r0 = "VM log request parameters were rejected"
        L1a:
            com.facebook.aura.bugreport.AuraVmLogOutcome$Unavailable r0 = r4.failed(r0, r2)
            return r0
        L1f:
            r0 = 401(0x191, float:5.62E-43)
            if (r5 != r0) goto L26
            java.lang.String r0 = "VM log request was unauthorized"
            goto L1a
        L26:
            r0 = 404(0x194, float:5.66E-43)
            if (r5 != r0) goto L32
            java.lang.String r1 = "VM log artifact is no longer available"
        L2c:
            r0 = 1
            com.facebook.aura.bugreport.AuraVmLogOutcome$Unavailable r0 = r4.failed(r1, r0)
            return r0
        L32:
            r0 = 409(0x199, float:5.73E-43)
            if (r5 != r0) goto L46
            java.lang.String r0 = "vm_log_retention_unavailable"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L6b
            java.lang.String r0 = "VM log retention is unavailable"
            com.facebook.aura.bugreport.AuraVmLogOutcome$Unavailable r0 = r4.unavailable(r0)
            return r0
        L46:
            r0 = 416(0x1a0, float:5.83E-43)
            if (r5 != r0) goto L4d
            java.lang.String r0 = "VM log download returned an unexpected range"
            goto L1a
        L4d:
            r0 = 500(0x1f4, float:7.0E-43)
            if (r5 != r0) goto L54
            java.lang.String r1 = "VM log materialization failed"
            goto L2c
        L54:
            r0 = 503(0x1f7, float:7.05E-43)
            if (r5 != r0) goto L5b
            java.lang.String r1 = "VM log snapshot is unavailable"
            goto L2c
        L5b:
            r0 = 507(0x1fb, float:7.1E-43)
            if (r5 != r0) goto L66
            java.lang.String r0 = "VM has no space to materialize logs"
            com.facebook.aura.bugreport.AuraVmLogOutcome$Unavailable r0 = r4.unavailable(r0)
            return r0
        L66:
            if (r5 >= 0) goto L7b
            java.lang.String r1 = "VM log request failed before a response arrived"
            goto L2c
        L6b:
            java.lang.String r0 = "vm_log_no_data"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L7b
            java.lang.String r0 = "no retained VM logs are available"
            com.facebook.aura.bugreport.AuraVmLogOutcome$Unavailable r0 = r4.notReady(r0)
            return r0
        L7b:
            if (r3 != 0) goto L7f
            java.lang.String r3 = ""
        L7f:
            java.lang.String r1 = "VM log request returned HTTP "
            java.lang.String r0 = " "
            java.lang.String r0 = X.FGI.A0W(r1, r0, r3, r5)
            com.facebook.aura.bugreport.AuraVmLogOutcome$Unavailable r0 = r4.failed(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bugreport.AuraBugReportVmLogClient.outcomeFor(int, java.lang.String):com.facebook.aura.bugreport.AuraVmLogOutcome");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createAndDownload(android.content.Context r35, X.AbstractC3358CGz r36, java.lang.String r37, X.HtJ<? super com.facebook.aura.bugreport.AuraVmLogOutcome> r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bugreport.AuraBugReportVmLogClient.createAndDownload(android.content.Context, X.CGz, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0164  */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.HtJ] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object download(android.content.Context r20, X.AbstractC3358CGz r21, java.lang.String r22, com.facebook.aura.bugreport.VmLogDescriptorJson r23, X.HtJ<? super com.facebook.aura.bugreport.AuraVmLogOutcome> r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bugreport.AuraBugReportVmLogClient.download(android.content.Context, X.CGz, java.lang.String, com.facebook.aura.bugreport.VmLogDescriptorJson, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ AuraVmLogOutcome.Unavailable failed$default(AuraBugReportVmLogClient auraBugReportVmLogClient, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return auraBugReportVmLogClient.failed(str, z);
    }

    private final boolean isWithinLogRoute(String str) {
        String str2 = route;
        if ((!C7384Etj.areEqual(str, str2) && !AnonymousClass005.A1a(str, FGI.A0M(str2, CustomConnectorRegisterRepositoryKt.ROOT_PATH))) || C7BY.A0k(str, '?') || C7BY.A0k(str, '#')) {
            return false;
        }
        List listA0h = C7BY.A0h(str, new char[1], '/');
        if (!(listA0h instanceof Collection) || !listA0h.isEmpty()) {
            Iterator it = listA0h.iterator();
            while (it.hasNext()) {
                if ("..".equals(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(android.content.Context r8, X.AbstractC3358CGz r9, java.lang.String r10, X.HtJ<? super com.facebook.aura.bugreport.AuraVmLogOutcome> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.facebook.aura.bugreport.AuraBugReportVmLogClient.AnonymousClass1
            if (r0 == 0) goto L1f
            r6 = r11
            com.facebook.aura.bugreport.AuraBugReportVmLogClient$collect$1 r6 = (com.facebook.aura.bugreport.AuraBugReportVmLogClient.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L2a
            if (r0 != r4) goto L25
            goto L55
        L1f:
            com.facebook.aura.bugreport.AuraBugReportVmLogClient$collect$1 r6 = new com.facebook.aura.bugreport.AuraBugReportVmLogClient$collect$1
            r6.<init>(r11)
            goto L12
        L25:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2a:
            X.Hwg.A00(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = com.facebook.aura.bugreport.AuraBugReportVmLogClient.collecting
            boolean r0 = r0.compareAndSet(r3, r4)
            r2 = 0
            if (r0 != 0) goto L3d
            java.lang.String r0 = "collection already in progress"
            com.facebook.aura.bugreport.AuraVmLogOutcome$Unavailable r0 = r7.failed(r0, r4)
            return r0
        L3d:
            X.78T r1 = X.AnonymousClass001.A0y()     // Catch: java.lang.Throwable -> L60
            com.facebook.aura.bugreport.AuraBugReportVmLogClient$collect$2 r0 = new com.facebook.aura.bugreport.AuraBugReportVmLogClient$collect$2     // Catch: java.lang.Throwable -> L60
            r0.<init>(r8, r9, r10, r2)     // Catch: java.lang.Throwable -> L60
            r6.L$0 = r2     // Catch: java.lang.Throwable -> L60
            r6.L$1 = r2     // Catch: java.lang.Throwable -> L60
            r6.L$2 = r2     // Catch: java.lang.Throwable -> L60
            r6.label = r4     // Catch: java.lang.Throwable -> L60
            java.lang.Object r1 = X.GAo.A00(r6, r1, r0)     // Catch: java.lang.Throwable -> L60
            if (r1 != r5) goto L58
            return r5
        L55:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L60
        L58:
            com.facebook.aura.bugreport.AuraVmLogOutcome r1 = (com.facebook.aura.bugreport.AuraVmLogOutcome) r1     // Catch: java.lang.Throwable -> L60
            java.util.concurrent.atomic.AtomicBoolean r0 = com.facebook.aura.bugreport.AuraBugReportVmLogClient.collecting
            r0.set(r3)
            return r1
        L60:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r0 = com.facebook.aura.bugreport.AuraBugReportVmLogClient.collecting
            r0.set(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bugreport.AuraBugReportVmLogClient.collect(android.content.Context, X.CGz, java.lang.String, X.HtJ):java.lang.Object");
    }

    private final AuraVmLogOutcome.Unavailable failed(String str, boolean z) {
        return new AuraVmLogOutcome.Unavailable(R.string._name_removed__res_0x7f1201f6, z, str);
    }

    private final AuraVmLogOutcome.Unavailable notReady(String str) {
        return new AuraVmLogOutcome.Unavailable(R.string._name_removed__res_0x7f1201f8, true, str);
    }

    private final AuraVmLogOutcome.Unavailable unavailable(String str) {
        return new AuraVmLogOutcome.Unavailable(R.string._name_removed__res_0x7f1201fe, false, str);
    }
}
