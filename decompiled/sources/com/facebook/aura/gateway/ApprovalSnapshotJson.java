package com.facebook.aura.gateway;

import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C10571Hud;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.C9sU;
import X.CFK;
import X.F0C;
import X.FGI;
import X.HsJ;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.json.HatchJsonKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes2.dex */
public final class ApprovalSnapshotJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final long emitted_at_ms;
    public final List<JsonElement> pending_approvals;
    public final List<ApprovalSnapshotRecordJson> recent_approvals;

    public final class Companion {
        public final C9hr<ApprovalSnapshotJson> serializer() {
            return ApprovalSnapshotJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{AbstractC5321DgF.A02(num, ApprovalSnapshotJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, ApprovalSnapshotJson$Companion$$childSerializers$2.INSTANCE), null};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalSnapshotJson) {
                ApprovalSnapshotJson approvalSnapshotJson = (ApprovalSnapshotJson) obj;
                if (!C7384Etj.areEqual(this.pending_approvals, approvalSnapshotJson.pending_approvals) || !C7384Etj.areEqual(this.recent_approvals, approvalSnapshotJson.recent_approvals) || this.emitted_at_ms != approvalSnapshotJson.emitted_at_ms) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApprovalSnapshotJson copy$default(ApprovalSnapshotJson approvalSnapshotJson, List list, List list2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            list = approvalSnapshotJson.pending_approvals;
        }
        if ((i & 2) != 0) {
            list2 = approvalSnapshotJson.recent_approvals;
        }
        if ((i & 4) != 0) {
            j = approvalSnapshotJson.emitted_at_ms;
        }
        return approvalSnapshotJson.copy(list, list2, j);
    }

    private final List<ApprovalSnapshotRecordJson> decodedPendingRecords() {
        Object c10571Hud;
        List<JsonElement> list = this.pending_approvals;
        ArrayList arrayListA0h = C3cG.A0h();
        for (JsonElement jsonElement : list) {
            try {
                C9sU c9sU = HatchJsonKt.HatchJson;
                int i = ApprovalSnapshotRecordJson.$stable;
                c10571Hud = (ApprovalSnapshotRecordJson) c9sU.A01(ApprovalSnapshotRecordJson$$serializer.INSTANCE, jsonElement);
            } catch (Throwable th) {
                c10571Hud = new C10571Hud(th);
            }
            Throwable thA00 = HsJ.A00(c10571Hud);
            if (thA00 != null) {
                CFK.A06(HatchAgentPermissionsRepositoryJsonKt.TAG, FGI.A0M("Skipping malformed approval snapshot record: ", thA00.getMessage()));
            }
            if (c10571Hud instanceof C10571Hud) {
                c10571Hud = null;
            }
            if (c10571Hud != null) {
                arrayListA0h.add(c10571Hud);
            }
        }
        return arrayListA0h;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ApprovalSnapshotJson approvalSnapshotJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(approvalSnapshotJson.pending_approvals)) {
            c9j5.AAQ(approvalSnapshotJson.pending_approvals, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(approvalSnapshotJson.recent_approvals)) {
            c9j5.AAQ(approvalSnapshotJson.recent_approvals, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || approvalSnapshotJson.emitted_at_ms != 0) {
            c9j5.AAN(c9iZ, 2, approvalSnapshotJson.emitted_at_ms);
        }
    }

    public final List<JsonElement> component1() {
        return this.pending_approvals;
    }

    public final List<ApprovalSnapshotRecordJson> component2() {
        return this.recent_approvals;
    }

    public final long component3() {
        return this.emitted_at_ms;
    }

    public final long getEmitted_at_ms() {
        return this.emitted_at_ms;
    }

    public final List<JsonElement> getPending_approvals() {
        return this.pending_approvals;
    }

    public final List<ApprovalSnapshotRecordJson> getRecent_approvals() {
        return this.recent_approvals;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.emitted_at_ms, AnonymousClass005.A0F(this.recent_approvals, AnonymousClass005.A0E(this.pending_approvals)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApprovalSnapshotJson(List<? extends JsonElement> list, List<ApprovalSnapshotRecordJson> list2, long j) {
        AnonymousClass003.A0u(list, list2);
        this.pending_approvals = list;
        this.recent_approvals = list2;
        this.emitted_at_ms = j;
    }

    public final ApprovalSnapshotJson copy(List<? extends JsonElement> list, List<ApprovalSnapshotRecordJson> list2, long j) {
        AnonymousClass003.A0u(list, list2);
        return new ApprovalSnapshotJson(list, list2, j);
    }

    public final Set<String> pendingApprovalIds() {
        List<ApprovalSnapshotRecordJson> listDecodedPendingRecords = decodedPendingRecords();
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        Iterator<ApprovalSnapshotRecordJson> it = listDecodedPendingRecords.iterator();
        while (it.hasNext()) {
            linkedHashSetA0k.add(it.next().approval_id);
        }
        return linkedHashSetA0k;
    }

    public final List<HatchAgentPermissionsRepository.AgentPermissionApproval> pendingToDomain() {
        List<ApprovalSnapshotRecordJson> listDecodedPendingRecords = decodedPendingRecords();
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<ApprovalSnapshotRecordJson> it = listDecodedPendingRecords.iterator();
        while (it.hasNext()) {
            HatchAgentPermissionsRepository.AgentPermissionApproval pendingDomainOrNull = it.next().toPendingDomainOrNull();
            if (pendingDomainOrNull != null) {
                arrayListA0h.add(pendingDomainOrNull);
            }
        }
        return arrayListA0h;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ApprovalSnapshotJson(int i, List list, List list2, long j, C2hx c2hx) {
        this.pending_approvals = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.recent_approvals = C0881AGi.A00;
        } else {
            this.recent_approvals = list2;
        }
        if ((i & 4) == 0) {
            this.emitted_at_ms = 0L;
        } else {
            this.emitted_at_ms = j;
        }
    }

    public /* synthetic */ ApprovalSnapshotJson(List list, List list2, long j, int i, C06H c06h) {
        this(C3cI.A10(list, i), C3cI.A11(list2, i), (i & 4) != 0 ? 0L : j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ApprovalSnapshotJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(c0881AGi, c0881AGi, 0L);
    }
}
