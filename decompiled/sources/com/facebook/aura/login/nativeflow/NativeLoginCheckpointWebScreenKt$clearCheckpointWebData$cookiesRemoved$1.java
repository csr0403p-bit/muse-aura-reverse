package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7Bm;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.GBL;
import X.HtJ;
import X.Hwg;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.DispatchException;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt$clearCheckpointWebData$cookiesRemoved$1", f = "NativeLoginCheckpointWebScreen.kt", l = {289}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class NativeLoginCheckpointWebScreenKt$clearCheckpointWebData$cookiesRemoved$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public int label;

    public NativeLoginCheckpointWebScreenKt$clearCheckpointWebData$cookiesRemoved$1(HtJ<? super NativeLoginCheckpointWebScreenKt$clearCheckpointWebData$cookiesRemoved$1> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new NativeLoginCheckpointWebScreenKt$clearCheckpointWebData$cookiesRemoved$1(htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return new NativeLoginCheckpointWebScreenKt$clearCheckpointWebData$cookiesRemoved$1(htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws DispatchException {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return obj;
        }
        Hwg.A00(obj);
        this.label = 1;
        final GBL gblA04 = C7Bm.A04(this);
        try {
            CookieManager.getInstance().removeAllCookies(new ValueCallback() { // from class: com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt$clearCheckpointWebData$cookiesRemoved$1$1$1
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Boolean bool) {
                    if (gblA04.isActive()) {
                        gblA04.resumeWith(AnonymousClass001.A0i());
                    }
                }
            });
        } catch (RuntimeException unused) {
            CFK.A06(NativeLoginCheckpointWebScreenKt.TAG, "cookie clear failed");
            if (gblA04.isActive()) {
                gblA04.resumeWith(AnonymousClass001.A0h());
            }
        }
        Object objA0F = gblA04.A0F();
        return objA0F == enumC10460Hji ? enumC10460Hji : objA0F;
    }
}
