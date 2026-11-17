package com.facebook.aura.iap.iac;

import X.AGE;
import X.C3cG;
import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class IacSandboxSheetState {
    public static final int $stable = 0;
    public final MutableState cadenceSeconds$delegate;
    public final MutableState maxRenewals$delegate;
    public final MutableState outcomeIndex$delegate;

    public final int getCadenceSeconds() {
        return MutableState.A02(this.cadenceSeconds$delegate);
    }

    public final int getMaxRenewals() {
        return MutableState.A02(this.maxRenewals$delegate);
    }

    public final int getOutcomeIndex() {
        return MutableState.A02(this.outcomeIndex$delegate);
    }

    public final void setCadenceSeconds(int i) {
        MutableState.A07(i, this.cadenceSeconds$delegate);
    }

    public final void setMaxRenewals(int i) {
        MutableState.A07(i, this.maxRenewals$delegate);
    }

    public final void setOutcomeIndex(int i) {
        MutableState.A07(i, this.outcomeIndex$delegate);
    }

    public IacSandboxSheetState() {
        AGE age = AGE.A00;
        this.outcomeIndex$delegate = C3cG.A08(age, 0);
        this.cadenceSeconds$delegate = C3cG.A08(age, 2592000);
        this.maxRenewals$delegate = C3cG.A08(age, 120);
    }
}
