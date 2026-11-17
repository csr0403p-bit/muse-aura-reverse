package com.facebook.aura.attribution;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BV5;
import X.BV6;
import X.BzK;
import X.C3cG;
import X.C3cH;
import X.C4oT;
import X.C7384Etj;
import X.CZ9;
import X.CZF;
import X.CZI;
import X.CZJ;
import X.Ey9;
import X.G0U;
import X.G0V;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefStore;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefs;
import com.facebook.aura.executors.AuraExecutors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class HatchAttributionReporter {
    public static final long ATTEMPT_BACKOFF_MS = 3600000;
    public static final long DAY_MS = 86400000;
    public static final int DEDUPE_SCHEMA_VERSION = 1;
    public static final String KEY_DEDUPE_SCHEMA_VERSION = "dedupe_schema_version";
    public static final String KEY_FIRST_APP_LAUNCH_PROCESSED = "first_app_launch_processed";
    public static final String KEY_LAST_ATTEMPT_MS = "last_attempt_ms";
    public static final String KEY_LAST_EXISTING_SESSION_FIRE_MS = "last_existing_session_fire_ms";
    public static final String KEY_PENDING_AUTH_EVENT = "pending_auth_event";
    public static final HatchAttributionReporter INSTANCE = new HatchAttributionReporter();
    public static final Set<CZ9> inFlight = C3cG.A0k();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public final class AuthEvent {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ AuthEvent[] $VALUES;
        public static final AuthEvent LOGIN;
        public static final AuthEvent REGISTRATION;

        static {
            AuthEvent authEvent = new AuthEvent("LOGIN", 0);
            LOGIN = authEvent;
            AuthEvent authEvent2 = new AuthEvent("REGISTRATION", 1);
            REGISTRATION = authEvent2;
            AuthEvent[] authEventArr = {authEvent, authEvent2};
            $VALUES = authEventArr;
            $ENTRIES = C3cG.A0w(authEventArr);
        }

        public static Ey9<AuthEvent> getEntries() {
            return $ENTRIES;
        }

        public static AuthEvent valueOf(String str) {
            return (AuthEvent) Enum.valueOf(AuthEvent.class, str);
        }

        public static AuthEvent[] values() {
            return (AuthEvent[]) $VALUES.clone();
        }

        public AuthEvent(String str, int i) {
        }
    }

    /* renamed from: com.facebook.aura.attribution.HatchAttributionReporter$reportSessionStart$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<Boolean, String, Unit> {
        public final /* synthetic */ CZI $debugLogger;
        public final /* synthetic */ List<CZ9> $events;

        /* renamed from: com.facebook.aura.attribution.HatchAttributionReporter$reportSessionStart$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00441 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
            public final /* synthetic */ List<CZ9> $events;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00441(List<? extends CZ9> list) {
                super(1);
                this.$events = list;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(AnonymousClass001.A1X(bool));
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                HatchAttributionReporter.INSTANCE.onSettled(this.$events, z);
            }
        }

        /* renamed from: com.facebook.aura.attribution.HatchAttributionReporter$reportSessionStart$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
            public final /* synthetic */ List<CZ9> $events;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(List<? extends CZ9> list) {
                super(1);
                this.$events = list;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(AnonymousClass001.A1X(bool));
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                HatchAttributionReporter.INSTANCE.onSettled(this.$events, z);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(CZI czi, List<? extends CZ9> list) {
            super(2);
            this.$debugLogger = czi;
            this.$events = list;
        }

        public final void invoke(boolean z, String str) {
            CZF czf = new CZF(new HatchAttributionComplianceActionProvider(new AnonymousClass2(this.$events)), new HatchAttributionDeviceProperties(str), new HatchAttributionEventsClient(this.$debugLogger, new C00441(this.$events)), (ExecutorService) AuraExecutors.lowPriorityExecutor$delegate.getValue(), this.$debugLogger);
            List<CZ9> list = this.$events;
            C7384Etj.A0Y(list, 0);
            czf.A03.execute(new CZJ(list, czf));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, String str) {
            invoke(AnonymousClass001.A1X(bool), str);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void onSettled(List<? extends CZ9> list, boolean z) {
        inFlight.removeAll(AbstractC0878AGe.A0g(list));
        if (z) {
            BzK bzKA02 = BzK.A02(AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.ATTRIBUTION));
            Iterator<? extends CZ9> it = list.iterator();
            while (it.hasNext()) {
                int iOrdinal = it.next().ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    bzKA02.Aae(KEY_PENDING_AUTH_EVENT);
                } else if (iOrdinal == 3) {
                    bzKA02.AYp(KEY_LAST_EXISTING_SESSION_FIRE_MS, System.currentTimeMillis());
                } else if (iOrdinal == 5) {
                    bzKA02.A0A(KEY_FIRST_APP_LAUNCH_PROCESSED, true);
                }
            }
            bzKA02.apply();
        }
    }

    public final synchronized void clearDedupeStateAndReport() {
        BzK bzKA02 = BzK.A02(AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.ATTRIBUTION));
        bzKA02.A08();
        bzKA02.apply();
        inFlight.clear();
        reportSessionStart();
    }

    public final synchronized void recordPendingAuthEvent(AuthEvent authEvent) {
        C7384Etj.A0Y(authEvent, 0);
        reArmIfDedupeSchemaStale();
        BzK bzKA02 = BzK.A02(AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.ATTRIBUTION));
        bzKA02.AYr(KEY_PENDING_AUTH_EVENT, authEvent.name());
        bzKA02.Aae(KEY_LAST_ATTEMPT_MS);
        bzKA02.apply();
    }

    public final synchronized void reportSessionStart() {
        reArmIfDedupeSchemaStale();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AuraDevicePermanentPrefs auraDevicePermanentPrefs = AuraDevicePermanentPrefs.INSTANCE;
        AuraDevicePermanentPrefStore auraDevicePermanentPrefStore = AuraDevicePermanentPrefStore.ATTRIBUTION;
        if (jCurrentTimeMillis - BV5.A08(auraDevicePermanentPrefs.get(auraDevicePermanentPrefStore), KEY_LAST_ATTEMPT_MS) >= 3600000) {
            List<CZ9> listBuildSessionStartEvents = buildSessionStartEvents();
            if (!listBuildSessionStartEvents.isEmpty()) {
                BzK bzKA02 = BzK.A02(auraDevicePermanentPrefs.get(auraDevicePermanentPrefStore));
                bzKA02.AYp(KEY_LAST_ATTEMPT_MS, jCurrentTimeMillis);
                bzKA02.apply();
                inFlight.addAll(listBuildSessionStartEvents);
                CZI czi = new CZI(C3cH.A0I());
                new HatchAdvertisingIdFetcher(C3cG.A06(), (ExecutorService) AuraExecutors.lowPriorityExecutor$delegate.getValue(), czi).fetchAdvertisingIdInfo(new AnonymousClass1(czi, listBuildSessionStartEvents));
            }
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CZ9.values().length];
            try {
                BV6.A1T(iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final C4oT getPrefs() {
        return AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.ATTRIBUTION);
    }

    private final CZ9 peekPendingAuthEvent() {
        String string = AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.ATTRIBUTION).getString(KEY_PENDING_AUTH_EVENT, null);
        if ("LOGIN".equals(string)) {
            return CZ9.A04;
        }
        if ("REGISTRATION".equals(string)) {
            return CZ9.A05;
        }
        return null;
    }

    private final void reArmIfDedupeSchemaStale() {
        AuraDevicePermanentPrefs auraDevicePermanentPrefs = AuraDevicePermanentPrefs.INSTANCE;
        AuraDevicePermanentPrefStore auraDevicePermanentPrefStore = AuraDevicePermanentPrefStore.ATTRIBUTION;
        if (auraDevicePermanentPrefs.get(auraDevicePermanentPrefStore).getInt(KEY_DEDUPE_SCHEMA_VERSION, 0) < 1) {
            BzK bzKA02 = BzK.A02(auraDevicePermanentPrefs.get(auraDevicePermanentPrefStore));
            bzKA02.A08();
            bzKA02.apply();
            BzK bzKA022 = BzK.A02(auraDevicePermanentPrefs.get(auraDevicePermanentPrefStore));
            bzKA022.AYo(KEY_DEDUPE_SCHEMA_VERSION, 1);
            bzKA022.apply();
        }
    }

    private final List<CZ9> buildSessionStartEvents() {
        ArrayList arrayListA0h = C3cG.A0h();
        long jCurrentTimeMillis = System.currentTimeMillis();
        CZ9 cz9PeekPendingAuthEvent = peekPendingAuthEvent();
        if (cz9PeekPendingAuthEvent != null) {
            arrayListA0h.add(cz9PeekPendingAuthEvent);
        } else if (jCurrentTimeMillis - BV5.A08(AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.ATTRIBUTION), KEY_LAST_EXISTING_SESSION_FIRE_MS) >= 86400000) {
            cz9PeekPendingAuthEvent = CZ9.A02;
            arrayListA0h.add(cz9PeekPendingAuthEvent);
        }
        if (!AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.ATTRIBUTION).getBoolean(KEY_FIRST_APP_LAUNCH_PROCESSED, false)) {
            arrayListA0h.add(CZ9.A03);
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!inFlight.contains(next)) {
                arrayListA0h2.add(next);
            }
        }
        return arrayListA0h2;
    }
}
