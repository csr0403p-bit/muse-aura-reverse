package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C9hq;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9uG;
import X.F60;
import java.lang.annotation.Annotation;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public interface HatchShareDownloadTarget {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Serializable
    public final class Artifact extends C06G implements HatchShareDownloadTarget {
        public static final Companion Companion = new Companion();
        public final String fileName;
        public final String sourcePath;

        public final class Companion {
            public final C9hr<Artifact> serializer() {
                return HatchShareDownloadTarget$Artifact$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(Artifact artifact, C9j5 c9j5, C9iZ c9iZ) {
            c9j5.AAV(artifact.sourcePath, c9iZ, 0);
            c9j5.AAV(artifact.fileName, c9iZ, 1);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Artifact) {
                    Artifact artifact = (Artifact) obj;
                    if (!C7384Etj.areEqual(this.sourcePath, artifact.sourcePath) || !C7384Etj.areEqual(this.fileName, artifact.fileName)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Artifact copy$default(Artifact artifact, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = artifact.sourcePath;
            }
            if ((i & 2) != 0) {
                str2 = artifact.fileName;
            }
            AnonymousClass003.A0u(str, str2);
            return new Artifact(str, str2);
        }

        public final String component1() {
            return this.sourcePath;
        }

        public final String component2() {
            return this.fileName;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final String getSourcePath() {
            return this.sourcePath;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.fileName, AnonymousClass001.A0G(this.sourcePath));
        }

        public Artifact(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.sourcePath = str;
            this.fileName = str2;
        }

        public final Artifact copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new Artifact(str, str2);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Artifact(int i, String str, String str2, C2hx c2hx) {
            if (3 != (i & 3)) {
                C9iI.A00(HatchShareDownloadTarget$Artifact$$serializer.descriptor, i, 3);
                throw F60.createAndThrow();
            }
            this.sourcePath = str;
            this.fileName = str2;
        }
    }

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final C9hr<HatchShareDownloadTarget> serializer() {
            return new C9hq("com.facebook.aura.navigation.key.HatchShareDownloadTarget", C3cG.A0x(HatchShareDownloadTarget.class), new Annotation[0], new C9uG[]{C3cG.A0x(Artifact.class), C3cG.A0x(Media.class), C3cG.A0x(Space.class)}, new C9hr[]{HatchShareDownloadTarget$Artifact$$serializer.INSTANCE, HatchShareDownloadTarget$Media$$serializer.INSTANCE, HatchShareDownloadTarget$Space$$serializer.INSTANCE});
        }
    }

    @Serializable
    /* loaded from: classes.dex */
    public final class Media extends C06G implements HatchShareDownloadTarget {
        public static final Companion Companion = new Companion();
        public final String uri;

        public final class Companion {
            public final C9hr<Media> serializer() {
                return HatchShareDownloadTarget$Media$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public final Media copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Media(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Media) && C7384Etj.areEqual(this.uri, ((Media) obj).uri));
        }

        public /* synthetic */ Media(int i, String str, C2hx c2hx) {
            if (1 != (i & 1)) {
                C9iI.A00(HatchShareDownloadTarget$Media$$serializer.descriptor, i, 1);
                throw F60.createAndThrow();
            }
            this.uri = str;
        }

        public static /* synthetic */ Media copy$default(Media media, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = media.uri;
            }
            C7384Etj.A0Y(str, 0);
            return new Media(str);
        }

        public final String component1() {
            return this.uri;
        }

        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.uri.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        public Media(String str) {
            C7384Etj.A0Y(str, 0);
            this.uri = str;
        }
    }

    @Serializable
    public final class Space extends C06G implements HatchShareDownloadTarget {
        public static final Companion Companion = new Companion();
        public final String slug;
        public final String title;

        public final class Companion {
            public final C9hr<Space> serializer() {
                return HatchShareDownloadTarget$Space$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public Space(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            this.slug = str;
            this.title = str2;
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(Space space, C9j5 c9j5, C9iZ c9iZ) {
            c9j5.AAV(space.slug, c9iZ, 0);
            c9j5.AAP(space.title, C07779iq.A01, c9iZ, 1);
        }

        public final Space copy(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            return new Space(str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Space) {
                    Space space = (Space) obj;
                    if (!C7384Etj.areEqual(this.slug, space.slug) || !C7384Etj.areEqual(this.title, space.title)) {
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
                str2 = space.title;
            }
            C7384Etj.A0Y(str, 0);
            return new Space(str, str2);
        }

        public final String component1() {
            return this.slug;
        }

        public final String component2() {
            return this.title;
        }

        public final String getSlug() {
            return this.slug;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return AnonymousClass001.A0G(this.slug) + AnonymousClass006.A0G(this.title);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Space(int i, String str, String str2, C2hx c2hx) {
            if (3 != (i & 3)) {
                C9iI.A00(HatchShareDownloadTarget$Space$$serializer.descriptor, i, 3);
                throw F60.createAndThrow();
            }
            this.slug = str;
            this.title = str2;
        }
    }
}
