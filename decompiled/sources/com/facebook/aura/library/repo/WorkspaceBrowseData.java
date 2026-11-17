package com.facebook.aura.library.repo;

import X.AHD;
import X.AHI;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class WorkspaceBrowseData extends C06G {
    public final String currentPath;
    public final AHD<WorkspaceEntry> entries;
    public final WorkspaceBrowseError error;
    public final boolean isLoading;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WorkspaceBrowseData) {
                WorkspaceBrowseData workspaceBrowseData = (WorkspaceBrowseData) obj;
                if (!C7384Etj.areEqual(this.entries, workspaceBrowseData.entries) || !C7384Etj.areEqual(this.currentPath, workspaceBrowseData.currentPath) || this.isLoading != workspaceBrowseData.isLoading || !C7384Etj.areEqual(this.error, workspaceBrowseData.error)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ WorkspaceBrowseData(AHD ahd, String str, boolean z, WorkspaceBrowseError workspaceBrowseError, int i, C06H c06h) {
        this((i & 1) != 0 ? AHI.A01 : ahd, (i & 2) != 0 ? "" : str, AnonymousClass005.A1O(i, z), (i & 8) != 0 ? null : workspaceBrowseError);
    }

    public static /* synthetic */ WorkspaceBrowseData copy$default(WorkspaceBrowseData workspaceBrowseData, AHD ahd, String str, boolean z, WorkspaceBrowseError workspaceBrowseError, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = workspaceBrowseData.entries;
        }
        if ((i & 2) != 0) {
            str = workspaceBrowseData.currentPath;
        }
        if ((i & 4) != 0) {
            z = workspaceBrowseData.isLoading;
        }
        if ((i & 8) != 0) {
            workspaceBrowseError = workspaceBrowseData.error;
        }
        AnonymousClass003.A0u(ahd, str);
        return new WorkspaceBrowseData(ahd, str, z, workspaceBrowseError);
    }

    public final AHD<WorkspaceEntry> component1() {
        return this.entries;
    }

    public final String component2() {
        return this.currentPath;
    }

    public final boolean component3() {
        return this.isLoading;
    }

    public final WorkspaceBrowseError component4() {
        return this.error;
    }

    public final String getCurrentPath() {
        return this.currentPath;
    }

    public final AHD<WorkspaceEntry> getEntries() {
        return this.entries;
    }

    public final WorkspaceBrowseError getError() {
        return this.error;
    }

    public int hashCode() {
        return C0KA.A01(AnonymousClass005.A0I(this.currentPath, AnonymousClass005.A0E(this.entries)), this.isLoading) + AnonymousClass006.A0D(this.error);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final WorkspaceBrowseData copy(AHD<WorkspaceEntry> ahd, String str, boolean z, WorkspaceBrowseError workspaceBrowseError) {
        AnonymousClass003.A0u(ahd, str);
        return new WorkspaceBrowseData(ahd, str, z, workspaceBrowseError);
    }

    public String toString() {
        return super.toString();
    }

    public WorkspaceBrowseData(AHD<WorkspaceEntry> ahd, String str, boolean z, WorkspaceBrowseError workspaceBrowseError) {
        AnonymousClass003.A0u(ahd, str);
        this.entries = ahd;
        this.currentPath = str;
        this.isLoading = z;
        this.error = workspaceBrowseError;
    }

    public WorkspaceBrowseData() {
        this(AHI.A01, "", false, null);
    }
}
