package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PairsHistoryScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String chatSessionId;
    public final String connectionId;
    public final String museId;

    public final class Companion {
        public final C9hr<PairsHistoryScreenKey> serializer() {
            return PairsHistoryScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_keys_keys(PairsHistoryScreenKey pairsHistoryScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(pairsHistoryScreenKey.museId, c9iZ, 0);
        c9j5.AAV(pairsHistoryScreenKey.chatSessionId, c9iZ, 1);
        if (c9j5.AfR() || pairsHistoryScreenKey.connectionId != null) {
            c9j5.AAP(pairsHistoryScreenKey.connectionId, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PairsHistoryScreenKey) {
                PairsHistoryScreenKey pairsHistoryScreenKey = (PairsHistoryScreenKey) obj;
                if (!C7384Etj.areEqual(this.museId, pairsHistoryScreenKey.museId) || !C7384Etj.areEqual(this.chatSessionId, pairsHistoryScreenKey.chatSessionId) || !C7384Etj.areEqual(this.connectionId, pairsHistoryScreenKey.connectionId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PairsHistoryScreenKey copy$default(PairsHistoryScreenKey pairsHistoryScreenKey, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pairsHistoryScreenKey.museId;
        }
        if ((i & 2) != 0) {
            str2 = pairsHistoryScreenKey.chatSessionId;
        }
        if ((i & 4) != 0) {
            str3 = pairsHistoryScreenKey.connectionId;
        }
        return pairsHistoryScreenKey.copy(str, str2, str3);
    }

    public final String component1() {
        return this.museId;
    }

    public final String component2() {
        return this.chatSessionId;
    }

    public final String component3() {
        return this.connectionId;
    }

    public final String getChatSessionId() {
        return this.chatSessionId;
    }

    public final String getConnectionId() {
        return this.connectionId;
    }

    public final String getMuseId() {
        return this.museId;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.chatSessionId, AnonymousClass001.A0G(this.museId)) + AnonymousClass006.A0G(this.connectionId);
    }

    public PairsHistoryScreenKey(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.museId = str;
        this.chatSessionId = str2;
        this.connectionId = str3;
    }

    public final PairsHistoryScreenKey copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new PairsHistoryScreenKey(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PairsHistoryScreenKey(int i, String str, String str2, String str3, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(PairsHistoryScreenKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.museId = str;
        this.chatSessionId = str2;
        this.connectionId = C3cI.A0W(i, str3);
    }

    public /* synthetic */ PairsHistoryScreenKey(String str, String str2, String str3, int i, C06H c06h) {
        this(str, str2, AnonymousClass006.A0t(i, str3));
    }
}
