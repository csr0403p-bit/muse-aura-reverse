package com.facebook.aura.pairs;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pairs.PairsGuidanceViewModel$reload$3$document$1", f = "PairsGuidanceViewModel.kt", l = {AuraWaitlistConfettiKt.StandardParticleCount}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PairsGuidanceViewModel$reload$3$document$1 extends AbstractC07127nr implements G0U<HtJ<? super PairsDiscretionDocument>, Object> {
    public int label;
    public final /* synthetic */ PairsGuidanceViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsGuidanceViewModel$reload$3$document$1(PairsGuidanceViewModel pairsGuidanceViewModel, HtJ<? super PairsGuidanceViewModel$reload$3$document$1> htJ) {
        super(1, htJ);
        this.this$0 = pairsGuidanceViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new PairsGuidanceViewModel$reload$3$document$1(this.this$0, htJ);
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super PairsDiscretionDocument> htJ) {
        return new PairsGuidanceViewModel$reload$3$document$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            PairsGuidanceViewModel pairsGuidanceViewModel = this.this$0;
            PairsRepository pairsRepository = pairsGuidanceViewModel.repository;
            String str = pairsGuidanceViewModel.chatSessionId;
            this.label = 1;
            obj = pairsRepository.loadGuidance(str, this);
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
}
