package com.facebook.aura.gateway;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.C0881AGi;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchCvmColdLeaseException;
import com.facebook.aura.gateway.store.VmEntryV2Json;
import com.facebook.aura.gateway.store.VmEntryV2JsonKt;
import com.facebook.aura.settings.HatchCredentialsViewModelKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class HatchVmRepositoryKt {
    public static final String CVM_COLD_LEASE_VM_LIMIT = "CVM_COLD_LEASE_VM_LIMIT";
    public static final long DESTROY_AND_RELEASE_VM_TIMEOUT_MS = 60000;
    public static final int ENABLE_VM_MAX_ATTEMPTS = 2;
    public static final long ENABLE_VM_RETRY_DELAY_MS = 500;
    public static final String ERROR_MESSAGE_ALL_VMS_MISSING_VM_AUTH_TOKEN = "all_vms_missing_vm_auth_token";
    public static final String ERROR_MESSAGE_ALL_VMS_MISSING_VM_WS_URL = "all_vms_missing_vm_ws_url";
    public static final String ERROR_MESSAGE_BACKEND_ERROR_PREFIX = "backend_error_code:";
    public static final String ERROR_MESSAGE_CACHED_VM_MISSING = "cached_vm_missing";
    public static final String ERROR_MESSAGE_EMPTY_VM_LIST = "empty_vm_list";
    public static final String ERROR_MESSAGE_ENABLE_VM_FAILED = "enable_vm_failed";
    public static final String ERROR_MESSAGE_MISSING_ENV_ID = "missing_env_id";
    public static final String ERROR_MESSAGE_MISSING_VM_AUTH_TOKEN = "missing_vm_auth_token";
    public static final String ERROR_MESSAGE_SERVER_VM_UNAVAILABLE = "server_vm_unavailable";
    public static final String ERROR_MESSAGE_TRANSPORT_ERROR = "transport_error";
    public static final String ERROR_TYPE_BACKEND_ERROR = "BackendError";
    public static final String ERROR_TYPE_CACHED_VM_MISSING = "CachedVmMissing";
    public static final String ERROR_TYPE_COLD_LEASE_NOT_READY = "ColdLease_not_ready";
    public static final String ERROR_TYPE_ENABLE_VM_PREFIX = "EnableVmHttp";
    public static final String ERROR_TYPE_MISSING_ACCESS_TOKEN = "MissingAccessToken";
    public static final String ERROR_TYPE_MISSING_ENV_ID = "MissingEnvId";
    public static final String ERROR_TYPE_NO_VALID_VM_CREDENTIAL = "NoValidVmCredential";
    public static final String ERROR_TYPE_NO_VALID_VM_URL = "NoValidVmUrl";
    public static final String ERROR_TYPE_VM_CREDENTIALS_NOT_SAVED = "VmCredentialsNotSaved";
    public static final String ERROR_TYPE_VM_REPLACE_NOT_SENT = "VmReplaceNotSent";
    public static final String ERROR_TYPE_VM_REPLACE_REFUSED = "VmReplaceRefused";
    public static final String ERROR_TYPE_VM_UNAVAILABLE = "VmUnavailable";
    public static final String EVENT_LEASE_VM = "lease_vm";
    public static final int HTTP_CONFLICT = 409;
    public static final int RESTART_SAVE_ATTEMPTS = 3;
    public static final long RESTART_SAVE_RETRY_DELAY_MS = 200;
    public static final String RESULT_ERROR = "error";
    public static final String RESULT_SUCCESS = "success";
    public static final String TAG = "HatchVmRepository";
    public static final Set<HatchCvmColdLeaseException.Reason> TERMINAL_COLD_LEASE_REASONS = BFI.A0H(new HatchCvmColdLeaseException.Reason[]{HatchCvmColdLeaseException.Reason.INVALID_REQUEST, HatchCvmColdLeaseException.Reason.ACCESS_DENIED, HatchCvmColdLeaseException.Reason.COLD_LEASE_DISABLED, HatchCvmColdLeaseException.Reason.VM_LIMIT});
    public static final Set<String> TERMINAL_REPLACE_REFUSALS = BFI.A0H(new String[]{"destroy_and_replace_disabled", "access_denied", HatchCredentialsViewModelKt.SECURE_STORAGE_FAILURE_INVALID_REQUEST});

    public static final HatchlingVmType replacementVmType(String str, String str2) {
        VmEntryV2Json next;
        VmEntryV2Json next2;
        C7384Etj.A0Y(str2, 1);
        List<VmEntryV2Json> listDecodeCachedVmList = VmEntryV2JsonKt.decodeCachedVmList(str);
        String strA0l = AnonymousClass002.A0l(str2);
        Iterator<VmEntryV2Json> it = listDecodeCachedVmList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(AnonymousClass002.A0l(next.vm_ws_url), strA0l) && strA0l.length() > 0) {
                break;
            }
        }
        VmEntryV2Json vmEntryV2Json = next;
        if (vmEntryV2Json == null) {
            Iterator<VmEntryV2Json> it2 = listDecodeCachedVmList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (next2.f64default) {
                    break;
                }
            }
            vmEntryV2Json = next2;
            if (vmEntryV2Json == null) {
                vmEntryV2Json = (VmEntryV2Json) AbstractC0878AGe.A0K(listDecodeCachedVmList);
            }
        }
        return HatchlingVmType.Companion.fromResponseWire(vmEntryV2Json != null ? vmEntryV2Json.vm_type : null);
    }

    public static final FetchedVmListResolution resolveFetchedVmList(FetchLeasedVmV2ResponseJson fetchLeasedVmV2ResponseJson, String str) {
        C7384Etj.A0Y(fetchLeasedVmV2ResponseJson, 0);
        String str2 = fetchLeasedVmV2ResponseJson.backend_error_code;
        if (str2 == null || str2.length() <= 0) {
            List list = fetchLeasedVmV2ResponseJson.vm_list;
            if (list == null) {
                list = C0881AGi.A00;
            }
            return new FetchedVmListResolution(list, null);
        }
        List<VmEntryV2Json> listDecodeCachedVmList = VmEntryV2JsonKt.decodeCachedVmList(str);
        if (listDecodeCachedVmList.isEmpty()) {
            return null;
        }
        return new FetchedVmListResolution(listDecodeCachedVmList, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.gateway.GatewayVmCredentialSelection selectGatewayVmCredential(java.util.List<com.facebook.aura.gateway.store.VmEntryV2Json> r24, java.lang.String r25, long r26, boolean r28) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmRepositoryKt.selectGatewayVmCredential(java.util.List, java.lang.String, long, boolean):com.facebook.aura.gateway.GatewayVmCredentialSelection");
    }

    public static /* synthetic */ GatewayVmCredentialSelection selectGatewayVmCredential$default(List list, String str, long j, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 0;
        }
        return selectGatewayVmCredential(list, str, j, AnonymousClass005.A1P(i, z));
    }

    public static final boolean shouldProactivelyWake(HatchVmState hatchVmState) {
        return AnonymousClass002.A1Z(hatchVmState, HatchVmState.SUSPENDED);
    }

    public static final String vmUnavailableErrorMessage(String str, String str2) {
        List listA0F = BFI.A0F(new String[]{str, str2});
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : listA0F) {
            AnonymousClass006.A1F((String) obj, obj, arrayListA0h);
        }
        String strA0e = C3cH.A0e(": ", arrayListA0h);
        return strA0e.length() == 0 ? ERROR_MESSAGE_SERVER_VM_UNAVAILABLE : strA0e;
    }
}
