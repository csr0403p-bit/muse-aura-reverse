package com.facebook.aura.library.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ArtifactSharingInfoJson extends C06G {
    public final List<ArtifactSharingRecipientJson> recipients;
    public final String share_url;
    public final String state;
    public final String viewer_permission;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, AbstractC5321DgF.A02(C79.A01, ArtifactSharingInfoJson$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<ArtifactSharingInfoJson> serializer() {
            return ArtifactSharingInfoJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArtifactSharingInfoJson) {
                ArtifactSharingInfoJson artifactSharingInfoJson = (ArtifactSharingInfoJson) obj;
                if (!C7384Etj.areEqual(this.state, artifactSharingInfoJson.state) || !C7384Etj.areEqual(this.share_url, artifactSharingInfoJson.share_url) || !C7384Etj.areEqual(this.recipients, artifactSharingInfoJson.recipients) || !C7384Etj.areEqual(this.viewer_permission, artifactSharingInfoJson.viewer_permission)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ArtifactSharingInfoJson copy$default(ArtifactSharingInfoJson artifactSharingInfoJson, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactSharingInfoJson.state;
        }
        if ((i & 2) != 0) {
            str2 = artifactSharingInfoJson.share_url;
        }
        if ((i & 4) != 0) {
            list = artifactSharingInfoJson.recipients;
        }
        if ((i & 8) != 0) {
            str3 = artifactSharingInfoJson.viewer_permission;
        }
        AnonymousClass003.A0v(str, list);
        return new ArtifactSharingInfoJson(str, str2, list, str3);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(ArtifactSharingInfoJson artifactSharingInfoJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"unknown".equals(artifactSharingInfoJson.state)) {
            c9j5.AAV(artifactSharingInfoJson.state, c9iZ, 0);
        }
        if (zAfR || artifactSharingInfoJson.share_url != null) {
            c9j5.AAP(artifactSharingInfoJson.share_url, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(artifactSharingInfoJson.recipients)) {
            c9j5.AAQ(artifactSharingInfoJson.recipients, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || artifactSharingInfoJson.viewer_permission != null) {
            c9j5.AAP(artifactSharingInfoJson.viewer_permission, C07779iq.A01, c9iZ, 3);
        }
    }

    public final String component1() {
        return this.state;
    }

    public final String component2() {
        return this.share_url;
    }

    public final List<ArtifactSharingRecipientJson> component3() {
        return this.recipients;
    }

    public final String component4() {
        return this.viewer_permission;
    }

    public final List<ArtifactSharingRecipientJson> getRecipients() {
        return this.recipients;
    }

    public final String getShare_url() {
        return this.share_url;
    }

    public final String getState() {
        return this.state;
    }

    public final String getViewer_permission() {
        return this.viewer_permission;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.recipients, (AnonymousClass001.A0G(this.state) + AnonymousClass006.A0G(this.share_url)) * 31) + AnonymousClass005.A0H(this.viewer_permission);
    }

    public final ArtifactSharingInfo toDomain() {
        String str = this.state;
        String str2 = this.share_url;
        List<ArtifactSharingRecipientJson> list = this.recipients;
        ArrayList arrayListA0h = C3cG.A0h();
        for (ArtifactSharingRecipientJson artifactSharingRecipientJson : list) {
            AnonymousClass006.A1F(artifactSharingRecipientJson.principal, artifactSharingRecipientJson, arrayListA0h);
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h);
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(((ArtifactSharingRecipientJson) it.next()).toDomain());
        }
        return new ArtifactSharingInfo(str, str2, arrayListA0i, ArtifactSharePermission.Companion.fromWire(this.viewer_permission));
    }

    public /* synthetic */ ArtifactSharingInfoJson(int i, String str, String str2, List list, String str3, C2hx c2hx) {
        this.state = (i & 1) == 0 ? "unknown" : str;
        if ((i & 2) == 0) {
            this.share_url = null;
        } else {
            this.share_url = str2;
        }
        if ((i & 4) == 0) {
            this.recipients = C0881AGi.A00;
        } else {
            this.recipients = list;
        }
        if ((i & 8) == 0) {
            this.viewer_permission = null;
        } else {
            this.viewer_permission = str3;
        }
    }

    public final ArtifactSharingInfoJson copy(String str, String str2, List<ArtifactSharingRecipientJson> list, String str3) {
        AnonymousClass003.A0v(str, list);
        return new ArtifactSharingInfoJson(str, str2, list, str3);
    }

    public String toString() {
        return super.toString();
    }

    public ArtifactSharingInfoJson(String str, String str2, List<ArtifactSharingRecipientJson> list, String str3) {
        AnonymousClass003.A0v(str, list);
        this.state = str;
        this.share_url = str2;
        this.recipients = list;
        this.viewer_permission = str3;
    }

    public /* synthetic */ ArtifactSharingInfoJson(String str, String str2, List list, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "unknown" : str, (i & 2) != 0 ? null : str2, C3cI.A12(list, i), (i & 8) != 0 ? null : str3);
    }

    public ArtifactSharingInfoJson() {
        this("unknown", null, C0881AGi.A00, null);
    }
}
