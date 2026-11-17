package com.facebook.aura.bugreport;

import X.ADq;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.C0881AGi;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C78T;
import X.CFK;
import X.Ey9;
import X.F0H;
import X.G0U;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.HzP;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.bugreport.AuraBugReportCollector;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.devices.intf.DeviceBugReportRequest;
import com.facebook.aura.gateway.store.HatchVmConfidentiality;
import com.facebook.aura.network.AuraUserAgent;
import com.facebook.aura.network.transport.HatchMultipartPart;
import com.facebook.aura.partners.voice.intf.VoiceBugReportInfo;
import com.facebook.aura.partners.voice.intf.VoiceBugReportRepository;
import com.facebook.aura.settings.MC;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AuraBugReportSender {
    public static final int $stable = 0;
    public static final String ATTACHMENT_FILE_PREFIX = "aura_attachment_";
    public static final int ATTACHMENT_UPLOAD_MAX_ATTEMPTS = 3;
    public static final long ATTACHMENT_UPLOAD_RETRY_BACKOFF_MS = 500;
    public static final String DEFAULT_IMAGE_EXTENSION = ".jpg";
    public static final String DEFAULT_VIDEO_EXTENSION = ".mp4";
    public static final String PRODUCT = "Hatch Android";
    public static final String SOURCE = "aura_app";
    public static final String TAG = "AuraBugReportSender";
    public static final AuraBugReportSender INSTANCE = new AuraBugReportSender();
    public static final ADq HTTP_CLIENT_ERROR_RANGE = new ADq(400, MC.c50_accounts_center_settings.__CONFIG__);
    public static final C3UX scope = C78T.A00();
    public static final AtomicInteger fileCounter = new AtomicInteger(0);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SubmissionResult {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ SubmissionResult[] $VALUES;
        public static final SubmissionResult FAILED;
        public static final SubmissionResult PARTIAL;
        public static final SubmissionResult SENT;

        static {
            SubmissionResult submissionResult = new SubmissionResult(HatchPersistedMessageJson.SEND_STATUS_SENT, 0);
            SENT = submissionResult;
            SubmissionResult submissionResult2 = new SubmissionResult("PARTIAL", 1);
            PARTIAL = submissionResult2;
            SubmissionResult submissionResult3 = new SubmissionResult(CvmMigrationStatusJson.STAGE_FAILED, 2);
            FAILED = submissionResult3;
            SubmissionResult[] submissionResultArr = {submissionResult, submissionResult2, submissionResult3};
            $VALUES = submissionResultArr;
            $ENTRIES = C3cG.A0w(submissionResultArr);
        }

        public static Ey9<SubmissionResult> getEntries() {
            return $ENTRIES;
        }

        public static SubmissionResult valueOf(String str) {
            return (SubmissionResult) Enum.valueOf(SubmissionResult.class, str);
        }

        public static SubmissionResult[] values() {
            return (SubmissionResult[]) $VALUES.clone();
        }

        public SubmissionResult(String str, int i) {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportSender", f = "AuraBugReportSender.kt", l = {HatchWidgetWebViewKt.HTTP_NO_CONTENT}, m = "getSelectedModelName", v = 2)
    /* renamed from: com.facebook.aura.bugreport.AuraBugReportSender$getSelectedModelName$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraBugReportSender.this.getSelectedModelName(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportSender$send$4", f = "AuraBugReportSender.kt", l = {SelfieSnapshotKt.SELFIE_JPEG_QUALITY, 98, 110}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.bugreport.AuraBugReportSender$send$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $agentFeedbackId;
        public final /* synthetic */ boolean $agentInitiated;
        public final /* synthetic */ String $appVersion;
        public final /* synthetic */ List<Uri> $attachmentUris;
        public final /* synthetic */ String $categoryId;
        public final /* synthetic */ String $categoryTitle;
        public final /* synthetic */ List<AuraBugReportCollector.CollectedItem> $collectedItems;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $description;
        public final /* synthetic */ List<DeviceBugReportRequest> $deviceBugReports;
        public final /* synthetic */ String $endpoint;
        public final /* synthetic */ boolean $includeHomeLinkDiagnostics;
        public final /* synthetic */ boolean $includeSessionContext;
        public final /* synthetic */ Function0<Boolean> $mayUpload;
        public final /* synthetic */ G0U<String, Unit> $onBugCreated;
        public final /* synthetic */ G0V<SubmissionResult, String, Unit> $onComplete;
        public final /* synthetic */ List<HoC> $pendingFileOperations;
        public final /* synthetic */ String $submissionId;
        public final /* synthetic */ boolean $treatPayloadAsConfidential;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public boolean Z$0;
        public int label;

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass4(this.$submissionId, this.$context, this.$attachmentUris, this.$userSession, this.$description, this.$endpoint, this.$appVersion, this.$categoryId, this.$categoryTitle, this.$deviceBugReports, this.$treatPayloadAsConfidential, this.$includeSessionContext, this.$agentInitiated, this.$agentFeedbackId, this.$mayUpload, this.$onBugCreated, this.$pendingFileOperations, this.$onComplete, this.$collectedItems, this.$includeHomeLinkDiagnostics, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00d2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00da A[Catch: Exception -> 0x0162, CancellationException -> 0x016b, all -> 0x01a4, TryCatch #1 {CancellationException -> 0x016b, blocks: (B:34:0x0154, B:35:0x0157, B:27:0x00d3, B:28:0x00d6, B:30:0x00da, B:31:0x00ee, B:19:0x00ab, B:20:0x00ae, B:21:0x00b0, B:24:0x00b7, B:13:0x0061, B:15:0x007f), top: B:46:0x0013, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0153 A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r37) {
            /*
                Method dump skipped, instructions count: 444
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bugreport.AuraBugReportSender.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass4) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(String str, Context context, List<? extends Uri> list, AbstractC3358CGz abstractC3358CGz, String str2, String str3, String str4, String str5, String str6, List<? extends DeviceBugReportRequest> list2, boolean z, boolean z2, boolean z3, String str7, Function0<Boolean> function0, G0U<? super String, Unit> g0u, List<? extends HoC> list3, G0V<? super SubmissionResult, ? super String, Unit> g0v, List<AuraBugReportCollector.CollectedItem> list4, boolean z4, HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
            this.$submissionId = str;
            this.$context = context;
            this.$attachmentUris = list;
            this.$userSession = abstractC3358CGz;
            this.$description = str2;
            this.$endpoint = str3;
            this.$appVersion = str4;
            this.$categoryId = str5;
            this.$categoryTitle = str6;
            this.$deviceBugReports = list2;
            this.$treatPayloadAsConfidential = z;
            this.$includeSessionContext = z2;
            this.$agentInitiated = z3;
            this.$agentFeedbackId = str7;
            this.$mayUpload = function0;
            this.$onBugCreated = g0u;
            this.$pendingFileOperations = list3;
            this.$onComplete = g0v;
            this.$collectedItems = list4;
            this.$includeHomeLinkDiagnostics = z4;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportSender", f = "AuraBugReportSender.kt", l = {260, 348, 379, 394}, m = "sendInternal", v = 2)
    /* renamed from: com.facebook.aura.bugreport.AuraBugReportSender$sendInternal$1, reason: invalid class name and case insensitive filesystem */
    public final class C110101 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$15;
        public Object L$16;
        public Object L$17;
        public Object L$18;
        public Object L$19;
        public Object L$2;
        public Object L$20;
        public Object L$21;
        public Object L$22;
        public Object L$23;
        public Object L$24;
        public Object L$25;
        public Object L$26;
        public Object L$27;
        public Object L$28;
        public Object L$29;
        public Object L$3;
        public Object L$30;
        public Object L$31;
        public Object L$32;
        public Object L$33;
        public Object L$34;
        public Object L$35;
        public Object L$36;
        public Object L$37;
        public Object L$38;
        public Object L$39;
        public Object L$4;
        public Object L$40;
        public Object L$41;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public boolean Z$1;
        public boolean Z$2;
        public int label;
        public /* synthetic */ Object result;

        public C110101(HtJ<? super C110101> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraBugReportSender.this.sendInternal(null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportSender", f = "AuraBugReportSender.kt", l = {439, 491}, m = "uploadStefiAttachment", v = 2)
    /* renamed from: com.facebook.aura.bugreport.AuraBugReportSender$uploadStefiAttachment$1, reason: invalid class name and case insensitive filesystem */
    public final class C110111 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C110111(HtJ<? super C110111> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraBugReportSender.this.uploadStefiAttachment(null, null, false, null, this);
        }
    }

    public final HoC send(AbstractC3358CGz abstractC3358CGz, Context context, String str, String str2, List<? extends Uri> list, String str3, boolean z, List<AuraBugReportCollector.CollectedItem> list2, String str4, String str5, List<? extends DeviceBugReportRequest> list3, boolean z2, List<? extends HoC> list4, boolean z3, boolean z4, String str6, Function0<Boolean> function0, G0U<? super String, Unit> g0u, G0V<? super SubmissionResult, ? super String, Unit> g0v) {
        AnonymousClass005.A11(context, str, str2, 1);
        C7384Etj.A0Y(list, 4);
        C7384Etj.A0Y(list3, 10);
        C7384Etj.A0Y(list4, 12);
        C3cI.A1I(function0, 16, g0u);
        C7384Etj.A0Y(g0v, 18);
        String appVersion$fbandroid_express_aura_java_com_facebook_aura_bugreport_bugreport = AuraBugReportCollector.INSTANCE.getAppVersion$fbandroid_express_aura_java_com_facebook_aura_bugreport_bugreport(context);
        return AnonymousClass001.A11(new AnonymousClass4(str, context, list, abstractC3358CGz, str2, str3, appVersion$fbandroid_express_aura_java_com_facebook_aura_bugreport_bugreport, str4, str5, list3, z, z3, z4, str6, function0, g0u, list4, g0v, list2, z2, null), scope);
    }

    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchVmConfidentiality.values().length];
            try {
                AnonymousClass002.A13(HatchVmConfidentiality.CONFIDENTIAL, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchVmConfidentiality.STANDARD, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchVmConfidentiality.UNKNOWN, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportSender$send$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C110091 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final C110091 INSTANCE = new C110091();

        public C110091() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return AnonymousClass001.A0i();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return AnonymousClass001.A0i();
        }
    }

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportSender$send$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<SubmissionResult, String, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(SubmissionResult submissionResult, String str) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SubmissionResult submissionResult, String str) {
        }
    }

    private final File copyUriToFile(Context context, String str, Uri uri) throws IOException {
        if ("file".equals(uri.getScheme())) {
            String path = uri.getPath();
            if (path != null) {
                File file = new File(path);
                if (file.exists()) {
                    return file;
                }
            }
        } else {
            try {
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                if (inputStreamOpenInputStream != null) {
                    try {
                        String type = context.getContentResolver().getType(uri);
                        String str2 = (type == null || !type.startsWith("video/")) ? DEFAULT_IMAGE_EXTENSION : DEFAULT_VIDEO_EXTENSION;
                        File fileEnsureAttachmentsDir$fbandroid_express_aura_java_com_facebook_aura_bugreport_bugreport = AuraBugReportCollector.INSTANCE.ensureAttachmentsDir$fbandroid_express_aura_java_com_facebook_aura_bugreport_bugreport(context, str);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        int andIncrement = fileCounter.getAndIncrement();
                        StringBuilder sbA0z = C60O.A0z(ATTACHMENT_FILE_PREFIX, jCurrentTimeMillis);
                        sbA0z.append("_");
                        sbA0z.append(andIncrement);
                        File fileA0O = C3cG.A0O(fileEnsureAttachmentsDir$fbandroid_express_aura_java_com_facebook_aura_bugreport_bugreport, AnonymousClass001.A0v(str2, sbA0z));
                        FileOutputStream fileOutputStream = new FileOutputStream(fileA0O);
                        try {
                            F0H.A00(inputStreamOpenInputStream, fileOutputStream);
                            fileOutputStream.close();
                            inputStreamOpenInputStream.close();
                            return fileA0O;
                        } finally {
                        }
                    } finally {
                    }
                }
            } catch (Exception e) {
                CFK.A08("AuraBugReportSender", AnonymousClass007.A0a("Error copying URI content to file: ", uri), e);
                return null;
            }
        }
        return null;
    }

    private final VoiceBugReportInfo freshVoiceCallInfo(AbstractC3358CGz abstractC3358CGz) {
        VoiceBugReportInfo voiceBugReportInfoFreshLatestCallInfo = VoiceBugReportRepository.Companion.getInstance(abstractC3358CGz).freshLatestCallInfo(System.currentTimeMillis());
        if (voiceBugReportInfoFreshLatestCallInfo == null || voiceBugReportInfoFreshLatestCallInfo.sharedCallId == null) {
            return null;
        }
        return voiceBugReportInfoFreshLatestCallInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getSelectedModelName(X.AbstractC3358CGz r8, X.HtJ<? super java.lang.String> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.bugreport.AuraBugReportSender.AnonymousClass1
            if (r0 == 0) goto L20
            r6 = r9
            com.facebook.aura.bugreport.AuraBugReportSender$getSelectedModelName$1 r6 = (com.facebook.aura.bugreport.AuraBugReportSender.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r0 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r2 = r6.label
            java.lang.String r4 = "AuraBugReportSender"
            r1 = 1
            if (r2 == 0) goto L2b
            if (r2 != r1) goto L26
            goto L44
        L20:
            com.facebook.aura.bugreport.AuraBugReportSender$getSelectedModelName$1 r6 = new com.facebook.aura.bugreport.AuraBugReportSender$getSelectedModelName$1
            r6.<init>(r9)
            goto L12
        L26:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2b:
            X.Hwg.A00(r0)
            com.facebook.aura.gateway.HatchGatewayConnection r3 = X.C60O.A05(r8)     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> L55
            com.facebook.aura.network.api.RpcMethod$ModelGet r2 = com.facebook.aura.network.api.RpcMethod.ModelGet.INSTANCE     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> L55
            r0 = 0
            r6.L$0 = r0     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> L55
            r6.L$1 = r0     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> L55
            r6.label = r1     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> L55
            r0 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r0 = r3.sendRequestAndWait(r2, r0, r6)     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> L55
            if (r0 != r5) goto L47
            return r5
        L44:
            X.Hwg.A00(r0)     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> L55
        L47:
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> L55
            java.lang.String r5 = com.facebook.aura.bugreport.AuraBugReportSenderJsonKt.parseSelectedModelName(r0)     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> L55
            return r5
        L4e:
            r1 = move-exception
            java.lang.String r0 = "Failed to fetch selected model for bug report"
            X.CFK.A0A(r4, r0, r1)
            goto L5d
        L55:
            X.C3cG.A1H(r6)
            java.lang.String r0 = "Selected model lookup cancelled for bug report"
            X.CFK.A06(r4, r0)
        L5d:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bugreport.AuraBugReportSender.getSelectedModelName(X.CGz, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:(1:90)|22|89|23|(2:25|82)|31|(1:37)(2:43|(8:45|(1:47)|48|(1:50)(1:61)|(1:60)(1:54)|(3:56|(1:58)|59)(0)|20|21)(2:62|(3:71|(1:75)|76)(7:66|(1:68)|69|70|19|20|21)))|38|(2:40|(1:42))|13|14|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        r13 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01fc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00df -> B:13:0x004c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fe -> B:13:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uploadStefiAttachment(java.lang.String r26, java.io.File r27, boolean r28, kotlin.jvm.functions.Function0<java.lang.Boolean> r29, X.HtJ<? super java.lang.Boolean> r30) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bugreport.AuraBugReportSender.uploadStefiAttachment(java.lang.String, java.io.File, boolean, kotlin.jvm.functions.Function0, X.HtJ):java.lang.Object");
    }

    private final Map<String, String> userAgentHeaders(boolean z) {
        return AuraBugReportUserAgent.INSTANCE.headers(z, AuraUserAgent.INSTANCE.getInstance());
    }

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportSender$send$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<String, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<File> convertUrisToFiles(Context context, String str, List<? extends Uri> list) {
        ArrayList arrayListA0h = C3cG.A0h();
        for (Uri uri : list) {
            try {
                File fileCopyUriToFile = copyUriToFile(context, str, uri);
                if (fileCopyUriToFile != null) {
                    arrayListA0h.add(fileCopyUriToFile);
                }
            } catch (Exception e) {
                CFK.A08("AuraBugReportSender", AnonymousClass007.A0a("Failed to convert URI to file: ", uri), e);
            }
        }
        return arrayListA0h;
    }

    private final HatchMultipartPart formField(String str, String str2) {
        return new HatchMultipartPart(str, null, "text/plain", C3cG.A1S(str2));
    }

    private final String getPrimaryChatSessionId(AbstractC3358CGz abstractC3358CGz) {
        try {
            return C60O.A05(abstractC3358CGz).protocol.primarySessionId.getValue();
        } catch (Exception e) {
            CFK.A0A("AuraBugReportSender", "Failed to read chat session ID for bug report", e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HoC send$default(AuraBugReportSender auraBugReportSender, AbstractC3358CGz abstractC3358CGz, Context context, String str, String str2, List list, String str3, boolean z, List list2, String str4, String str5, List list3, boolean z2, List list4, boolean z3, boolean z4, String str6, Function0 function0, G0U g0u, G0V g0v, int i, Object obj) {
        if ((i & 128) != 0) {
            list2 = null;
        }
        if ((i & 256) != 0) {
            str4 = null;
        }
        if ((i & 512) != 0) {
            str5 = null;
        }
        if ((i & 1024) != 0) {
            list3 = C0881AGi.A00;
        }
        boolean zA1K = C3cG.A1K(i & 2048, z2);
        if ((i & 4096) != 0) {
            list4 = C0881AGi.A00;
        }
        boolean zA1Q = C60Q.A1Q(i & 8192, z3);
        boolean zA1K2 = C3cG.A1K(i & 16384, z4);
        if ((32768 & i) != 0) {
            str6 = null;
        }
        if ((65536 & i) != 0) {
            function0 = C110091.INSTANCE;
        }
        if ((131072 & i) != 0) {
            g0u = AnonymousClass2.INSTANCE;
        }
        if ((i & 262144) != 0) {
            g0v = AnonymousClass3.INSTANCE;
        }
        return auraBugReportSender.send(abstractC3358CGz, context, str, str2, list, str3, z, list2, str4, str5, list3, zA1K, list4, zA1Q, zA1K2, str6, function0, g0u, g0v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (X.AnonymousClass001.A1X(r9) != false) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:111:0x03f7, B:117:0x0423], limit reached: 191 */
    /* JADX WARN: Path cross not found for [B:155:0x05b7, B:157:0x05c2], limit reached: 191 */
    /* JADX WARN: Path cross not found for [B:19:0x0078, B:20:0x0079], limit reached: 191 */
    /* JADX WARN: Path cross not found for [B:20:0x0079, B:19:0x0078], limit reached: 191 */
    /* JADX WARN: Path cross not found for [B:64:0x01ba, B:40:0x0174], limit reached: 191 */
    /* JADX WARN: Path cross not found for [B:66:0x01bd, B:55:0x01a7], limit reached: 191 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03e3 A[LOOP:1: B:106:0x03dd->B:108:0x03e3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c4 A[PHI: r5 r7 r8 r9
  0x01c4: PHI (r5v9 X.CGz) = (r5v7 X.CGz), (r5v10 X.CGz), (r5v10 X.CGz) binds: [B:67:0x01be, B:69:0x01c2, B:63:0x01b7] A[DONT_GENERATE, DONT_INLINE]
  0x01c4: PHI (r7v3 java.lang.String) = (r7v1 java.lang.String), (r7v4 java.lang.String), (r7v4 java.lang.String) binds: [B:67:0x01be, B:69:0x01c2, B:63:0x01b7] A[DONT_GENERATE, DONT_INLINE]
  0x01c4: PHI (r8v3 java.lang.String) = (r8v1 java.lang.String), (r8v6 java.lang.String), (r8v7 java.lang.String) binds: [B:67:0x01be, B:69:0x01c2, B:63:0x01b7] A[DONT_GENERATE, DONT_INLINE]
  0x01c4: PHI (r9v7 com.facebook.aura.gateway.store.HatchGatewayPrefsStore) = 
  (r9v3 com.facebook.aura.gateway.store.HatchGatewayPrefsStore)
  (r9v8 com.facebook.aura.gateway.store.HatchGatewayPrefsStore)
  (r9v8 com.facebook.aura.gateway.store.HatchGatewayPrefsStore)
 binds: [B:67:0x01be, B:69:0x01c2, B:63:0x01b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0320  */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r28v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r29v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:145:0x0599 -> B:148:0x059f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ea -> B:17:0x0072). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ed -> B:19:0x0078). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendInternal(android.content.Context r58, X.AbstractC3358CGz r59, java.lang.String r60, java.lang.String r61, java.util.List<? extends java.io.File> r62, java.lang.String r63, java.lang.String r64, java.lang.String r65, java.lang.String r66, java.util.List<com.facebook.aura.bugreport.AuraBugReportCollector.CollectedItem> r67, java.util.List<? extends com.facebook.aura.devices.intf.DeviceBugReportRequest> r68, boolean r69, boolean r70, boolean r71, java.lang.String r72, kotlin.jvm.functions.Function0<java.lang.Boolean> r73, X.G0U<? super java.lang.String, kotlin.Unit> r74, X.HtJ<? super X.HxE<? extends com.facebook.aura.bugreport.AuraBugReportSender.SubmissionResult, java.lang.String>> r75) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bugreport.AuraBugReportSender.sendInternal(android.content.Context, X.CGz, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, boolean, boolean, boolean, java.lang.String, kotlin.jvm.functions.Function0, X.G0U, X.HtJ):java.lang.Object");
    }
}
