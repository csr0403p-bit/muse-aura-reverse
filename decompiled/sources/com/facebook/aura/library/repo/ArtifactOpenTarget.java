package com.facebook.aura.library.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes.dex */
public interface ArtifactOpenTarget {

    public final class File extends C06G implements ArtifactOpenTarget {
        public final String path;

        public File(String str) {
            C7384Etj.A0Y(str, 0);
            this.path = str;
        }

        public final File copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new File(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof File) && C7384Etj.areEqual(this.path, ((File) obj).path));
        }

        public static /* synthetic */ File copy$default(File file, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = file.path;
            }
            C7384Etj.A0Y(str, 0);
            return new File(str);
        }

        public final String component1() {
            return this.path;
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            return this.path.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class PeerSpace extends C06G implements ArtifactOpenTarget {
        public final String hostMuse;
        public final String path;
        public final String slug;
        public final String spaceId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PeerSpace) {
                    PeerSpace peerSpace = (PeerSpace) obj;
                    if (!C7384Etj.areEqual(this.hostMuse, peerSpace.hostMuse) || !C7384Etj.areEqual(this.spaceId, peerSpace.spaceId) || !C7384Etj.areEqual(this.slug, peerSpace.slug) || !C7384Etj.areEqual(this.path, peerSpace.path)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ PeerSpace copy$default(PeerSpace peerSpace, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = peerSpace.hostMuse;
            }
            if ((i & 2) != 0) {
                str2 = peerSpace.spaceId;
            }
            if ((i & 4) != 0) {
                str3 = peerSpace.slug;
            }
            if ((i & 8) != 0) {
                str4 = peerSpace.path;
            }
            AnonymousClass005.A0y(str, str2, str4);
            return new PeerSpace(str, str2, str3, str4);
        }

        public final String component1() {
            return this.hostMuse;
        }

        public final String component2() {
            return this.spaceId;
        }

        public final String component3() {
            return this.slug;
        }

        public final String component4() {
            return this.path;
        }

        public final String getHostMuse() {
            return this.hostMuse;
        }

        public final String getItemKey() {
            return FGI.A0U(this.hostMuse, ":", this.spaceId);
        }

        public final String getPath() {
            return this.path;
        }

        public final String getSlug() {
            return this.slug;
        }

        public final String getSpaceId() {
            return this.spaceId;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.path, (AnonymousClass005.A0I(this.spaceId, AnonymousClass001.A0G(this.hostMuse)) + AnonymousClass006.A0G(this.slug)) * 31);
        }

        public PeerSpace(String str, String str2, String str3, String str4) {
            AnonymousClass005.A0y(str, str2, str4);
            this.hostMuse = str;
            this.spaceId = str2;
            this.slug = str3;
            this.path = str4;
        }

        public final PeerSpace copy(String str, String str2, String str3, String str4) {
            AnonymousClass005.A0y(str, str2, str4);
            return new PeerSpace(str, str2, str3, str4);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class SavedSpace extends C06G implements ArtifactOpenTarget {
        public final String originalPath;
        public final String shortcode;

        public SavedSpace(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            this.shortcode = str;
            this.originalPath = str2;
        }

        public final SavedSpace copy(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            return new SavedSpace(str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof SavedSpace) {
                    SavedSpace savedSpace = (SavedSpace) obj;
                    if (!C7384Etj.areEqual(this.shortcode, savedSpace.shortcode) || !C7384Etj.areEqual(this.originalPath, savedSpace.originalPath)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ SavedSpace copy$default(SavedSpace savedSpace, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = savedSpace.shortcode;
            }
            if ((i & 2) != 0) {
                str2 = savedSpace.originalPath;
            }
            C7384Etj.A0Y(str, 0);
            return new SavedSpace(str, str2);
        }

        public final String component1() {
            return this.shortcode;
        }

        public final String component2() {
            return this.originalPath;
        }

        public final String getOriginalPath() {
            return this.originalPath;
        }

        public final String getShortcode() {
            return this.shortcode;
        }

        public int hashCode() {
            return AnonymousClass001.A0G(this.shortcode) + AnonymousClass006.A0G(this.originalPath);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ SavedSpace(String str, String str2, int i, C06H c06h) {
            this(str, AnonymousClass006.A0s(i, str2));
        }
    }

    public final class Space extends C06G implements ArtifactOpenTarget {
        public final String originalPath;
        public final String slug;

        public Space(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            this.slug = str;
            this.originalPath = str2;
        }

        public final Space copy(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            return new Space(str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Space) {
                    Space space = (Space) obj;
                    if (!C7384Etj.areEqual(this.slug, space.slug) || !C7384Etj.areEqual(this.originalPath, space.originalPath)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Space copy$default(Space space, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = space.slug;
            }
            if ((i & 2) != 0) {
                str2 = space.originalPath;
            }
            C7384Etj.A0Y(str, 0);
            return new Space(str, str2);
        }

        public final String component1() {
            return this.slug;
        }

        public final String component2() {
            return this.originalPath;
        }

        public final String getOriginalPath() {
            return this.originalPath;
        }

        public final String getSlug() {
            return this.slug;
        }

        public int hashCode() {
            return AnonymousClass001.A0G(this.slug) + AnonymousClass006.A0G(this.originalPath);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Space(String str, String str2, int i, C06H c06h) {
            this(str, AnonymousClass006.A0s(i, str2));
        }
    }
}
