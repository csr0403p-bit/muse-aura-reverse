package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.F0C;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class HatchLinkPairingSheetKey extends C06G implements AuraBottomSheetNavKey {
    public final boolean fromDeeplink;
    public final String presentationId;
    public final HatchLinkPairingPurpose purpose;
    public final String setUpAgainAddress;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {AbstractC5321DgF.A02(C79.A01, HatchLinkPairingSheetKey$Companion$$childSerializers$1.INSTANCE), null, null, null};

    public final class Companion {
        public final C9hr<HatchLinkPairingSheetKey> serializer() {
            return HatchLinkPairingSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchLinkPairingSheetKey() {
        this(HatchLinkPairingPurpose.NEW_PAIRING, false, AnonymousClass002.A0k(), null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchLinkPairingSheetKey) {
                HatchLinkPairingSheetKey hatchLinkPairingSheetKey = (HatchLinkPairingSheetKey) obj;
                if (this.purpose != hatchLinkPairingSheetKey.purpose || this.fromDeeplink != hatchLinkPairingSheetKey.fromDeeplink || !C7384Etj.areEqual(this.presentationId, hatchLinkPairingSheetKey.presentationId) || !C7384Etj.areEqual(this.setUpAgainAddress, hatchLinkPairingSheetKey.setUpAgainAddress)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchLinkPairingSheetKey copy$default(HatchLinkPairingSheetKey hatchLinkPairingSheetKey, HatchLinkPairingPurpose hatchLinkPairingPurpose, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchLinkPairingPurpose = hatchLinkPairingSheetKey.purpose;
        }
        if ((i & 2) != 0) {
            z = hatchLinkPairingSheetKey.fromDeeplink;
        }
        if ((i & 4) != 0) {
            str = hatchLinkPairingSheetKey.presentationId;
        }
        if ((i & 8) != 0) {
            str2 = hatchLinkPairingSheetKey.setUpAgainAddress;
        }
        AnonymousClass003.A0v(hatchLinkPairingPurpose, str);
        return new HatchLinkPairingSheetKey(hatchLinkPairingPurpose, z, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(com.facebook.aura.navigation.key.HatchLinkPairingSheetKey r5, X.C9j5 r6, X.C9iZ r7) {
        /*
            X.F0C<X.9hr<java.lang.Object>>[] r4 = com.facebook.aura.navigation.key.HatchLinkPairingSheetKey.$childSerializers
            r2 = 0
            boolean r3 = r6.AfR()
            if (r3 != 0) goto Lf
            com.facebook.aura.navigation.key.HatchLinkPairingPurpose r1 = r5.purpose
            com.facebook.aura.navigation.key.HatchLinkPairingPurpose r0 = com.facebook.aura.navigation.key.HatchLinkPairingPurpose.NEW_PAIRING
            if (r1 == r0) goto L18
        Lf:
            X.9hv r1 = X.C3cH.A15(r4, r2)
            com.facebook.aura.navigation.key.HatchLinkPairingPurpose r0 = r5.purpose
            r6.AAQ(r0, r1, r7, r2)
        L18:
            r1 = 1
            if (r3 != 0) goto L1f
            boolean r0 = r5.fromDeeplink
            if (r0 == 0) goto L24
        L1f:
            boolean r0 = r5.fromDeeplink
            r6.AA7(r7, r1, r0)
        L24:
            r2 = 2
            if (r3 != 0) goto L33
            java.lang.String r1 = r5.presentationId
            java.lang.String r0 = X.AnonymousClass002.A0k()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L38
        L33:
            java.lang.String r0 = r5.presentationId
            r6.AAV(r0, r7, r2)
        L38:
            r2 = 3
            if (r3 != 0) goto L3f
            java.lang.String r0 = r5.setUpAgainAddress
            if (r0 == 0) goto L46
        L3f:
            X.9iq r1 = X.C07779iq.A01
            java.lang.String r0 = r5.setUpAgainAddress
            r6.AAP(r0, r1, r7, r2)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.navigation.key.HatchLinkPairingSheetKey.write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(com.facebook.aura.navigation.key.HatchLinkPairingSheetKey, X.9j5, X.9iZ):void");
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

    public final String component4() {
        return this.setUpAgainAddress;
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

    public final String getSetUpAgainAddress() {
        return this.setUpAgainAddress;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.presentationId, C0KA.A01(AnonymousClass005.A0E(this.purpose), this.fromDeeplink)) + AnonymousClass006.A0G(this.setUpAgainAddress);
    }

    public final HatchLinkPairingSheetKey copy(HatchLinkPairingPurpose hatchLinkPairingPurpose, boolean z, String str, String str2) {
        AnonymousClass003.A0v(hatchLinkPairingPurpose, str);
        return new HatchLinkPairingSheetKey(hatchLinkPairingPurpose, z, str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public HatchLinkPairingSheetKey(HatchLinkPairingPurpose hatchLinkPairingPurpose, boolean z, String str, String str2) {
        AnonymousClass003.A0v(hatchLinkPairingPurpose, str);
        this.purpose = hatchLinkPairingPurpose;
        this.fromDeeplink = z;
        this.presentationId = str;
        this.setUpAgainAddress = str2;
    }

    public /* synthetic */ HatchLinkPairingSheetKey(HatchLinkPairingPurpose hatchLinkPairingPurpose, boolean z, String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? HatchLinkPairingPurpose.NEW_PAIRING : hatchLinkPairingPurpose, AnonymousClass001.A1Q(i, z), (i & 4) != 0 ? AnonymousClass002.A0k() : str, AnonymousClass006.A0u(i, str2));
    }

    public /* synthetic */ HatchLinkPairingSheetKey(int i, HatchLinkPairingPurpose hatchLinkPairingPurpose, boolean z, String str, String str2, C2hx c2hx) {
        this.purpose = (i & 1) == 0 ? HatchLinkPairingPurpose.NEW_PAIRING : hatchLinkPairingPurpose;
        if ((i & 2) == 0) {
            this.fromDeeplink = false;
        } else {
            this.fromDeeplink = z;
        }
        if ((i & 4) == 0) {
            this.presentationId = AnonymousClass002.A0k();
        } else {
            this.presentationId = str;
        }
        if ((i & 8) == 0) {
            this.setUpAgainAddress = null;
        } else {
            this.setUpAgainAddress = str2;
        }
    }
}
