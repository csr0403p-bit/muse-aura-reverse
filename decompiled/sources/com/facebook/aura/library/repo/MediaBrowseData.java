package com.facebook.aura.library.repo;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class MediaBrowseData extends C06G {
    public final AHD<WorkspaceEntry> entries;
    public final WorkspaceBrowseError error;
    public final boolean isLoading;

    public MediaBrowseData(AHD<WorkspaceEntry> ahd, boolean z, WorkspaceBrowseError workspaceBrowseError) {
        C7384Etj.A0Y(ahd, 0);
        this.entries = ahd;
        this.isLoading = z;
        this.error = workspaceBrowseError;
    }

    public final MediaBrowseData copy(AHD<WorkspaceEntry> ahd, boolean z, WorkspaceBrowseError workspaceBrowseError) {
        C7384Etj.A0Y(ahd, 0);
        return new MediaBrowseData(ahd, z, workspaceBrowseError);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaBrowseData) {
                MediaBrowseData mediaBrowseData = (MediaBrowseData) obj;
                if (!C7384Etj.areEqual(this.entries, mediaBrowseData.entries) || this.isLoading != mediaBrowseData.isLoading || !C7384Etj.areEqual(this.error, mediaBrowseData.error)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MediaBrowseData copy$default(MediaBrowseData mediaBrowseData, AHD ahd, boolean z, WorkspaceBrowseError workspaceBrowseError, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = mediaBrowseData.entries;
        }
        if ((i & 2) != 0) {
            z = mediaBrowseData.isLoading;
        }
        if ((i & 4) != 0) {
            workspaceBrowseError = mediaBrowseData.error;
        }
        return mediaBrowseData.copy(ahd, z, workspaceBrowseError);
    }

    public final AHD<WorkspaceEntry> component1() {
        return this.entries;
    }

    public final boolean component2() {
        return this.isLoading;
    }

    public final WorkspaceBrowseError component3() {
        return this.error;
    }

    public final AHD<WorkspaceEntry> getEntries() {
        return this.entries;
    }

    public final WorkspaceBrowseError getError() {
        return this.error;
    }

    public int hashCode() {
        return C0KA.A01(AnonymousClass005.A0E(this.entries), this.isLoading) + AnonymousClass006.A0D(this.error);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MediaBrowseData(AHD ahd, boolean z, WorkspaceBrowseError workspaceBrowseError, int i, C06H c06h) {
        this((i & 1) != 0 ? AHI.A01 : ahd, AnonymousClass001.A1Q(i, z), (i & 4) != 0 ? null : workspaceBrowseError);
    }

    public MediaBrowseData() {
        this(AHI.A01, false, null);
    }
}
