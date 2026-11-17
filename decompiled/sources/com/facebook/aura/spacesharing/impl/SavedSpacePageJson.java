package com.facebook.aura.spacesharing.impl;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class SavedSpacePageJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String end_cursor;
    public final boolean has_next_page;

    public final class Companion {
        public final C9hr<SavedSpacePageJson> serializer() {
            return SavedSpacePageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spacesharing_impl_impl(SavedSpacePageJson savedSpacePageJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AA7(c9iZ, 0, savedSpacePageJson.has_next_page);
        if (c9j5.AfR() || savedSpacePageJson.end_cursor != null) {
            c9j5.AAP(savedSpacePageJson.end_cursor, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SavedSpacePageJson) {
                SavedSpacePageJson savedSpacePageJson = (SavedSpacePageJson) obj;
                if (this.has_next_page != savedSpacePageJson.has_next_page || !C7384Etj.areEqual(this.end_cursor, savedSpacePageJson.end_cursor)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SavedSpacePageJson copy$default(SavedSpacePageJson savedSpacePageJson, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = savedSpacePageJson.has_next_page;
        }
        if ((i & 2) != 0) {
            str = savedSpacePageJson.end_cursor;
        }
        return new SavedSpacePageJson(z, str);
    }

    public final boolean component1() {
        return this.has_next_page;
    }

    public final String component2() {
        return this.end_cursor;
    }

    public final SavedSpacePageJson copy(boolean z, String str) {
        return new SavedSpacePageJson(z, str);
    }

    public final String getEnd_cursor() {
        return this.end_cursor;
    }

    public final boolean getHas_next_page() {
        return this.has_next_page;
    }

    public int hashCode() {
        return C0KA.A02(this.has_next_page) + AnonymousClass006.A0G(this.end_cursor);
    }

    public SavedSpacePageJson(boolean z, String str) {
        this.has_next_page = z;
        this.end_cursor = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SavedSpacePageJson(int i, boolean z, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(SavedSpacePageJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.has_next_page = z;
        this.end_cursor = (i & 2) == 0 ? null : str;
    }

    public /* synthetic */ SavedSpacePageJson(boolean z, String str, int i, C06H c06h) {
        this(z, AnonymousClass006.A0s(i, str));
    }
}
