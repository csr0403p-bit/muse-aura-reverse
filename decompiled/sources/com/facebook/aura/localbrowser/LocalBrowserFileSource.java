package com.facebook.aura.localbrowser;

import X.AbstractC3358CGz;
import X.C06H;
import X.C60P;
import X.C7384Etj;
import X.C7BY;
import X.HtJ;
import X.HzP;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.localbrowser.core.BrowserPageFileSource;
import com.hatch.browser.core.NativeException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class LocalBrowserFileSource implements BrowserPageFileSource {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final int MAX_BYTES = 67108864;
    public final String gatewayUrl;
    public final LocalBrowserTransferFiles temporaryFiles;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserFileSource", f = "LocalBrowserFileSource.kt", l = {69}, m = AgeCheckFunnelLogging.KEY_STAGE, v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserFileSource$stage$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserFileSource.this.stage(null, null, this);
        }
    }

    public LocalBrowserFileSource(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.gatewayUrl = C60P.A1K(abstractC3358CGz);
        this.temporaryFiles = LocalBrowserTransferFiles.Companion.getInstance(abstractC3358CGz);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCurrent() throws NativeException.Unauthorized {
        if (C7BY.A0j(this.gatewayUrl) || !AuraSessionManager.INSTANCE.isCurrentSession(this.userSession) || !C7384Etj.areEqual(HatchGatewayPrefsStore.Companion.getInstance(this.userSession).getGatewayUrl(), this.gatewayUrl)) {
            throw new NativeException.Unauthorized();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.io.Closeable] */
    @Override // com.facebook.aura.localbrowser.core.BrowserPageFileSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object stage(com.hatch.browser.protocol.FileRef r23, com.facebook.aura.localbrowser.core.BrowserEngineBudget r24, X.HtJ<? super com.facebook.aura.localbrowser.core.BrowserStagedFile> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserFileSource.stage(com.hatch.browser.protocol.FileRef, com.facebook.aura.localbrowser.core.BrowserEngineBudget, X.HtJ):java.lang.Object");
    }
}
