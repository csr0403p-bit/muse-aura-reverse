package com.facebook.aura.pairs;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C78T;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.InterfaceC05161qu;
import X.InterfaceC2178B0w;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pairs.PairsComponentsKt$rememberPairsImage$bitmap$2$1", f = "PairsComponents.kt", l = {292}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PairsComponentsKt$rememberPairsImage$bitmap$2$1 extends AbstractC07127nr implements G0V<InterfaceC05161qu<InterfaceC2178B0w>, HtJ<? super Unit>, Object> {
    public final /* synthetic */ PairsImageRef $ref;
    public final /* synthetic */ int $sizePx;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsComponentsKt$rememberPairsImage$bitmap$2$1(PairsImageRef pairsImageRef, AbstractC3358CGz abstractC3358CGz, int i, HtJ<? super PairsComponentsKt$rememberPairsImage$bitmap$2$1> htJ) {
        super(2, htJ);
        this.$ref = pairsImageRef;
        this.$userSession = abstractC3358CGz;
        this.$sizePx = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        PairsComponentsKt$rememberPairsImage$bitmap$2$1 pairsComponentsKt$rememberPairsImage$bitmap$2$1 = new PairsComponentsKt$rememberPairsImage$bitmap$2$1(this.$ref, this.$userSession, this.$sizePx, htJ);
        pairsComponentsKt$rememberPairsImage$bitmap$2$1.L$0 = obj;
        return pairsComponentsKt$rememberPairsImage$bitmap$2$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState = (MutableState) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            PairsImageRef pairsImageRef = this.$ref;
            obj = null;
            if (pairsImageRef != null) {
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                int i2 = this.$sizePx;
                C78T c78tA0y = AnonymousClass001.A0y();
                PairsComponentsKt$rememberPairsImage$bitmap$2$1$1$1 pairsComponentsKt$rememberPairsImage$bitmap$2$1$1$1 = new PairsComponentsKt$rememberPairsImage$bitmap$2$1$1$1(abstractC3358CGz, pairsImageRef, i2, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = mutableState;
                this.label = 1;
                obj = GAo.A00(this, c78tA0y, pairsComponentsKt$rememberPairsImage$bitmap$2$1$1$1);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            mutableState = (MutableState) this.L$2;
            Hwg.A00(obj);
        }
        mutableState.Af8(obj);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(InterfaceC05161qu<InterfaceC2178B0w> interfaceC05161qu, HtJ<? super Unit> htJ) {
        return ((PairsComponentsKt$rememberPairsImage$bitmap$2$1) create(interfaceC05161qu, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
