package com.facebook.aura.login.nativeflow;

import X.AbstractC10544Hqx;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BV5;
import X.C3cG;
import X.C6684EPx;
import X.EC6;
import X.EQ8;
import X.EQD;
import X.EQI;
import X.EQN;
import X.FGI;
import X.HaC;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class NativeLoginAccountResolver$readWhatsAppAccount$credentials$1 extends AbstractC7559F3s implements Function0<EQ8> {
    public final /* synthetic */ EQN $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginAccountResolver$readWhatsAppAccount$credentials$1(EQN eqn) {
        super(0);
        this.$result = eqn;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final EQ8 invoke() throws EQI {
        EC6<EQ8> ec6 = ((C6684EPx) this.$result).A00;
        Integer num = EQD.A00.get();
        if (num == null || num.intValue() != 2) {
            throw new EQI(FGI.A0M("PurposeEnforcementViolation: ", AnonymousClass001.A0v(". All calls to unwrapSensitiveValueFor() should be enclosed within PolicyZone enclosure and specified with the same policyid that this object was wrapped with", C3cG.A0f(num, "Invalid policyId ="))));
        }
        AbstractC10544Hqx abstractC10544Hqx = (AbstractC10544Hqx) BV5.A0f(HaC.A00, 2);
        if (abstractC10544Hqx == null || !abstractC10544Hqx.A00.contains("HATCH_SSO_WA_AUTH_BUNDLE")) {
            throw new EQI(FGI.A0M("PurposeEnforcementViolation: ", FGI.A0M("Purpose policy does not allow data to be extracted for purpose ", "HATCH_SSO_WA_AUTH_BUNDLE")));
        }
        return ec6.A00;
    }
}
