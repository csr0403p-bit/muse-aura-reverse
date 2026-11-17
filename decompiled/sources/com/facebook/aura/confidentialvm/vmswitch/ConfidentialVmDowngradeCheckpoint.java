package com.facebook.aura.confidentialvm.vmswitch;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.Ey9;
import X.F0C;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ConfidentialVmDowngradeCheckpoint extends C06G implements ConfidentialVmTransferCheckpoint<ConfidentialVmDowngradeCheckpoint> {
    public final String destinationEnvId;
    public final Phase phase;
    public final String sourceEnvId;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cH.A1U(C79.A01, ConfidentialVmDowngradeCheckpoint$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final ConfidentialVmCheckpointStore<ConfidentialVmDowngradeCheckpoint> store(String str) {
            C7384Etj.A0Y(str, 0);
            return new ConfidentialVmCheckpointStore<>(str, "downgrade_checkpoint", ConfidentialVmDowngradeCheckpoint$$serializer.INSTANCE);
        }

        public final C9hr<ConfidentialVmDowngradeCheckpoint> serializer() {
            return ConfidentialVmDowngradeCheckpoint$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Phase {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Phase[] $VALUES;
        public static final Phase COMMITTED;
        public static final Phase STARTED;

        static {
            Phase phase = new Phase("COMMITTED", 0);
            COMMITTED = phase;
            Phase phase2 = new Phase(CvmMigrationStatusJson.STAGE_STARTED, 1);
            STARTED = phase2;
            Phase[] phaseArr = {phase, phase2};
            $VALUES = phaseArr;
            $ENTRIES = C3cG.A0w(phaseArr);
        }

        public static Ey9<Phase> getEntries() {
            return $ENTRIES;
        }

        public static Phase valueOf(String str) {
            return (Phase) Enum.valueOf(Phase.class, str);
        }

        public static Phase[] values() {
            return (Phase[]) $VALUES.clone();
        }

        public Phase(String str, int i) {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmDowngradeCheckpoint) {
                ConfidentialVmDowngradeCheckpoint confidentialVmDowngradeCheckpoint = (ConfidentialVmDowngradeCheckpoint) obj;
                if (!C7384Etj.areEqual(this.sourceEnvId, confidentialVmDowngradeCheckpoint.sourceEnvId) || this.phase != confidentialVmDowngradeCheckpoint.phase || !C7384Etj.areEqual(this.destinationEnvId, confidentialVmDowngradeCheckpoint.destinationEnvId)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferCheckpoint
    public ConfidentialVmDowngradeCheckpoint withDestinationEnvId(String str) {
        C7384Etj.A0Y(str, 0);
        return copy(this.sourceEnvId, this.phase, str);
    }

    public static /* synthetic */ ConfidentialVmDowngradeCheckpoint copy$default(ConfidentialVmDowngradeCheckpoint confidentialVmDowngradeCheckpoint, String str, Phase phase, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confidentialVmDowngradeCheckpoint.sourceEnvId;
        }
        if ((i & 2) != 0) {
            phase = confidentialVmDowngradeCheckpoint.phase;
        }
        if ((i & 4) != 0) {
            str2 = confidentialVmDowngradeCheckpoint.destinationEnvId;
        }
        return confidentialVmDowngradeCheckpoint.copy(str, phase, str2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_vmswitch_vmswitch(ConfidentialVmDowngradeCheckpoint confidentialVmDowngradeCheckpoint, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(confidentialVmDowngradeCheckpoint.getSourceEnvId(), c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || confidentialVmDowngradeCheckpoint.phase != Phase.COMMITTED) {
            c9j5.AAQ(confidentialVmDowngradeCheckpoint.phase, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || confidentialVmDowngradeCheckpoint.getDestinationEnvId() != null) {
            c9j5.AAP(confidentialVmDowngradeCheckpoint.getDestinationEnvId(), C07779iq.A01, c9iZ, 2);
        }
    }

    public final String component1() {
        return this.sourceEnvId;
    }

    public final Phase component2() {
        return this.phase;
    }

    public final String component3() {
        return this.destinationEnvId;
    }

    @Override // com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferCheckpoint
    public String getDestinationEnvId() {
        return this.destinationEnvId;
    }

    public final Phase getPhase() {
        return this.phase;
    }

    @Override // com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferCheckpoint
    public String getSourceEnvId() {
        return this.sourceEnvId;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.phase, AnonymousClass001.A0G(this.sourceEnvId)) + AnonymousClass006.A0G(this.destinationEnvId);
    }

    public ConfidentialVmDowngradeCheckpoint(String str, Phase phase, String str2) {
        AnonymousClass003.A0u(str, phase);
        this.sourceEnvId = str;
        this.phase = phase;
        this.destinationEnvId = str2;
    }

    public final ConfidentialVmDowngradeCheckpoint copy(String str, Phase phase, String str2) {
        AnonymousClass003.A0u(str, phase);
        return new ConfidentialVmDowngradeCheckpoint(str, phase, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConfidentialVmDowngradeCheckpoint(int i, String str, Phase phase, String str2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ConfidentialVmDowngradeCheckpoint$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.sourceEnvId = str;
        this.phase = (i & 2) == 0 ? Phase.COMMITTED : phase;
        if ((i & 4) == 0) {
            this.destinationEnvId = null;
        } else {
            this.destinationEnvId = str2;
        }
    }

    public /* synthetic */ ConfidentialVmDowngradeCheckpoint(String str, Phase phase, String str2, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? Phase.COMMITTED : phase, AnonymousClass006.A0t(i, str2));
    }
}
