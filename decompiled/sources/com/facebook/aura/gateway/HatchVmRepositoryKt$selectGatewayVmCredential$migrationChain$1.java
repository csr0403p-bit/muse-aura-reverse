package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.gateway.store.VmEntryV2Json;
import com.facebook.aura.gateway.store.VmEntryV2JsonKt;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class HatchVmRepositoryKt$selectGatewayVmCredential$migrationChain$1 extends AbstractC7559F3s implements G0U<String, String> {
    public final /* synthetic */ List<VmEntryV2Json> $fetchedVms;
    public final /* synthetic */ long $migrationStampMs;

    @Override // X.G0U
    public final String invoke(String str) {
        VmEntryV2Json next;
        String str2;
        C7384Etj.A0Y(str, 0);
        List<VmEntryV2Json> list = this.$fetchedVms;
        long j = this.$migrationStampMs;
        Iterator<VmEntryV2Json> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            VmEntryV2Json vmEntryV2Json = next;
            String str3 = vmEntryV2Json.replaced_vm_id;
            if (str.equals(str3 != null ? AnonymousClass002.A0l(str3) : null) && "succeeded".equals(vmEntryV2Json.migration_state)) {
                Long lMigrationCompletedAtMs = VmEntryV2JsonKt.migrationCompletedAtMs(vmEntryV2Json);
                if ((lMigrationCompletedAtMs != null ? lMigrationCompletedAtMs.longValue() : 0L) > j) {
                    break;
                }
            }
        }
        VmEntryV2Json vmEntryV2Json2 = next;
        if (vmEntryV2Json2 == null || (str2 = vmEntryV2Json2.vm_id) == null) {
            return null;
        }
        return AnonymousClass002.A0l(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVmRepositoryKt$selectGatewayVmCredential$migrationChain$1(List<VmEntryV2Json> list, long j) {
        super(1);
        this.$fetchedVms = list;
        this.$migrationStampMs = j;
    }
}
