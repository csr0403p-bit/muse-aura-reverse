package com.facebook.aura.confidentialvm.vmswitch;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFI;
import X.BO7;
import X.C06G;
import X.C06H;
import X.C10571Hud;
import X.C1BN;
import X.C20Q;
import X.C2CS;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.CFK;
import X.CH0;
import X.EnumC10460Hji;
import X.F0C;
import X.FGI;
import X.G0U;
import X.G0W;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.os.SystemClock;
import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.gateway.HatchVmRepository;
import com.facebook.aura.gateway.HatchlingVmType;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.gateway.store.VmEntryV2Json;
import com.facebook.aura.json.HatchProblemJson;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class ConfidentialVmDowngradeOperation implements ConfidentialVmDataTransferOperation {
    public static final String ERROR_RV_PROOF_REQUIRED = "rv_proof_required";
    public static final long EXPORT_REFRESH_INTERVAL_MS = 2700000;
    public static final long EXPORT_RETRY_INTERVAL_MS = 60000;
    public static final long GATEWAY_CONNECT_TIMEOUT_MS = 60000;
    public static final String TAG = "ConfidentialVmDowngradeOperation";
    public final C1BN<ConfidentialVmDataTransferOperation.Progress> progress;
    public final SingleFlight singleFlight;
    public final ConfidentialVmCheckpointStore<ConfidentialVmDowngradeCheckpoint> store;
    public final ConfidentialVmTransferFollower<ConfidentialVmDowngradeCheckpoint> transfer;
    public final AbstractC3358CGz userSession;
    public static final Companion Companion = new Companion();
    public static final Set<String> NOT_RETRYABLE_ERROR_CODES = BFI.A0H(new String[]{"INVALID_SVM_DOWNGRADE_REQUEST", "SVM_DOWNGRADE_SOURCE_NOT_OWNED", "SVM_DOWNGRADE_REQUIRES_CVM", "SVM_DOWNGRADE_DISABLED", "CVM_MIGRATION_SOURCE_NOT_ELIGIBLE", "CVM_MIGRATION_SOURCE_HAS_FERRY", "ENV_NOT_FOUND", "CVM_MIGRATION_REQUIRES_SVM"});

    public interface Step {

        public final class Started extends C06G implements Step {
            public final ConfidentialVmDowngradeCheckpoint checkpoint;

            public Started(ConfidentialVmDowngradeCheckpoint confidentialVmDowngradeCheckpoint) {
                C7384Etj.A0Y(confidentialVmDowngradeCheckpoint, 0);
                this.checkpoint = confidentialVmDowngradeCheckpoint;
            }

            public final Started copy(ConfidentialVmDowngradeCheckpoint confidentialVmDowngradeCheckpoint) {
                C7384Etj.A0Y(confidentialVmDowngradeCheckpoint, 0);
                return new Started(confidentialVmDowngradeCheckpoint);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Started) && C7384Etj.areEqual(this.checkpoint, ((Started) obj).checkpoint));
            }

            public static /* synthetic */ Started copy$default(Started started, ConfidentialVmDowngradeCheckpoint confidentialVmDowngradeCheckpoint, int i, Object obj) {
                if ((i & 1) != 0) {
                    confidentialVmDowngradeCheckpoint = started.checkpoint;
                }
                C7384Etj.A0Y(confidentialVmDowngradeCheckpoint, 0);
                return new Started(confidentialVmDowngradeCheckpoint);
            }

            public final ConfidentialVmDowngradeCheckpoint component1() {
                return this.checkpoint;
            }

            public final ConfidentialVmDowngradeCheckpoint getCheckpoint() {
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
            public final ConfidentialVmDataTransferOperation.Outcome.Failed failure;

            public Stopped(ConfidentialVmDataTransferOperation.Outcome.Failed failed) {
                C7384Etj.A0Y(failed, 0);
                this.failure = failed;
            }

            public final Stopped copy(ConfidentialVmDataTransferOperation.Outcome.Failed failed) {
                C7384Etj.A0Y(failed, 0);
                return new Stopped(failed);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Stopped) && C7384Etj.areEqual(this.failure, ((Stopped) obj).failure));
            }

            public static /* synthetic */ Stopped copy$default(Stopped stopped, ConfidentialVmDataTransferOperation.Outcome.Failed failed, int i, Object obj) {
                if ((i & 1) != 0) {
                    failed = stopped.failure;
                }
                C7384Etj.A0Y(failed, 0);
                return new Stopped(failed);
            }

            public final ConfidentialVmDataTransferOperation.Outcome.Failed component1() {
                return this.failure;
            }

            public final ConfidentialVmDataTransferOperation.Outcome.Failed getFailure() {
                return this.failure;
            }

            public int hashCode() {
                return this.failure.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation", f = "ConfidentialVmDowngradeOperation.kt", l = {140}, m = "clearSavedProgress", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$clearSavedProgress$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmDowngradeOperation.this.clearSavedProgress(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$commit$2", f = "ConfidentialVmDowngradeOperation.kt", l = {58}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$commit$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
        public Object L$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return ConfidentialVmDowngradeOperation.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Boolean> htJ) {
            return ConfidentialVmDowngradeOperation.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String strA0a;
            Object objM966fetchLiveVmsIoAF18A;
            Object next;
            String str;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            boolean z = true;
            if (i == 0) {
                Hwg.A00(obj);
                ConfidentialVmDowngradeCheckpoint confidentialVmDowngradeCheckpoint = ConfidentialVmDowngradeOperation.this.store.read();
                if ((confidentialVmDowngradeCheckpoint != null ? confidentialVmDowngradeCheckpoint.phase : null) != ConfidentialVmDowngradeCheckpoint.Phase.STARTED) {
                    ConfidentialVmDowngradeOperation.this.transfer.resetProgress();
                    strA0a = C3cH.A0a(HatchGatewayPrefsStore.Companion, ConfidentialVmDowngradeOperation.this.userSession);
                    if (strA0a != null) {
                        HatchVmRepository hatchVmRepository = HatchVmRepository.INSTANCE;
                        this.L$0 = strA0a;
                        this.label = 1;
                        objM966fetchLiveVmsIoAF18A = hatchVmRepository.m966fetchLiveVmsIoAF18A(this);
                        if (objM966fetchLiveVmsIoAF18A == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            strA0a = (String) this.L$0;
            objM966fetchLiveVmsIoAF18A = AnonymousClass001.A0q(obj);
            Throwable thA00 = HsJ.A00(objM966fetchLiveVmsIoAF18A);
            if (thA00 == null) {
                Iterator it = ((List) objM966fetchLiveVmsIoAF18A).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (ConfidentialVmTransferFollowerKt.hasEnvId((VmEntryV2Json) next, strA0a)) {
                        break;
                    }
                }
                VmEntryV2Json vmEntryV2Json = (VmEntryV2Json) next;
                if (HatchlingVmType.Companion.fromResponseWire(vmEntryV2Json != null ? vmEntryV2Json.vm_type : null) == HatchlingVmType.HATCH_CVM) {
                    str = ConfidentialVmDowngradeOperation.this.store.write(new ConfidentialVmDowngradeCheckpoint(strA0a, ConfidentialVmDowngradeCheckpoint.Phase.COMMITTED, null)) ? "The connected VM is not a live CVM; not downgrading" : "Could not record the downgrade checkpoint";
                    return Boolean.valueOf(z);
                }
                CFK.A06(ConfidentialVmDowngradeOperation.TAG, str);
            } else {
                CFK.A0A(ConfidentialVmDowngradeOperation.TAG, "Could not read the VM list; not downgrading", thA00);
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation", f = "ConfidentialVmDowngradeOperation.kt", l = {238}, m = "connectTo", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$connectTo$1, reason: invalid class name and case insensitive filesystem */
    public final class C112931 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C112931(HtJ<? super C112931> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmDowngradeOperation.this.connectTo(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation", f = "ConfidentialVmDowngradeOperation.kt", l = {295}, m = "exclusive", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$exclusive$1, reason: invalid class name and case insensitive filesystem */
    public final class C112941<T> extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C112941(HtJ<? super C112941> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmDowngradeOperation.this.exclusive(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$followTransfer$2", f = "ConfidentialVmDowngradeOperation.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$followTransfer$2, reason: invalid class name and case insensitive filesystem */
    public final class C112952 extends AbstractC07127nr implements G0W<ConfidentialVmDowngradeCheckpoint, CvmMigrationStatusJson, HtJ<? super ConfidentialVmDataTransferOperation.Outcome>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public C112952(HtJ<? super C112952> htJ) {
            super(3, htJ);
        }

        @Override // X.G0W
        public final Object invoke(ConfidentialVmDowngradeCheckpoint confidentialVmDowngradeCheckpoint, CvmMigrationStatusJson cvmMigrationStatusJson, HtJ<? super ConfidentialVmDataTransferOperation.Outcome> htJ) {
            C112952 c112952 = ConfidentialVmDowngradeOperation.this.new C112952(htJ);
            c112952.L$0 = confidentialVmDowngradeCheckpoint;
            c112952.L$1 = cvmMigrationStatusJson;
            return c112952.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ConfidentialVmDowngradeCheckpoint confidentialVmDowngradeCheckpoint = (ConfidentialVmDowngradeCheckpoint) this.L$0;
            CvmMigrationStatusJson cvmMigrationStatusJson = (CvmMigrationStatusJson) this.L$1;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (!cvmMigrationStatusJson.getCanRestart()) {
                return null;
            }
            ConfidentialVmCheckpointStore<ConfidentialVmDowngradeCheckpoint> confidentialVmCheckpointStore = ConfidentialVmDowngradeOperation.this.store;
            F0C<C9hr<Object>>[] f0cArr = ConfidentialVmDowngradeCheckpoint.$childSerializers;
            confidentialVmCheckpointStore.write(new ConfidentialVmDowngradeCheckpoint(confidentialVmDowngradeCheckpoint.getSourceEnvId(), ConfidentialVmDowngradeCheckpoint.Phase.COMMITTED, null));
            return ConfidentialVmDowngradeOperation.failed$default(ConfidentialVmDowngradeOperation.this, ConfidentialVmDataTransferOperation.FailureReason.TRANSFER_INTERRUPTED, null, 2, null);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$followTransfer$3", f = "ConfidentialVmDowngradeOperation.kt", l = {166}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$followTransfer$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0W<ConfidentialVmDowngradeCheckpoint, CvmMigrationStatusJson, HtJ<? super ConfidentialVmDataTransferOperation.Outcome>, Object> {
        public final /* synthetic */ BO7 $nextExportEnableAtMs;
        public long J$0;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ ConfidentialVmDowngradeOperation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BO7 bo7, ConfidentialVmDowngradeOperation confidentialVmDowngradeOperation, HtJ<? super AnonymousClass3> htJ) {
            super(3, htJ);
            this.$nextExportEnableAtMs = bo7;
            this.this$0 = confidentialVmDowngradeOperation;
        }

        @Override // X.G0W
        public final Object invoke(ConfidentialVmDowngradeCheckpoint confidentialVmDowngradeCheckpoint, CvmMigrationStatusJson cvmMigrationStatusJson, HtJ<? super ConfidentialVmDataTransferOperation.Outcome> htJ) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$nextExportEnableAtMs, this.this$0, htJ);
            anonymousClass3.L$0 = cvmMigrationStatusJson;
            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            long jElapsedRealtime;
            Object objM483enableExportIoAF18A;
            long j;
            long j2;
            CvmMigrationStatusJson cvmMigrationStatusJson = (CvmMigrationStatusJson) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                jElapsedRealtime = SystemClock.elapsedRealtime();
                if (cvmMigrationStatusJson.getNeedsExportEnabled() && jElapsedRealtime >= this.$nextExportEnableAtMs.element) {
                    ConfidentialVmDowngradeOperation confidentialVmDowngradeOperation = this.this$0;
                    this.L$0 = null;
                    this.J$0 = jElapsedRealtime;
                    this.label = 1;
                    objM483enableExportIoAF18A = confidentialVmDowngradeOperation.m483enableExportIoAF18A(this);
                    if (objM483enableExportIoAF18A == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                return null;
            }
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            jElapsedRealtime = this.J$0;
            objM483enableExportIoAF18A = AnonymousClass001.A0q(obj);
            BO7 bo7 = this.$nextExportEnableAtMs;
            if (!(objM483enableExportIoAF18A instanceof C10571Hud)) {
                j = ConfidentialVmDowngradeOperation.EXPORT_REFRESH_INTERVAL_MS;
            } else {
                if (ConfidentialVmDowngradeOperation.ERROR_RV_PROOF_REQUIRED.equals(ConfidentialVmTransferFollowerKt.errorCode(objM483enableExportIoAF18A))) {
                    j2 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                    bo7.element = j2;
                    return null;
                }
                j = 60000;
            }
            j2 = jElapsedRealtime + j;
            bo7.element = j2;
            return null;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation", f = "ConfidentialVmDowngradeOperation.kt", l = {115}, m = "resumeIfStarted", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$resumeIfStarted$1, reason: invalid class name and case insensitive filesystem */
    public final class C112961 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C112961(HtJ<? super C112961> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmDowngradeOperation.this.resumeIfStarted(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation", f = "ConfidentialVmDowngradeOperation.kt", l = {100, FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE, MinidumpReader.MODULE_FULL_SIZE}, m = "resumeOnLaunch", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$resumeOnLaunch$1, reason: invalid class name and case insensitive filesystem */
    public final class C112971 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C112971(HtJ<? super C112971> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmDowngradeOperation.this.resumeOnLaunch(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation", f = "ConfidentialVmDowngradeOperation.kt", l = {249, 256}, m = "returnToSource", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$returnToSource$1, reason: invalid class name and case insensitive filesystem */
    public final class C112981 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C112981(HtJ<? super C112981> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmDowngradeOperation.this.returnToSource(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$run$2", f = "ConfidentialVmDowngradeOperation.kt", l = {80}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$run$2, reason: invalid class name and case insensitive filesystem */
    public final class C112992 extends AbstractC07127nr implements G0U<HtJ<? super ConfidentialVmDataTransferOperation.Outcome>, Object> {
        public Object L$0;
        public int label;

        public C112992(HtJ<? super C112992> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return ConfidentialVmDowngradeOperation.this.new C112992(htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super ConfidentialVmDataTransferOperation.Outcome> htJ) {
            return ConfidentialVmDowngradeOperation.this.new C112992(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ConfidentialVmTransferFollower<ConfidentialVmDowngradeCheckpoint> confidentialVmTransferFollower;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConfidentialVmDowngradeOperation.this.transfer.resetProgress();
                ConfidentialVmDowngradeOperation confidentialVmDowngradeOperation = ConfidentialVmDowngradeOperation.this;
                confidentialVmTransferFollower = confidentialVmDowngradeOperation.transfer;
                this.L$0 = confidentialVmTransferFollower;
                this.label = 1;
                obj = confidentialVmDowngradeOperation.runDowngrade(this);
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

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation", f = "ConfidentialVmDowngradeOperation.kt", l = {86, 88, 89}, m = "runDowngrade", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$runDowngrade$1, reason: invalid class name and case insensitive filesystem */
    public final class C113001 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C113001(HtJ<? super C113001> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmDowngradeOperation.this.runDowngrade(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation", f = "ConfidentialVmDowngradeOperation.kt", l = {221, 224, 225}, m = "signInToDestination", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$signInToDestination$1, reason: invalid class name and case insensitive filesystem */
    public final class C113011 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C113011(HtJ<? super C113011> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmDowngradeOperation.this.signInToDestination(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation", f = "ConfidentialVmDowngradeOperation.kt", l = {342, 201, HatchWidgetWebViewKt.HTTP_NO_CONTENT, 365}, m = "startDowngrade", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$startDowngrade$1, reason: invalid class name and case insensitive filesystem */
    public final class C113021 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public /* synthetic */ Object result;

        public C113021(HtJ<? super C113021> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmDowngradeOperation.this.startDowngrade(null, this);
        }
    }

    @Override // com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation
    public void clearFailedProgress(ConfidentialVmDataTransferOperation.Progress progress) {
        C7384Etj.A0Y(progress, 0);
        this.transfer.clearFailedProgress(progress);
    }

    public final Object commit(HtJ<? super Boolean> htJ) {
        return exclusive(new AnonymousClass2(null), htJ);
    }

    @Override // com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation
    public Object run(HtJ<? super ConfidentialVmDataTransferOperation.Outcome> htJ) {
        return exclusive(new C112992(null), htJ);
    }

    public final class Companion {
        public final ConfidentialVmDowngradeOperation getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ConfidentialVmDowngradeOperation) abstractC3358CGz.A03(ConfidentialVmDowngradeOperation.class, new ConfidentialVmDowngradeOperation$Companion$getInstance$1(abstractC3358CGz));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean hasStartableDestination(CvmMigrationStatusJson cvmMigrationStatusJson) {
            return cvmMigrationStatusJson.isPrepared() && !cvmMigrationStatusJson.isExpired(C3cI.A02());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isUnfinishedStart(CvmMigrationStatusJson cvmMigrationStatusJson) {
            return (cvmMigrationStatusJson.isClaiming() || cvmMigrationStatusJson.isPrepared()) && !cvmMigrationStatusJson.isExpired(C3cI.A02());
        }

        private final long nowSeconds() {
            return C3cI.A02();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object connectTo(com.facebook.aura.gateway.store.VmEntryV2Json r7, X.HtJ<? super com.facebook.aura.gateway.HatchGatewayStateSnapshot> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.C112931
            if (r0 == 0) goto L51
            r5 = r8
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$connectTo$1 r5 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.C112931) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r3 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r0 = 1
            if (r1 == 0) goto L3c
            if (r1 != r0) goto L58
            java.lang.Object r7 = r5.L$0
            com.facebook.aura.gateway.store.VmEntryV2Json r7 = (com.facebook.aura.gateway.store.VmEntryV2Json) r7
            X.Hwg.A00(r3)
        L24:
            r2 = 0
            if (r3 == 0) goto L57
            com.facebook.aura.gateway.service.HatchGatewayServiceManager r1 = com.facebook.aura.gateway.service.HatchGatewayServiceManager.INSTANCE
            X.CGz r0 = r6.userSession
            com.facebook.aura.gateway.HatchGatewayConnection r1 = r1.getGateway(r0)
            java.lang.String r0 = r7.vm_ws_url
            java.lang.String r0 = com.facebook.aura.gateway.HatcheryVMIdUtilsKt.extractHatcheryVMId(r0)
            boolean r0 = r1.hasConnectedTo(r0)
            if (r0 == 0) goto L57
            return r3
        L3c:
            X.Hwg.A00(r3)
            X.CGz r3 = r6.userSession
            java.lang.String r2 = r7.vm_ws_url
            r5.L$0 = r7
            r5.label = r0
            r0 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r3 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmGatewayConnectKt.connectGatewayTo(r3, r2, r0, r5)
            if (r3 != r4) goto L24
            return r4
        L51:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$connectTo$1 r5 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$connectTo$1
            r5.<init>(r8)
            goto L12
        L57:
            return r2
        L58:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.connectTo(com.facebook.aura.gateway.store.VmEntryV2Json, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* renamed from: enableExport-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m483enableExportIoAF18A(X.HtJ<? super X.HsJ<kotlin.Unit>> r19) {
        /*
            r18 = this;
            r4 = r19
            boolean r0 = r4 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$enableExport$1
            r5 = r18
            if (r0 == 0) goto L6b
            r2 = r4
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$enableExport$1 r2 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$enableExport$1) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L6b
            int r3 = r3 - r1
            r2.label = r3
        L16:
            java.lang.Object r3 = r2.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r2.label
            r6 = 1
            if (r0 == 0) goto L26
            if (r0 != r6) goto L71
            java.lang.Object r1 = X.AnonymousClass001.A0q(r3)
        L25:
            return r1
        L26:
            X.Hwg.A00(r3)
            com.facebook.aura.network.http.HatchHttpApi r4 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.confidentialvm.repository.ConfidentialVmJarvisPath$CvmEnableExport r7 = com.facebook.aura.confidentialvm.repository.ConfidentialVmJarvisPath.CvmEnableExport.INSTANCE
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r9 = r5.userSession
            r14 = 0
            X.HxE[] r11 = new X.HxE[r14]
            r0 = 204(0xcc, float:2.86E-43)
            java.lang.Integer r0 = X.C3cG.A0R(r0)
            java.util.Set r13 = java.util.Collections.singleton(r0)
            X.9jH r15 = X.AGH.A0E()
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$enableExport-IoAF18A$$inlined$executeJarvisRequest-1iavgos$default$1 r5 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$enableExportIoAF18A$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r10 = 0
            r2.L$0 = r10
            r2.L$1 = r10
            r2.L$2 = r10
            r2.L$3 = r10
            r2.L$4 = r10
            r2.L$5 = r10
            r2.L$6 = r10
            r2.I$0 = r14
            r2.I$1 = r6
            r2.I$2 = r14
            r2.label = r6
            r12 = r10
            r16 = r6
            r17 = r10
            r18 = r14
            r19 = r2
            java.lang.Object r0 = r4.m1595executeBodylessJarvisRequestWithp3iPjrY(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r0 == r1) goto L25
            return r0
        L6b:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$enableExport$1 r2 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$enableExport$1
            r2.<init>(r5, r4)
            goto L16
        L71:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.m483enableExportIoAF18A(X.HtJ):java.lang.Object");
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
            boolean r0 = r8 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.C112941
            if (r0 == 0) goto L44
            r5 = r8
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$exclusive$1 r5 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.C112941) r5
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
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.aura.common.coroutines.SingleFlightResult.Result<T of com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.exclusive>"
            X.C7384Etj.A0Z(r1, r0)
            com.facebook.aura.common.coroutines.SingleFlightResult$Result r1 = (com.facebook.aura.common.coroutines.SingleFlightResult.Result) r1
            T r0 = r1.value
            return r0
        L2c:
            X.Hwg.A00(r1)
            com.facebook.aura.common.coroutines.SingleFlight r2 = r6.singleFlight
            r0 = 0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$exclusive$result$1 r1 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$exclusive$result$1
            r1.<init>(r7, r0)
            r5.L$0 = r0
            r5.label = r3
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r2.invoke(r0, r1, r5)
            if (r1 != r4) goto L20
            return r4
        L44:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$exclusive$1 r5 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$exclusive$1
            r5.<init>(r8)
            goto L12
        L4a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.exclusive(X.G0U, X.HtJ):java.lang.Object");
    }

    private final boolean followIfStarted(ConfidentialVmDowngradeCheckpoint confidentialVmDowngradeCheckpoint, CvmMigrationStatusJson cvmMigrationStatusJson) {
        if (cvmMigrationStatusJson == null || !cvmMigrationStatusJson.isStarted()) {
            return false;
        }
        String str = cvmMigrationStatusJson.new_env_id;
        if (str == null) {
            str = cvmMigrationStatusJson.new_cvm_env_id;
        }
        markStarted(confidentialVmDowngradeCheckpoint, str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object followTransfer(ConfidentialVmDowngradeCheckpoint confidentialVmDowngradeCheckpoint, HtJ<? super ConfidentialVmDataTransferOperation.Outcome> htJ) {
        return this.transfer.follow(confidentialVmDowngradeCheckpoint, new C112952(null), new AnonymousClass3(new BO7(), this, null), htJ);
    }

    private final ConfidentialVmDowngradeCheckpoint markStarted(ConfidentialVmDowngradeCheckpoint confidentialVmDowngradeCheckpoint, String str) {
        ConfidentialVmDowngradeCheckpoint.Phase phase = ConfidentialVmDowngradeCheckpoint.Phase.STARTED;
        if (str == null) {
            str = confidentialVmDowngradeCheckpoint.getDestinationEnvId();
        }
        F0C<C9hr<Object>>[] f0cArr = ConfidentialVmDowngradeCheckpoint.$childSerializers;
        ConfidentialVmDowngradeCheckpoint confidentialVmDowngradeCheckpointCopy = confidentialVmDowngradeCheckpoint.copy(confidentialVmDowngradeCheckpoint.sourceEnvId, phase, str);
        if (!this.store.write(confidentialVmDowngradeCheckpointCopy)) {
            CFK.A06(TAG, "Could not record the downgrade start");
        }
        return confidentialVmDowngradeCheckpointCopy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* renamed from: readStatus-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m484readStatusgIAlus(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint r6, X.HtJ<? super X.HsJ<com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$readStatus$1
            if (r0 == 0) goto L44
            r4 = r7
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$readStatus$1 r4 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$readStatus$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L31
            if (r0 != r2) goto L4a
            java.lang.Object r2 = X.AnonymousClass001.A0q(r1)
        L21:
            java.lang.Integer r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt.httpCode(r2)
            if (r0 == 0) goto L30
            int r1 = r0.intValue()
            r0 = 404(0x194, float:5.66E-43)
            if (r1 != r0) goto L30
            r2 = 0
        L30:
            return r2
        L31:
            X.Hwg.A00(r1)
            java.lang.String r1 = r6.getSourceEnvId()
            r0 = 0
            r4.L$0 = r0
            r4.label = r2
            java.lang.Object r2 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt.readCvmMigrationStatus(r1, r4)
            if (r2 != r3) goto L21
            return r3
        L44:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$readStatus$1 r4 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$readStatus$1
            r4.<init>(r5, r7)
            goto L12
        L4a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.m484readStatusgIAlus(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object returnToSource(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint r12, X.HtJ<? super java.lang.Boolean> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.C112981
            if (r0 == 0) goto Lad
            r5 = r13
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$returnToSource$1 r5 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.C112981) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lad
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r6 = 2
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 == r2) goto L57
            if (r0 != r6) goto Lb4
            X.Hwg.A00(r1)
        L24:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        L29:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore$Companion r1 = com.facebook.aura.gateway.store.HatchGatewayPrefsStore.Companion
            X.CGz r0 = r11.userSession
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore r10 = r1.getInstance(r0)
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint$Phase r1 = r12.phase
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint$Phase r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint.Phase.STARTED
            if (r1 == r0) goto Lc9
            java.lang.String r1 = X.C3cG.A0a(r10)
            java.lang.String r0 = r12.getSourceEnvId()
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto Lc9
            com.facebook.aura.gateway.HatchVmRepository r0 = com.facebook.aura.gateway.HatchVmRepository.INSTANCE
            r5.L$0 = r12
            r5.L$1 = r10
            r5.label = r2
            java.lang.Object r1 = r0.m966fetchLiveVmsIoAF18A(r5)
            if (r1 != r4) goto L63
            return r4
        L57:
            java.lang.Object r10 = r5.L$1
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore r10 = (com.facebook.aura.gateway.store.HatchGatewayPrefsStore) r10
            java.lang.Object r12 = r5.L$0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint r12 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint) r12
            java.lang.Object r1 = X.AnonymousClass001.A0q(r1)
        L63:
            boolean r0 = r1 instanceof X.C10571Hud
            r9 = 0
            if (r0 == 0) goto L69
            r1 = r9
        L69:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto Lb9
            java.util.Iterator r8 = r1.iterator()
        L71:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r7 = r8.next()
            r1 = r7
            com.facebook.aura.gateway.store.VmEntryV2Json r1 = (com.facebook.aura.gateway.store.VmEntryV2Json) r1
            java.lang.String r0 = r12.getSourceEnvId()
            boolean r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt.hasEnvId(r1, r0)
            if (r0 == 0) goto L71
            r9 = r7
        L89:
            com.facebook.aura.gateway.store.VmEntryV2Json r9 = (com.facebook.aura.gateway.store.VmEntryV2Json) r9
            if (r9 == 0) goto Lb9
            java.lang.String r0 = r9.vm_ws_url
            boolean r0 = r10.commitGatewayUrl(r0)
            if (r0 == 0) goto Lba
            com.facebook.aura.gateway.service.HatchGatewayServiceManager r1 = com.facebook.aura.gateway.service.HatchGatewayServiceManager.INSTANCE
            X.CGz r0 = r11.userSession
            com.facebook.aura.gateway.HatchGatewayConnection r1 = r1.getGateway(r0)
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.label = r6
            java.lang.Object r0 = r1.fetchAndConnect(r2, r3, r0, r5)
            if (r0 != r4) goto L24
            return r4
        Lad:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$returnToSource$1 r5 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$returnToSource$1
            r5.<init>(r13)
            goto L12
        Lb4:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Lb9:
            r2 = 0
        Lba:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "ConfidentialVmDowngradeOperation"
            java.lang.String r0 = "Could not point the gateway back at the CVM: listed=%s"
            X.CFK.A0H(r1, r0, r2)
        Lc9:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.returnToSource(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[PHI: r1
  0x007a: PHI (r1v6 java.lang.Object) = (r1v7 java.lang.Object), (r1v0 java.lang.Object) binds: [B:22:0x0052, B:31:0x0077] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runDowngrade(X.HtJ<? super com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.Outcome> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.C113001
            if (r0 == 0) goto L28
            r7 = r10
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$runDowngrade$1 r7 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.C113001) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r6 = 3
            r5 = 1
            r4 = 2
            if (r0 == 0) goto L2e
            if (r0 == r5) goto L77
            if (r0 == r4) goto L5e
            if (r0 == r6) goto L77
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L28:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$runDowngrade$1 r7 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$runDowngrade$1
            r7.<init>(r10)
            goto L12
        L2e:
            X.Hwg.A00(r1)
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmCheckpointStore<com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint> r0 = r9.store
            java.lang.Object r3 = r0.read()
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint r3 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint) r3
            if (r3 != 0) goto L43
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$FailureReason r1 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.FailureReason.NO_MIGRATION
            r0 = 0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$Outcome$Failed r1 = r9.failed(r1, r0)
            return r1
        L43:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint$Phase r2 = r3.phase
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint$Phase r1 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint.Phase.STARTED
            r0 = 0
            r7.L$0 = r0
            if (r2 != r1) goto L55
            r7.label = r5
            java.lang.Object r1 = r9.followTransfer(r3, r7)
        L52:
            if (r1 != r8) goto L7a
            return r8
        L55:
            r7.label = r4
            java.lang.Object r1 = r9.startDowngrade(r3, r7)
            if (r1 != r8) goto L61
            return r8
        L5e:
            X.Hwg.A00(r1)
        L61:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$Step r1 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.Step) r1
            boolean r0 = r1 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.Step.Started
            if (r0 == 0) goto L7b
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$Step$Started r1 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.Step.Started) r1
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint r1 = r1.checkpoint
            r0 = 0
            r7.L$0 = r0
            r7.L$1 = r0
            r7.label = r6
            java.lang.Object r1 = r9.followTransfer(r1, r7)
            goto L52
        L77:
            X.Hwg.A00(r1)
        L7a:
            return r1
        L7b:
            boolean r0 = r1 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.Step.Stopped
            if (r0 == 0) goto L84
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$Step$Stopped r1 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.Step.Stopped) r1
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$Outcome$Failed r1 = r1.failure
            return r1
        L84:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.runDowngrade(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f5  */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object signInToDestination(java.lang.String r12, java.lang.String r13, X.HtJ<? super java.lang.Boolean> r14) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.signInToDestination(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0130 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startDowngrade(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint r23, X.HtJ<? super com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.Step> r24) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.startDowngrade(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    @Override // com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object clearSavedProgress(X.HtJ<? super com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.AfterClear> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.AnonymousClass1
            if (r0 == 0) goto L4b
            r5 = r7
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$clearSavedProgress$1 r5 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4b
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L54
            X.Hwg.A00(r1)
        L21:
            boolean r0 = X.AnonymousClass001.A1X(r1)
            if (r0 != r2) goto L28
            r3 = 1
        L28:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmCheckpointStore<com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint> r0 = r6.store
            r0.clear()
            if (r3 == 0) goto L51
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$AfterClear r4 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.AfterClear.RESTART
            return r4
        L32:
            X.Hwg.A00(r1)
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmCheckpointStore<com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint> r0 = r6.store
            java.lang.Object r1 = r0.read()
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint r1 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint) r1
            if (r1 == 0) goto L28
            r0 = 0
            r5.L$0 = r0
            r5.label = r2
            java.lang.Object r1 = r6.returnToSource(r1, r5)
            if (r1 != r4) goto L21
            return r4
        L4b:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$clearSavedProgress$1 r5 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$clearSavedProgress$1
            r5.<init>(r7)
            goto L12
        L51:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$AfterClear r4 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.AfterClear.STAY
            return r4
        L54:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.clearSavedProgress(X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.singleFlight.clearAndCancelAll();
    }

    @Override // com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation
    public C1BN<ConfidentialVmDataTransferOperation.Progress> getProgress() {
        return this.progress;
    }

    @Override // com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation
    public /* bridge */ C20Q<Unit> getRetryRequests() {
        return C2CS.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    @Override // com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object resumeIfStarted(X.HtJ<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.C112961
            if (r0 == 0) goto L63
            r5 = r7
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$resumeIfStarted$1 r5 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.C112961) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r2 = r5.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L4b
            if (r0 != r3) goto L69
            java.lang.Object r0 = r5.L$0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint r0 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint) r0
            java.lang.Object r2 = X.AnonymousClass001.A0q(r2)
        L26:
            java.lang.Throwable r1 = X.HsJ.A00(r2)
            if (r1 != 0) goto L44
            com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson r2 = (com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson) r2
            boolean r0 = r6.followIfStarted(r0, r2)
            if (r0 != 0) goto L3e
            if (r2 == 0) goto L3f
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$Companion r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.Companion
            boolean r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.Companion.access$hasStartableDestination(r0, r2)
            if (r0 != r3) goto L3f
        L3e:
            r4 = 1
        L3f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L44:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint$Phase r1 = r0.phase
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint$Phase r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint.Phase.STARTED
            if (r1 != r0) goto L3f
            goto L3e
        L4b:
            X.Hwg.A00(r2)
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmCheckpointStore<com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint> r0 = r6.store
            java.lang.Object r0 = r0.read()
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint r0 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint) r0
            if (r0 == 0) goto L3f
            r5.L$0 = r0
            r5.label = r3
            java.lang.Object r2 = r6.m484readStatusgIAlus(r0, r5)
            if (r2 != r1) goto L26
            return r1
        L63:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$resumeIfStarted$1 r5 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$resumeIfStarted$1
            r5.<init>(r7)
            goto L12
        L69:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.resumeIfStarted(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resumeOnLaunch(X.HtJ<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.C112971
            if (r0 == 0) goto L28
            r4 = r9
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$resumeOnLaunch$1 r4 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.C112971) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r6 = 3
            r7 = 2
            r5 = 1
            if (r0 == 0) goto L2e
            if (r0 == r5) goto L4c
            if (r0 == r7) goto L88
            if (r0 == r6) goto L88
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L28:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$resumeOnLaunch$1 r4 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$resumeOnLaunch$1
            r4.<init>(r9)
            goto L12
        L2e:
            X.Hwg.A00(r1)
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmCheckpointStore<com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint> r0 = r8.store
            java.lang.Object r2 = r0.read()
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint r2 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint) r2
            if (r2 == 0) goto L8b
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint$Phase r1 = r2.phase
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint$Phase r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint.Phase.STARTED
            if (r1 == r0) goto L8c
            r4.L$0 = r2
            r4.label = r5
            java.lang.Object r1 = r8.m484readStatusgIAlus(r2, r4)
            if (r1 != r3) goto L54
            return r3
        L4c:
            java.lang.Object r2 = r4.L$0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint r2 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint) r2
            java.lang.Object r1 = X.AnonymousClass001.A0q(r1)
        L54:
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            if (r0 != 0) goto L7a
            com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson r1 = (com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson) r1
            boolean r0 = r8.followIfStarted(r2, r1)
            if (r0 != 0) goto L8c
            if (r1 == 0) goto L6d
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation$Companion r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.Companion
            boolean r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.Companion.access$isUnfinishedStart(r0, r1)
            if (r0 != r5) goto L6d
            goto L8c
        L6d:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmCheckpointStore<com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeCheckpoint> r0 = r8.store
            r0.clear()
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.label = r6
            goto L81
        L7a:
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.label = r7
        L81:
            java.lang.Object r0 = r8.returnToSource(r2, r4)
            if (r0 != r3) goto L8b
            return r3
        L88:
            X.Hwg.A00(r1)
        L8b:
            r5 = 0
        L8c:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation.resumeOnLaunch(X.HtJ):java.lang.Object");
    }

    public ConfidentialVmDowngradeOperation(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        ConfidentialVmCheckpointStore<ConfidentialVmDowngradeCheckpoint> confidentialVmCheckpointStoreStore = ConfidentialVmDowngradeCheckpoint.Companion.store(((CH0) abstractC3358CGz).A01);
        this.store = confidentialVmCheckpointStoreStore;
        ConfidentialVmTransferFollower<ConfidentialVmDowngradeCheckpoint> confidentialVmTransferFollower = new ConfidentialVmTransferFollower<>(abstractC3358CGz, confidentialVmCheckpointStoreStore, HatchlingVmType.HATCH_VM);
        this.transfer = confidentialVmTransferFollower;
        this.singleFlight = C3cH.A0M();
        this.progress = confidentialVmTransferFollower.progress;
    }

    private final ConfidentialVmDataTransferOperation.Outcome.Failed failed(ConfidentialVmDataTransferOperation.FailureReason failureReason, String str) {
        CFK.A0H(TAG, "CVM downgrade stopped: %s", failureReason);
        return new ConfidentialVmDataTransferOperation.Outcome.Failed(failureReason, str, null);
    }

    public static /* synthetic */ ConfidentialVmDataTransferOperation.Outcome.Failed failed$default(ConfidentialVmDowngradeOperation confidentialVmDowngradeOperation, ConfidentialVmDataTransferOperation.FailureReason failureReason, String str, int i, Object obj) {
        return confidentialVmDowngradeOperation.failed(failureReason, AnonymousClass006.A0s(i, str));
    }

    private final Step.Stopped stopped(Object obj) {
        ConfidentialVmDataTransferOperation.FailureReason failureReasonFailureFor;
        HatchProblemJson hatchProblemJsonProblem = ConfidentialVmTransferFollowerKt.problem(obj);
        String strA0j = null;
        if (AbstractC0878AGe.A0k(NOT_RETRYABLE_ERROR_CODES, hatchProblemJsonProblem != null ? hatchProblemJsonProblem.error_code : null)) {
            this.store.clear();
            failureReasonFailureFor = ConfidentialVmDataTransferOperation.FailureReason.MIGRATION_REFUSED;
            if (hatchProblemJsonProblem != null) {
                strA0j = FGI.A0j(hatchProblemJsonProblem.title, ": ", hatchProblemJsonProblem.detail, " (", hatchProblemJsonProblem.error_code, ")");
            }
        } else {
            failureReasonFailureFor = ConfidentialVmTransferFollowerKt.failureFor(ConfidentialVmTransferFollowerKt.httpCode(obj));
        }
        return new Step.Stopped(failed(failureReasonFailureFor, strA0j));
    }

    @Override // com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation
    public /* bridge */ Object followStartedTransfer(HtJ<? super ConfidentialVmDataTransferOperation.Outcome> htJ) {
        return ConfidentialVmDataTransferOperation.CC.followStartedTransfer$suspendImpl(this, htJ);
    }

    public /* synthetic */ ConfidentialVmDowngradeOperation(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
