package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PublishArtifactSheetKey extends C06G implements AuraBottomSheetNavKey {
    public final String fileName;
    public final boolean hasPendingChangesHint;
    public final String initialDeployedUrl;
    public final String sourcePath;
    public final HatchSurface surface;
    public final String url;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, PublishArtifactSheetKey$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<PublishArtifactSheetKey> serializer() {
            return PublishArtifactSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PublishArtifactSheetKey) {
                PublishArtifactSheetKey publishArtifactSheetKey = (PublishArtifactSheetKey) obj;
                if (!C7384Etj.areEqual(this.url, publishArtifactSheetKey.url) || !C7384Etj.areEqual(this.fileName, publishArtifactSheetKey.fileName) || !C7384Etj.areEqual(this.sourcePath, publishArtifactSheetKey.sourcePath) || !C7384Etj.areEqual(this.initialDeployedUrl, publishArtifactSheetKey.initialDeployedUrl) || this.hasPendingChangesHint != publishArtifactSheetKey.hasPendingChangesHint || this.surface != publishArtifactSheetKey.surface) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ PublishArtifactSheetKey(int i, String str, String str2, String str3, String str4, boolean z, HatchSurface hatchSurface, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(PublishArtifactSheetKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.url = str;
        this.fileName = str2;
        if ((i & 4) == 0) {
            this.sourcePath = null;
        } else {
            this.sourcePath = str3;
        }
        if ((i & 8) == 0) {
            this.initialDeployedUrl = null;
        } else {
            this.initialDeployedUrl = str4;
        }
        if ((i & 16) == 0) {
            this.hasPendingChangesHint = false;
        } else {
            this.hasPendingChangesHint = z;
        }
        if ((i & 32) == 0) {
            this.surface = HatchSurface.CHAT;
        } else {
            this.surface = hatchSurface;
        }
    }

    public static /* synthetic */ PublishArtifactSheetKey copy$default(PublishArtifactSheetKey publishArtifactSheetKey, String str, String str2, String str3, String str4, boolean z, HatchSurface hatchSurface, int i, Object obj) {
        if ((i & 1) != 0) {
            str = publishArtifactSheetKey.url;
        }
        if ((i & 2) != 0) {
            str2 = publishArtifactSheetKey.fileName;
        }
        if ((i & 4) != 0) {
            str3 = publishArtifactSheetKey.sourcePath;
        }
        if ((i & 8) != 0) {
            str4 = publishArtifactSheetKey.initialDeployedUrl;
        }
        if ((i & 16) != 0) {
            z = publishArtifactSheetKey.hasPendingChangesHint;
        }
        if ((i & 32) != 0) {
            hatchSurface = publishArtifactSheetKey.surface;
        }
        return publishArtifactSheetKey.copy(str, str2, str3, str4, z, hatchSurface);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(PublishArtifactSheetKey publishArtifactSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(publishArtifactSheetKey.url, c9iZ, 0);
        c9j5.AAV(publishArtifactSheetKey.fileName, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || publishArtifactSheetKey.sourcePath != null) {
            c9j5.AAP(publishArtifactSheetKey.sourcePath, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || publishArtifactSheetKey.initialDeployedUrl != null) {
            c9j5.AAP(publishArtifactSheetKey.initialDeployedUrl, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || publishArtifactSheetKey.hasPendingChangesHint) {
            c9j5.AA7(c9iZ, 4, publishArtifactSheetKey.hasPendingChangesHint);
        }
        if (zAfR || publishArtifactSheetKey.surface != HatchSurface.CHAT) {
            c9j5.AAQ(publishArtifactSheetKey.surface, C3cH.A15(f0cArr, 5), c9iZ, 5);
        }
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.fileName;
    }

    public final String component3() {
        return this.sourcePath;
    }

    public final String component4() {
        return this.initialDeployedUrl;
    }

    public final boolean component5() {
        return this.hasPendingChangesHint;
    }

    public final HatchSurface component6() {
        return this.surface;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final boolean getHasPendingChangesHint() {
        return this.hasPendingChangesHint;
    }

    public final String getInitialDeployedUrl() {
        return this.initialDeployedUrl;
    }

    public final String getSourcePath() {
        return this.sourcePath;
    }

    public final HatchSurface getSurface() {
        return this.surface;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.surface, C0KA.A01((((AnonymousClass005.A0I(this.fileName, AnonymousClass001.A0G(this.url)) + AnonymousClass006.A0G(this.sourcePath)) * 31) + AnonymousClass005.A0H(this.initialDeployedUrl)) * 31, this.hasPendingChangesHint));
    }

    public final PublishArtifactSheetKey copy(String str, String str2, String str3, String str4, boolean z, HatchSurface hatchSurface) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(hatchSurface, 5);
        return new PublishArtifactSheetKey(str, str2, str3, str4, z, hatchSurface);
    }

    public String toString() {
        return super.toString();
    }

    public PublishArtifactSheetKey(String str, String str2, String str3, String str4, boolean z, HatchSurface hatchSurface) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(hatchSurface, 5);
        this.url = str;
        this.fileName = str2;
        this.sourcePath = str3;
        this.initialDeployedUrl = str4;
        this.hasPendingChangesHint = z;
        this.surface = hatchSurface;
    }

    public /* synthetic */ PublishArtifactSheetKey(String str, String str2, String str3, String str4, boolean z, HatchSurface hatchSurface, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, AnonymousClass005.A1Q(i, z), (i & 32) != 0 ? HatchSurface.CHAT : hatchSurface);
    }
}
