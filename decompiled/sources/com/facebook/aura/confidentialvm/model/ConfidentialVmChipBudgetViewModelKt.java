package com.facebook.aura.confidentialvm.model;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BFM;
import androidx.activity.ComponentActivity;
import com.facebook.aura.confidentialvm.model.ConfidentialVmChipBudgetViewModel;
import com.facebook.aura.session.LocalUserSessionKt;

/* loaded from: classes.dex */
public abstract class ConfidentialVmChipBudgetViewModelKt {
    public static final ConfidentialVmChipBudgetViewModel confidentialVmChipBudgetViewModel(BFM bfm, int i) {
        ConfidentialVmChipBudgetViewModel.Factory factory = new ConfidentialVmChipBudgetViewModel.Factory(AnonymousClass002.A0h(bfm));
        String strActivityViewModelKey = LocalUserSessionKt.activityViewModelKey(ConfidentialVmChipBudgetViewModel.class, ((Number) bfm.A6v(LocalUserSessionKt.LocalUserSessionGeneration)).longValue());
        ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
        return (ConfidentialVmChipBudgetViewModel) AnonymousClass003.A0Y(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), ConfidentialVmChipBudgetViewModel.class, strActivityViewModelKey);
    }
}
