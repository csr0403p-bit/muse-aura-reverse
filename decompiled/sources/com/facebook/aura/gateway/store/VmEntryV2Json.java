package com.facebook.aura.gateway.store;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F0C;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class VmEntryV2Json extends C06G {

    /* renamed from: default, reason: not valid java name */
    public final boolean f64default;
    public final Long migration_completed_at_ms;
    public final String migration_state;
    public final Long notary_token_expiration_ts;
    public final String replace_attempt_id;
    public final String replaced_vm_id;
    public final String vm_auth_token;
    public final String vm_id;
    public final String vm_name;
    public final Map<String, String> vm_notary_tokens;
    public final String vm_state;
    public final String vm_type;
    public final String vm_ws_url;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, VmEntryV2Json$Companion$$childSerializers$1.INSTANCE), null, null, null, null};

    public final class Companion {
        public final C9hr<VmEntryV2Json> serializer() {
            return VmEntryV2Json$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public VmEntryV2Json() {
        this("", "", "", null, false, null, null, null, null, null, null, null, null);
    }

    public final VmEntryV2Json copy(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, Map<String, String> map, Long l, String str8, String str9, Long l2) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(str2, 1);
        C7384Etj.A0Y(str3, 2);
        return new VmEntryV2Json(str, str2, str3, str4, z, str5, str6, str7, map, l, str8, str9, l2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VmEntryV2Json) {
                VmEntryV2Json vmEntryV2Json = (VmEntryV2Json) obj;
                if (!C7384Etj.areEqual(this.vm_id, vmEntryV2Json.vm_id) || !C7384Etj.areEqual(this.vm_ws_url, vmEntryV2Json.vm_ws_url) || !C7384Etj.areEqual(this.vm_name, vmEntryV2Json.vm_name) || !C7384Etj.areEqual(this.vm_auth_token, vmEntryV2Json.vm_auth_token) || this.f64default != vmEntryV2Json.f64default || !C7384Etj.areEqual(this.vm_type, vmEntryV2Json.vm_type) || !C7384Etj.areEqual(this.vm_state, vmEntryV2Json.vm_state) || !C7384Etj.areEqual(this.replace_attempt_id, vmEntryV2Json.replace_attempt_id) || !C7384Etj.areEqual(this.vm_notary_tokens, vmEntryV2Json.vm_notary_tokens) || !C7384Etj.areEqual(this.notary_token_expiration_ts, vmEntryV2Json.notary_token_expiration_ts) || !C7384Etj.areEqual(this.replaced_vm_id, vmEntryV2Json.replaced_vm_id) || !C7384Etj.areEqual(this.migration_state, vmEntryV2Json.migration_state) || !C7384Etj.areEqual(this.migration_completed_at_ms, vmEntryV2Json.migration_completed_at_ms)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VmEntryV2Json copy$default(VmEntryV2Json vmEntryV2Json, String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, Map map, Long l, String str8, String str9, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vmEntryV2Json.vm_id;
        }
        if ((i & 2) != 0) {
            str2 = vmEntryV2Json.vm_ws_url;
        }
        if ((i & 4) != 0) {
            str3 = vmEntryV2Json.vm_name;
        }
        if ((i & 8) != 0) {
            str4 = vmEntryV2Json.vm_auth_token;
        }
        if ((i & 16) != 0) {
            z = vmEntryV2Json.f64default;
        }
        if ((i & 32) != 0) {
            str5 = vmEntryV2Json.vm_type;
        }
        if ((i & 64) != 0) {
            str6 = vmEntryV2Json.vm_state;
        }
        if ((i & 128) != 0) {
            str7 = vmEntryV2Json.replace_attempt_id;
        }
        if ((i & 256) != 0) {
            map = vmEntryV2Json.vm_notary_tokens;
        }
        if ((i & 512) != 0) {
            l = vmEntryV2Json.notary_token_expiration_ts;
        }
        if ((i & 1024) != 0) {
            str8 = vmEntryV2Json.replaced_vm_id;
        }
        if ((i & 2048) != 0) {
            str9 = vmEntryV2Json.migration_state;
        }
        if ((i & 4096) != 0) {
            l2 = vmEntryV2Json.migration_completed_at_ms;
        }
        return vmEntryV2Json.copy(str, str2, str3, str4, z, str5, str6, str7, map, l, str8, str9, l2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_store_store(VmEntryV2Json vmEntryV2Json, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(vmEntryV2Json.vm_id)) {
            c9j5.AAV(vmEntryV2Json.vm_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(vmEntryV2Json.vm_ws_url)) {
            c9j5.AAV(vmEntryV2Json.vm_ws_url, c9iZ, 1);
        }
        if (zAfR || !"".equals(vmEntryV2Json.vm_name)) {
            c9j5.AAV(vmEntryV2Json.vm_name, c9iZ, 2);
        }
        if (zAfR || vmEntryV2Json.vm_auth_token != null) {
            c9j5.AAP(vmEntryV2Json.vm_auth_token, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || vmEntryV2Json.f64default) {
            c9j5.AA7(c9iZ, 4, vmEntryV2Json.f64default);
        }
        if (zAfR || vmEntryV2Json.vm_type != null) {
            c9j5.AAP(vmEntryV2Json.vm_type, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || vmEntryV2Json.vm_state != null) {
            c9j5.AAP(vmEntryV2Json.vm_state, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || vmEntryV2Json.replace_attempt_id != null) {
            c9j5.AAP(vmEntryV2Json.replace_attempt_id, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || vmEntryV2Json.vm_notary_tokens != null) {
            c9j5.AAP(vmEntryV2Json.vm_notary_tokens, C3cH.A15(f0cArr, 8), c9iZ, 8);
        }
        if (zAfR || vmEntryV2Json.notary_token_expiration_ts != null) {
            c9j5.AAP(vmEntryV2Json.notary_token_expiration_ts, C9j1.A00, c9iZ, 9);
        }
        if (zAfR || vmEntryV2Json.replaced_vm_id != null) {
            c9j5.AAP(vmEntryV2Json.replaced_vm_id, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || vmEntryV2Json.migration_state != null) {
            c9j5.AAP(vmEntryV2Json.migration_state, C07779iq.A01, c9iZ, 11);
        }
        if (zAfR || vmEntryV2Json.migration_completed_at_ms != null) {
            c9j5.AAP(vmEntryV2Json.migration_completed_at_ms, C9j1.A00, c9iZ, 12);
        }
    }

    public final String component1() {
        return this.vm_id;
    }

    public final Long component10() {
        return this.notary_token_expiration_ts;
    }

    public final String component11() {
        return this.replaced_vm_id;
    }

    public final String component12() {
        return this.migration_state;
    }

    public final Long component13() {
        return this.migration_completed_at_ms;
    }

    public final String component2() {
        return this.vm_ws_url;
    }

    public final String component3() {
        return this.vm_name;
    }

    public final String component4() {
        return this.vm_auth_token;
    }

    public final boolean component5() {
        return this.f64default;
    }

    public final String component6() {
        return this.vm_type;
    }

    public final String component7() {
        return this.vm_state;
    }

    public final String component8() {
        return this.replace_attempt_id;
    }

    public final Map<String, String> component9() {
        return this.vm_notary_tokens;
    }

    public final boolean getDefault() {
        return this.f64default;
    }

    public final Long getMigration_completed_at_ms() {
        return this.migration_completed_at_ms;
    }

    public final String getMigration_state() {
        return this.migration_state;
    }

    public final Long getNotary_token_expiration_ts() {
        return this.notary_token_expiration_ts;
    }

    public final String getReplace_attempt_id() {
        return this.replace_attempt_id;
    }

    public final String getReplaced_vm_id() {
        return this.replaced_vm_id;
    }

    public final String getVm_auth_token() {
        return this.vm_auth_token;
    }

    public final String getVm_id() {
        return this.vm_id;
    }

    public final String getVm_name() {
        return this.vm_name;
    }

    public final Map<String, String> getVm_notary_tokens() {
        return this.vm_notary_tokens;
    }

    public final String getVm_state() {
        return this.vm_state;
    }

    public final String getVm_type() {
        return this.vm_type;
    }

    public final String getVm_ws_url() {
        return this.vm_ws_url;
    }

    public int hashCode() {
        return ((((((((((((((C0KA.A01((AnonymousClass005.A0I(this.vm_name, AnonymousClass005.A0I(this.vm_ws_url, AnonymousClass001.A0G(this.vm_id))) + AnonymousClass006.A0G(this.vm_auth_token)) * 31, this.f64default) + AnonymousClass006.A0G(this.vm_type)) * 31) + AnonymousClass006.A0G(this.vm_state)) * 31) + AnonymousClass006.A0G(this.replace_attempt_id)) * 31) + AnonymousClass006.A0D(this.vm_notary_tokens)) * 31) + AnonymousClass006.A0D(this.notary_token_expiration_ts)) * 31) + AnonymousClass006.A0G(this.replaced_vm_id)) * 31) + AnonymousClass006.A0G(this.migration_state)) * 31) + C3cH.A02(this.migration_completed_at_ms);
    }

    public String toString() {
        return super.toString();
    }

    public VmEntryV2Json(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, Map<String, String> map, Long l, String str8, String str9, Long l2) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(str2, 1);
        C7384Etj.A0Y(str3, 2);
        this.vm_id = str;
        this.vm_ws_url = str2;
        this.vm_name = str3;
        this.vm_auth_token = str4;
        this.f64default = z;
        this.vm_type = str5;
        this.vm_state = str6;
        this.replace_attempt_id = str7;
        this.vm_notary_tokens = map;
        this.notary_token_expiration_ts = l;
        this.replaced_vm_id = str8;
        this.migration_state = str9;
        this.migration_completed_at_ms = l2;
    }

    public /* synthetic */ VmEntryV2Json(int i, String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, Map map, Long l, String str8, String str9, Long l2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.vm_id = "";
        } else {
            this.vm_id = str;
        }
        if ((i & 2) == 0) {
            this.vm_ws_url = "";
        } else {
            this.vm_ws_url = str2;
        }
        if ((i & 4) == 0) {
            this.vm_name = "";
        } else {
            this.vm_name = str3;
        }
        if ((i & 8) == 0) {
            this.vm_auth_token = null;
        } else {
            this.vm_auth_token = str4;
        }
        if ((i & 16) == 0) {
            this.f64default = false;
        } else {
            this.f64default = z;
        }
        if ((i & 32) == 0) {
            this.vm_type = null;
        } else {
            this.vm_type = str5;
        }
        if ((i & 64) == 0) {
            this.vm_state = null;
        } else {
            this.vm_state = str6;
        }
        if ((i & 128) == 0) {
            this.replace_attempt_id = null;
        } else {
            this.replace_attempt_id = str7;
        }
        if ((i & 256) == 0) {
            this.vm_notary_tokens = null;
        } else {
            this.vm_notary_tokens = map;
        }
        if ((i & 512) == 0) {
            this.notary_token_expiration_ts = null;
        } else {
            this.notary_token_expiration_ts = l;
        }
        if ((i & 1024) == 0) {
            this.replaced_vm_id = null;
        } else {
            this.replaced_vm_id = str8;
        }
        if ((i & 2048) == 0) {
            this.migration_state = null;
        } else {
            this.migration_state = str9;
        }
        if ((i & 4096) == 0) {
            this.migration_completed_at_ms = null;
        } else {
            this.migration_completed_at_ms = l2;
        }
    }

    public /* synthetic */ VmEntryV2Json(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, Map map, Long l, String str8, String str9, Long l2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? null : str4, C3cI.A1S(i, z), (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : map, (i & 512) != 0 ? null : l, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : l2);
    }
}
