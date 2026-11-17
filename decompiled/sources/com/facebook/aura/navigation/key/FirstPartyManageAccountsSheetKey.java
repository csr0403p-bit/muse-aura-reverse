package com.facebook.aura.navigation.key;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class FirstPartyManageAccountsSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final String connectorId;

    public final class Companion {
        public final C9hr<FirstPartyManageAccountsSheetKey> serializer() {
            return FirstPartyManageAccountsSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final FirstPartyManageAccountsSheetKey copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new FirstPartyManageAccountsSheetKey(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FirstPartyManageAccountsSheetKey) && C7384Etj.areEqual(this.connectorId, ((FirstPartyManageAccountsSheetKey) obj).connectorId));
    }

    public /* synthetic */ FirstPartyManageAccountsSheetKey(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(FirstPartyManageAccountsSheetKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.connectorId = str;
    }

    public static /* synthetic */ FirstPartyManageAccountsSheetKey copy$default(FirstPartyManageAccountsSheetKey firstPartyManageAccountsSheetKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = firstPartyManageAccountsSheetKey.connectorId;
        }
        C7384Etj.A0Y(str, 0);
        return new FirstPartyManageAccountsSheetKey(str);
    }

    public final String component1() {
        return this.connectorId;
    }

    public final String getConnectorId() {
        return this.connectorId;
    }

    public int hashCode() {
        return this.connectorId.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public FirstPartyManageAccountsSheetKey(String str) {
        C7384Etj.A0Y(str, 0);
        this.connectorId = str;
    }
}
