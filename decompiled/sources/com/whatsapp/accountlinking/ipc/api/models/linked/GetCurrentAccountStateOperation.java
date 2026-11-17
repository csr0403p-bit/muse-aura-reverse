package com.whatsapp.accountlinking.ipc.api.models.linked;

import X.C06H;
import X.C2hx;
import X.C9Mu;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.FGI;
import com.whatsapp.accountlinking.ipc.api.models.LinkedOperation;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class GetCurrentAccountStateOperation extends LinkedOperation {
    public static final Companion Companion = new Companion();
    public final int version;

    public final class Companion {
        public final C9hr<GetCurrentAccountStateOperation> serializer() {
            return C9Mu.A00;
        }
    }

    public static final /* synthetic */ void write$Self$java_com_whatsapp_accountlinking_ipc_api_api(GetCurrentAccountStateOperation getCurrentAccountStateOperation, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || getCurrentAccountStateOperation.version != 1) {
            c9j5.AAK(c9iZ, 0, getCurrentAccountStateOperation.version);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof GetCurrentAccountStateOperation) && this.version == ((GetCurrentAccountStateOperation) obj).version);
    }

    public static /* synthetic */ GetCurrentAccountStateOperation copy$default(GetCurrentAccountStateOperation getCurrentAccountStateOperation, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = getCurrentAccountStateOperation.version;
        }
        return new GetCurrentAccountStateOperation(i);
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public final int component1() {
        return this.version;
    }

    public final GetCurrentAccountStateOperation copy(int i) {
        return new GetCurrentAccountStateOperation(i);
    }

    @Override // com.whatsapp.accountlinking.ipc.api.models.Operation
    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.version;
    }

    public String toString() {
        return FGI.A0I("GetCurrentAccountStateOperation(version=", this.version, ")");
    }

    public /* synthetic */ GetCurrentAccountStateOperation(int i, int i2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.version = 1;
        } else {
            this.version = i2;
        }
    }

    public GetCurrentAccountStateOperation(int i) {
        this.version = i;
    }

    public /* synthetic */ GetCurrentAccountStateOperation(int i, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? 1 : i);
    }

    public GetCurrentAccountStateOperation() {
        this(1);
    }
}
