package com.whatsapp.accountlinking.ipc.api.models.linked;

import X.AnonymousClass006;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C8PQ;
import X.C9hr;
import X.FGI;
import com.whatsapp.accountlinking.ipc.api.models.LinkedOperation;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class GetStatusAudienceStringsOperation extends LinkedOperation {
    public static final Companion Companion = new Companion();
    public final String smbAuthorizationRequestId;
    public final int version;

    public final class Companion {
        public final C9hr<GetStatusAudienceStringsOperation> serializer() {
            return C8PQ.A00;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$java_com_whatsapp_accountlinking_ipc_api_api(com.whatsapp.accountlinking.ipc.api.models.linked.GetStatusAudienceStringsOperation r4, X.C9j5 r5, X.C9iZ r6) {
        /*
            r3 = 0
            boolean r1 = r5.AfR()
            r2 = 1
            if (r1 != 0) goto Lc
            int r0 = r4.version
            if (r0 == r2) goto L1b
        Lc:
            int r0 = r4.version
            r5.AAK(r6, r3, r0)
            if (r1 == 0) goto L1b
        L13:
            X.9iq r1 = X.C07779iq.A01
            java.lang.String r0 = r4.smbAuthorizationRequestId
            r5.AAP(r0, r1, r6, r2)
        L1a:
            return
        L1b:
            java.lang.String r0 = r4.smbAuthorizationRequestId
            if (r0 == 0) goto L1a
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountlinking.ipc.api.models.linked.GetStatusAudienceStringsOperation.write$Self$java_com_whatsapp_accountlinking_ipc_api_api(com.whatsapp.accountlinking.ipc.api.models.linked.GetStatusAudienceStringsOperation, X.9j5, X.9iZ):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GetStatusAudienceStringsOperation) {
                GetStatusAudienceStringsOperation getStatusAudienceStringsOperation = (GetStatusAudienceStringsOperation) obj;
                if (this.version != getStatusAudienceStringsOperation.version || !C7384Etj.areEqual(this.smbAuthorizationRequestId, getStatusAudienceStringsOperation.smbAuthorizationRequestId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GetStatusAudienceStringsOperation copy$default(GetStatusAudienceStringsOperation getStatusAudienceStringsOperation, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = getStatusAudienceStringsOperation.version;
        }
        if ((i2 & 2) != 0) {
            str = getStatusAudienceStringsOperation.smbAuthorizationRequestId;
        }
        return new GetStatusAudienceStringsOperation(i, str);
    }

    public static /* synthetic */ void getSmbAuthorizationRequestId$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public final int component1() {
        return this.version;
    }

    public final String component2() {
        return this.smbAuthorizationRequestId;
    }

    public final GetStatusAudienceStringsOperation copy(int i, String str) {
        return new GetStatusAudienceStringsOperation(i, str);
    }

    public final String getSmbAuthorizationRequestId() {
        return this.smbAuthorizationRequestId;
    }

    @Override // com.whatsapp.accountlinking.ipc.api.models.Operation
    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (this.version * 31) + AnonymousClass006.A0G(this.smbAuthorizationRequestId);
    }

    public String toString() {
        return FGI.A09(this.version, "GetStatusAudienceStringsOperation(version=", ", smbAuthorizationRequestId=", this.smbAuthorizationRequestId, ")");
    }

    public GetStatusAudienceStringsOperation(int i, String str) {
        this.version = i;
        this.smbAuthorizationRequestId = str;
    }

    public /* synthetic */ GetStatusAudienceStringsOperation(int i, int i2, String str, C2hx c2hx) {
        this.version = (i & 1) == 0 ? 1 : i2;
        if ((i & 2) == 0) {
            this.smbAuthorizationRequestId = null;
        } else {
            this.smbAuthorizationRequestId = str;
        }
    }

    public /* synthetic */ GetStatusAudienceStringsOperation(int i, String str, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? 1 : i, AnonymousClass006.A0s(i2, str));
    }

    public GetStatusAudienceStringsOperation() {
        this(1, null);
    }
}
