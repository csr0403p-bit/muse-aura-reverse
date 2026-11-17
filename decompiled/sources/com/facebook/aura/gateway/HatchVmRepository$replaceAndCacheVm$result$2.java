package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0U;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchVmRepository$replaceAndCacheVm$result$2", f = "HatchVmRepository.kt", l = {536}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchVmRepository$replaceAndCacheVm$result$2 extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends FetchLeasedVmV2ResponseJson>>, Object> {
    public final /* synthetic */ String $oldEnvId;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public final /* synthetic */ HatchlingVmType $vmType;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVmRepository$replaceAndCacheVm$result$2(AbstractC3358CGz abstractC3358CGz, String str, HatchlingVmType hatchlingVmType, HtJ<? super HatchVmRepository$replaceAndCacheVm$result$2> htJ) {
        super(1, htJ);
        this.$userSession = abstractC3358CGz;
        this.$oldEnvId = str;
        this.$vmType = hatchlingVmType;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HatchVmRepository$replaceAndCacheVm$result$2(this.$userSession, this.$oldEnvId, this.$vmType, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM962replaceVmBWLJW6A;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchVmRepository hatchVmRepository = HatchVmRepository.INSTANCE;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            String str = this.$oldEnvId;
            HatchlingVmType hatchlingVmType = this.$vmType;
            this.label = 1;
            objM962replaceVmBWLJW6A = hatchVmRepository.m962replaceVmBWLJW6A(abstractC3358CGz, str, hatchlingVmType, this);
            if (objM962replaceVmBWLJW6A == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM962replaceVmBWLJW6A = AnonymousClass001.A0q(obj);
        }
        return C3cG.A0t(objM962replaceVmBWLJW6A);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(HtJ<? super HsJ<FetchLeasedVmV2ResponseJson>> htJ) {
        return ((HatchVmRepository$replaceAndCacheVm$result$2) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Object invoke(HtJ<? super HsJ<? extends FetchLeasedVmV2ResponseJson>> htJ) {
        return invoke2((HtJ<? super HsJ<FetchLeasedVmV2ResponseJson>>) htJ);
    }
}
