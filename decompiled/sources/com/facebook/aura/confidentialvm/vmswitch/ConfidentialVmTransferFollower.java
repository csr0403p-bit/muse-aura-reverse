package com.facebook.aura.confidentialvm.vmswitch;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFI;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3Pi;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import X.CFK;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferCheckpoint;
import com.facebook.aura.gateway.HatchlingVmType;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class ConfidentialVmTransferFollower<T extends ConfidentialVmTransferCheckpoint<T>> {

    @Deprecated
    public static final long DESTINATION_SETTLE_TIMEOUT_MS = 120000;

    @Deprecated
    public static final int MAX_CONSECUTIVE_READ_FAILURES = 12;

    @Deprecated
    public static final String MIGRATION_STATE_FAILED = "failed";

    @Deprecated
    public static final String MIGRATION_STATE_SUCCEEDED = "succeeded";

    @Deprecated
    public static final long POLL_INTERVAL_MS = 5000;
    public final BLG<ConfidentialVmDataTransferOperation.Progress> _progress;
    public final HatchlingVmType destinationVmType;
    public final C1BN<ConfidentialVmDataTransferOperation.Progress> progress;
    public final ConfidentialVmCheckpointStore<T> store;
    public final AbstractC3358CGz userSession;
    public static final Companion Companion = new Companion();
    public static final Set<Integer> NON_TRANSIENT_HTTP_CODES = BFI.A0H(new Integer[]{400, 403, 404, 409});

    public final class Companion {
        public final Set<Integer> getNON_TRANSIENT_HTTP_CODES() {
            return ConfidentialVmTransferFollower.NON_TRANSIENT_HTTP_CODES;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower", f = "ConfidentialVmTransferFollower.kt", l = {180, 189}, m = "awaitDestinationSettled", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$awaitDestinationSettled$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ ConfidentialVmTransferFollower<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConfidentialVmTransferFollower<T> confidentialVmTransferFollower, HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
            this.this$0 = confidentialVmTransferFollower;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.awaitDestinationSettled(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower", f = "ConfidentialVmTransferFollower.kt", l = {156, 157}, m = "complete", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$complete$1, reason: invalid class name and case insensitive filesystem */
    public final class C113261 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ ConfidentialVmTransferFollower<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113261(ConfidentialVmTransferFollower<T> confidentialVmTransferFollower, HtJ<? super C113261> htJ) {
            super(htJ);
            this.this$0 = confidentialVmTransferFollower;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.complete(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower", f = "ConfidentialVmTransferFollower.kt", l = {78}, m = "follow", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$follow$1, reason: invalid class name and case insensitive filesystem */
    public final class C113271 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ ConfidentialVmTransferFollower<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113271(ConfidentialVmTransferFollower<T> confidentialVmTransferFollower, HtJ<? super C113271> htJ) {
            super(htJ);
            this.this$0 = confidentialVmTransferFollower;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.follow(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$follow$2", f = "ConfidentialVmTransferFollower.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$follow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0W<T, CvmMigrationStatusJson, HtJ<? super ConfidentialVmDataTransferOperation.Outcome>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(3, htJ);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(Object obj, CvmMigrationStatusJson cvmMigrationStatusJson, HtJ<? super ConfidentialVmDataTransferOperation.Outcome> htJ) {
            return new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return null;
        }

        public final Object invoke(T t, CvmMigrationStatusJson cvmMigrationStatusJson, HtJ<? super ConfidentialVmDataTransferOperation.Outcome> htJ) {
            return new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$follow$3", f = "ConfidentialVmTransferFollower.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$follow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0W<T, CvmMigrationStatusJson, HtJ<? super ConfidentialVmDataTransferOperation.Outcome>, Object> {
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(3, htJ);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(Object obj, CvmMigrationStatusJson cvmMigrationStatusJson, HtJ<? super ConfidentialVmDataTransferOperation.Outcome> htJ) {
            return new AnonymousClass3(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return null;
        }

        public final Object invoke(T t, CvmMigrationStatusJson cvmMigrationStatusJson, HtJ<? super ConfidentialVmDataTransferOperation.Outcome> htJ) {
            return new AnonymousClass3(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower", f = "ConfidentialVmTransferFollower.kt", l = {93, 94, 102, 103, 131, 134, 136, 140}, m = "followUntilDone", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$followUntilDone$1, reason: invalid class name and case insensitive filesystem */
    public final class C113281 extends HzP {
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
        public final /* synthetic */ ConfidentialVmTransferFollower<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113281(ConfidentialVmTransferFollower<T> confidentialVmTransferFollower, HtJ<? super C113281> htJ) {
            super(htJ);
            this.this$0 = confidentialVmTransferFollower;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.followUntilDone(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$followUntilDone$2", f = "ConfidentialVmTransferFollower.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$followUntilDone$2, reason: invalid class name and case insensitive filesystem */
    public final class C113292 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
        public /* synthetic */ boolean Z$0;
        public int label;

        public C113292(HtJ<? super C113292> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C113292 c113292 = new C113292(htJ);
            c113292.Z$0 = AnonymousClass001.A1X(obj);
            return c113292;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            if (this.label == 0) {
                return AnonymousClass001.A0k(obj, z);
            }
            throw AnonymousClass001.A0n();
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A1X(bool), htJ);
        }

        public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
            return ((C113292) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower", f = "ConfidentialVmTransferFollower.kt", l = {201}, m = "pointGatewayAtDestination", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$pointGatewayAtDestination$1, reason: invalid class name and case insensitive filesystem */
    public final class C113301 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ ConfidentialVmTransferFollower<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113301(ConfidentialVmTransferFollower<T> confidentialVmTransferFollower, HtJ<? super C113301> htJ) {
            super(htJ);
            this.this$0 = confidentialVmTransferFollower;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.pointGatewayAtDestination(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower", f = "ConfidentialVmTransferFollower.kt", l = {146}, m = "recordedOutcome", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$recordedOutcome$1, reason: invalid class name and case insensitive filesystem */
    public final class C113311 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ ConfidentialVmTransferFollower<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113311(ConfidentialVmTransferFollower<T> confidentialVmTransferFollower, HtJ<? super C113311> htJ) {
            super(htJ);
            this.this$0 = confidentialVmTransferFollower;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.recordedOutcome(null, this);
        }
    }

    public ConfidentialVmTransferFollower(AbstractC3358CGz abstractC3358CGz, ConfidentialVmCheckpointStore<T> confidentialVmCheckpointStore, HatchlingVmType hatchlingVmType) {
        AnonymousClass005.A10(abstractC3358CGz, confidentialVmCheckpointStore, hatchlingVmType);
        this.userSession = abstractC3358CGz;
        this.store = confidentialVmCheckpointStore;
        this.destinationVmType = hatchlingVmType;
        C9286GCn c9286GCnA14 = C3cG.A14(new ConfidentialVmDataTransferOperation.Progress(ConfidentialVmDataTransferOperation.ProgressStep.PREPARING, false, false, 0));
        this._progress = c9286GCnA14;
        this.progress = C3Pi.A00(c9286GCnA14);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Path cross not found for [B:37:0x011a, B:57:0x017f], limit reached: 103 */
    /* JADX WARN: Path cross not found for [B:57:0x017f, B:37:0x011a], limit reached: 103 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0213 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0238  */
    /* JADX WARN: Type inference failed for: r1v14, types: [T, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01b3 -> B:66:0x01b4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object followUntilDone(T r12, X.G0W<? super T, ? super com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson, ? super X.HtJ<? super com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.Outcome>, ? extends java.lang.Object> r13, X.G0W<? super T, ? super com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson, ? super X.HtJ<? super com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.Outcome>, ? extends java.lang.Object> r14, X.HtJ<? super com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.Outcome> r15) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower.followUntilDone(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferCheckpoint, X.G0W, X.G0W, X.HtJ):java.lang.Object");
    }

    public final void clearFailedProgress(ConfidentialVmDataTransferOperation.Progress progress) {
        C7384Etj.A0Y(progress, 0);
        AnonymousClass001.A1E(this._progress, progress, new ConfidentialVmDataTransferOperation.Progress(ConfidentialVmDataTransferOperation.ProgressStep.PREPARING, false, false, progress.run));
    }

    public final ConfidentialVmDataTransferOperation.Outcome withFailedProgress(ConfidentialVmDataTransferOperation.Outcome outcome) {
        C7384Etj.A0Y(outcome, 0);
        if (!(outcome instanceof ConfidentialVmDataTransferOperation.Outcome.Failed)) {
            return outcome;
        }
        ConfidentialVmDataTransferOperation.Outcome.Failed failed = (ConfidentialVmDataTransferOperation.Outcome.Failed) outcome;
        return failed.copy(failed.reason, failed.serverError, this._progress.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Path cross not found for [B:20:0x0052, B:28:0x0061], limit reached: 41 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0073 -> B:12:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitDestinationSettled(T r13, X.HtJ<? super kotlin.Unit> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower.AnonymousClass1
            if (r0 == 0) goto L8e
            r8 = r14
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$awaitDestinationSettled$1 r8 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower.AnonymousClass1) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8e
            int r2 = r2 - r1
            r8.label = r2
        L12:
            java.lang.Object r1 = r8.result
            X.Hji r9 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r7 = 2
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L76
            if (r0 == r6) goto L46
            if (r0 != r7) goto L95
            long r2 = r8.J$0
            java.lang.Object r0 = r8.L$1
            java.lang.String r4 = X.C3cG.A0d(r0, r1)
        L29:
            long r10 = android.os.SystemClock.elapsedRealtime()
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 >= 0) goto L9a
            com.facebook.aura.gateway.HatchCvmReplaceStateRepository r1 = com.facebook.aura.gateway.HatchCvmReplaceStateRepository.INSTANCE
            X.CGz r0 = r12.userSession
            r8.L$0 = r5
            r8.L$1 = r4
            r8.L$2 = r5
            r8.J$0 = r2
            r8.label = r6
            java.lang.Object r1 = r1.read(r0, r4, r8)
            if (r1 != r9) goto L4e
            return r9
        L46:
            long r2 = r8.J$0
            java.lang.Object r0 = r8.L$1
            java.lang.String r4 = X.C3cG.A0d(r0, r1)
        L4e:
            boolean r0 = r1 instanceof com.facebook.aura.gateway.HatchCvmReplacement.Active
            if (r0 == 0) goto L61
            com.facebook.aura.gateway.HatchCvmReplacement$Active r1 = (com.facebook.aura.gateway.HatchCvmReplacement.Active) r1
            if (r1 == 0) goto L61
            com.facebook.aura.gateway.HatchVmState r1 = r1.state
        L58:
            com.facebook.aura.gateway.HatchVmState r0 = com.facebook.aura.gateway.HatchVmState.CVM_AWAITING_DST_VM_CHIP_SELECTION
            if (r1 == r0) goto L63
            com.facebook.aura.gateway.HatchVmState r0 = com.facebook.aura.gateway.HatchVmState.CVM_DST_VM_STARTING
            if (r1 == r0) goto L63
            goto La1
        L61:
            r1 = r5
            goto L58
        L63:
            r8.L$0 = r5
            r8.L$1 = r4
            r8.L$2 = r5
            r8.J$0 = r2
            r8.label = r7
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r0 = X.C7Bq.A01(r0, r8)
            if (r0 != r9) goto L29
            return r9
        L76:
            X.Hwg.A00(r1)
            java.lang.String r4 = r13.getDestinationEnvId()
            com.facebook.aura.gateway.HatchlingVmType r1 = r12.destinationVmType
            com.facebook.aura.gateway.HatchlingVmType r0 = com.facebook.aura.gateway.HatchlingVmType.HATCH_CVM
            if (r1 != r0) goto La1
            if (r4 == 0) goto La1
            long r2 = android.os.SystemClock.elapsedRealtime()
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            long r2 = r2 + r0
            goto L29
        L8e:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$awaitDestinationSettled$1 r8 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$awaitDestinationSettled$1
            r8.<init>(r12, r14)
            goto L12
        L95:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L9a:
            java.lang.String r1 = "ConfidentialVmTransferFollower"
            java.lang.String r0 = "The destination is still being replaced; handing off to it anyway"
            X.CFK.A06(r1, r0)
        La1:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower.awaitDestinationSettled(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferCheckpoint, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object complete(T r12, java.lang.String r13, X.HtJ<? super com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.Outcome> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower.C113261
            if (r0 == 0) goto L7c
            r8 = r14
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$complete$1 r8 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower.C113261) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r8.label = r2
        L12:
            java.lang.Object r1 = r8.result
            X.Hji r9 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r7 = 2
            r10 = 1
            if (r0 == 0) goto L38
            if (r0 == r10) goto L64
            if (r0 != r7) goto Lcb
            java.lang.Object r13 = r8.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r12 = r8.L$0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferCheckpoint r12 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferCheckpoint) r12
            X.Hwg.A00(r1)
        L2b:
            boolean r0 = X.AnonymousClass001.A1X(r1)
            if (r0 != 0) goto L82
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$FailureReason r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.FailureReason.DESTINATION_UNAVAILABLE
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$Outcome r9 = r11.failed(r0)
            return r9
        L38:
            X.Hwg.A00(r1)
            X.BLG<com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$Progress> r6 = r11._progress
        L3d:
            java.lang.Object r5 = r6.getValue()
            r0 = r5
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$Progress r0 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.Progress) r0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$ProgressStep r4 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.ProgressStep.SWITCHING
            boolean r3 = r0.isTransferStarted
            boolean r2 = r0.isWaitingOnLockedDestination
            int r1 = r0.run
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$Progress r0 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$Progress
            r0.<init>(r4, r3, r2, r1)
            boolean r0 = r6.A6e(r5, r0)
            if (r0 == 0) goto L3d
            r8.L$0 = r12
            r8.L$1 = r13
            r8.label = r10
            java.lang.Object r0 = r11.awaitDestinationSettled(r12, r8)
            if (r0 != r9) goto L6f
            return r9
        L64:
            java.lang.Object r13 = r8.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r12 = r8.L$0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferCheckpoint r12 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferCheckpoint) r12
            X.Hwg.A00(r1)
        L6f:
            r8.L$0 = r12
            r8.L$1 = r13
            r8.label = r7
            java.lang.Object r1 = r11.pointGatewayAtDestination(r12, r8)
            if (r1 != r9) goto L2b
            return r9
        L7c:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$complete$1 r8 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$complete$1
            r8.<init>(r11, r14)
            goto L12
        L82:
            java.lang.String r3 = r12.getDestinationEnvId()
            if (r3 == 0) goto L9b
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationDoneRepository$Companion r1 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationDoneRepository.Companion
            X.CGz r0 = r11.userSession
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationDoneRepository r2 = r1.getInstance(r0)
            com.facebook.aura.gateway.HatchlingVmType r1 = r11.destinationVmType
            com.facebook.aura.gateway.HatchlingVmType r0 = com.facebook.aura.gateway.HatchlingVmType.HATCH_CVM
            boolean r0 = X.AnonymousClass002.A1Z(r1, r0)
            r2.record$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_vmswitch_vmswitch(r3, r13, r0)
        L9b:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmCheckpointStore<T extends com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferCheckpoint<T>> r0 = r11.store
            r0.clear()
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore$Companion r1 = com.facebook.aura.gateway.store.HatchGatewayPrefsStore.Companion
            X.CGz r0 = r11.userSession
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore r0 = r1.getInstance(r0)
            r0.clearForInProcessVmSwitch()
            com.facebook.aura.confidentialvm.ConfidentialVmSetupGate$Companion r1 = com.facebook.aura.confidentialvm.ConfidentialVmSetupGate.Companion
            X.CGz r0 = r11.userSession
            com.facebook.aura.confidentialvm.ConfidentialVmSetupGate r1 = r1.getInstance(r0)
            com.facebook.aura.gateway.HatchlingVmType r0 = r11.destinationVmType
            boolean r0 = r1.markSelected(r0)
            if (r0 != 0) goto Lc8
            com.facebook.aura.gateway.HatchlingVmType r0 = r11.destinationVmType
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "ConfidentialVmTransferFollower"
            java.lang.String r0 = "Could not persist the %s selection after the transfer"
            X.CFK.A0H(r1, r0, r2)
        Lc8:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$Outcome$Completed r9 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.Outcome.Completed.INSTANCE
            return r9
        Lcb:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower.complete(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferCheckpoint, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object follow$default(ConfidentialVmTransferFollower confidentialVmTransferFollower, ConfidentialVmTransferCheckpoint confidentialVmTransferCheckpoint, G0W g0w, G0W g0w2, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            g0w = new AnonymousClass2(null);
        }
        if ((i & 4) != 0) {
            g0w2 = new AnonymousClass3(null);
        }
        return confidentialVmTransferFollower.follow(confidentialVmTransferCheckpoint, g0w, g0w2, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pointGatewayAtDestination(T r7, X.HtJ<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower.C113301
            if (r0 == 0) goto L94
            r4 = r8
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$pointGatewayAtDestination$1 r4 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower.C113301) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L94
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L67
            if (r0 != r3) goto L9b
            java.lang.Object r6 = r4.L$2
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore r6 = (com.facebook.aura.gateway.store.HatchGatewayPrefsStore) r6
            java.lang.Object r5 = r4.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r1 = X.AnonymousClass001.A0q(r1)
        L29:
            boolean r0 = r1 instanceof X.C10571Hud
            r4 = 0
            if (r0 == 0) goto L2f
            r1 = r4
        L2f:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L4d
            java.util.Iterator r2 = r1.iterator()
        L37:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.gateway.store.VmEntryV2Json r0 = (com.facebook.aura.gateway.store.VmEntryV2Json) r0
            boolean r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt.hasEnvId(r0, r5)
            if (r0 == 0) goto L37
            r4 = r1
        L4b:
            com.facebook.aura.gateway.store.VmEntryV2Json r4 = (com.facebook.aura.gateway.store.VmEntryV2Json) r4
        L4d:
            java.lang.String r1 = "ConfidentialVmTransferFollower"
            if (r4 != 0) goto L5c
            java.lang.String r0 = "The destination VM is not in fetch_vms; not switching the gateway"
        L53:
            X.CFK.A06(r1, r0)
        L56:
            r3 = 0
        L57:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            return r2
        L5c:
            java.lang.String r0 = r4.vm_ws_url
            boolean r0 = r6.commitGatewayUrl(r0)
            if (r0 != 0) goto L57
            java.lang.String r0 = "Could not point the gateway at the destination VM"
            goto L53
        L67:
            X.Hwg.A00(r1)
            java.lang.String r5 = r7.getDestinationEnvId()
            if (r5 == 0) goto L56
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore$Companion r1 = com.facebook.aura.gateway.store.HatchGatewayPrefsStore.Companion
            X.CGz r0 = r6.userSession
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore r6 = r1.getInstance(r0)
            java.lang.String r0 = X.C3cG.A0a(r6)
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L57
            com.facebook.aura.gateway.HatchVmRepository r1 = com.facebook.aura.gateway.HatchVmRepository.INSTANCE
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r5
            r4.L$2 = r6
            r4.label = r3
            java.lang.Object r1 = r1.m966fetchLiveVmsIoAF18A(r4)
            if (r1 != r2) goto L29
            return r2
        L94:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$pointGatewayAtDestination$1 r4 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$pointGatewayAtDestination$1
            r4.<init>(r6, r8)
            goto L12
        L9b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower.pointGatewayAtDestination(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferCheckpoint, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object recordedOutcome(T r7, X.HtJ<? super java.lang.String> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower.C113311
            if (r0 == 0) goto L4d
            r3 = r8
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$recordedOutcome$1 r3 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower.C113311) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r2 = r3.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r1 = 1
            r5 = 0
            if (r0 == 0) goto L34
            if (r0 != r1) goto L9e
            java.lang.Object r4 = r3.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r7 = r3.L$0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferCheckpoint r7 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferCheckpoint) r7
            java.lang.Object r3 = X.AnonymousClass001.A0q(r2)
        L2a:
            boolean r0 = r3 instanceof X.C10571Hud
            if (r0 == 0) goto L2f
            r3 = r5
        L2f:
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L53
            return r5
        L34:
            X.Hwg.A00(r2)
            java.lang.String r4 = r7.getDestinationEnvId()
            if (r4 != 0) goto L3e
            return r5
        L3e:
            com.facebook.aura.gateway.HatchVmRepository r0 = com.facebook.aura.gateway.HatchVmRepository.INSTANCE
            r3.L$0 = r7
            r3.L$1 = r4
            r3.label = r1
            java.lang.Object r3 = r0.m966fetchLiveVmsIoAF18A(r3)
            if (r3 != r6) goto L2a
            return r6
        L4d:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$recordedOutcome$1 r3 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$recordedOutcome$1
            r3.<init>(r6, r8)
            goto L12
        L53:
            java.util.Iterator r2 = r3.iterator()
        L57:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.gateway.store.VmEntryV2Json r0 = (com.facebook.aura.gateway.store.VmEntryV2Json) r0
            boolean r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt.hasEnvId(r0, r4)
            if (r0 == 0) goto L57
        L6a:
            com.facebook.aura.gateway.store.VmEntryV2Json r1 = (com.facebook.aura.gateway.store.VmEntryV2Json) r1
            if (r1 != 0) goto L71
            return r5
        L6f:
            r1 = r5
            goto L6a
        L71:
            java.lang.String r0 = r1.migration_state
            if (r0 != 0) goto L9d
            boolean r0 = r3 instanceof java.util.Collection
            java.lang.String r6 = "succeeded"
            if (r0 == 0) goto L82
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L82
        L81:
            return r6
        L82:
            java.util.Iterator r2 = r3.iterator()
        L86:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r1 = r2.next()
            com.facebook.aura.gateway.store.VmEntryV2Json r1 = (com.facebook.aura.gateway.store.VmEntryV2Json) r1
            java.lang.String r0 = r7.getSourceEnvId()
            boolean r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt.hasEnvId(r1, r0)
            if (r0 == 0) goto L86
            return r5
        L9d:
            return r0
        L9e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower.recordedOutcome(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferCheckpoint, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object follow(T r7, X.G0W<? super T, ? super com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson, ? super X.HtJ<? super com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.Outcome>, ? extends java.lang.Object> r8, X.G0W<? super T, ? super com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson, ? super X.HtJ<? super com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.Outcome>, ? extends java.lang.Object> r9, X.HtJ<? super com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.Outcome> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower.C113271
            if (r0 == 0) goto L22
            r5 = r10
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$follow$1 r5 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower.C113271) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L31
            if (r0 != r3) goto L2c
            java.lang.Object r2 = r5.L$3
            com.facebook.aura.gateway.HatchCvmMigrationStore r2 = (com.facebook.aura.gateway.HatchCvmMigrationStore) r2
            goto L28
        L22:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$follow$1 r5 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower$follow$1
            r5.<init>(r6, r10)
            goto L12
        L28:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L54
            goto L50
        L2c:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            throw r1
        L31:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.HatchCvmMigrationStore$Companion r1 = com.facebook.aura.gateway.HatchCvmMigrationStore.Companion
            X.CGz r0 = r6.userSession
            com.facebook.aura.gateway.HatchCvmMigrationStore r2 = r1.getInstance(r0)
            r2.isFollowingTransfer = r3
            r0 = 0
            r5.L$0 = r0     // Catch: java.lang.Throwable -> L54
            r5.L$1 = r0     // Catch: java.lang.Throwable -> L54
            r5.L$2 = r0     // Catch: java.lang.Throwable -> L54
            r5.L$3 = r2     // Catch: java.lang.Throwable -> L54
            r5.label = r3     // Catch: java.lang.Throwable -> L54
            java.lang.Object r1 = r6.followUntilDone(r7, r8, r9, r5)     // Catch: java.lang.Throwable -> L54
            if (r1 != r4) goto L50
            return r4
        L50:
            r0 = 0
            r2.isFollowingTransfer = r0
            return r1
        L54:
            r1 = move-exception
            r0 = 0
            r2.isFollowingTransfer = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower.follow(com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferCheckpoint, X.G0W, X.G0W, X.HtJ):java.lang.Object");
    }

    public final C1BN<ConfidentialVmDataTransferOperation.Progress> getProgress() {
        return this.progress;
    }

    public final void markTransferStarted() {
        ConfidentialVmDataTransferOperation.Progress value;
        ConfidentialVmDataTransferOperation.ProgressStep progressStep;
        boolean z;
        int i;
        BLG<ConfidentialVmDataTransferOperation.Progress> blg = this._progress;
        do {
            value = blg.getValue();
            ConfidentialVmDataTransferOperation.Progress progress = value;
            progressStep = progress.step;
            z = progress.isWaitingOnLockedDestination;
            i = progress.run;
            C7384Etj.A0Y(progressStep, 0);
        } while (!blg.A6e(value, new ConfidentialVmDataTransferOperation.Progress(progressStep, true, z, i)));
    }

    public final void resetProgress() {
        ConfidentialVmDataTransferOperation.Progress value;
        BLG<ConfidentialVmDataTransferOperation.Progress> blg = this._progress;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, new ConfidentialVmDataTransferOperation.Progress(ConfidentialVmDataTransferOperation.ProgressStep.PREPARING, false, false, value.run + 1)));
    }

    private final ConfidentialVmDataTransferOperation.Outcome failed(ConfidentialVmDataTransferOperation.FailureReason failureReason) {
        CFK.A0H(ConfidentialVmTransferFollowerKt.TAG, "Transfer stopped: %s", failureReason);
        return new ConfidentialVmDataTransferOperation.Outcome.Failed(failureReason, null, null);
    }
}
