package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
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
/* loaded from: classes3.dex */
public final class PairsStatusSheetKey extends C06G implements AuraBottomSheetNavKey {
    public final boolean fromHub;
    public final String generationId;
    public final PairsRole role;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cH.A1U(C79.A01, PairsStatusSheetKey$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<PairsStatusSheetKey> serializer() {
            return PairsStatusSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PairsStatusSheetKey) {
                PairsStatusSheetKey pairsStatusSheetKey = (PairsStatusSheetKey) obj;
                if (!C7384Etj.areEqual(this.generationId, pairsStatusSheetKey.generationId) || this.role != pairsStatusSheetKey.role || this.fromHub != pairsStatusSheetKey.fromHub) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PairsStatusSheetKey copy$default(PairsStatusSheetKey pairsStatusSheetKey, String str, PairsRole pairsRole, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pairsStatusSheetKey.generationId;
        }
        if ((i & 2) != 0) {
            pairsRole = pairsStatusSheetKey.role;
        }
        if ((i & 4) != 0) {
            z = pairsStatusSheetKey.fromHub;
        }
        return pairsStatusSheetKey.copy(str, pairsRole, z);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_keys_keys(PairsStatusSheetKey pairsStatusSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(pairsStatusSheetKey.generationId, c9iZ, 0);
        c9j5.AAQ(pairsStatusSheetKey.role, C3cH.A15(f0cArr, 1), c9iZ, 1);
        c9j5.AA7(c9iZ, 2, pairsStatusSheetKey.fromHub);
    }

    public final String component1() {
        return this.generationId;
    }

    public final PairsRole component2() {
        return this.role;
    }

    public final boolean component3() {
        return this.fromHub;
    }

    public final boolean getFromHub() {
        return this.fromHub;
    }

    public final String getGenerationId() {
        return this.generationId;
    }

    public final PairsRole getRole() {
        return this.role;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.role, AnonymousClass001.A0G(this.generationId)), this.fromHub);
    }

    public PairsStatusSheetKey(String str, PairsRole pairsRole, boolean z) {
        AnonymousClass003.A0u(str, pairsRole);
        this.generationId = str;
        this.role = pairsRole;
        this.fromHub = z;
    }

    public final PairsStatusSheetKey copy(String str, PairsRole pairsRole, boolean z) {
        AnonymousClass003.A0u(str, pairsRole);
        return new PairsStatusSheetKey(str, pairsRole, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PairsStatusSheetKey(int i, String str, PairsRole pairsRole, boolean z, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(PairsStatusSheetKey$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.generationId = str;
        this.role = pairsRole;
        this.fromHub = z;
    }
}
