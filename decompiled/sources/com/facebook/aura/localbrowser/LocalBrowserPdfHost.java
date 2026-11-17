package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C2yI;
import X.C3UX;
import X.C7438Evz;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.executors.AuraDispatchers;
import com.hatch.browser.core.BrowserHostPdf;
import com.hatch.browser.core.NativeException;
import com.hatch.browser.core.NativePdfPrintResult;
import com.hatch.browser.protocol.NativePdfPrintRequest;
import com.hatch.browser.protocol.PageAuthorityClaim;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class LocalBrowserPdfHost implements BrowserHostPdf {
    public static final int $stable = LocalBrowserSession.$stable;
    public final Function0<Boolean> isConnected;
    public final LocalBrowserSession session;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserPdfHost$print$2", f = "LocalBrowserPdfHost.kt", l = {30}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserPdfHost$print$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super NativePdfPrintResult>, Object> {
        public final /* synthetic */ NativePdfPrintRequest $request;
        public int label;

        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserPdfHost$print$2$1, reason: invalid class name */
        public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements Function0<Boolean> {
            public final /* synthetic */ NativePdfPrintRequest $request;
            public final /* synthetic */ LocalBrowserPdfHost this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LocalBrowserPdfHost localBrowserPdfHost, NativePdfPrintRequest nativePdfPrintRequest) {
                super(0, C2yI.class, "isCurrent", "invokeSuspend$isCurrent(Lcom/facebook/aura/localbrowser/LocalBrowserPdfHost;Lcom/hatch/browser/protocol/NativePdfPrintRequest;)Z", 0);
                this.this$0 = localBrowserPdfHost;
                this.$request = nativePdfPrintRequest;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(AnonymousClass2.invokeSuspend$isCurrent(this.this$0, this.$request));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NativePdfPrintRequest nativePdfPrintRequest, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$request = nativePdfPrintRequest;
        }

        public static final boolean invokeSuspend$isCurrent(LocalBrowserPdfHost localBrowserPdfHost, NativePdfPrintRequest nativePdfPrintRequest) {
            LocalBrowserTask localBrowserTask;
            LocalBrowserFacts value = localBrowserPdfHost.session.facts.getValue();
            if (AnonymousClass003.A1Y(localBrowserPdfHost.isConnected)) {
                LocalBrowserSession localBrowserSession = localBrowserPdfHost.session;
                if (localBrowserSession.isOpen() && AuraSessionManager.INSTANCE.isCurrentSession(localBrowserSession.userSession) && (((localBrowserTask = localBrowserPdfHost.session.task) == null || localBrowserTask.isCurrent()) && value.control == LocalBrowserControl.AGENT)) {
                    long j = value.controlRevision;
                    PageAuthorityClaim pageAuthorityClaim = nativePdfPrintRequest.claim;
                    if (j == pageAuthorityClaim.groupControlRevision.value && value.pageRevision == pageAuthorityClaim.pageAuthorityRevision.value) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserPdfHost.this.new AnonymousClass2(this.$request, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws NativeException.Unauthorized {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                if (!invokeSuspend$isCurrent(LocalBrowserPdfHost.this, this.$request)) {
                    throw new NativeException.Unauthorized();
                }
                LocalBrowserPdfHost localBrowserPdfHost = LocalBrowserPdfHost.this;
                LocalBrowserTarget localBrowserTarget = localBrowserPdfHost.session.target;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(localBrowserPdfHost, this.$request);
                this.label = 1;
                obj = localBrowserTarget.printLoadedPage(anonymousClass1, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return new NativePdfPrintResult((byte[]) obj);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super NativePdfPrintResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.hatch.browser.core.BrowserHostPdf
    public Object print(NativePdfPrintRequest nativePdfPrintRequest, HtJ<? super NativePdfPrintResult> htJ) {
        return GAo.A00(htJ, AuraDispatchers.mainImmediate, new AnonymousClass2(nativePdfPrintRequest, null));
    }

    public LocalBrowserPdfHost(LocalBrowserSession localBrowserSession, Function0<Boolean> function0) {
        AnonymousClass003.A0u(localBrowserSession, function0);
        this.session = localBrowserSession;
        this.isConnected = function0;
    }
}
