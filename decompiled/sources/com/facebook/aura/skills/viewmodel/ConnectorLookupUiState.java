package com.facebook.aura.skills.viewmodel;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.skills.model.Skill;

/* loaded from: classes3.dex */
public final class ConnectorLookupUiState extends C06G {
    public final Skill connectedSkill;
    public final DirectSignInOutcome directSignInOutcome;
    public final boolean isLoading;
    public final Skill skill;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorLookupUiState) {
                ConnectorLookupUiState connectorLookupUiState = (ConnectorLookupUiState) obj;
                if (!C7384Etj.areEqual(this.skill, connectorLookupUiState.skill) || !C7384Etj.areEqual(this.connectedSkill, connectorLookupUiState.connectedSkill) || this.isLoading != connectorLookupUiState.isLoading || !C7384Etj.areEqual(this.directSignInOutcome, connectorLookupUiState.directSignInOutcome)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ConnectorLookupUiState(Skill skill, Skill skill2, boolean z, DirectSignInOutcome directSignInOutcome, int i, C06H c06h) {
        this((i & 1) != 0 ? null : skill, (i & 2) != 0 ? null : skill2, AnonymousClass005.A1O(i, z), (i & 8) != 0 ? null : directSignInOutcome);
    }

    public static /* synthetic */ ConnectorLookupUiState copy$default(ConnectorLookupUiState connectorLookupUiState, Skill skill, Skill skill2, boolean z, DirectSignInOutcome directSignInOutcome, int i, Object obj) {
        if ((i & 1) != 0) {
            skill = connectorLookupUiState.skill;
        }
        if ((i & 2) != 0) {
            skill2 = connectorLookupUiState.connectedSkill;
        }
        if ((i & 4) != 0) {
            z = connectorLookupUiState.isLoading;
        }
        if ((i & 8) != 0) {
            directSignInOutcome = connectorLookupUiState.directSignInOutcome;
        }
        return new ConnectorLookupUiState(skill, skill2, z, directSignInOutcome);
    }

    public final Skill component1() {
        return this.skill;
    }

    public final Skill component2() {
        return this.connectedSkill;
    }

    public final boolean component3() {
        return this.isLoading;
    }

    public final DirectSignInOutcome component4() {
        return this.directSignInOutcome;
    }

    public final ConnectorLookupUiState copy(Skill skill, Skill skill2, boolean z, DirectSignInOutcome directSignInOutcome) {
        return new ConnectorLookupUiState(skill, skill2, z, directSignInOutcome);
    }

    public final Skill getConnectedSkill() {
        return this.connectedSkill;
    }

    public final DirectSignInOutcome getDirectSignInOutcome() {
        return this.directSignInOutcome;
    }

    public final Skill getSkill() {
        return this.skill;
    }

    public int hashCode() {
        return C0KA.A01(((AnonymousClass006.A0D(this.skill) * 31) + AnonymousClass006.A0D(this.connectedSkill)) * 31, this.isLoading) + C3cH.A02(this.directSignInOutcome);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        return super.toString();
    }

    public ConnectorLookupUiState(Skill skill, Skill skill2, boolean z, DirectSignInOutcome directSignInOutcome) {
        this.skill = skill;
        this.connectedSkill = skill2;
        this.isLoading = z;
        this.directSignInOutcome = directSignInOutcome;
    }

    public ConnectorLookupUiState() {
        this(null, null, false, null);
    }
}
