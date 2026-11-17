package com.whatsapp.accountlinking.ipc.api.models.linked;

import X.C07929oq;
import X.C2277BSd;
import X.C2hx;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.F0C;
import X.F60;
import com.whatsapp.accountlinking.ipc.api.models.OperationResult;
import com.whatsapp.accountlinking.ipc.api.models.ResponseCode;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.Serializable;

@Polymorphic
@Serializable
/* loaded from: classes4.dex */
public class ExecuteCrosspostOperationResultSuccess extends OperationResult {
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {C2277BSd.A00(C79.A01, 12)};

    public final class Companion {
        public final C9hr<ExecuteCrosspostOperationResultSuccess> serializer() {
            return C07929oq.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExecuteCrosspostOperationResultSuccess(int i, ResponseCode responseCode, C2hx c2hx) {
        super(i, responseCode, c2hx);
        if (1 != (i & 1)) {
            C9iI.A00(C07929oq.A01, i, 1);
            throw F60.createAndThrow();
        }
    }

    public ExecuteCrosspostOperationResultSuccess() {
        super(ResponseCode.A03);
    }
}
