package com.facebook.aura.nudge;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass801;
import X.BLG;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C6ys;
import X.C7384Etj;
import X.C78W;
import X.C79;
import X.C8eO;
import X.C9286GCn;
import X.CFK;
import X.GAo;
import X.HnJ;
import X.HoC;
import X.HtJ;
import X.Hxb;
import X.HzP;
import android.os.SystemClock;
import com.facebook.aura.nudge.NudgeState;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class ConversationNudgeCoordinator {
    public static final int $stable = 0;
    public static final long OUTCOME_TIMEOUT_MS = 300000;
    public static final String TAG = "ConversationNudges";
    public static HoC backgroundJob;
    public static final C1BN<Long> evaluationRequests;
    public static final BLG<Long> mutableEvaluationRequests;
    public static final BLG<NudgeState> mutableState;
    public static Long skipLoggedDay;
    public static final Set<String> skipLoggedToday;
    public static final C1BN<NudgeState> state;
    public static HoC timerJob;
    public static long withdrawals;
    public static final ConversationNudgeCoordinator INSTANCE = new ConversationNudgeCoordinator();
    public static final Object lock = C3cG.A0T();
    public static final C3UX scope = Hxb.A02(C78W.A02(new C8eO(null), C3cG.A0v()));

    @DebugMetadata(c = "com.facebook.aura.nudge.ConversationNudgeCoordinator", f = "ConversationNudgeCoordinator.kt", l = {103}, m = "evaluate", v = 2)
    /* renamed from: com.facebook.aura.nudge.ConversationNudgeCoordinator$evaluate$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public long J$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationNudgeCoordinator.this.evaluate(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nudge.ConversationNudgeCoordinator", f = "ConversationNudgeCoordinator.kt", l = {271}, m = "isEligible", v = 2)
    /* renamed from: com.facebook.aura.nudge.ConversationNudgeCoordinator$isEligible$1, reason: invalid class name and case insensitive filesystem */
    public final class C127891 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C127891(HtJ<? super C127891> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationNudgeCoordinator.this.isEligible(null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010e A[PHI: r2 r4 r6 r7 r12
  0x010e: PHI (r2v1 long) = (r2v0 long), (r2v5 long) binds: [B:51:0x0101, B:18:0x0053] A[DONT_GENERATE, DONT_INLINE]
  0x010e: PHI (r4v1 long) = (r4v0 long), (r4v6 long) binds: [B:51:0x0101, B:18:0x0053] A[DONT_GENERATE, DONT_INLINE]
  0x010e: PHI (r6v1 android.content.Context) = (r6v0 android.content.Context), (r6v4 android.content.Context) binds: [B:51:0x0101, B:18:0x0053] A[DONT_GENERATE, DONT_INLINE]
  0x010e: PHI (r7v1 X.CGz) = (r7v0 X.CGz), (r7v2 X.CGz) binds: [B:51:0x0101, B:18:0x0053] A[DONT_GENERATE, DONT_INLINE]
  0x010e: PHI (r12v6 java.util.Iterator) = (r12v5 java.util.Iterator), (r12v9 java.util.Iterator) binds: [B:51:0x0101, B:18:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a2 A[Catch: all -> 0x01b7, TRY_LEAVE, TryCatch #0 {, blocks: (B:63:0x014f, B:65:0x0155, B:67:0x0163, B:69:0x016b, B:71:0x0173, B:72:0x018c, B:73:0x01a2, B:28:0x006f, B:30:0x007d, B:31:0x0081), top: B:81:0x006f }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0124 -> B:14:0x0044). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x013f -> B:11:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object evaluate(android.content.Context r13, X.AbstractC3358CGz r14, com.facebook.aura.nudge.NudgeSurface r15, X.HtJ<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nudge.ConversationNudgeCoordinator.evaluate(android.content.Context, X.CGz, com.facebook.aura.nudge.NudgeSurface, X.HtJ):java.lang.Object");
    }

    public final boolean onActionTapped(ConversationNudge conversationNudge) {
        C7384Etj.A0Y(conversationNudge, 0);
        synchronized (lock) {
            BLG<NudgeState> blg = mutableState;
            NudgeState value = blg.getValue();
            if (value instanceof NudgeState.Visible) {
                NudgeState.Visible visible = (NudgeState.Visible) value;
                if (C7384Etj.areEqual(visible.nudge.getId(), conversationNudge.getId())) {
                    ConversationNudgeLogging.INSTANCE.logActionTapped(conversationNudge.getId(), SystemClock.elapsedRealtime() - visible.shownAtMs, conversationNudge.logMetadata());
                    INSTANCE.cancelJobs();
                    HtJ htJA14 = C3cI.A14(blg, new NudgeState.AwaitingOutcome(conversationNudge));
                    timerJob = AnonymousClass001.A11(new ConversationNudgeCoordinator$onActionTapped$1$1(conversationNudge, htJA14), scope);
                    return true;
                }
            }
            return false;
        }
    }

    public final void onDismissTapped(ConversationNudge conversationNudge) {
        C7384Etj.A0Y(conversationNudge, 0);
        if (dismiss(conversationNudge, NudgeDismissReason.DISMISS_BUTTON)) {
            notifyDeclined(conversationNudge);
        }
    }

    public final void onShown(ConversationNudge conversationNudge) {
        C7384Etj.A0Y(conversationNudge, 0);
        synchronized (lock) {
            BLG<NudgeState> blg = mutableState;
            NudgeState value = blg.getValue();
            if ((value instanceof NudgeState.Offered) && C7384Etj.areEqual(((NudgeState.Offered) value).nudge.getId(), conversationNudge.getId())) {
                HtJ htJA14 = C3cI.A14(blg, new NudgeState.Visible(conversationNudge, SystemClock.elapsedRealtime()));
                ConversationNudgeLogging.INSTANCE.logShown(conversationNudge.getId(), ConversationNudgeStore.INSTANCE.recordShown(conversationNudge.getId()), conversationNudge.logMetadata());
                INSTANCE.notifyShown(conversationNudge);
                C3UX c3ux = scope;
                ConversationNudgeCoordinator$onShown$1$1 conversationNudgeCoordinator$onShown$1$1 = new ConversationNudgeCoordinator$onShown$1$1(conversationNudge, htJA14);
                C6ys c6ys = C6ys.A00;
                Integer num = C79.A00;
                timerJob = GAo.A02(num, c6ys, conversationNudgeCoordinator$onShown$1$1, c3ux);
                if (conversationNudge.getPolicy().expiry.dismissOnBackground) {
                    backgroundJob = GAo.A02(num, c6ys, new ConversationNudgeCoordinator$onShown$1$2(conversationNudge, htJA14), c3ux);
                }
            }
        }
    }

    static {
        C9286GCn c9286GCnA01 = HnJ.A01(NudgeState.Idle.INSTANCE);
        mutableState = c9286GCnA01;
        state = C3cG.A11(c9286GCnA01);
        C9286GCn c9286GCnA14 = C3cG.A14(0L);
        mutableEvaluationRequests = c9286GCnA14;
        evaluationRequests = C3cG.A11(c9286GCnA14);
        skipLoggedToday = C3cG.A0k();
    }

    private final void cancelJobs() {
        HoC hoC = timerJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        timerJob = null;
        HoC hoC2 = backgroundJob;
        if (hoC2 != null) {
            hoC2.A5w(null);
        }
        backgroundJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean dismiss(ConversationNudge conversationNudge, NudgeDismissReason nudgeDismissReason) {
        synchronized (lock) {
            NudgeState value = mutableState.getValue();
            if (value instanceof NudgeState.Visible) {
                NudgeState.Visible visible = (NudgeState.Visible) value;
                if (C7384Etj.areEqual(visible.nudge.getId(), conversationNudge.getId())) {
                    ConversationNudgeLogging.INSTANCE.logDismissed(conversationNudge.getId(), nudgeDismissReason, SystemClock.elapsedRealtime() - visible.shownAtMs, conversationNudge.logMetadata());
                    INSTANCE.resetToIdle();
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isEligible(com.facebook.aura.nudge.ConversationNudge r6, android.content.Context r7, X.AbstractC3358CGz r8, X.HtJ<? super java.lang.Boolean> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.facebook.aura.nudge.ConversationNudgeCoordinator.C127891
            if (r0 == 0) goto L22
            r4 = r9
            com.facebook.aura.nudge.ConversationNudgeCoordinator$isEligible$1 r4 = (com.facebook.aura.nudge.ConversationNudgeCoordinator.C127891) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L28
            java.lang.Object r6 = r4.L$0
            com.facebook.aura.nudge.ConversationNudge r6 = (com.facebook.aura.nudge.ConversationNudge) r6
            goto L40
        L22:
            com.facebook.aura.nudge.ConversationNudgeCoordinator$isEligible$1 r4 = new com.facebook.aura.nudge.ConversationNudgeCoordinator$isEligible$1
            r4.<init>(r9)
            goto L12
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r3)
            r4.L$0 = r6     // Catch: java.lang.Exception -> L48 java.util.concurrent.CancellationException -> L5e
            r0 = 0
            r4.L$1 = r0     // Catch: java.lang.Exception -> L48 java.util.concurrent.CancellationException -> L5e
            r4.L$2 = r0     // Catch: java.lang.Exception -> L48 java.util.concurrent.CancellationException -> L5e
            r4.label = r1     // Catch: java.lang.Exception -> L48 java.util.concurrent.CancellationException -> L5e
            java.lang.Object r3 = r6.isEligible(r7, r8, r4)     // Catch: java.lang.Exception -> L48 java.util.concurrent.CancellationException -> L5e
            if (r3 != r2) goto L43
            return r2
        L40:
            X.Hwg.A00(r3)     // Catch: java.lang.Exception -> L48 java.util.concurrent.CancellationException -> L5e
        L43:
            boolean r0 = X.AnonymousClass001.A1X(r3)     // Catch: java.lang.Exception -> L48 java.util.concurrent.CancellationException -> L5e
            goto L59
        L48:
            r3 = move-exception
            java.lang.String r0 = r6.getId()
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "ConversationNudges"
            java.lang.String r0 = "Eligibility check failed for nudge=%s"
            X.CFK.A0C(r1, r0, r3, r2)
            r0 = 0
        L59:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L5e:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nudge.ConversationNudgeCoordinator.isEligible(com.facebook.aura.nudge.ConversationNudge, android.content.Context, X.CGz, X.HtJ):java.lang.Object");
    }

    private final void logSkippedOncePerDay(String str, long j, NudgeSkipReason nudgeSkipReason) {
        Long l = skipLoggedDay;
        if (l == null || l.longValue() != j) {
            skipLoggedDay = Long.valueOf(j);
            skipLoggedToday.clear();
        }
        if (skipLoggedToday.add(str)) {
            ConversationNudgeLogging.INSTANCE.logSkipped(str, nudgeSkipReason);
        }
    }

    private final String policyBlocker(ConversationNudge conversationNudge, long j) {
        ConversationNudgeStore conversationNudgeStore = ConversationNudgeStore.INSTANCE;
        if (conversationNudgeStore.isCompleted(conversationNudge.getId())) {
            return "completed";
        }
        if (conversationNudgeStore.showCount(conversationNudge.getId()) >= conversationNudge.getPolicy().maxShows) {
            return "max_shows";
        }
        Long lLastShownDay = conversationNudgeStore.lastShownDay(conversationNudge.getId());
        if (lLastShownDay == null || j - lLastShownDay.longValue() >= conversationNudge.getPolicy().minDaysBetweenShows) {
            return null;
        }
        return "spacing";
    }

    private final void withdraw(NudgeDismissReason nudgeDismissReason) {
        synchronized (lock) {
            withdrawals++;
            NudgeState value = mutableState.getValue();
            if (value instanceof NudgeState.Visible) {
                INSTANCE.dismiss(((NudgeState.Visible) value).nudge, nudgeDismissReason);
            } else if (value instanceof NudgeState.Offered) {
                INSTANCE.resetToIdle();
            } else if (!(value instanceof NudgeState.AwaitingOutcome) && !C7384Etj.areEqual(value, NudgeState.Idle.INSTANCE)) {
                throw C3cG.A0q();
            }
        }
    }

    public final C1BN<Long> getEvaluationRequests() {
        return evaluationRequests;
    }

    public final C1BN<NudgeState> getState() {
        return state;
    }

    public final void onAgentApprovalPending() {
        withdraw(NudgeDismissReason.AGENT_APPROVAL);
    }

    public final void onCardRequestPending() {
        withdraw(NudgeDismissReason.PREEMPTED);
    }

    public final void onInputBlocked() {
        withdraw(NudgeDismissReason.INPUT_BLOCKED);
    }

    public final void onUserMessageSent() {
        withdraw(NudgeDismissReason.MESSAGE_SENT);
    }

    public final void requestEvaluation() {
        Long value;
        BLG<Long> blg = mutableEvaluationRequests;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, Long.valueOf(C3cG.A05(value) + 1)));
    }

    public final void reset() {
        synchronized (lock) {
            withdrawals++;
            ConversationNudgeCoordinator conversationNudgeCoordinator = INSTANCE;
            conversationNudgeCoordinator.resetToIdle();
            ConversationNudgeStore.INSTANCE.clear();
            skipLoggedToday.clear();
            skipLoggedDay = null;
            int[] iArr = {0, 1, 2, 3, 4};
            int i = 0;
            do {
                ConversationNudge conversationNudgeA09 = AnonymousClass801.A09(iArr[i]);
                C7384Etj.A0U(conversationNudgeA09);
                conversationNudgeCoordinator.notifyReset(conversationNudgeA09);
                i++;
            } while (i < 5);
        }
        CFK.A05(TAG, "Nudge state reset");
        requestEvaluation();
    }

    private final void notifyDeclined(ConversationNudge conversationNudge) {
        try {
            conversationNudge.onDeclined();
        } catch (Exception e) {
            CFK.A0C(TAG, "onDeclined failed for nudge=%s", e, conversationNudge.getId());
        }
    }

    private final void notifyReset(ConversationNudge conversationNudge) {
        try {
            conversationNudge.onReset();
        } catch (Exception e) {
            CFK.A0C(TAG, "onReset failed for nudge=%s", e, conversationNudge.getId());
        }
    }

    private final void notifyShown(ConversationNudge conversationNudge) {
        try {
            conversationNudge.onShown();
        } catch (Exception e) {
            CFK.A0C(TAG, "onShown failed for nudge=%s", e, conversationNudge.getId());
        }
    }

    private final void resetToIdle() {
        cancelJobs();
        mutableState.Af8(NudgeState.Idle.INSTANCE);
    }

    public final void onOutcome(ConversationNudge conversationNudge, NudgeOutcome nudgeOutcome) {
        AnonymousClass003.A0u(conversationNudge, nudgeOutcome);
        synchronized (lock) {
            NudgeState value = mutableState.getValue();
            if ((value instanceof NudgeState.AwaitingOutcome) && C7384Etj.areEqual(((NudgeState.AwaitingOutcome) value).nudge.getId(), conversationNudge.getId())) {
                ConversationNudgeLogging.INSTANCE.logOutcome(conversationNudge.getId(), nudgeOutcome, conversationNudge.logMetadata());
                if (nudgeOutcome == NudgeOutcome.COMPLETED && conversationNudge.getPolicy().isCompletionFinal) {
                    ConversationNudgeStore.INSTANCE.recordCompleted(conversationNudge.getId());
                }
                INSTANCE.resetToIdle();
            }
        }
    }
}
