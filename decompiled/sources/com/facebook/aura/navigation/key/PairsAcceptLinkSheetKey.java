package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass005;
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
public final class PairsAcceptLinkSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final boolean fromHub;
    public final boolean opensInChat;
    public final String token;

    public final class Companion {
        public final C9hr<PairsAcceptLinkSheetKey> serializer() {
            return PairsAcceptLinkSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PairsAcceptLinkSheetKey(String str, boolean z, boolean z2) {
        C7384Etj.A0Y(str, 0);
        this.token = str;
        this.fromHub = z;
        this.opensInChat = z2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_keys_keys(PairsAcceptLinkSheetKey pairsAcceptLinkSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(pairsAcceptLinkSheetKey.token, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || pairsAcceptLinkSheetKey.fromHub) {
            c9j5.AA7(c9iZ, 1, pairsAcceptLinkSheetKey.fromHub);
        }
        if (zAfR || pairsAcceptLinkSheetKey.opensInChat) {
            c9j5.AA7(c9iZ, 2, pairsAcceptLinkSheetKey.opensInChat);
        }
    }

    public final PairsAcceptLinkSheetKey copy(String str, boolean z, boolean z2) {
        C7384Etj.A0Y(str, 0);
        return new PairsAcceptLinkSheetKey(str, z, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PairsAcceptLinkSheetKey) {
                PairsAcceptLinkSheetKey pairsAcceptLinkSheetKey = (PairsAcceptLinkSheetKey) obj;
                if (!C7384Etj.areEqual(this.token, pairsAcceptLinkSheetKey.token) || this.fromHub != pairsAcceptLinkSheetKey.fromHub || this.opensInChat != pairsAcceptLinkSheetKey.opensInChat) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PairsAcceptLinkSheetKey copy$default(PairsAcceptLinkSheetKey pairsAcceptLinkSheetKey, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pairsAcceptLinkSheetKey.token;
        }
        if ((i & 2) != 0) {
            z = pairsAcceptLinkSheetKey.fromHub;
        }
        if ((i & 4) != 0) {
            z2 = pairsAcceptLinkSheetKey.opensInChat;
        }
        return pairsAcceptLinkSheetKey.copy(str, z, z2);
    }

    public final String component1() {
        return this.token;
    }

    public final boolean component2() {
        return this.fromHub;
    }

    public final boolean component3() {
        return this.opensInChat;
    }

    public final boolean getFromHub() {
        return this.fromHub;
    }

    public final boolean getOpensInChat() {
        return this.opensInChat;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(AnonymousClass001.A0G(this.token), this.fromHub), this.opensInChat);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PairsAcceptLinkSheetKey(int i, String str, boolean z, boolean z2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(PairsAcceptLinkSheetKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.token = str;
        if ((i & 2) == 0) {
            this.fromHub = false;
        } else {
            this.fromHub = z;
        }
        if ((i & 4) == 0) {
            this.opensInChat = false;
        } else {
            this.opensInChat = z2;
        }
    }

    public /* synthetic */ PairsAcceptLinkSheetKey(String str, boolean z, boolean z2, int i, C06H c06h) {
        this(str, AnonymousClass001.A1Q(i, z), AnonymousClass005.A1O(i, z2));
    }
}
