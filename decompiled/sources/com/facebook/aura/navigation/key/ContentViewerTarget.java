package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C79;
import X.C9dz;
import X.C9hq;
import X.C9hr;
import X.C9iI;
import X.C9uG;
import X.F0C;
import X.F60;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public interface ContentViewerTarget {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Serializable
    public final class Artifact extends C06G implements ContentViewerTarget {
        public static final Companion Companion = new Companion();
        public final String path;

        public final class Companion {
            public final C9hr<Artifact> serializer() {
                return ContentViewerTarget$Artifact$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Artifact) && C7384Etj.areEqual(this.path, ((Artifact) obj).path));
        }

        public /* synthetic */ Artifact(int i, String str, C2hx c2hx) {
            if (1 != (i & 1)) {
                C9iI.A00(ContentViewerTarget$Artifact$$serializer.descriptor, i, 1);
                throw F60.createAndThrow();
            }
            this.path = str;
        }

        public static /* synthetic */ Artifact copy$default(Artifact artifact, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = artifact.path;
            }
            return new Artifact(str);
        }

        public final String component1() {
            return this.path;
        }

        public final Artifact copy(String str) {
            return new Artifact(str);
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            return AnonymousClass006.A0G(this.path);
        }

        public String toString() {
            return super.toString();
        }

        public Artifact(String str) {
            this.path = str;
        }
    }

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final C9hr<ContentViewerTarget> serializer() {
            return new C9hq("com.facebook.aura.navigation.key.ContentViewerTarget", C3cG.A0x(ContentViewerTarget.class), new Annotation[0], new C9uG[]{C3cG.A0x(Artifact.class), C3cG.A0x(Media.class)}, new C9hr[]{ContentViewerTarget$Artifact$$serializer.INSTANCE, new C9dz(Media.INSTANCE, "com.facebook.aura.navigation.key.ContentViewerTarget.Media", new Annotation[0])});
        }
    }

    @Serializable
    /* loaded from: classes.dex */
    public final class Media implements ContentViewerTarget {
        public static final Media INSTANCE = new Media();
        public static final /* synthetic */ F0C<C9hr<Object>> $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, AnonymousClass1.INSTANCE);

        /* renamed from: com.facebook.aura.navigation.key.ContentViewerTarget$Media$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return new C9dz(Media.INSTANCE, "com.facebook.aura.navigation.key.ContentViewerTarget.Media", new Annotation[0]);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Media);
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12($cachedSerializer$delegate);
        }

        public final C9hr<Media> serializer() {
            return AnonymousClass001.A12($cachedSerializer$delegate);
        }

        public String toString() {
            return "Media";
        }

        public int hashCode() {
            return 1470895481;
        }
    }
}
