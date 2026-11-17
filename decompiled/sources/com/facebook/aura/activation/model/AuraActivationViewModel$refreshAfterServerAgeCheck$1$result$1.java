package com.facebook.aura.activation.model;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.wearables.linking.MC;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.aura.user.repo.AuraUserRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.activation.model.AuraActivationViewModel$refreshAfterServerAgeCheck$1$result$1", f = "AuraActivationViewModel.kt", l = {MC.android_lobster_wearables_v2.__CONFIG__}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class AuraActivationViewModel$refreshAfterServerAgeCheck$1$result$1 extends AbstractC07127nr implements G0U<HtJ<? super AuraUserData>, Object> {
    public int label;
    public final /* synthetic */ AuraActivationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraActivationViewModel$refreshAfterServerAgeCheck$1$result$1(AuraActivationViewModel auraActivationViewModel, HtJ<? super AuraActivationViewModel$refreshAfterServerAgeCheck$1$result$1> htJ) {
        super(1, htJ);
        this.this$0 = auraActivationViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new AuraActivationViewModel$refreshAfterServerAgeCheck$1$result$1(this.this$0, htJ);
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super AuraUserData> htJ) {
        return new AuraActivationViewModel$refreshAfterServerAgeCheck$1$result$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AuraUserRepository auraUserRepository = this.this$0.userRepository;
            this.label = 1;
            obj = auraUserRepository.fetchUser(false, this);
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
