package com.facebook.aura.pairs;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.pairs.PairsCodeProgress;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pairs.PairsStatusViewModel$connect$1$outcome$1", f = "PairsStatusViewModel.kt", l = {188}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PairsStatusViewModel$connect$1$outcome$1 extends AbstractC07127nr implements G0U<HtJ<? super PairsCodeOutcome>, Object> {
    public final /* synthetic */ PairsCodeProgress.CodeReady $ready;
    public int label;
    public final /* synthetic */ PairsStatusViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsStatusViewModel$connect$1$outcome$1(PairsStatusViewModel pairsStatusViewModel, PairsCodeProgress.CodeReady codeReady, HtJ<? super PairsStatusViewModel$connect$1$outcome$1> htJ) {
        super(1, htJ);
        this.this$0 = pairsStatusViewModel;
        this.$ready = codeReady;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new PairsStatusViewModel$connect$1$outcome$1(this.this$0, this.$ready, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            PairsRepository pairsRepository = this.this$0.repository;
            PairsPairingCode pairsPairingCode = this.$ready.code;
            this.label = 1;
            obj = pairsRepository.confirmSafetyCode(pairsPairingCode, this);
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

    @Override // X.G0U
    public final Object invoke(HtJ<? super PairsCodeOutcome> htJ) {
        return ((PairsStatusViewModel$connect$1$outcome$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
