package com.whatsapp.accountlinking.ipc.api.models;

import X.C06H;
import X.C2hx;
import X.C9Mx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.FGI;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class GetRegisteredPhoneNumberOperation extends UnlinkedOperation {
    public static final Companion Companion = new Companion();
    public final int version;

    public final class Companion {
        public final C9hr<GetRegisteredPhoneNumberOperation> serializer() {
            return C9Mx.A00;
        }
    }

    public static final /* synthetic */ void write$Self$java_com_whatsapp_accountlinking_ipc_api_api(GetRegisteredPhoneNumberOperation getRegisteredPhoneNumberOperation, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || getRegisteredPhoneNumberOperation.version != 1) {
            c9j5.AAK(c9iZ, 0, getRegisteredPhoneNumberOperation.version);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof GetRegisteredPhoneNumberOperation) && this.version == ((GetRegisteredPhoneNumberOperation) obj).version);
    }

    public static /* synthetic */ GetRegisteredPhoneNumberOperation copy$default(GetRegisteredPhoneNumberOperation getRegisteredPhoneNumberOperation, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = getRegisteredPhoneNumberOperation.version;
        }
        return new GetRegisteredPhoneNumberOperation(i);
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public final int component1() {
        return this.version;
    }

    public final GetRegisteredPhoneNumberOperation copy(int i) {
        return new GetRegisteredPhoneNumberOperation(i);
    }

    @Override // com.whatsapp.accountlinking.ipc.api.models.Operation
    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.version;
    }

    @Override // com.whatsapp.accountlinking.ipc.api.models.UnlinkedOperation
    public boolean supportsUnregisteredUsers() {
        return true;
    }

    public String toString() {
        return FGI.A0I("GetRegisteredPhoneNumberOperation(version=", this.version, ")");
    }

    public /* synthetic */ GetRegisteredPhoneNumberOperation(int i, int i2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.version = 1;
        } else {
            this.version = i2;
        }
    }

    public GetRegisteredPhoneNumberOperation(int i) {
        this.version = i;
    }

    public /* synthetic */ GetRegisteredPhoneNumberOperation(int i, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? 1 : i);
    }

    public GetRegisteredPhoneNumberOperation() {
        this(1);
    }
}
