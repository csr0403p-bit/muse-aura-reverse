package com.whatsapp.accountlinking.ipc.api.models;

import X.AbstractC2260BKq;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BPT;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C79;
import X.C7nl;
import X.C8MJ;
import X.C8i2;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9oI;
import X.C9oJ;
import X.C9u8;
import X.F0C;
import X.F60;
import java.lang.annotation.Annotation;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class WaAcIpcRequest {
    public final String callerIdentity;
    public final String linkedOperationNonce;
    public final C9oJ linkedOperationSourceApp;
    public final Operation operation;
    public final String requestId;
    public final String sourceAppPackageName;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, AbstractC5321DgF.A02(C79.A01, new C8i2(12)), null, null};

    public final class Companion {
        public final C9hr<WaAcIpcRequest> serializer() {
            return C8MJ.A00;
        }
    }

    public static /* synthetic */ WaAcIpcRequest copy$default(WaAcIpcRequest waAcIpcRequest, String str, String str2, C9oJ c9oJ, Operation operation, String str3, String str4, int i, Object obj) {
        String str5 = str;
        String str6 = str2;
        C9oJ c9oJ2 = c9oJ;
        Operation operation2 = operation;
        String str7 = str3;
        String str8 = str4;
        if ((i & 1) != 0) {
            str5 = waAcIpcRequest.callerIdentity;
        }
        if ((i & 2) != 0) {
            str6 = waAcIpcRequest.linkedOperationNonce;
        }
        if ((i & 4) != 0) {
            c9oJ2 = waAcIpcRequest.linkedOperationSourceApp;
        }
        if ((i & 8) != 0) {
            operation2 = waAcIpcRequest.operation;
        }
        if ((i & 16) != 0) {
            str7 = waAcIpcRequest.sourceAppPackageName;
        }
        if ((i & 32) != 0) {
            str8 = waAcIpcRequest.requestId;
        }
        AnonymousClass003.A0w(str5, operation2);
        return new WaAcIpcRequest(str5, str6, c9oJ2, operation2, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WaAcIpcRequest) {
                WaAcIpcRequest waAcIpcRequest = (WaAcIpcRequest) obj;
                if (!C7384Etj.areEqual(this.callerIdentity, waAcIpcRequest.callerIdentity) || !C7384Etj.areEqual(this.linkedOperationNonce, waAcIpcRequest.linkedOperationNonce) || this.linkedOperationSourceApp != waAcIpcRequest.linkedOperationSourceApp || !C7384Etj.areEqual(this.operation, waAcIpcRequest.operation) || !C7384Etj.areEqual(this.sourceAppPackageName, waAcIpcRequest.sourceAppPackageName) || !C7384Etj.areEqual(this.requestId, waAcIpcRequest.requestId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final /* synthetic */ C9hr _childSerializers$_anonymous_() {
        return new PolymorphicSerializer(C3cG.A0x(Operation.class), new Annotation[0]);
    }

    public static /* synthetic */ void getCallerIdentity$annotations() {
    }

    public static /* synthetic */ void getLinkedOperationNonce$annotations() {
    }

    @Serializable(with = C9oI.class)
    public static /* synthetic */ void getLinkedOperationSourceApp$annotations() {
    }

    public static /* synthetic */ void getOperation$annotations() {
    }

    public static /* synthetic */ void getRequestId$annotations() {
    }

    public static /* synthetic */ void getSourceAppPackageName$annotations() {
    }

    public static final /* synthetic */ void write$Self$java_com_whatsapp_accountlinking_ipc_api_api(WaAcIpcRequest waAcIpcRequest, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(waAcIpcRequest.callerIdentity, c9iZ, 0);
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(waAcIpcRequest.linkedOperationNonce, c07779iq, c9iZ, 1);
        c9j5.AAP(waAcIpcRequest.linkedOperationSourceApp, C9oI.A00, c9iZ, 2);
        c9j5.AAQ(waAcIpcRequest.operation, C3cH.A15(f0cArr, 3), c9iZ, 3);
        boolean zAfR = c9j5.AfR();
        if (zAfR || waAcIpcRequest.sourceAppPackageName != null) {
            c9j5.AAP(waAcIpcRequest.sourceAppPackageName, c07779iq, c9iZ, 4);
        }
        if (zAfR || waAcIpcRequest.requestId != null) {
            c9j5.AAP(waAcIpcRequest.requestId, c07779iq, c9iZ, 5);
        }
    }

    public final String component1() {
        return this.callerIdentity;
    }

    public final String component2() {
        return this.linkedOperationNonce;
    }

    public final C9oJ component3() {
        return this.linkedOperationSourceApp;
    }

    public final Operation component4() {
        return this.operation;
    }

    public final String component5() {
        return this.sourceAppPackageName;
    }

    public final String component6() {
        return this.requestId;
    }

    public final String getCallerIdentity() {
        return this.callerIdentity;
    }

    public final String getLinkedOperationNonce() {
        return this.linkedOperationNonce;
    }

    public final C9oJ getLinkedOperationSourceApp() {
        return this.linkedOperationSourceApp;
    }

    public final Operation getOperation() {
        return this.operation;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getSourceAppPackageName() {
        return this.sourceAppPackageName;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.operation, (((AnonymousClass001.A0G(this.callerIdentity) + AnonymousClass006.A0G(this.linkedOperationNonce)) * 31) + AnonymousClass006.A0D(this.linkedOperationSourceApp)) * 31) + AnonymousClass006.A0G(this.sourceAppPackageName)) * 31) + AnonymousClass005.A0H(this.requestId);
    }

    public final String serialize() {
        return BPT.A00.A00.A02(this, C9u8.A03(C7nl.A00(WaAcIpcRequest.class), AbstractC2260BKq.A00));
    }

    public String toString() {
        String str = this.callerIdentity;
        String str2 = this.linkedOperationNonce;
        C9oJ c9oJ = this.linkedOperationSourceApp;
        Operation operation = this.operation;
        String str3 = this.sourceAppPackageName;
        String str4 = this.requestId;
        StringBuilder sbA0x = C3cI.A0x("WaAcIpcRequest(callerIdentity=", str);
        sbA0x.append(", linkedOperationNonce=");
        sbA0x.append(str2);
        sbA0x.append(", linkedOperationSourceApp=");
        sbA0x.append(c9oJ);
        sbA0x.append(", operation=");
        sbA0x.append(operation);
        sbA0x.append(", sourceAppPackageName=");
        sbA0x.append(str3);
        return C3cJ.A0N(", requestId=", str4, sbA0x);
    }

    public WaAcIpcRequest(String str, String str2, C9oJ c9oJ, Operation operation, String str3, String str4) {
        AnonymousClass003.A0w(str, operation);
        this.callerIdentity = str;
        this.linkedOperationNonce = str2;
        this.linkedOperationSourceApp = c9oJ;
        this.operation = operation;
        this.sourceAppPackageName = str3;
        this.requestId = str4;
    }

    public final WaAcIpcRequest copy(String str, String str2, C9oJ c9oJ, Operation operation, String str3, String str4) {
        AnonymousClass003.A0w(str, operation);
        return new WaAcIpcRequest(str, str2, c9oJ, operation, str3, str4);
    }

    public /* synthetic */ WaAcIpcRequest(String str, String str2, C9oJ c9oJ, Operation operation, String str3, String str4, int i, C06H c06h) {
        this(str, str2, c9oJ, operation, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }

    public /* synthetic */ WaAcIpcRequest(int i, String str, String str2, C9oJ c9oJ, Operation operation, String str3, String str4, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(C8MJ.A01, i, 15);
            throw F60.createAndThrow();
        }
        this.callerIdentity = str;
        this.linkedOperationNonce = str2;
        this.linkedOperationSourceApp = c9oJ;
        this.operation = operation;
        if ((i & 16) == 0) {
            this.sourceAppPackageName = null;
        } else {
            this.sourceAppPackageName = str3;
        }
        if ((i & 32) == 0) {
            this.requestId = null;
        } else {
            this.requestId = str4;
        }
    }
}
