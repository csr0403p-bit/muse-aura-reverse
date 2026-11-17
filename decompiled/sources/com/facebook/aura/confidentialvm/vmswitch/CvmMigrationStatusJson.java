package com.facebook.aura.confidentialvm.vmswitch;

import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation;
import java.util.Iterator;
import java.util.Set;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CvmMigrationStatusJson extends C06G {
    public static final String STAGE_CLAIMING = "CLAIMING";
    public static final String STAGE_PREPARED = "PREPARED";
    public static final String STAGE_STARTED = "STARTED";
    public static final String VAULT_CVM_LOCKED = "CVM_LOCKED";
    public static final String VAULT_CVM_UNLOCKED = "CVM_UNLOCKED";
    public final String error_class;
    public final long expires_at;
    public final String ferry_phase;
    public final String migration_id;
    public final String new_cvm_env_id;
    public final String new_env_id;
    public final String progress_step;
    public final String stage;
    public final String vault_status;
    public static final Companion Companion = new Companion();
    public static final Set<String> STOP_ERROR_CLASSES = BFI.A0H(new String[]{"VALIDATION", "NOT_FOUND", "UNAUTHORIZED", "NOT_FERRYABLE", "TOO_LARGE", "CANCELLED", "UNREPORTED", "EXPORT_NOT_ENABLED"});
    public static final Set<FerryPhase> PAST_EXPORT_PHASES = BFI.A0H(new FerryPhase[]{FerryPhase.IMPORTING, FerryPhase.RECOVERING, FerryPhase.DONE});
    public static final String STAGE_FINALIZING = "FINALIZING";
    public static final String STAGE_SUCCEEDED = "SUCCEEDED";
    public static final String STAGE_FAILED = "FAILED";
    public static final String STAGE_STRANDED = "STRANDED";
    public static final Set<String> ENDED_OR_FINALIZING_STAGES = BFI.A0H(new String[]{STAGE_FINALIZING, STAGE_SUCCEEDED, STAGE_FAILED, STAGE_STRANDED});

    public final class Companion {
        public final C9hr<CvmMigrationStatusJson> serializer() {
            return CvmMigrationStatusJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_vmswitch_vmswitch(CvmMigrationStatusJson cvmMigrationStatusJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(cvmMigrationStatusJson.stage)) {
            c9j5.AAV(cvmMigrationStatusJson.stage, c9iZ, 0);
        }
        if (zAfR || cvmMigrationStatusJson.expires_at != 0) {
            c9j5.AAN(c9iZ, 1, cvmMigrationStatusJson.expires_at);
        }
        if (zAfR || cvmMigrationStatusJson.new_env_id != null) {
            c9j5.AAP(cvmMigrationStatusJson.new_env_id, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || cvmMigrationStatusJson.new_cvm_env_id != null) {
            c9j5.AAP(cvmMigrationStatusJson.new_cvm_env_id, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || cvmMigrationStatusJson.ferry_phase != null) {
            c9j5.AAP(cvmMigrationStatusJson.ferry_phase, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || cvmMigrationStatusJson.vault_status != null) {
            c9j5.AAP(cvmMigrationStatusJson.vault_status, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || cvmMigrationStatusJson.error_class != null) {
            c9j5.AAP(cvmMigrationStatusJson.error_class, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || cvmMigrationStatusJson.migration_id != null) {
            c9j5.AAP(cvmMigrationStatusJson.migration_id, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || cvmMigrationStatusJson.progress_step != null) {
            c9j5.AAP(cvmMigrationStatusJson.progress_step, C07779iq.A01, c9iZ, 8);
        }
    }

    public final CvmMigrationStatusJson copy(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C7384Etj.A0Y(str, 0);
        return new CvmMigrationStatusJson(str, j, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CvmMigrationStatusJson) {
                CvmMigrationStatusJson cvmMigrationStatusJson = (CvmMigrationStatusJson) obj;
                if (!C7384Etj.areEqual(this.stage, cvmMigrationStatusJson.stage) || this.expires_at != cvmMigrationStatusJson.expires_at || !C7384Etj.areEqual(this.new_env_id, cvmMigrationStatusJson.new_env_id) || !C7384Etj.areEqual(this.new_cvm_env_id, cvmMigrationStatusJson.new_cvm_env_id) || !C7384Etj.areEqual(this.ferry_phase, cvmMigrationStatusJson.ferry_phase) || !C7384Etj.areEqual(this.vault_status, cvmMigrationStatusJson.vault_status) || !C7384Etj.areEqual(this.error_class, cvmMigrationStatusJson.error_class) || !C7384Etj.areEqual(this.migration_id, cvmMigrationStatusJson.migration_id) || !C7384Etj.areEqual(this.progress_step, cvmMigrationStatusJson.progress_step)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CvmMigrationStatusJson copy$default(CvmMigrationStatusJson cvmMigrationStatusJson, String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cvmMigrationStatusJson.stage;
        }
        if ((i & 2) != 0) {
            j = cvmMigrationStatusJson.expires_at;
        }
        if ((i & 4) != 0) {
            str2 = cvmMigrationStatusJson.new_env_id;
        }
        if ((i & 8) != 0) {
            str3 = cvmMigrationStatusJson.new_cvm_env_id;
        }
        if ((i & 16) != 0) {
            str4 = cvmMigrationStatusJson.ferry_phase;
        }
        if ((i & 32) != 0) {
            str5 = cvmMigrationStatusJson.vault_status;
        }
        if ((i & 64) != 0) {
            str6 = cvmMigrationStatusJson.error_class;
        }
        if ((i & 128) != 0) {
            str7 = cvmMigrationStatusJson.migration_id;
        }
        if ((i & 256) != 0) {
            str8 = cvmMigrationStatusJson.progress_step;
        }
        return cvmMigrationStatusJson.copy(str, j, str2, str3, str4, str5, str6, str7, str8);
    }

    private final FerryPhase getFerryPhase() {
        return FerryPhase.Companion.fromWire(this.ferry_phase);
    }

    public final String component1() {
        return this.stage;
    }

    public final long component2() {
        return this.expires_at;
    }

    public final String component3() {
        return this.new_env_id;
    }

    public final String component4() {
        return this.new_cvm_env_id;
    }

    public final String component5() {
        return this.ferry_phase;
    }

    public final String component6() {
        return this.vault_status;
    }

    public final String component7() {
        return this.error_class;
    }

    public final String component8() {
        return this.migration_id;
    }

    public final String component9() {
        return this.progress_step;
    }

    public final boolean getCanRestart() {
        return STAGE_FAILED.equals(this.stage) && !AbstractC0878AGe.A0k(STOP_ERROR_CLASSES, this.error_class);
    }

    public final String getDestinationEnvId() {
        String str = this.new_env_id;
        return str == null ? this.new_cvm_env_id : str;
    }

    public final String getError_class() {
        return this.error_class;
    }

    public final long getExpires_at() {
        return this.expires_at;
    }

    public final String getFerry_phase() {
        return this.ferry_phase;
    }

    public final String getMigration_id() {
        return this.migration_id;
    }

    public final boolean getNeedsExportEnabled() {
        FerryPhase ferryPhase;
        return (ENDED_OR_FINALIZING_STAGES.contains(this.stage) || AbstractC0878AGe.A0k(PAST_EXPORT_PHASES, getFerryPhase()) || ((ferryPhase = getFerryPhase()) != null && ferryPhase.isFailed())) ? false : true;
    }

    public final String getNew_cvm_env_id() {
        return this.new_cvm_env_id;
    }

    public final String getNew_env_id() {
        return this.new_env_id;
    }

    public final String getProgress_step() {
        return this.progress_step;
    }

    public final String getStage() {
        return this.stage;
    }

    public final String getVault_status() {
        return this.vault_status;
    }

    public int hashCode() {
        return (((((((((((((AnonymousClass006.A05(this.expires_at, AnonymousClass001.A0G(this.stage)) * 31) + AnonymousClass006.A0G(this.new_env_id)) * 31) + AnonymousClass006.A0G(this.new_cvm_env_id)) * 31) + AnonymousClass006.A0G(this.ferry_phase)) * 31) + AnonymousClass006.A0G(this.vault_status)) * 31) + AnonymousClass006.A0G(this.error_class)) * 31) + AnonymousClass006.A0G(this.migration_id)) * 31) + AnonymousClass005.A0H(this.progress_step);
    }

    public final boolean isClaiming() {
        return STAGE_CLAIMING.equals(this.stage);
    }

    public final boolean isDestinationUnlocked() {
        return VAULT_CVM_UNLOCKED.equals(this.vault_status);
    }

    public final boolean isExpired(long j) {
        return this.expires_at <= j;
    }

    public final boolean isFailedAttempt() {
        return STAGE_FAILED.equals(this.stage);
    }

    public final boolean isPrepared() {
        return STAGE_PREPARED.equals(this.stage);
    }

    public final boolean isStarted() {
        String str = this.stage;
        return STAGE_STARTED.equals(str) || STAGE_FINALIZING.equals(str) || STAGE_SUCCEEDED.equals(str);
    }

    public final boolean isStranded() {
        return STAGE_STRANDED.equals(this.stage);
    }

    public final boolean isSucceeded() {
        return STAGE_SUCCEEDED.equals(this.stage);
    }

    public final boolean isTransferFailed() {
        FerryPhase ferryPhase;
        String str = this.stage;
        return STAGE_STRANDED.equals(str) || STAGE_FAILED.equals(str) || ((ferryPhase = getFerryPhase()) != null && ferryPhase.isFailed());
    }

    public /* synthetic */ CvmMigrationStatusJson(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8);
    }

    public final ConfidentialVmDataTransferOperation.ProgressStep getProgressStep() {
        ConfidentialVmDataTransferOperation.ProgressStep next;
        Iterator<ConfidentialVmDataTransferOperation.ProgressStep> it = ConfidentialVmDataTransferOperation.ProgressStep.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ConfidentialVmDataTransferOperation.ProgressStep progressStep = next;
            if (progressStep != ConfidentialVmDataTransferOperation.ProgressStep.SWITCHING && progressStep.name().equals(this.progress_step)) {
                break;
            }
        }
        return next;
    }

    public final boolean isAwaitingDestinationUnlock() {
        return getFerryPhase() == FerryPhase.AWAITING_DEST && !isDestinationUnlocked();
    }

    public final boolean isAwaitingDestinationVaultUnread() {
        if (getFerryPhase() != FerryPhase.AWAITING_DEST) {
            return false;
        }
        String str = this.vault_status;
        return str == null || str.length() == 0;
    }

    public final boolean isWaitingOnLockedDestination() {
        return getFerryPhase() == FerryPhase.AWAITING_DEST && VAULT_CVM_LOCKED.equals(this.vault_status);
    }

    public String toString() {
        return super.toString();
    }

    public CvmMigrationStatusJson(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C7384Etj.A0Y(str, 0);
        this.stage = str;
        this.expires_at = j;
        this.new_env_id = str2;
        this.new_cvm_env_id = str3;
        this.ferry_phase = str4;
        this.vault_status = str5;
        this.error_class = str6;
        this.migration_id = str7;
        this.progress_step = str8;
    }

    public /* synthetic */ CvmMigrationStatusJson(int i, String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C2hx c2hx) {
        this.stage = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.expires_at = 0L;
        } else {
            this.expires_at = j;
        }
        if ((i & 4) == 0) {
            this.new_env_id = null;
        } else {
            this.new_env_id = str2;
        }
        if ((i & 8) == 0) {
            this.new_cvm_env_id = null;
        } else {
            this.new_cvm_env_id = str3;
        }
        if ((i & 16) == 0) {
            this.ferry_phase = null;
        } else {
            this.ferry_phase = str4;
        }
        if ((i & 32) == 0) {
            this.vault_status = null;
        } else {
            this.vault_status = str5;
        }
        if ((i & 64) == 0) {
            this.error_class = null;
        } else {
            this.error_class = str6;
        }
        if ((i & 128) == 0) {
            this.migration_id = null;
        } else {
            this.migration_id = str7;
        }
        if ((i & 256) == 0) {
            this.progress_step = null;
        } else {
            this.progress_step = str8;
        }
    }

    public CvmMigrationStatusJson() {
        this("", 0L, null, null, null, null, null, null, null);
    }
}
