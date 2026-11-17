package com.facebook.aura.file.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ArtifactDeploySnapshot extends C06G {
    public final boolean edited;
    public final String publishedUrl;
    public final boolean unpublished;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArtifactDeploySnapshot) {
                ArtifactDeploySnapshot artifactDeploySnapshot = (ArtifactDeploySnapshot) obj;
                if (!C7384Etj.areEqual(this.publishedUrl, artifactDeploySnapshot.publishedUrl) || this.unpublished != artifactDeploySnapshot.unpublished || this.edited != artifactDeploySnapshot.edited) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ArtifactDeploySnapshot copy$default(ArtifactDeploySnapshot artifactDeploySnapshot, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactDeploySnapshot.publishedUrl;
        }
        if ((i & 2) != 0) {
            z = artifactDeploySnapshot.unpublished;
        }
        if ((i & 4) != 0) {
            z2 = artifactDeploySnapshot.edited;
        }
        return new ArtifactDeploySnapshot(str, z, z2);
    }

    public final String component1() {
        return this.publishedUrl;
    }

    public final boolean component2() {
        return this.unpublished;
    }

    public final boolean component3() {
        return this.edited;
    }

    public final ArtifactDeploySnapshot copy(String str, boolean z, boolean z2) {
        return new ArtifactDeploySnapshot(str, z, z2);
    }

    public final boolean getEdited() {
        return this.edited;
    }

    public final String getPublishedUrl() {
        return this.publishedUrl;
    }

    public final boolean getUnpublished() {
        return this.unpublished;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(AnonymousClass006.A0G(this.publishedUrl) * 31, this.unpublished), this.edited);
    }

    public ArtifactDeploySnapshot(String str, boolean z, boolean z2) {
        this.publishedUrl = str;
        this.unpublished = z;
        this.edited = z2;
    }

    public String toString() {
        return super.toString();
    }
}
