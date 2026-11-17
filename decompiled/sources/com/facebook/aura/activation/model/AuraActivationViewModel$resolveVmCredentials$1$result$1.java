package com.facebook.aura.activation.model;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.components.reactions.AuraScatterKt;
import com.facebook.aura.gateway.HatchVmRepository;
import com.facebook.aura.gateway.HatchlingVmType;
import com.facebook.aura.gateway.VmFetchSource;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.activation.model.AuraActivationViewModel$resolveVmCredentials$1$result$1", f = "AuraActivationViewModel.kt", l = {748, AuraScatterKt.SCATTER_TOTAL_MS}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class AuraActivationViewModel$resolveVmCredentials$1$result$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchVmRepository.FetchAndCacheLeasedVmResult>, Object> {
    public final /* synthetic */ Boolean $hasProvisionedVm;
    public final /* synthetic */ HatchlingVmType $vmTypeAtAttemptStart;
    public int label;
    public final /* synthetic */ AuraActivationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraActivationViewModel$resolveVmCredentials$1$result$1(Boolean bool, AuraActivationViewModel auraActivationViewModel, HatchlingVmType hatchlingVmType, HtJ<? super AuraActivationViewModel$resolveVmCredentials$1$result$1> htJ) {
        super(2, htJ);
        this.$hasProvisionedVm = bool;
        this.this$0 = auraActivationViewModel;
        this.$vmTypeAtAttemptStart = hatchlingVmType;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraActivationViewModel$resolveVmCredentials$1$result$1(this.$hasProvisionedVm, this.this$0, this.$vmTypeAtAttemptStart, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$hasProvisionedVm.booleanValue()) {
                HatchVmRepository hatchVmRepository = HatchVmRepository.INSTANCE;
                AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
                VmFetchSource vmFetchSource = VmFetchSource.ACTIVATION;
                this.label = 1;
                obj = hatchVmRepository.fetchAndCacheExistingVm(abstractC3358CGz, vmFetchSource, this);
            } else {
                AuraActivationViewModel auraActivationViewModel = this.this$0;
                HatchlingVmType hatchlingVmType = this.$vmTypeAtAttemptStart;
                this.label = 2;
                obj = auraActivationViewModel.leaseVmWithRetries(hatchlingVmType, this);
            }
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1 && i != 2) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HatchVmRepository.FetchAndCacheLeasedVmResult> htJ) {
        return ((AuraActivationViewModel$resolveVmCredentials$1$result$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
