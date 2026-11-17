package com.facebook.aura.localbrowser.core;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C10543Hqv;
import X.C3UX;
import X.CFK;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.localbrowser.core.BrowserEngineResult;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.hatch.browser.core.BrowserOperationsKt;
import com.hatch.browser.core.CommandReport;
import com.hatch.browser.core.Page;
import com.hatch.browser.core.PageAccess;
import com.hatch.browser.core.PageRemoval;
import com.hatch.browser.protocol.ApiException;
import com.hatch.browser.protocol.Budget;
import com.hatch.browser.protocol.NativePageIdentity;
import com.hatch.browser.protocol.NotificationStatus;
import com.hatch.browser.protocol.OperationId;
import com.hatch.browser.protocol.PageAuthorityRevision;
import com.hatch.browser.protocol.PageAuthorityState;
import com.hatch.browser.protocol.PageCloseInvocation;
import com.hatch.browser.protocol.PageCommandInvocation;
import com.hatch.browser.protocol.PageReference;
import com.hatch.browser.protocol.PageRemovalReceipt;
import com.hatch.browser.protocol.PageStateChange;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes6.dex */
public final class BrowserEnginePage {
    public static final int $stable = (BrowserEngineAuthority.$stable | BrowserEnginePageFacts.$stable) | Page.$stable;
    public final BrowserEngineAuthority authority;
    public final BrowserEnginePageFacts facts;
    public final Page page;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserEnginePage$connect$2", f = "BrowserEnginePage.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.core.BrowserEnginePage$connect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ BrowserEngineBudget $budget;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BrowserEngineBudget browserEngineBudget, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$budget = browserEngineBudget;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return BrowserEnginePage.this.new AnonymousClass2(this.$budget, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            boolean z = true;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    Page page = BrowserEnginePage.this.page;
                    Budget budgetForExecution = this.$budget.captured.forExecution();
                    this.label = 1;
                    if (BrowserOperationsKt.connect(page, budgetForExecution, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
            } catch (ApiException e) {
                CFK.A0A(BrowserEnginePageKt.TAG, "connect refused", e);
                z = false;
            }
            return Boolean.valueOf(z);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserEnginePage", f = "BrowserEnginePage.kt", l = {FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.core.BrowserEnginePage$execute$1, reason: invalid class name */
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
            return BrowserEnginePage.this.execute(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserEnginePage$execute$2", f = "BrowserEnginePage.kt", l = {110}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.core.BrowserEnginePage$execute$2, reason: invalid class name and case insensitive filesystem */
    public final class C125012 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super BrowserEngineResult>, Object> {
        public final /* synthetic */ BrowserEngineBudget $budget;
        public final /* synthetic */ BrowserOperation $operation;
        public final /* synthetic */ String $operationId;
        public final /* synthetic */ C10543Hqv<CommandReport> $retained;
        public Object L$0;
        public int label;
        public final /* synthetic */ BrowserEnginePage this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125012(String str, BrowserEngineBudget browserEngineBudget, BrowserOperation browserOperation, BrowserEnginePage browserEnginePage, C10543Hqv<CommandReport> c10543Hqv, HtJ<? super C125012> htJ) {
            super(2, htJ);
            this.$operationId = str;
            this.$budget = browserEngineBudget;
            this.$operation = browserOperation;
            this.this$0 = browserEnginePage;
            this.$retained = c10543Hqv;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C125012(this.$operationId, this.$budget, this.$operation, this.this$0, this.$retained, htJ);
        }

        /* JADX WARN: Type inference failed for: r8v3, types: [T, com.hatch.browser.core.CommandReport] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    OperationId operationId = new OperationId(this.$operationId);
                    Budget budgetForExecution = this.$budget.captured.forExecution();
                    BrowserOperation browserOperation = this.$operation;
                    PageCommandInvocation pageCommandInvocation = new PageCommandInvocation(operationId, budgetForExecution, browserOperation.command, browserOperation.observeAfter);
                    Page page = this.this$0.page;
                    this.L$0 = null;
                    this.label = 1;
                    obj = BrowserOperationsKt.execute(page, pageCommandInvocation, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                ?? r8 = (CommandReport) obj;
                this.$retained.element = r8;
                return new BrowserEngineResult.Reported(r8, this.$operation.imageFormat);
            } catch (ApiException unused) {
                return BrowserEngineResult.Refused.INSTANCE;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super BrowserEngineResult> htJ) {
            return ((C125012) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserEnginePage$reconnect$2", f = "BrowserEnginePage.kt", l = {54}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.core.BrowserEnginePage$reconnect$2, reason: invalid class name and case insensitive filesystem */
    public final class C125022 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ BrowserEngineBudget $budget;
        public final /* synthetic */ BrowserPageTarget $target;
        public Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ BrowserEnginePage this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125022(BrowserPageTarget browserPageTarget, BrowserEnginePage browserEnginePage, BrowserEngineBudget browserEngineBudget, HtJ<? super C125022> htJ) {
            super(2, htJ);
            this.$target = browserPageTarget;
            this.this$0 = browserEnginePage;
            this.$budget = browserEngineBudget;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C125022(this.$target, this.this$0, this.$budget, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.AutoCloseable] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Exception {
            PageAccess pageAccess;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            boolean z = true;
            try {
                try {
                    if (i == 0) {
                        Hwg.A00(obj);
                        PageAccess.Companion companion = PageAccess.Companion;
                        BrowserPageTarget browserPageTarget = this.$target;
                        PageAccess pageAccessPageEndpoint = companion.pageEndpoint(browserPageTarget.endpoint, browserPageTarget.browserInstanceId, browserPageTarget.targetId);
                        BrowserEnginePage browserEnginePage = this.this$0;
                        BrowserEngineBudget browserEngineBudget = this.$budget;
                        Page page = browserEnginePage.page;
                        Budget budgetForExecution = browserEngineBudget.captured.forExecution();
                        this.L$0 = pageAccessPageEndpoint;
                        this.L$1 = null;
                        this.label = 1;
                        Object objReconnect = BrowserOperationsKt.reconnect(page, pageAccessPageEndpoint, budgetForExecution, this);
                        pageAccess = pageAccessPageEndpoint;
                        if (objReconnect == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        ?? r3 = (AutoCloseable) this.L$0;
                        Hwg.A00(obj);
                        pageAccess = r3;
                    }
                    if (pageAccess != null) {
                        pageAccess.close();
                    }
                } finally {
                }
            } catch (ApiException e) {
                CFK.A0A(BrowserEnginePageKt.TAG, "reconnect refused", e);
                z = false;
            }
            return Boolean.valueOf(z);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C125022) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserEnginePage$remove$1", f = "BrowserEnginePage.kt", l = {80}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.core.BrowserEnginePage$remove$1, reason: invalid class name and case insensitive filesystem */
    public final class C125031 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
        public final /* synthetic */ PageRemoval $removal;
        public Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ BrowserEnginePage this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125031(PageRemoval pageRemoval, BrowserEnginePage browserEnginePage, HtJ<? super C125031> htJ) {
            super(1, htJ);
            this.$removal = pageRemoval;
            this.this$0 = browserEnginePage;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new C125031(this.$removal, this.this$0, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.AutoCloseable] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Exception {
            PageRemoval pageRemoval;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    PageRemoval pageRemoval2 = this.$removal;
                    this.L$0 = pageRemoval2;
                    this.L$1 = null;
                    this.label = 1;
                    obj = pageRemoval2.awaitSettlement(this);
                    pageRemoval = pageRemoval2;
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    ?? r2 = (AutoCloseable) this.L$0;
                    Hwg.A00(obj);
                    pageRemoval = r2;
                }
                PageRemovalReceipt pageRemovalReceipt = (PageRemovalReceipt) obj;
                if (pageRemoval != null) {
                    pageRemoval.close();
                }
                Boolean boolValueOf = Boolean.valueOf(pageRemovalReceipt.removed && pageRemovalReceipt.settled);
                BrowserEnginePage browserEnginePage = this.this$0;
                if (boolValueOf.booleanValue()) {
                    browserEnginePage.page.destroy();
                }
                return boolValueOf;
            } finally {
            }
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Boolean> htJ) {
            return ((C125031) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final boolean notify(PageStateChange pageStateChange) {
        return this.page.updateState(pageStateChange).status == NotificationStatus.APPLIED;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(java.lang.String r12, com.facebook.aura.localbrowser.core.BrowserOperation r13, com.facebook.aura.localbrowser.core.BrowserEngineBudget r14, X.HtJ<? super com.facebook.aura.localbrowser.core.BrowserEngineResult> r15) {
        /*
            r11 = this;
            r3 = r15
            boolean r0 = r15 instanceof com.facebook.aura.localbrowser.core.BrowserEnginePage.AnonymousClass1
            r9 = r11
            if (r0 == 0) goto L24
            r4 = r3
            com.facebook.aura.localbrowser.core.BrowserEnginePage$execute$1 r4 = (com.facebook.aura.localbrowser.core.BrowserEnginePage.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r4.label = r2
        L14:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 != r2) goto L60
            java.lang.Object r10 = r4.L$3
            X.Hqv r10 = (X.C10543Hqv) r10
            goto L4e
        L24:
            com.facebook.aura.localbrowser.core.BrowserEnginePage$execute$1 r4 = new com.facebook.aura.localbrowser.core.BrowserEnginePage$execute$1
            r4.<init>(r15)
            goto L14
        L2a:
            X.Hqv r10 = X.C3cG.A10(r1)
            com.facebook.aura.executors.AuraDispatchers r0 = com.facebook.aura.executors.AuraDispatchers.INSTANCE     // Catch: java.lang.Throwable -> L55
            X.78T r0 = r0.m764default()     // Catch: java.lang.Throwable -> L55
            r11 = 0
            com.facebook.aura.localbrowser.core.BrowserEnginePage$execute$2 r5 = new com.facebook.aura.localbrowser.core.BrowserEnginePage$execute$2     // Catch: java.lang.Throwable -> L55
            r6 = r12
            r8 = r13
            r7 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L55
            r4.L$0 = r11     // Catch: java.lang.Throwable -> L55
            r4.L$1 = r11     // Catch: java.lang.Throwable -> L55
            r4.L$2 = r11     // Catch: java.lang.Throwable -> L55
            r4.L$3 = r10     // Catch: java.lang.Throwable -> L55
            r4.label = r2     // Catch: java.lang.Throwable -> L55
            java.lang.Object r1 = X.GAo.A00(r4, r0, r5)     // Catch: java.lang.Throwable -> L55
            if (r1 != r3) goto L51
            return r3
        L4e:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L55
        L51:
            r0 = 0
            r10.element = r0     // Catch: java.lang.Throwable -> L55
            return r1
        L55:
            r1 = move-exception
            T r0 = r10.element
            com.hatch.browser.core.CommandReport r0 = (com.hatch.browser.core.CommandReport) r0
            if (r0 == 0) goto L64
            r0.destroy()
            throw r1
        L60:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
        L64:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.core.BrowserEnginePage.execute(java.lang.String, com.facebook.aura.localbrowser.core.BrowserOperation, com.facebook.aura.localbrowser.core.BrowserEngineBudget, X.HtJ):java.lang.Object");
    }

    public final Object connect(BrowserEngineBudget browserEngineBudget, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AuraDispatchers.INSTANCE.m764default(), new AnonymousClass2(browserEngineBudget, null));
    }

    public final boolean destroyed(long j) {
        this.authority.unregister(this.facts);
        return notify(new PageStateChange(new PageAuthorityRevision(j), PageAuthorityState.Destroyed.INSTANCE));
    }

    public final boolean isFileStageActive() {
        return this.authority.files.hasStage(this.facts);
    }

    public final PageReference lifecycleReference() {
        return this.page.lifecycleReference();
    }

    public final Object reconnect(BrowserPageTarget browserPageTarget, BrowserEngineBudget browserEngineBudget, HtJ<? super Boolean> htJ) {
        return !new NativePageIdentity.CdpTarget(browserPageTarget.browserInstanceId, browserPageTarget.targetId).equals(this.facts.identity) ? AnonymousClass001.A0h() : GAo.A00(htJ, AuraDispatchers.INSTANCE.m764default(), new C125022(browserPageTarget, this, browserEngineBudget, null));
    }

    public final BrowserEngineSettlement remove() {
        PageRemoval pageRemovalRemove = this.page.remove();
        this.authority.unregister(this.facts);
        return new BrowserEngineSettlement(new C125031(pageRemovalRemove, this, null));
    }

    public final boolean updateState(long j, boolean z) {
        this.facts.publish(j, z);
        return notify(BrowserEngineGroupKt.pageStateChange(j, z));
    }

    public BrowserEnginePage(Page page, BrowserEnginePageFacts browserEnginePageFacts, BrowserEngineAuthority browserEngineAuthority) {
        AnonymousClass005.A0x(page, browserEnginePageFacts, browserEngineAuthority);
        this.page = page;
        this.facts = browserEnginePageFacts;
        this.authority = browserEngineAuthority;
    }

    public final BrowserEngineClosure beginClose(String str, BrowserEngineBudget browserEngineBudget) {
        AnonymousClass003.A0u(str, browserEngineBudget);
        try {
            return new BrowserEngineClosure(this.page.beginClose(new PageCloseInvocation(new OperationId(str), browserEngineBudget.captured.forExecution())));
        } catch (ApiException unused) {
            return null;
        }
    }
}
