package com.facebook.aura.pairs;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import X.C7BY;

/* loaded from: classes3.dex */
public final class ConnectionsRuleEditorUiState extends C06G {
    public static final int $stable = ConnectionsSharingRule.$stable;
    public final String description;
    public final boolean hasConflict;
    public final boolean isBusy;
    public final boolean isNew;
    public final boolean needsConfirmation;
    public final ConnectionsRuleEditorPhase phase;
    public final String savedDescription;
    public final ConnectionsSharingRule savedVersion;
    public final String summary;
    public final String title;

    public ConnectionsRuleEditorUiState(ConnectionsRuleEditorPhase connectionsRuleEditorPhase, boolean z, String str, String str2, String str3, String str4, boolean z2, boolean z3, boolean z4, ConnectionsSharingRule connectionsSharingRule) {
        C7384Etj.A0Y(connectionsRuleEditorPhase, 0);
        AnonymousClass005.A16(str, str2, str3, str4, 2);
        this.phase = connectionsRuleEditorPhase;
        this.isNew = z;
        this.title = str;
        this.summary = str2;
        this.description = str3;
        this.savedDescription = str4;
        this.needsConfirmation = z2;
        this.isBusy = z3;
        this.hasConflict = z4;
        this.savedVersion = connectionsSharingRule;
    }

    public final ConnectionsRuleEditorUiState copy(ConnectionsRuleEditorPhase connectionsRuleEditorPhase, boolean z, String str, String str2, String str3, String str4, boolean z2, boolean z3, boolean z4, ConnectionsSharingRule connectionsSharingRule) {
        C7384Etj.A0Y(connectionsRuleEditorPhase, 0);
        AnonymousClass005.A16(str, str2, str3, str4, 2);
        return new ConnectionsRuleEditorUiState(connectionsRuleEditorPhase, z, str, str2, str3, str4, z2, z3, z4, connectionsSharingRule);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectionsRuleEditorUiState) {
                ConnectionsRuleEditorUiState connectionsRuleEditorUiState = (ConnectionsRuleEditorUiState) obj;
                if (this.phase != connectionsRuleEditorUiState.phase || this.isNew != connectionsRuleEditorUiState.isNew || !C7384Etj.areEqual(this.title, connectionsRuleEditorUiState.title) || !C7384Etj.areEqual(this.summary, connectionsRuleEditorUiState.summary) || !C7384Etj.areEqual(this.description, connectionsRuleEditorUiState.description) || !C7384Etj.areEqual(this.savedDescription, connectionsRuleEditorUiState.savedDescription) || this.needsConfirmation != connectionsRuleEditorUiState.needsConfirmation || this.isBusy != connectionsRuleEditorUiState.isBusy || this.hasConflict != connectionsRuleEditorUiState.hasConflict || !C7384Etj.areEqual(this.savedVersion, connectionsRuleEditorUiState.savedVersion)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectionsRuleEditorUiState copy$default(ConnectionsRuleEditorUiState connectionsRuleEditorUiState, ConnectionsRuleEditorPhase connectionsRuleEditorPhase, boolean z, String str, String str2, String str3, String str4, boolean z2, boolean z3, boolean z4, ConnectionsSharingRule connectionsSharingRule, int i, Object obj) {
        if ((i & 1) != 0) {
            connectionsRuleEditorPhase = connectionsRuleEditorUiState.phase;
        }
        if ((i & 2) != 0) {
            z = connectionsRuleEditorUiState.isNew;
        }
        if ((i & 4) != 0) {
            str = connectionsRuleEditorUiState.title;
        }
        if ((i & 8) != 0) {
            str2 = connectionsRuleEditorUiState.summary;
        }
        if ((i & 16) != 0) {
            str3 = connectionsRuleEditorUiState.description;
        }
        if ((i & 32) != 0) {
            str4 = connectionsRuleEditorUiState.savedDescription;
        }
        if ((i & 64) != 0) {
            z2 = connectionsRuleEditorUiState.needsConfirmation;
        }
        if ((i & 128) != 0) {
            z3 = connectionsRuleEditorUiState.isBusy;
        }
        if ((i & 256) != 0) {
            z4 = connectionsRuleEditorUiState.hasConflict;
        }
        if ((i & 512) != 0) {
            connectionsSharingRule = connectionsRuleEditorUiState.savedVersion;
        }
        return connectionsRuleEditorUiState.copy(connectionsRuleEditorPhase, z, str, str2, str3, str4, z2, z3, z4, connectionsSharingRule);
    }

    public final ConnectionsRuleEditorPhase component1() {
        return this.phase;
    }

    public final ConnectionsSharingRule component10() {
        return this.savedVersion;
    }

    public final boolean component2() {
        return this.isNew;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.summary;
    }

    public final String component5() {
        return this.description;
    }

    public final String component6() {
        return this.savedDescription;
    }

    public final boolean component7() {
        return this.needsConfirmation;
    }

    public final boolean component8() {
        return this.isBusy;
    }

    public final boolean component9() {
        return this.hasConflict;
    }

    public final boolean getCanSave() {
        if (this.phase != ConnectionsRuleEditorPhase.READY || this.isBusy || C7BY.A0j(this.description) || C7BY.A0k(this.description, (char) 0)) {
            return false;
        }
        return this.isNew || this.needsConfirmation || !C7384Etj.areEqual(this.description, this.savedDescription);
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getHasConflict() {
        return this.hasConflict;
    }

    public final boolean getNeedsConfirmation() {
        return this.needsConfirmation;
    }

    public final ConnectionsRuleEditorPhase getPhase() {
        return this.phase;
    }

    public final String getSavedDescription() {
        return this.savedDescription;
    }

    public final ConnectionsSharingRule getSavedVersion() {
        return this.savedVersion;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.savedDescription, AnonymousClass005.A0I(this.description, AnonymousClass005.A0I(this.summary, AnonymousClass005.A0I(this.title, C0KA.A01(AnonymousClass005.A0E(this.phase), this.isNew))))), this.needsConfirmation), this.isBusy), this.hasConflict) + AnonymousClass006.A0D(this.savedVersion);
    }

    public final boolean isBusy() {
        return this.isBusy;
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectionsRuleEditorUiState(ConnectionsRuleEditorPhase connectionsRuleEditorPhase, boolean z, String str, String str2, String str3, String str4, boolean z2, boolean z3, boolean z4, ConnectionsSharingRule connectionsSharingRule, int i, C06H c06h) {
        this((i & 1) != 0 ? ConnectionsRuleEditorPhase.LOADING : connectionsRuleEditorPhase, z, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? null : connectionsSharingRule);
    }
}
