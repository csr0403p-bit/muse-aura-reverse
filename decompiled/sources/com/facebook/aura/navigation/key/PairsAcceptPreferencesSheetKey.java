package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PairsAcceptPreferencesSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final boolean fromHub;
    public final String token;

    public final class Companion {
        public final C9hr<PairsAcceptPreferencesSheetKey> serializer() {
            return PairsAcceptPreferencesSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PairsAcceptPreferencesSheetKey(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.token = str;
        this.fromHub = z;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_keys_keys(PairsAcceptPreferencesSheetKey pairsAcceptPreferencesSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(pairsAcceptPreferencesSheetKey.token, c9iZ, 0);
        if (c9j5.AfR() || pairsAcceptPreferencesSheetKey.fromHub) {
            c9j5.AA7(c9iZ, 1, pairsAcceptPreferencesSheetKey.fromHub);
        }
    }

    public final PairsAcceptPreferencesSheetKey copy(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new PairsAcceptPreferencesSheetKey(str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PairsAcceptPreferencesSheetKey) {
                PairsAcceptPreferencesSheetKey pairsAcceptPreferencesSheetKey = (PairsAcceptPreferencesSheetKey) obj;
                if (!C7384Etj.areEqual(this.token, pairsAcceptPreferencesSheetKey.token) || this.fromHub != pairsAcceptPreferencesSheetKey.fromHub) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PairsAcceptPreferencesSheetKey copy$default(PairsAcceptPreferencesSheetKey pairsAcceptPreferencesSheetKey, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pairsAcceptPreferencesSheetKey.token;
        }
        if ((i & 2) != 0) {
            z = pairsAcceptPreferencesSheetKey.fromHub;
        }
        C7384Etj.A0Y(str, 0);
        return new PairsAcceptPreferencesSheetKey(str, z);
    }

    public final String component1() {
        return this.token;
    }

    public final boolean component2() {
        return this.fromHub;
    }

    public final boolean getFromHub() {
        return this.fromHub;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass001.A0G(this.token), this.fromHub);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PairsAcceptPreferencesSheetKey(int i, String str, boolean z, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(PairsAcceptPreferencesSheetKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.token = str;
        this.fromHub = (i & 2) == 0 ? false : z;
    }

    public /* synthetic */ PairsAcceptPreferencesSheetKey(String str, boolean z, int i, C06H c06h) {
        this(str, AnonymousClass001.A1Q(i, z));
    }
}
