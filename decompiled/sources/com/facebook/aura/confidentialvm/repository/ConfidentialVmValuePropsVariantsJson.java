package com.facebook.aura.confidentialvm.repository;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ConfidentialVmValuePropsVariantsJson extends C06G {
    public static final Companion Companion = new Companion();
    public final ConfidentialVmValuePropsVariantJson subscribe;

    /* renamed from: switch, reason: not valid java name */
    public final ConfidentialVmValuePropsVariantJson f19switch;
    public final ConfidentialVmValuePropsVariantJson try_it;
    public final ConfidentialVmValuePropsVariantJson waitlist;

    public final class Companion {
        public final C9hr<ConfidentialVmValuePropsVariantsJson> serializer() {
            return ConfidentialVmValuePropsVariantsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ConfidentialVmValuePropsVariantsJson() {
        this(null, null, null, null);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_repository_repository(ConfidentialVmValuePropsVariantsJson confidentialVmValuePropsVariantsJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || confidentialVmValuePropsVariantsJson.waitlist != null) {
            c9j5.AAP(confidentialVmValuePropsVariantsJson.waitlist, ConfidentialVmValuePropsVariantJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || confidentialVmValuePropsVariantsJson.try_it != null) {
            c9j5.AAP(confidentialVmValuePropsVariantsJson.try_it, ConfidentialVmValuePropsVariantJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || confidentialVmValuePropsVariantsJson.subscribe != null) {
            c9j5.AAP(confidentialVmValuePropsVariantsJson.subscribe, ConfidentialVmValuePropsVariantJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || confidentialVmValuePropsVariantsJson.f19switch != null) {
            c9j5.AAP(confidentialVmValuePropsVariantsJson.f19switch, ConfidentialVmValuePropsVariantJson$$serializer.INSTANCE, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmValuePropsVariantsJson) {
                ConfidentialVmValuePropsVariantsJson confidentialVmValuePropsVariantsJson = (ConfidentialVmValuePropsVariantsJson) obj;
                if (!C7384Etj.areEqual(this.waitlist, confidentialVmValuePropsVariantsJson.waitlist) || !C7384Etj.areEqual(this.try_it, confidentialVmValuePropsVariantsJson.try_it) || !C7384Etj.areEqual(this.subscribe, confidentialVmValuePropsVariantsJson.subscribe) || !C7384Etj.areEqual(this.f19switch, confidentialVmValuePropsVariantsJson.f19switch)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConfidentialVmValuePropsVariantsJson copy$default(ConfidentialVmValuePropsVariantsJson confidentialVmValuePropsVariantsJson, ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson, ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson2, ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson3, ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson4, int i, Object obj) {
        if ((i & 1) != 0) {
            confidentialVmValuePropsVariantJson = confidentialVmValuePropsVariantsJson.waitlist;
        }
        if ((i & 2) != 0) {
            confidentialVmValuePropsVariantJson2 = confidentialVmValuePropsVariantsJson.try_it;
        }
        if ((i & 4) != 0) {
            confidentialVmValuePropsVariantJson3 = confidentialVmValuePropsVariantsJson.subscribe;
        }
        if ((i & 8) != 0) {
            confidentialVmValuePropsVariantJson4 = confidentialVmValuePropsVariantsJson.f19switch;
        }
        return new ConfidentialVmValuePropsVariantsJson(confidentialVmValuePropsVariantJson, confidentialVmValuePropsVariantJson2, confidentialVmValuePropsVariantJson3, confidentialVmValuePropsVariantJson4);
    }

    public final ConfidentialVmValuePropsVariantJson component1() {
        return this.waitlist;
    }

    public final ConfidentialVmValuePropsVariantJson component2() {
        return this.try_it;
    }

    public final ConfidentialVmValuePropsVariantJson component3() {
        return this.subscribe;
    }

    public final ConfidentialVmValuePropsVariantJson component4() {
        return this.f19switch;
    }

    public final ConfidentialVmValuePropsVariantsJson copy(ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson, ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson2, ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson3, ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson4) {
        return new ConfidentialVmValuePropsVariantsJson(confidentialVmValuePropsVariantJson, confidentialVmValuePropsVariantJson2, confidentialVmValuePropsVariantJson3, confidentialVmValuePropsVariantJson4);
    }

    public final ConfidentialVmValuePropsVariantJson getSubscribe() {
        return this.subscribe;
    }

    public final ConfidentialVmValuePropsVariantJson getSwitch() {
        return this.f19switch;
    }

    public final ConfidentialVmValuePropsVariantJson getTry_it() {
        return this.try_it;
    }

    public final ConfidentialVmValuePropsVariantJson getWaitlist() {
        return this.waitlist;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0D(this.waitlist) * 31) + AnonymousClass006.A0D(this.try_it)) * 31) + AnonymousClass006.A0D(this.subscribe)) * 31) + C3cH.A02(this.f19switch);
    }

    public String toString() {
        return super.toString();
    }

    public ConfidentialVmValuePropsVariantsJson(ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson, ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson2, ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson3, ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson4) {
        this.waitlist = confidentialVmValuePropsVariantJson;
        this.try_it = confidentialVmValuePropsVariantJson2;
        this.subscribe = confidentialVmValuePropsVariantJson3;
        this.f19switch = confidentialVmValuePropsVariantJson4;
    }

    public /* synthetic */ ConfidentialVmValuePropsVariantsJson(ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson, ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson2, ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson3, ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson4, int i, C06H c06h) {
        this((i & 1) != 0 ? null : confidentialVmValuePropsVariantJson, (i & 2) != 0 ? null : confidentialVmValuePropsVariantJson2, (i & 4) != 0 ? null : confidentialVmValuePropsVariantJson3, (i & 8) != 0 ? null : confidentialVmValuePropsVariantJson4);
    }

    public /* synthetic */ ConfidentialVmValuePropsVariantsJson(int i, ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson, ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson2, ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson3, ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.waitlist = null;
        } else {
            this.waitlist = confidentialVmValuePropsVariantJson;
        }
        if ((i & 2) == 0) {
            this.try_it = null;
        } else {
            this.try_it = confidentialVmValuePropsVariantJson2;
        }
        if ((i & 4) == 0) {
            this.subscribe = null;
        } else {
            this.subscribe = confidentialVmValuePropsVariantJson3;
        }
        if ((i & 8) == 0) {
            this.f19switch = null;
        } else {
            this.f19switch = confidentialVmValuePropsVariantJson4;
        }
    }
}
