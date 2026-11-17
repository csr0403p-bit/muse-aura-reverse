package com.facebook.aura.spacesharing.impl;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C8j4;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class SavedSpaceTargetJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String kind;
    public final String shortcode;

    public final class Companion {
        public final C9hr<SavedSpaceTargetJson> serializer() {
            return SavedSpaceTargetJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SavedSpaceTargetJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.kind = str;
        this.shortcode = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spacesharing_impl_impl(SavedSpaceTargetJson savedSpaceTargetJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(savedSpaceTargetJson.kind, c9iZ, 0);
        if (c9j5.AfR() || savedSpaceTargetJson.shortcode != null) {
            c9j5.AAP(savedSpaceTargetJson.shortcode, C07779iq.A01, c9iZ, 1);
        }
    }

    public final SavedSpaceTargetJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new SavedSpaceTargetJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SavedSpaceTargetJson) {
                SavedSpaceTargetJson savedSpaceTargetJson = (SavedSpaceTargetJson) obj;
                if (!C7384Etj.areEqual(this.kind, savedSpaceTargetJson.kind) || !C7384Etj.areEqual(this.shortcode, savedSpaceTargetJson.shortcode)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SavedSpaceTargetJson copy$default(SavedSpaceTargetJson savedSpaceTargetJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savedSpaceTargetJson.kind;
        }
        if ((i & 2) != 0) {
            str2 = savedSpaceTargetJson.shortcode;
        }
        C7384Etj.A0Y(str, 0);
        return new SavedSpaceTargetJson(str, str2);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.shortcode;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getShortcode() {
        return this.shortcode;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.kind) + AnonymousClass006.A0G(this.shortcode);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SavedSpaceTargetJson(int i, String str, String str2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(SavedSpaceTargetJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.kind = str;
        this.shortcode = C8j4.A0t(i, str2);
    }

    public /* synthetic */ SavedSpaceTargetJson(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }
}
