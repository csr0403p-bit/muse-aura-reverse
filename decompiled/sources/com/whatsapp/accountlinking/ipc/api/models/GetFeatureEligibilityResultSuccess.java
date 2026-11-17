package com.whatsapp.accountlinking.ipc.api.models;

import X.AnonymousClass006;
import X.C06H;
import X.C07839ix;
import X.C0KA;
import X.C2283BSj;
import X.C2hx;
import X.C3cH;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9pO;
import X.F0C;
import X.F60;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.Serializable;

@Polymorphic
@Serializable
/* loaded from: classes4.dex */
public final class GetFeatureEligibilityResultSuccess extends OperationResult {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final Boolean contextualLinkStealEligible;
    public final ContextualUnpauseResult contextualUnpauseResult;
    public final boolean enabled;
    public final Boolean exposureSuppressed;

    public final class Companion {
        public final C9hr<GetFeatureEligibilityResultSuccess> serializer() {
            return C9pO.A00;
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{C2283BSj.A01(num, 43), null, C2283BSj.A01(num, 44), null, null};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GetFeatureEligibilityResultSuccess) {
                GetFeatureEligibilityResultSuccess getFeatureEligibilityResultSuccess = (GetFeatureEligibilityResultSuccess) obj;
                if (this.enabled != getFeatureEligibilityResultSuccess.enabled || this.contextualUnpauseResult != getFeatureEligibilityResultSuccess.contextualUnpauseResult || !C7384Etj.areEqual(this.exposureSuppressed, getFeatureEligibilityResultSuccess.exposureSuppressed) || !C7384Etj.areEqual(this.contextualLinkStealEligible, getFeatureEligibilityResultSuccess.contextualLinkStealEligible)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetFeatureEligibilityResultSuccess(int i, ResponseCode responseCode, boolean z, ContextualUnpauseResult contextualUnpauseResult, Boolean bool, Boolean bool2, C2hx c2hx) {
        super(i, responseCode, c2hx);
        if (3 != (i & 3)) {
            C9iI.A00(C9pO.A01, i, 3);
            throw F60.createAndThrow();
        }
        this.enabled = z;
        if ((i & 4) == 0) {
            this.contextualUnpauseResult = null;
        } else {
            this.contextualUnpauseResult = contextualUnpauseResult;
        }
        if ((i & 8) == 0) {
            this.exposureSuppressed = null;
        } else {
            this.exposureSuppressed = bool;
        }
        if ((i & 16) == 0) {
            this.contextualLinkStealEligible = null;
        } else {
            this.contextualLinkStealEligible = bool2;
        }
    }

    public static /* synthetic */ GetFeatureEligibilityResultSuccess copy$default(GetFeatureEligibilityResultSuccess getFeatureEligibilityResultSuccess, boolean z, ContextualUnpauseResult contextualUnpauseResult, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = getFeatureEligibilityResultSuccess.enabled;
        }
        if ((i & 2) != 0) {
            contextualUnpauseResult = getFeatureEligibilityResultSuccess.contextualUnpauseResult;
        }
        if ((i & 4) != 0) {
            bool = getFeatureEligibilityResultSuccess.exposureSuppressed;
        }
        if ((i & 8) != 0) {
            bool2 = getFeatureEligibilityResultSuccess.contextualLinkStealEligible;
        }
        return new GetFeatureEligibilityResultSuccess(z, contextualUnpauseResult, bool, bool2);
    }

    public static /* synthetic */ void getContextualLinkStealEligible$annotations() {
    }

    public static /* synthetic */ void getContextualUnpauseResult$annotations() {
    }

    public static /* synthetic */ void getEnabled$annotations() {
    }

    public static /* synthetic */ void getExposureSuppressed$annotations() {
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final ContextualUnpauseResult component2() {
        return this.contextualUnpauseResult;
    }

    public final Boolean component3() {
        return this.exposureSuppressed;
    }

    public final Boolean component4() {
        return this.contextualLinkStealEligible;
    }

    public final GetFeatureEligibilityResultSuccess copy(boolean z, ContextualUnpauseResult contextualUnpauseResult, Boolean bool, Boolean bool2) {
        return new GetFeatureEligibilityResultSuccess(z, contextualUnpauseResult, bool, bool2);
    }

    public final Boolean getContextualLinkStealEligible() {
        return this.contextualLinkStealEligible;
    }

    public final ContextualUnpauseResult getContextualUnpauseResult() {
        return this.contextualUnpauseResult;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Boolean getExposureSuppressed() {
        return this.exposureSuppressed;
    }

    public int hashCode() {
        return ((((C0KA.A02(this.enabled) + AnonymousClass006.A0D(this.contextualUnpauseResult)) * 31) + AnonymousClass006.A0D(this.exposureSuppressed)) * 31) + C3cH.A02(this.contextualLinkStealEligible);
    }

    public String toString() {
        boolean z = this.enabled;
        ContextualUnpauseResult contextualUnpauseResult = this.contextualUnpauseResult;
        Boolean bool = this.exposureSuppressed;
        Boolean bool2 = this.contextualLinkStealEligible;
        StringBuilder sbA10 = C60O.A10("GetFeatureEligibilityResultSuccess(enabled=", z);
        sbA10.append(", contextualUnpauseResult=");
        sbA10.append(contextualUnpauseResult);
        sbA10.append(", exposureSuppressed=");
        sbA10.append(bool);
        return C3cJ.A0L(bool2, ", contextualLinkStealEligible=", sbA10);
    }

    public static final /* synthetic */ void write$Self$java_com_whatsapp_accountlinking_ipc_api_api(GetFeatureEligibilityResultSuccess getFeatureEligibilityResultSuccess, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(getFeatureEligibilityResultSuccess.responseCode, C3cH.A15(OperationResult.$childSerializers, 0), c9iZ, 0);
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AA7(c9iZ, 1, getFeatureEligibilityResultSuccess.enabled);
        boolean zAfR = c9j5.AfR();
        if (zAfR || getFeatureEligibilityResultSuccess.contextualUnpauseResult != null) {
            c9j5.AAP(getFeatureEligibilityResultSuccess.contextualUnpauseResult, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || getFeatureEligibilityResultSuccess.exposureSuppressed != null) {
            c9j5.AAP(getFeatureEligibilityResultSuccess.exposureSuppressed, C07839ix.A00, c9iZ, 3);
        }
        if (zAfR || getFeatureEligibilityResultSuccess.contextualLinkStealEligible != null) {
            c9j5.AAP(getFeatureEligibilityResultSuccess.contextualLinkStealEligible, C07839ix.A00, c9iZ, 4);
        }
    }

    public GetFeatureEligibilityResultSuccess(boolean z, ContextualUnpauseResult contextualUnpauseResult, Boolean bool, Boolean bool2) {
        super(ResponseCode.A03);
        this.enabled = z;
        this.contextualUnpauseResult = contextualUnpauseResult;
        this.exposureSuppressed = bool;
        this.contextualLinkStealEligible = bool2;
    }

    public /* synthetic */ GetFeatureEligibilityResultSuccess(boolean z, ContextualUnpauseResult contextualUnpauseResult, Boolean bool, Boolean bool2, int i, C06H c06h) {
        this(z, (i & 2) != 0 ? null : contextualUnpauseResult, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2);
    }
}
