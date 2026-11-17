package com.facebook.aura.sharedcontent;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface ResolveResult {

    public final class Artifact extends C06G implements ResolveResult {
        public static final int $stable = 0;
        public final String displayName;
        public final String slug;
        public final String webViewUrl;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Artifact) {
                    Artifact artifact = (Artifact) obj;
                    if (!C7384Etj.areEqual(this.slug, artifact.slug) || !C7384Etj.areEqual(this.displayName, artifact.displayName) || !C7384Etj.areEqual(this.webViewUrl, artifact.webViewUrl)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Artifact copy$default(Artifact artifact, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = artifact.slug;
            }
            if ((i & 2) != 0) {
                str2 = artifact.displayName;
            }
            if ((i & 4) != 0) {
                str3 = artifact.webViewUrl;
            }
            return artifact.copy(str, str2, str3);
        }

        public final String component1() {
            return this.slug;
        }

        public final String component2() {
            return this.displayName;
        }

        public final String component3() {
            return this.webViewUrl;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final String getSlug() {
            return this.slug;
        }

        public final String getWebViewUrl() {
            return this.webViewUrl;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.webViewUrl, AnonymousClass005.A0I(this.displayName, AnonymousClass001.A0G(this.slug)));
        }

        public Artifact(String str, String str2, String str3) {
            AnonymousClass005.A0x(str, str2, str3);
            this.slug = str;
            this.displayName = str2;
            this.webViewUrl = str3;
        }

        public final Artifact copy(String str, String str2, String str3) {
            AnonymousClass005.A0x(str, str2, str3);
            return new Artifact(str, str2, str3);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Failed extends C06G implements ResolveResult {
        public static final int $stable = 0;
        public final String message;

        public Failed(String str) {
            C7384Etj.A0Y(str, 0);
            this.message = str;
        }

        public final Failed copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Failed(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Failed) && C7384Etj.areEqual(this.message, ((Failed) obj).message));
        }

        public static /* synthetic */ Failed copy$default(Failed failed, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failed.message;
            }
            C7384Etj.A0Y(str, 0);
            return new Failed(str);
        }

        public final String component1() {
            return this.message;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Invalid implements ResolveResult {
        public static final int $stable = 0;
        public static final Invalid INSTANCE = new Invalid();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Invalid);
        }

        public String toString() {
            return "Invalid";
        }

        public int hashCode() {
            return 769610728;
        }
    }

    public final class Space extends C06G implements ResolveResult {
        public static final int $stable = 0;
        public final String displayName;
        public final boolean injectIabHeader;
        public final String slug;
        public final String webViewUrl;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Space) {
                    Space space = (Space) obj;
                    if (!C7384Etj.areEqual(this.slug, space.slug) || !C7384Etj.areEqual(this.displayName, space.displayName) || !C7384Etj.areEqual(this.webViewUrl, space.webViewUrl) || this.injectIabHeader != space.injectIabHeader) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Space copy$default(Space space, String str, String str2, String str3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = space.slug;
            }
            if ((i & 2) != 0) {
                str2 = space.displayName;
            }
            if ((i & 4) != 0) {
                str3 = space.webViewUrl;
            }
            if ((i & 8) != 0) {
                z = space.injectIabHeader;
            }
            AnonymousClass005.A0x(str, str2, str3);
            return new Space(str, str2, str3, z);
        }

        public final String component1() {
            return this.slug;
        }

        public final String component2() {
            return this.displayName;
        }

        public final String component3() {
            return this.webViewUrl;
        }

        public final boolean component4() {
            return this.injectIabHeader;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final boolean getInjectIabHeader() {
            return this.injectIabHeader;
        }

        public final String getSlug() {
            return this.slug;
        }

        public final String getWebViewUrl() {
            return this.webViewUrl;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0I(this.webViewUrl, AnonymousClass005.A0I(this.displayName, AnonymousClass001.A0G(this.slug))), this.injectIabHeader);
        }

        public /* synthetic */ Space(String str, String str2, String str3, boolean z, int i, C06H c06h) {
            this(str, str2, str3, AnonymousClass005.A1P(i, z));
        }

        public final Space copy(String str, String str2, String str3, boolean z) {
            AnonymousClass005.A0x(str, str2, str3);
            return new Space(str, str2, str3, z);
        }

        public String toString() {
            return super.toString();
        }

        public Space(String str, String str2, String str3, boolean z) {
            AnonymousClass005.A0x(str, str2, str3);
            this.slug = str;
            this.displayName = str2;
            this.webViewUrl = str3;
            this.injectIabHeader = z;
        }
    }
}
