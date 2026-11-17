package com.whatsapp.accountlinking.ipc.api.models.linked;

import X.C06H;
import X.C07869jg;
import X.C2hx;
import X.C3cG;
import X.C9hr;
import X.FGI;
import com.whatsapp.accountlinking.ipc.api.models.LinkedOperation;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class GetNotificationCountOperation extends LinkedOperation {
    public static final Companion Companion = new Companion();
    public final int variant;
    public final int version;

    public final class Companion {
        public final C9hr<GetNotificationCountOperation> serializer() {
            return C07869jg.A00;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$java_com_whatsapp_accountlinking_ipc_api_api(com.whatsapp.accountlinking.ipc.api.models.linked.GetNotificationCountOperation r4, X.C9j5 r5, X.C9iZ r6) {
        /*
            r3 = 0
            boolean r2 = r5.AfR()
            r1 = 1
            if (r2 != 0) goto Lc
            int r0 = r4.version
            if (r0 == r1) goto L19
        Lc:
            int r0 = r4.version
            r5.AAK(r6, r3, r0)
            if (r2 == 0) goto L19
        L13:
            int r0 = r4.variant
            r5.AAK(r6, r1, r0)
        L18:
            return
        L19:
            int r0 = r4.variant
            if (r0 == 0) goto L18
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountlinking.ipc.api.models.linked.GetNotificationCountOperation.write$Self$java_com_whatsapp_accountlinking_ipc_api_api(com.whatsapp.accountlinking.ipc.api.models.linked.GetNotificationCountOperation, X.9j5, X.9iZ):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GetNotificationCountOperation) {
                GetNotificationCountOperation getNotificationCountOperation = (GetNotificationCountOperation) obj;
                if (this.version != getNotificationCountOperation.version || this.variant != getNotificationCountOperation.variant) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GetNotificationCountOperation copy$default(GetNotificationCountOperation getNotificationCountOperation, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = getNotificationCountOperation.version;
        }
        if ((i3 & 2) != 0) {
            i2 = getNotificationCountOperation.variant;
        }
        return new GetNotificationCountOperation(i, i2);
    }

    public static /* synthetic */ void getVariant$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public final int component1() {
        return this.version;
    }

    public final int component2() {
        return this.variant;
    }

    public final GetNotificationCountOperation copy(int i, int i2) {
        return new GetNotificationCountOperation(i, i2);
    }

    public final int getVariant() {
        return this.variant;
    }

    @Override // com.whatsapp.accountlinking.ipc.api.models.Operation
    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (this.version * 31) + this.variant;
    }

    public String toString() {
        return FGI.A0Y("GetNotificationCountOperation(version=", ", variant=", ")", this.version, this.variant);
    }

    public GetNotificationCountOperation(int i, int i2) {
        this.version = i;
        this.variant = i2;
    }

    public /* synthetic */ GetNotificationCountOperation(int i, int i2, int i3, C2hx c2hx) {
        this.version = (i & 1) == 0 ? 1 : i2;
        if ((i & 2) == 0) {
            this.variant = 0;
        } else {
            this.variant = i3;
        }
    }

    public /* synthetic */ GetNotificationCountOperation(int i, int i2, int i3, C06H c06h) {
        this((i3 & 1) != 0 ? 1 : i, C3cG.A01(i3, i2));
    }

    public GetNotificationCountOperation() {
        this(1, 0);
    }
}
