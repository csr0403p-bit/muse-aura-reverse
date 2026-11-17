package com.facebook.aura.gateway;

import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.BFI;
import X.BLG;
import X.C06H;
import X.C0881AGi;
import X.C1BN;
import X.C3Pi;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import X.HnJ;
import X.InterfaceC7549F2g;
import com.facebook.aura.gateway.store.VmEntryV2Json;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class HatchCvmMigrationStore implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final Set<String> ENDED_MIGRATION_STATES = BFI.A0H(new String[]{"succeeded", "failed"});
    public final BLG<List<String>> _pendingSourceVmIds;
    public volatile boolean isFollowingTransfer;
    public final C1BN<List<String>> pendingSourceVmIds;

    public final void setPendingSources$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(List<VmEntryV2Json> list) {
        C7384Etj.A0Y(list, 0);
        BLG<List<String>> blg = this._pendingSourceVmIds;
        ArrayList arrayListA0h = C3cG.A0h();
        for (VmEntryV2Json vmEntryV2Json : list) {
            VmEntryV2Json vmEntryV2Json2 = vmEntryV2Json;
            if (HatchlingVmType.Companion.fromResponseWire(vmEntryV2Json2.vm_type) == HatchlingVmType.HATCH_CVM && !AbstractC0878AGe.A0k(ENDED_MIGRATION_STATES, vmEntryV2Json2.migration_state)) {
                arrayListA0h.add(vmEntryV2Json);
            }
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            String str = ((VmEntryV2Json) it.next()).replaced_vm_id;
            if (str != null && str.length() > 0) {
                arrayListA0h2.add(str);
            }
        }
        AnonymousClass002.A1I(blg, arrayListA0h2);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this._pendingSourceVmIds.Af8(C0881AGi.A00);
        this.isFollowingTransfer = false;
    }

    public final C1BN<List<String>> getPendingSourceVmIds() {
        return this.pendingSourceVmIds;
    }

    public final boolean isFollowingTransfer() {
        return this.isFollowingTransfer;
    }

    public final void setFollowingTransfer(boolean z) {
        this.isFollowingTransfer = z;
    }

    public final class Companion {
        public final HatchCvmMigrationStore getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchCvmMigrationStore) abstractC3358CGz.A03(HatchCvmMigrationStore.class, HatchCvmMigrationStore$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchCvmMigrationStore(C06H c06h) {
        this();
    }

    public HatchCvmMigrationStore() {
        C9286GCn c9286GCnA01 = HnJ.A01(C0881AGi.A00);
        this._pendingSourceVmIds = c9286GCnA01;
        this.pendingSourceVmIds = C3Pi.A00(c9286GCnA01);
    }
}
