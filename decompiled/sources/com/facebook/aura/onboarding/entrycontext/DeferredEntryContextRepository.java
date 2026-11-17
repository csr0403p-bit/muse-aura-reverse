package com.facebook.aura.onboarding.entrycontext;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C31u;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import X.HtJ;
import X.HzP;
import X.InterfaceC7359EnW;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchDeferredDeeplinkStore;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.onboarding.entrycontext.MC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class DeferredEntryContextRepository {
    public static final String COMPONENT_ENTRY_CONTEXT_TOKEN = "entry_context_token";
    public static final String EVENT_TOKEN_AVAILABLE = "onboarding_entry_context_token_available";
    public static final String EVENT_TYPE_PRE_SEND_GATE = "pre_send_gate";
    public static final String SURFACE_ONBOARDING = "onboarding";
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(DeferredEntryContextRepository.class, "isEntryContextTokenSendEnabled", "isEntryContextTokenSendEnabled()Z");
    public static final DeferredEntryContextRepository INSTANCE = new DeferredEntryContextRepository();
    public static final C31u isEntryContextTokenSendEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_entry_context_token_send);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class LoggingSubsurface {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ LoggingSubsurface[] $VALUES;
        public static final LoggingSubsurface ONBOARDING_COMPLETE;
        public static final LoggingSubsurface ONBOARDING_PAGES;
        public final String value;

        static {
            LoggingSubsurface loggingSubsurface = new LoggingSubsurface("ONBOARDING_PAGES", 0, "onboarding_pages");
            ONBOARDING_PAGES = loggingSubsurface;
            LoggingSubsurface loggingSubsurface2 = new LoggingSubsurface("ONBOARDING_COMPLETE", 1, "onboarding_complete");
            ONBOARDING_COMPLETE = loggingSubsurface2;
            LoggingSubsurface[] loggingSubsurfaceArr = {loggingSubsurface, loggingSubsurface2};
            $VALUES = loggingSubsurfaceArr;
            $ENTRIES = C3cG.A0w(loggingSubsurfaceArr);
        }

        public static Ey9<LoggingSubsurface> getEntries() {
            return $ENTRIES;
        }

        public static LoggingSubsurface valueOf(String str) {
            return (LoggingSubsurface) Enum.valueOf(LoggingSubsurface.class, str);
        }

        public static LoggingSubsurface[] values() {
            return (LoggingSubsurface[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        public LoggingSubsurface(String str, int i, String str2) {
            this.value = str2;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.onboarding.entrycontext.DeferredEntryContextRepository", f = "DeferredEntryContextRepository.kt", l = {136}, m = "submitPending", v = 2)
    /* renamed from: com.facebook.aura.onboarding.entrycontext.DeferredEntryContextRepository$submitPending$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeferredEntryContextRepository.this.submitPending(null, this);
        }
    }

    public final String applySendGate(String str) {
        if (str == null || !INSTANCE.isEntryContextTokenSendEnabled()) {
            return null;
        }
        return str;
    }

    public final void logPendingTokenAvailable(LoggingSubsurface loggingSubsurface) {
        C7384Etj.A0Y(loggingSubsurface, 0);
        try {
            HatchAppEventLogger.INSTANCE.logEvent(EVENT_TOKEN_AVAILABLE, "onboarding", loggingSubsurface.getValue(), EVENT_TYPE_PRE_SEND_GATE, "entry_context_token", null, null);
        } catch (RuntimeException unused) {
        }
    }

    public final void settleOnboardingPagesResponse(String str, HatchEntryContextStatus hatchEntryContextStatus) {
        HatchEntryContextSettlement settlement;
        int iOrdinal;
        C7384Etj.A0Y(str, 0);
        if (hatchEntryContextStatus == null || (settlement = hatchEntryContextStatus.getSettlement()) == null || (iOrdinal = settlement.ordinal()) == -1) {
            return;
        }
        if (iOrdinal == 0) {
            HatchDeferredDeeplinkStore.INSTANCE.clearIfMatches(str);
        } else if (iOrdinal == 1) {
            HatchDeferredDeeplinkStore.INSTANCE.recordAttemptIfMatches(str);
        } else if (iOrdinal != 2) {
            throw C3cG.A0q();
        }
    }

    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchEntryContextSettlement.values().length];
            try {
                AnonymousClass002.A13(HatchEntryContextSettlement.SETTLED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchEntryContextSettlement.RETRY, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchEntryContextSettlement.CONTRACT_VIOLATION, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean isEntryContextTokenSendEnabled() {
        return C31u.A01(this, isEntryContextTokenSendEnabled$delegate, $$delegatedProperties, 0);
    }

    public final String getPendingToken() {
        return HatchDeferredDeeplinkStore.INSTANCE.getPendingToken(System.currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object submitPending(X.AbstractC3358CGz r26, X.HtJ<? super kotlin.Unit> r27) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.onboarding.entrycontext.DeferredEntryContextRepository.submitPending(X.CGz, X.HtJ):java.lang.Object");
    }
}
