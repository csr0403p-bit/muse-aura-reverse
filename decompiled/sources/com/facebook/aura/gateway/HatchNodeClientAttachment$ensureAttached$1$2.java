package com.facebook.aura.gateway;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import com.facebook.aura.confidentialvm.session.ConfidentialSessionGate;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchNodeClientAttachment$ensureAttached$1$2 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNodeClientAttachment$ensureAttached$1$2(AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$userSession = abstractC3358CGz;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(ConfidentialSessionGate.Companion.getInstance(this.$userSession).isConfidentialVm());
    }
}
