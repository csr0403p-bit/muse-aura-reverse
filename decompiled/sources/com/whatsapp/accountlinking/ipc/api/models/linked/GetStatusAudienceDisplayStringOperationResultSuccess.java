package com.whatsapp.accountlinking.ipc.api.models.linked;

import X.AnonymousClass006;
import X.C06H;
import X.C07779iq;
import X.C2277BSd;
import X.C2hx;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9pC;
import X.F0C;
import X.F60;
import com.whatsapp.accountlinking.ipc.api.models.OperationResult;
import com.whatsapp.accountlinking.ipc.api.models.ResponseCode;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.Serializable;

@Polymorphic
@Serializable
/* loaded from: classes4.dex */
public class GetStatusAudienceDisplayStringOperationResultSuccess extends OperationResult {
    public final String displayString;
    public final String smbAuthorizationRequestId;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cI.A1Z(C79.A01, new C2277BSd(15));

    public final class Companion {
        public final C9hr<GetStatusAudienceDisplayStringOperationResultSuccess> serializer() {
            return C9pC.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetStatusAudienceDisplayStringOperationResultSuccess(String str, String str2) {
        super(ResponseCode.A03);
        C7384Etj.A0Y(str, 0);
        this.displayString = str;
        this.smbAuthorizationRequestId = str2;
    }

    public static /* synthetic */ void getDisplayString$annotations() {
    }

    public static /* synthetic */ void getSmbAuthorizationRequestId$annotations() {
    }

    public final String getDisplayString() {
        return this.displayString;
    }

    public final String getSmbAuthorizationRequestId() {
        return this.smbAuthorizationRequestId;
    }

    public static final /* synthetic */ void write$Self(GetStatusAudienceDisplayStringOperationResultSuccess getStatusAudienceDisplayStringOperationResultSuccess, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(getStatusAudienceDisplayStringOperationResultSuccess.responseCode, C3cH.A15(OperationResult.$childSerializers, 0), c9iZ, 0);
        c9j5.AAV(getStatusAudienceDisplayStringOperationResultSuccess.displayString, c9iZ, 1);
        if (c9j5.AfR() || getStatusAudienceDisplayStringOperationResultSuccess.smbAuthorizationRequestId != null) {
            c9j5.AAP(getStatusAudienceDisplayStringOperationResultSuccess.smbAuthorizationRequestId, C07779iq.A01, c9iZ, 2);
        }
    }

    public /* synthetic */ GetStatusAudienceDisplayStringOperationResultSuccess(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetStatusAudienceDisplayStringOperationResultSuccess(int i, ResponseCode responseCode, String str, String str2, C2hx c2hx) {
        super(i, responseCode, c2hx);
        if (3 != (i & 3)) {
            C9iI.A00(C9pC.A01, i, 3);
            throw F60.createAndThrow();
        }
        this.displayString = str;
        if ((i & 4) == 0) {
            this.smbAuthorizationRequestId = null;
        } else {
            this.smbAuthorizationRequestId = str2;
        }
    }
}
