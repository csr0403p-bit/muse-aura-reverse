package com.facebook.aura.vmbrowser.runtime;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$clearUserData$1$1$1$1$1", f = "BrowserViewerSession.kt", l = {341}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class BrowserViewerSession$clearUserData$1$1$1$1$1 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
    public final /* synthetic */ String $taskId;
    public int label;
    public final /* synthetic */ BrowserViewerSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserViewerSession$clearUserData$1$1$1$1$1(BrowserViewerSession browserViewerSession, String str, HtJ<? super BrowserViewerSession$clearUserData$1$1$1$1$1> htJ) {
        super(1, htJ);
        this.this$0 = browserViewerSession;
        this.$taskId = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new BrowserViewerSession$clearUserData$1$1$1$1$1(this.this$0, this.$taskId, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            BrowserSessionController browserSessionController = this.this$0.controller;
            String str = this.$taskId;
            this.label = 1;
            obj = browserSessionController.controlClient.releaseControl(str, this);
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

    @Override // X.G0U
    public final Object invoke(HtJ<? super Boolean> htJ) {
        return ((BrowserViewerSession$clearUserData$1$1$1$1$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
