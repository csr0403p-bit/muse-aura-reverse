package com.facebook.aura.vmbrowser.runtime;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10543Hqv;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.browsertask.control.BrowserViewerPreference;
import com.facebook.aura.handoff.impl.MC;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Add missing generic type declarations: [T] */
@DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$viewerRequest$result$1", f = "BrowserViewerSession.kt", l = {MC.muse_android_deeplink_security_controls.__CONFIG__}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class BrowserViewerSession$viewerRequest$result$1<T> extends AbstractC07127nr implements G0U<HtJ<? super T>, Object> {
    public final /* synthetic */ G0V<BrowserViewerPreference, HtJ<? super T>, Object> $request;
    public final /* synthetic */ C10543Hqv<BrowserViewerPreference> $requested;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BrowserViewerSession$viewerRequest$result$1(G0V<? super BrowserViewerPreference, ? super HtJ<? super T>, ? extends Object> g0v, C10543Hqv<BrowserViewerPreference> c10543Hqv, HtJ<? super BrowserViewerSession$viewerRequest$result$1> htJ) {
        super(1, htJ);
        this.$request = g0v;
        this.$requested = c10543Hqv;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new BrowserViewerSession$viewerRequest$result$1(this.$request, this.$requested, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            G0V<BrowserViewerPreference, HtJ<? super T>, Object> g0v = this.$request;
            BrowserViewerPreference browserViewerPreference = this.$requested.element;
            this.label = 1;
            obj = g0v.invoke(browserViewerPreference, this);
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
    public final Object invoke(HtJ<? super T> htJ) {
        return ((BrowserViewerSession$viewerRequest$result$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
