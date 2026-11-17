package com.facebook.aura.skills.viewmodel;

import X.AHD;
import X.AHI;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;

/* loaded from: classes3.dex */
public final class SkillPermissionsUiState extends C06G {
    public final boolean isResetting;
    public final SkillPermissionsLoadingState loadingState;
    public final AHD<SkillPermissionSectionUiModel> sections;
    public final String updatingMethodKey;
    public final ConnectorPermissionMode updatingMode;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SkillPermissionsUiState) {
                SkillPermissionsUiState skillPermissionsUiState = (SkillPermissionsUiState) obj;
                if (!C7384Etj.areEqual(this.sections, skillPermissionsUiState.sections) || this.loadingState != skillPermissionsUiState.loadingState || !C7384Etj.areEqual(this.updatingMethodKey, skillPermissionsUiState.updatingMethodKey) || this.updatingMode != skillPermissionsUiState.updatingMode || this.isResetting != skillPermissionsUiState.isResetting) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkillPermissionsUiState copy$default(SkillPermissionsUiState skillPermissionsUiState, AHD ahd, SkillPermissionsLoadingState skillPermissionsLoadingState, String str, ConnectorPermissionMode connectorPermissionMode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = skillPermissionsUiState.sections;
        }
        if ((i & 2) != 0) {
            skillPermissionsLoadingState = skillPermissionsUiState.loadingState;
        }
        if ((i & 4) != 0) {
            str = skillPermissionsUiState.updatingMethodKey;
        }
        if ((i & 8) != 0) {
            connectorPermissionMode = skillPermissionsUiState.updatingMode;
        }
        if ((i & 16) != 0) {
            z = skillPermissionsUiState.isResetting;
        }
        return skillPermissionsUiState.copy(ahd, skillPermissionsLoadingState, str, connectorPermissionMode, z);
    }

    public final AHD<SkillPermissionSectionUiModel> component1() {
        return this.sections;
    }

    public final SkillPermissionsLoadingState component2() {
        return this.loadingState;
    }

    public final String component3() {
        return this.updatingMethodKey;
    }

    public final ConnectorPermissionMode component4() {
        return this.updatingMode;
    }

    public final boolean component5() {
        return this.isResetting;
    }

    public final SkillPermissionsLoadingState getLoadingState() {
        return this.loadingState;
    }

    public final AHD<SkillPermissionSectionUiModel> getSections() {
        return this.sections;
    }

    public final String getUpdatingMethodKey() {
        return this.updatingMethodKey;
    }

    public final ConnectorPermissionMode getUpdatingMode() {
        return this.updatingMode;
    }

    public int hashCode() {
        return C0KA.A00((((AnonymousClass005.A0F(this.loadingState, AnonymousClass005.A0E(this.sections)) + AnonymousClass006.A0G(this.updatingMethodKey)) * 31) + C3cH.A02(this.updatingMode)) * 31, this.isResetting);
    }

    public final boolean isResetting() {
        return this.isResetting;
    }

    public SkillPermissionsUiState(AHD<SkillPermissionSectionUiModel> ahd, SkillPermissionsLoadingState skillPermissionsLoadingState, String str, ConnectorPermissionMode connectorPermissionMode, boolean z) {
        AnonymousClass003.A0u(ahd, skillPermissionsLoadingState);
        this.sections = ahd;
        this.loadingState = skillPermissionsLoadingState;
        this.updatingMethodKey = str;
        this.updatingMode = connectorPermissionMode;
        this.isResetting = z;
    }

    public final SkillPermissionsUiState copy(AHD<SkillPermissionSectionUiModel> ahd, SkillPermissionsLoadingState skillPermissionsLoadingState, String str, ConnectorPermissionMode connectorPermissionMode, boolean z) {
        AnonymousClass003.A0u(ahd, skillPermissionsLoadingState);
        return new SkillPermissionsUiState(ahd, skillPermissionsLoadingState, str, connectorPermissionMode, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SkillPermissionsUiState(AHD ahd, SkillPermissionsLoadingState skillPermissionsLoadingState, String str, ConnectorPermissionMode connectorPermissionMode, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? AHI.A01 : ahd, (i & 2) != 0 ? SkillPermissionsLoadingState.IDLE : skillPermissionsLoadingState, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : connectorPermissionMode, C3cI.A1S(i, z));
    }

    public SkillPermissionsUiState() {
        this(AHI.A01, SkillPermissionsLoadingState.IDLE, null, null, false);
    }
}
