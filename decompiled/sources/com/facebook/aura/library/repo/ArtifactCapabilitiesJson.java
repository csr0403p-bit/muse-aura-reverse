package com.facebook.aura.library.repo;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ArtifactCapabilitiesJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean can_delete;
    public final boolean can_download_html;
    public final boolean can_open;
    public final boolean can_pin;
    public final boolean can_rename;
    public final boolean can_share;

    public final class Companion {
        public final C9hr<ArtifactCapabilitiesJson> serializer() {
            return ArtifactCapabilitiesJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ ArtifactCapabilitiesJson copy$default(ArtifactCapabilitiesJson artifactCapabilitiesJson, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, Object obj) {
        boolean z7 = z;
        boolean z8 = z2;
        boolean z9 = z3;
        boolean z10 = z4;
        boolean z11 = z5;
        boolean z12 = z6;
        if ((i & 1) != 0) {
            z7 = artifactCapabilitiesJson.can_open;
        }
        if ((i & 2) != 0) {
            z8 = artifactCapabilitiesJson.can_pin;
        }
        if ((i & 4) != 0) {
            z9 = artifactCapabilitiesJson.can_delete;
        }
        if ((i & 8) != 0) {
            z10 = artifactCapabilitiesJson.can_rename;
        }
        if ((i & 16) != 0) {
            z11 = artifactCapabilitiesJson.can_share;
        }
        if ((i & 32) != 0) {
            z12 = artifactCapabilitiesJson.can_download_html;
        }
        return new ArtifactCapabilitiesJson(z7, z8, z9, z10, z11, z12);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(ArtifactCapabilitiesJson artifactCapabilitiesJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || artifactCapabilitiesJson.can_open) {
            c9j5.AA7(c9iZ, 0, artifactCapabilitiesJson.can_open);
        }
        if (zAfR || artifactCapabilitiesJson.can_pin) {
            c9j5.AA7(c9iZ, 1, artifactCapabilitiesJson.can_pin);
        }
        if (zAfR || artifactCapabilitiesJson.can_delete) {
            c9j5.AA7(c9iZ, 2, artifactCapabilitiesJson.can_delete);
        }
        if (zAfR || artifactCapabilitiesJson.can_rename) {
            c9j5.AA7(c9iZ, 3, artifactCapabilitiesJson.can_rename);
        }
        if (zAfR || artifactCapabilitiesJson.can_share) {
            c9j5.AA7(c9iZ, 4, artifactCapabilitiesJson.can_share);
        }
        if (zAfR || artifactCapabilitiesJson.can_download_html) {
            c9j5.AA7(c9iZ, 5, artifactCapabilitiesJson.can_download_html);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArtifactCapabilitiesJson) {
                ArtifactCapabilitiesJson artifactCapabilitiesJson = (ArtifactCapabilitiesJson) obj;
                if (this.can_open != artifactCapabilitiesJson.can_open || this.can_pin != artifactCapabilitiesJson.can_pin || this.can_delete != artifactCapabilitiesJson.can_delete || this.can_rename != artifactCapabilitiesJson.can_rename || this.can_share != artifactCapabilitiesJson.can_share || this.can_download_html != artifactCapabilitiesJson.can_download_html) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean component1() {
        return this.can_open;
    }

    public final boolean component2() {
        return this.can_pin;
    }

    public final boolean component3() {
        return this.can_delete;
    }

    public final boolean component4() {
        return this.can_rename;
    }

    public final boolean component5() {
        return this.can_share;
    }

    public final boolean component6() {
        return this.can_download_html;
    }

    public final ArtifactCapabilitiesJson copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        return new ArtifactCapabilitiesJson(z, z2, z3, z4, z5, z6);
    }

    public final boolean getCan_delete() {
        return this.can_delete;
    }

    public final boolean getCan_download_html() {
        return this.can_download_html;
    }

    public final boolean getCan_open() {
        return this.can_open;
    }

    public final boolean getCan_pin() {
        return this.can_pin;
    }

    public final boolean getCan_rename() {
        return this.can_rename;
    }

    public final boolean getCan_share() {
        return this.can_share;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A02(this.can_open), this.can_pin), this.can_delete), this.can_rename), this.can_share), this.can_download_html);
    }

    public ArtifactCapabilitiesJson(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.can_open = z;
        this.can_pin = z2;
        this.can_delete = z3;
        this.can_rename = z4;
        this.can_share = z5;
        this.can_download_html = z6;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ArtifactCapabilitiesJson(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass001.A1Q(i, z2), AnonymousClass005.A1O(i, z3), AnonymousClass005.A1P(i, z4), AnonymousClass005.A1Q(i, z5), AnonymousClass002.A1R(i, z6));
    }

    public /* synthetic */ ArtifactCapabilitiesJson(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.can_open = false;
        } else {
            this.can_open = z;
        }
        if ((i & 2) == 0) {
            this.can_pin = false;
        } else {
            this.can_pin = z2;
        }
        if ((i & 4) == 0) {
            this.can_delete = false;
        } else {
            this.can_delete = z3;
        }
        if ((i & 8) == 0) {
            this.can_rename = false;
        } else {
            this.can_rename = z4;
        }
        if ((i & 16) == 0) {
            this.can_share = false;
        } else {
            this.can_share = z5;
        }
        if ((i & 32) == 0) {
            this.can_download_html = false;
        } else {
            this.can_download_html = z6;
        }
    }

    public ArtifactCapabilitiesJson() {
        this(false, false, false, false, false, false);
    }
}
