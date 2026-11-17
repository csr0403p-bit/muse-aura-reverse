package com.whatsapp.accountlinking.ipc.api.models;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C0KA;
import X.C2283BSj;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.C79;
import X.C8j4;
import X.C9bI;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class GetEncryptedProfileInfoOperation extends UnlinkedOperation {
    public final boolean disableCache;
    public final String entryPoint;
    public final Boolean fetchFreshToken;
    public final UseCase useCase;
    public final int version;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {C2283BSj.A01(C79.A01, 40), null, null, null, null};

    public final class Companion {
        public final C9hr<GetEncryptedProfileInfoOperation> serializer() {
            return C9bI.A00;
        }
    }

    public final GetEncryptedProfileInfoOperation copy(UseCase useCase, int i, boolean z, String str, Boolean bool) {
        C7384Etj.A0Y(useCase, 0);
        return new GetEncryptedProfileInfoOperation(useCase, i, z, str, bool);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GetEncryptedProfileInfoOperation) {
                GetEncryptedProfileInfoOperation getEncryptedProfileInfoOperation = (GetEncryptedProfileInfoOperation) obj;
                if (this.useCase != getEncryptedProfileInfoOperation.useCase || this.version != getEncryptedProfileInfoOperation.version || this.disableCache != getEncryptedProfileInfoOperation.disableCache || !C7384Etj.areEqual(this.entryPoint, getEncryptedProfileInfoOperation.entryPoint) || !C7384Etj.areEqual(this.fetchFreshToken, getEncryptedProfileInfoOperation.fetchFreshToken)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ GetEncryptedProfileInfoOperation(int i, UseCase useCase, int i2, boolean z, String str, Boolean bool, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(C9bI.A01, i, 1);
            throw F60.createAndThrow();
        }
        this.useCase = useCase;
        if ((i & 2) == 0) {
            this.version = 1;
        } else {
            this.version = i2;
        }
        if ((i & 4) == 0) {
            this.disableCache = false;
        } else {
            this.disableCache = z;
        }
        if ((i & 8) == 0) {
            this.entryPoint = null;
        } else {
            this.entryPoint = str;
        }
        if ((i & 16) == 0) {
            this.fetchFreshToken = null;
        } else {
            this.fetchFreshToken = bool;
        }
    }

    public static /* synthetic */ GetEncryptedProfileInfoOperation copy$default(GetEncryptedProfileInfoOperation getEncryptedProfileInfoOperation, UseCase useCase, int i, boolean z, String str, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            useCase = getEncryptedProfileInfoOperation.useCase;
        }
        if ((i2 & 2) != 0) {
            i = getEncryptedProfileInfoOperation.version;
        }
        if ((i2 & 4) != 0) {
            z = getEncryptedProfileInfoOperation.disableCache;
        }
        if ((i2 & 8) != 0) {
            str = getEncryptedProfileInfoOperation.entryPoint;
        }
        if ((i2 & 16) != 0) {
            bool = getEncryptedProfileInfoOperation.fetchFreshToken;
        }
        return getEncryptedProfileInfoOperation.copy(useCase, i, z, str, bool);
    }

    public static /* synthetic */ void getDisableCache$annotations() {
    }

    public static /* synthetic */ void getEntryPoint$annotations() {
    }

    public static /* synthetic */ void getFetchFreshToken$annotations() {
    }

    public static /* synthetic */ void getUseCase$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final /* synthetic */ void write$Self$java_com_whatsapp_accountlinking_ipc_api_api(GetEncryptedProfileInfoOperation getEncryptedProfileInfoOperation, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(getEncryptedProfileInfoOperation.useCase, C3cH.A15($childSerializers, 0), c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || getEncryptedProfileInfoOperation.version != 1) {
            c9j5.AAK(c9iZ, 1, getEncryptedProfileInfoOperation.version);
        }
        if (zAfR || getEncryptedProfileInfoOperation.disableCache) {
            c9j5.AA7(c9iZ, 2, getEncryptedProfileInfoOperation.disableCache);
        }
        if (zAfR || getEncryptedProfileInfoOperation.entryPoint != null) {
            c9j5.AAP(getEncryptedProfileInfoOperation.entryPoint, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || getEncryptedProfileInfoOperation.fetchFreshToken != null) {
            c9j5.AAP(getEncryptedProfileInfoOperation.fetchFreshToken, C07839ix.A00, c9iZ, 4);
        }
    }

    public final UseCase component1() {
        return this.useCase;
    }

    public final int component2() {
        return this.version;
    }

    public final boolean component3() {
        return this.disableCache;
    }

    public final String component4() {
        return this.entryPoint;
    }

    public final Boolean component5() {
        return this.fetchFreshToken;
    }

    public final boolean getDisableCache() {
        return this.disableCache;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final Boolean getFetchFreshToken() {
        return this.fetchFreshToken;
    }

    public final UseCase getUseCase() {
        return this.useCase;
    }

    @Override // com.whatsapp.accountlinking.ipc.api.models.Operation
    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return ((C0KA.A01((AnonymousClass005.A0E(this.useCase) + this.version) * 31, this.disableCache) + AnonymousClass006.A0G(this.entryPoint)) * 31) + C3cH.A02(this.fetchFreshToken);
    }

    public String toString() {
        UseCase useCase = this.useCase;
        int i = this.version;
        boolean z = this.disableCache;
        String str = this.entryPoint;
        Boolean bool = this.fetchFreshToken;
        StringBuilder sbA0f = C3cG.A0f(useCase, "GetEncryptedProfileInfoOperation(useCase=");
        C8j4.A1Q(sbA0f, i);
        sbA0f.append(", disableCache=");
        sbA0f.append(z);
        sbA0f.append(", entryPoint=");
        sbA0f.append(str);
        return C3cJ.A0L(bool, ", fetchFreshToken=", sbA0f);
    }

    public GetEncryptedProfileInfoOperation(UseCase useCase, int i, boolean z, String str, Boolean bool) {
        C7384Etj.A0Y(useCase, 0);
        this.useCase = useCase;
        this.version = i;
        this.disableCache = z;
        this.entryPoint = str;
        this.fetchFreshToken = bool;
    }

    public /* synthetic */ GetEncryptedProfileInfoOperation(UseCase useCase, int i, boolean z, String str, Boolean bool, int i2, C06H c06h) {
        this(useCase, (i2 & 2) != 0 ? 1 : i, C3cG.A1K(i2 & 4, z), (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : bool);
    }
}
