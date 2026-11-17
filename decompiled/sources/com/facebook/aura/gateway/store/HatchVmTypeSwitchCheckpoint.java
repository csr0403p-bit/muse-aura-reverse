package com.facebook.aura.gateway.store;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import com.facebook.aura.gateway.HatchlingVmType;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class HatchVmTypeSwitchCheckpoint extends C06G {
    public final Boolean keepsSource;
    public final String sourceEnvId;
    public final HatchlingVmType targetVmType;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cH.A1U(C79.A01, HatchVmTypeSwitchCheckpoint$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<HatchVmTypeSwitchCheckpoint> serializer() {
            return HatchVmTypeSwitchCheckpoint$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchVmTypeSwitchCheckpoint(String str, HatchlingVmType hatchlingVmType, Boolean bool) {
        C7384Etj.A0Y(hatchlingVmType, 1);
        this.sourceEnvId = str;
        this.targetVmType = hatchlingVmType;
        this.keepsSource = bool;
    }

    public final HatchVmTypeSwitchCheckpoint copy(String str, HatchlingVmType hatchlingVmType, Boolean bool) {
        C7384Etj.A0Y(hatchlingVmType, 1);
        return new HatchVmTypeSwitchCheckpoint(str, hatchlingVmType, bool);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchVmTypeSwitchCheckpoint) {
                HatchVmTypeSwitchCheckpoint hatchVmTypeSwitchCheckpoint = (HatchVmTypeSwitchCheckpoint) obj;
                if (!C7384Etj.areEqual(this.sourceEnvId, hatchVmTypeSwitchCheckpoint.sourceEnvId) || this.targetVmType != hatchVmTypeSwitchCheckpoint.targetVmType || !C7384Etj.areEqual(this.keepsSource, hatchVmTypeSwitchCheckpoint.keepsSource)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchVmTypeSwitchCheckpoint copy$default(HatchVmTypeSwitchCheckpoint hatchVmTypeSwitchCheckpoint, String str, HatchlingVmType hatchlingVmType, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchVmTypeSwitchCheckpoint.sourceEnvId;
        }
        if ((i & 2) != 0) {
            hatchlingVmType = hatchVmTypeSwitchCheckpoint.targetVmType;
        }
        if ((i & 4) != 0) {
            bool = hatchVmTypeSwitchCheckpoint.keepsSource;
        }
        return hatchVmTypeSwitchCheckpoint.copy(str, hatchlingVmType, bool);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_store_store(HatchVmTypeSwitchCheckpoint hatchVmTypeSwitchCheckpoint, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAP(hatchVmTypeSwitchCheckpoint.sourceEnvId, C07779iq.A01, c9iZ, 0);
        c9j5.AAQ(hatchVmTypeSwitchCheckpoint.targetVmType, C3cH.A15(f0cArr, 1), c9iZ, 1);
        if (c9j5.AfR() || hatchVmTypeSwitchCheckpoint.keepsSource != null) {
            c9j5.AAP(hatchVmTypeSwitchCheckpoint.keepsSource, C07839ix.A00, c9iZ, 2);
        }
    }

    public final String component1() {
        return this.sourceEnvId;
    }

    public final HatchlingVmType component2() {
        return this.targetVmType;
    }

    public final Boolean component3() {
        return this.keepsSource;
    }

    public final Boolean getKeepsSource() {
        return this.keepsSource;
    }

    public final String getSourceEnvId() {
        return this.sourceEnvId;
    }

    public final HatchlingVmType getTargetVmType() {
        return this.targetVmType;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.targetVmType, AnonymousClass006.A0G(this.sourceEnvId) * 31) + C3cH.A02(this.keepsSource);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchVmTypeSwitchCheckpoint(int i, String str, HatchlingVmType hatchlingVmType, Boolean bool, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(HatchVmTypeSwitchCheckpoint$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.sourceEnvId = str;
        this.targetVmType = hatchlingVmType;
        this.keepsSource = (i & 4) == 0 ? null : bool;
    }

    public /* synthetic */ HatchVmTypeSwitchCheckpoint(String str, HatchlingVmType hatchlingVmType, Boolean bool, int i, C06H c06h) {
        this(str, hatchlingVmType, (i & 4) != 0 ? null : bool);
    }
}
