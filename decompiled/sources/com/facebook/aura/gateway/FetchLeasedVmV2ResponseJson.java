package com.facebook.aura.gateway;

import X.AbstractC5321DgF;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F0C;
import com.facebook.aura.gateway.store.VmEntryV2Json;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class FetchLeasedVmV2ResponseJson extends C06G {
    public static final int $stable = 8;
    public final String backend_error_code;
    public final CvmEligibilityJson cvm_eligibility;
    public final String error_summary;
    public final String error_title;
    public final Integer max_retry_count;
    public final Long retry_after_ms;
    public final List<VmEntryV2Json> vm_list;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {AbstractC5321DgF.A02(C79.A01, FetchLeasedVmV2ResponseJson$Companion$$childSerializers$1.INSTANCE), null, null, null, null, null, null};

    public final class Companion {
        public final C9hr<FetchLeasedVmV2ResponseJson> serializer() {
            return FetchLeasedVmV2ResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ FetchLeasedVmV2ResponseJson copy$default(FetchLeasedVmV2ResponseJson fetchLeasedVmV2ResponseJson, List list, String str, String str2, String str3, Long l, Integer num, CvmEligibilityJson cvmEligibilityJson, int i, Object obj) {
        List list2 = list;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        Long l2 = l;
        Integer num2 = num;
        CvmEligibilityJson cvmEligibilityJson2 = cvmEligibilityJson;
        if ((i & 1) != 0) {
            list2 = fetchLeasedVmV2ResponseJson.vm_list;
        }
        if ((i & 2) != 0) {
            str4 = fetchLeasedVmV2ResponseJson.error_title;
        }
        if ((i & 4) != 0) {
            str5 = fetchLeasedVmV2ResponseJson.error_summary;
        }
        if ((i & 8) != 0) {
            str6 = fetchLeasedVmV2ResponseJson.backend_error_code;
        }
        if ((i & 16) != 0) {
            l2 = fetchLeasedVmV2ResponseJson.retry_after_ms;
        }
        if ((i & 32) != 0) {
            num2 = fetchLeasedVmV2ResponseJson.max_retry_count;
        }
        if ((i & 64) != 0) {
            cvmEligibilityJson2 = fetchLeasedVmV2ResponseJson.cvm_eligibility;
        }
        return new FetchLeasedVmV2ResponseJson(list2, str4, str5, str6, l2, num2, cvmEligibilityJson2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FetchLeasedVmV2ResponseJson) {
                FetchLeasedVmV2ResponseJson fetchLeasedVmV2ResponseJson = (FetchLeasedVmV2ResponseJson) obj;
                if (!C7384Etj.areEqual(this.vm_list, fetchLeasedVmV2ResponseJson.vm_list) || !C7384Etj.areEqual(this.error_title, fetchLeasedVmV2ResponseJson.error_title) || !C7384Etj.areEqual(this.error_summary, fetchLeasedVmV2ResponseJson.error_summary) || !C7384Etj.areEqual(this.backend_error_code, fetchLeasedVmV2ResponseJson.backend_error_code) || !C7384Etj.areEqual(this.retry_after_ms, fetchLeasedVmV2ResponseJson.retry_after_ms) || !C7384Etj.areEqual(this.max_retry_count, fetchLeasedVmV2ResponseJson.max_retry_count) || !C7384Etj.areEqual(this.cvm_eligibility, fetchLeasedVmV2ResponseJson.cvm_eligibility)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FetchLeasedVmV2ResponseJson fetchLeasedVmV2ResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || fetchLeasedVmV2ResponseJson.vm_list != null) {
            c9j5.AAP(fetchLeasedVmV2ResponseJson.vm_list, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || fetchLeasedVmV2ResponseJson.error_title != null) {
            c9j5.AAP(fetchLeasedVmV2ResponseJson.error_title, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || fetchLeasedVmV2ResponseJson.error_summary != null) {
            c9j5.AAP(fetchLeasedVmV2ResponseJson.error_summary, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || fetchLeasedVmV2ResponseJson.backend_error_code != null) {
            c9j5.AAP(fetchLeasedVmV2ResponseJson.backend_error_code, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || fetchLeasedVmV2ResponseJson.retry_after_ms != null) {
            c9j5.AAP(fetchLeasedVmV2ResponseJson.retry_after_ms, C9j1.A00, c9iZ, 4);
        }
        if (zAfR || fetchLeasedVmV2ResponseJson.max_retry_count != null) {
            c9j5.AAP(fetchLeasedVmV2ResponseJson.max_retry_count, C07729ii.A00, c9iZ, 5);
        }
        if (zAfR || fetchLeasedVmV2ResponseJson.cvm_eligibility != null) {
            c9j5.AAP(fetchLeasedVmV2ResponseJson.cvm_eligibility, CvmEligibilityJson$$serializer.INSTANCE, c9iZ, 6);
        }
    }

    public final List<VmEntryV2Json> component1() {
        return this.vm_list;
    }

    public final String component2() {
        return this.error_title;
    }

    public final String component3() {
        return this.error_summary;
    }

    public final String component4() {
        return this.backend_error_code;
    }

    public final Long component5() {
        return this.retry_after_ms;
    }

    public final Integer component6() {
        return this.max_retry_count;
    }

    public final CvmEligibilityJson component7() {
        return this.cvm_eligibility;
    }

    public final FetchLeasedVmV2ResponseJson copy(List<VmEntryV2Json> list, String str, String str2, String str3, Long l, Integer num, CvmEligibilityJson cvmEligibilityJson) {
        return new FetchLeasedVmV2ResponseJson(list, str, str2, str3, l, num, cvmEligibilityJson);
    }

    public final String getBackend_error_code() {
        return this.backend_error_code;
    }

    public final CvmEligibilityJson getCvm_eligibility() {
        return this.cvm_eligibility;
    }

    public final String getError_summary() {
        return this.error_summary;
    }

    public final String getError_title() {
        return this.error_title;
    }

    public final Integer getMax_retry_count() {
        return this.max_retry_count;
    }

    public final Long getRetry_after_ms() {
        return this.retry_after_ms;
    }

    public final List<VmEntryV2Json> getVm_list() {
        return this.vm_list;
    }

    public int hashCode() {
        return (((((((((((AnonymousClass006.A0D(this.vm_list) * 31) + AnonymousClass006.A0G(this.error_title)) * 31) + AnonymousClass006.A0G(this.error_summary)) * 31) + AnonymousClass006.A0G(this.backend_error_code)) * 31) + AnonymousClass006.A0D(this.retry_after_ms)) * 31) + AnonymousClass006.A0D(this.max_retry_count)) * 31) + C3cH.A02(this.cvm_eligibility);
    }

    public FetchLeasedVmV2ResponseJson(List<VmEntryV2Json> list, String str, String str2, String str3, Long l, Integer num, CvmEligibilityJson cvmEligibilityJson) {
        this.vm_list = list;
        this.error_title = str;
        this.error_summary = str2;
        this.backend_error_code = str3;
        this.retry_after_ms = l;
        this.max_retry_count = num;
        this.cvm_eligibility = cvmEligibilityJson;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FetchLeasedVmV2ResponseJson(List list, String str, String str2, String str3, Long l, Integer num, CvmEligibilityJson cvmEligibilityJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : cvmEligibilityJson);
    }

    public /* synthetic */ FetchLeasedVmV2ResponseJson(int i, List list, String str, String str2, String str3, Long l, Integer num, CvmEligibilityJson cvmEligibilityJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.vm_list = null;
        } else {
            this.vm_list = list;
        }
        if ((i & 2) == 0) {
            this.error_title = null;
        } else {
            this.error_title = str;
        }
        if ((i & 4) == 0) {
            this.error_summary = null;
        } else {
            this.error_summary = str2;
        }
        if ((i & 8) == 0) {
            this.backend_error_code = null;
        } else {
            this.backend_error_code = str3;
        }
        if ((i & 16) == 0) {
            this.retry_after_ms = null;
        } else {
            this.retry_after_ms = l;
        }
        if ((i & 32) == 0) {
            this.max_retry_count = null;
        } else {
            this.max_retry_count = num;
        }
        if ((i & 64) == 0) {
            this.cvm_eligibility = null;
        } else {
            this.cvm_eligibility = cvmEligibilityJson;
        }
    }

    public FetchLeasedVmV2ResponseJson() {
        this(null, null, null, null, null, null, null);
    }
}
