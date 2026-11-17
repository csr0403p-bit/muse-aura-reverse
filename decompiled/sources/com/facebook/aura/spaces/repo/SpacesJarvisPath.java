package com.facebook.aura.spaces.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;

/* loaded from: classes3.dex */
public interface SpacesJarvisPath extends JarvisPath.Extension {

    public final class NavigationTabOrder implements SpacesJarvisPath {
        public static final NavigationTabOrder INSTANCE = new NavigationTabOrder();
        public static final String value = "api/navigation/tab-order";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigationTabOrder);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "NavigationTabOrder";
        }

        public int hashCode() {
            return 1946190937;
        }
    }

    public final class PeerSpaceExportHtml extends C06G implements SpacesJarvisPath {
        public final String encodedHostMuse;
        public final String encodedSpaceId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PeerSpaceExportHtml) {
                    PeerSpaceExportHtml peerSpaceExportHtml = (PeerSpaceExportHtml) obj;
                    if (!C7384Etj.areEqual(this.encodedHostMuse, peerSpaceExportHtml.encodedHostMuse) || !C7384Etj.areEqual(this.encodedSpaceId, peerSpaceExportHtml.encodedSpaceId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ PeerSpaceExportHtml copy$default(PeerSpaceExportHtml peerSpaceExportHtml, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = peerSpaceExportHtml.encodedHostMuse;
            }
            if ((i & 2) != 0) {
                str2 = peerSpaceExportHtml.encodedSpaceId;
            }
            AnonymousClass003.A0u(str, str2);
            return new PeerSpaceExportHtml(str, str2);
        }

        public final String component1() {
            return this.encodedHostMuse;
        }

        public final String component2() {
            return this.encodedSpaceId;
        }

        public final String getEncodedHostMuse() {
            return this.encodedHostMuse;
        }

        public final String getEncodedSpaceId() {
            return this.encodedSpaceId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0h("api/peer-spaces/by-id/", this.encodedHostMuse, CustomConnectorRegisterRepositoryKt.ROOT_PATH, this.encodedSpaceId, "/export.html");
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.encodedSpaceId, AnonymousClass001.A0G(this.encodedHostMuse));
        }

        public PeerSpaceExportHtml(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.encodedHostMuse = str;
            this.encodedSpaceId = str2;
        }

        public final PeerSpaceExportHtml copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new PeerSpaceExportHtml(str, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Space extends C06G implements SpacesJarvisPath {
        public final String encodedSlug;

        public Space(String str) {
            C7384Etj.A0Y(str, 0);
            this.encodedSlug = str;
        }

        public final Space copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Space(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Space) && C7384Etj.areEqual(this.encodedSlug, ((Space) obj).encodedSlug));
        }

        public static /* synthetic */ Space copy$default(Space space, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = space.encodedSlug;
            }
            C7384Etj.A0Y(str, 0);
            return new Space(str);
        }

        public final String component1() {
            return this.encodedSlug;
        }

        public final String getEncodedSlug() {
            return this.encodedSlug;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0M("spaces/", this.encodedSlug);
        }

        public int hashCode() {
            return this.encodedSlug.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class SpaceExportHtml extends C06G implements SpacesJarvisPath {
        public final String encodedSlug;

        public SpaceExportHtml(String str) {
            C7384Etj.A0Y(str, 0);
            this.encodedSlug = str;
        }

        public final SpaceExportHtml copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new SpaceExportHtml(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SpaceExportHtml) && C7384Etj.areEqual(this.encodedSlug, ((SpaceExportHtml) obj).encodedSlug));
        }

        public static /* synthetic */ SpaceExportHtml copy$default(SpaceExportHtml spaceExportHtml, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = spaceExportHtml.encodedSlug;
            }
            C7384Etj.A0Y(str, 0);
            return new SpaceExportHtml(str);
        }

        public final String component1() {
            return this.encodedSlug;
        }

        public final String getEncodedSlug() {
            return this.encodedSlug;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0U("spaces/", this.encodedSlug, "/export.html");
        }

        public int hashCode() {
            return this.encodedSlug.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class SpaceV2 extends C06G implements SpacesJarvisPath {
        public final String encodedId;

        public SpaceV2(String str) {
            C7384Etj.A0Y(str, 0);
            this.encodedId = str;
        }

        public final SpaceV2 copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new SpaceV2(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SpaceV2) && C7384Etj.areEqual(this.encodedId, ((SpaceV2) obj).encodedId));
        }

        public static /* synthetic */ SpaceV2 copy$default(SpaceV2 spaceV2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = spaceV2.encodedId;
            }
            C7384Etj.A0Y(str, 0);
            return new SpaceV2(str);
        }

        public final String component1() {
            return this.encodedId;
        }

        public final String getEncodedId() {
            return this.encodedId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0M("spaces/v2/", this.encodedId);
        }

        public int hashCode() {
            return this.encodedId.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class SpacesFavorites implements SpacesJarvisPath {
        public static final SpacesFavorites INSTANCE = new SpacesFavorites();
        public static final String value = "spaces/favorites";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SpacesFavorites);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SpacesFavorites";
        }

        public int hashCode() {
            return -477694274;
        }
    }

    public final class SpacesV2 implements SpacesJarvisPath {
        public static final SpacesV2 INSTANCE = new SpacesV2();
        public static final String value = "spaces/v2";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SpacesV2);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SpacesV2";
        }

        public int hashCode() {
            return 507680757;
        }
    }
}
