package com.facebook.aura.spaces.preload;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SpacesShareResultJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String error;
    public final String id;

    public final class Companion {
        public final C9hr<SpacesShareResultJson> serializer() {
            return SpacesShareResultJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SpacesShareResultJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.id = str;
        this.error = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_preload_preload(SpacesShareResultJson spacesShareResultJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(spacesShareResultJson.id, c9iZ, 0);
        if (c9j5.AfR() || spacesShareResultJson.error != null) {
            c9j5.AAP(spacesShareResultJson.error, C07779iq.A01, c9iZ, 1);
        }
    }

    public final SpacesShareResultJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new SpacesShareResultJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpacesShareResultJson) {
                SpacesShareResultJson spacesShareResultJson = (SpacesShareResultJson) obj;
                if (!C7384Etj.areEqual(this.id, spacesShareResultJson.id) || !C7384Etj.areEqual(this.error, spacesShareResultJson.error)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SpacesShareResultJson copy$default(SpacesShareResultJson spacesShareResultJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spacesShareResultJson.id;
        }
        if ((i & 2) != 0) {
            str2 = spacesShareResultJson.error;
        }
        C7384Etj.A0Y(str, 0);
        return new SpacesShareResultJson(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.error;
    }

    public final String getError() {
        return this.error;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.id) + AnonymousClass006.A0G(this.error);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SpacesShareResultJson(int i, String str, String str2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(SpacesShareResultJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.error = (i & 2) == 0 ? null : str2;
    }

    public /* synthetic */ SpacesShareResultJson(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }
}
