package com.whatsapp.accountlinking.ipc.api.models;

import X.AnonymousClass001;
import X.C06H;
import X.C0KA;
import X.C2283BSj;
import X.C2hx;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9pP;
import X.F0C;
import X.F60;
import X.FGI;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.Serializable;

@Polymorphic
@Serializable
/* loaded from: classes4.dex */
public final class GetRegisteredPhoneNumberOperationResultSuccess extends OperationResult {
    public final boolean isSwitcherAcquisitionEnabled;
    public final String phoneNumber;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cI.A1Z(C79.A01, new C2283BSj(45));

    public final class Companion {
        public final C9hr<GetRegisteredPhoneNumberOperationResultSuccess> serializer() {
            return C9pP.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRegisteredPhoneNumberOperationResultSuccess(String str, boolean z) {
        super(ResponseCode.A03);
        C7384Etj.A0Y(str, 0);
        this.phoneNumber = str;
        this.isSwitcherAcquisitionEnabled = z;
    }

    public final GetRegisteredPhoneNumberOperationResultSuccess copy(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new GetRegisteredPhoneNumberOperationResultSuccess(str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GetRegisteredPhoneNumberOperationResultSuccess) {
                GetRegisteredPhoneNumberOperationResultSuccess getRegisteredPhoneNumberOperationResultSuccess = (GetRegisteredPhoneNumberOperationResultSuccess) obj;
                if (!C7384Etj.areEqual(this.phoneNumber, getRegisteredPhoneNumberOperationResultSuccess.phoneNumber) || this.isSwitcherAcquisitionEnabled != getRegisteredPhoneNumberOperationResultSuccess.isSwitcherAcquisitionEnabled) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GetRegisteredPhoneNumberOperationResultSuccess copy$default(GetRegisteredPhoneNumberOperationResultSuccess getRegisteredPhoneNumberOperationResultSuccess, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getRegisteredPhoneNumberOperationResultSuccess.phoneNumber;
        }
        if ((i & 2) != 0) {
            z = getRegisteredPhoneNumberOperationResultSuccess.isSwitcherAcquisitionEnabled;
        }
        C7384Etj.A0Y(str, 0);
        return new GetRegisteredPhoneNumberOperationResultSuccess(str, z);
    }

    public static /* synthetic */ void getPhoneNumber$annotations() {
    }

    public static /* synthetic */ void isSwitcherAcquisitionEnabled$annotations() {
    }

    public final String component1() {
        return this.phoneNumber;
    }

    public final boolean component2() {
        return this.isSwitcherAcquisitionEnabled;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass001.A0G(this.phoneNumber), this.isSwitcherAcquisitionEnabled);
    }

    public final boolean isSwitcherAcquisitionEnabled() {
        return this.isSwitcherAcquisitionEnabled;
    }

    public String toString() {
        return FGI.A0n("GetRegisteredPhoneNumberOperationResultSuccess(phoneNumber=", this.phoneNumber, ", isSwitcherAcquisitionEnabled=", ")", this.isSwitcherAcquisitionEnabled);
    }

    public static final /* synthetic */ void write$Self$java_com_whatsapp_accountlinking_ipc_api_api(GetRegisteredPhoneNumberOperationResultSuccess getRegisteredPhoneNumberOperationResultSuccess, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(getRegisteredPhoneNumberOperationResultSuccess.responseCode, C3cH.A15(OperationResult.$childSerializers, 0), c9iZ, 0);
        c9j5.AAV(getRegisteredPhoneNumberOperationResultSuccess.phoneNumber, c9iZ, 1);
        if (c9j5.AfR() || getRegisteredPhoneNumberOperationResultSuccess.isSwitcherAcquisitionEnabled) {
            c9j5.AA7(c9iZ, 2, getRegisteredPhoneNumberOperationResultSuccess.isSwitcherAcquisitionEnabled);
        }
    }

    public /* synthetic */ GetRegisteredPhoneNumberOperationResultSuccess(String str, boolean z, int i, C06H c06h) {
        this(str, AnonymousClass001.A1Q(i, z));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetRegisteredPhoneNumberOperationResultSuccess(int i, ResponseCode responseCode, String str, boolean z, C2hx c2hx) {
        super(i, responseCode, c2hx);
        if (3 != (i & 3)) {
            C9iI.A00(C9pP.A01, i, 3);
            throw F60.createAndThrow();
        }
        this.phoneNumber = str;
        if ((i & 4) == 0) {
            this.isSwitcherAcquisitionEnabled = false;
        } else {
            this.isSwitcherAcquisitionEnabled = z;
        }
    }
}
