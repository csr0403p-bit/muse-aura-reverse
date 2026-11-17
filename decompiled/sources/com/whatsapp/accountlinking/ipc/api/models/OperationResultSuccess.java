package com.whatsapp.accountlinking.ipc.api.models;

import X.C07949ow;
import X.C2277BSd;
import X.C2hx;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.F0C;
import X.F60;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.Serializable;

@Polymorphic
@Serializable
/* loaded from: classes4.dex */
public class OperationResultSuccess extends OperationResult {
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {C2277BSd.A00(C79.A01, 0)};

    public final class Companion {
        public final C9hr<OperationResultSuccess> serializer() {
            return C07949ow.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OperationResultSuccess(int i, ResponseCode responseCode, C2hx c2hx) {
        super(i, responseCode, c2hx);
        if (1 != (i & 1)) {
            C9iI.A00(C07949ow.A01, i, 1);
            throw F60.createAndThrow();
        }
    }

    public OperationResultSuccess() {
        super(ResponseCode.A03);
    }
}
