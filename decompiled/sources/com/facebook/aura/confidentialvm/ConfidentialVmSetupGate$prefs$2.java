package com.facebook.aura.confidentialvm;

import X.AbstractC7559F3s;
import X.C4oT;
import X.CH0;
import com.facebook.aura.common.prefs.AuraUserPrefStore;
import com.facebook.aura.common.prefs.AuraUserPrefs;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ConfidentialVmSetupGate$prefs$2 extends AbstractC7559F3s implements Function0<C4oT> {
    public final /* synthetic */ ConfidentialVmSetupGate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmSetupGate$prefs$2(ConfidentialVmSetupGate confidentialVmSetupGate) {
        super(0);
        this.this$0 = confidentialVmSetupGate;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C4oT invoke() {
        return AuraUserPrefs.INSTANCE.get(((CH0) this.this$0.userSession).A01, AuraUserPrefStore.CONFIDENTIAL_VM_SETUP);
    }
}
