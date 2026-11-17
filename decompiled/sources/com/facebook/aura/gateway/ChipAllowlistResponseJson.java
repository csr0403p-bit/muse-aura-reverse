package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ChipAllowlistResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String chip_allowlist;
    public final String next_proof_serialized_message;
    public final String next_proof_signature;
    public final String proof_serialized_message;
    public final String proof_signature;
    public final String version;

    public final class Companion {
        public final C9hr<ChipAllowlistResponseJson> serializer() {
            return ChipAllowlistResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ChipAllowlistResponseJson chipAllowlistResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(chipAllowlistResponseJson.chip_allowlist)) {
            c9j5.AAV(chipAllowlistResponseJson.chip_allowlist, c9iZ, 0);
        }
        if (zAfR || !"".equals(chipAllowlistResponseJson.version)) {
            c9j5.AAV(chipAllowlistResponseJson.version, c9iZ, 1);
        }
        if (zAfR || !"".equals(chipAllowlistResponseJson.proof_signature)) {
            c9j5.AAV(chipAllowlistResponseJson.proof_signature, c9iZ, 2);
        }
        if (zAfR || !"".equals(chipAllowlistResponseJson.proof_serialized_message)) {
            c9j5.AAV(chipAllowlistResponseJson.proof_serialized_message, c9iZ, 3);
        }
        if (zAfR || !"".equals(chipAllowlistResponseJson.next_proof_signature)) {
            c9j5.AAV(chipAllowlistResponseJson.next_proof_signature, c9iZ, 4);
        }
        if (zAfR || !"".equals(chipAllowlistResponseJson.next_proof_serialized_message)) {
            c9j5.AAV(chipAllowlistResponseJson.next_proof_serialized_message, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChipAllowlistResponseJson) {
                ChipAllowlistResponseJson chipAllowlistResponseJson = (ChipAllowlistResponseJson) obj;
                if (!C7384Etj.areEqual(this.chip_allowlist, chipAllowlistResponseJson.chip_allowlist) || !C7384Etj.areEqual(this.version, chipAllowlistResponseJson.version) || !C7384Etj.areEqual(this.proof_signature, chipAllowlistResponseJson.proof_signature) || !C7384Etj.areEqual(this.proof_serialized_message, chipAllowlistResponseJson.proof_serialized_message) || !C7384Etj.areEqual(this.next_proof_signature, chipAllowlistResponseJson.next_proof_signature) || !C7384Etj.areEqual(this.next_proof_serialized_message, chipAllowlistResponseJson.next_proof_serialized_message)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ChipAllowlistResponseJson copy$default(ChipAllowlistResponseJson chipAllowlistResponseJson, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chipAllowlistResponseJson.chip_allowlist;
        }
        if ((i & 2) != 0) {
            str2 = chipAllowlistResponseJson.version;
        }
        if ((i & 4) != 0) {
            str3 = chipAllowlistResponseJson.proof_signature;
        }
        if ((i & 8) != 0) {
            str4 = chipAllowlistResponseJson.proof_serialized_message;
        }
        if ((i & 16) != 0) {
            str5 = chipAllowlistResponseJson.next_proof_signature;
        }
        if ((i & 32) != 0) {
            str6 = chipAllowlistResponseJson.next_proof_serialized_message;
        }
        return chipAllowlistResponseJson.copy(str, str2, str3, str4, str5, str6);
    }

    public final String component1() {
        return this.chip_allowlist;
    }

    public final String component2() {
        return this.version;
    }

    public final String component3() {
        return this.proof_signature;
    }

    public final String component4() {
        return this.proof_serialized_message;
    }

    public final String component5() {
        return this.next_proof_signature;
    }

    public final String component6() {
        return this.next_proof_serialized_message;
    }

    public final String getChip_allowlist() {
        return this.chip_allowlist;
    }

    public final String getNext_proof_serialized_message() {
        return this.next_proof_serialized_message;
    }

    public final String getNext_proof_signature() {
        return this.next_proof_signature;
    }

    public final String getProof_serialized_message() {
        return this.proof_serialized_message;
    }

    public final String getProof_signature() {
        return this.proof_signature;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.next_proof_serialized_message, AnonymousClass005.A0I(this.next_proof_signature, AnonymousClass005.A0I(this.proof_serialized_message, AnonymousClass005.A0I(this.proof_signature, AnonymousClass005.A0I(this.version, AnonymousClass001.A0G(this.chip_allowlist))))));
    }

    public /* synthetic */ ChipAllowlistResponseJson(int i, String str, String str2, String str3, String str4, String str5, String str6, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.chip_allowlist = "";
        } else {
            this.chip_allowlist = str;
        }
        if ((i & 2) == 0) {
            this.version = "";
        } else {
            this.version = str2;
        }
        if ((i & 4) == 0) {
            this.proof_signature = "";
        } else {
            this.proof_signature = str3;
        }
        if ((i & 8) == 0) {
            this.proof_serialized_message = "";
        } else {
            this.proof_serialized_message = str4;
        }
        if ((i & 16) == 0) {
            this.next_proof_signature = "";
        } else {
            this.next_proof_signature = str5;
        }
        if ((i & 32) == 0) {
            this.next_proof_serialized_message = "";
        } else {
            this.next_proof_serialized_message = str6;
        }
    }

    public final ChipAllowlistResponseJson copy(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(str6, 5);
        return new ChipAllowlistResponseJson(str, str2, str3, str4, str5, str6);
    }

    public String toString() {
        return super.toString();
    }

    public ChipAllowlistResponseJson(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(str6, 5);
        this.chip_allowlist = str;
        this.version = str2;
        this.proof_signature = str3;
        this.proof_serialized_message = str4;
        this.next_proof_signature = str5;
        this.next_proof_serialized_message = str6;
    }

    public /* synthetic */ ChipAllowlistResponseJson(String str, String str2, String str3, String str4, String str5, String str6, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }

    public ChipAllowlistResponseJson() {
        this("", "", "", "", "", "");
    }
}
