package com.facebook.aura.modellock;

import X.AbstractC7559F3s;
import com.facebook.aura.confidentialvm.session.ConfidentialSessionGate;
import com.facebook.aura.modellock.ModelLockRepository;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class ModelLockRepository$apply$initialRecord$2 extends AbstractC7559F3s implements Function0<ModelLockRepository.AppealRecord> {
    public final /* synthetic */ ModelLockRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModelLockRepository$apply$initialRecord$2(ModelLockRepository modelLockRepository) {
        super(0);
        this.this$0 = modelLockRepository;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ModelLockRepository.AppealRecord invoke() {
        return ConfidentialSessionGate.Companion.getInstance(this.this$0.userSession).isStandardVm() ? ModelLockRepository.AppealRecord.UNAVAILABLE : ModelLockRepository.AppealRecord.NONE;
    }
}
