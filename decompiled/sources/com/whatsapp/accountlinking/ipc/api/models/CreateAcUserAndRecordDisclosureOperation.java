package com.whatsapp.accountlinking.ipc.api.models;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C2283BSj;
import X.C2hx;
import X.C3cH;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import X.C79;
import X.C9bC;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class CreateAcUserAndRecordDisclosureOperation extends UnlinkedOperation {
    public final int disclosureId;
    public final String disclosureVersion;
    public final UseCase useCase;
    public final int version;
    public final String waIpcSessionId;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, C2283BSj.A01(C79.A01, 38)};

    public final class Companion {
        public final C9hr<CreateAcUserAndRecordDisclosureOperation> serializer() {
            return C9bC.A00;
        }
    }

    public final CreateAcUserAndRecordDisclosureOperation copy(int i, String str, int i2, String str2, UseCase useCase) {
        AnonymousClass002.A1B(str, 1, str2);
        return new CreateAcUserAndRecordDisclosureOperation(i, str, i2, str2, useCase);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreateAcUserAndRecordDisclosureOperation) {
                CreateAcUserAndRecordDisclosureOperation createAcUserAndRecordDisclosureOperation = (CreateAcUserAndRecordDisclosureOperation) obj;
                if (this.version != createAcUserAndRecordDisclosureOperation.version || !C7384Etj.areEqual(this.waIpcSessionId, createAcUserAndRecordDisclosureOperation.waIpcSessionId) || this.disclosureId != createAcUserAndRecordDisclosureOperation.disclosureId || !C7384Etj.areEqual(this.disclosureVersion, createAcUserAndRecordDisclosureOperation.disclosureVersion) || this.useCase != createAcUserAndRecordDisclosureOperation.useCase) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ CreateAcUserAndRecordDisclosureOperation(int i, int i2, String str, int i3, String str2, UseCase useCase, C2hx c2hx) {
        if (14 != (i & 14)) {
            C9iI.A00(C9bC.A01, i, 14);
            throw F60.createAndThrow();
        }
        this.version = (i & 1) == 0 ? 1 : i2;
        this.waIpcSessionId = str;
        this.disclosureId = i3;
        this.disclosureVersion = str2;
        if ((i & 16) == 0) {
            this.useCase = null;
        } else {
            this.useCase = useCase;
        }
    }

    public static /* synthetic */ CreateAcUserAndRecordDisclosureOperation copy$default(CreateAcUserAndRecordDisclosureOperation createAcUserAndRecordDisclosureOperation, int i, String str, int i2, String str2, UseCase useCase, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = createAcUserAndRecordDisclosureOperation.version;
        }
        if ((i3 & 2) != 0) {
            str = createAcUserAndRecordDisclosureOperation.waIpcSessionId;
        }
        if ((i3 & 4) != 0) {
            i2 = createAcUserAndRecordDisclosureOperation.disclosureId;
        }
        if ((i3 & 8) != 0) {
            str2 = createAcUserAndRecordDisclosureOperation.disclosureVersion;
        }
        if ((i3 & 16) != 0) {
            useCase = createAcUserAndRecordDisclosureOperation.useCase;
        }
        return createAcUserAndRecordDisclosureOperation.copy(i, str, i2, str2, useCase);
    }

    public static /* synthetic */ void getDisclosureId$annotations() {
    }

    public static /* synthetic */ void getDisclosureVersion$annotations() {
    }

    public static /* synthetic */ void getUseCase$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static /* synthetic */ void getWaIpcSessionId$annotations() {
    }

    public static final /* synthetic */ void write$Self$java_com_whatsapp_accountlinking_ipc_api_api(CreateAcUserAndRecordDisclosureOperation createAcUserAndRecordDisclosureOperation, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || createAcUserAndRecordDisclosureOperation.version != 1) {
            c9j5.AAK(c9iZ, 0, createAcUserAndRecordDisclosureOperation.version);
        }
        c9j5.AAV(createAcUserAndRecordDisclosureOperation.waIpcSessionId, c9iZ, 1);
        c9j5.AAK(c9iZ, 2, createAcUserAndRecordDisclosureOperation.disclosureId);
        c9j5.AAV(createAcUserAndRecordDisclosureOperation.disclosureVersion, c9iZ, 3);
        if (zAfR || createAcUserAndRecordDisclosureOperation.useCase != null) {
            c9j5.AAP(createAcUserAndRecordDisclosureOperation.useCase, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
    }

    public final int component1() {
        return this.version;
    }

    public final String component2() {
        return this.waIpcSessionId;
    }

    public final int component3() {
        return this.disclosureId;
    }

    public final String component4() {
        return this.disclosureVersion;
    }

    public final UseCase component5() {
        return this.useCase;
    }

    public final int getDisclosureId() {
        return this.disclosureId;
    }

    public final String getDisclosureVersion() {
        return this.disclosureVersion;
    }

    public final UseCase getUseCase() {
        return this.useCase;
    }

    @Override // com.whatsapp.accountlinking.ipc.api.models.Operation
    public int getVersion() {
        return this.version;
    }

    public final String getWaIpcSessionId() {
        return this.waIpcSessionId;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.disclosureVersion, (AnonymousClass005.A0I(this.waIpcSessionId, this.version * 31) + this.disclosureId) * 31) + AnonymousClass006.A0D(this.useCase);
    }

    public String toString() {
        int i = this.version;
        String str = this.waIpcSessionId;
        int i2 = this.disclosureId;
        String str2 = this.disclosureVersion;
        UseCase useCase = this.useCase;
        StringBuilder sbA0y = C60O.A0y("CreateAcUserAndRecordDisclosureOperation(version=", i);
        sbA0y.append(", waIpcSessionId=");
        sbA0y.append(str);
        sbA0y.append(", disclosureId=");
        sbA0y.append(i2);
        sbA0y.append(", disclosureVersion=");
        sbA0y.append(str2);
        return C3cJ.A0L(useCase, ", useCase=", sbA0y);
    }

    public CreateAcUserAndRecordDisclosureOperation(int i, String str, int i2, String str2, UseCase useCase) {
        AnonymousClass002.A1B(str, 1, str2);
        this.version = i;
        this.waIpcSessionId = str;
        this.disclosureId = i2;
        this.disclosureVersion = str2;
        this.useCase = useCase;
    }

    public /* synthetic */ CreateAcUserAndRecordDisclosureOperation(int i, String str, int i2, String str2, UseCase useCase, int i3, C06H c06h) {
        this((i3 & 1) != 0 ? 1 : i, str, i2, str2, (i3 & 16) != 0 ? null : useCase);
    }
}
