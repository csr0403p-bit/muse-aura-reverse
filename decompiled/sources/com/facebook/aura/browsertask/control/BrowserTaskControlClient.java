package com.facebook.aura.browsertask.control;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7606F5t;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BV3;
import X.C06H;
import X.C3UX;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.browsertask.control.BrowserPresentResult;
import com.facebook.aura.json.NetworkException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class BrowserTaskControlClient {
    public static final int $stable = BrowserTaskControlTransport.$stable;
    public final BrowserTaskControlTransport controlTransport;

    public final class ControlHttpOutcome {
        public final String errorCode;
        public final int httpCode;
        public final Boolean retryable;
        public final BrowserTaskSnapshotJson snapshot;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ControlHttpOutcome) {
                    ControlHttpOutcome controlHttpOutcome = (ControlHttpOutcome) obj;
                    if (this.httpCode != controlHttpOutcome.httpCode || !C7384Etj.areEqual(this.errorCode, controlHttpOutcome.errorCode) || !C7384Etj.areEqual(this.snapshot, controlHttpOutcome.snapshot) || !C7384Etj.areEqual(this.retryable, controlHttpOutcome.retryable)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ControlHttpOutcome copy$default(ControlHttpOutcome controlHttpOutcome, int i, String str, BrowserTaskSnapshotJson browserTaskSnapshotJson, Boolean bool, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = controlHttpOutcome.httpCode;
            }
            if ((i2 & 2) != 0) {
                str = controlHttpOutcome.errorCode;
            }
            if ((i2 & 4) != 0) {
                browserTaskSnapshotJson = controlHttpOutcome.snapshot;
            }
            if ((i2 & 8) != 0) {
                bool = controlHttpOutcome.retryable;
            }
            return new ControlHttpOutcome(i, str, browserTaskSnapshotJson, bool);
        }

        public final int component1() {
            return this.httpCode;
        }

        public final String component2() {
            return this.errorCode;
        }

        public final BrowserTaskSnapshotJson component3() {
            return this.snapshot;
        }

        public final Boolean component4() {
            return this.retryable;
        }

        public final ControlHttpOutcome copy(int i, String str, BrowserTaskSnapshotJson browserTaskSnapshotJson, Boolean bool) {
            return new ControlHttpOutcome(i, str, browserTaskSnapshotJson, bool);
        }

        public final String getErrorCode() {
            return this.errorCode;
        }

        public final int getHttpCode() {
            return this.httpCode;
        }

        public final Boolean getRetryable() {
            return this.retryable;
        }

        public final BrowserTaskSnapshotJson getSnapshot() {
            return this.snapshot;
        }

        public int hashCode() {
            return (((((this.httpCode * 31) + AnonymousClass006.A0G(this.errorCode)) * 31) + AnonymousClass006.A0D(this.snapshot)) * 31) + C3cH.A02(this.retryable);
        }

        public String toString() {
            int i = this.httpCode;
            String str = this.errorCode;
            BrowserTaskSnapshotJson browserTaskSnapshotJson = this.snapshot;
            Boolean bool = this.retryable;
            StringBuilder sb = new StringBuilder("ControlHttpOutcome(httpCode=");
            sb.append(i);
            sb.append(BV3.A00(16));
            sb.append(str);
            sb.append(AbstractC7606F5t.A00(8));
            sb.append(browserTaskSnapshotJson);
            return C3cJ.A0L(bool, ", retryable=", sb);
        }

        public ControlHttpOutcome(int i, String str, BrowserTaskSnapshotJson browserTaskSnapshotJson, Boolean bool) {
            this.httpCode = i;
            this.errorCode = str;
            this.snapshot = browserTaskSnapshotJson;
            this.retryable = bool;
        }

        public /* synthetic */ ControlHttpOutcome(int i, String str, BrowserTaskSnapshotJson browserTaskSnapshotJson, Boolean bool, int i2, C06H c06h) {
            this(i, str, browserTaskSnapshotJson, (i2 & 8) != 0 ? null : bool);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.browsertask.control.BrowserTaskControlClient", f = "BrowserTaskControlClient.kt", l = {73}, m = "heartbeat", v = 2)
    /* renamed from: com.facebook.aura.browsertask.control.BrowserTaskControlClient$heartbeat$1, reason: invalid class name */
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
            return BrowserTaskControlClient.this.heartbeat(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.browsertask.control.BrowserTaskControlClient$presentTask$2", f = "BrowserTaskControlClient.kt", l = {33}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.browsertask.control.BrowserTaskControlClient$presentTask$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super BrowserPresentResult>, Object> {
        public final /* synthetic */ String $taskId;
        public final /* synthetic */ BrowserViewerPreference $viewer;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, BrowserViewerPreference browserViewerPreference, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$taskId = str;
            this.$viewer = browserViewerPreference;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return BrowserTaskControlClient.this.new AnonymousClass2(this.$taskId, this.$viewer, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM296present0E7RQCE;
            NetworkException networkException;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BrowserTaskControlTransport browserTaskControlTransport = BrowserTaskControlClient.this.controlTransport;
                String str = this.$taskId;
                BrowserViewerPreference browserViewerPreference = this.$viewer;
                this.label = 1;
                objM296present0E7RQCE = browserTaskControlTransport.m296present0E7RQCE(str, browserViewerPreference, this);
                if (objM296present0E7RQCE == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM296present0E7RQCE = AnonymousClass001.A0q(obj);
            }
            String str2 = this.$taskId;
            Throwable thA00 = HsJ.A00(objM296present0E7RQCE);
            Boolean bool = null;
            bool = null;
            if (thA00 == null) {
                BrowserTaskSnapshotJson browserTaskSnapshotJson = (BrowserTaskSnapshotJson) objM296present0E7RQCE;
                if (C7384Etj.areEqual(browserTaskSnapshotJson.presented_task_id, str2)) {
                    BrowserControlLeaseJson browserControlLeaseJson = browserTaskSnapshotJson.lease;
                    return new BrowserPresentResult.Presented(browserControlLeaseJson != null ? browserControlLeaseJson.toDomain() : null);
                }
            } else {
                if ((thA00 instanceof NetworkException) && (networkException = (NetworkException) thA00) != null) {
                    bool = networkException.serverRetryable;
                }
                if (AnonymousClass002.A1b(bool, false)) {
                    return BrowserPresentResult.PreviewRevoked.INSTANCE;
                }
            }
            return BrowserPresentResult.Retry.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super BrowserPresentResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.browsertask.control.BrowserTaskControlClient", f = "BrowserTaskControlClient.kt", l = {89}, m = "releaseControl", v = 2)
    /* renamed from: com.facebook.aura.browsertask.control.BrowserTaskControlClient$releaseControl$1, reason: invalid class name and case insensitive filesystem */
    public final class C109911 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C109911(HtJ<? super C109911> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BrowserTaskControlClient.this.releaseControl(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.browsertask.control.BrowserTaskControlClient", f = "BrowserTaskControlClient.kt", l = {58}, m = "takeControl", v = 2)
    /* renamed from: com.facebook.aura.browsertask.control.BrowserTaskControlClient$takeControl$1, reason: invalid class name and case insensitive filesystem */
    public final class C109921 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C109921(HtJ<? super C109921> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BrowserTaskControlClient.this.takeControl(null, null, this);
        }
    }

    public BrowserTaskControlClient(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.controlTransport = new BrowserTaskControlTransport(abstractC3358CGz);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object heartbeat(java.lang.String r6, X.HtJ<? super com.facebook.aura.browsertask.control.BrowserControlResult> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.browsertask.control.BrowserTaskControlClient.AnonymousClass1
            if (r0 == 0) goto L5f
            r4 = r7
            com.facebook.aura.browsertask.control.BrowserTaskControlClient$heartbeat$1 r4 = (com.facebook.aura.browsertask.control.BrowserTaskControlClient.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r2 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L4d
            if (r0 != r1) goto L65
            java.lang.Object r5 = r4.L$1
            com.facebook.aura.browsertask.control.BrowserTaskControlClient r5 = (com.facebook.aura.browsertask.control.BrowserTaskControlClient) r5
            java.lang.Object r6 = r4.L$0
            java.lang.Object r0 = X.AnonymousClass001.A0q(r2)
        L27:
            com.facebook.aura.browsertask.control.BrowserControlResult r3 = r5.controlForSnapshot(r0)
            boolean r0 = r3 instanceof com.facebook.aura.browsertask.control.BrowserControlResult.Granted
            if (r0 == 0) goto L4c
            r0 = r3
            com.facebook.aura.browsertask.control.BrowserControlResult$Granted r0 = (com.facebook.aura.browsertask.control.BrowserControlResult.Granted) r0
            if (r0 == 0) goto L4c
            com.facebook.aura.browsertask.control.BrowserControlLease r2 = r0.lease
            if (r2 == 0) goto L4c
            java.lang.String r1 = r2.controlOwner
            java.lang.String r0 = "user"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4a
            java.lang.String r0 = r2.taskId
            boolean r0 = X.C7384Etj.areEqual(r0, r6)
            if (r0 != 0) goto L4c
        L4a:
            com.facebook.aura.browsertask.control.BrowserControlResult$InvalidState r3 = com.facebook.aura.browsertask.control.BrowserControlResult.InvalidState.INSTANCE
        L4c:
            return r3
        L4d:
            X.Hwg.A00(r2)
            com.facebook.aura.browsertask.control.BrowserTaskControlTransport r0 = r5.controlTransport
            r4.L$0 = r6
            r4.L$1 = r5
            r4.label = r1
            java.lang.Object r0 = r0.m295heartbeatgIAlus(r6, r4)
            if (r0 != r3) goto L27
            return r3
        L5f:
            com.facebook.aura.browsertask.control.BrowserTaskControlClient$heartbeat$1 r4 = new com.facebook.aura.browsertask.control.BrowserTaskControlClient$heartbeat$1
            r4.<init>(r7)
            goto L12
        L65:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.control.BrowserTaskControlClient.heartbeat(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object releaseControl(java.lang.String r6, X.HtJ<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.browsertask.control.BrowserTaskControlClient.C109911
            if (r0 == 0) goto L41
            r4 = r7
            com.facebook.aura.browsertask.control.BrowserTaskControlClient$releaseControl$1 r4 = (com.facebook.aura.browsertask.control.BrowserTaskControlClient.C109911) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L47
            java.lang.Object r5 = r4.L$1
            com.facebook.aura.browsertask.control.BrowserTaskControlClient r5 = (com.facebook.aura.browsertask.control.BrowserTaskControlClient) r5
            java.lang.Object r0 = X.AnonymousClass001.A0q(r1)
        L25:
            boolean r0 = r5.controlSucceeded(r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L2e:
            X.Hwg.A00(r1)
            com.facebook.aura.browsertask.control.BrowserTaskControlTransport r1 = r5.controlTransport
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r5
            r4.label = r2
            java.lang.Object r0 = r1.m297releasegIAlus(r6, r4)
            if (r0 != r3) goto L25
            return r3
        L41:
            com.facebook.aura.browsertask.control.BrowserTaskControlClient$releaseControl$1 r4 = new com.facebook.aura.browsertask.control.BrowserTaskControlClient$releaseControl$1
            r4.<init>(r7)
            goto L12
        L47:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.control.BrowserTaskControlClient.releaseControl(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object takeControl(java.lang.String r6, com.facebook.aura.browsertask.control.BrowserViewerPreference r7, X.HtJ<? super com.facebook.aura.browsertask.control.BrowserControlResult> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.browsertask.control.BrowserTaskControlClient.C109921
            if (r0 == 0) goto L68
            r3 = r8
            com.facebook.aura.browsertask.control.BrowserTaskControlClient$takeControl$1 r3 = (com.facebook.aura.browsertask.control.BrowserTaskControlClient.C109921) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r1 = r3.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r2 = 1
            if (r0 == 0) goto L53
            if (r0 != r2) goto L71
            java.lang.Object r5 = r3.L$2
            com.facebook.aura.browsertask.control.BrowserTaskControlClient r5 = (com.facebook.aura.browsertask.control.BrowserTaskControlClient) r5
            java.lang.Object r6 = r3.L$0
            java.lang.Object r0 = X.AnonymousClass001.A0q(r1)
        L27:
            com.facebook.aura.browsertask.control.BrowserControlResult r4 = r5.controlForSnapshot(r0)
            boolean r0 = r4 instanceof com.facebook.aura.browsertask.control.BrowserControlResult.Granted
            if (r0 == 0) goto L52
            r3 = r4
            com.facebook.aura.browsertask.control.BrowserControlResult$Granted r3 = (com.facebook.aura.browsertask.control.BrowserControlResult.Granted) r3
            com.facebook.aura.browsertask.control.BrowserControlLease r2 = r3.lease
            if (r2 == 0) goto L48
            java.lang.String r1 = r2.controlOwner
            java.lang.String r0 = "user"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6e
            java.lang.String r0 = r2.taskId
            boolean r0 = X.C7384Etj.areEqual(r0, r6)
            if (r0 == 0) goto L6e
        L48:
            java.lang.String r0 = r3.presentedTaskId
            if (r0 == 0) goto L52
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L6e
        L52:
            return r4
        L53:
            X.Hwg.A00(r1)
            com.facebook.aura.browsertask.control.BrowserTaskControlTransport r1 = r5.controlTransport
            r3.L$0 = r6
            r0 = 0
            r3.L$1 = r0
            r3.L$2 = r5
            r3.label = r2
            java.lang.Object r0 = r1.m299takeover0E7RQCE(r6, r7, r3)
            if (r0 != r4) goto L27
            return r4
        L68:
            com.facebook.aura.browsertask.control.BrowserTaskControlClient$takeControl$1 r3 = new com.facebook.aura.browsertask.control.BrowserTaskControlClient$takeControl$1
            r3.<init>(r8)
            goto L12
        L6e:
            com.facebook.aura.browsertask.control.BrowserControlResult$Conflict r4 = com.facebook.aura.browsertask.control.BrowserControlResult.Conflict.INSTANCE
            return r4
        L71:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.control.BrowserTaskControlClient.takeControl(java.lang.String, com.facebook.aura.browsertask.control.BrowserViewerPreference, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.browsertask.control.BrowserControlResult controlForSnapshot(java.lang.Object r3) {
        /*
            r2 = this;
            com.facebook.aura.browsertask.control.BrowserTaskControlClient$ControlHttpOutcome r3 = r2.controlOutcome(r3)
            if (r3 == 0) goto L54
            com.facebook.aura.browsertask.control.BrowserTaskSnapshotJson r1 = r3.snapshot
            if (r1 == 0) goto L24
            com.facebook.aura.browsertask.control.BrowserControlLeaseJson r0 = r1.lease
            r3 = 0
            if (r0 == 0) goto L22
            com.facebook.aura.browsertask.control.BrowserControlLease r2 = r0.toDomain()
        L13:
            java.lang.String r1 = r1.presented_task_id
            boolean r0 = X.C7BY.A0j(r1)
            if (r0 != 0) goto L1c
            r3 = r1
        L1c:
            com.facebook.aura.browsertask.control.BrowserControlResult$Granted r0 = new com.facebook.aura.browsertask.control.BrowserControlResult$Granted
            r0.<init>(r2, r3)
            return r0
        L22:
            r2 = r3
            goto L13
        L24:
            java.lang.Boolean r2 = r3.retryable
            r0 = 1
            boolean r0 = X.AnonymousClass002.A1b(r2, r0)
            if (r0 != 0) goto L54
            int r1 = r3.httpCode
            r0 = 409(0x199, float:5.73E-43)
            if (r1 != r0) goto L43
            java.lang.String r1 = r3.errorCode
            java.lang.String r0 = "invalid_state"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            com.facebook.aura.browsertask.control.BrowserControlResult$InvalidState r0 = com.facebook.aura.browsertask.control.BrowserControlResult.InvalidState.INSTANCE
            goto L56
        L40:
            com.facebook.aura.browsertask.control.BrowserControlResult$Conflict r0 = com.facebook.aura.browsertask.control.BrowserControlResult.Conflict.INSTANCE
            goto L56
        L43:
            r0 = 0
            boolean r0 = X.AnonymousClass002.A1b(r2, r0)
            if (r0 != 0) goto L59
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L54
            if (r1 < 0) goto L54
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 < r0) goto L59
        L54:
            com.facebook.aura.browsertask.control.BrowserControlResult$Retry r0 = com.facebook.aura.browsertask.control.BrowserControlResult.Retry.INSTANCE
        L56:
            com.facebook.aura.browsertask.control.BrowserControlResult r0 = (com.facebook.aura.browsertask.control.BrowserControlResult) r0
            return r0
        L59:
            com.facebook.aura.browsertask.control.BrowserControlResult$Failed r0 = com.facebook.aura.browsertask.control.BrowserControlResult.Failed.INSTANCE
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.control.BrowserTaskControlClient.controlForSnapshot(java.lang.Object):com.facebook.aura.browsertask.control.BrowserControlResult");
    }

    private final ControlHttpOutcome controlOutcome(Object obj) {
        NetworkException networkException;
        Throwable thA00 = HsJ.A00(obj);
        if (thA00 == null) {
            return new ControlHttpOutcome(200, null, (BrowserTaskSnapshotJson) obj, null);
        }
        if (!(thA00 instanceof NetworkException) || (networkException = (NetworkException) thA00) == null) {
            return null;
        }
        return new ControlHttpOutcome(networkException.httpResponseCode, networkException.errorCode, null, networkException.serverRetryable);
    }

    private final boolean controlSucceeded(Object obj) {
        ControlHttpOutcome controlHttpOutcomeControlOutcome = controlOutcome(obj);
        if (controlHttpOutcomeControlOutcome == null) {
            return false;
        }
        int i = controlHttpOutcomeControlOutcome.httpCode;
        return i == 200 || i == 409;
    }

    public final Object presentTask(String str, BrowserViewerPreference browserViewerPreference, HtJ<? super BrowserPresentResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(str, browserViewerPreference, null));
    }
}
