package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Add missing generic type declarations: [T] */
@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskControl$request$result$1", f = "LocalBrowserTaskControl.kt", l = {183}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserTaskControl$request$result$1<T> extends AbstractC07127nr implements G0V<C3UX, HtJ<? super T>, Object> {
    public final /* synthetic */ G0U<HtJ<? super T>, Object> $block;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LocalBrowserTaskControl$request$result$1(G0U<? super HtJ<? super T>, ? extends Object> g0u, HtJ<? super LocalBrowserTaskControl$request$result$1> htJ) {
        super(2, htJ);
        this.$block = g0u;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserTaskControl$request$result$1(this.$block, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            G0U<HtJ<? super T>, Object> g0u = this.$block;
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
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super T> htJ) {
        return new LocalBrowserTaskControl$request$result$1(this.$block, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
