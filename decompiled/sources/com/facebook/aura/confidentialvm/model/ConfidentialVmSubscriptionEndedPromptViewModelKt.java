package com.facebook.aura.confidentialvm.model;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BFM;
import androidx.activity.ComponentActivity;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedPromptViewModel;
import com.facebook.aura.session.LocalUserSessionKt;

/* loaded from: classes.dex */
public abstract class ConfidentialVmSubscriptionEndedPromptViewModelKt {
    public static final ConfidentialVmSubscriptionEndedPromptViewModel confidentialVmSubscriptionEndedPromptViewModel(BFM bfm, int i) {
        ConfidentialVmSubscriptionEndedPromptViewModel.Factory factory = new ConfidentialVmSubscriptionEndedPromptViewModel.Factory(AnonymousClass002.A0h(bfm));
        String strActivityViewModelKey = LocalUserSessionKt.activityViewModelKey(ConfidentialVmSubscriptionEndedPromptViewModel.class, ((Number) bfm.A6v(LocalUserSessionKt.LocalUserSessionGeneration)).longValue());
        ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
        return (ConfidentialVmSubscriptionEndedPromptViewModel) AnonymousClass003.A0Y(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), ConfidentialVmSubscriptionEndedPromptViewModel.class, strActivityViewModelKey);
    }
}
