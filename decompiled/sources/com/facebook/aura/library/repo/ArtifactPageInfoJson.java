package com.facebook.aura.library.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class ArtifactPageInfoJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String end_cursor;
    public final boolean has_next_page;
    public final boolean has_previous_page;
    public final String start_cursor;

    public final class Companion {
        public final C9hr<ArtifactPageInfoJson> serializer() {
            return ArtifactPageInfoJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(ArtifactPageInfoJson artifactPageInfoJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || artifactPageInfoJson.has_next_page) {
            c9j5.AA7(c9iZ, 0, artifactPageInfoJson.has_next_page);
        }
        if (zAfR || artifactPageInfoJson.has_previous_page) {
            c9j5.AA7(c9iZ, 1, artifactPageInfoJson.has_previous_page);
        }
        if (zAfR || artifactPageInfoJson.start_cursor != null) {
            c9j5.AAP(artifactPageInfoJson.start_cursor, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || artifactPageInfoJson.end_cursor != null) {
            c9j5.AAP(artifactPageInfoJson.end_cursor, C07779iq.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArtifactPageInfoJson) {
                ArtifactPageInfoJson artifactPageInfoJson = (ArtifactPageInfoJson) obj;
                if (this.has_next_page != artifactPageInfoJson.has_next_page || this.has_previous_page != artifactPageInfoJson.has_previous_page || !C7384Etj.areEqual(this.start_cursor, artifactPageInfoJson.start_cursor) || !C7384Etj.areEqual(this.end_cursor, artifactPageInfoJson.end_cursor)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ArtifactPageInfoJson copy$default(ArtifactPageInfoJson artifactPageInfoJson, boolean z, boolean z2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = artifactPageInfoJson.has_next_page;
        }
        if ((i & 2) != 0) {
            z2 = artifactPageInfoJson.has_previous_page;
        }
        if ((i & 4) != 0) {
            str = artifactPageInfoJson.start_cursor;
        }
        if ((i & 8) != 0) {
            str2 = artifactPageInfoJson.end_cursor;
        }
        return new ArtifactPageInfoJson(z, z2, str, str2);
    }

    public final boolean component1() {
        return this.has_next_page;
    }

    public final boolean component2() {
        return this.has_previous_page;
    }

    public final String component3() {
        return this.start_cursor;
    }

    public final String component4() {
        return this.end_cursor;
    }

    public final ArtifactPageInfoJson copy(boolean z, boolean z2, String str, String str2) {
        return new ArtifactPageInfoJson(z, z2, str, str2);
    }

    public final String getEnd_cursor() {
        return this.end_cursor;
    }

    public final boolean getHas_next_page() {
        return this.has_next_page;
    }

    public final boolean getHas_previous_page() {
        return this.has_previous_page;
    }

    public final String getStart_cursor() {
        return this.start_cursor;
    }

    public int hashCode() {
        return ((C0KA.A01(C0KA.A02(this.has_next_page), this.has_previous_page) + AnonymousClass006.A0G(this.start_cursor)) * 31) + AnonymousClass005.A0H(this.end_cursor);
    }

    public ArtifactPageInfoJson(boolean z, boolean z2, String str, String str2) {
        this.has_next_page = z;
        this.has_previous_page = z2;
        this.start_cursor = str;
        this.end_cursor = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ArtifactPageInfoJson(boolean z, boolean z2, String str, String str2, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass001.A1Q(i, z2), (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }

    public /* synthetic */ ArtifactPageInfoJson(int i, boolean z, boolean z2, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.has_next_page = false;
        } else {
            this.has_next_page = z;
        }
        if ((i & 2) == 0) {
            this.has_previous_page = false;
        } else {
            this.has_previous_page = z2;
        }
        if ((i & 4) == 0) {
            this.start_cursor = null;
        } else {
            this.start_cursor = str;
        }
        if ((i & 8) == 0) {
            this.end_cursor = null;
        } else {
            this.end_cursor = str2;
        }
    }

    public ArtifactPageInfoJson() {
        this(false, false, null, null);
    }
}
