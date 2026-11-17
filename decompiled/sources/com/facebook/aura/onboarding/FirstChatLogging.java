package com.facebook.aura.onboarding;

import X.AIW;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C06H;
import X.C0924AIa;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C60P;
import X.C7384Etj;
import X.C78W;
import X.C8eO;
import X.Ey9;
import X.HoC;
import X.Hxb;
import X.InterfaceC7549F2g;
import android.os.SystemClock;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchEventType;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.onboarding.OnboardingGateDestination;
import com.facebook.aura.qpl.startup.points.HatchStartupPoints;

/* loaded from: classes3.dex */
public final class FirstChatLogging implements InterfaceC7549F2g {
    public static final String COMPONENT = "first_chat";
    public static final Companion Companion = new Companion();
    public static final String EVENT_NAME = "first_chat";
    public static final String KEY_CONNECTION_STATE = "connection_state";
    public static final String KEY_MS_SINCE_GATE = "ms_since_gate";
    public static final String KEY_MS_SINCE_SEND = "ms_since_send";
    public static final String KEY_PHASE = "phase";
    public static final String KEY_RESOLVED_DESTINATION = "resolved_destination";
    public static final long TRACKING_WINDOW_MS = 172800000;
    public boolean hasStarted;
    public final Object lock;
    public final C3UX scope;
    public Session session;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Result {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Result[] $VALUES;
        public static final Result FIRST_SEND;
        public static final Result LEFT_APP;
        public static final Result REPLY_COMPLETED;
        public static final Result REPLY_FAILED;
        public static final Result RETURNED;
        public final String wireValue;

        static {
            Result result = new Result("FIRST_SEND", 0, "first_send");
            FIRST_SEND = result;
            Result result2 = new Result("REPLY_COMPLETED", 1, "reply_completed");
            REPLY_COMPLETED = result2;
            Result result3 = new Result("REPLY_FAILED", 2, "reply_failed");
            REPLY_FAILED = result3;
            Result result4 = new Result("LEFT_APP", 3, "left_app");
            LEFT_APP = result4;
            Result result5 = new Result("RETURNED", 4, "returned");
            RETURNED = result5;
            Result[] resultArr = {result, result2, result3, result4, result5};
            $VALUES = resultArr;
            $ENTRIES = C3cG.A0w(resultArr);
        }

        public static Ey9<Result> getEntries() {
            return $ENTRIES;
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
        }

        public final String getWireValue() {
            return this.wireValue;
        }

        public Result(String str, int i, String str2) {
            this.wireValue = str2;
        }
    }

    public final class Session {
        public final C1BN<HatchGatewayConnectionState> connectionState;
        public final OnboardingGateDestination destination;
        public HoC foregroundJob;
        public final long resolvedAtMs;
        public Long sentAtMs;

        public final C1BN<HatchGatewayConnectionState> getConnectionState() {
            return this.connectionState;
        }

        public final OnboardingGateDestination getDestination() {
            return this.destination;
        }

        public final HoC getForegroundJob() {
            return this.foregroundJob;
        }

        public final long getResolvedAtMs() {
            return this.resolvedAtMs;
        }

        public final Long getSentAtMs() {
            return this.sentAtMs;
        }

        public final void setForegroundJob(HoC hoC) {
            this.foregroundJob = hoC;
        }

