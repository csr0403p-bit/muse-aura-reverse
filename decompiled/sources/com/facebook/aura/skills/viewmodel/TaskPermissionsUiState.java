package com.facebook.aura.skills.viewmodel;

import X.AHD;
import X.AHI;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.repo.TaskPermissions;

/* loaded from: classes3.dex */
public final class TaskPermissionsUiState extends C06G {
    public final AHD<Skill> connectedConnectors;
    public final SkillPermissionsLoadingState loadingState;
    public final TaskPermissions permissions;
    public final String revokingWebsiteId;
    public final String updatingMethodKey;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TaskPermissionsUiState) {
                TaskPermissionsUiState taskPermissionsUiState = (TaskPermissionsUiState) obj;
                if (!C7384Etj.areEqual(this.permissions, taskPermissionsUiState.permissions) || !C7384Etj.areEqual(this.connectedConnectors, taskPermissionsUiState.connectedConnectors) || this.loadingState != taskPermissionsUiState.loadingState || !C7384Etj.areEqual(this.updatingMethodKey, taskPermissionsUiState.updatingMethodKey) || !C7384Etj.areEqual(this.revokingWebsiteId, taskPermissionsUiState.revokingWebsiteId)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaskPermissionsUiState copy$default(TaskPermissionsUiState taskPermissionsUiState, TaskPermissions taskPermissions, AHD ahd, SkillPermissionsLoadingState skillPermissionsLoadingState, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            taskPermissions = taskPermissionsUiState.permissions;
        }
        if ((i & 2) != 0) {
            ahd = taskPermissionsUiState.connectedConnectors;
        }
        if ((i & 4) != 0) {
            skillPermissionsLoadingState = taskPermissionsUiState.loadingState;
        }
        if ((i & 8) != 0) {
            str = taskPermissionsUiState.updatingMethodKey;
        }
        if ((i & 16) != 0) {
            str2 = taskPermissionsUiState.revokingWebsiteId;
        }
        return taskPermissionsUiState.copy(taskPermissions, ahd, skillPermissionsLoadingState, str, str2);
    }

    public final TaskPermissions component1() {
        return this.permissions;
    }

    public final AHD<Skill> component2() {
        return this.connectedConnectors;
    }

    public final SkillPermissionsLoadingState component3() {
        return this.loadingState;
    }

    public final String component4() {
        return this.updatingMethodKey;
    }

    public final String component5() {
        return this.revokingWebsiteId;
    }

    public final AHD<Skill> getConnectedConnectors() {
        return this.connectedConnectors;
    }

    public final SkillPermissionsLoadingState getLoadingState() {
        return this.loadingState;
    }

    public final TaskPermissions getPermissions() {
        return this.permissions;
    }

    public final String getRevokingWebsiteId() {
        return this.revokingWebsiteId;
    }

    public final String getUpdatingMethodKey() {
        return this.updatingMethodKey;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.loadingState, AnonymousClass005.A0F(this.connectedConnectors, AnonymousClass006.A0D(this.permissions) * 31)) + AnonymousClass006.A0G(this.updatingMethodKey)) * 31) + AnonymousClass005.A0H(this.revokingWebsiteId);
    }

    public final boolean isBusy() {
        SkillPermissionsLoadingState skillPermissionsLoadingState = this.loadingState;
        return skillPermissionsLoadingState == SkillPermissionsLoadingState.LOADING || skillPermissionsLoadingState == SkillPermissionsLoadingState.ERROR || this.updatingMethodKey != null || this.revokingWebsiteId != null;
    }

    public TaskPermissionsUiState(TaskPermissions taskPermissions, AHD<Skill> ahd, SkillPermissionsLoadingState skillPermissionsLoadingState, String str, String str2) {
        AnonymousClass003.A0x(ahd, skillPermissionsLoadingState);
        this.permissions = taskPermissions;
        this.connectedConnectors = ahd;
        this.loadingState = skillPermissionsLoadingState;
        this.updatingMethodKey = str;
        this.revokingWebsiteId = str2;
    }

    public final TaskPermissionsUiState copy(TaskPermissions taskPermissions, AHD<Skill> ahd, SkillPermissionsLoadingState skillPermissionsLoadingState, String str, String str2) {
        AnonymousClass003.A0x(ahd, skillPermissionsLoadingState);
        return new TaskPermissionsUiState(taskPermissions, ahd, skillPermissionsLoadingState, str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TaskPermissionsUiState(TaskPermissions taskPermissions, AHD ahd, SkillPermissionsLoadingState skillPermissionsLoadingState, String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : taskPermissions, (i & 2) != 0 ? AHI.A01 : ahd, (i & 4) != 0 ? SkillPermissionsLoadingState.IDLE : skillPermissionsLoadingState, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2);
    }

    public TaskPermissionsUiState() {
        this(null, AHI.A01, SkillPermissionsLoadingState.IDLE, null, null);
    }
}
