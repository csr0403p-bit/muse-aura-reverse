package com.whatsapp.accountlinking.ipc.api.models;

import X.C06H;
import X.C07889od;
import X.C2283BSj;
import X.C2hx;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9ij;
import X.C9j5;
import X.C9oT;
import X.C9oU;
import X.F0C;
import X.F60;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.Serializable;

@Polymorphic
@Serializable
/* loaded from: classes4.dex */
public class OperationResultError extends OperationResult {
    public final C9oU errorCode;
    public final ErrorSubCode errorSubCode;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cI.A1Z(C79.A01, new C2283BSj(49));

    public final class Companion {
        public final C9hr<OperationResultError> serializer() {
            return C07889od.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationResultError(C9oU c9oU, ErrorSubCode errorSubCode) {
        super(ResponseCode.A02);
        C7384Etj.A0Y(c9oU, 0);
        this.errorCode = c9oU;
        this.errorSubCode = errorSubCode;
    }

    @Serializable(with = C9oT.class)
    public static /* synthetic */ void getErrorCode$annotations() {
    }

    @Serializable(with = C9ij.class)
    public static /* synthetic */ void getErrorSubCode$annotations() {
    }

    public C9oU getErrorCode() {
        return this.errorCode;
    }

    public ErrorSubCode getErrorSubCode() {
        return this.errorSubCode;
    }

    public static final /* synthetic */ void write$Self(OperationResultError operationResultError, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(operationResultError.responseCode, C3cH.A15(OperationResult.$childSerializers, 0), c9iZ, 0);
        c9j5.AAQ(operationResultError.errorCode, C9oT.A00, c9iZ, 1);
        if (c9j5.AfR() || operationResultError.errorSubCode != null) {
            c9j5.AAP(operationResultError.errorSubCode, C9ij.A00, c9iZ, 2);
        }
    }

    public /* synthetic */ OperationResultError(C9oU c9oU, ErrorSubCode errorSubCode, int i, C06H c06h) {
        this(c9oU, (i & 2) != 0 ? null : errorSubCode);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OperationResultError(int i, ResponseCode responseCode, C9oU c9oU, ErrorSubCode errorSubCode, C2hx c2hx) {
        super(i, responseCode, c2hx);
        if (3 != (i & 3)) {
            C9iI.A00(C07889od.A01, i, 3);
            throw F60.createAndThrow();
        }
        this.errorCode = c9oU;
        if ((i & 4) == 0) {
            this.errorSubCode = null;
        } else {
            this.errorSubCode = errorSubCode;
        }
    }
}
