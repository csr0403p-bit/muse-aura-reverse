package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.ui.StaggeredEntranceKt;
import com.facebook.aura.localbrowser.core.BrowserEngine;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$openSessionOnMain$engine$1$2", f = "LocalBrowserRuntime.kt", l = {StaggeredEntranceKt.StaggeredEntranceDurationMs}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserRuntime$openSessionOnMain$engine$1$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ BrowserEngine $created;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserRuntime$openSessionOnMain$engine$1$2(BrowserEngine browserEngine, HtJ<? super LocalBrowserRuntime$openSessionOnMain$engine$1$2> htJ) {
        super(2, htJ);
        this.$created = browserEngine;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserRuntime$openSessionOnMain$engine$1$2(this.$created, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            BrowserEngine browserEngine = this.$created;
            this.label = 1;
            if (browserEngine.shutdown(this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new LocalBrowserRuntime$openSessionOnMain$engine$1$2(this.$created, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
