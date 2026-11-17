package com.facebook.aura.localbrowser.core;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10543Hqv;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserEngine$Companion$create$4", f = "BrowserEngine.kt", l = {164}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class BrowserEngine$Companion$create$4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ C10543Hqv<BrowserEngine> $engine;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserEngine$Companion$create$4(C10543Hqv<BrowserEngine> c10543Hqv, HtJ<? super BrowserEngine$Companion$create$4> htJ) {
        super(2, htJ);
        this.$engine = c10543Hqv;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new BrowserEngine$Companion$create$4(this.$engine, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            BrowserEngine browserEngine = this.$engine.element;
            if (browserEngine == null) {
                return null;
            }
            this.label = 1;
            obj = browserEngine.shutdown(this);
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
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return new BrowserEngine$Companion$create$4(this.$engine, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
