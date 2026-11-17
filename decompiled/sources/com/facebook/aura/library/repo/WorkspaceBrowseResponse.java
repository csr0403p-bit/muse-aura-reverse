package com.facebook.aura.library.repo;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class WorkspaceBrowseResponse extends C06G {
    public final AHD<WorkspaceEntry> entries;
    public final String path;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WorkspaceBrowseResponse) {
                WorkspaceBrowseResponse workspaceBrowseResponse = (WorkspaceBrowseResponse) obj;
                if (!C7384Etj.areEqual(this.path, workspaceBrowseResponse.path) || !C7384Etj.areEqual(this.entries, workspaceBrowseResponse.entries)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WorkspaceBrowseResponse copy$default(WorkspaceBrowseResponse workspaceBrowseResponse, String str, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            str = workspaceBrowseResponse.path;
        }
        if ((i & 2) != 0) {
            ahd = workspaceBrowseResponse.entries;
        }
        AnonymousClass003.A0u(str, ahd);
        return new WorkspaceBrowseResponse(str, ahd);
    }

    public final String component1() {
        return this.path;
    }

    public final AHD<WorkspaceEntry> component2() {
        return this.entries;
    }

    public final AHD<WorkspaceEntry> getEntries() {
        return this.entries;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.entries, AnonymousClass001.A0G(this.path));
    }

    public WorkspaceBrowseResponse(String str, AHD<WorkspaceEntry> ahd) {
        AnonymousClass003.A0u(str, ahd);
        this.path = str;
        this.entries = ahd;
    }

    public final WorkspaceBrowseResponse copy(String str, AHD<WorkspaceEntry> ahd) {
        AnonymousClass003.A0u(str, ahd);
        return new WorkspaceBrowseResponse(str, ahd);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ WorkspaceBrowseResponse(String str, AHD ahd, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? AHI.A01 : ahd);
    }

    public WorkspaceBrowseResponse() {
        this("", AHI.A01);
    }
}
