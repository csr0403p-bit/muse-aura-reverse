package com.facebook.aura.gateway;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
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
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CvmChipSelectionRequestJson extends C06G {
    public static final int $stable = 8;
    public final String attempt_id;
    public final List<String> candidate_chip_ids;
    public final String env_id;
    public final String host_data;
    public final String nonce;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, AbstractC5321DgF.A02(C79.A01, CvmChipSelectionRequestJson$Companion$$childSerializers$1.INSTANCE), null, null};

    public final class Companion {
        public final C9hr<CvmChipSelectionRequestJson> serializer() {
            return CvmChipSelectionRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CvmChipSelectionRequestJson) {
                CvmChipSelectionRequestJson cvmChipSelectionRequestJson = (CvmChipSelectionRequestJson) obj;
                if (!C7384Etj.areEqual(this.env_id, cvmChipSelectionRequestJson.env_id) || !C7384Etj.areEqual(this.nonce, cvmChipSelectionRequestJson.nonce) || !C7384Etj.areEqual(this.candidate_chip_ids, cvmChipSelectionRequestJson.candidate_chip_ids) || !C7384Etj.areEqual(this.attempt_id, cvmChipSelectionRequestJson.attempt_id) || !C7384Etj.areEqual(this.host_data, cvmChipSelectionRequestJson.host_data)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CvmChipSelectionRequestJson copy$default(CvmChipSelectionRequestJson cvmChipSelectionRequestJson, String str, String str2, List list, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cvmChipSelectionRequestJson.env_id;
        }
        if ((i & 2) != 0) {
            str2 = cvmChipSelectionRequestJson.nonce;
        }
        if ((i & 4) != 0) {
            list = cvmChipSelectionRequestJson.candidate_chip_ids;
        }
        if ((i & 8) != 0) {
            str3 = cvmChipSelectionRequestJson.attempt_id;
        }
        if ((i & 16) != 0) {
            str4 = cvmChipSelectionRequestJson.host_data;
        }
        return cvmChipSelectionRequestJson.copy(str, str2, list, str3, str4);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CvmChipSelectionRequestJson cvmChipSelectionRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(cvmChipSelectionRequestJson.env_id, c9iZ, 0);
        c9j5.AAV(cvmChipSelectionRequestJson.nonce, c9iZ, 1);
        c9j5.AAQ(cvmChipSelectionRequestJson.candidate_chip_ids, C3cH.A15(f0cArr, 2), c9iZ, 2);
        c9j5.AAV(cvmChipSelectionRequestJson.attempt_id, c9iZ, 3);
        c9j5.AAV(cvmChipSelectionRequestJson.host_data, c9iZ, 4);
    }

    public final String component1() {
        return this.env_id;
    }

    public final String component2() {
        return this.nonce;
    }

    public final List<String> component3() {
        return this.candidate_chip_ids;
    }

    public final String component4() {
        return this.attempt_id;
    }

    public final String component5() {
        return this.host_data;
    }

    public final String getAttempt_id() {
        return this.attempt_id;
    }

    public final List<String> getCandidate_chip_ids() {
        return this.candidate_chip_ids;
    }

    public final String getEnv_id() {
        return this.env_id;
    }

    public final String getHost_data() {
        return this.host_data;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.host_data, AnonymousClass005.A0I(this.attempt_id, AnonymousClass005.A0F(this.candidate_chip_ids, AnonymousClass005.A0I(this.nonce, AnonymousClass001.A0G(this.env_id)))));
    }

    public CvmChipSelectionRequestJson(String str, String str2, List<String> list, String str3, String str4) {
        AnonymousClass005.A17(str, str2, list, str3, str4);
        this.env_id = str;
        this.nonce = str2;
        this.candidate_chip_ids = list;
        this.attempt_id = str3;
        this.host_data = str4;
    }

    public final CvmChipSelectionRequestJson copy(String str, String str2, List<String> list, String str3, String str4) {
        AnonymousClass005.A17(str, str2, list, str3, str4);
        return new CvmChipSelectionRequestJson(str, str2, list, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CvmChipSelectionRequestJson(int i, String str, String str2, List list, String str3, String str4, C2hx c2hx) {
        if (31 != (i & 31)) {
            C9iI.A00(CvmChipSelectionRequestJson$$serializer.descriptor, i, 31);
            throw F60.createAndThrow();
        }
        this.env_id = str;
        this.nonce = str2;
        this.candidate_chip_ids = list;
        this.attempt_id = str3;
        this.host_data = str4;
    }
}
