package com.facebook.aura.localbrowser.core;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C3UX;
import X.C60O;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAo;
import X.GBK;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.executors.AuraDispatchers;
import com.hatch.browser.core.BrowserHostAuthority;
import com.hatch.browser.core.BrowserHostDownloads;
import com.hatch.browser.core.BrowserHostNativeControls;
import com.hatch.browser.core.BrowserHostPageClose;
import com.hatch.browser.core.BrowserHostPdf;
import com.hatch.browser.core.NativeControlDecision;
import com.hatch.browser.core.NativeDownloadPublishResult;
import com.hatch.browser.core.NativeException;
import com.hatch.browser.core.NativePageAuthorityDecision;
import com.hatch.browser.core.NativePageCloseResult;
import com.hatch.browser.core.NativePdfPrintResult;
import com.hatch.browser.protocol.Access;
import com.hatch.browser.protocol.Availability;
import com.hatch.browser.protocol.Failure;
import com.hatch.browser.protocol.FailureCode;
import com.hatch.browser.protocol.FailureDetail;
import com.hatch.browser.protocol.HostRefusal;
import com.hatch.browser.protocol.NativeControlRequest;
import com.hatch.browser.protocol.NativeDownloadPublishRequest;
import com.hatch.browser.protocol.NativePageIdentity;
import com.hatch.browser.protocol.NativePdfPrintRequest;
import com.hatch.browser.protocol.PageAuthorityClaim;
import com.hatch.browser.protocol.PageAuthorityDecision;
import com.hatch.browser.protocol.PageAuthoritySnapshot;
import com.hatch.browser.protocol.PageCloseOutcome;
import com.hatch.browser.protocol.TaskPageGroupControlState;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class BrowserEngineAuthority implements BrowserHostDownloads, BrowserHostNativeControls, BrowserHostPdf, BrowserHostAuthority, BrowserHostPageClose {
    public static final int $stable = 8;
    public final ConcurrentHashMap<NativePageIdentity, BrowserEnginePageFacts> pages = C60O.A1C();
    public final BrowserEngineFiles files = new BrowserEngineFiles(new BrowserEngineAuthority$files$1(this));

    @DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserEngineAuthority$allow$2", f = "BrowserEngineAuthority.kt", l = {96}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.core.BrowserEngineAuthority$allow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0U<HtJ<? super NativeControlDecision>, Object> {
        public final /* synthetic */ NativeControlRequest $request;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserEngineAuthority$allow$2$1", f = "BrowserEngineAuthority.kt", l = {99}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.localbrowser.core.BrowserEngineAuthority$allow$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super NativeControlDecision>, Object> {
            public final /* synthetic */ NativeControlRequest $request;
            public Object L$0;
            public int label;
            public final /* synthetic */ BrowserEngineAuthority this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BrowserEngineAuthority browserEngineAuthority, NativeControlRequest nativeControlRequest, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.this$0 = browserEngineAuthority;
                this.$request = nativeControlRequest;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, this.$request, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) throws NativeException.Unsupported {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    BrowserHostNativeControls browserHostNativeControls = this.this$0.requirePage(this.$request.claim).nativeControls;
                    if (browserHostNativeControls == null) {
                        throw new NativeException.Unsupported();
                    }
                    NativeControlRequest nativeControlRequest = this.$request;
                    this.L$0 = null;
                    this.label = 1;
                    obj = browserHostNativeControls.allow(nativeControlRequest, this);
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
            public final Object invoke(C3UX c3ux, HtJ<? super NativeControlDecision> htJ) {
                return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NativeControlRequest nativeControlRequest, HtJ<? super AnonymousClass2> htJ) {
            super(1, htJ);
            this.$request = nativeControlRequest;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return BrowserEngineAuthority.this.new AnonymousClass2(this.$request, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                GBK gbk = AuraDispatchers.mainImmediate;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(BrowserEngineAuthority.this, this.$request, null);
                this.label = 1;
                obj = GAo.A00(this, gbk, anonymousClass1);
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

        @Override // X.G0U
        public final Object invoke(HtJ<? super NativeControlDecision> htJ) {
            return ((AnonymousClass2) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserEngineAuthority", f = "BrowserEngineAuthority.kt", l = {74}, m = "closePage", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.core.BrowserEngineAuthority$closePage$1, reason: invalid class name */
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
            return BrowserEngineAuthority.this.closePage(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserEngineAuthority$print$2", f = "BrowserEngineAuthority.kt", l = {106}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.core.BrowserEngineAuthority$print$2, reason: invalid class name and case insensitive filesystem */
    public final class C124972 extends AbstractC07127nr implements G0U<HtJ<? super NativePdfPrintResult>, Object> {
        public final /* synthetic */ NativePdfPrintRequest $request;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124972(NativePdfPrintRequest nativePdfPrintRequest, HtJ<? super C124972> htJ) {
            super(1, htJ);
            this.$request = nativePdfPrintRequest;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return BrowserEngineAuthority.this.new C124972(this.$request, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws NativeException.Unsupported {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BrowserHostPdf browserHostPdf = BrowserEngineAuthority.this.requirePage(this.$request.claim).pdf;
                if (browserHostPdf == null) {
                    throw new NativeException.Unsupported();
                }
                NativePdfPrintRequest nativePdfPrintRequest = this.$request;
                this.L$0 = null;
                this.label = 1;
                obj = browserHostPdf.print(nativePdfPrintRequest, this);
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

        @Override // X.G0U
        public final Object invoke(HtJ<? super NativePdfPrintResult> htJ) {
            return ((C124972) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserEngineAuthority$publish$2", f = "BrowserEngineAuthority.kt", l = {115}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.core.BrowserEngineAuthority$publish$2, reason: invalid class name and case insensitive filesystem */
    public final class C124982 extends AbstractC07127nr implements G0U<HtJ<? super NativeDownloadPublishResult>, Object> {
        public final /* synthetic */ byte[] $bytes;
        public final /* synthetic */ NativeDownloadPublishRequest $request;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124982(NativeDownloadPublishRequest nativeDownloadPublishRequest, byte[] bArr, HtJ<? super C124982> htJ) {
            super(1, htJ);
            this.$request = nativeDownloadPublishRequest;
            this.$bytes = bArr;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return BrowserEngineAuthority.this.new C124982(this.$request, this.$bytes, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws NativeException.Unsupported {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BrowserHostDownloads browserHostDownloads = BrowserEngineAuthority.this.requirePage(this.$request.claim).downloads;
                if (browserHostDownloads == null) {
                    throw new NativeException.Unsupported();
                }
                NativeDownloadPublishRequest nativeDownloadPublishRequest = this.$request;
                byte[] bArr = this.$bytes;
                this.L$0 = null;
                this.label = 1;
                obj = browserHostDownloads.publish(nativeDownloadPublishRequest, bArr, this);
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

        @Override // X.G0U
        public final Object invoke(HtJ<? super NativeDownloadPublishResult> htJ) {
            return ((C124982) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final boolean register(BrowserEnginePageFacts browserEnginePageFacts) {
        C7384Etj.A0Y(browserEnginePageFacts, 0);
        return this.pages.putIfAbsent(browserEnginePageFacts.identity, browserEnginePageFacts) == null;
    }

    public final void unregister(BrowserEnginePageFacts browserEnginePageFacts) {
        C7384Etj.A0Y(browserEnginePageFacts, 0);
        this.pages.remove(browserEnginePageFacts.identity, browserEnginePageFacts);
        this.files.removePage(browserEnginePageFacts);
    }

    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrowserNativeCloseResult.values().length];
            try {
                AnonymousClass002.A13(BrowserNativeCloseResult.CLOSED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(BrowserNativeCloseResult.REFUSED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(BrowserNativeCloseResult.UNKNOWN, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final NativePageCloseResult closeRefused(FailureDetail failureDetail) {
        return new NativePageCloseResult(new PageCloseOutcome.NotStarted(new Failure(FailureCode.UNAUTHORIZED, failureDetail)));
    }

    private final NativePageAuthorityDecision denied(HostRefusal hostRefusal) {
        return new NativePageAuthorityDecision(new PageAuthorityDecision.Denied(hostRefusal));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BrowserEnginePageFacts requirePage(PageAuthorityClaim pageAuthorityClaim) throws NativeException.Unavailable, NativeException.Unauthorized {
        BrowserEnginePageFacts browserEnginePageFacts = this.pages.get(pageAuthorityClaim.nativePage);
        if (browserEnginePageFacts == null) {
            throw new NativeException.Unauthorized();
        }
        if (!AnonymousClass003.A1Y(browserEnginePageFacts.isCurrent) || !C7384Etj.areEqual(browserEnginePageFacts.task, pageAuthorityClaim.task)) {
            throw new NativeException.Unauthorized();
        }
        PageAuthoritySnapshot pageAuthoritySnapshotSnapshot = browserEnginePageFacts.snapshot();
        if (!C7384Etj.areEqual(pageAuthoritySnapshotSnapshot.groupControlRevision, pageAuthorityClaim.groupControlRevision) || !C7384Etj.areEqual(pageAuthoritySnapshotSnapshot.pageAuthorityRevision, pageAuthorityClaim.pageAuthorityRevision) || pageAuthoritySnapshotSnapshot.control != TaskPageGroupControlState.AUTOMATION) {
            throw new NativeException.Unauthorized();
        }
        if (pageAuthoritySnapshotSnapshot.availability == Availability.AVAILABLE) {
            return browserEnginePageFacts;
        }
        throw new NativeException.Unavailable();
    }

    @Override // com.hatch.browser.core.BrowserHostNativeControls
    public Object allow(NativeControlRequest nativeControlRequest, HtJ<? super NativeControlDecision> htJ) {
        return BrowserNativeCallbackKt.nativeCallback(nativeControlRequest.budget, new AnonymousClass2(nativeControlRequest, null), htJ);
    }

    @Override // com.hatch.browser.core.BrowserHostAuthority
    public Object authorize(PageAuthorityClaim pageAuthorityClaim, Access access, HtJ<? super NativePageAuthorityDecision> htJ) {
        HostRefusal hostRefusal;
        BrowserEnginePageFacts browserEnginePageFacts = this.pages.get(pageAuthorityClaim.nativePage);
        if (browserEnginePageFacts == null) {
            hostRefusal = HostRefusal.UNKNOWN_PAGE;
        } else if (!AnonymousClass003.A1Y(browserEnginePageFacts.isCurrent)) {
            hostRefusal = HostRefusal.CONTROL_UNAVAILABLE;
        } else {
            if (C7384Etj.areEqual(browserEnginePageFacts.task, pageAuthorityClaim.task)) {
                return new NativePageAuthorityDecision(new PageAuthorityDecision.Granted(browserEnginePageFacts.snapshot()));
            }
            hostRefusal = HostRefusal.WRONG_TASK;
        }
        return denied(hostRefusal);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    @Override // com.hatch.browser.core.BrowserHostPageClose
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object closePage(com.hatch.browser.protocol.NativePageCloseRequest r14, X.HtJ<? super com.hatch.browser.core.NativePageCloseResult> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.facebook.aura.localbrowser.core.BrowserEngineAuthority.AnonymousClass1
            if (r0 == 0) goto La8
            r12 = r15
            com.facebook.aura.localbrowser.core.BrowserEngineAuthority$closePage$1 r12 = (com.facebook.aura.localbrowser.core.BrowserEngineAuthority.AnonymousClass1) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La8
            int r2 = r2 - r1
            r12.label = r2
        L12:
            java.lang.Object r4 = r12.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r12.label
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L54
            if (r0 != r2) goto Lb4
            X.Hwg.A00(r4)
        L21:
            com.facebook.aura.localbrowser.core.BrowserNativeCloseResult r4 = (com.facebook.aura.localbrowser.core.BrowserNativeCloseResult) r4
            int r3 = r4.ordinal()
            if (r3 == r1) goto L51
            if (r3 == r2) goto L42
            r0 = 2
            if (r3 != r0) goto Laf
            com.hatch.browser.protocol.FailureCode r2 = com.hatch.browser.protocol.FailureCode.INTERNAL
            com.hatch.browser.protocol.FailureDetail$NativeRefusal r1 = com.hatch.browser.protocol.FailureDetail.NativeRefusal.INSTANCE
            com.hatch.browser.protocol.Failure r0 = new com.hatch.browser.protocol.Failure
            r0.<init>(r2, r1)
            com.hatch.browser.protocol.PageCloseOutcome$Unknown r1 = new com.hatch.browser.protocol.PageCloseOutcome$Unknown
            r1.<init>(r0)
        L3c:
            com.hatch.browser.core.NativePageCloseResult r3 = new com.hatch.browser.core.NativePageCloseResult
            r3.<init>(r1)
            return r3
        L42:
            com.hatch.browser.protocol.FailureCode r2 = com.hatch.browser.protocol.FailureCode.UNAUTHORIZED
            com.hatch.browser.protocol.FailureDetail$NativeRefusal r1 = com.hatch.browser.protocol.FailureDetail.NativeRefusal.INSTANCE
            com.hatch.browser.protocol.Failure r0 = new com.hatch.browser.protocol.Failure
            r0.<init>(r2, r1)
            com.hatch.browser.protocol.PageCloseOutcome$NotStarted r1 = new com.hatch.browser.protocol.PageCloseOutcome$NotStarted
            r1.<init>(r0)
            goto L3c
        L51:
            com.hatch.browser.protocol.PageCloseOutcome$Closed r1 = com.hatch.browser.protocol.PageCloseOutcome.Closed.INSTANCE
            goto L3c
        L54:
            X.Hwg.A00(r4)
            com.facebook.aura.localbrowser.core.BrowserEngineBudget$Companion r4 = com.facebook.aura.localbrowser.core.BrowserEngineBudget.Companion
            com.hatch.browser.protocol.Budget r0 = r14.budget
            com.facebook.aura.localbrowser.core.BrowserEngineBudget r11 = r4.capture(r0)
            com.hatch.browser.protocol.PageAuthorityClaim r5 = r14.claim
            java.util.concurrent.ConcurrentHashMap<com.hatch.browser.protocol.NativePageIdentity, com.facebook.aura.localbrowser.core.BrowserEnginePageFacts> r4 = r13.pages
            com.hatch.browser.protocol.NativePageIdentity r0 = r5.nativePage
            java.lang.Object r6 = r4.get(r0)
            com.facebook.aura.localbrowser.core.BrowserEnginePageFacts r6 = (com.facebook.aura.localbrowser.core.BrowserEnginePageFacts) r6
            if (r6 != 0) goto L74
            com.hatch.browser.protocol.FailureDetail$UnknownPageReference r0 = com.hatch.browser.protocol.FailureDetail.UnknownPageReference.INSTANCE
        L6f:
            com.hatch.browser.core.NativePageCloseResult r3 = r13.closeRefused(r0)
            return r3
        L74:
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r6.isCurrent
            boolean r0 = X.AnonymousClass003.A1Y(r0)
            if (r0 != 0) goto L7f
            com.hatch.browser.protocol.FailureDetail$NativeRefusal r0 = com.hatch.browser.protocol.FailureDetail.NativeRefusal.INSTANCE
            goto L6f
        L7f:
            com.hatch.browser.protocol.BrowserTaskBinding r4 = r6.task
            com.hatch.browser.protocol.BrowserTaskBinding r0 = r5.task
            boolean r0 = X.C7384Etj.areEqual(r4, r0)
            if (r0 != 0) goto L8c
            com.hatch.browser.protocol.FailureDetail$WrongTask r0 = com.hatch.browser.protocol.FailureDetail.WrongTask.INSTANCE
            goto L6f
        L8c:
            com.facebook.aura.localbrowser.core.BrowserPageCloser r6 = r6.closer
            com.hatch.browser.protocol.TaskPageGroupControlRevision r0 = r5.groupControlRevision
            long r7 = r0.value
            com.hatch.browser.protocol.PageAuthorityRevision r0 = r5.pageAuthorityRevision
            long r9 = r0.value
            r0 = 0
            r12.L$0 = r0
            r12.L$1 = r0
            r12.L$2 = r0
            r12.L$3 = r0
            r12.label = r2
            java.lang.Object r4 = r6.close(r7, r9, r11, r12)
            if (r4 != r3) goto L21
            return r3
        La8:
            com.facebook.aura.localbrowser.core.BrowserEngineAuthority$closePage$1 r12 = new com.facebook.aura.localbrowser.core.BrowserEngineAuthority$closePage$1
            r12.<init>(r15)
            goto L12
        Laf:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        Lb4:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.core.BrowserEngineAuthority.closePage(com.hatch.browser.protocol.NativePageCloseRequest, X.HtJ):java.lang.Object");
    }

    public final BrowserEngineFiles getFiles$fbandroid_express_aura_java_com_facebook_aura_localbrowser_core_core() {
        return this.files;
    }

    @Override // com.hatch.browser.core.BrowserHostPdf
    public Object print(NativePdfPrintRequest nativePdfPrintRequest, HtJ<? super NativePdfPrintResult> htJ) {
        return BrowserNativeCallbackKt.nativeCallback(nativePdfPrintRequest.budget, new C124972(nativePdfPrintRequest, null), htJ);
    }

    @Override // com.hatch.browser.core.BrowserHostDownloads
    public Object publish(NativeDownloadPublishRequest nativeDownloadPublishRequest, byte[] bArr, HtJ<? super NativeDownloadPublishResult> htJ) {
        return BrowserNativeCallbackKt.nativeCallback(nativeDownloadPublishRequest.budget, new C124982(nativeDownloadPublishRequest, bArr, null), htJ);
    }
}
