package com.facebook.aura.confidentialvm.vmswitch;

import X.AbstractC5321DgF;
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
public final class ConfidentialVmMigrationCheckpoint extends C06G implements ConfidentialVmTransferCheckpoint<ConfidentialVmMigrationCheckpoint> {
    public final String newCvmEnvId;
    public final String oldEnvId;
    public final Phase phase;
    public final String sourceWsUrl;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, AbstractC5321DgF.A02(C79.A01, ConfidentialVmMigrationCheckpoint$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final ConfidentialVmCheckpointStore<ConfidentialVmMigrationCheckpoint> store(String str) {
            C7384Etj.A0Y(str, 0);
            return new ConfidentialVmCheckpointStore<>(str, "migration_checkpoint", ConfidentialVmMigrationCheckpoint$$serializer.INSTANCE);
        }

        public final C9hr<ConfidentialVmMigrationCheckpoint> serializer() {
            return ConfidentialVmMigrationCheckpoint$$serializer.INSTANCE;
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
        public static final Phase ABANDONED;
        public static final Phase COMMITTED;
        public static final Phase PREPARED;
        public static final Phase STARTED;

        static {
            Phase phase = new Phase("COMMITTED", 0);
            COMMITTED = phase;
            Phase phase2 = new Phase(CvmMigrationStatusJson.STAGE_PREPARED, 1);
            PREPARED = phase2;
            Phase phase3 = new Phase(CvmMigrationStatusJson.STAGE_STARTED, 2);
            STARTED = phase3;
            Phase phase4 = new Phase("ABANDONED", 3);
            ABANDONED = phase4;
            Phase[] phaseArr = {phase, phase2, phase3, phase4};
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
            if (obj instanceof ConfidentialVmMigrationCheckpoint) {
                ConfidentialVmMigrationCheckpoint confidentialVmMigrationCheckpoint = (ConfidentialVmMigrationCheckpoint) obj;
                if (!C7384Etj.areEqual(this.oldEnvId, confidentialVmMigrationCheckpoint.oldEnvId) || !C7384Etj.areEqual(this.sourceWsUrl, confidentialVmMigrationCheckpoint.sourceWsUrl) || this.phase != confidentialVmMigrationCheckpoint.phase || !C7384Etj.areEqual(this.newCvmEnvId, confidentialVmMigrationCheckpoint.newCvmEnvId)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferCheckpoint
    public ConfidentialVmMigrationCheckpoint withDestinationEnvId(String str) {
        C7384Etj.A0Y(str, 0);
        String str2 = this.oldEnvId;
        String str3 = this.sourceWsUrl;
        Phase phase = this.phase;
        AnonymousClass003.A0v(str2, phase);
        return new ConfidentialVmMigrationCheckpoint(str2, str3, phase, str);
    }

    public static /* synthetic */ ConfidentialVmMigrationCheckpoint copy$default(ConfidentialVmMigrationCheckpoint confidentialVmMigrationCheckpoint, String str, String str2, Phase phase, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confidentialVmMigrationCheckpoint.oldEnvId;
        }
        if ((i & 2) != 0) {
            str2 = confidentialVmMigrationCheckpoint.sourceWsUrl;
        }
        if ((i & 4) != 0) {
            phase = confidentialVmMigrationCheckpoint.phase;
        }
        if ((i & 8) != 0) {
            str3 = confidentialVmMigrationCheckpoint.newCvmEnvId;
        }
        AnonymousClass003.A0v(str, phase);
        return new ConfidentialVmMigrationCheckpoint(str, str2, phase, str3);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_vmswitch_vmswitch(ConfidentialVmMigrationCheckpoint confidentialVmMigrationCheckpoint, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(confidentialVmMigrationCheckpoint.oldEnvId, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || confidentialVmMigrationCheckpoint.sourceWsUrl != null) {
            c9j5.AAP(confidentialVmMigrationCheckpoint.sourceWsUrl, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || confidentialVmMigrationCheckpoint.phase != Phase.COMMITTED) {
            c9j5.AAQ(confidentialVmMigrationCheckpoint.phase, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || confidentialVmMigrationCheckpoint.newCvmEnvId != null) {
            c9j5.AAP(confidentialVmMigrationCheckpoint.newCvmEnvId, C07779iq.A01, c9iZ, 3);
        }
    }

    public final String component1() {
        return this.oldEnvId;
    }

    public final String component2() {
        return this.sourceWsUrl;
    }

    public final Phase component3() {
        return this.phase;
    }

    public final String component4() {
        return this.newCvmEnvId;
    }

    @Override // com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferCheckpoint
    public String getDestinationEnvId() {
        return this.newCvmEnvId;
    }

    public final String getNewCvmEnvId() {
        return this.newCvmEnvId;
    }

    public final String getOldEnvId() {
        return this.oldEnvId;
    }

    public final Phase getPhase() {
        return this.phase;
    }

    @Override // com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferCheckpoint
    public String getSourceEnvId() {
        return this.oldEnvId;
    }

    public final String getSourceWsUrl() {
        return this.sourceWsUrl;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.phase, (AnonymousClass001.A0G(this.oldEnvId) + AnonymousClass006.A0G(this.sourceWsUrl)) * 31) + AnonymousClass005.A0H(this.newCvmEnvId);
    }

    public final ConfidentialVmMigrationCheckpoint withoutPreparation() {
        Phase phase = Phase.COMMITTED;
        String str = this.oldEnvId;
        String str2 = this.sourceWsUrl;
        C7384Etj.A0Y(str, 0);
        return new ConfidentialVmMigrationCheckpoint(str, str2, phase, null);
    }

    public ConfidentialVmMigrationCheckpoint(String str, String str2, Phase phase, String str3) {
        AnonymousClass003.A0v(str, phase);
        this.oldEnvId = str;
        this.sourceWsUrl = str2;
        this.phase = phase;
        this.newCvmEnvId = str3;
    }

    public final ConfidentialVmMigrationCheckpoint copy(String str, String str2, Phase phase, String str3) {
        AnonymousClass003.A0v(str, phase);
        return new ConfidentialVmMigrationCheckpoint(str, str2, phase, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConfidentialVmMigrationCheckpoint(int i, String str, String str2, Phase phase, String str3, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ConfidentialVmMigrationCheckpoint$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.oldEnvId = str;
        if ((i & 2) == 0) {
            this.sourceWsUrl = null;
        } else {
            this.sourceWsUrl = str2;
        }
        if ((i & 4) == 0) {
            this.phase = Phase.COMMITTED;
        } else {
            this.phase = phase;
        }
        if ((i & 8) == 0) {
            this.newCvmEnvId = null;
        } else {
            this.newCvmEnvId = str3;
        }
    }

    public /* synthetic */ ConfidentialVmMigrationCheckpoint(String str, String str2, Phase phase, String str3, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? Phase.COMMITTED : phase, (i & 8) != 0 ? null : str3);
    }
}
