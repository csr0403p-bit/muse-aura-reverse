package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.C1BO;
import X.C3UX;
import X.C6t6;
import X.G0V;
import X.HtJ;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$1$1", f = "NativeLoginCheckpointWebScreen.kt", l = {89, 89}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnFailure$delegate;
    public final /* synthetic */ AtomicBoolean $terminalEvent;
    public final /* synthetic */ String $url;
    public final /* synthetic */ C6t6 $webView;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$1$1(AtomicBoolean atomicBoolean, C6t6 c6t6, String str, C1BO<? extends Function0<Unit>> c1bo, HtJ<? super NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$1$1> htJ) {
        super(2, htJ);
        this.$terminalEvent = atomicBoolean;
        this.$webView = c6t6;
        this.$url = str;
        this.$currentOnFailure$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$1$1(this.$terminalEvent, this.$webView, this.$url, this.$currentOnFailure$delegate, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L27
            if (r0 == r2) goto L33
            if (r0 != r1) goto L54
            X.Hwg.A00(r5)
        Lf:
            boolean r0 = X.AnonymousClass001.A1X(r5)
            if (r0 == 0) goto L45
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.$terminalEvent
            boolean r0 = r0.get()
            if (r0 != 0) goto L24
            X.6t6 r1 = r4.$webView
            java.lang.String r0 = r4.$url
            r1.loadUrl(r0)
        L24:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L27:
            X.Hwg.A00(r5)
            r4.label = r2
            java.lang.Object r5 = com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt.clearCheckpointWebData(r4)
            if (r5 != r3) goto L36
            return r3
        L33:
            X.Hwg.A00(r5)
        L36:
            boolean r0 = X.AnonymousClass001.A1X(r5)
            if (r0 == 0) goto L45
            r4.label = r1
            java.lang.Object r5 = com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt.prepareDeviceIdentity(r4)
            if (r5 != r3) goto Lf
            return r3
        L45:
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.$terminalEvent
            r0 = 0
            boolean r0 = r1.compareAndSet(r0, r2)
            if (r0 == 0) goto L24
            X.1BO<kotlin.jvm.functions.Function0<kotlin.Unit>> r0 = r4.$currentOnFailure$delegate
            X.C1BO.A0D(r0)
            goto L24
        L54:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
