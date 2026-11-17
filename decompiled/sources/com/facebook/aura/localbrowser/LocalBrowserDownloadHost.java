package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C06H;
import X.C3UX;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.HzS;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.localbrowser.LocalBrowserTransferFiles;
import com.facebook.aura.localbrowser.core.BrowserEngineBudget;
import com.hatch.browser.core.BrowserHostDownloads;
import com.hatch.browser.core.NativeDownloadPublishResult;
import com.hatch.browser.protocol.DownloadPublishOutcome;
import com.hatch.browser.protocol.Failure;
import com.hatch.browser.protocol.FailureCode;
import com.hatch.browser.protocol.FailureDetail;
import com.hatch.browser.protocol.NativeDownloadPublishRequest;
import java.io.File;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class LocalBrowserDownloadHost implements BrowserHostDownloads {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final int MAX_BYTES = 67108864;
    public final String gatewayUrl;
    public final LocalBrowserTransferFiles temporaryFiles;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserDownloadHost", f = "LocalBrowserDownloadHost.kt", l = {40, 50}, m = "publish", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserDownloadHost$publish$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserDownloadHost.this.publish(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserDownloadHost$publish$2", f = "LocalBrowserDownloadHost.kt", l = {69}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserDownloadHost$publish$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super NativeDownloadPublishResult>, Object> {
        public final /* synthetic */ BrowserEngineBudget $budget;
        public final /* synthetic */ byte[] $bytes;
        public final /* synthetic */ NativeDownloadPublishRequest $request;
        public final /* synthetic */ String $sha256;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NativeDownloadPublishRequest nativeDownloadPublishRequest, String str, BrowserEngineBudget browserEngineBudget, byte[] bArr, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$request = nativeDownloadPublishRequest;
            this.$sha256 = str;
            this.$budget = browserEngineBudget;
            this.$bytes = bArr;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserDownloadHost.this.new AnonymousClass2(this.$request, this.$sha256, this.$budget, this.$bytes, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.AutoCloseable] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Exception {
            LocalBrowserTransferFiles.Lease lease;
            FailureDetail failureDetail;
            DownloadPublishOutcome notStarted;
            Object objUploadFileWithoutOverwrite = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(objUploadFileWithoutOverwrite);
                    LocalBrowserTransferFiles.Lease leaseCreate = LocalBrowserDownloadHost.this.temporaryFiles.create();
                    NativeDownloadPublishRequest nativeDownloadPublishRequest = this.$request;
                    LocalBrowserDownloadHost localBrowserDownloadHost = LocalBrowserDownloadHost.this;
                    BrowserEngineBudget browserEngineBudget = this.$budget;
                    byte[] bArr = this.$bytes;
                    int i2 = 0;
                    OutputStream outputStreamNewOutputStream = Files.newOutputStream(leaseCreate.file.toPath(), StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
                    while (true) {
                        try {
                            int length = bArr.length;
                            if (i2 >= length) {
                                break;
                            }
                            HzS.A05(getContext());
                            leaseCreate.checkLive();
                            int iMin = Math.min(8192, length - i2);
                            outputStreamNewOutputStream.write(bArr, i2, iMin);
                            i2 += iMin;
                        } finally {
                        }
                    }
                    if (outputStreamNewOutputStream != null) {
                        outputStreamNewOutputStream.close();
                    }
                    leaseCreate.checkLive();
                    HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                    String str = nativeDownloadPublishRequest.destination;
                    File file = leaseCreate.file;
                    AbstractC3358CGz abstractC3358CGz = localBrowserDownloadHost.userSession;
                    String str2 = localBrowserDownloadHost.gatewayUrl;
                    long remainingMs = browserEngineBudget.getRemainingMs();
                    this.L$0 = leaseCreate;
                    this.L$1 = null;
                    this.label = 1;
                    objUploadFileWithoutOverwrite = hatchFileOperations.uploadFileWithoutOverwrite(str, file, abstractC3358CGz, str2, remainingMs, this);
                    lease = leaseCreate;
                    if (objUploadFileWithoutOverwrite == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    ?? r2 = (AutoCloseable) this.L$0;
                    Hwg.A00(objUploadFileWithoutOverwrite);
                    lease = r2;
                }
                HatchFileOperations.ExclusiveWriteResult exclusiveWriteResult = (HatchFileOperations.ExclusiveWriteResult) objUploadFileWithoutOverwrite;
                if (lease != null) {
                    lease.close();
                }
                if (exclusiveWriteResult instanceof HatchFileOperations.ExclusiveWriteResult.Written) {
                    long j = ((HatchFileOperations.ExclusiveWriteResult.Written) exclusiveWriteResult).bytesWritten;
                    long j2 = this.$request.bytes;
                    if (j == j2) {
                        notStarted = new DownloadPublishOutcome.Published(j2, this.$sha256);
                    } else {
                        failureDetail = FailureDetail.PublishMismatch.INSTANCE;
                        notStarted = new DownloadPublishOutcome.Unknown(new Failure(FailureCode.UNAVAILABLE, failureDetail));
                    }
                } else if (C7384Etj.areEqual(exclusiveWriteResult, HatchFileOperations.ExclusiveWriteResult.NotStarted.INSTANCE)) {
                    notStarted = new DownloadPublishOutcome.NotStarted(new Failure(FailureCode.UNAVAILABLE, FailureDetail.NativeRefusal.INSTANCE));
                } else {
                    if (!C7384Etj.areEqual(exclusiveWriteResult, HatchFileOperations.ExclusiveWriteResult.Unknown.INSTANCE)) {
                        throw C3cG.A0q();
                    }
                    failureDetail = FailureDetail.NativeRefusal.INSTANCE;
                    notStarted = new DownloadPublishOutcome.Unknown(new Failure(FailureCode.UNAVAILABLE, failureDetail));
                }
                return new NativeDownloadPublishResult(notStarted);
            } finally {
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super NativeDownloadPublishResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public LocalBrowserDownloadHost(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.gatewayUrl = C60P.A1K(abstractC3358CGz);
        this.temporaryFiles = LocalBrowserTransferFiles.Companion.getInstance(abstractC3358CGz);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // com.hatch.browser.core.BrowserHostDownloads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object publish(com.hatch.browser.protocol.NativeDownloadPublishRequest r12, byte[] r13, X.HtJ<? super com.hatch.browser.core.NativeDownloadPublishResult> r14) {
        /*
            r11 = this;
            r3 = r14
            r10 = r12
            boolean r0 = r14 instanceof com.facebook.aura.localbrowser.LocalBrowserDownloadHost.AnonymousClass1
            r9 = r11
            if (r0 == 0) goto L27
            r6 = r3
            com.facebook.aura.localbrowser.LocalBrowserDownloadHost$publish$1 r6 = (com.facebook.aura.localbrowser.LocalBrowserDownloadHost.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r6.label = r2
        L15:
            java.lang.Object r11 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 2
            r7 = 1
            if (r0 == 0) goto L32
            if (r0 == r7) goto L64
            if (r0 != r4) goto L2d
            X.Hwg.A00(r11)
            return r11
        L27:
            com.facebook.aura.localbrowser.LocalBrowserDownloadHost$publish$1 r6 = new com.facebook.aura.localbrowser.LocalBrowserDownloadHost$publish$1
            r6.<init>(r14)
            goto L15
        L2d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L32:
            X.Hwg.A00(r11)
            com.facebook.aura.localbrowser.core.BrowserEngineBudget$Companion r1 = com.facebook.aura.localbrowser.core.BrowserEngineBudget.Companion
            com.hatch.browser.protocol.Budget r0 = r12.budget
            com.facebook.aura.localbrowser.core.BrowserEngineBudget r12 = r1.capture(r0)
            int r1 = r13.length
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            if (r1 > r0) goto L98
            long r2 = (long) r1
            long r0 = r10.bytes
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L98
            com.facebook.aura.executors.AuraDispatchers r0 = com.facebook.aura.executors.AuraDispatchers.INSTANCE
            X.78T r2 = r0.m764default()
            r1 = 0
            com.facebook.aura.localbrowser.LocalBrowserDownloadHost$publish$sha256$1 r0 = new com.facebook.aura.localbrowser.LocalBrowserDownloadHost$publish$sha256$1
            r0.<init>(r13, r1)
            r6.L$0 = r10
            r6.L$1 = r13
            r6.L$2 = r12
            r6.label = r7
            java.lang.Object r11 = X.GAo.A00(r6, r2, r0)
            if (r11 != r5) goto L73
            return r5
        L64:
            java.lang.Object r12 = r6.L$2
            com.facebook.aura.localbrowser.core.BrowserEngineBudget r12 = (com.facebook.aura.localbrowser.core.BrowserEngineBudget) r12
            java.lang.Object r13 = r6.L$1
            byte[] r13 = (byte[]) r13
            java.lang.Object r10 = r6.L$0
            com.hatch.browser.protocol.NativeDownloadPublishRequest r10 = (com.hatch.browser.protocol.NativeDownloadPublishRequest) r10
            X.Hwg.A00(r11)
        L73:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r0 = r10.sha256
            boolean r0 = X.C7384Etj.areEqual(r11, r0)
            if (r0 == 0) goto L98
            X.78T r0 = X.AnonymousClass001.A0y()
            r14 = 0
            com.facebook.aura.localbrowser.LocalBrowserDownloadHost$publish$2 r8 = new com.facebook.aura.localbrowser.LocalBrowserDownloadHost$publish$2
            r8.<init>(r10, r11, r12, r13, r14)
            r6.L$0 = r14
            r6.L$1 = r14
            r6.L$2 = r14
            r6.L$3 = r14
            r6.label = r4
            java.lang.Object r0 = X.GAo.A00(r6, r0, r8)
            if (r0 != r5) goto Lab
            return r5
        L98:
            com.hatch.browser.protocol.FailureDetail$PublishMismatch r2 = com.hatch.browser.protocol.FailureDetail.PublishMismatch.INSTANCE
            com.hatch.browser.protocol.FailureCode r1 = com.hatch.browser.protocol.FailureCode.UNAVAILABLE
            com.hatch.browser.protocol.Failure r0 = new com.hatch.browser.protocol.Failure
            r0.<init>(r1, r2)
            com.hatch.browser.protocol.DownloadPublishOutcome$NotStarted r1 = new com.hatch.browser.protocol.DownloadPublishOutcome$NotStarted
            r1.<init>(r0)
            com.hatch.browser.core.NativeDownloadPublishResult r0 = new com.hatch.browser.core.NativeDownloadPublishResult
            r0.<init>(r1)
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserDownloadHost.publish(com.hatch.browser.protocol.NativeDownloadPublishRequest, byte[], X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ Failure access$failure(LocalBrowserDownloadHost localBrowserDownloadHost, FailureDetail failureDetail) {
        return new Failure(FailureCode.UNAVAILABLE, failureDetail);
    }

    private final Failure failure(FailureDetail failureDetail) {
        return new Failure(FailureCode.UNAVAILABLE, failureDetail);
    }
}
