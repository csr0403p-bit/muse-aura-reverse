package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.components.reactions.AuraMicroLaunchKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$closeSession$2$1", f = "LocalBrowserRuntime.kt", l = {AuraMicroLaunchKt.MICRO_LAUNCH_TOTAL_MS}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserRuntime$closeSession$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ LocalBrowserConnection $connection;
    public final /* synthetic */ boolean $nativeRetired;
    public final /* synthetic */ LocalBrowserSession $session;
    public int label;
    public final /* synthetic */ LocalBrowserRuntime this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserRuntime$closeSession$2$1(LocalBrowserConnection localBrowserConnection, LocalBrowserRuntime localBrowserRuntime, boolean z, LocalBrowserSession localBrowserSession, HtJ<? super LocalBrowserRuntime$closeSession$2$1> htJ) {
        super(2, htJ);
        this.$connection = localBrowserConnection;
        this.this$0 = localBrowserRuntime;
        this.$nativeRetired = z;
        this.$session = localBrowserSession;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserRuntime$closeSession$2$1(this.$connection, this.this$0, this.$nativeRetired, this.$session, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            LocalBrowserConnection localBrowserConnection = this.$connection;
            this.label = 1;
            obj = localBrowserConnection.settle(this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        if (!AnonymousClass001.A1X(obj)) {
            LocalBrowserRuntime.disableAfterCleanupFailure$default(this.this$0, "connection_not_settled", null, 2, null);
            CFK.A06(LocalBrowserRuntime.TAG, "Browser connection cleanup did not settle");
        } else if (this.$nativeRetired) {
            this.this$0.ownedSessions.remove(this.$session.id);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((LocalBrowserRuntime$closeSession$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
