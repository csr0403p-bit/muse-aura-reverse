package com.whatsapp.accountlinking.ipc.api.models;

import X.C2277BSd;
import X.C2hx;
import X.C3cH;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9p0;
import X.F0C;
import X.F60;
import X.FGI;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.Serializable;

@Polymorphic
@Serializable
/* loaded from: classes4.dex */
public final class StatusApiEligibilityResultSuccess extends OperationResult {
    public final boolean enabled;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {C2277BSd.A00(C79.A01, 2), null};

    public final class Companion {
        public final C9hr<StatusApiEligibilityResultSuccess> serializer() {
            return C9p0.A00;
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof StatusApiEligibilityResultSuccess) && this.enabled == ((StatusApiEligibilityResultSuccess) obj).enabled);
    }

    public StatusApiEligibilityResultSuccess(boolean z) {
        super(ResponseCode.A03);
        this.enabled = z;
    }

    public static /* synthetic */ StatusApiEligibilityResultSuccess copy$default(StatusApiEligibilityResultSuccess statusApiEligibilityResultSuccess, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = statusApiEligibilityResultSuccess.enabled;
        }
        return new StatusApiEligibilityResultSuccess(z);
    }

    public static /* synthetic */ void getEnabled$annotations() {
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final StatusApiEligibilityResultSuccess copy(boolean z) {
        return new StatusApiEligibilityResultSuccess(z);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        return this.enabled ? 1231 : 1237;
    }

    public String toString() {
        return FGI.A0q("StatusApiEligibilityResultSuccess(enabled=", ")", this.enabled);
    }

    public static final /* synthetic */ void write$Self$java_com_whatsapp_accountlinking_ipc_api_api(StatusApiEligibilityResultSuccess statusApiEligibilityResultSuccess, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(statusApiEligibilityResultSuccess.responseCode, C3cH.A15(OperationResult.$childSerializers, 0), c9iZ, 0);
        c9j5.AA7(c9iZ, 1, statusApiEligibilityResultSuccess.enabled);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StatusApiEligibilityResultSuccess(int i, ResponseCode responseCode, boolean z, C2hx c2hx) {
        super(i, responseCode, c2hx);
        if (3 != (i & 3)) {
            C9iI.A00(C9p0.A01, i, 3);
            throw F60.createAndThrow();
        }
        this.enabled = z;
    }
}
