package com.facebook.quicklog.reliability;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV4;
import X.BV5;
import X.BV6;
import X.BV7;
import X.BV8;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C7414EvG;
import X.DAN;
import X.FGI;
import com.facebook.acra.constants.ActionId;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.PointEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public class UserFlowLoggerImpl implements UserFlowLogger {
    public static final String CANCEL_REASON_ANNOTATION = "cancel_reason";
    public static final String DEBUG_INFO_ANNOTATION = "uf_debug_info";
    public static final String HAS_ERROR_ANNOTATION = "uf_has_error";
    public static final AtomicInteger INSTANCE_KEY_COUNTER = BV5.A18();
    public static final String INVALID_REASON_ANNOTATION = "uf_invalid_reason";
    public static final String SOURCE_ANNOTATION = "trigger_source";
    public static final String SOURCE_OF_RESTART_ANNOTATION = "trigger_source_of_restart";
    public static final String UNSTARTED_DEBUG_INFO_ANNOTATION = "uf_unstarted_debug_info";
    public final Set<Long> _ongoingFlows;
    public final boolean annotateTriggerSourceAsCrucial;
    public final Map<Long, DAN> flowMetadata;
    public final Set<Long> ongoingBgCancellableFlows;
    public final QuickPerformanceLogger qpL;
    public final boolean strictMode;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserFlowLoggerImpl(QuickPerformanceLogger quickPerformanceLogger) {
        this(quickPerformanceLogger, false, false);
        C7384Etj.A0Y(quickPerformanceLogger, 0);
    }

    private final void flowMarkDebugInfo(long j, String str, boolean z, String str2) {
        int iA03 = BV6.A03(j);
        MarkerEditor markerEditorWithMarker = this.qpL.withMarker((int) j, iA03);
        markerEditorWithMarker.annotate(HAS_ERROR_ANNOTATION, z);
        PointEditor pointEditor = markerEditorWithMarker.pointEditor(str);
        C7384Etj.A0U(pointEditor);
        if (str2 != null) {
            pointEditor.addPointData(DEBUG_INFO_ANNOTATION, str2);
        }
        markerEditorWithMarker.markerEditingCompleted();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r12 != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a A[Catch: all -> 0x0083, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0002, B:14:0x0022, B:15:0x0033, B:18:0x003a, B:20:0x004d, B:23:0x0053, B:27:0x0068, B:29:0x006f, B:28:0x006c, B:24:0x005c, B:19:0x0045), top: B:36:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045 A[Catch: all -> 0x0083, TryCatch #0 {, blocks: (B:4:0x0002, B:14:0x0022, B:15:0x0033, B:18:0x003a, B:20:0x004d, B:23:0x0053, B:27:0x0068, B:29:0x006f, B:28:0x006c, B:24:0x005c, B:19:0x0045), top: B:36:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053 A[Catch: all -> 0x0083, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0002, B:14:0x0022, B:15:0x0033, B:18:0x003a, B:20:0x004d, B:23:0x0053, B:27:0x0068, B:29:0x006f, B:28:0x006c, B:24:0x005c, B:19:0x0045), top: B:36:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0002, B:14:0x0022, B:15:0x0033, B:18:0x003a, B:20:0x004d, B:23:0x0053, B:27:0x0068, B:29:0x006f, B:28:0x006c, B:24:0x005c, B:19:0x0045), top: B:36:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[Catch: all -> 0x0083, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0002, B:14:0x0022, B:15:0x0033, B:18:0x003a, B:20:0x004d, B:23:0x0053, B:27:0x0068, B:29:0x006f, B:28:0x006c, B:24:0x005c, B:19:0x0045), top: B:36:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[Catch: all -> 0x0083, TryCatch #0 {, blocks: (B:4:0x0002, B:14:0x0022, B:15:0x0033, B:18:0x003a, B:20:0x004d, B:23:0x0053, B:27:0x0068, B:29:0x006f, B:28:0x006c, B:24:0x005c, B:19:0x0045), top: B:36:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized boolean flowStartInternal(long r9, com.facebook.quicklog.reliability.UserFlowConfig r11, boolean r12, java.lang.String r13, long r14) {
        /*
            r8 = this;
            r1 = r8
            monitor-enter(r1)
            java.util.Set<java.lang.Long> r2 = r8._ongoingFlows     // Catch: java.lang.Throwable -> L83
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L83
            boolean r3 = r2.add(r0)     // Catch: java.lang.Throwable -> L83
            int r6 = (int) r9     // Catch: java.lang.Throwable -> L83
            int r7 = X.BV6.A03(r9)     // Catch: java.lang.Throwable -> L83
            boolean r2 = r8.strictMode     // Catch: java.lang.Throwable -> L83
            r4 = r11
            if (r2 == 0) goto L1b
            if (r3 != 0) goto L33
            if (r12 != 0) goto L1f
            goto L22
        L1b:
            if (r3 != 0) goto L33
            if (r12 == 0) goto L33
        L1f:
            monitor-exit(r1)
            r0 = 0
            return r0
        L22:
            com.facebook.quicklog.QuickPerformanceLogger r5 = r8.qpL     // Catch: java.lang.Throwable -> L83
            java.lang.String r3 = "trigger_source_of_restart"
            java.lang.String r2 = r11.mTriggerSource     // Catch: java.lang.Throwable -> L83
            r5.markerAnnotate(r6, r7, r3, r2)     // Catch: java.lang.Throwable -> L83
            com.facebook.quicklog.QuickPerformanceLogger r3 = r8.qpL     // Catch: java.lang.Throwable -> L83
            r2 = 111(0x6f, float:1.56E-43)
            r3.markerEndForUserFlow(r6, r7, r2)     // Catch: java.lang.Throwable -> L83
        L33:
            boolean r8 = r11.mCancelOnBackground     // Catch: java.lang.Throwable -> L83
            com.facebook.quicklog.QuickPerformanceLogger r5 = r1.qpL
            r12 = r13
            if (r13 == 0) goto L45
            long r2 = r11.mTtlMs     // Catch: java.lang.Throwable -> L83
            r9 = r5
            r10 = r6
            r11 = r7
            r13 = r8
            r14 = r2
            r9.markerStartForUserFlow(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L83
            goto L4d
        L45:
            long r9 = r11.mTtlMs     // Catch: java.lang.Throwable -> L83
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L83
            r11 = r14
            r5.markerStartForUserFlow(r6, r7, r8, r9, r11, r13)     // Catch: java.lang.Throwable -> L83
        L4d:
            boolean r2 = r1.annotateTriggerSourceAsCrucial     // Catch: java.lang.Throwable -> L83
            com.facebook.quicklog.QuickPerformanceLogger r5 = r1.qpL
            if (r2 == 0) goto L5c
            java.lang.String r3 = "trigger_source"
            java.lang.String r2 = r4.mTriggerSource     // Catch: java.lang.Throwable -> L83
            r5.markerAnnotateCrucialForUserFlow(r6, r7, r3, r2)     // Catch: java.lang.Throwable -> L83
            goto L64
        L5c:
            java.lang.String r3 = "trigger_source"
            java.lang.String r2 = r4.mTriggerSource     // Catch: java.lang.Throwable -> L83
            r5.markerAnnotate(r6, r7, r3, r2)     // Catch: java.lang.Throwable -> L83
        L64:
            java.util.Set<java.lang.Long> r2 = r1.ongoingBgCancellableFlows
            if (r8 == 0) goto L6c
            r2.add(r0)     // Catch: java.lang.Throwable -> L83
            goto L6f
        L6c:
            r2.remove(r0)     // Catch: java.lang.Throwable -> L83
        L6f:
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L83
            java.util.Map<java.lang.Long, X.DAN> r2 = r1.flowMetadata     // Catch: java.lang.Throwable -> L83
            long r12 = r4.mTtlMs     // Catch: java.lang.Throwable -> L83
            X.DAN r9 = new X.DAN     // Catch: java.lang.Throwable -> L83
            r14 = r8
            r9.<init>(r10, r12, r14)     // Catch: java.lang.Throwable -> L83
            r2.put(r0, r9)     // Catch: java.lang.Throwable -> L83
            monitor-exit(r1)
            r0 = 1
            return r0
        L83:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L83
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quicklog.reliability.UserFlowLoggerImpl.flowStartInternal(long, com.facebook.quicklog.reliability.UserFlowConfig, boolean, java.lang.String, long):boolean");
    }

    public static final long generateUserFlowId(int i, int i2) {
        return i | (i2 << 32);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowAnnotateWithCrucialData(long j, String str, int i, String str2) {
        AnonymousClass002.A1B(str, 1, str2);
        int i2 = (int) j;
        int iA03 = BV6.A03(j);
        if (!this.strictMode || BV7.A1W(this, j)) {
            this.qpL.markerAnnotateCrucialForUserFlow(i2, iA03, str, i);
        } else {
            logUnstartedSession(i2, (short) 10087, str, str2);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowDrop(long j) {
        int i = (int) j;
        int iA03 = BV6.A03(j);
        synchronized (this) {
            Set<Long> set = this._ongoingFlows;
            Long lValueOf = Long.valueOf(j);
            if (set.contains(lValueOf)) {
                this.qpL.markerDropForUserFlow(i, iA03);
            }
            this._ongoingFlows.remove(lValueOf);
            this.ongoingBgCancellableFlows.remove(lValueOf);
            this.flowMetadata.remove(lValueOf);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowEndAbort(long j) {
        int i = (int) j;
        int iA03 = BV6.A03(j);
        synchronized (this) {
            if (!this.strictMode || BV7.A1W(this, j)) {
                this.qpL.markerEndForUserFlow(i, null, iA03, ActionId.ABORTED);
            } else {
                logUnstartedSession(i, (short) 10294, "flowEndAbort", "");
            }
            BV8.A1H(this, j);
        }
    }

    public final void flowEndNewStartFound(long j, String str) {
        C7384Etj.A0Y(str, 1);
        int i = (int) j;
        int iA03 = BV6.A03(j);
        synchronized (this) {
            if (!this.strictMode || BV7.A1W(this, j)) {
                this.qpL.markerAnnotate(i, iA03, SOURCE_OF_RESTART_ANNOTATION, str);
                this.qpL.markerEndForUserFlow(i, iA03, ActionId.NEW_START_FOUND);
            }
            BV8.A1H(this, j);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowEndTimeout(long j) {
        int i = (int) j;
        int iA03 = BV6.A03(j);
        synchronized (this) {
            if (!this.strictMode || BV7.A1W(this, j)) {
                this.qpL.markerEndForUserFlow(i, iA03, ActionId.TIMEOUT);
            }
            BV8.A1H(this, j);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowMarkError(long j, String str, String str2) {
        C7384Etj.A0Y(str, 1);
        flowMarkDebugInfo(j, str, true, str2);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowMarkPoint(long j, String str) {
        C7384Etj.A0Y(str, 1);
        int i = (int) j;
        int iA03 = BV6.A03(j);
        if (!this.strictMode || BV7.A1W(this, j)) {
            this.qpL.markerPoint(i, iA03, str);
        } else {
            logUnstartedSession(i, (short) 10088, str, "");
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowStart(long j, UserFlowConfig userFlowConfig) {
        C7384Etj.A0Y(userFlowConfig, 1);
        flowStartInternal(j, userFlowConfig, false, null, -1L);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowStartEx(long j, UserFlowConfig userFlowConfig, long j2) {
        C7384Etj.A0Y(userFlowConfig, 1);
        flowStartInternal(j, userFlowConfig, false, null, j2);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public long flowStartForMarker(int i, String str, boolean z) {
        C7384Etj.A0Y(str, 1);
        long jIncrementAndGet = i | (INSTANCE_KEY_COUNTER.incrementAndGet() << 32);
        UserFlowConfig userFlowConfig = new UserFlowConfig(str, z);
        userFlowConfig.mTtlMs = -1L;
        flowStartInternal(jIncrementAndGet, userFlowConfig, false, null, -1L);
        return jIncrementAndGet;
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public boolean flowStartIfNotOngoing(long j, UserFlowConfig userFlowConfig) {
        C7384Etj.A0Y(userFlowConfig, 1);
        return flowStartInternal(j, userFlowConfig, true, null, -1L);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public Long flowStartIfNotOngoingForMarker(int i, int i2, String str, boolean z, long j) {
        C7384Etj.A0Y(str, 2);
        long j2 = i | (i2 << 32);
        UserFlowConfig userFlowConfig = new UserFlowConfig(str, z);
        userFlowConfig.mTtlMs = j;
        if (flowStartInternal(j2, userFlowConfig, true, null, -1L)) {
            return Long.valueOf(j2);
        }
        return null;
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public long generateFlowId(int i, int i2) {
        return i | (i2 << 32);
    }

    public final synchronized int[] getOngoingFlows() {
        int[] iArr;
        iArr = new int[this._ongoingFlows.size()];
        Iterator<Long> it = this._ongoingFlows.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = (int) BV7.A0Y(it);
            i++;
        }
        return iArr;
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public synchronized boolean isOngoingFlow(long j) {
        return BV7.A1W(this, j);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public synchronized void onAppBackgrounded() {
        Iterator<Long> it = this.ongoingBgCancellableFlows.iterator();
        while (it.hasNext()) {
            this.flowMetadata.remove(Long.valueOf(BV7.A0Y(it)));
        }
        this._ongoingFlows.removeAll(this.ongoingBgCancellableFlows);
        this.ongoingBgCancellableFlows.clear();
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public MarkerEditor withFlow(long j) {
        int iA03 = BV6.A03(j);
        MarkerEditor markerEditorWithMarker = this.qpL.withMarker((int) j, iA03);
        C7384Etj.A0U(markerEditorWithMarker);
        return markerEditorWithMarker;
    }

    private final void logUnstartedSession(int i, short s, String str, String str2) {
        EventBuilder eventBuilderAnnotate = this.qpL.markEventBuilder(i, "user_flow_strict_mode").setActionId(s).annotate(INVALID_REASON_ANNOTATION, str);
        if (str2 != null && str2.length() != 0) {
            eventBuilderAnnotate = eventBuilderAnnotate.annotate(UNSTARTED_DEBUG_INFO_ANNOTATION, str2);
        }
        eventBuilderAnnotate.report();
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowCancelAtPoint(long j, String str, String str2, String str3) {
        int i = (int) j;
        int iA03 = BV6.A03(j);
        this.qpL.markerAnnotate(i, iA03, "cancel_reason", str2);
        synchronized (this) {
            if (!this.strictMode || BV7.A1W(this, j)) {
                this.qpL.markerEndForUserFlow(i, str, iA03, (short) 4);
            } else {
                logUnstartedSession(i, (short) 10294, FGI.A0M("flowCancelAtPoint|", str2), str3);
            }
            BV8.A1H(this, j);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowEndCancel(long j, String str) {
        flowEndCancel(j, str, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowEndFail(long j, String str, String str2, String str3) {
        C7384Etj.A0Y(str, 1);
        int i = (int) j;
        int iA03 = BV6.A03(j);
        flowMarkError(j, str, str2);
        synchronized (this) {
            if (!this.strictMode || BV7.A1W(this, j)) {
                this.qpL.markerEndForUserFlow(i, iA03, (short) 3);
            } else {
                logUnstartedSession(i, (short) 10294, FGI.A0M("flowEndFail|", str), str3);
            }
            BV8.A1H(this, j);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowEndSuccess(long j) {
        flowEndSuccess(j, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public long generateNewFlowId(int i) {
        return i | (INSTANCE_KEY_COUNTER.incrementAndGet() << 32);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ PointEditor markPointWithEditor(long j, String str) {
        return markPointWithEditor(j, str, "");
    }

    public static final int extractInstanceId(long j) {
        return BV6.A03(j);
    }

    public static final int extractMarkerId(long j) {
        return (int) j;
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public long[] flowEndTimedoutFlows() {
        int i;
        ArrayList arrayListA0h = C3cG.A0h();
        long jCurrentMonotonicTimestamp = this.qpL.currentMonotonicTimestamp();
        synchronized (this) {
            Iterator itA0n = AnonymousClass002.A0n(this.flowMetadata);
            while (true) {
                i = 0;
                if (!itA0n.hasNext()) {
                    break;
                }
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                long jA05 = C3cG.A05(entryA0l.getKey());
                DAN dan = (DAN) entryA0l.getValue();
                long j = dan.A01;
                int i2 = 1;
                if (j > 0 && jCurrentMonotonicTimestamp - dan.A00 >= j) {
                    i = 1;
                }
                short s = 630;
                if (!dan.A02) {
                    s = ActionId.TIMEOUT;
                    i2 = i;
                }
                if (i2 != 0) {
                    int iA03 = BV6.A03(jA05);
                    this.qpL.markerEndForUserFlow((int) jA05, iA03, s);
                    BV6.A1R(arrayListA0h, jA05);
                }
            }
            Iterator it = arrayListA0h.iterator();
            while (it.hasNext()) {
                BV8.A1H(this, BV7.A0Y(it));
            }
        }
        long[] jArr = new long[arrayListA0h.size()];
        int size = arrayListA0h.size();
        while (i < size) {
            jArr[i] = C3cG.A05(arrayListA0h.get(i));
            i++;
        }
        return jArr;
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowAnnotate(long j, String str, double d) {
        flowAnnotate(j, str, d, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowAnnotate(long j, String str, double d, String str2) {
        AnonymousClass002.A1B(str, 1, str2);
        int i = (int) j;
        int iA03 = BV6.A03(j);
        if (!this.strictMode || BV7.A1W(this, j)) {
            this.qpL.markerAnnotate(i, iA03, str, d);
        } else {
            logUnstartedSession(i, (short) 10087, str, str2);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowAnnotate(long j, String str, int i) {
        flowAnnotate(j, str, i, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowAnnotate(long j, String str, int i, String str2) {
        AnonymousClass002.A1B(str, 1, str2);
        int i2 = (int) j;
        int iA03 = BV6.A03(j);
        if (!this.strictMode || BV7.A1W(this, j)) {
            this.qpL.markerAnnotate(i2, iA03, str, i);
        } else {
            logUnstartedSession(i2, (short) 10087, str, str2);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowAnnotate(long j, String str, long j2) {
        flowAnnotate(j, str, j2, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowAnnotate(long j, String str, long j2, String str2) {
        AnonymousClass002.A1B(str, 1, str2);
        int i = (int) j;
        int iA03 = BV6.A03(j);
        if (!this.strictMode || BV7.A1W(this, j)) {
            this.qpL.markerAnnotate(i, iA03, str, j2);
        } else {
            logUnstartedSession(i, (short) 10087, str, str2);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowAnnotate(long j, String str, String str2) {
        flowAnnotate(j, str, str2, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowAnnotate(long j, String str, String str2, String str3) {
        C7384Etj.A0Y(str, 1);
        int i = (int) j;
        int iA03 = BV6.A03(j);
        if (!this.strictMode || BV7.A1W(this, j)) {
            this.qpL.markerAnnotate(i, iA03, str, str2);
        } else {
            logUnstartedSession(i, (short) 10087, str, str3);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowAnnotate(long j, String str, boolean z) {
        flowAnnotate(j, str, z, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowAnnotate(long j, String str, boolean z, String str2) {
        AnonymousClass002.A1B(str, 1, str2);
        int i = (int) j;
        int iA03 = BV6.A03(j);
        if (!this.strictMode || BV7.A1W(this, j)) {
            this.qpL.markerAnnotate(i, iA03, str, z);
        } else {
            logUnstartedSession(i, (short) 10087, str, str2);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowAnnotate(long j, String str, long[] jArr, String str2) {
        AnonymousClass005.A11(str, jArr, str2, 1);
        int i = (int) j;
        int iA03 = BV6.A03(j);
        if (!this.strictMode || BV7.A1W(this, j)) {
            this.qpL.markerAnnotate(i, iA03, str, jArr);
        } else {
            logUnstartedSession(i, (short) 10087, str, str2);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowAnnotate(long j, String str, String[] strArr, String str2) {
        AnonymousClass002.A1B(str, 1, str2);
        int i = (int) j;
        int iA03 = BV6.A03(j);
        if (this.strictMode && !BV7.A1W(this, j)) {
            logUnstartedSession(i, (short) 10087, str, str2);
        } else {
            if (strArr == null) {
                return;
            }
            this.qpL.markerAnnotate(i, iA03, str, strArr);
        }
    }

    public UserFlowLoggerImpl(QuickPerformanceLogger quickPerformanceLogger, boolean z, boolean z2) {
        C7384Etj.A0Y(quickPerformanceLogger, 0);
        this.strictMode = z;
        this.annotateTriggerSourceAsCrucial = z2;
        this.qpL = quickPerformanceLogger;
        this._ongoingFlows = C60O.A13();
        this.ongoingBgCancellableFlows = C60O.A13();
        this.flowMetadata = BV4.A0u();
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowAnnotateWithCrucialData(long j, String str, int i) {
        flowAnnotateWithCrucialData(j, str, i, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowCancelAtPoint(long j, String str, String str2) {
        flowCancelAtPoint(j, str, str2, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowEndCancel(long j, String str, String str2) {
        flowCancelAtPoint(j, null, str, str2);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowEndFail(long j, String str, String str2) {
        flowEndFail(j, str, str2, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowEndSuccess(long j, String str) {
        C7384Etj.A0Y(str, 1);
        int i = (int) j;
        int iA03 = BV6.A03(j);
        synchronized (this) {
            if (this.strictMode && !BV7.A1W(this, j)) {
                logUnstartedSession(i, (short) 10294, "flowEndSuccess", str);
            } else {
                this.qpL.markerEndForUserFlow(i, iA03, (short) 2);
            }
            BV8.A1H(this, j);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowMarkPoint(long j, String str, String str2) {
        flowMarkPoint(j, str, str2, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowStart(long j, String str, boolean z) {
        C7384Etj.A0Y(str, 1);
        UserFlowConfig userFlowConfig = new UserFlowConfig(str, z);
        userFlowConfig.mTtlMs = -1L;
        flowStartInternal(j, userFlowConfig, false, null, -1L);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public boolean flowStartIfNotOngoing(long j, String str, UserFlowConfig userFlowConfig) {
        AnonymousClass002.A1A(str, 1, userFlowConfig);
        return flowStartInternal(j, userFlowConfig, true, str, -1L);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public PointEditor markPointWithEditor(long j, String str, String str2) {
        AnonymousClass003.A0x(str, str2);
        int i = (int) j;
        int iA03 = BV6.A03(j);
        if (this.strictMode && !BV7.A1W(this, j)) {
            logUnstartedSession(i, (short) 10088, str, str2);
            return C7414EvG.A00;
        }
        PointEditor pointEditor = this.qpL.withMarker(i, iA03).pointEditor(str);
        C7384Etj.A0U(pointEditor);
        return pointEditor;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserFlowLoggerImpl(QuickPerformanceLogger quickPerformanceLogger, boolean z) {
        this(quickPerformanceLogger, z, true);
        C7384Etj.A0Y(quickPerformanceLogger, 0);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowAnnotateWithCrucialData(long j, String str, String str2, String str3) {
        AnonymousClass002.A1B(str, 1, str3);
        int i = (int) j;
        int iA03 = BV6.A03(j);
        if (this.strictMode && !BV7.A1W(this, j)) {
            logUnstartedSession(i, (short) 10087, str, str3);
        } else {
            this.qpL.markerAnnotateCrucialForUserFlow(i, iA03, str, str2);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowMarkPoint(long j, String str, String str2, String str3) {
        AnonymousClass002.A1B(str, 1, str3);
        int i = (int) j;
        int iA03 = BV6.A03(j);
        if (this.strictMode && !BV7.A1W(this, j)) {
            logUnstartedSession(i, (short) 10088, str, str3);
            return;
        }
        MarkerEditor markerEditorWithMarker = this.qpL.withMarker(i, iA03);
        markerEditorWithMarker.pointEditor(str).addPointData(DEBUG_INFO_ANNOTATION, str2);
        markerEditorWithMarker.markerEditingCompleted();
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowStart(long j, String str, boolean z, long j2) {
        C7384Etj.A0Y(str, 1);
        UserFlowConfig userFlowConfig = new UserFlowConfig(str, z);
        userFlowConfig.mTtlMs = j2;
        flowStartInternal(j, userFlowConfig, false, null, -1L);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowAnnotateWithCrucialData(long j, String str, String str2) {
        flowAnnotateWithCrucialData(j, str, str2, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowStart(long j, String str, UserFlowConfig userFlowConfig) {
        AnonymousClass003.A0x(str, userFlowConfig);
        flowStartInternal(j, userFlowConfig, false, str, -1L);
    }
}
