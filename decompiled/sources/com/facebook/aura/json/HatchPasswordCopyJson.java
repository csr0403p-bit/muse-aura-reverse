package com.facebook.aura.json;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07839ix;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class HatchPasswordCopyJson extends C06G {
    public final Boolean has_own_password;
    public final Boolean is_f3;
    public final List<String> source_apps;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, HatchPasswordCopyJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<HatchPasswordCopyJson> serializer() {
            return HatchPasswordCopyJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchPasswordCopyJson(Boolean bool, Boolean bool2, List<String> list) {
        C7384Etj.A0Y(list, 2);
        this.is_f3 = bool;
        this.has_own_password = bool2;
        this.source_apps = list;
    }

    public final HatchPasswordCopyJson copy(Boolean bool, Boolean bool2, List<String> list) {
        C7384Etj.A0Y(list, 2);
        return new HatchPasswordCopyJson(bool, bool2, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchPasswordCopyJson) {
                HatchPasswordCopyJson hatchPasswordCopyJson = (HatchPasswordCopyJson) obj;
                if (!C7384Etj.areEqual(this.is_f3, hatchPasswordCopyJson.is_f3) || !C7384Etj.areEqual(this.has_own_password, hatchPasswordCopyJson.has_own_password) || !C7384Etj.areEqual(this.source_apps, hatchPasswordCopyJson.source_apps)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchPasswordCopyJson copy$default(HatchPasswordCopyJson hatchPasswordCopyJson, Boolean bool, Boolean bool2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = hatchPasswordCopyJson.is_f3;
        }
        if ((i & 2) != 0) {
            bool2 = hatchPasswordCopyJson.has_own_password;
        }
        if ((i & 4) != 0) {
            list = hatchPasswordCopyJson.source_apps;
        }
        return hatchPasswordCopyJson.copy(bool, bool2, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_json_json(HatchPasswordCopyJson hatchPasswordCopyJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchPasswordCopyJson.is_f3 != null) {
            c9j5.AAP(hatchPasswordCopyJson.is_f3, C07839ix.A00, c9iZ, 0);
        }
        if (zAfR || hatchPasswordCopyJson.has_own_password != null) {
            c9j5.AAP(hatchPasswordCopyJson.has_own_password, C07839ix.A00, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(hatchPasswordCopyJson.source_apps)) {
            c9j5.AAQ(hatchPasswordCopyJson.source_apps, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final Boolean component1() {
        return this.is_f3;
    }

    public final Boolean component2() {
        return this.has_own_password;
    }

    public final List<String> component3() {
        return this.source_apps;
    }

    public final Boolean getHas_own_password() {
        return this.has_own_password;
    }

    public final List<String> getSource_apps() {
        return this.source_apps;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.source_apps, ((AnonymousClass006.A0D(this.is_f3) * 31) + C3cH.A02(this.has_own_password)) * 31);
    }

    public final Boolean is_f3() {
        return this.is_f3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchPasswordCopyJson(int i, Boolean bool, Boolean bool2, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.is_f3 = null;
        } else {
            this.is_f3 = bool;
        }
        if ((i & 2) == 0) {
            this.has_own_password = null;
        } else {
            this.has_own_password = bool2;
        }
        if ((i & 4) == 0) {
            this.source_apps = C0881AGi.A00;
        } else {
            this.source_apps = list;
        }
    }

    public /* synthetic */ HatchPasswordCopyJson(Boolean bool, Boolean bool2, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, C3cI.A12(list, i));
    }

    public HatchPasswordCopyJson() {
        this(null, null, C0881AGi.A00);
    }
}
