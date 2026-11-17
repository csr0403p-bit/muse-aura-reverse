package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$wakeForTask$1$taskRegistered$1", f = "LocalBrowserRuntime.kt", l = {605}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserRuntime$wakeForTask$1$taskRegistered$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $browserTaskId;
    public int label;
    public final /* synthetic */ LocalBrowserRuntime this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserRuntime$wakeForTask$1$taskRegistered$1(LocalBrowserRuntime localBrowserRuntime, String str, HtJ<? super LocalBrowserRuntime$wakeForTask$1$taskRegistered$1> htJ) {
        super(2, htJ);
        this.this$0 = localBrowserRuntime;
        this.$browserTaskId = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserRuntime$wakeForTask$1$taskRegistered$1(this.this$0, this.$browserTaskId, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            LocalBrowserRuntime localBrowserRuntime = this.this$0;
            String str = this.$browserTaskId;
            this.label = 1;
            if (localBrowserRuntime.awaitTaskRegistered(str, this) == enumC10460Hji) {
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
        return ((LocalBrowserRuntime$wakeForTask$1$taskRegistered$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
