package com.facebook.aura.appreview;

import X.AnonymousClass002;
import X.BV5;
import X.BV7;
import X.BzK;
import X.C22I;
import X.C3Em;
import X.C3cG;
import X.C3cI;
import X.C3pd;
import X.C4oT;
import X.C60O;
import X.C7384Etj;
import X.C79;
import X.C8j3;
import X.C9290GCr;
import X.CFK;
import X.Ey9;
import com.facebook.aura.common.prefs.AuraDevicePrefStore;
import com.facebook.aura.common.prefs.AuraDevicePrefs;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.aura.utils.HatchUtil;

/* loaded from: classes5.dex */
public final class HatchInAppReviewTrigger {
    public static final int $stable = 0;
    public static final String KEY_AGENT_MESSAGES = "agent_messages";
    public static final String KEY_CREATED_GOALS = "created_goals";
    public static final String KEY_CREATED_IDEAS = "created_ideas";
    public static final String KEY_DAYS_APP_USED = "days_app_used";
    public static final String KEY_FEED_LIKES = "feed_likes";
    public static final String KEY_LAST_DAY_APP_USED = "last_day_app_used";
    public static final String KEY_LAST_REVIEW_ATTEMPT_MS = "last_review_attempt_ms";
    public static final String KEY_USER_MESSAGES = "user_messages";
    public static final long MILLIS_PER_DAY = 86400000;
    public static final long REPLY_FAILURE_BLOCK_MS = 3600000;
    public static final String TAG = "HatchInAppReview";
    public static volatile Long lastReplyFailureElapsedMs;
    public static final C3Em<TriggerSource> mutableRequests;
    public static final C22I<TriggerSource> requests;
    public static final HatchInAppReviewTrigger INSTANCE = new HatchInAppReviewTrigger();
    public static final Object lock = C3cG.A0T();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class TriggerSource {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ TriggerSource[] $VALUES;
        public static final TriggerSource CONVERSATION_MESSAGES;
        public static final TriggerSource FEED_LIKES;
        public static final TriggerSource GOAL_CREATION_REQUESTED;
        public static final TriggerSource IDEA_CREATED;
        public final String analyticsValue;
        public final String surface;

        static {
            TriggerSource triggerSource = new TriggerSource("CONVERSATION_MESSAGES", 0, "conversation_messages", "chat");
            CONVERSATION_MESSAGES = triggerSource;
            TriggerSource triggerSource2 = new TriggerSource("FEED_LIKES", 1, HatchInAppReviewTrigger.KEY_FEED_LIKES, "feed");
            FEED_LIKES = triggerSource2;
            TriggerSource triggerSource3 = new TriggerSource("IDEA_CREATED", 2, "idea_created", "ideas");
            IDEA_CREATED = triggerSource3;
            TriggerSource triggerSource4 = new TriggerSource("GOAL_CREATION_REQUESTED", 3, "goal_creation_requested", "goals");
            GOAL_CREATION_REQUESTED = triggerSource4;
            TriggerSource[] triggerSourceArr = {triggerSource, triggerSource2, triggerSource3, triggerSource4};
            $VALUES = triggerSourceArr;
            $ENTRIES = C3cG.A0w(triggerSourceArr);
        }

        public static Ey9<TriggerSource> getEntries() {
            return $ENTRIES;
        }

        public static TriggerSource valueOf(String str) {
            return (TriggerSource) Enum.valueOf(TriggerSource.class, str);
        }

        public static TriggerSource[] values() {
            return (TriggerSource[]) $VALUES.clone();
        }

        public final String getAnalyticsValue() {
            return this.analyticsValue;
        }

        public final String getSurface() {
            return this.surface;
        }

        public TriggerSource(String str, int i, String str2, String str3) {
            this.analyticsValue = str2;
            this.surface = str3;
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TriggerSource.values().length];
            try {
                AnonymousClass002.A13(TriggerSource.CONVERSATION_MESSAGES, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(TriggerSource.FEED_LIKES, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(TriggerSource.IDEA_CREATED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(TriggerSource.GOAL_CREATION_REQUESTED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        C9290GCr c9290GCr = new C9290GCr(C79.A00, 0, 8);
        mutableRequests = c9290GCr;
        requests = new C3pd(c9290GCr);
    }

    private final boolean hasRecentReplyFailure() {
        Long l = lastReplyFailureElapsedMs;
        return l != null && C3cG.A04(l.longValue()) < 3600000;
    }

    private final boolean hasUsedAppEnoughDays() {
        return C8j3.A1Q((BV5.A08(AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.REVIEWS), KEY_DAYS_APP_USED) > HatchUtil.INSTANCE.inAppReviewMinAppDays() ? 1 : (BV5.A08(AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.REVIEWS), KEY_DAYS_APP_USED) == HatchUtil.INSTANCE.inAppReviewMinAppDays() ? 0 : -1)));
    }

    private final boolean isCooldownActive() {
        long j = AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.REVIEWS).getLong(KEY_LAST_REVIEW_ATTEMPT_MS, 0L);
        return j != 0 && System.currentTimeMillis() - j < HatchUtil.INSTANCE.inAppReviewCooldownMs();
    }

    private final void record(TriggerSource triggerSource, String str) {
        boolean z;
        synchronized (lock) {
            HatchInAppReviewTrigger hatchInAppReviewTrigger = INSTANCE;
            z = false;
            if (hatchInAppReviewTrigger.canRecord(triggerSource)) {
                C4oT c4oT = AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.REVIEWS);
                long jA08 = BV5.A08(c4oT, str) + 1;
                BzK bzKA02 = BzK.A02(c4oT);
                bzKA02.AYp(str, jA08);
                bzKA02.apply();
                if (jA08 >= hatchInAppReviewTrigger.thresholdFor(triggerSource)) {
                    z = true;
                }
            }
        }
        if (z) {
            mutableRequests.AhV(triggerSource);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void recordConversationMessage(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.Object r10 = com.facebook.aura.appreview.HatchInAppReviewTrigger.lock
            monitor-enter(r10)
            com.facebook.aura.appreview.HatchInAppReviewTrigger r5 = com.facebook.aura.appreview.HatchInAppReviewTrigger.INSTANCE     // Catch: java.lang.Throwable -> L54
            com.facebook.aura.appreview.HatchInAppReviewTrigger$TriggerSource r6 = com.facebook.aura.appreview.HatchInAppReviewTrigger.TriggerSource.CONVERSATION_MESSAGES     // Catch: java.lang.Throwable -> L54
            boolean r0 = r5.canRecord(r6)     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L42
            com.facebook.aura.common.prefs.AuraDevicePrefs r1 = com.facebook.aura.common.prefs.AuraDevicePrefs.INSTANCE     // Catch: java.lang.Throwable -> L54
            com.facebook.aura.common.prefs.AuraDevicePrefStore r0 = com.facebook.aura.common.prefs.AuraDevicePrefStore.REVIEWS     // Catch: java.lang.Throwable -> L54
            X.4oT r9 = r1.get(r0)     // Catch: java.lang.Throwable -> L54
            r1 = 0
            long r3 = r9.getLong(r11, r1)     // Catch: java.lang.Throwable -> L54
            r7 = 1
            long r3 = r3 + r7
            X.BzK r0 = X.BzK.A02(r9)     // Catch: java.lang.Throwable -> L54
            r0.AYp(r11, r3)     // Catch: java.lang.Throwable -> L54
            r0.apply()     // Catch: java.lang.Throwable -> L54
            long r7 = r5.thresholdFor(r6)     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = "user_messages"
            long r4 = r9.getLong(r0, r1)     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = "agent_messages"
            long r2 = r9.getLong(r0, r1)     // Catch: java.lang.Throwable -> L54
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 < 0) goto L42
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r0 = 1
            if (r1 >= 0) goto L43
        L42:
            r0 = 0
        L43:
            monitor-exit(r10)
            if (r0 == 0) goto L53
            java.lang.String r0 = "agent_messages"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L53
            X.3Em<com.facebook.aura.appreview.HatchInAppReviewTrigger$TriggerSource> r0 = com.facebook.aura.appreview.HatchInAppReviewTrigger.mutableRequests
            r0.AhV(r6)
        L53:
            return
        L54:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.appreview.HatchInAppReviewTrigger.recordConversationMessage(java.lang.String):void");
    }

    public final Long getLastReplyFailureElapsedMs$fbandroid_express_aura_java_com_facebook_aura_appreview_appreview() {
        return lastReplyFailureElapsedMs;
    }

    public final C22I<TriggerSource> getRequests$fbandroid_express_aura_java_com_facebook_aura_appreview_appreview() {
        return requests;
    }

    public final void onAppOpened() {
        synchronized (lock) {
            if (HatchUtil.INSTANCE.isInAppReviewEnabled()) {
                C4oT c4oT = AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.REVIEWS);
                long jCurrentTimeMillis = System.currentTimeMillis() / 86400000;
                if (c4oT.getLong(KEY_LAST_DAY_APP_USED, 0L) == jCurrentTimeMillis) {
                    c4oT.getLong(KEY_DAYS_APP_USED, 0L);
                } else {
                    long j = c4oT.getLong(KEY_DAYS_APP_USED, 0L) + 1;
                    BzK bzKA02 = BzK.A02(c4oT);
                    bzKA02.AYp(KEY_LAST_DAY_APP_USED, jCurrentTimeMillis);
                    bzKA02.AYp(KEY_DAYS_APP_USED, j);
                    bzKA02.apply();
                }
            }
        }
    }

    public final void onFeedLiked() {
        record(TriggerSource.FEED_LIKES, KEY_FEED_LIKES);
    }

    public final void onGoalCreationRequested() {
        record(TriggerSource.GOAL_CREATION_REQUESTED, KEY_CREATED_GOALS);
    }

    public final void onIdeaCreated() {
        record(TriggerSource.IDEA_CREATED, KEY_CREATED_IDEAS);
    }

    public final void onSuccessfulAgentResponse$fbandroid_express_aura_java_com_facebook_aura_appreview_appreview() {
        recordConversationMessage(KEY_AGENT_MESSAGES);
    }

    public final void recordLaunchAttempt$fbandroid_express_aura_java_com_facebook_aura_appreview_appreview() {
        synchronized (lock) {
            BzK bzKA02 = BzK.A02(AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.REVIEWS));
            bzKA02.AYp(KEY_USER_MESSAGES, 0L);
            bzKA02.AYp(KEY_AGENT_MESSAGES, 0L);
            bzKA02.AYp(KEY_FEED_LIKES, 0L);
            bzKA02.AYp(KEY_CREATED_IDEAS, 0L);
            bzKA02.AYp(KEY_CREATED_GOALS, 0L);
            bzKA02.AYp(KEY_LAST_REVIEW_ATTEMPT_MS, System.currentTimeMillis());
            bzKA02.apply();
        }
    }

