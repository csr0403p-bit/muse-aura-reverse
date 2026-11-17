package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C3cI;
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
public final class HatchLinkActivePairingSheetKey extends C06G implements AuraBottomSheetNavKey {
    public final boolean fromDeeplink;
    public final String presentationId;
    public final HatchLinkPairingPurpose purpose;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cI.A1Z(C79.A01, HatchLinkActivePairingSheetKey$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<HatchLinkActivePairingSheetKey> serializer() {
            return HatchLinkActivePairingSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchLinkActivePairingSheetKey) {
                HatchLinkActivePairingSheetKey hatchLinkActivePairingSheetKey = (HatchLinkActivePairingSheetKey) obj;
                if (this.purpose != hatchLinkActivePairingSheetKey.purpose || this.fromDeeplink != hatchLinkActivePairingSheetKey.fromDeeplink || !C7384Etj.areEqual(this.presentationId, hatchLinkActivePairingSheetKey.presentationId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchLinkActivePairingSheetKey copy$default(HatchLinkActivePairingSheetKey hatchLinkActivePairingSheetKey, HatchLinkPairingPurpose hatchLinkPairingPurpose, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchLinkPairingPurpose = hatchLinkActivePairingSheetKey.purpose;
        }
        if ((i & 2) != 0) {
            z = hatchLinkActivePairingSheetKey.fromDeeplink;
        }
        if ((i & 4) != 0) {
            str = hatchLinkActivePairingSheetKey.presentationId;
        }
        return hatchLinkActivePairingSheetKey.copy(hatchLinkPairingPurpose, z, str);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(HatchLinkActivePairingSheetKey hatchLinkActivePairingSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(hatchLinkActivePairingSheetKey.purpose, C3cH.A15($childSerializers, 0), c9iZ, 0);
        c9j5.AA7(c9iZ, 1, hatchLinkActivePairingSheetKey.fromDeeplink);
        c9j5.AAV(hatchLinkActivePairingSheetKey.presentationId, c9iZ, 2);
    }

    public final HatchLinkPairingPurpose component1() {
        return this.purpose;
    }

    public final boolean component2() {
        return this.fromDeeplink;
    }

    public final String component3() {
        return this.presentationId;
    }

    public final boolean getFromDeeplink() {
        return this.fromDeeplink;
    }

    public final String getPresentationId() {
        return this.presentationId;
    }

    public final HatchLinkPairingPurpose getPurpose() {
        return this.purpose;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.presentationId, C0KA.A01(AnonymousClass005.A0E(this.purpose), this.fromDeeplink));
    }

    public HatchLinkActivePairingSheetKey(HatchLinkPairingPurpose hatchLinkPairingPurpose, boolean z, String str) {
        AnonymousClass003.A0v(hatchLinkPairingPurpose, str);
        this.purpose = hatchLinkPairingPurpose;
        this.fromDeeplink = z;
        this.presentationId = str;
    }

    public final HatchLinkActivePairingSheetKey copy(HatchLinkPairingPurpose hatchLinkPairingPurpose, boolean z, String str) {
        AnonymousClass003.A0v(hatchLinkPairingPurpose, str);
        return new HatchLinkActivePairingSheetKey(hatchLinkPairingPurpose, z, str);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchLinkActivePairingSheetKey(int i, HatchLinkPairingPurpose hatchLinkPairingPurpose, boolean z, String str, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(HatchLinkActivePairingSheetKey$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.purpose = hatchLinkPairingPurpose;
        this.fromDeeplink = z;
        this.presentationId = str;
    }
}
