package com.facebook.aura.modellock;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class ModelLockRepository$Companion$getInstance$1 extends AbstractC7559F3s implements Function0<ModelLockRepository> {
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModelLockRepository$Companion$getInstance$1(AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$userSession = abstractC3358CGz;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ModelLockRepository invoke() {
        return new ModelLockRepository(this.$userSession);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ModelLockRepository invoke() {
        return new ModelLockRepository(this.$userSession);
    }
}