    private final boolean canRecord(TriggerSource triggerSource) {
        return !isCooldownActive() && HatchUtil.INSTANCE.isInAppReviewEnabled() && hasUsedAppEnoughDays();
    }

    private final long thresholdFor(TriggerSource triggerSource) {
        int iOrdinal = triggerSource.ordinal();
        if (iOrdinal == 0) {
            return HatchUtil.INSTANCE.inAppReviewResponseCount();
        }
        if (iOrdinal == 1) {
            return HatchUtil.INSTANCE.inAppReviewFeedLikeCount();
        }
        if (iOrdinal == 2) {
            return HatchUtil.INSTANCE.inAppReviewIdeaCount();
        }
        if (iOrdinal == 3) {
            return HatchUtil.INSTANCE.inAppReviewGoalCount();
        }
        throw C3cG.A0q();
    }

    public final void onReplyFailed$fbandroid_express_aura_java_com_facebook_aura_appreview_appreview() {
        lastReplyFailureElapsedMs = C3cI.A0O();
    }

    public final void onUserMessageSent$fbandroid_express_aura_java_com_facebook_aura_appreview_appreview() {
        recordConversationMessage(KEY_USER_MESSAGES);
    }

    public final boolean shouldRequestReview$fbandroid_express_aura_java_com_facebook_aura_appreview_appreview(TriggerSource triggerSource) {
        boolean z;
        String strA0z;
        boolean zEquals;
        C7384Etj.A0Y(triggerSource, 0);
        synchronized (lock) {
            C4oT c4oT = AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.REVIEWS);
            HatchInAppReviewTrigger hatchInAppReviewTrigger = INSTANCE;
            long jThresholdFor = hatchInAppReviewTrigger.thresholdFor(triggerSource);
            int iOrdinal = triggerSource.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    if (c4oT.getLong(KEY_FEED_LIKES, 0L) >= jThresholdFor) {
                    }
                } else if (iOrdinal == 2) {
                    if (c4oT.getLong(KEY_CREATED_IDEAS, 0L) >= jThresholdFor) {
                    }
                } else {
                    if (iOrdinal != 3) {
                        throw C3cG.A0q();
                    }
                    z = c4oT.getLong(KEY_CREATED_GOALS, 0L) >= jThresholdFor;
                }
            } else if (c4oT.getLong(KEY_USER_MESSAGES, 0L) < jThresholdFor || c4oT.getLong(KEY_AGENT_MESSAGES, 0L) < jThresholdFor) {
            }
            if (iOrdinal == 0) {
                long j = c4oT.getLong(KEY_USER_MESSAGES, 0L);
                long j2 = c4oT.getLong(KEY_AGENT_MESSAGES, 0L);
                StringBuilder sbA0z = C60O.A0z("user=", j);
                sbA0z.append(CustomConnectorRegisterRepositoryKt.ROOT_PATH);
                sbA0z.append(jThresholdFor);
                sbA0z.append(",agent=");
                sbA0z.append(j2);
                strA0z = BV7.A0z(CustomConnectorRegisterRepositoryKt.ROOT_PATH, sbA0z, jThresholdFor);
            } else if (iOrdinal == 1) {
                long j3 = c4oT.getLong(KEY_FEED_LIKES, 0L);
                StringBuilder sbA0g = C3cG.A0g("likes=");
                sbA0g.append(j3);
                strA0z = BV7.A0z(CustomConnectorRegisterRepositoryKt.ROOT_PATH, sbA0g, jThresholdFor);
            } else if (iOrdinal != 2) {
                long j4 = c4oT.getLong(KEY_CREATED_GOALS, 0L);
                StringBuilder sbA0g2 = C3cG.A0g("goals=");
                sbA0g2.append(j4);
                strA0z = BV7.A0z(CustomConnectorRegisterRepositoryKt.ROOT_PATH, sbA0g2, jThresholdFor);
            } else {
                long j5 = c4oT.getLong(KEY_CREATED_IDEAS, 0L);
                StringBuilder sbA0g3 = C3cG.A0g("ideas=");
                sbA0g3.append(j5);
                strA0z = BV7.A0z(CustomConnectorRegisterRepositoryKt.ROOT_PATH, sbA0g3, jThresholdFor);
            }
            String str = !z ? "threshold" : hatchInAppReviewTrigger.isCooldownActive() ? "cooldown" : !HatchUtil.INSTANCE.isInAppReviewEnabled() ? "mobile_config" : !hatchInAppReviewTrigger.hasUsedAppEnoughDays() ? "min_app_days" : hatchInAppReviewTrigger.hasRecentReplyFailure() ? "recent_reply_failure" : "none";
            zEquals = str.equals("none");
            CFK.A00(triggerSource.getAnalyticsValue(), strA0z, str, Boolean.valueOf(zEquals), "HatchInAppReview", "Eligibility trigger=%s progress=%s blocker=%s eligible=%s");
        }
        return zEquals;
    }
}
