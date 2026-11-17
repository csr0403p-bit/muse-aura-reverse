package com.facebook.aura.hotels;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class HotelPolicySheetKey extends C06G implements AuraBottomSheetNavKey {
    public final HotelPolicy policy;
    public final HotelSelectionSheetKey selection;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1W(C79.A01, null, HotelPolicySheetKey$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<HotelPolicySheetKey> serializer() {
            return HotelPolicySheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelPolicySheetKey) {
                HotelPolicySheetKey hotelPolicySheetKey = (HotelPolicySheetKey) obj;
                if (!C7384Etj.areEqual(this.selection, hotelPolicySheetKey.selection) || this.policy != hotelPolicySheetKey.policy) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelPolicySheetKey copy$default(HotelPolicySheetKey hotelPolicySheetKey, HotelSelectionSheetKey hotelSelectionSheetKey, HotelPolicy hotelPolicy, int i, Object obj) {
        if ((i & 1) != 0) {
            hotelSelectionSheetKey = hotelPolicySheetKey.selection;
        }
        if ((i & 2) != 0) {
            hotelPolicy = hotelPolicySheetKey.policy;
        }
        AnonymousClass003.A0u(hotelSelectionSheetKey, hotelPolicy);
        return new HotelPolicySheetKey(hotelSelectionSheetKey, hotelPolicy);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_impl_keys_keys(HotelPolicySheetKey hotelPolicySheetKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAQ(hotelPolicySheetKey.selection, HotelSelectionSheetKey$$serializer.INSTANCE, c9iZ, 0);
        c9j5.AAQ(hotelPolicySheetKey.policy, C3cH.A15(f0cArr, 1), c9iZ, 1);
    }

    public final HotelSelectionSheetKey component1() {
        return this.selection;
    }

    public final HotelPolicy component2() {
        return this.policy;
    }

    public final HotelPolicy getPolicy() {
        return this.policy;
    }

    public final HotelSelectionSheetKey getSelection() {
        return this.selection;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.policy, AnonymousClass005.A0E(this.selection));
    }

    public HotelPolicySheetKey(HotelSelectionSheetKey hotelSelectionSheetKey, HotelPolicy hotelPolicy) {
        AnonymousClass003.A0u(hotelSelectionSheetKey, hotelPolicy);
        this.selection = hotelSelectionSheetKey;
        this.policy = hotelPolicy;
    }

    public final HotelPolicySheetKey copy(HotelSelectionSheetKey hotelSelectionSheetKey, HotelPolicy hotelPolicy) {
        AnonymousClass003.A0u(hotelSelectionSheetKey, hotelPolicy);
        return new HotelPolicySheetKey(hotelSelectionSheetKey, hotelPolicy);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelPolicySheetKey(int i, HotelSelectionSheetKey hotelSelectionSheetKey, HotelPolicy hotelPolicy, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(HotelPolicySheetKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.selection = hotelSelectionSheetKey;
        this.policy = hotelPolicy;
    }
}
