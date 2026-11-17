package com.facebook.aura.gateway;

import X.AnonymousClass002;
import X.C10571Hud;
import X.C3cG;
import X.C7384Etj;
import X.C9sU;
import X.C9sZ;
import X.CFK;
import X.FGI;
import X.HsJ;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.json.HatchJsonKt;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes2.dex */
public abstract class HatchAgentPermissionsRepositoryJsonKt {
    public static final String TAG = "HatchAgentPermissionsJson";

    public static final HatchAgentPermissionsRepository.AgentPermissionApproval decodeApprovalSnapshotRecord(JsonElement jsonElement) {
        Object objA0s;
        C7384Etj.A0Y(jsonElement, 0);
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            int i = ApprovalSnapshotRecordJson.$stable;
            ApprovalSnapshotRecordJson$$serializer approvalSnapshotRecordJson$$serializer = ApprovalSnapshotRecordJson$$serializer.INSTANCE;
            C7384Etj.A0Y(approvalSnapshotRecordJson$$serializer, 0);
            objA0s = (ApprovalSnapshotRecordJson) C9sZ.A00(approvalSnapshotRecordJson$$serializer, c9sU, jsonElement);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        Throwable thA00 = HsJ.A00(objA0s);
        if (thA00 != null) {
            CFK.A06(TAG, FGI.A0M("Skipping malformed approval snapshot record: ", thA00.getMessage()));
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        ApprovalSnapshotRecordJson approvalSnapshotRecordJson = (ApprovalSnapshotRecordJson) objA0s;
        if (approvalSnapshotRecordJson != null) {
            return approvalSnapshotRecordJson.toDomain();
        }
        return null;
    }

    public static final String trimToNonEmpty(String str) {
        C7384Etj.A0Y(str, 0);
        String strA0l = AnonymousClass002.A0l(str);
        if (strA0l.length() <= 0) {
            return null;
        }
        return strA0l;
    }

    public static final HatchAgentPermissionsRepository.OutgoingMediaItem decodeOutgoingMediaItem(JsonElement jsonElement) {
        Object objA0s;
        try {
            objA0s = ((OutgoingMediaItemJson) HatchJsonKt.HatchJson.A01(OutgoingMediaItemJson$$serializer.INSTANCE, jsonElement)).toDomain();
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        return (HatchAgentPermissionsRepository.OutgoingMediaItem) objA0s;
    }

    public static final HatchAgentPermissionsRepository.CarRentalReservationApproval toCarRentalReservationOrNull(JsonElement jsonElement) {
        Object objA0s;
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            int i = CarRentalReservationApprovalJson.$stable;
            objA0s = (CarRentalReservationApprovalJson) c9sU.A01(CarRentalReservationApprovalJson$$serializer.INSTANCE, jsonElement);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        Throwable thA00 = HsJ.A00(objA0s);
        if (thA00 != null) {
            CFK.A06(TAG, FGI.A0M("Skipping malformed car_rental_reservation_payload: ", thA00.getMessage()));
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        CarRentalReservationApprovalJson carRentalReservationApprovalJson = (CarRentalReservationApprovalJson) objA0s;
        if (carRentalReservationApprovalJson != null) {
            return carRentalReservationApprovalJson.toDomainOrNull();
        }
        return null;
    }
}
