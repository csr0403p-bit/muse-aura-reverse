package com.facebook.aura.confidentialvm.vmswitch;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C10543Hqv;
import X.C10571Hud;
import X.C1BN;
import X.C20Q;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3pd;
import X.C7384Etj;
import X.C79;
import X.C9290GCr;
import X.C9hr;
import X.CFK;
import X.CH0;
import X.EnumC10460Hji;
import X.F0C;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.os.SystemClock;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.auth.credentialmanager.MC;
import com.facebook.aura.common.coroutines.LazyStartSingleFlightImpl;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.composer.util.ImageCompressor;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint;
import com.facebook.aura.gateway.HatchlingVmType;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.gateway.store.VmEntryV2Json;
import com.facebook.aura.gateway.store.VmEntryV2JsonKt;
import com.facebook.aura.iap.MC;
import com.facebook.aura.json.HatchProblemJson;
import com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.utils.MC;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class ConfidentialVmMigrationOperation implements ConfidentialVmDataTransferOperation {
    public static final String ERROR_CODE_PREVIOUS_FERRY_DELETING = "CVM_MIGRATION_PREVIOUS_FERRY_DELETING";
    public static final int MAX_PREVIOUS_FERRY_DELETING_WAITS = 12;
    public static final long POLL_INTERVAL_MS = 5000;
    public static final String TAG = "ConfidentialVmMigrationOperation";
    public static final long UNLOCK_CONNECT_TIMEOUT_MS = 60000;
    public static final long UNLOCK_RETRY_INTERVAL_MS = 30000;
    public static final long UNLOCK_STALL_GRACE_MS = 60000;
    public final C3Em<Unit> _upgradePushes;
    public volatile boolean isCleared;
    public volatile Long lastUnlockConnectAtMs;
    public final C1BN<ConfidentialVmDataTransferOperation.Progress> progress;
    public final C20Q<Unit> retryRequests;
    public final SingleFlight singleFlight;
    public final ConfidentialVmCheckpointStore<ConfidentialVmMigrationCheckpoint> store;
    public final ConfidentialVmTransferFollower<ConfidentialVmMigrationCheckpoint> transfer;
    public final AbstractC3358CGz userSession;
    public static final Companion Companion = new Companion();
    public static final Set<String> NOT_RETRYABLE_ERROR_CODES = BFI.A0H(new String[]{"INVALID_CVM_MIGRATION_REQUEST", "CVM_MIGRATION_REQUIRES_SVM", "CVM_MIGRATION_SOURCE_NOT_ELIGIBLE", "CVM_MIGRATION_SOURCE_NOT_OWNED", "CVM_MIGRATION_DISABLED", "CVM_MIGRATION_STORAGE_UNAVAILABLE", "SHELLWORKS_FERRY_NOT_SUPPORTED", "CVM_MIGRATION_SOURCE_HAS_FERRY", "CVM_MIGRATION_VM_LIMIT", "CVM_MIGRATION_COLD_LEASE_DISABLED", "SHELLWORKS_FERRY_FAILED"});

    public final class Companion {
        public final ConfidentialVmMigrationOperation getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ConfidentialVmMigrationOperation) abstractC3358CGz.A03(ConfidentialVmMigrationOperation.class, new ConfidentialVmMigrationOperation$Companion$getInstance$1(abstractC3358CGz));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isAtLeast(long j, long j2, Long l) {
            return l == null || j - l.longValue() >= j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean getHasTransfer(CvmMigrationStatusJson cvmMigrationStatusJson) {
            return cvmMigrationStatusJson.isStarted() || cvmMigrationStatusJson.isTransferFailed();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isPreviousFerryDeleting(Object obj) {
            HatchProblemJson hatchProblemJsonProblem = ConfidentialVmTransferFollowerKt.problem(obj);
            return ConfidentialVmMigrationOperation.ERROR_CODE_PREVIOUS_FERRY_DELETING.equals(hatchProblemJsonProblem != null ? hatchProblemJsonProblem.error_code : null);
        }

        private final long nowSeconds() {
            return C3cI.A02();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public interface Step {

        public final class Advanced extends C06G implements Step {
            public final ConfidentialVmMigrationCheckpoint checkpoint;

            public Advanced(ConfidentialVmMigrationCheckpoint confidentialVmMigrationCheckpoint) {
                C7384Etj.A0Y(confidentialVmMigrationCheckpoint, 0);
                this.checkpoint = confidentialVmMigrationCheckpoint;
            }

            public final Advanced copy(ConfidentialVmMigrationCheckpoint confidentialVmMigrationCheckpoint) {
                C7384Etj.A0Y(confidentialVmMigrationCheckpoint, 0);
                return new Advanced(confidentialVmMigrationCheckpoint);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Advanced) && C7384Etj.areEqual(this.checkpoint, ((Advanced) obj).checkpoint));
            }

            public static /* synthetic */ Advanced copy$default(Advanced advanced, ConfidentialVmMigrationCheckpoint confidentialVmMigrationCheckpoint, int i, Object obj) {
                if ((i & 1) != 0) {
                    confidentialVmMigrationCheckpoint = advanced.checkpoint;
                }
                C7384Etj.A0Y(confidentialVmMigrationCheckpoint, 0);
                return new Advanced(confidentialVmMigrationCheckpoint);
            }

            public final ConfidentialVmMigrationCheckpoint component1() {
                return this.checkpoint;
            }

            public final ConfidentialVmMigrationCheckpoint getCheckpoint() {
                return this.checkpoint;
            }

            public int hashCode() {
                return this.checkpoint.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Stopped extends C06G implements Step {
            public final ConfidentialVmDataTransferOperation.FailureReason reason;
            public final String serverError;

            public Stopped(ConfidentialVmDataTransferOperation.FailureReason failureReason, String str) {
                C7384Etj.A0Y(failureReason, 0);
                this.reason = failureReason;
                this.serverError = str;
            }

            public final Stopped copy(ConfidentialVmDataTransferOperation.FailureReason failureReason, String str) {
                C7384Etj.A0Y(failureReason, 0);
                return new Stopped(failureReason, str);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Stopped) {
                        Stopped stopped = (Stopped) obj;
                        if (this.reason != stopped.reason || !C7384Etj.areEqual(this.serverError, stopped.serverError)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Stopped copy$default(Stopped stopped, ConfidentialVmDataTransferOperation.FailureReason failureReason, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    failureReason = stopped.reason;
                }
                if ((i & 2) != 0) {
                    str = stopped.serverError;
                }
                C7384Etj.A0Y(failureReason, 0);
                return new Stopped(failureReason, str);
            }

            public final ConfidentialVmDataTransferOperation.FailureReason component1() {
                return this.reason;
            }

            public final String component2() {
                return this.serverError;
            }

            public final ConfidentialVmDataTransferOperation.FailureReason getReason() {
                return this.reason;
            }

            public final String getServerError() {
                return this.serverError;
            }

            public int hashCode() {
                return AnonymousClass005.A0E(this.reason) + AnonymousClass006.A0G(this.serverError);
            }

            public String toString() {
                return super.toString();
            }

            public /* synthetic */ Stopped(ConfidentialVmDataTransferOperation.FailureReason failureReason, String str, int i, C06H c06h) {
                this(failureReason, AnonymousClass006.A0s(i, str));
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation", f = "ConfidentialVmMigrationOperation.kt", l = {121}, m = "adoptRunningMigration", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$adoptRunningMigration$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmMigrationOperation.this.adoptRunningMigration(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation", f = "ConfidentialVmMigrationOperation.kt", l = {141, 148}, m = "clearSavedProgress", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$clearSavedProgress$1, reason: invalid class name and case insensitive filesystem */
    public final class C113041 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C113041(HtJ<? super C113041> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmMigrationOperation.this.clearSavedProgress(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation", f = "ConfidentialVmMigrationOperation.kt", l = {MC.stella_payments_in_app_purchases.__CONFIG__}, m = "exclusive", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$exclusive$1, reason: invalid class name and case insensitive filesystem */
    public final class C113051<T> extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C113051(HtJ<? super C113051> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmMigrationOperation.this.exclusive(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$followStartedTransfer$2", f = "ConfidentialVmMigrationOperation.kt", l = {SelfieSnapshotKt.SELFIE_JPEG_QUALITY, 97}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$followStartedTransfer$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0U<HtJ<? super ConfidentialVmDataTransferOperation.Outcome>, Object> {
        public Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$followStartedTransfer$2$1", f = "ConfidentialVmMigrationOperation.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$followStartedTransfer$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ConfidentialVmMigrationCheckpoint>, Object> {
            public int label;
            public final /* synthetic */ ConfidentialVmMigrationOperation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ConfidentialVmMigrationOperation confidentialVmMigrationOperation, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.this$0 = confidentialVmMigrationOperation;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return this.this$0.pendingCheckpoint();
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super ConfidentialVmMigrationCheckpoint> htJ) {
                return new AnonymousClass1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return ConfidentialVmMigrationOperation.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super ConfidentialVmDataTransferOperation.Outcome> htJ) {
            return ConfidentialVmMigrationOperation.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0012 A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r5 = 1
                r4 = 2
                r3 = 0
                if (r0 == 0) goto L13
                if (r0 == r5) goto L2a
                if (r0 != r4) goto L4a
                X.Hwg.A00(r8)
            L10:
                if (r8 == 0) goto L4f
                return r8
            L13:
                X.Hwg.A00(r8)
                X.78T r2 = X.C3cG.A0v()
                com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation r1 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.this
                com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$followStartedTransfer$2$1 r0 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$followStartedTransfer$2$1
                r0.<init>(r1, r3)
                r7.label = r5
                java.lang.Object r8 = X.GAo.A00(r7, r2, r0)
                if (r8 != r6) goto L2d
                return r6
            L2a:
                X.Hwg.A00(r8)
            L2d:
                com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r8 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint) r8
                if (r8 == 0) goto L4f
                com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation r2 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.this
                com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint$Phase r1 = r8.phase
                com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint$Phase r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint.Phase.STARTED
                if (r1 != r0) goto L4f
                boolean r0 = r2.isCleared
                if (r0 != 0) goto L4f
                com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.this
                r7.L$0 = r3
                r7.label = r4
                java.lang.Object r8 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.access$followTransfer(r0, r8, r7)
                if (r8 != r6) goto L10
                return r6
            L4a:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L4f:
                com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation r1 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.this
                com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$FailureReason r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.FailureReason.NO_MIGRATION
                com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$Outcome r8 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.failed$default(r1, r0, r3, r4, r3)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$followTransfer$2", f = "ConfidentialVmMigrationOperation.kt", l = {354}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$followTransfer$2, reason: invalid class name and case insensitive filesystem */
    public final class C113062 extends AbstractC07127nr implements G0W<ConfidentialVmMigrationCheckpoint, CvmMigrationStatusJson, HtJ<? super ConfidentialVmDataTransferOperation.Outcome>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public C113062(HtJ<? super C113062> htJ) {
            super(3, htJ);
        }

        @Override // X.G0W
        public final Object invoke(ConfidentialVmMigrationCheckpoint confidentialVmMigrationCheckpoint, CvmMigrationStatusJson cvmMigrationStatusJson, HtJ<? super ConfidentialVmDataTransferOperation.Outcome> htJ) {
            C113062 c113062 = ConfidentialVmMigrationOperation.this.new C113062(htJ);
            c113062.L$0 = confidentialVmMigrationCheckpoint;
            c113062.L$1 = cvmMigrationStatusJson;
            return c113062.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ConfidentialVmMigrationCheckpoint confidentialVmMigrationCheckpoint = (ConfidentialVmMigrationCheckpoint) this.L$0;
            CvmMigrationStatusJson cvmMigrationStatusJson = (CvmMigrationStatusJson) this.L$1;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                if (!cvmMigrationStatusJson.getCanRestart()) {
                    return null;
                }
                ConfidentialVmMigrationOperation.this.store.write(confidentialVmMigrationCheckpoint.withoutPreparation());
                ConfidentialVmMigrationOperation confidentialVmMigrationOperation = ConfidentialVmMigrationOperation.this;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (confidentialVmMigrationOperation.restoreSource(confidentialVmMigrationCheckpoint, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return ConfidentialVmMigrationOperation.failed$default(ConfidentialVmMigrationOperation.this, ConfidentialVmDataTransferOperation.FailureReason.TRANSFER_INTERRUPTED, null, 2, null);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$followTransfer$3", f = "ConfidentialVmMigrationOperation.kt", l = {368}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$followTransfer$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0W<ConfidentialVmMigrationCheckpoint, CvmMigrationStatusJson, HtJ<? super ConfidentialVmDataTransferOperation.Outcome>, Object> {
        public final /* synthetic */ C10543Hqv<Long> $lastUnlockAttemptAtMs;
        public long J$0;
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C10543Hqv<Long> c10543Hqv, HtJ<? super AnonymousClass3> htJ) {
            super(3, htJ);
            this.$lastUnlockAttemptAtMs = c10543Hqv;
        }

        @Override // X.G0W
        public final Object invoke(ConfidentialVmMigrationCheckpoint confidentialVmMigrationCheckpoint, CvmMigrationStatusJson cvmMigrationStatusJson, HtJ<? super ConfidentialVmDataTransferOperation.Outcome> htJ) {
            AnonymousClass3 anonymousClass3 = ConfidentialVmMigrationOperation.this.new AnonymousClass3(this.$lastUnlockAttemptAtMs, htJ);
            anonymousClass3.L$0 = confidentialVmMigrationCheckpoint;
            anonymousClass3.L$1 = cvmMigrationStatusJson;
            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Long] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ConfidentialVmMigrationCheckpoint confidentialVmMigrationCheckpoint = (ConfidentialVmMigrationCheckpoint) this.L$0;
            CvmMigrationStatusJson cvmMigrationStatusJson = (CvmMigrationStatusJson) this.L$1;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return null;
            }
            Hwg.A00(obj);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (!cvmMigrationStatusJson.isAwaitingDestinationUnlock()) {
                return null;
            }
            Companion companion = ConfidentialVmMigrationOperation.Companion;
            if (!companion.isAtLeast(jElapsedRealtime, 60000L, ConfidentialVmMigrationOperation.this.lastUnlockConnectAtMs)) {
                return null;
            }
            C10543Hqv<Long> c10543Hqv = this.$lastUnlockAttemptAtMs;
            if (!companion.isAtLeast(jElapsedRealtime, 30000L, c10543Hqv.element)) {
                return null;
            }
            c10543Hqv.element = C3cG.A0S(jElapsedRealtime);
            ConfidentialVmMigrationOperation confidentialVmMigrationOperation = ConfidentialVmMigrationOperation.this;
            this.L$0 = null;
            this.L$1 = null;
            this.J$0 = jElapsedRealtime;
            this.label = 1;
            if (confidentialVmMigrationOperation.unlock(confidentialVmMigrationCheckpoint, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return null;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation", f = "ConfidentialVmMigrationOperation.kt", l = {MC.xe_feta_entrypoint_rl.__CONFIG__, 382}, m = "isSafeToReturnToSource", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$isSafeToReturnToSource$1, reason: invalid class name and case insensitive filesystem */
    public final class C113071 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C113071(HtJ<? super C113071> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmMigrationOperation.this.isSafeToReturnToSource(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation", f = "ConfidentialVmMigrationOperation.kt", l = {244, 249, 250, 253}, m = "prepare", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$prepare$1, reason: invalid class name and case insensitive filesystem */
    public final class C113081 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C113081(HtJ<? super C113081> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmMigrationOperation.this.prepare(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation", f = "ConfidentialVmMigrationOperation.kt", l = {198, 199}, m = "prepareAndStart", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$prepareAndStart$1, reason: invalid class name and case insensitive filesystem */
    public final class C113091 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C113091(HtJ<? super C113091> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmMigrationOperation.this.prepareAndStart(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation", f = "ConfidentialVmMigrationOperation.kt", l = {170}, m = "restoreSource", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$restoreSource$1, reason: invalid class name and case insensitive filesystem */
    public final class C113101 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C113101(HtJ<? super C113101> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmMigrationOperation.this.restoreSource(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation", f = "ConfidentialVmMigrationOperation.kt", l = {131}, m = "resumeIfStarted", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$resumeIfStarted$1, reason: invalid class name and case insensitive filesystem */
    public final class C113111 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C113111(HtJ<? super C113111> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmMigrationOperation.this.resumeIfStarted(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$run$2", f = "ConfidentialVmMigrationOperation.kt", l = {HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$run$2, reason: invalid class name and case insensitive filesystem */
    public final class C113122 extends AbstractC07127nr implements G0U<HtJ<? super ConfidentialVmDataTransferOperation.Outcome>, Object> {
        public Object L$0;
        public int label;

        public C113122(HtJ<? super C113122> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return ConfidentialVmMigrationOperation.this.new C113122(htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super ConfidentialVmDataTransferOperation.Outcome> htJ) {
            return ConfidentialVmMigrationOperation.this.new C113122(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ConfidentialVmTransferFollower<ConfidentialVmMigrationCheckpoint> confidentialVmTransferFollower;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConfidentialVmMigrationOperation.this.transfer.resetProgress();
                ConfidentialVmMigrationOperation confidentialVmMigrationOperation = ConfidentialVmMigrationOperation.this;
                confidentialVmTransferFollower = confidentialVmMigrationOperation.transfer;
                this.L$0 = confidentialVmTransferFollower;
                this.label = 1;
                obj = confidentialVmMigrationOperation.runMigration(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                confidentialVmTransferFollower = (ConfidentialVmTransferFollower) this.L$0;
                Hwg.A00(obj);
            }
            return confidentialVmTransferFollower.withFailedProgress((ConfidentialVmDataTransferOperation.Outcome) obj);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation", f = "ConfidentialVmMigrationOperation.kt", l = {83, ImageCompressor.IMAGE_COMPRESSION_QUALITY, 86, 88}, m = "runMigration", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$runMigration$1, reason: invalid class name and case insensitive filesystem */
    public final class C113131 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C113131(HtJ<? super C113131> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmMigrationOperation.this.runMigration(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation", f = "ConfidentialVmMigrationOperation.kt", l = {HatchVoiceAnnouncementSheetKt.NUX_FADE_IN_DELAY_MS, 177, 181, 183, 187, 189, 193}, m = "startMigration", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$startMigration$1, reason: invalid class name and case insensitive filesystem */
    public final class C113141 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C113141(HtJ<? super C113141> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmMigrationOperation.this.startMigration(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation", f = "ConfidentialVmMigrationOperation.kt", l = {MC.frl_google_credential_manager.__CONFIG__}, m = "startTransfer", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$startTransfer$1, reason: invalid class name and case insensitive filesystem */
    public final class C113151 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C113151(HtJ<? super C113151> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmMigrationOperation.this.startTransfer(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation", f = "ConfidentialVmMigrationOperation.kt", l = {231, 235}, m = "unlock", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$unlock$1, reason: invalid class name and case insensitive filesystem */
    public final class C113161 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C113161(HtJ<? super C113161> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmMigrationOperation.this.unlock(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation", f = "ConfidentialVmMigrationOperation.kt", l = {207, 208}, m = "unlockAndStart", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$unlockAndStart$1, reason: invalid class name and case insensitive filesystem */
    public final class C113171 extends HzP {
        public Object L$0;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C113171(HtJ<? super C113171> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmMigrationOperation.this.unlockAndStart(null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation", f = "ConfidentialVmMigrationOperation.kt", l = {215, HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE, 220}, m = "unlockBeforeStart", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$unlockBeforeStart$1, reason: invalid class name and case insensitive filesystem */
    public final class C113181 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C113181(HtJ<? super C113181> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmMigrationOperation.this.unlockBeforeStart(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* renamed from: requestPreparation-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m486requestPreparationgIAlus(java.lang.String r13, X.HtJ<? super X.HsJ<com.facebook.aura.confidentialvm.vmswitch.ProvisionAndPrepareMigrationResponseJson>> r14) {
        /*
            r12 = this;
            r3 = r14
            boolean r0 = r14 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$requestPreparation$1
            if (r0 == 0) goto L56
            r14 = r3
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$requestPreparation$1 r14 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$requestPreparation$1) r14
            int r2 = r14.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r14.label = r2
        L13:
            java.lang.Object r2 = r14.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r14.label
            r10 = 1
            if (r0 == 0) goto L23
            if (r0 != r10) goto L5c
            java.lang.Object r0 = X.AnonymousClass001.A0q(r2)
        L22:
            return r0
        L23:
            X.Hwg.A00(r2)
            com.facebook.aura.network.http.HatchHttpApi r2 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.confidentialvm.repository.ConfidentialVmStefiPath$ProvisionAndPrepareMigration r6 = com.facebook.aura.confidentialvm.repository.ConfidentialVmStefiPath.ProvisionAndPrepareMigration.INSTANCE
            r11 = 0
            com.facebook.aura.confidentialvm.vmswitch.ProvisionAndPrepareMigrationRequestJson r7 = new com.facebook.aura.confidentialvm.vmswitch.ProvisionAndPrepareMigrationRequestJson
            r7.<init>(r13, r11)
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r9 = X.AGH.A0E()
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$requestPreparation-gIAlu-s$$inlined$executeStefiRequest-tZkwj4A$default$1 r3 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$requestPreparationgIAlus$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$requestPreparation-gIAlu-s$$inlined$executeStefiRequest-tZkwj4A$default$2 r4 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$requestPreparationgIAlus$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE
            r5 = 0
            r14.L$0 = r11
            r14.L$1 = r11
            r14.L$2 = r11
            r14.L$3 = r11
            r14.L$4 = r11
            r14.L$5 = r11
            r14.I$0 = r10
            r14.I$1 = r5
            r14.label = r10
            r12 = r5
            r13 = r11
            java.lang.Object r0 = r2.m1604executeStefiRequestWithjLovISM(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r0 != r1) goto L22
            return r1
        L56:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$requestPreparation$1 r14 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$requestPreparation$1
            r14.<init>(r12, r3)
            goto L13
        L5c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.m486requestPreparationgIAlus(java.lang.String, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation
    public void clearFailedProgress(ConfidentialVmDataTransferOperation.Progress progress) {
        C7384Etj.A0Y(progress, 0);
        this.transfer.clearFailedProgress(progress);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.isCleared = true;
        this.singleFlight.clearAndCancelAll();
    }

    @Override // com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation
    public Object followStartedTransfer(HtJ<? super ConfidentialVmDataTransferOperation.Outcome> htJ) {
        return exclusive(new AnonymousClass2(null), htJ);
    }

    @Override // com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation
    public Object run(HtJ<? super ConfidentialVmDataTransferOperation.Outcome> htJ) {
        return exclusive(new C113122(null), htJ);
    }

    private final String currentVmId() {
        String strA0a = C3cH.A0a(HatchGatewayPrefsStore.Companion, this.userSession);
        if (strA0a == null || strA0a.length() <= 0) {
            return null;
        }
        return strA0a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object exclusive(X.G0U<? super X.HtJ<? super T>, ? extends java.lang.Object> r7, X.HtJ<? super T> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.C113051
            if (r0 == 0) goto L44
            r5 = r8
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$exclusive$1 r5 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.C113051) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L2c
            if (r0 != r3) goto L4a
            X.Hwg.A00(r1)
        L20:
            com.facebook.aura.common.coroutines.SingleFlightResult r1 = (com.facebook.aura.common.coroutines.SingleFlightResult) r1
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.aura.common.coroutines.SingleFlightResult.Result<T of com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.exclusive>"
            X.C7384Etj.A0Z(r1, r0)
            com.facebook.aura.common.coroutines.SingleFlightResult$Result r1 = (com.facebook.aura.common.coroutines.SingleFlightResult.Result) r1
            T r0 = r1.value
            return r0
        L2c:
            X.Hwg.A00(r1)
            com.facebook.aura.common.coroutines.SingleFlight r2 = r6.singleFlight
            r0 = 0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$exclusive$result$1 r1 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$exclusive$result$1
            r1.<init>(r7, r0)
            r5.L$0 = r0
            r5.label = r3
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r2.invoke(r0, r1, r5)
            if (r1 != r4) goto L20
            return r4
        L44:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$exclusive$1 r5 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$exclusive$1
            r5.<init>(r8)
            goto L12
        L4a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.exclusive(X.G0U, X.HtJ):java.lang.Object");
    }

    private final Step.Advanced followIfStarted(ConfidentialVmMigrationCheckpoint confidentialVmMigrationCheckpoint, CvmMigrationStatusJson cvmMigrationStatusJson) {
        if (cvmMigrationStatusJson == null || !cvmMigrationStatusJson.isStarted() || !ConfidentialVmTransferFollowerKt.describes(cvmMigrationStatusJson, confidentialVmMigrationCheckpoint)) {
            return null;
        }
        CFK.A03(cvmMigrationStatusJson.stage, TAG, "The server reports this migration started: stage=%s");
        return markStarted(confidentialVmMigrationCheckpoint, cvmMigrationStatusJson.new_cvm_env_id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isSafeToReturnToSource(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r8, X.HtJ<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.C113071
            if (r0 == 0) goto L8e
            r3 = r9
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$isSafeToReturnToSource$1 r3 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.C113071) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8e
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r5 = r3.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r2 = 2
            r7 = 0
            r1 = 1
            if (r0 == 0) goto L53
            if (r0 == r1) goto L63
            if (r0 != r2) goto L9b
            java.lang.Object r8 = r3.L$0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r8 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint) r8
            java.lang.Object r2 = X.AnonymousClass001.A0q(r5)
        L29:
            boolean r1 = r2 instanceof X.C10571Hud
            r0 = 0
            if (r1 == 0) goto L2f
            r2 = r0
        L2f:
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto La0
            java.util.Iterator r6 = r2.iterator()
            r5 = r0
            r4 = 0
        L39:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L95
            java.lang.Object r3 = r6.next()
            r2 = r3
            com.facebook.aura.gateway.store.VmEntryV2Json r2 = (com.facebook.aura.gateway.store.VmEntryV2Json) r2
            java.lang.String r1 = r8.oldEnvId
            boolean r1 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt.hasEnvId(r2, r1)
            if (r1 == 0) goto L39
            if (r4 != 0) goto L97
            r5 = r3
            r4 = 1
            goto L39
        L53:
            X.Hwg.A00(r5)
            java.lang.String r0 = r8.oldEnvId
            r3.L$0 = r8
            r3.label = r1
            java.lang.Object r1 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt.readCvmMigrationStatus(r0, r3)
            if (r1 != r4) goto L6b
            return r4
        L63:
            java.lang.Object r8 = r3.L$0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r8 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint) r8
            java.lang.Object r1 = X.AnonymousClass001.A0q(r5)
        L6b:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L7e
            java.lang.Integer r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt.httpCode(r1)
            if (r0 == 0) goto Lb0
            int r1 = r0.intValue()
            r0 = 404(0x194, float:5.66E-43)
            if (r1 == r0) goto L7e
            goto Lb0
        L7e:
            com.facebook.aura.gateway.HatchVmRepository r1 = com.facebook.aura.gateway.HatchVmRepository.INSTANCE
            r3.L$0 = r8
            r0 = 0
            r3.L$1 = r0
            r3.label = r2
            java.lang.Object r2 = r1.m966fetchLiveVmsIoAF18A(r3)
            if (r2 != r4) goto L29
            return r4
        L8e:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$isSafeToReturnToSource$1 r3 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$isSafeToReturnToSource$1
            r3.<init>(r9)
            goto L12
        L95:
            if (r4 != 0) goto L98
        L97:
            r5 = r0
        L98:
            com.facebook.aura.gateway.store.VmEntryV2Json r5 = (com.facebook.aura.gateway.store.VmEntryV2Json) r5
            goto La1
        L9b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        La0:
            r5 = r0
        La1:
            com.facebook.aura.gateway.HatchlingVmType$Companion r1 = com.facebook.aura.gateway.HatchlingVmType.Companion
            if (r5 == 0) goto La7
            java.lang.String r0 = r5.vm_type
        La7:
            com.facebook.aura.gateway.HatchlingVmType r1 = r1.fromResponseWire(r0)
            com.facebook.aura.gateway.HatchlingVmType r0 = com.facebook.aura.gateway.HatchlingVmType.HATCH_VM
            if (r1 != r0) goto Lb0
            r7 = 1
        Lb0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.isSafeToReturnToSource(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint, X.HtJ):java.lang.Object");
    }

    private final Step.Advanced markStarted(ConfidentialVmMigrationCheckpoint confidentialVmMigrationCheckpoint, String str) {
        ConfidentialVmMigrationCheckpoint.Phase phase = ConfidentialVmMigrationCheckpoint.Phase.STARTED;
        if (str == null) {
            str = confidentialVmMigrationCheckpoint.newCvmEnvId;
        }
        F0C<C9hr<Object>>[] f0cArr = ConfidentialVmMigrationCheckpoint.$childSerializers;
        String str2 = confidentialVmMigrationCheckpoint.oldEnvId;
        String str3 = confidentialVmMigrationCheckpoint.sourceWsUrl;
        C7384Etj.A0Y(str2, 0);
        ConfidentialVmMigrationCheckpoint confidentialVmMigrationCheckpoint2 = new ConfidentialVmMigrationCheckpoint(str2, str3, phase, str);
        if (!this.store.write(confidentialVmMigrationCheckpoint2)) {
            CFK.A06(TAG, "Could not record the migration start");
        }
        return new Step.Advanced(confidentialVmMigrationCheckpoint2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConfidentialVmMigrationCheckpoint pendingCheckpoint() {
        ConfidentialVmMigrationCheckpoint confidentialVmMigrationCheckpoint = this.store.read();
        if (confidentialVmMigrationCheckpoint == null || confidentialVmMigrationCheckpoint.phase == ConfidentialVmMigrationCheckpoint.Phase.ABANDONED) {
            return null;
        }
        return confidentialVmMigrationCheckpoint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00b2 -> B:28:0x006f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prepare(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r11, X.HtJ<? super com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.Step> r12) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.prepare(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prepareAndStart(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r7, X.HtJ<? super com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.Step> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.C113091
            if (r0 == 0) goto L58
            r5 = r8
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$prepareAndStart$1 r5 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.C113091) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L24
            if (r0 == r1) goto L33
            if (r0 != r2) goto L5e
            X.Hwg.A00(r4)
        L23:
            return r4
        L24:
            X.Hwg.A00(r4)
            r0 = 0
            r5.L$0 = r0
            r5.label = r1
            java.lang.Object r4 = r6.prepare(r7, r5)
            if (r4 != r3) goto L36
        L32:
            return r3
        L33:
            X.Hwg.A00(r4)
        L36:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$Step r4 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.Step) r4
            boolean r0 = r4 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.Step.Advanced
            if (r0 == 0) goto L4f
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$Step$Advanced r4 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.Step.Advanced) r4
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r1 = r4.checkpoint
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.label = r2
            r0 = 0
            java.lang.Object r0 = r6.unlockAndStart(r1, r0, r5)
            if (r0 == r3) goto L32
            return r0
        L4f:
            boolean r0 = r4 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.Step.Stopped
            if (r0 != 0) goto L23
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L58:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$prepareAndStart$1 r5 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$prepareAndStart$1
            r5.<init>(r8)
            goto L12
        L5e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.prepareAndStart(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint, X.HtJ):java.lang.Object");
    }

    private final Step recordPreparation(ConfidentialVmMigrationCheckpoint confidentialVmMigrationCheckpoint, Object obj) {
        String str;
        Object obj2 = obj;
        if (obj instanceof C10571Hud) {
            obj2 = null;
        }
        ProvisionAndPrepareMigrationResponseJson provisionAndPrepareMigrationResponseJson = (ProvisionAndPrepareMigrationResponseJson) obj2;
        if (provisionAndPrepareMigrationResponseJson == null || (str = provisionAndPrepareMigrationResponseJson.new_cvm_env_id) == null) {
            return preparationFailure(obj);
        }
        ConfidentialVmMigrationCheckpoint.Phase phase = ConfidentialVmMigrationCheckpoint.Phase.PREPARED;
        F0C<C9hr<Object>>[] f0cArr = ConfidentialVmMigrationCheckpoint.$childSerializers;
        String str2 = confidentialVmMigrationCheckpoint.oldEnvId;
        String str3 = confidentialVmMigrationCheckpoint.sourceWsUrl;
        C7384Etj.A0Y(str2, 0);
        ConfidentialVmMigrationCheckpoint confidentialVmMigrationCheckpoint2 = new ConfidentialVmMigrationCheckpoint(str2, str3, phase, str);
        return this.store.write(confidentialVmMigrationCheckpoint2) ? new Step.Advanced(confidentialVmMigrationCheckpoint2) : new Step.Stopped(ConfidentialVmDataTransferOperation.FailureReason.CHECKPOINT_FAILED, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object restoreSource(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.C113101
            if (r0 == 0) goto L63
            r4 = r8
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$restoreSource$1 r4 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.C113101) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r5 = 1
            if (r0 == 0) goto L23
            if (r0 != r5) goto L69
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L23:
            X.Hwg.A00(r1)
            java.lang.String r2 = r7.sourceWsUrl
            if (r2 == 0) goto L20
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore$Companion r1 = com.facebook.aura.gateway.store.HatchGatewayPrefsStore.Companion
            X.CGz r0 = r6.userSession
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore r1 = r1.getInstance(r0)
            java.lang.String r0 = r1.getGatewayUrl()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L20
            boolean r0 = r1.commitGatewayUrl(r2)
            if (r0 != 0) goto L4a
            java.lang.String r1 = "ConfidentialVmMigrationOperation"
            java.lang.String r0 = "Could not restore the SVM gateway URL"
            X.CFK.A06(r1, r0)
            goto L20
        L4a:
            com.facebook.aura.gateway.service.HatchGatewayServiceManager r1 = com.facebook.aura.gateway.service.HatchGatewayServiceManager.INSTANCE
            X.CGz r0 = r6.userSession
            com.facebook.aura.gateway.HatchGatewayConnection r2 = r1.getGateway(r0)
            r1 = 0
            r4.L$0 = r1
            r4.L$1 = r1
            r4.L$2 = r1
            r4.label = r5
            r0 = 0
            java.lang.Object r0 = r2.fetchAndConnect(r5, r0, r1, r4)
            if (r0 != r3) goto L20
            return r3
        L63:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$restoreSource$1 r4 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$restoreSource$1
            r4.<init>(r8)
            goto L12
        L69:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.restoreSource(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runMigration(X.HtJ<? super com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.Outcome> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.C113131
            if (r0 == 0) goto L8e
            r7 = r10
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$runMigration$1 r7 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.C113131) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8e
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r2 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r8 = 4
            r5 = 3
            r4 = 1
            r3 = 2
            if (r0 == 0) goto L38
            if (r0 == r4) goto L9a
            if (r0 == r3) goto L62
            if (r0 == r5) goto L9a
            if (r0 != r8) goto L95
            java.lang.Object r0 = r7.L$1
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$Step r0 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.Step) r0
            X.Hwg.A00(r2)
        L2d:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$Step$Stopped r0 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.Step.Stopped) r0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$FailureReason r1 = r0.reason
            java.lang.String r0 = r0.serverError
        L33:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$Outcome r2 = r9.failed(r1, r0)
        L37:
            return r2
        L38:
            X.Hwg.A00(r2)
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r1 = r9.pendingCheckpoint()
            if (r1 != 0) goto L45
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$FailureReason r1 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.FailureReason.NO_MIGRATION
            r0 = 0
            goto L33
        L45:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint$Phase r2 = r1.phase
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint$Phase r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint.Phase.STARTED
            if (r2 != r0) goto L57
            r0 = 0
            r7.L$0 = r0
            r7.label = r4
        L50:
            java.lang.Object r2 = r9.followTransfer(r1, r7)
            if (r2 != r6) goto L37
        L56:
            return r6
        L57:
            r7.L$0 = r1
            r7.label = r3
            java.lang.Object r2 = r9.startMigration(r1, r7)
            if (r2 != r6) goto L69
            return r6
        L62:
            java.lang.Object r1 = r7.L$0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r1 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint) r1
            X.Hwg.A00(r2)
        L69:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$Step r2 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.Step) r2
            boolean r0 = r2 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.Step.Advanced
            if (r0 == 0) goto L7b
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$Step$Advanced r2 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.Step.Advanced) r2
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r1 = r2.checkpoint
            r0 = 0
            r7.L$0 = r0
            r7.L$1 = r0
            r7.label = r5
            goto L50
        L7b:
            boolean r0 = r2 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.Step.Stopped
            if (r0 == 0) goto L9e
            r0 = 0
            r7.L$0 = r0
            r7.L$1 = r2
            r7.label = r8
            java.lang.Object r0 = r9.restoreSource(r1, r7)
            if (r0 == r6) goto L56
            r0 = r2
            goto L2d
        L8e:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$runMigration$1 r7 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$runMigration$1
            r7.<init>(r10)
            goto L12
        L95:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L9a:
            X.Hwg.A00(r2)
            return r2
        L9e:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.runMigration(X.HtJ):java.lang.Object");
    }

    private final String sourceWsUrl(String str) {
        VmEntryV2Json next;
        Iterator<VmEntryV2Json> it = VmEntryV2JsonKt.decodeCachedVmList(HatchGatewayPrefsStore.Companion.getInstance(this.userSession).getCachedVmListJson()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (ConfidentialVmTransferFollowerKt.hasEnvId(next, str)) {
                break;
            }
        }
        VmEntryV2Json vmEntryV2Json = next;
        if (vmEntryV2Json != null) {
            return vmEntryV2Json.vm_ws_url;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startMigration(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r10, X.HtJ<? super com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.Step> r11) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.startMigration(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startTransfer(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r16, X.HtJ<? super com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.Step> r17) {
        /*
            r15 = this;
            r6 = r17
            r3 = r16
            boolean r0 = r6 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.C113151
            r4 = r15
            if (r0 == 0) goto L74
            r1 = r6
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$startTransfer$1 r1 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.C113151) r1
            int r5 = r1.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r2
            if (r0 == 0) goto L74
            int r5 = r5 - r2
            r1.label = r5
        L17:
            java.lang.Object r5 = r1.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r1.label
            r13 = 1
            if (r0 == 0) goto L3c
            if (r0 != r13) goto La5
            java.lang.Object r3 = r1.L$0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r3 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint) r3
            java.lang.Object r5 = X.AnonymousClass001.A0q(r5)
        L2a:
            boolean r2 = r5 instanceof X.C10571Hud
            r1 = 0
            r0 = r5
            if (r2 == 0) goto L31
            r0 = r1
        L31:
            com.facebook.aura.confidentialvm.vmswitch.StartCvmMigrationResponseJson r0 = (com.facebook.aura.confidentialvm.vmswitch.StartCvmMigrationResponseJson) r0
            if (r0 == 0) goto L7a
            java.lang.String r0 = r0.new_cvm_env_id
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$Step$Advanced r2 = r4.markStarted(r3, r0)
            return r2
        L3c:
            X.Hwg.A00(r5)
            com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.confidentialvm.repository.ConfidentialVmStefiPath$StartCvmMigration r9 = com.facebook.aura.confidentialvm.repository.ConfidentialVmStefiPath.StartCvmMigration.INSTANCE
            java.lang.String r0 = r3.oldEnvId
            com.facebook.aura.confidentialvm.vmswitch.StartCvmMigrationRequestJson r10 = new com.facebook.aura.confidentialvm.vmswitch.StartCvmMigrationRequestJson
            r10.<init>(r0)
            com.facebook.aura.network.http.RequestType r11 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r12 = X.AGH.A0E()
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$startTransfer$$inlined$executeStefiRequest-tZkwj4A$default$1 r6 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$startTransfer$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$startTransfer$$inlined$executeStefiRequest-tZkwj4A$default$2 r7 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$startTransfer$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE
            r8 = 0
            r1.L$0 = r3
            r14 = 0
            r1.L$1 = r14
            r1.L$2 = r14
            r1.L$3 = r14
            r1.L$4 = r14
            r1.L$5 = r14
            r1.I$0 = r13
            r1.I$1 = r8
            r1.label = r13
            r15 = r8
            r16 = r14
            r17 = r1
            java.lang.Object r5 = r5.m1604executeStefiRequestWithjLovISM(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r5 != r2) goto L2a
            return r2
        L74:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$startTransfer$1 r1 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$startTransfer$1
            r1.<init>(r6)
            goto L17
        L7a:
            java.lang.Integer r2 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt.httpCode(r5)
            if (r2 == 0) goto L9a
            int r1 = r2.intValue()
            r0 = 404(0x194, float:5.66E-43)
            if (r1 != r0) goto L9a
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmCheckpointStore<com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint> r1 = r4.store
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r0 = r3.withoutPreparation()
            r1.write(r0)
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$FailureReason r1 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.FailureReason.REQUEST_FAILED
            r0 = 0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$Step$Stopped r2 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$Step$Stopped
            r2.<init>(r1, r0)
            return r2
        L9a:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$FailureReason r1 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt.failureFor(r2)
            r0 = 0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$Step$Stopped r2 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$Step$Stopped
            r2.<init>(r1, r0)
            return r2
        La5:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.startTransfer(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object unlock(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r9, X.HtJ<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.C113161
            if (r0 == 0) goto L7d
            r6 = r10
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$unlock$1 r6 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.C113161) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7d
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L3c
            if (r0 == r4) goto L53
            if (r0 != r5) goto L83
            X.Hwg.A00(r1)
        L23:
            com.facebook.aura.gateway.HatchGatewayStateSnapshot r1 = (com.facebook.aura.gateway.HatchGatewayStateSnapshot) r1
            if (r1 == 0) goto L7b
            boolean r0 = com.facebook.aura.gateway.HatchGatewayConnectionStateKt.isConfidentiallyReady(r1)
            if (r0 != r4) goto L7b
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r0 = X.C3cG.A0S(r0)
            r8.lastUnlockConnectAtMs = r0
        L37:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        L3c:
            X.Hwg.A00(r1)
            java.lang.String r2 = r9.newCvmEnvId
            if (r2 == 0) goto L7b
            X.CGz r1 = r8.userSession
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.label = r4
            java.lang.Object r1 = com.facebook.aura.gateway.HatchColdCvmLeaseKt.awaitColdCvmLaunch(r1, r2, r4, r6)
            if (r1 != r7) goto L56
            return r7
        L53:
            X.Hwg.A00(r1)
        L56:
            com.facebook.aura.gateway.store.VmEntryV2Json r1 = (com.facebook.aura.gateway.store.VmEntryV2Json) r1
            if (r1 == 0) goto L7b
            java.lang.String r0 = r1.vm_auth_token
            if (r0 == 0) goto L7b
            int r0 = r0.length()
            if (r0 == 0) goto L7b
            X.CGz r3 = r8.userSession
            java.lang.String r2 = r1.vm_ws_url
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.L$2 = r0
            r6.label = r5
            r0 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r1 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmGatewayConnectKt.connectGatewayTo(r3, r2, r0, r6)
            if (r1 != r7) goto L23
            return r7
        L7b:
            r4 = 0
            goto L37
        L7d:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$unlock$1 r6 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$unlock$1
            r6.<init>(r10)
            goto L12
        L83:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.unlock(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object unlockAndStart(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r7, boolean r8, X.HtJ<? super com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.Step> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.C113171
            if (r0 == 0) goto L24
            r5 = r9
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$unlockAndStart$1 r5 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.C113171) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r2 = r5.label
            r0 = 1
            r1 = 2
            if (r2 == 0) goto L2f
            if (r2 == r0) goto L4f
            if (r2 != r1) goto L2a
            X.Hwg.A00(r4)
            return r4
        L24:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$unlockAndStart$1 r5 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$unlockAndStart$1
            r5.<init>(r9)
            goto L12
        L2a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2f:
            X.Hwg.A00(r4)
            if (r8 != 0) goto L41
            r5.L$0 = r7
            r5.Z$0 = r8
            r5.label = r0
            java.lang.Object r4 = r6.unlockBeforeStart(r7, r5)
            if (r4 != r3) goto L58
            return r3
        L41:
            r0 = 0
            r5.L$0 = r0
            r5.Z$0 = r8
            r5.label = r1
            java.lang.Object r2 = r6.startTransfer(r7, r5)
            if (r2 != r3) goto L66
            return r3
        L4f:
            boolean r8 = r5.Z$0
            java.lang.Object r7 = r5.L$0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r7 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint) r7
            X.Hwg.A00(r4)
        L58:
            boolean r0 = X.AnonymousClass001.A1X(r4)
            if (r0 != 0) goto L41
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$FailureReason r1 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.FailureReason.DESTINATION_UNAVAILABLE
            r0 = 0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$Step$Stopped r2 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$Step$Stopped
            r2.<init>(r1, r0)
        L66:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.unlockAndStart(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x008d -> B:13:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object unlockBeforeStart(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r10, X.HtJ<? super java.lang.Boolean> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.C113181
            if (r0 == 0) goto L95
            r6 = r11
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$unlockBeforeStart$1 r6 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.C113181) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L95
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r0 = r6.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r8 = 0
            r5 = 3
            r4 = 2
            r3 = 1
            if (r1 == 0) goto L90
            if (r1 == r3) goto L3c
            if (r1 == r4) goto L5c
            if (r1 != r5) goto L9c
            java.lang.Object r2 = r6.L$1
            com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson r2 = (com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson) r2
            java.lang.Object r10 = r6.L$0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r10 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint) r10
            X.Hwg.A00(r0)
        L2f:
            r6.L$0 = r10
            r6.L$1 = r2
            r6.label = r3
            java.lang.Object r0 = r9.unlock(r10, r6)
            if (r0 != r7) goto L47
            return r7
        L3c:
            java.lang.Object r2 = r6.L$1
            com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson r2 = (com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson) r2
            java.lang.Object r10 = r6.L$0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r10 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint) r10
            X.Hwg.A00(r0)
        L47:
            boolean r0 = X.AnonymousClass001.A1X(r0)
            if (r0 != 0) goto L7a
            java.lang.String r0 = r10.oldEnvId
            r6.L$0 = r10
            r6.L$1 = r2
            r6.label = r4
            java.lang.Object r1 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt.readCvmMigrationStatus(r0, r6)
            if (r1 != r7) goto L68
            return r7
        L5c:
            java.lang.Object r2 = r6.L$1
            com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson r2 = (com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson) r2
            java.lang.Object r10 = r6.L$0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r10 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint) r10
            java.lang.Object r1 = X.AnonymousClass001.A0q(r0)
        L68:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L6d
            r1 = r8
        L6d:
            com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson r1 = (com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson) r1
            if (r1 != 0) goto L7f
            if (r2 == 0) goto L81
        L73:
            boolean r0 = r9.keepsStartWindowOpen(r2, r10)
            if (r0 != 0) goto L81
            r3 = 0
        L7a:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L7f:
            r2 = r1
            goto L73
        L81:
            r6.L$0 = r10
            r6.L$1 = r2
            r6.label = r5
            r0 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r0 = X.C7Bq.A01(r0, r6)
            if (r0 != r7) goto L2f
            return r7
        L90:
            X.Hwg.A00(r0)
            r2 = r8
            goto L2f
        L95:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$unlockBeforeStart$1 r6 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$unlockBeforeStart$1
            r6.<init>(r11)
            goto L12
        L9c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.unlockBeforeStart(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object adoptRunningMigration(java.lang.String r8, X.HtJ<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.AnonymousClass1
            if (r0 == 0) goto L80
            r5 = r9
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$adoptRunningMigration$1 r5 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L80
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L50
            if (r0 != r3) goto L86
            java.lang.Object r4 = r5.L$1
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r4 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint) r4
            java.lang.Object r5 = X.AnonymousClass001.A0q(r1)
        L25:
            boolean r1 = r5 instanceof X.C10571Hud
            r0 = 0
            if (r1 == 0) goto L2b
            r5 = r0
        L2b:
            com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson r5 = (com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson) r5
            if (r5 == 0) goto L7e
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$Companion r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.Companion
            boolean r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.Companion.access$getHasTransfer(r0, r5)
            if (r0 == 0) goto L7e
            boolean r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt.describes(r5, r4)
            if (r0 == 0) goto L7e
            java.lang.String r2 = "Following a migration found in the VM list: stage=%s"
            java.lang.String r1 = r5.stage
            java.lang.String r0 = "ConfidentialVmMigrationOperation"
            X.CFK.A03(r1, r0, r2)
            java.lang.String r0 = r5.new_cvm_env_id
            r7.markStarted(r4, r0)
        L4b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L50:
            X.Hwg.A00(r1)
            boolean r0 = r7.hasPreparedMigration()
            if (r0 != 0) goto L7e
            java.lang.String r0 = r7.currentVmId()
            boolean r0 = X.C7384Etj.areEqual(r8, r0)
            if (r0 == 0) goto L7e
            X.F0C<X.9hr<java.lang.Object>>[] r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint.$childSerializers
            java.lang.String r2 = r7.sourceWsUrl(r8)
            r1 = 0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint$Phase r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint.Phase.COMMITTED
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r4 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint
            r4.<init>(r8, r2, r0, r1)
            r5.L$0 = r1
            r5.L$1 = r4
            r5.label = r3
            java.lang.Object r5 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt.readCvmMigrationStatus(r8, r5)
            if (r5 != r6) goto L25
            return r6
        L7e:
            r3 = 0
            goto L4b
        L80:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$adoptRunningMigration$1 r5 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$adoptRunningMigration$1
            r5.<init>(r9)
            goto L12
        L86:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.adoptRunningMigration(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object clearSavedProgress(X.HtJ<? super com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.AfterClear> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.C113041
            if (r0 == 0) goto L8c
            r8 = r11
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$clearSavedProgress$1 r8 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.C113041) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8c
            int r2 = r2 - r1
            r8.label = r2
        L12:
            java.lang.Object r1 = r8.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r9 = 2
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 == r2) goto L4a
            if (r0 != r9) goto L92
            java.lang.Object r6 = r8.L$0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r6 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint) r6
            X.Hwg.A00(r1)
        L27:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint$Phase r1 = r6.phase
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint$Phase r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint.Phase.COMMITTED
            if (r1 == r0) goto L97
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$AfterClear r7 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.AfterClear.RESTART
            return r7
        L30:
            X.Hwg.A00(r1)
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r6 = r10.pendingCheckpoint()
            if (r6 == 0) goto L97
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint$Phase r1 = r6.phase
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint$Phase r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint.Phase.COMMITTED
            if (r1 == r0) goto L61
            r8.L$0 = r6
            r8.label = r2
            java.lang.Object r1 = r10.isSafeToReturnToSource(r6, r8)
            if (r1 != r7) goto L51
            return r7
        L4a:
            java.lang.Object r6 = r8.L$0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r6 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint) r6
            X.Hwg.A00(r1)
        L51:
            boolean r0 = X.AnonymousClass001.A1X(r1)
            if (r0 != 0) goto L61
            java.lang.String r1 = "ConfidentialVmMigrationOperation"
            java.lang.String r0 = "Not leaving: could not confirm the SVM is still usable"
            X.CFK.A06(r1, r0)
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$AfterClear r7 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.AfterClear.KEPT
            return r7
        L61:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmCheckpointStore<com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint> r5 = r10.store
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint$Phase r4 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint.Phase.ABANDONED
            X.F0C<X.9hr<java.lang.Object>>[] r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint.$childSerializers
            java.lang.String r3 = r6.oldEnvId
            java.lang.String r2 = r6.sourceWsUrl
            java.lang.String r1 = r6.newCvmEnvId
            r0 = 0
            X.C7384Etj.A0Y(r3, r0)
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r0 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint
            r0.<init>(r3, r2, r4, r1)
            boolean r0 = r5.write(r0)
            if (r0 != 0) goto L81
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmCheckpointStore<com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint> r0 = r10.store
            r0.clear()
        L81:
            r8.L$0 = r6
            r8.label = r9
            java.lang.Object r0 = r10.restoreSource(r6, r8)
            if (r0 != r7) goto L27
            return r7
        L8c:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$clearSavedProgress$1 r8 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$clearSavedProgress$1
            r8.<init>(r11)
            goto L12
        L92:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L97:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$AfterClear r7 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.AfterClear.STAY
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.clearSavedProgress(X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation
    public C1BN<ConfidentialVmDataTransferOperation.Progress> getProgress() {
        return this.progress;
    }

    @Override // com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation
    public C20Q<Unit> getRetryRequests() {
        return this.retryRequests;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    @Override // com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object resumeIfStarted(X.HtJ<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.C113111
            if (r0 == 0) goto L6d
            r6 = r8
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$resumeIfStarted$1 r6 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.C113111) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6d
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r2 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 0
            r1 = 1
            if (r0 == 0) goto L57
            if (r0 != r1) goto L73
            java.lang.Object r3 = r6.L$0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r3 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint) r3
            java.lang.Object r2 = X.AnonymousClass001.A0q(r2)
        L26:
            boolean r0 = r2 instanceof X.C10571Hud
            r1 = r2
            if (r0 == 0) goto L2c
            r1 = 0
        L2c:
            com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson r1 = (com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson) r1
            if (r1 != 0) goto L4a
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint$Phase r1 = r3.phase
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint$Phase r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint.Phase.STARTED
            if (r1 != r0) goto L45
            java.lang.Integer r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt.httpCode(r2)
            if (r0 == 0) goto L44
            int r1 = r0.intValue()
            r0 = 404(0x194, float:5.66E-43)
            if (r1 == r0) goto L45
        L44:
            r4 = 1
        L45:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L4a:
            boolean r0 = r1.isSucceeded()
            if (r0 != 0) goto L45
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$Step$Advanced r0 = r7.followIfStarted(r3, r1)
            if (r0 == 0) goto L45
            goto L44
        L57:
            X.Hwg.A00(r2)
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint r3 = r7.pendingCheckpoint()
            if (r3 == 0) goto L45
            java.lang.String r0 = r3.oldEnvId
            r6.L$0 = r3
            r6.label = r1
            java.lang.Object r2 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt.readCvmMigrationStatus(r0, r6)
            if (r2 != r5) goto L26
            return r5
        L6d:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$resumeIfStarted$1 r6 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation$resumeIfStarted$1
            r6.<init>(r8)
            goto L12
        L73:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation.resumeIfStarted(X.HtJ):java.lang.Object");
    }

    public final Object transferableArtifacts(HtJ<? super List<ConfidentialVmArtifact>> htJ) {
        return C0881AGi.A00;
    }

    public ConfidentialVmMigrationOperation(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        ConfidentialVmCheckpointStore<ConfidentialVmMigrationCheckpoint> confidentialVmCheckpointStoreStore = ConfidentialVmMigrationCheckpoint.Companion.store(((CH0) abstractC3358CGz).A01);
        this.store = confidentialVmCheckpointStoreStore;
        ConfidentialVmTransferFollower<ConfidentialVmMigrationCheckpoint> confidentialVmTransferFollower = new ConfidentialVmTransferFollower<>(abstractC3358CGz, confidentialVmCheckpointStoreStore, HatchlingVmType.HATCH_CVM);
        this.transfer = confidentialVmTransferFollower;
        OnDuplicateCall.Join join = OnDuplicateCall.Join.INSTANCE;
        C7384Etj.A0Y(join, 1);
        this.singleFlight = new LazyStartSingleFlightImpl(join);
        C9290GCr c9290GCrA12 = C3cG.A12(C79.A00, 0, 1);
        this._upgradePushes = c9290GCrA12;
        this.retryRequests = C3pd.A00(c9290GCrA12);
        this.progress = confidentialVmTransferFollower.progress;
    }

    private final ConfidentialVmDataTransferOperation.Outcome failed(ConfidentialVmDataTransferOperation.FailureReason failureReason, String str) {
        CFK.A0H(TAG, "CVM migration stopped: %s", failureReason);
        return new ConfidentialVmDataTransferOperation.Outcome.Failed(failureReason, str, null);
    }

    public static /* synthetic */ ConfidentialVmDataTransferOperation.Outcome failed$default(ConfidentialVmMigrationOperation confidentialVmMigrationOperation, ConfidentialVmDataTransferOperation.FailureReason failureReason, String str, int i, Object obj) {
        return confidentialVmMigrationOperation.failed(failureReason, AnonymousClass006.A0s(i, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object followTransfer(ConfidentialVmMigrationCheckpoint confidentialVmMigrationCheckpoint, HtJ<? super ConfidentialVmDataTransferOperation.Outcome> htJ) {
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        this.transfer.markTransferStarted();
        return this.transfer.follow(confidentialVmMigrationCheckpoint, new C113062(null), new AnonymousClass3(c10543HqvA0z, null), htJ);
    }

    private final boolean keepsStartWindowOpen(CvmMigrationStatusJson cvmMigrationStatusJson, ConfidentialVmMigrationCheckpoint confidentialVmMigrationCheckpoint) {
        return (!ConfidentialVmTransferFollowerKt.describes(cvmMigrationStatusJson, confidentialVmMigrationCheckpoint) || cvmMigrationStatusJson.isTransferFailed() || cvmMigrationStatusJson.isExpired(C3cI.A02())) ? false : true;
    }

    private final Step.Stopped preparationFailure(Object obj) {
        String str;
        String str2;
        ConfidentialVmDataTransferOperation.FailureReason failureReasonFailureFor;
        HatchProblemJson hatchProblemJsonProblem = ConfidentialVmTransferFollowerKt.problem(obj);
        Integer numHttpCode = ConfidentialVmTransferFollowerKt.httpCode(obj);
        String strA0j = null;
        if (hatchProblemJsonProblem != null) {
            str = hatchProblemJsonProblem.error_code;
            str2 = hatchProblemJsonProblem.title;
        } else {
            str = null;
            str2 = null;
        }
        CFK.A0H(TAG, "Preparation failed: http=%s error_code=%s title=%s", numHttpCode, str, str2);
        if (AbstractC0878AGe.A0k(NOT_RETRYABLE_ERROR_CODES, hatchProblemJsonProblem != null ? hatchProblemJsonProblem.error_code : null)) {
            failureReasonFailureFor = ConfidentialVmDataTransferOperation.FailureReason.MIGRATION_REFUSED;
            if (hatchProblemJsonProblem != null) {
                strA0j = FGI.A0j(hatchProblemJsonProblem.title, ": ", hatchProblemJsonProblem.detail, " (", hatchProblemJsonProblem.error_code, ")");
            }
        } else {
            failureReasonFailureFor = ConfidentialVmTransferFollowerKt.failureFor(ConfidentialVmTransferFollowerKt.httpCode(obj));
        }
        return new Step.Stopped(failureReasonFailureFor, strA0j);
    }

    public final boolean commit() {
        String strCurrentVmId = currentVmId();
        if (strCurrentVmId == null) {
            return false;
        }
        this.transfer.resetProgress();
        ConfidentialVmMigrationCheckpoint confidentialVmMigrationCheckpoint = this.store.read();
        if (!strCurrentVmId.equals(confidentialVmMigrationCheckpoint != null ? confidentialVmMigrationCheckpoint.oldEnvId : null)) {
            return this.store.write(new ConfidentialVmMigrationCheckpoint(strCurrentVmId, HatchGatewayPrefsStore.Companion.getInstance(this.userSession).getGatewayUrl(), ConfidentialVmMigrationCheckpoint.Phase.COMMITTED, null));
        }
        if (confidentialVmMigrationCheckpoint.phase != ConfidentialVmMigrationCheckpoint.Phase.ABANDONED) {
            return true;
        }
        ConfidentialVmCheckpointStore<ConfidentialVmMigrationCheckpoint> confidentialVmCheckpointStore = this.store;
        ConfidentialVmMigrationCheckpoint.Phase phase = ConfidentialVmMigrationCheckpoint.Phase.COMMITTED;
        String str = confidentialVmMigrationCheckpoint.oldEnvId;
        String str2 = confidentialVmMigrationCheckpoint.sourceWsUrl;
        String str3 = confidentialVmMigrationCheckpoint.newCvmEnvId;
        C7384Etj.A0Y(str, 0);
        return confidentialVmCheckpointStore.write(new ConfidentialVmMigrationCheckpoint(str, str2, phase, str3));
    }

    public final boolean hasPreparedMigration() {
        ConfidentialVmMigrationCheckpoint confidentialVmMigrationCheckpointPendingCheckpoint = pendingCheckpoint();
        ConfidentialVmMigrationCheckpoint.Phase phase = confidentialVmMigrationCheckpointPendingCheckpoint != null ? confidentialVmMigrationCheckpointPendingCheckpoint.phase : null;
        return phase == ConfidentialVmMigrationCheckpoint.Phase.PREPARED || phase == ConfidentialVmMigrationCheckpoint.Phase.STARTED;
    }

    public final String onUpgradePushOrDropReason(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        if (AnonymousClass001.A0F(this._upgradePushes.ALE().getValue()) == 0) {
            return "cvm_migration_screen_not_resumed";
        }
        String strUpgradePushDropReason = ConfidentialVmMigrationOperationKt.upgradePushDropReason(pendingCheckpoint(), str, str2);
        if (strUpgradePushDropReason != null) {
            return strUpgradePushDropReason;
        }
        if (this._upgradePushes.AhV(Unit.INSTANCE)) {
            return null;
        }
        return "cvm_retry_pending";
    }

    public /* synthetic */ ConfidentialVmMigrationOperation(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