        public final void setSentAtMs(Long l) {
            this.sentAtMs = l;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Session(OnboardingGateDestination onboardingGateDestination, C1BN<? extends HatchGatewayConnectionState> c1bn, long j) {
            AnonymousClass003.A0u(onboardingGateDestination, c1bn);
            this.destination = onboardingGateDestination;
            this.connectionState = c1bn;
            this.resolvedAtMs = j;
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Result.values().length];
            try {
                AnonymousClass002.A13(Result.REPLY_COMPLETED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(Result.REPLY_FAILED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(Result.LEFT_APP, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(Result.RETURNED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(Result.FIRST_SEND, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final Session activeSession() {
        Session session = this.session;
        if (session != null) {
            if (SystemClock.elapsedRealtime() - session.resolvedAtMs <= TRACKING_WINDOW_MS) {
                return session;
            }
            end(session);
        }
        return null;
    }

    private final void end(Session session) {
        HoC hoC = session.foregroundJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.session = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onForegroundChanged(boolean z) {
        synchronized (this.lock) {
            Session sessionActiveSession = activeSession();
            if (sessionActiveSession != null) {
                log(sessionActiveSession, z ? Result.RETURNED : Result.LEFT_APP);
            }
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        synchronized (this.lock) {
            this.session = null;
        }
        Hxb.A03(null, this.scope);
    }

    public final void onReplyOutcome(boolean z) {
        synchronized (this.lock) {
            Session sessionActiveSession = activeSession();
            if (sessionActiveSession != null && sessionActiveSession.sentAtMs != null) {
                log(sessionActiveSession, z ? Result.REPLY_COMPLETED : Result.REPLY_FAILED);
                end(sessionActiveSession);
            }
        }
    }

    public final void onUserMessageSent() {
        synchronized (this.lock) {
            Session sessionActiveSession = activeSession();
            if (sessionActiveSession != null && sessionActiveSession.sentAtMs == null) {
                sessionActiveSession.sentAtMs = C3cI.A0O();
                log(sessionActiveSession, Result.FIRST_SEND);
            }
        }
    }

    public final class Companion {
        public final FirstChatLogging getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (FirstChatLogging) abstractC3358CGz.A03(FirstChatLogging.class, FirstChatLogging$Companion$getInstance$1.INSTANCE);
        }

        public final FirstChatLogging getInstanceIfExists(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (FirstChatLogging) abstractC3358CGz.A02(FirstChatLogging.class);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final void log(Session session, Result result) {
        String str;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l = session.sentAtMs;
        HatchAppEventLogger hatchAppEventLogger = HatchAppEventLogger.INSTANCE;
        String value = HatchSurface.CHAT.getValue();
        String value2 = HatchEventType.STATUS_CHECK.getValue();
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put(HatchMetadataKey.RESULT.getValue(), result.getWireValue());
        OnboardingGateDestination onboardingGateDestination = session.destination;
        if (C7384Etj.areEqual(onboardingGateDestination, OnboardingGateDestination.UiFlow.INSTANCE)) {
            str = OnboardingIntroPageKt.ONBOARDING_VARIANT_UI_DRIVEN;
        } else {
            if (!C7384Etj.areEqual(onboardingGateDestination, OnboardingGateDestination.Conversation.INSTANCE)) {
                throw C3cG.A0q();
            }
            str = HatchStartupPoints.CONVERSATION;
        }
        c0924AIaA0u.put("resolved_destination", str);
        c0924AIaA0u.put(KEY_MS_SINCE_GATE, String.valueOf(jElapsedRealtime - session.resolvedAtMs));
        int iOrdinal = result.ordinal();
        if (iOrdinal != 1 && iOrdinal != 2) {
            if (iOrdinal == 3 || iOrdinal == 4) {
                c0924AIaA0u.put("phase", l == null ? "before_send" : "awaiting_reply");
            } else if (iOrdinal != 0) {
                throw C3cG.A0q();
            }
            c0924AIaA0u.put("connection_state", OnboardingGateLogging.INSTANCE.wireValue(session.connectionState.getValue()));
        } else if (l != null) {
            c0924AIaA0u.put(KEY_MS_SINCE_SEND, String.valueOf(jElapsedRealtime - l.longValue()));
        }
        hatchAppEventLogger.logEvent("first_chat", value, null, value2, "first_chat", AIW.A0K(c0924AIaA0u), null);
    }

    public final void onGateResolved(OnboardingGateDestination onboardingGateDestination, C1BN<? extends HatchGatewayConnectionState> c1bn) {
        boolean zA1Y = C60P.A1Y(onboardingGateDestination, c1bn);
        synchronized (this.lock) {
            if (!this.hasStarted) {
                this.hasStarted = zA1Y;
                Session session = new Session(onboardingGateDestination, c1bn, SystemClock.elapsedRealtime());
                session.foregroundJob = AnonymousClass001.A11(new FirstChatLogging$onGateResolved$1$1(this, null), this.scope);
                this.session = session;
            }
        }
    }

    public /* synthetic */ FirstChatLogging(C06H c06h) {
        this();
    }

    public FirstChatLogging() {
        this.lock = C3cG.A0T();
        this.scope = C78W.A05(new C8eO(null), C3cG.A0v());
    }
}
