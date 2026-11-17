package com.whatsapp.accountlinking.ipc.api.models;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06H;
import X.C2277BSd;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C8j4;
import X.C9hl;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class StatusApiEligibilityOperation extends UnlinkedOperation {
    public final StatusApiFeature feature;
    public final int version;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {C2277BSd.A00(C79.A01, 1), null};

    public final class Companion {
        public final C9hr<StatusApiEligibilityOperation> serializer() {
            return C9hl.A00;
        }
    }

    public StatusApiEligibilityOperation(StatusApiFeature statusApiFeature, int i) {
        C7384Etj.A0Y(statusApiFeature, 0);
        this.feature = statusApiFeature;
        this.version = i;
    }

    public final StatusApiEligibilityOperation copy(StatusApiFeature statusApiFeature, int i) {
        C7384Etj.A0Y(statusApiFeature, 0);
        return new StatusApiEligibilityOperation(statusApiFeature, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StatusApiEligibilityOperation) {
                StatusApiEligibilityOperation statusApiEligibilityOperation = (StatusApiEligibilityOperation) obj;
                if (this.feature != statusApiEligibilityOperation.feature || this.version != statusApiEligibilityOperation.version) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ StatusApiEligibilityOperation copy$default(StatusApiEligibilityOperation statusApiEligibilityOperation, StatusApiFeature statusApiFeature, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            statusApiFeature = statusApiEligibilityOperation.feature;
        }
        if ((i2 & 2) != 0) {
            i = statusApiEligibilityOperation.version;
        }
        C7384Etj.A0Y(statusApiFeature, 0);
        return new StatusApiEligibilityOperation(statusApiFeature, i);
    }

    public static /* synthetic */ void getFeature$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final /* synthetic */ void write$Self$java_com_whatsapp_accountlinking_ipc_api_api(StatusApiEligibilityOperation statusApiEligibilityOperation, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(statusApiEligibilityOperation.feature, C3cH.A15($childSerializers, 0), c9iZ, 0);
        if (c9j5.AfR() || statusApiEligibilityOperation.version != 1) {
            c9j5.AAK(c9iZ, 1, statusApiEligibilityOperation.version);
        }
    }

    public final StatusApiFeature component1() {
        return this.feature;
    }

    public final int component2() {
        return this.version;
    }

    public final StatusApiFeature getFeature() {
        return this.feature;
    }

    @Override // com.whatsapp.accountlinking.ipc.api.models.Operation
    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.feature) + this.version;
    }

    public String toString() {
        StatusApiFeature statusApiFeature = this.feature;
        int i = this.version;
        StringBuilder sbA0f = C3cG.A0f(statusApiFeature, "StatusApiEligibilityOperation(feature=");
        C8j4.A1Q(sbA0f, i);
        return AnonymousClass001.A0v(")", sbA0f);
    }

    public /* synthetic */ StatusApiEligibilityOperation(int i, StatusApiFeature statusApiFeature, int i2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(C9hl.A01, i, 1);
            throw F60.createAndThrow();
        }
        this.feature = statusApiFeature;
        if ((i & 2) == 0) {
            this.version = 1;
        } else {
            this.version = i2;
        }
    }

    public /* synthetic */ StatusApiEligibilityOperation(StatusApiFeature statusApiFeature, int i, int i2, C06H c06h) {
        this(statusApiFeature, (i2 & 2) != 0 ? 1 : i);
    }
}
