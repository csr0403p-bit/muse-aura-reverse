package com.hatch.browser.core;

import X.AbstractC07127nr;
import X.AbstractC8884Fsp;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.hatch.browser.core.RustBuffer;
import com.hatch.browser.core.UniffiRustCallStatus;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostFiles$read$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1", f = "hatch_browser_core_uniffi.kt", l = {1858}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class uniffiCallbackInterfaceBrowserHostFiles$read$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ G0U $handleError;
    public final /* synthetic */ G0U $handleSuccess;
    public final /* synthetic */ G0U $makeCall;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uniffiCallbackInterfaceBrowserHostFiles$read$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(G0U g0u, G0U g0u2, G0U g0u3, HtJ htJ) {
        super(2, htJ);
        this.$makeCall = g0u;
        this.$handleError = g0u2;
        this.$handleSuccess = g0u3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new uniffiCallbackInterfaceBrowserHostFiles$read$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(this.$makeCall, this.$handleError, this.$handleSuccess, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        RustBuffer.ByValue byValueA0Q;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        byte b = 1;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                G0U g0u = this.$makeCall;
                this.label = 1;
                obj = g0u.invoke(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            this.$handleSuccess.invoke(obj);
        } catch (Exception e) {
            boolean z = e instanceof NativeException;
            G0U g0u2 = this.$handleError;
            UniffiRustCallStatus.Companion companion = UniffiRustCallStatus.Companion;
            if (z) {
                byValueA0Q = FfiConverterTypeNativeError.INSTANCE.lower((Object) e);
            } else {
                byValueA0Q = AbstractC8884Fsp.A0Q(e);
                b = 2;
            }
            AbstractC8884Fsp.A0T(byValueA0Q, companion, g0u2, b);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((uniffiCallbackInterfaceBrowserHostFiles$read$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
