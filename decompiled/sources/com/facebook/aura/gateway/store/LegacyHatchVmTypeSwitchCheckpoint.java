package com.facebook.aura.gateway.store;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
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
public final class LegacyHatchVmTypeSwitchCheckpoint extends C06G {
    public final String phase;
    public final String sourceFqdn;
    public final HatchlingVmType targetVmType;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cH.A1U(C79.A01, LegacyHatchVmTypeSwitchCheckpoint$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<LegacyHatchVmTypeSwitchCheckpoint> serializer() {
            return LegacyHatchVmTypeSwitchCheckpoint$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LegacyHatchVmTypeSwitchCheckpoint) {
                LegacyHatchVmTypeSwitchCheckpoint legacyHatchVmTypeSwitchCheckpoint = (LegacyHatchVmTypeSwitchCheckpoint) obj;
                if (!C7384Etj.areEqual(this.sourceFqdn, legacyHatchVmTypeSwitchCheckpoint.sourceFqdn) || this.targetVmType != legacyHatchVmTypeSwitchCheckpoint.targetVmType || !C7384Etj.areEqual(this.phase, legacyHatchVmTypeSwitchCheckpoint.phase)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LegacyHatchVmTypeSwitchCheckpoint copy$default(LegacyHatchVmTypeSwitchCheckpoint legacyHatchVmTypeSwitchCheckpoint, String str, HatchlingVmType hatchlingVmType, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = legacyHatchVmTypeSwitchCheckpoint.sourceFqdn;
        }
        if ((i & 2) != 0) {
            hatchlingVmType = legacyHatchVmTypeSwitchCheckpoint.targetVmType;
        }
        if ((i & 4) != 0) {
            str2 = legacyHatchVmTypeSwitchCheckpoint.phase;
        }
        return legacyHatchVmTypeSwitchCheckpoint.copy(str, hatchlingVmType, str2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_store_store(LegacyHatchVmTypeSwitchCheckpoint legacyHatchVmTypeSwitchCheckpoint, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(legacyHatchVmTypeSwitchCheckpoint.sourceFqdn, c9iZ, 0);
        c9j5.AAQ(legacyHatchVmTypeSwitchCheckpoint.targetVmType, C3cH.A15(f0cArr, 1), c9iZ, 1);
        if (c9j5.AfR() || !C3cH.A1Q(legacyHatchVmTypeSwitchCheckpoint.phase)) {
            c9j5.AAV(legacyHatchVmTypeSwitchCheckpoint.phase, c9iZ, 2);
        }
    }

    public final String component1() {
        return this.sourceFqdn;
    }

    public final HatchlingVmType component2() {
        return this.targetVmType;
    }

    public final String component3() {
        return this.phase;
    }

    public final String getPhase() {
        return this.phase;
    }

    public final String getSourceFqdn() {
        return this.sourceFqdn;
    }

    public final HatchlingVmType getTargetVmType() {
        return this.targetVmType;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.phase, AnonymousClass005.A0F(this.targetVmType, AnonymousClass001.A0G(this.sourceFqdn)));
    }

    public LegacyHatchVmTypeSwitchCheckpoint(String str, HatchlingVmType hatchlingVmType, String str2) {
        AnonymousClass005.A0x(str, hatchlingVmType, str2);
        this.sourceFqdn = str;
        this.targetVmType = hatchlingVmType;
        this.phase = str2;
    }

    public final LegacyHatchVmTypeSwitchCheckpoint copy(String str, HatchlingVmType hatchlingVmType, String str2) {
        AnonymousClass005.A0x(str, hatchlingVmType, str2);
        return new LegacyHatchVmTypeSwitchCheckpoint(str, hatchlingVmType, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ LegacyHatchVmTypeSwitchCheckpoint(int i, String str, HatchlingVmType hatchlingVmType, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(LegacyHatchVmTypeSwitchCheckpoint$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.sourceFqdn = str;
        this.targetVmType = hatchlingVmType;
        this.phase = (i & 4) == 0 ? "" : str2;
    }

    public /* synthetic */ LegacyHatchVmTypeSwitchCheckpoint(String str, HatchlingVmType hatchlingVmType, String str2, int i, C06H c06h) {
        this(str, hatchlingVmType, (i & 4) != 0 ? "" : str2);
    }
}
