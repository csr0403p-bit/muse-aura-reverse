package com.facebook.aura.pairs;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC2178B0w;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pairs.PairsComponentsKt$rememberPairsImage$bitmap$2$1$1$1", f = "PairsComponents.kt", l = {293}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PairsComponentsKt$rememberPairsImage$bitmap$2$1$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super InterfaceC2178B0w>, Object> {
    public final /* synthetic */ PairsImageRef $it;
    public final /* synthetic */ int $sizePx;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsComponentsKt$rememberPairsImage$bitmap$2$1$1$1(AbstractC3358CGz abstractC3358CGz, PairsImageRef pairsImageRef, int i, HtJ<? super PairsComponentsKt$rememberPairsImage$bitmap$2$1$1$1> htJ) {
        super(2, htJ);
        this.$userSession = abstractC3358CGz;
        this.$it = pairsImageRef;
        this.$sizePx = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PairsComponentsKt$rememberPairsImage$bitmap$2$1$1$1(this.$userSession, this.$it, this.$sizePx, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            PairsRepository companion = PairsRepository.Companion.getInstance(this.$userSession);
            PairsImageRef pairsImageRef = this.$it;
            int i2 = this.$sizePx;
            this.label = 1;
            obj = companion.image(pairsImageRef, i2, this);
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
    public final Object invoke(C3UX c3ux, HtJ<? super InterfaceC2178B0w> htJ) {
        return ((PairsComponentsKt$rememberPairsImage$bitmap$2$1$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
