package com.whatsapp.accountlinking.ipc.api.models;

import X.C07779iq;
import X.C2283BSj;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9pI;
import X.F0C;
import X.F60;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.Serializable;

@Polymorphic
@Serializable
/* loaded from: classes4.dex */
public class CreateAcUserAndRecordDisclosureResultSuccess extends OperationResult {
    public final String waLlinkingAuthProof;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, new C2283BSj(39));

    public final class Companion {
        public final C9hr<CreateAcUserAndRecordDisclosureResultSuccess> serializer() {
            return C9pI.A00;
        }
    }

    public CreateAcUserAndRecordDisclosureResultSuccess(String str) {
        super(ResponseCode.A03);
        this.waLlinkingAuthProof = str;
    }

    public static /* synthetic */ void getWaLlinkingAuthProof$annotations() {
    }

    public final String getWaLlinkingAuthProof() {
        return this.waLlinkingAuthProof;
    }

    public static final /* synthetic */ void write$Self(CreateAcUserAndRecordDisclosureResultSuccess createAcUserAndRecordDisclosureResultSuccess, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(createAcUserAndRecordDisclosureResultSuccess.responseCode, C3cH.A15(OperationResult.$childSerializers, 0), c9iZ, 0);
        c9j5.AAP(createAcUserAndRecordDisclosureResultSuccess.waLlinkingAuthProof, C07779iq.A01, c9iZ, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreateAcUserAndRecordDisclosureResultSuccess(int i, ResponseCode responseCode, String str, C2hx c2hx) {
        super(i, responseCode, c2hx);
        if (3 != (i & 3)) {
            C9iI.A00(C9pI.A01, i, 3);
            throw F60.createAndThrow();
        }
        this.waLlinkingAuthProof = str;
    }
}
