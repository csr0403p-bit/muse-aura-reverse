package com.facebook.aura.localbrowser.core;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class BrowserEngineSettlement {
    public static final int $stable = 8;
    public final G0U<HtJ<? super Boolean>, Object> settle;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserEngineSettlement$await$2", f = "BrowserEngineResult.kt", l = {146}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.core.BrowserEngineSettlement$await$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return BrowserEngineSettlement.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                G0U<HtJ<? super Boolean>, Object> g0u = BrowserEngineSettlement.this.settle;
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
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return BrowserEngineSettlement.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BrowserEngineSettlement(G0U<? super HtJ<? super Boolean>, ? extends Object> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.settle = g0u;
    }

    public final Object await(HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, C3cG.A0v(), new AnonymousClass2(null));
    }
}
