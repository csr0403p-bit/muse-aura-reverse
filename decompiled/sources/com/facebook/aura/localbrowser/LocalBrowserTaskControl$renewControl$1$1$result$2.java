package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3cH;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.browsertask.control.BrowserControlResult;
import com.facebook.aura.browsertask.control.BrowserTaskControlClient;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskControl$renewControl$1$1$result$2", f = "LocalBrowserTaskControl.kt", l = {202}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserTaskControl$renewControl$1$1$result$2 extends AbstractC07127nr implements G0U<HtJ<? super BrowserControlResult>, Object> {
    public int label;
    public final /* synthetic */ LocalBrowserTaskControl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserTaskControl$renewControl$1$1$result$2(LocalBrowserTaskControl localBrowserTaskControl, HtJ<? super LocalBrowserTaskControl$renewControl$1$1$result$2> htJ) {
        super(1, htJ);
        this.this$0 = localBrowserTaskControl;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new LocalBrowserTaskControl$renewControl$1$1$result$2(this.this$0, htJ);
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super BrowserControlResult> htJ) {
        return new LocalBrowserTaskControl$renewControl$1$1$result$2(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            LocalBrowserTaskControl localBrowserTaskControl = this.this$0;
            BrowserTaskControlClient browserTaskControlClient = localBrowserTaskControl.client;
            String strA0b = C3cH.A0b(localBrowserTaskControl.task);
            this.label = 1;
            obj = browserTaskControlClient.heartbeat(strA0b, this);
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
}
