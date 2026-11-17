package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.localbrowser.core.BrowserEngineResult;
import com.facebook.aura.nodes.api.HatchNodeInvocation;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserNodeHandler$reported$1$encode$2", f = "LocalBrowserNodeHandler.kt", l = {185, 210}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserNodeHandler$reported$1$encode$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super JsonObject>, Object> {
    public final /* synthetic */ HatchNodeInvocation $invocation;
    public final /* synthetic */ BrowserEngineResult.Reported $result;
    public final /* synthetic */ LocalBrowserSession $session;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public final /* synthetic */ LocalBrowserNodeHandler this$0;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserNodeHandler$reported$1$encode$2$1", f = "LocalBrowserNodeHandler.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserNodeHandler$reported$1$encode$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $code;
        public final /* synthetic */ LocalBrowserSession $session;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LocalBrowserSession localBrowserSession, String str, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$session = localBrowserSession;
            this.$code = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$session, this.$code, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            this.$session.checkRendererAfterFailure(this.$code);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserNodeHandler$reported$1$encode$2(LocalBrowserNodeHandler localBrowserNodeHandler, HatchNodeInvocation hatchNodeInvocation, BrowserEngineResult.Reported reported, LocalBrowserSession localBrowserSession, HtJ<? super LocalBrowserNodeHandler$reported$1$encode$2> htJ) {
        super(2, htJ);
        this.this$0 = localBrowserNodeHandler;
        this.$invocation = hatchNodeInvocation;
        this.$result = reported;
        this.$session = localBrowserSession;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserNodeHandler$reported$1$encode$2(this.this$0, this.$invocation, this.$result, this.$session, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserNodeHandler$reported$1$encode$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super JsonObject> htJ) {
        return ((LocalBrowserNodeHandler$reported$1$encode$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
