package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
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
/* loaded from: classes4.dex */
public final class HatchLinkingOptionsResponseJson extends C06G {
    public final HatchAgeConfirmationScreenJson age_confirmation_screen;
    public final List<String> linkable_account_types;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, HatchLinkingOptionsResponseJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<HatchLinkingOptionsResponseJson> serializer() {
            return HatchLinkingOptionsResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchLinkingOptionsResponseJson(List<String> list, HatchAgeConfirmationScreenJson hatchAgeConfirmationScreenJson) {
        C7384Etj.A0Y(list, 0);
        this.linkable_account_types = list;
        this.age_confirmation_screen = hatchAgeConfirmationScreenJson;
    }

    public final HatchLinkingOptionsResponseJson copy(List<String> list, HatchAgeConfirmationScreenJson hatchAgeConfirmationScreenJson) {
        C7384Etj.A0Y(list, 0);
        return new HatchLinkingOptionsResponseJson(list, hatchAgeConfirmationScreenJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchLinkingOptionsResponseJson) {
                HatchLinkingOptionsResponseJson hatchLinkingOptionsResponseJson = (HatchLinkingOptionsResponseJson) obj;
                if (!C7384Etj.areEqual(this.linkable_account_types, hatchLinkingOptionsResponseJson.linkable_account_types) || !C7384Etj.areEqual(this.age_confirmation_screen, hatchLinkingOptionsResponseJson.age_confirmation_screen)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchLinkingOptionsResponseJson copy$default(HatchLinkingOptionsResponseJson hatchLinkingOptionsResponseJson, List list, HatchAgeConfirmationScreenJson hatchAgeConfirmationScreenJson, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hatchLinkingOptionsResponseJson.linkable_account_types;
        }
        if ((i & 2) != 0) {
            hatchAgeConfirmationScreenJson = hatchLinkingOptionsResponseJson.age_confirmation_screen;
        }
        C7384Etj.A0Y(list, 0);
        return new HatchLinkingOptionsResponseJson(list, hatchAgeConfirmationScreenJson);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchLinkingOptionsResponseJson hatchLinkingOptionsResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(hatchLinkingOptionsResponseJson.linkable_account_types)) {
            c9j5.AAQ(hatchLinkingOptionsResponseJson.linkable_account_types, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || hatchLinkingOptionsResponseJson.age_confirmation_screen != null) {
            c9j5.AAP(hatchLinkingOptionsResponseJson.age_confirmation_screen, HatchAgeConfirmationScreenJson$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public final List<String> component1() {
        return this.linkable_account_types;
    }

    public final HatchAgeConfirmationScreenJson component2() {
        return this.age_confirmation_screen;
    }

    public final HatchAgeConfirmationScreenJson getAge_confirmation_screen() {
        return this.age_confirmation_screen;
    }

    public final List<String> getLinkable_account_types() {
        return this.linkable_account_types;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.linkable_account_types) + AnonymousClass006.A0D(this.age_confirmation_screen);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchLinkingOptionsResponseJson(int i, List list, HatchAgeConfirmationScreenJson hatchAgeConfirmationScreenJson, C2hx c2hx) {
        this.linkable_account_types = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.age_confirmation_screen = null;
        } else {
            this.age_confirmation_screen = hatchAgeConfirmationScreenJson;
        }
    }

    public /* synthetic */ HatchLinkingOptionsResponseJson(List list, HatchAgeConfirmationScreenJson hatchAgeConfirmationScreenJson, int i, C06H c06h) {
        this(C3cI.A10(list, i), (i & 2) != 0 ? null : hatchAgeConfirmationScreenJson);
    }

    public HatchLinkingOptionsResponseJson() {
        this(C0881AGi.A00, null);
    }
}
