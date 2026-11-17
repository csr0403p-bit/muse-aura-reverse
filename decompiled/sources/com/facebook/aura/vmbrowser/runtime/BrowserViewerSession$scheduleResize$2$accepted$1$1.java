package com.facebook.aura.vmbrowser.runtime;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.browsertask.control.BrowserPresentResult;
import com.facebook.aura.browsertask.control.BrowserViewerPreference;
import com.facebook.aura.file.utils.HtmlPdfRenderer;
import com.facebook.aura.vmbrowser.runtime.BrowserViewerSession;
import com.facebook.aura.vmbrowser.runtime.BrowserViewerUpdateResult;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$scheduleResize$2$accepted$1$1", f = "BrowserViewerSession.kt", l = {577, HtmlPdfRenderer.PAGE_WIDTH}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class BrowserViewerSession$scheduleResize$2$accepted$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ long $generation;
    public final /* synthetic */ BrowserViewerSession.Host $host;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ BrowserViewerSession this$0;

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$scheduleResize$2$accepted$1$1$2", f = "BrowserViewerSession.kt", l = {583}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$scheduleResize$2$accepted$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<BrowserViewerPreference, HtJ<? super BrowserViewerUpdateResult>, Object> {
        public final /* synthetic */ BrowserViewerSession.Host $host;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ BrowserViewerSession this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BrowserViewerSession browserViewerSession, BrowserViewerSession.Host host, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.this$0 = browserViewerSession;
            this.$host = host;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$host, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BrowserViewerPreference browserViewerPreference = (BrowserViewerPreference) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BrowserSessionController browserSessionController = this.this$0.controller;
                String str = this.$host.taskId;
                this.L$0 = null;
                this.label = 1;
                obj = browserSessionController.updateViewer(str, browserViewerPreference, this);
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
        public final Object invoke(BrowserViewerPreference browserViewerPreference, HtJ<? super BrowserViewerUpdateResult> htJ) {
            return ((AnonymousClass2) create(browserViewerPreference, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserViewerSession$scheduleResize$2$accepted$1$1(BrowserViewerSession.Host host, long j, BrowserViewerSession browserViewerSession, HtJ<? super BrowserViewerSession$scheduleResize$2$accepted$1$1> htJ) {
        super(2, htJ);
        this.$host = host;
        this.$generation = j;
        this.this$0 = browserViewerSession;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new BrowserViewerSession$scheduleResize$2$accepted$1$1(this.$host, this.$generation, this.this$0, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        boolean zAcceptPresentation = false;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$host.isCurrentMode$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime(this.$generation)) {
                BrowserViewerSession.Host host = this.$host;
                if (host.presentationConfirmed) {
                    if (C7384Etj.areEqual(host.submitted, host.preference)) {
                        return true;
                    }
                    BrowserViewerSession browserViewerSession = this.this$0;
                    BrowserViewerSession.Host host2 = this.$host;
                    long j = this.$generation;
                    BrowserViewerUpdateResult.Retry retry = BrowserViewerUpdateResult.Retry.INSTANCE;
                    G0U g0u = new G0U() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$scheduleResize$2$accepted$1$1$$ExternalSyntheticLambda0
                        @Override // X.G0U
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(C7384Etj.areEqual(obj2, BrowserViewerUpdateResult.Retry.INSTANCE));
                        }
                    };
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(browserViewerSession, host2, null);
                    this.label = 1;
                    obj = browserViewerSession.viewerRequest(host2, j, retry, g0u, anonymousClass2, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
            }
            return Boolean.valueOf(zAcceptPresentation);
        }
        if (i != 1) {
            if (i != 2) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            zAcceptPresentation = obj instanceof BrowserPresentResult.Presented;
            return Boolean.valueOf(zAcceptPresentation);
        }
        Hwg.A00(obj);
        HxE hxE = (HxE) obj;
        BrowserViewerPreference browserViewerPreference = (BrowserViewerPreference) hxE.first;
        BrowserViewerUpdateResult browserViewerUpdateResult = (BrowserViewerUpdateResult) hxE.second;
        if (this.$host.isCurrentMode$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime(this.$generation)) {
            if (browserViewerUpdateResult instanceof BrowserViewerUpdateResult.Updated) {
                zAcceptPresentation = this.this$0.acceptPresentation(this.$host, this.$generation, browserViewerPreference, ((BrowserViewerUpdateResult.Updated) browserViewerUpdateResult).lease);
            } else if (C7384Etj.areEqual(browserViewerUpdateResult, BrowserViewerUpdateResult.InvalidState.INSTANCE)) {
                BrowserViewerSession browserViewerSession2 = this.this$0;
                BrowserViewerSession.Host host3 = this.$host;
                long j2 = this.$generation;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                obj = browserViewerSession2.prepareLocked(host3, j2, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
                zAcceptPresentation = obj instanceof BrowserPresentResult.Presented;
            }
        }
        return Boolean.valueOf(zAcceptPresentation);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return ((BrowserViewerSession$scheduleResize$2$accepted$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
