package com.facebook.aura.localbrowser.core;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC7532Ezu;
import X.AnonymousClass001;
import X.BMp;
import X.BV4;
import X.C06H;
import X.C3UX;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.C8j3;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.hatch.browser.core.BrowserHostFiles;
import com.hatch.browser.core.NativeException;
import com.hatch.browser.core.NativeFileReadResult;
import com.hatch.browser.core.NativeFileStageResult;
import com.hatch.browser.protocol.Failure;
import com.hatch.browser.protocol.FailureCode;
import com.hatch.browser.protocol.FailureDetail;
import com.hatch.browser.protocol.FileRef;
import com.hatch.browser.protocol.FileStageOutcome;
import com.hatch.browser.protocol.NativeFileReadRequest;
import com.hatch.browser.protocol.NativeFileStageRequest;
import com.hatch.browser.protocol.PageAuthorityClaim;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class BrowserEngineFiles implements BrowserHostFiles {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final int MAX_BYTES = 67108864;

    @Deprecated
    public static final int READ_SLICE_BYTES = 1048576;
    public final G0U<PageAuthorityClaim, BrowserEnginePageFacts> requirePage;
    public final AtomicLong stagedBytes;
    public final ConcurrentHashMap<String, Stage> stages;

    public final class Stage {
        public volatile BrowserEngineBudget budget;
        public volatile BrowserEnginePageFacts facts;
        public volatile NativeFileStageRequest request;
        public final AtomicBoolean staging = BV4.A12(true);
        public final AtomicBoolean released = C60O.A1E();
        public final AtomicLong reservedBytes = new AtomicLong(0);
        public final AtomicReference<List<BrowserStagedFile>> content = BV4.A16(null);

        public Stage() {
        }

        public final void checkLive() throws NativeException.Unavailable {
            if (this.released.get()) {
                throw new NativeException.Unavailable();
            }
        }

        public final BrowserEngineBudget getBudget() {
            return this.budget;
        }

        public final AtomicReference<List<BrowserStagedFile>> getContent() {
            return this.content;
        }

        public final BrowserEnginePageFacts getFacts() {
            return this.facts;
        }

        public final AtomicBoolean getReleased() {
            return this.released;
        }

        public final NativeFileStageRequest getRequest() {
            return this.request;
        }

        public final AtomicBoolean getStaging() {
            return this.staging;
        }

        public final void release() {
            this.released.set(true);
            List list = (List) C8j3.A10(this.content);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((BrowserStagedFile) it.next()).release();
                }
            }
            if (this.staging.get()) {
                return;
            }
            BrowserEngineFiles.this.stagedBytes.addAndGet(-this.reservedBytes.getAndSet(0L));
        }

        public final void reserve(long j) throws NativeException.Unavailable {
            long j2;
            do {
                j2 = BrowserEngineFiles.this.stagedBytes.get();
                if (j > 67108864 - j2) {
                    throw new NativeException.Unavailable();
                }
            } while (!BrowserEngineFiles.this.stagedBytes.compareAndSet(j2, j2 + j));
            this.reservedBytes.set(j);
            checkLive();
        }

        public final void setBudget(BrowserEngineBudget browserEngineBudget) {
            this.budget = browserEngineBudget;
        }

        public final void setFacts(BrowserEnginePageFacts browserEnginePageFacts) {
            this.facts = browserEnginePageFacts;
        }

        public final void setRequest(NativeFileStageRequest nativeFileStageRequest) {
            this.request = nativeFileStageRequest;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserEngineFiles$read$2", f = "BrowserEngineFiles.kt", l = {114}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.core.BrowserEngineFiles$read$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0U<HtJ<? super NativeFileReadResult>, Object> {
        public final /* synthetic */ NativeFileReadRequest $request;
        public final /* synthetic */ Stage $stage;
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ BrowserEngineFiles this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Stage stage, BrowserEngineFiles browserEngineFiles, NativeFileReadRequest nativeFileReadRequest, HtJ<? super AnonymousClass2> htJ) {
            super(1, htJ);
            this.$stage = stage;
            this.this$0 = browserEngineFiles;
            this.$request = nativeFileReadRequest;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass2(this.$stage, this.this$0, this.$request, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws NativeException.Unavailable, NativeException.Unauthorized {
            PageAuthorityClaim pageAuthorityClaim;
            BrowserStagedFile browserStagedFile;
            List<FileRef> list;
            FileRef fileRef;
            int i;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i2 = this.label;
            if (i2 == 0) {
                Hwg.A00(obj);
                this.$stage.checkLive();
                NativeFileStageRequest nativeFileStageRequest = this.$stage.request;
                if (nativeFileStageRequest == null || (pageAuthorityClaim = nativeFileStageRequest.claim) == null) {
                    throw new NativeException.Unavailable();
                }
                if (this.this$0.requirePage.invoke(pageAuthorityClaim) != this.$stage.facts) {
                    throw new NativeException.Unauthorized();
                }
                NativeFileReadRequest nativeFileReadRequest = this.$request;
                if (AbstractC7532Ezu.A00(nativeFileReadRequest.index ^ Integer.MIN_VALUE, -1) > 0 || AbstractC7532Ezu.A00(nativeFileReadRequest.length ^ Integer.MIN_VALUE, -2146435072) > 0) {
                    throw new NativeException.Unavailable();
                }
                List<BrowserStagedFile> list2 = this.$stage.content.get();
                if (list2 == null || (browserStagedFile = (BrowserStagedFile) AbstractC0878AGe.A0A(this.$request.index, list2)) == null) {
                    throw new NativeException.Unavailable();
                }
                NativeFileStageRequest nativeFileStageRequest2 = this.$stage.request;
                if (nativeFileStageRequest2 == null || (list = nativeFileStageRequest2.files) == null || (fileRef = (FileRef) AbstractC0878AGe.A0A(this.$request.index, list)) == null) {
                    throw new NativeException.Unavailable();
                }
                long j = fileRef.bytes;
                NativeFileReadRequest nativeFileReadRequest2 = this.$request;
                long j2 = nativeFileReadRequest2.offset;
                if (BMp.A01(j2, j) > 0) {
                    throw new NativeException.Unavailable();
                }
                long jA03 = BV4.A03(nativeFileReadRequest2.length);
                long j3 = j - j2;
                if (BMp.A01(jA03, j3) > 0) {
                    jA03 = j3;
                }
                i = (int) jA03;
                this.L$0 = null;
                this.L$1 = null;
                this.J$0 = j;
                this.I$0 = i;
                this.label = 1;
                obj = browserStagedFile.read(j2, i, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i2 != 1) {
                    throw AnonymousClass001.A0n();
                }
                i = this.I$0;
                Hwg.A00(obj);
            }
            byte[] bArr = (byte[]) obj;
            this.$stage.checkLive();
            if (bArr.length == i) {
                return new NativeFileReadResult(bArr);
            }
            throw new NativeException.Unavailable();
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super NativeFileReadResult> htJ) {
            return ((AnonymousClass2) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserEngineFiles$stage$2", f = "BrowserEngineFiles.kt", l = {63}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.core.BrowserEngineFiles$stage$2, reason: invalid class name and case insensitive filesystem */
    public final class C125002 extends AbstractC07127nr implements G0U<HtJ<? super NativeFileStageResult>, Object> {
        public final /* synthetic */ NativeFileStageRequest $request;
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserEngineFiles$stage$2$1", f = "BrowserEngineFiles.kt", l = {MessageDraftSenderKt.UNICODE_MULTIPART_CHARS}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.localbrowser.core.BrowserEngineFiles$stage$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ List<BrowserStagedFile> $files;
            public final /* synthetic */ NativeFileStageRequest $request;
            public final /* synthetic */ BrowserPageFileSource $source;
            public final /* synthetic */ Stage $stage;
            public Object L$0;
            public Object L$1;
            public Object L$2;
            public int label;
            public final /* synthetic */ BrowserEngineFiles this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NativeFileStageRequest nativeFileStageRequest, Stage stage, BrowserEngineFiles browserEngineFiles, List<BrowserStagedFile> list, BrowserPageFileSource browserPageFileSource, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.$request = nativeFileStageRequest;
                this.$stage = stage;
                this.this$0 = browserEngineFiles;
                this.$files = list;
                this.$source = browserPageFileSource;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.$request, this.$stage, this.this$0, this.$files, this.$source, htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004d -> B:6:0x0014). Please report as a decompilation issue!!! */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) throws com.hatch.browser.core.NativeException.Unavailable, com.hatch.browser.core.NativeException.Timeout {
                /*
                    r8 = this;
                    X.Hji r5 = X.EnumC10460Hji.A02
                    int r0 = r8.label
                    r4 = 1
                    if (r0 == 0) goto L50
                    if (r0 != r4) goto L65
                    java.lang.Object r7 = r8.L$2
                    java.util.List r7 = (java.util.List) r7
                    java.lang.Object r6 = r8.L$0
                    java.util.Iterator r6 = (java.util.Iterator) r6
                    X.Hwg.A00(r9)
                L14:
                    r7.add(r9)
                    X.C3cG.A1H(r8)
                L1a:
                    boolean r0 = r6.hasNext()
                    if (r0 == 0) goto L62
                    java.lang.Object r3 = r6.next()
                    com.hatch.browser.protocol.FileRef r3 = (com.hatch.browser.protocol.FileRef) r3
                    com.facebook.aura.localbrowser.core.BrowserEngineFiles$Stage r0 = r8.$stage
                    r0.checkLive()
                    com.facebook.aura.localbrowser.core.BrowserEngineFiles r0 = r8.this$0
                    X.G0U<com.hatch.browser.protocol.PageAuthorityClaim, com.facebook.aura.localbrowser.core.BrowserEnginePageFacts> r1 = r0.requirePage
                    com.hatch.browser.protocol.NativeFileStageRequest r0 = r8.$request
                    com.hatch.browser.protocol.PageAuthorityClaim r0 = r0.claim
                    r1.invoke(r0)
                    java.util.List<com.facebook.aura.localbrowser.core.BrowserStagedFile> r7 = r8.$files
                    com.facebook.aura.localbrowser.core.BrowserPageFileSource r2 = r8.$source
                    com.facebook.aura.localbrowser.core.BrowserEngineFiles$Stage r0 = r8.$stage
                    com.facebook.aura.localbrowser.core.BrowserEngineBudget r1 = r0.budget
                    if (r1 == 0) goto L5c
                    r8.L$0 = r6
                    r0 = 0
                    r8.L$1 = r0
                    r8.L$2 = r7
                    r8.label = r4
                    java.lang.Object r9 = r2.stage(r3, r1, r8)
                    if (r9 != r5) goto L14
                    return r5
                L50:
                    X.Hwg.A00(r9)
                    com.hatch.browser.protocol.NativeFileStageRequest r0 = r8.$request
                    java.util.List<com.hatch.browser.protocol.FileRef> r0 = r0.files
                    java.util.Iterator r6 = r0.iterator()
                    goto L1a
                L5c:
                    com.hatch.browser.core.NativeException$Timeout r0 = new com.hatch.browser.core.NativeException$Timeout
                    r0.<init>()
                    throw r0
                L62:
                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                    return r5
                L65:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.core.BrowserEngineFiles.C125002.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125002(NativeFileStageRequest nativeFileStageRequest, HtJ<? super C125002> htJ) {
            super(1, htJ);
            this.$request = nativeFileStageRequest;
        }

        public static final Stage invokeSuspend$lambda$0(BrowserEngineFiles browserEngineFiles, String str) {
            return browserEngineFiles.new Stage();
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return BrowserEngineFiles.this.new C125002(this.$request, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0159  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 396
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.core.BrowserEngineFiles.C125002.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public static final Stage invokeSuspend$lambda$1(G0U g0u, Object obj) {
            return (Stage) g0u.invoke(obj);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super NativeFileStageResult> htJ) {
            return ((C125002) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BrowserEngineFiles(G0U<? super PageAuthorityClaim, BrowserEnginePageFacts> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.requirePage = g0u;
        this.stages = C60O.A1C();
        this.stagedBytes = new AtomicLong(0L);
    }

    public final boolean hasStage(BrowserEnginePageFacts browserEnginePageFacts) {
        C7384Etj.A0Y(browserEnginePageFacts, 0);
        Collection<Stage> collectionValues = this.stages.values();
        C7384Etj.A0U(collectionValues);
        if (collectionValues.isEmpty()) {
            return false;
        }
        for (Stage stage : collectionValues) {
            if (stage.facts == browserEnginePageFacts && !stage.released.get()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.hatch.browser.core.BrowserHostFiles
    public void release(String str) {
        C7384Etj.A0Y(str, 0);
        try {
            Stage stage = this.stages.get(str);
            if (stage != null) {
                stage.release();
                if (stage.staging.get()) {
                    return;
                }
                this.stages.remove(str, stage);
            }
        } catch (Throwable unused) {
        }
    }

    public final void removePage(BrowserEnginePageFacts browserEnginePageFacts) {
        C7384Etj.A0Y(browserEnginePageFacts, 0);
        Iterator itA1R = C60P.A1R(this.stages);
        while (itA1R.hasNext()) {
            Stage stage = (Stage) itA1R.next();
            if (stage.facts == browserEnginePageFacts) {
                stage.release();
            }
        }
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NativeFileStageResult unavailable(FailureDetail failureDetail) {
        return new NativeFileStageResult(new FileStageOutcome.NotStarted(new Failure(FailureCode.UNAVAILABLE, failureDetail)));
    }

    public final void close() {
        Iterator itA1R = C60P.A1R(this.stages);
        while (itA1R.hasNext()) {
            ((Stage) itA1R.next()).release();
        }
        this.stages.clear();
    }

    @Override // com.hatch.browser.core.BrowserHostFiles
    public Object read(NativeFileReadRequest nativeFileReadRequest, HtJ<? super NativeFileReadResult> htJ) throws NativeException.Unavailable {
        Stage stage = this.stages.get(nativeFileReadRequest.stageId);
        if (stage == null) {
            throw new NativeException.Unavailable();
        }
        BrowserEngineBudget browserEngineBudget = stage.budget;
        if (browserEngineBudget != null) {
            return BrowserNativeCallbackKt.nativeCallback(browserEngineBudget.captured.forExecution(), new AnonymousClass2(stage, this, nativeFileReadRequest, null), htJ);
        }
        throw new NativeException.Unavailable();
    }

    @Override // com.hatch.browser.core.BrowserHostFiles
    public Object stage(NativeFileStageRequest nativeFileStageRequest, HtJ<? super NativeFileStageResult> htJ) {
        return BrowserNativeCallbackKt.nativeCallback(nativeFileStageRequest.budget, new C125002(nativeFileStageRequest, null), htJ);
    }
}
