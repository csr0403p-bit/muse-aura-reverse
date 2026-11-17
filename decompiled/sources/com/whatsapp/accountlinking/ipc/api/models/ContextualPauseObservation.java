package com.whatsapp.accountlinking.ipc.api.models;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C8j4;
import X.C9Pw;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ContextualPauseObservation {
    public static final int CURRENT_VERSION = 1;
    public static final Companion Companion = new Companion();
    public final String entryPoint;
    public final boolean isEntryPointVisible;
    public final String observationId;
    public final int version;

    public final class Companion {
        public final C9hr<ContextualPauseObservation> serializer() {
            return C9Pw.A00;
        }
    }

    public static final /* synthetic */ void write$Self$java_com_whatsapp_accountlinking_ipc_api_api(ContextualPauseObservation contextualPauseObservation, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(contextualPauseObservation.observationId, c9iZ, 0);
        c9j5.AAV(contextualPauseObservation.entryPoint, c9iZ, 1);
        c9j5.AA7(c9iZ, 2, contextualPauseObservation.isEntryPointVisible);
        if (c9j5.AfR() || contextualPauseObservation.version != 1) {
            c9j5.AAK(c9iZ, 3, contextualPauseObservation.version);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ContextualPauseObservation) {
                ContextualPauseObservation contextualPauseObservation = (ContextualPauseObservation) obj;
                if (!C7384Etj.areEqual(this.observationId, contextualPauseObservation.observationId) || !C7384Etj.areEqual(this.entryPoint, contextualPauseObservation.entryPoint) || this.isEntryPointVisible != contextualPauseObservation.isEntryPointVisible || this.version != contextualPauseObservation.version) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ContextualPauseObservation copy$default(ContextualPauseObservation contextualPauseObservation, String str, String str2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = contextualPauseObservation.observationId;
        }
        if ((i2 & 2) != 0) {
            str2 = contextualPauseObservation.entryPoint;
        }
        if ((i2 & 4) != 0) {
            z = contextualPauseObservation.isEntryPointVisible;
        }
        if ((i2 & 8) != 0) {
            i = contextualPauseObservation.version;
        }
        AnonymousClass003.A0u(str, str2);
        return new ContextualPauseObservation(str, str2, z, i);
    }

    public static /* synthetic */ void getEntryPoint$annotations() {
    }

    public static /* synthetic */ void getObservationId$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static /* synthetic */ void isEntryPointVisible$annotations() {
    }

    public final String component1() {
        return this.observationId;
    }

    public final String component2() {
        return this.entryPoint;
    }

    public final boolean component3() {
        return this.isEntryPointVisible;
    }

    public final int component4() {
        return this.version;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final String getObservationId() {
        return this.observationId;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return C0KA.A01(AnonymousClass005.A0I(this.entryPoint, AnonymousClass001.A0G(this.observationId)), this.isEntryPointVisible) + this.version;
    }

    public final boolean isEntryPointVisible() {
        return this.isEntryPointVisible;
    }

    public String toString() {
        String str = this.observationId;
        String str2 = this.entryPoint;
        boolean z = this.isEntryPointVisible;
        int i = this.version;
        StringBuilder sbA0x = C3cI.A0x("ContextualPauseObservation(observationId=", str);
        sbA0x.append(", entryPoint=");
        sbA0x.append(str2);
        sbA0x.append(", isEntryPointVisible=");
        sbA0x.append(z);
        C8j4.A1Q(sbA0x, i);
        return AnonymousClass001.A0v(")", sbA0x);
    }

    public ContextualPauseObservation(String str, String str2, boolean z, int i) {
        AnonymousClass003.A0u(str, str2);
        this.observationId = str;
        this.entryPoint = str2;
        this.isEntryPointVisible = z;
        this.version = i;
    }

    public final ContextualPauseObservation copy(String str, String str2, boolean z, int i) {
        AnonymousClass003.A0u(str, str2);
        return new ContextualPauseObservation(str, str2, z, i);
    }

    public /* synthetic */ ContextualPauseObservation(int i, String str, String str2, boolean z, int i2, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(C9Pw.A01, i, 7);
            throw F60.createAndThrow();
        }
        this.observationId = str;
        this.entryPoint = str2;
        this.isEntryPointVisible = z;
        if ((i & 8) == 0) {
            this.version = 1;
        } else {
            this.version = i2;
        }
    }

    public /* synthetic */ ContextualPauseObservation(String str, String str2, boolean z, int i, int i2, C06H c06h) {
        this(str, str2, z, (i2 & 8) != 0 ? 1 : i);
    }
}
