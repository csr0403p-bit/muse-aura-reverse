package com.whatsapp.accountlinking.ipc.api.models.linked;

import X.C2277BSd;
import X.C2hx;
import X.C3cH;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9p6;
import X.F0C;
import X.F60;
import X.FGI;
import com.whatsapp.accountlinking.ipc.api.models.OperationResult;
import com.whatsapp.accountlinking.ipc.api.models.ResponseCode;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.Serializable;

@Polymorphic
@Serializable
/* loaded from: classes4.dex */
public final class GetNotificationCountOperationResultSuccess extends OperationResult {
    public final int notificationCount;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {C2277BSd.A00(C79.A01, 14), null};

    public final class Companion {
        public final C9hr<GetNotificationCountOperationResultSuccess> serializer() {
            return C9p6.A00;
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof GetNotificationCountOperationResultSuccess) && this.notificationCount == ((GetNotificationCountOperationResultSuccess) obj).notificationCount);
    }

    public GetNotificationCountOperationResultSuccess(int i) {
        super(ResponseCode.A03);
        this.notificationCount = i;
    }

    public static /* synthetic */ GetNotificationCountOperationResultSuccess copy$default(GetNotificationCountOperationResultSuccess getNotificationCountOperationResultSuccess, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = getNotificationCountOperationResultSuccess.notificationCount;
        }
        return new GetNotificationCountOperationResultSuccess(i);
    }

    public static /* synthetic */ void getNotificationCount$annotations() {
    }

    public final int component1() {
        return this.notificationCount;
    }

    public final GetNotificationCountOperationResultSuccess copy(int i) {
        return new GetNotificationCountOperationResultSuccess(i);
    }

    public final int getNotificationCount() {
        return this.notificationCount;
    }

    public int hashCode() {
        return this.notificationCount;
    }

    public String toString() {
        return FGI.A0I("GetNotificationCountOperationResultSuccess(notificationCount=", this.notificationCount, ")");
    }

    public static final /* synthetic */ void write$Self$java_com_whatsapp_accountlinking_ipc_api_api(GetNotificationCountOperationResultSuccess getNotificationCountOperationResultSuccess, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(getNotificationCountOperationResultSuccess.responseCode, C3cH.A15(OperationResult.$childSerializers, 0), c9iZ, 0);
        c9j5.AAK(c9iZ, 1, getNotificationCountOperationResultSuccess.notificationCount);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetNotificationCountOperationResultSuccess(int i, ResponseCode responseCode, int i2, C2hx c2hx) {
        super(i, responseCode, c2hx);
        if (3 != (i & 3)) {
            C9iI.A00(C9p6.A01, i, 3);
            throw F60.createAndThrow();
        }
        this.notificationCount = i2;
    }
}
