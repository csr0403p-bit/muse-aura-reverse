package com.whatsapp.accountlinking.ipc.api.models.linked;

import X.C2277BSd;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iL;
import X.C9iZ;
import X.C9j5;
import X.C9oU;
import X.C9oZ;
import X.F0C;
import X.F60;
import com.whatsapp.accountlinking.ipc.api.models.ErrorSubCode;
import com.whatsapp.accountlinking.ipc.api.models.OperationResultError;
import com.whatsapp.accountlinking.ipc.api.models.ResponseCode;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.Serializable;

@Polymorphic
@Serializable
/* loaded from: classes4.dex */
public class QuickSendsMessageOperationResultError extends OperationResultError {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final ErrorSubCode error;

    public final class Companion {
        public final C9hr<QuickSendsMessageOperationResultError> serializer() {
            return C9oZ.A00;
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{C2277BSd.A00(num, 19), null, null, C2277BSd.A00(num, 20)};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickSendsMessageOperationResultError(ErrorSubCode errorSubCode) {
        super(C9oU.A03, errorSubCode);
        C7384Etj.A0Y(errorSubCode, 0);
        this.error = errorSubCode;
    }

    public static /* synthetic */ void getError$annotations() {
    }

    public final ErrorSubCode getError() {
        return this.error;
    }

    public static final /* synthetic */ C9hr _childSerializers$_anonymous_$0() {
        return C9iL.A01("com.whatsapp.accountlinking.ipc.api.models.ErrorSubCode", ErrorSubCode.values());
    }

    public static final /* synthetic */ void write$Self(QuickSendsMessageOperationResultError quickSendsMessageOperationResultError, C9j5 c9j5, C9iZ c9iZ) {
        OperationResultError.write$Self((OperationResultError) quickSendsMessageOperationResultError, c9j5, c9iZ);
        c9j5.AAQ(quickSendsMessageOperationResultError.error, C3cH.A15($childSerializers, 3), c9iZ, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QuickSendsMessageOperationResultError(int i, ResponseCode responseCode, C9oU c9oU, ErrorSubCode errorSubCode, ErrorSubCode errorSubCode2, C2hx c2hx) {
        super(i, responseCode, c9oU, errorSubCode, c2hx);
        if (11 != (i & 11)) {
            C9iI.A00(C9oZ.A01, i, 11);
            throw F60.createAndThrow();
        }
        this.error = errorSubCode2;
    }
}
