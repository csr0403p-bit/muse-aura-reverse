package com.facebook.aura.library.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes.dex */
public final class ArtifactSharingInfo extends C06G {
    public final List<ArtifactSharingRecipient> recipients;
    public final String shareUrl;
    public final String state;
    public final ArtifactSharePermission viewerPermission;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArtifactSharingInfo) {
                ArtifactSharingInfo artifactSharingInfo = (ArtifactSharingInfo) obj;
                if (!C7384Etj.areEqual(this.state, artifactSharingInfo.state) || !C7384Etj.areEqual(this.shareUrl, artifactSharingInfo.shareUrl) || !C7384Etj.areEqual(this.recipients, artifactSharingInfo.recipients) || this.viewerPermission != artifactSharingInfo.viewerPermission) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ArtifactSharingInfo copy$default(ArtifactSharingInfo artifactSharingInfo, String str, String str2, List list, ArtifactSharePermission artifactSharePermission, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactSharingInfo.state;
        }
        if ((i & 2) != 0) {
            str2 = artifactSharingInfo.shareUrl;
        }
        if ((i & 4) != 0) {
            list = artifactSharingInfo.recipients;
        }
        if ((i & 8) != 0) {
            artifactSharePermission = artifactSharingInfo.viewerPermission;
        }
        AnonymousClass003.A0v(str, list);
        return new ArtifactSharingInfo(str, str2, list, artifactSharePermission);
    }

    public final String component1() {
        return this.state;
    }

    public final String component2() {
        return this.shareUrl;
    }

    public final List<ArtifactSharingRecipient> component3() {
        return this.recipients;
    }

    public final ArtifactSharePermission component4() {
        return this.viewerPermission;
    }

    public final List<ArtifactSharingRecipient> getRecipients() {
        return this.recipients;
    }

    public final String getShareUrl() {
        return this.shareUrl;
    }

    public final String getState() {
        return this.state;
    }

    public final ArtifactSharePermission getViewerPermission() {
        return this.viewerPermission;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.recipients, (AnonymousClass001.A0G(this.state) + AnonymousClass006.A0G(this.shareUrl)) * 31) + C06G.A04(this.viewerPermission);
    }

    public ArtifactSharingInfo(String str, String str2, List<ArtifactSharingRecipient> list, ArtifactSharePermission artifactSharePermission) {
        AnonymousClass003.A0v(str, list);
        this.state = str;
        this.shareUrl = str2;
        this.recipients = list;
        this.viewerPermission = artifactSharePermission;
    }

    public final ArtifactSharingInfo copy(String str, String str2, List<ArtifactSharingRecipient> list, ArtifactSharePermission artifactSharePermission) {
        AnonymousClass003.A0v(str, list);
        return new ArtifactSharingInfo(str, str2, list, artifactSharePermission);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ArtifactSharingInfo(String str, String str2, List list, ArtifactSharePermission artifactSharePermission, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? C0881AGi.A00 : list, (i & 8) != 0 ? null : artifactSharePermission);
    }
}
