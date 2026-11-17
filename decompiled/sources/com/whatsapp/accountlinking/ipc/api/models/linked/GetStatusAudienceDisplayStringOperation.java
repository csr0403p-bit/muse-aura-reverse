package com.whatsapp.accountlinking.ipc.api.models.linked;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import X.C8OM;
import X.C9hr;
import com.whatsapp.accountlinking.ipc.api.models.LinkedOperation;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class GetStatusAudienceDisplayStringOperation extends LinkedOperation {
    public static final Companion Companion = new Companion();
    public final boolean fetchShortForm;
    public final String smbAuthorizationRequestId;
    public final int version;

    public final class Companion {
        public final C9hr<GetStatusAudienceDisplayStringOperation> serializer() {
            return C8OM.A00;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$java_com_whatsapp_accountlinking_ipc_api_api(com.whatsapp.accountlinking.ipc.api.models.linked.GetStatusAudienceDisplayStringOperation r4, X.C9j5 r5, X.C9iZ r6) {
        /*
            r2 = 0
            boolean r3 = r5.AfR()
            r1 = 1
            if (r3 != 0) goto Lc
            int r0 = r4.version
            if (r0 == r1) goto L27
        Lc:
            int r0 = r4.version
            r5.AAK(r6, r2, r0)
            if (r3 == 0) goto L27
        L13:
            boolean r0 = r4.fetchShortForm
            r5.AA7(r6, r1, r0)
        L18:
            r2 = 2
            if (r3 != 0) goto L1f
            java.lang.String r0 = r4.smbAuthorizationRequestId
            if (r0 == 0) goto L26
        L1f:
            X.9iq r1 = X.C07779iq.A01
            java.lang.String r0 = r4.smbAuthorizationRequestId
            r5.AAP(r0, r1, r6, r2)
        L26:
            return
        L27:
            boolean r0 = r4.fetchShortForm
            if (r0 == 0) goto L18
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountlinking.ipc.api.models.linked.GetStatusAudienceDisplayStringOperation.write$Self$java_com_whatsapp_accountlinking_ipc_api_api(com.whatsapp.accountlinking.ipc.api.models.linked.GetStatusAudienceDisplayStringOperation, X.9j5, X.9iZ):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GetStatusAudienceDisplayStringOperation) {
                GetStatusAudienceDisplayStringOperation getStatusAudienceDisplayStringOperation = (GetStatusAudienceDisplayStringOperation) obj;
                if (this.version != getStatusAudienceDisplayStringOperation.version || this.fetchShortForm != getStatusAudienceDisplayStringOperation.fetchShortForm || !C7384Etj.areEqual(this.smbAuthorizationRequestId, getStatusAudienceDisplayStringOperation.smbAuthorizationRequestId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GetStatusAudienceDisplayStringOperation copy$default(GetStatusAudienceDisplayStringOperation getStatusAudienceDisplayStringOperation, int i, boolean z, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = getStatusAudienceDisplayStringOperation.version;
        }
        if ((i2 & 2) != 0) {
            z = getStatusAudienceDisplayStringOperation.fetchShortForm;
        }
        if ((i2 & 4) != 0) {
            str = getStatusAudienceDisplayStringOperation.smbAuthorizationRequestId;
        }
        return new GetStatusAudienceDisplayStringOperation(i, z, str);
    }

    public static /* synthetic */ void getFetchShortForm$annotations() {
    }

    public static /* synthetic */ void getSmbAuthorizationRequestId$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public final int component1() {
        return this.version;
    }

    public final boolean component2() {
        return this.fetchShortForm;
    }

    public final String component3() {
        return this.smbAuthorizationRequestId;
    }

    public final GetStatusAudienceDisplayStringOperation copy(int i, boolean z, String str) {
        return new GetStatusAudienceDisplayStringOperation(i, z, str);
    }

    public final boolean getFetchShortForm() {
        return this.fetchShortForm;
    }

    public final String getSmbAuthorizationRequestId() {
        return this.smbAuthorizationRequestId;
    }

    @Override // com.whatsapp.accountlinking.ipc.api.models.Operation
    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return C0KA.A01(this.version * 31, this.fetchShortForm) + AnonymousClass006.A0G(this.smbAuthorizationRequestId);
    }

    public String toString() {
        int i = this.version;
        boolean z = this.fetchShortForm;
        String str = this.smbAuthorizationRequestId;
        StringBuilder sbA0y = C60O.A0y("GetStatusAudienceDisplayStringOperation(version=", i);
        sbA0y.append(", fetchShortForm=");
        sbA0y.append(z);
        return C3cJ.A0N(", smbAuthorizationRequestId=", str, sbA0y);
    }

    public GetStatusAudienceDisplayStringOperation(int i, boolean z, String str) {
        this.version = i;
        this.fetchShortForm = z;
        this.smbAuthorizationRequestId = str;
    }

    public /* synthetic */ GetStatusAudienceDisplayStringOperation(int i, int i2, boolean z, String str, C2hx c2hx) {
        this.version = (i & 1) == 0 ? 1 : i2;
        if ((i & 2) == 0) {
            this.fetchShortForm = false;
        } else {
            this.fetchShortForm = z;
        }
        if ((i & 4) == 0) {
            this.smbAuthorizationRequestId = null;
        } else {
            this.smbAuthorizationRequestId = str;
        }
    }

    public /* synthetic */ GetStatusAudienceDisplayStringOperation(int i, boolean z, String str, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? 1 : i, AnonymousClass001.A1Q(i2, z), AnonymousClass006.A0t(i2, str));
    }

    public GetStatusAudienceDisplayStringOperation() {
        this(1, false, null);
    }
}
