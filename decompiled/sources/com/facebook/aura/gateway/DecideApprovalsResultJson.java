package com.facebook.aura.gateway;

import X.AGH;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C10571Hud;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.CFK;
import X.F0C;
import X.F60;
import X.HsJ;
import X.HxE;
import com.facebook.aura.json.HatchJsonKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes2.dex */
public final class DecideApprovalsResultJson extends C06G {
    public static final int $stable = 0;
    public final List<JsonElement> results;
    public final ApprovalSnapshotJson snapshot;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, DecideApprovalsResultJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<DecideApprovalsResultJson> serializer() {
            return DecideApprovalsResultJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DecideApprovalsResultJson(List<? extends JsonElement> list, ApprovalSnapshotJson approvalSnapshotJson) {
        C7384Etj.A0Y(approvalSnapshotJson, 1);
        this.results = list;
        this.snapshot = approvalSnapshotJson;
    }

    public final DecideApprovalsResultJson copy(List<? extends JsonElement> list, ApprovalSnapshotJson approvalSnapshotJson) {
        C7384Etj.A0Y(approvalSnapshotJson, 1);
        return new DecideApprovalsResultJson(list, approvalSnapshotJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DecideApprovalsResultJson) {
                DecideApprovalsResultJson decideApprovalsResultJson = (DecideApprovalsResultJson) obj;
                if (!C7384Etj.areEqual(this.results, decideApprovalsResultJson.results) || !C7384Etj.areEqual(this.snapshot, decideApprovalsResultJson.snapshot)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DecideApprovalsResultJson copy$default(DecideApprovalsResultJson decideApprovalsResultJson, List list, ApprovalSnapshotJson approvalSnapshotJson, int i, Object obj) {
        if ((i & 1) != 0) {
            list = decideApprovalsResultJson.results;
        }
        if ((i & 2) != 0) {
            approvalSnapshotJson = decideApprovalsResultJson.snapshot;
        }
        C7384Etj.A0Y(approvalSnapshotJson, 1);
        return new DecideApprovalsResultJson(list, approvalSnapshotJson);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(DecideApprovalsResultJson decideApprovalsResultJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || decideApprovalsResultJson.results != null) {
            c9j5.AAP(decideApprovalsResultJson.results, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        c9j5.AAQ(decideApprovalsResultJson.snapshot, ApprovalSnapshotJson$$serializer.INSTANCE, c9iZ, 1);
    }

    public final List<JsonElement> component1() {
        return this.results;
    }

    public final ApprovalSnapshotJson component2() {
        return this.snapshot;
    }

    public final Map<String, ApprovalDecisionResultJson> decodedResults() {
        Object objA0s;
        String str;
        List<JsonElement> list = this.results;
        if (list == null) {
            return null;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<JsonElement> it = list.iterator();
        while (it.hasNext()) {
            try {
                objA0s = (ApprovalDecisionResultJson) HatchJsonKt.HatchJson.A01(ApprovalDecisionResultJson$$serializer.INSTANCE, it.next());
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (HsJ.A00(objA0s) != null) {
                CFK.A06(HatchAgentPermissionsRepositoryJsonKt.TAG, "Skipping malformed approval decision result");
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            ApprovalDecisionResultJson approvalDecisionResultJson = (ApprovalDecisionResultJson) objA0s;
            HxE hxEA0r = (approvalDecisionResultJson == null || (str = approvalDecisionResultJson.approval_id) == null) ? null : C3cG.A0r(str, approvalDecisionResultJson);
            if (hxEA0r != null) {
                arrayListA0h.add(hxEA0r);
            }
        }
        return AGH.A06(arrayListA0h);
    }

    public final List<JsonElement> getResults() {
        return this.results;
    }

    public final ApprovalSnapshotJson getSnapshot() {
        return this.snapshot;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.snapshot, AnonymousClass006.A0D(this.results) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DecideApprovalsResultJson(int i, List list, ApprovalSnapshotJson approvalSnapshotJson, C2hx c2hx) {
        if (2 != (i & 2)) {
            C9iI.A00(DecideApprovalsResultJson$$serializer.descriptor, i, 2);
            throw F60.createAndThrow();
        }
        this.results = (i & 1) == 0 ? null : list;
        this.snapshot = approvalSnapshotJson;
    }

    public /* synthetic */ DecideApprovalsResultJson(List list, ApprovalSnapshotJson approvalSnapshotJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : list, approvalSnapshotJson);
    }
}
