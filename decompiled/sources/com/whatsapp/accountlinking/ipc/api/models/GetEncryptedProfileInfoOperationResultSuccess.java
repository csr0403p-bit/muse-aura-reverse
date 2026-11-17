package com.whatsapp.accountlinking.ipc.api.models;

import X.AnonymousClass006;
import X.C06H;
import X.C07779iq;
import X.C2283BSj;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9pF;
import X.F0C;
import X.F60;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.Serializable;

@Polymorphic
@Serializable
/* loaded from: classes4.dex */
public class GetEncryptedProfileInfoOperationResultSuccess extends OperationResult {
    public final String fetchStrategy;
    public final String waDataBundle;
    public final String waLlinkingAuthProof;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {C2283BSj.A01(C79.A01, 41), null, null, null};

    public final class Companion {
        public final C9hr<GetEncryptedProfileInfoOperationResultSuccess> serializer() {
            return C9pF.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetEncryptedProfileInfoOperationResultSuccess(String str, String str2, String str3) {
        super(ResponseCode.A03);
        C7384Etj.A0Y(str, 0);
        this.waDataBundle = str;
        this.waLlinkingAuthProof = str2;
        this.fetchStrategy = str3;
    }

    public static /* synthetic */ void getFetchStrategy$annotations() {
    }

    public static /* synthetic */ void getWaDataBundle$annotations() {
    }

    public static /* synthetic */ void getWaLlinkingAuthProof$annotations() {
    }

    public final String getFetchStrategy() {
        return this.fetchStrategy;
    }

    public final String getWaDataBundle() {
        return this.waDataBundle;
    }

    public final String getWaLlinkingAuthProof() {
        return this.waLlinkingAuthProof;
    }

    public static final /* synthetic */ void write$Self(GetEncryptedProfileInfoOperationResultSuccess getEncryptedProfileInfoOperationResultSuccess, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(getEncryptedProfileInfoOperationResultSuccess.responseCode, C3cH.A15(OperationResult.$childSerializers, 0), c9iZ, 0);
        c9j5.AAV(getEncryptedProfileInfoOperationResultSuccess.waDataBundle, c9iZ, 1);
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(getEncryptedProfileInfoOperationResultSuccess.waLlinkingAuthProof, c07779iq, c9iZ, 2);
        if (c9j5.AfR() || getEncryptedProfileInfoOperationResultSuccess.fetchStrategy != null) {
            c9j5.AAP(getEncryptedProfileInfoOperationResultSuccess.fetchStrategy, c07779iq, c9iZ, 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetEncryptedProfileInfoOperationResultSuccess(int i, ResponseCode responseCode, String str, String str2, String str3, C2hx c2hx) {
        super(i, responseCode, c2hx);
        if (7 != (i & 7)) {
            C9iI.A00(C9pF.A01, i, 7);
            throw F60.createAndThrow();
        }
        this.waDataBundle = str;
        this.waLlinkingAuthProof = str2;
        if ((i & 8) == 0) {
            this.fetchStrategy = null;
        } else {
            this.fetchStrategy = str3;
        }
    }

    public /* synthetic */ GetEncryptedProfileInfoOperationResultSuccess(String str, String str2, String str3, int i, C06H c06h) {
        this(str, str2, AnonymousClass006.A0t(i, str3));
    }
}
