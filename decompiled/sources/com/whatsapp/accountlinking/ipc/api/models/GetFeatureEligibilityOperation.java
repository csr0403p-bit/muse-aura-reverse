package com.whatsapp.accountlinking.ipc.api.models;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C07839ix;
import X.C2283BSj;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.C79;
import X.C8j4;
import X.C9Pw;
import X.C9Pz;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class GetFeatureEligibilityOperation extends UnlinkedOperation {
    public final Boolean contextualLinkStealCheck;
    public final ContextualPauseObservation contextualPauseObservation;
    public final Boolean contextualUnpauseCheck;
    public final IpcFeature feature;
    public final int version;
    public final Boolean withoutExposure;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {C2283BSj.A01(C79.A01, 42), null, null, null, null, null};

    public final class Companion {
        public final C9hr<GetFeatureEligibilityOperation> serializer() {
            return C9Pz.A00;
        }
    }

    public final GetFeatureEligibilityOperation copy(IpcFeature ipcFeature, ContextualPauseObservation contextualPauseObservation, int i, Boolean bool, Boolean bool2, Boolean bool3) {
        C7384Etj.A0Y(ipcFeature, 0);
        return new GetFeatureEligibilityOperation(ipcFeature, contextualPauseObservation, i, bool, bool2, bool3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GetFeatureEligibilityOperation) {
                GetFeatureEligibilityOperation getFeatureEligibilityOperation = (GetFeatureEligibilityOperation) obj;
                if (this.feature != getFeatureEligibilityOperation.feature || !C7384Etj.areEqual(this.contextualPauseObservation, getFeatureEligibilityOperation.contextualPauseObservation) || this.version != getFeatureEligibilityOperation.version || !C7384Etj.areEqual(this.contextualUnpauseCheck, getFeatureEligibilityOperation.contextualUnpauseCheck) || !C7384Etj.areEqual(this.withoutExposure, getFeatureEligibilityOperation.withoutExposure) || !C7384Etj.areEqual(this.contextualLinkStealCheck, getFeatureEligibilityOperation.contextualLinkStealCheck)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ GetFeatureEligibilityOperation(int i, IpcFeature ipcFeature, ContextualPauseObservation contextualPauseObservation, int i2, Boolean bool, Boolean bool2, Boolean bool3, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(C9Pz.A01, i, 1);
            throw F60.createAndThrow();
        }
        this.feature = ipcFeature;
        if ((i & 2) == 0) {
            this.contextualPauseObservation = null;
        } else {
            this.contextualPauseObservation = contextualPauseObservation;
        }
        if ((i & 4) == 0) {
            this.version = 1;
        } else {
            this.version = i2;
        }
        if ((i & 8) == 0) {
            this.contextualUnpauseCheck = null;
        } else {
            this.contextualUnpauseCheck = bool;
        }
        if ((i & 16) == 0) {
            this.withoutExposure = null;
        } else {
            this.withoutExposure = bool2;
        }
        if ((i & 32) == 0) {
            this.contextualLinkStealCheck = null;
        } else {
            this.contextualLinkStealCheck = bool3;
        }
    }

    public static /* synthetic */ GetFeatureEligibilityOperation copy$default(GetFeatureEligibilityOperation getFeatureEligibilityOperation, IpcFeature ipcFeature, ContextualPauseObservation contextualPauseObservation, int i, Boolean bool, Boolean bool2, Boolean bool3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            ipcFeature = getFeatureEligibilityOperation.feature;
        }
        if ((i2 & 2) != 0) {
            contextualPauseObservation = getFeatureEligibilityOperation.contextualPauseObservation;
        }
        if ((i2 & 4) != 0) {
            i = getFeatureEligibilityOperation.version;
        }
        if ((i2 & 8) != 0) {
            bool = getFeatureEligibilityOperation.contextualUnpauseCheck;
        }
        if ((i2 & 16) != 0) {
            bool2 = getFeatureEligibilityOperation.withoutExposure;
        }
        if ((i2 & 32) != 0) {
            bool3 = getFeatureEligibilityOperation.contextualLinkStealCheck;
        }
        return getFeatureEligibilityOperation.copy(ipcFeature, contextualPauseObservation, i, bool, bool2, bool3);
    }

    public static /* synthetic */ void getContextualLinkStealCheck$annotations() {
    }

    public static /* synthetic */ void getContextualPauseObservation$annotations() {
    }

    public static /* synthetic */ void getContextualUnpauseCheck$annotations() {
    }

    public static /* synthetic */ void getFeature$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static /* synthetic */ void getWithoutExposure$annotations() {
    }

    public static final /* synthetic */ void write$Self$java_com_whatsapp_accountlinking_ipc_api_api(GetFeatureEligibilityOperation getFeatureEligibilityOperation, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(getFeatureEligibilityOperation.feature, C3cH.A15($childSerializers, 0), c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || getFeatureEligibilityOperation.contextualPauseObservation != null) {
            c9j5.AAP(getFeatureEligibilityOperation.contextualPauseObservation, C9Pw.A00, c9iZ, 1);
        }
        if (zAfR || getFeatureEligibilityOperation.version != 1) {
            c9j5.AAK(c9iZ, 2, getFeatureEligibilityOperation.version);
        }
        if (zAfR || getFeatureEligibilityOperation.contextualUnpauseCheck != null) {
            c9j5.AAP(getFeatureEligibilityOperation.contextualUnpauseCheck, C07839ix.A00, c9iZ, 3);
        }
        if (zAfR || getFeatureEligibilityOperation.withoutExposure != null) {
            c9j5.AAP(getFeatureEligibilityOperation.withoutExposure, C07839ix.A00, c9iZ, 4);
        }
        if (zAfR || getFeatureEligibilityOperation.contextualLinkStealCheck != null) {
            c9j5.AAP(getFeatureEligibilityOperation.contextualLinkStealCheck, C07839ix.A00, c9iZ, 5);
        }
    }

    public final IpcFeature component1() {
        return this.feature;
    }

    public final ContextualPauseObservation component2() {
        return this.contextualPauseObservation;
    }

    public final int component3() {
        return this.version;
    }

    public final Boolean component4() {
        return this.contextualUnpauseCheck;
    }

    public final Boolean component5() {
        return this.withoutExposure;
    }

    public final Boolean component6() {
        return this.contextualLinkStealCheck;
    }

    public final Boolean getContextualLinkStealCheck() {
        return this.contextualLinkStealCheck;
    }

    public final ContextualPauseObservation getContextualPauseObservation() {
        return this.contextualPauseObservation;
    }

    public final Boolean getContextualUnpauseCheck() {
        return this.contextualUnpauseCheck;
    }

    public final IpcFeature getFeature() {
        return this.feature;
    }

    @Override // com.whatsapp.accountlinking.ipc.api.models.Operation
    public int getVersion() {
        return this.version;
    }

    public final Boolean getWithoutExposure() {
        return this.withoutExposure;
    }

    public int hashCode() {
        return ((((((((AnonymousClass005.A0E(this.feature) + AnonymousClass006.A0D(this.contextualPauseObservation)) * 31) + this.version) * 31) + AnonymousClass006.A0D(this.contextualUnpauseCheck)) * 31) + AnonymousClass006.A0D(this.withoutExposure)) * 31) + C3cH.A02(this.contextualLinkStealCheck);
    }

    public String toString() {
        IpcFeature ipcFeature = this.feature;
        ContextualPauseObservation contextualPauseObservation = this.contextualPauseObservation;
        int i = this.version;
        Boolean bool = this.contextualUnpauseCheck;
        Boolean bool2 = this.withoutExposure;
        Boolean bool3 = this.contextualLinkStealCheck;
        StringBuilder sbA0f = C3cG.A0f(ipcFeature, "GetFeatureEligibilityOperation(feature=");
        sbA0f.append(", contextualPauseObservation=");
        sbA0f.append(contextualPauseObservation);
        C8j4.A1Q(sbA0f, i);
        sbA0f.append(", contextualUnpauseCheck=");
        sbA0f.append(bool);
        sbA0f.append(", withoutExposure=");
        sbA0f.append(bool2);
        return C3cJ.A0L(bool3, ", contextualLinkStealCheck=", sbA0f);
    }

    public GetFeatureEligibilityOperation(IpcFeature ipcFeature, ContextualPauseObservation contextualPauseObservation, int i, Boolean bool, Boolean bool2, Boolean bool3) {
        C7384Etj.A0Y(ipcFeature, 0);
        this.feature = ipcFeature;
        this.contextualPauseObservation = contextualPauseObservation;
        this.version = i;
        this.contextualUnpauseCheck = bool;
        this.withoutExposure = bool2;
        this.contextualLinkStealCheck = bool3;
    }

    public /* synthetic */ GetFeatureEligibilityOperation(IpcFeature ipcFeature, ContextualPauseObservation contextualPauseObservation, int i, Boolean bool, Boolean bool2, Boolean bool3, int i2, C06H c06h) {
        this(ipcFeature, (i2 & 2) != 0 ? null : contextualPauseObservation, (i2 & 4) != 0 ? 1 : i, (i2 & 8) != 0 ? null : bool, (i2 & 16) != 0 ? null : bool2, (i2 & 32) != 0 ? null : bool3);
    }
}
