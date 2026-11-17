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
import com.hatch.browser.core.UniffiRustCallStatus;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.hatch.browser.core.Hatch_browser_core_uniffiKt$uniffiTraitInterfaceCallAsync$job$1", f = "hatch_browser_core_uniffi.kt", l = {1829}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class Hatch_browser_core_uniffiKt$uniffiTraitInterfaceCallAsync$job$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ G0U<UniffiRustCallStatus.ByValue, Unit> $handleError;
    public final /* synthetic */ G0U<T, Unit> $handleSuccess;
    public final /* synthetic */ G0U<HtJ<? super T>, Object> $makeCall;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Hatch_browser_core_uniffiKt$uniffiTraitInterfaceCallAsync$job$1(G0U<? super HtJ<? super T>, ? extends Object> g0u, G0U<? super UniffiRustCallStatus.ByValue, Unit> g0u2, G0U<? super T, Unit> g0u3, HtJ<? super Hatch_browser_core_uniffiKt$uniffiTraitInterfaceCallAsync$job$1> htJ) {
        super(2, htJ);
        this.$makeCall = g0u;
        this.$handleError = g0u2;
        this.$handleSuccess = g0u3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new Hatch_browser_core_uniffiKt$uniffiTraitInterfaceCallAsync$job$1(this.$makeCall, this.$handleError, this.$handleSuccess, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                G0U<HtJ<? super T>, Object> g0u = this.$makeCall;
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
            return Unit.INSTANCE;
        } catch (Exception e) {
            G0U<UniffiRustCallStatus.ByValue, Unit> g0u2 = this.$handleError;
            AbstractC8884Fsp.A0T(AbstractC8884Fsp.A0Q(e), UniffiRustCallStatus.Companion, g0u2, (byte) 2);
            return Unit.INSTANCE;
        }
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        try {
            this.$handleSuccess.invoke(this.$makeCall.invoke(this));
            return Unit.INSTANCE;
        } catch (Exception e) {
            G0U<UniffiRustCallStatus.ByValue, Unit> g0u = this.$handleError;
            AbstractC8884Fsp.A0T(AbstractC8884Fsp.A0Q(e), UniffiRustCallStatus.Companion, g0u, (byte) 2);
            return Unit.INSTANCE;
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((Hatch_browser_core_uniffiKt$uniffiTraitInterfaceCallAsync$job$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
