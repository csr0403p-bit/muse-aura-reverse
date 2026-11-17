package com.whatsapp.accountlinking.ipc.api.models.linked;

import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C06H;
import X.C07779iq;
import X.C2277BSd;
import X.C2hx;
import X.C3cH;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9pA;
import X.F0C;
import X.F60;
import com.whatsapp.accountlinking.ipc.api.models.OperationResult;
import com.whatsapp.accountlinking.ipc.api.models.ResponseCode;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.Serializable;

@Polymorphic
@Serializable
/* loaded from: classes4.dex */
public class GetStatusAudienceStringsOperationResultSuccess extends OperationResult {
    public final String longFormDisplayString;
    public final String shortFormDisplayString;
    public final String smbAuthorizationRequestId;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {C2277BSd.A00(C79.A01, 16), null, null, null};

    public final class Companion {
        public final C9hr<GetStatusAudienceStringsOperationResultSuccess> serializer() {
            return C9pA.A00;
        }
    }

    public static /* synthetic */ void getLongFormDisplayString$annotations() {
    }

    public static /* synthetic */ void getShortFormDisplayString$annotations() {
    }

    public static /* synthetic */ void getSmbAuthorizationRequestId$annotations() {
    }

    public final String getLongFormDisplayString() {
        return this.longFormDisplayString;
    }

    public final String getShortFormDisplayString() {
        return this.shortFormDisplayString;
    }

    public final String getSmbAuthorizationRequestId() {
        return this.smbAuthorizationRequestId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetStatusAudienceStringsOperationResultSuccess(String str, String str2, String str3) {
        super(ResponseCode.A03);
        AnonymousClass003.A0u(str, str2);
        this.shortFormDisplayString = str;
        this.longFormDisplayString = str2;
        this.smbAuthorizationRequestId = str3;
    }

    public static final /* synthetic */ void write$Self(GetStatusAudienceStringsOperationResultSuccess getStatusAudienceStringsOperationResultSuccess, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(getStatusAudienceStringsOperationResultSuccess.responseCode, C3cH.A15(OperationResult.$childSerializers, 0), c9iZ, 0);
        c9j5.AAV(getStatusAudienceStringsOperationResultSuccess.shortFormDisplayString, c9iZ, 1);
        c9j5.AAV(getStatusAudienceStringsOperationResultSuccess.longFormDisplayString, c9iZ, 2);
        if (c9j5.AfR() || getStatusAudienceStringsOperationResultSuccess.smbAuthorizationRequestId != null) {
            c9j5.AAP(getStatusAudienceStringsOperationResultSuccess.smbAuthorizationRequestId, C07779iq.A01, c9iZ, 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetStatusAudienceStringsOperationResultSuccess(int i, ResponseCode responseCode, String str, String str2, String str3, C2hx c2hx) {
        super(i, responseCode, c2hx);
        if (7 != (i & 7)) {
            C9iI.A00(C9pA.A01, i, 7);
            throw F60.createAndThrow();
        }
        this.shortFormDisplayString = str;
        this.longFormDisplayString = str2;
        if ((i & 8) == 0) {
            this.smbAuthorizationRequestId = null;
        } else {
            this.smbAuthorizationRequestId = str3;
        }
    }

    public /* synthetic */ GetStatusAudienceStringsOperationResultSuccess(String str, String str2, String str3, int i, C06H c06h) {
        this(str, str2, AnonymousClass006.A0t(i, str3));
    }
}
