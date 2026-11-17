package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import java.util.Map;

/* loaded from: classes4.dex */
public final class GatewayVmCredential extends C06G {
    public static final int $stable = 8;
    public final String authToken;

    /* renamed from: default, reason: not valid java name */
    public final boolean f63default;
    public final Long notaryTokenExpirationTs;
    public final Map<String, String> notaryTokens;
    public final String replaceAttemptId;
    public final String vmId;
    public final HatchVmState vmState;
    public final HatchlingVmType vmType;
    public final String wsUrl;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GatewayVmCredential) {
                GatewayVmCredential gatewayVmCredential = (GatewayVmCredential) obj;
                if (!C7384Etj.areEqual(this.vmId, gatewayVmCredential.vmId) || !C7384Etj.areEqual(this.wsUrl, gatewayVmCredential.wsUrl) || !C7384Etj.areEqual(this.authToken, gatewayVmCredential.authToken) || this.f63default != gatewayVmCredential.f63default || this.vmType != gatewayVmCredential.vmType || this.vmState != gatewayVmCredential.vmState || !C7384Etj.areEqual(this.replaceAttemptId, gatewayVmCredential.replaceAttemptId) || !C7384Etj.areEqual(this.notaryTokens, gatewayVmCredential.notaryTokens) || !C7384Etj.areEqual(this.notaryTokenExpirationTs, gatewayVmCredential.notaryTokenExpirationTs)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GatewayVmCredential copy$default(GatewayVmCredential gatewayVmCredential, String str, String str2, String str3, boolean z, HatchlingVmType hatchlingVmType, HatchVmState hatchVmState, String str4, Map map, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gatewayVmCredential.vmId;
        }
        if ((i & 2) != 0) {
            str2 = gatewayVmCredential.wsUrl;
        }
        if ((i & 4) != 0) {
            str3 = gatewayVmCredential.authToken;
        }
        if ((i & 8) != 0) {
            z = gatewayVmCredential.f63default;
        }
        if ((i & 16) != 0) {
            hatchlingVmType = gatewayVmCredential.vmType;
        }
        if ((i & 32) != 0) {
            hatchVmState = gatewayVmCredential.vmState;
        }
        if ((i & 64) != 0) {
            str4 = gatewayVmCredential.replaceAttemptId;
        }
        if ((i & 128) != 0) {
            map = gatewayVmCredential.notaryTokens;
        }
        if ((i & 256) != 0) {
            l = gatewayVmCredential.notaryTokenExpirationTs;
        }
        return gatewayVmCredential.copy(str, str2, str3, z, hatchlingVmType, hatchVmState, str4, map, l);
    }

    public final String component1() {
        return this.vmId;
    }

    public final String component2() {
        return this.wsUrl;
    }

    public final String component3() {
        return this.authToken;
    }

    public final boolean component4() {
        return this.f63default;
    }

    public final HatchlingVmType component5() {
        return this.vmType;
    }

    public final HatchVmState component6() {
        return this.vmState;
    }

    public final String component7() {
        return this.replaceAttemptId;
    }

    public final Map<String, String> component8() {
        return this.notaryTokens;
    }

    public final Long component9() {
        return this.notaryTokenExpirationTs;
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final boolean getDefault() {
        return this.f63default;
    }

    public final Long getNotaryTokenExpirationTs() {
        return this.notaryTokenExpirationTs;
    }

    public final Map<String, String> getNotaryTokens() {
        return this.notaryTokens;
    }

    public final String getReplaceAttemptId() {
        return this.replaceAttemptId;
    }

    public final String getVmId() {
        return this.vmId;
    }

    public final HatchVmState getVmState() {
        return this.vmState;
    }

    public final HatchlingVmType getVmType() {
        return this.vmType;
    }

    public final String getWsUrl() {
        return this.wsUrl;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.notaryTokens, (AnonymousClass005.A0F(this.vmState, (C0KA.A01(AnonymousClass005.A0I(this.authToken, AnonymousClass005.A0I(this.wsUrl, AnonymousClass001.A0G(this.vmId))), this.f63default) + AnonymousClass006.A0D(this.vmType)) * 31) + AnonymousClass006.A0G(this.replaceAttemptId)) * 31) + C3cH.A02(this.notaryTokenExpirationTs);
    }

    public GatewayVmCredential(String str, String str2, String str3, boolean z, HatchlingVmType hatchlingVmType, HatchVmState hatchVmState, String str4, Map<String, String> map, Long l) {
        AnonymousClass005.A0x(str, str2, str3);
        C60O.A1M(hatchVmState, 5, map);
        this.vmId = str;
        this.wsUrl = str2;
        this.authToken = str3;
        this.f63default = z;
        this.vmType = hatchlingVmType;
        this.vmState = hatchVmState;
        this.replaceAttemptId = str4;
        this.notaryTokens = map;
        this.notaryTokenExpirationTs = l;
    }

    public final GatewayVmCredential copy(String str, String str2, String str3, boolean z, HatchlingVmType hatchlingVmType, HatchVmState hatchVmState, String str4, Map<String, String> map, Long l) {
        AnonymousClass005.A0x(str, str2, str3);
        C60O.A1M(hatchVmState, 5, map);
        return new GatewayVmCredential(str, str2, str3, z, hatchlingVmType, hatchVmState, str4, map, l);
    }

    public String toString() {
        return super.toString();
    }
}
