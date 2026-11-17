package com.facebook.aura.shopping.repo;

import X.AnonymousClass001;
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
/* loaded from: classes4.dex */
public final class SavedStateResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String item_id;
    public final boolean saved;

    public final class Companion {
        public final C9hr<SavedStateResponseJson> serializer() {
            return SavedStateResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(SavedStateResponseJson savedStateResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || savedStateResponseJson.saved) {
            c9j5.AA7(c9iZ, 0, savedStateResponseJson.saved);
        }
        if (zAfR || savedStateResponseJson.item_id != null) {
            c9j5.AAP(savedStateResponseJson.item_id, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SavedStateResponseJson) {
                SavedStateResponseJson savedStateResponseJson = (SavedStateResponseJson) obj;
                if (this.saved != savedStateResponseJson.saved || !C7384Etj.areEqual(this.item_id, savedStateResponseJson.item_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SavedStateResponseJson copy$default(SavedStateResponseJson savedStateResponseJson, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = savedStateResponseJson.saved;
        }
        if ((i & 2) != 0) {
            str = savedStateResponseJson.item_id;
        }
        return new SavedStateResponseJson(z, str);
    }

    public final boolean component1() {
        return this.saved;
    }

    public final String component2() {
        return this.item_id;
    }

    public final SavedStateResponseJson copy(boolean z, String str) {
        return new SavedStateResponseJson(z, str);
    }

    public final String getItem_id() {
        return this.item_id;
    }

    public final boolean getSaved() {
        return this.saved;
    }

    public int hashCode() {
        return C0KA.A02(this.saved) + AnonymousClass006.A0G(this.item_id);
    }

    public SavedStateResponseJson(boolean z, String str) {
        this.saved = z;
        this.item_id = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SavedStateResponseJson(int i, boolean z, String str, C2hx c2hx) {
        this.saved = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.item_id = null;
        } else {
            this.item_id = str;
        }
    }

    public /* synthetic */ SavedStateResponseJson(boolean z, String str, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass006.A0s(i, str));
    }

    public SavedStateResponseJson() {
        this(false, null);
    }
}
