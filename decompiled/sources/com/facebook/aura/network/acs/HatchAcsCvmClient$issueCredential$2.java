package com.facebook.aura.network.acs;

import X.A8F;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.network.acs.HatchAcsCvmClient$issueCredential$2", f = "HatchAcsCvmClient.kt", l = {15}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchAcsCvmClient$issueCredential$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends A8F>>, Object> {
    public int label;
    public final /* synthetic */ HatchAcsCvmClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAcsCvmClient$issueCredential$2(HatchAcsCvmClient hatchAcsCvmClient, HtJ<? super HatchAcsCvmClient$issueCredential$2> htJ) {
        super(2, htJ);
        this.this$0 = hatchAcsCvmClient;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAcsCvmClient$issueCredential$2(this.this$0, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends A8F>> htJ) {
        return new HatchAcsCvmClient$issueCredential$2(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1584fetchAndRedeemgIAlus;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchAnonCredProvider hatchAnonCredProvider = this.this$0.anonCredProvider;
            this.label = 1;
            objM1584fetchAndRedeemgIAlus = hatchAnonCredProvider.m1584fetchAndRedeemgIAlus(HatchAnonCredProvider.EMPTY_DATA, this);
            if (objM1584fetchAndRedeemgIAlus == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1584fetchAndRedeemgIAlus = AnonymousClass001.A0q(obj);
        }
        return C3cG.A0t(objM1584fetchAndRedeemgIAlus);
    }
}
