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
import com.facebook.aura.gateway.HatchVmRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchVmRepository$fetchExistingVm$result$1", f = "HatchVmRepository.kt", l = {325}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchVmRepository$fetchExistingVm$result$1 extends AbstractC07127nr implements G0U<HtJ<? super HatchVmRepository.FetchAndCacheLeasedVmResult>, Object> {
    public final /* synthetic */ VmFetchSource $source;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchVmRepository$fetchExistingVm$result$1$1", f = "HatchVmRepository.kt", l = {325}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchVmRepository$fetchExistingVm$result$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends FetchLeasedVmV2ResponseJson>>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass1(htJ);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HtJ<? super HsJ<FetchLeasedVmV2ResponseJson>> htJ) {
            return new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM963requestFetchVmsIoAF18A;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchVmRepository hatchVmRepository = HatchVmRepository.INSTANCE;
                this.label = 1;
                objM963requestFetchVmsIoAF18A = hatchVmRepository.m963requestFetchVmsIoAF18A(this);
                if (objM963requestFetchVmsIoAF18A == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM963requestFetchVmsIoAF18A = AnonymousClass001.A0q(obj);
            }
            return C3cG.A0t(objM963requestFetchVmsIoAF18A);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(HtJ<? super HsJ<? extends FetchLeasedVmV2ResponseJson>> htJ) {
            return invoke2((HtJ<? super HsJ<FetchLeasedVmV2ResponseJson>>) htJ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVmRepository$fetchExistingVm$result$1(AbstractC3358CGz abstractC3358CGz, VmFetchSource vmFetchSource, HtJ<? super HatchVmRepository$fetchExistingVm$result$1> htJ) {
        super(1, htJ);
        this.$userSession = abstractC3358CGz;
        this.$source = vmFetchSource;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HatchVmRepository$fetchExistingVm$result$1(this.$userSession, this.$source, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchVmRepository hatchVmRepository = HatchVmRepository.INSTANCE;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            VmFetchSource vmFetchSource = this.$source;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            obj = hatchVmRepository.requestAndCacheVm(abstractC3358CGz, vmFetchSource, anonymousClass1, this);
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
    public final Object invoke(HtJ<? super HatchVmRepository.FetchAndCacheLeasedVmResult> htJ) {
        return ((HatchVmRepository$fetchExistingVm$result$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
