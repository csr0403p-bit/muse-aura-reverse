package com.facebook.aura.vmbrowser.runtime;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.HwK;
import X.Hwg;
import X.InterfaceC2261BLa;
import com.facebook.aura.browsertask.control.BrowserPresentResult;
import com.facebook.aura.vmbrowser.runtime.BrowserViewerSession;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$Host$prepareStream$2", f = "BrowserViewerSession.kt", l = {959, 213}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class BrowserViewerSession$Host$prepareStream$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super BrowserPresentResult>, Object> {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ BrowserViewerSession this$0;
    public final /* synthetic */ BrowserViewerSession.Host this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserViewerSession$Host$prepareStream$2(BrowserViewerSession browserViewerSession, BrowserViewerSession.Host host, HtJ<? super BrowserViewerSession$Host$prepareStream$2> htJ) {
        super(2, htJ);
        this.this$0 = browserViewerSession;
        this.this$1 = host;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new BrowserViewerSession$Host$prepareStream$2(this.this$0, this.this$1, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Throwable {
        BrowserViewerSession browserViewerSession;
        InterfaceC2261BLa interfaceC2261BLa;
        BrowserViewerSession.Host host;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                browserViewerSession = this.this$0;
                interfaceC2261BLa = browserViewerSession.mutations;
                host = this.this$1;
                this.L$0 = interfaceC2261BLa;
                this.L$1 = browserViewerSession;
                this.L$2 = host;
                this.label = 1;
                if (interfaceC2261BLa.APs(null, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    interfaceC2261BLa = (InterfaceC2261BLa) this.L$0;
                    try {
                        Hwg.A00(obj);
                        BrowserPresentResult browserPresentResult = (BrowserPresentResult) obj;
                        interfaceC2261BLa.Ahe(null);
                        return browserPresentResult;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC2261BLa.Ahe(null);
                        throw th;
                    }
                }
                host = (BrowserViewerSession.Host) this.L$2;
                browserViewerSession = (BrowserViewerSession) this.L$1;
                interfaceC2261BLa = (InterfaceC2261BLa) this.L$0;
                Hwg.A00(obj);
            }
            HwK hwK = HwK.A00;
            BrowserViewerSession$Host$prepareStream$2$1$1 browserViewerSession$Host$prepareStream$2$1$1 = new BrowserViewerSession$Host$prepareStream$2$1$1(browserViewerSession, host, null);
            this.L$0 = interfaceC2261BLa;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            obj = GAo.A00(this, hwK, browserViewerSession$Host$prepareStream$2$1$1);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
            BrowserPresentResult browserPresentResult2 = (BrowserPresentResult) obj;
            interfaceC2261BLa.Ahe(null);
            return browserPresentResult2;
        } catch (Throwable th2) {
            th = th2;
            interfaceC2261BLa.Ahe(null);
            throw th;
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super BrowserPresentResult> htJ) {
        return ((BrowserViewerSession$Host$prepareStream$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
