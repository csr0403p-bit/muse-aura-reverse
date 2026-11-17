package com.facebook.aura.confidentialvm.model;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.HwK;
import X.Hwg;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.gateway.HatchVmRepository;
import com.facebook.aura.gateway.VmFetchSource;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel$onContinueClick$1$result$1", f = "ConfidentialVmSubscriptionEndedViewModel.kt", l = {94}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ConfidentialVmSubscriptionEndedViewModel$onContinueClick$1$result$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchVmRepository.FetchAndCacheLeasedVmResult>, Object> {
    public int label;
    public final /* synthetic */ ConfidentialVmSubscriptionEndedViewModel this$0;

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel$onContinueClick$1$result$1$1", f = "ConfidentialVmSubscriptionEndedViewModel.kt", l = {SelfieSnapshotKt.SELFIE_JPEG_QUALITY}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel$onContinueClick$1$result$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchVmRepository.FetchAndCacheLeasedVmResult>, Object> {
        public int label;
        public final /* synthetic */ ConfidentialVmSubscriptionEndedViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConfidentialVmSubscriptionEndedViewModel confidentialVmSubscriptionEndedViewModel, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.this$0 = confidentialVmSubscriptionEndedViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchVmRepository hatchVmRepository = HatchVmRepository.INSTANCE;
                ConfidentialVmSubscriptionEndedViewModel confidentialVmSubscriptionEndedViewModel = this.this$0;
                int i2 = ConfidentialVmSubscriptionEndedViewModel.$stable;
                AbstractC3358CGz abstractC3358CGz = confidentialVmSubscriptionEndedViewModel.userSession;
                VmFetchSource vmFetchSource = VmFetchSource.CVM_SUBSCRIPTION_ENDED_CONTINUE;
                this.label = 1;
                obj = hatchVmRepository.fetchAndCacheExistingVm(abstractC3358CGz, vmFetchSource, this);
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
        public final Object invoke(C3UX c3ux, HtJ<? super HatchVmRepository.FetchAndCacheLeasedVmResult> htJ) {
            return new AnonymousClass1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmSubscriptionEndedViewModel$onContinueClick$1$result$1(ConfidentialVmSubscriptionEndedViewModel confidentialVmSubscriptionEndedViewModel, HtJ<? super ConfidentialVmSubscriptionEndedViewModel$onContinueClick$1$result$1> htJ) {
        super(2, htJ);
        this.this$0 = confidentialVmSubscriptionEndedViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConfidentialVmSubscriptionEndedViewModel$onContinueClick$1$result$1(this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HwK hwK = HwK.A00;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            obj = GAo.A00(this, hwK, anonymousClass1);
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
    public final Object invoke(C3UX c3ux, HtJ<? super HatchVmRepository.FetchAndCacheLeasedVmResult> htJ) {
        return new ConfidentialVmSubscriptionEndedViewModel$onContinueClick$1$result$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
