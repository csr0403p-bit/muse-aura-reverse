package com.facebook.aura.vmbrowser.runtime;

import X.AGH;
import X.AIW;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C0924AIa;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C7438Evz;
import X.C7BY;
import X.Ey9;
import X.G0V;
import X.G0W;
import X.HxE;
import android.os.SystemClock;
import com.facebook.aura.activation.model.HatchReTosViewModelKt;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchAppEventLoggingContext;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;
import com.facebook.aura.notifications.push.HatchChatNotificationIds;
import com.facebook.aura.vmbrowser.runtime.BrowserClipboardTelemetry;
import java.util.IdentityHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class BrowserClipboardTelemetry {
    public static final int $stable = 8;
    public boolean appBackgroundedSinceEpisode;
    public boolean applicationForeground;
    public final Function0<Long> clock;
    public final Function0<HatchAppEventLoggingContext> contextProvider;
    public boolean controlsExposed;
    public Object currentOwner;
    public String currentTaskId;
    public Episode episode;
    public final G0W<EventKind, Map<String, String>, HatchAppEventLoggingContext, Unit> eventSink;
    public boolean hasOpenedBrowser;
    public final Function0<String> identifier;
    public final IdentityHashMap<Object, String> mountedControls;
    public boolean overlayVisible;
    public boolean overlayWasVisibleWhenBackgrounded;
    public Long pendingAppReturnStartedAtMs;
    public String previousTaskId;

    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserClipboardTelemetry$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements Function0<Long> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0, SystemClock.class, "elapsedRealtime", "elapsedRealtime()J", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return C3cI.A0O();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return C3cI.A0O();
        }
    }

    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserClipboardTelemetry$3, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass3 extends C7438Evz implements Function0<HatchAppEventLoggingContext> {
        public AnonymousClass3(Object obj) {
            super(0, obj, HatchAppEventLogger.class, "captureContext", "captureContext()Lcom/facebook/aura/analytics/hatch/HatchAppEventLoggingContext;", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final HatchAppEventLoggingContext invoke() {
            return ((HatchAppEventLogger) this.receiver).captureContext();
        }
    }

    public final class Attempt {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final HatchAppEventLoggingContext context;
        public boolean hasTerminal;
        public final String id;
        public final Map<String, String> metadata;
        public volatile boolean remoteDispatched;
        public final long startedAtMs;

        public final class Companion {
            public final Attempt create(String str, long j, Map<String, String> map, HatchAppEventLoggingContext hatchAppEventLoggingContext) {
                AnonymousClass003.A0v(str, map);
                return new Attempt(str, j, map, hatchAppEventLoggingContext);
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public final HatchAppEventLoggingContext getContext$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime() {
            return this.context;
        }

        public final boolean getHasTerminal$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime() {
            return this.hasTerminal;
        }

        public final String getId$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime() {
            return this.id;
        }

        public final Map<String, String> getMetadata$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime() {
            return this.metadata;
        }

        public final boolean getRemoteDispatched$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime() {
            return this.remoteDispatched;
        }

        public final long getStartedAtMs$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime() {
            return this.startedAtMs;
        }

        public final void setHasTerminal$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime(boolean z) {
            this.hasTerminal = z;
        }

        public final void setRemoteDispatched$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime(boolean z) {
            this.remoteDispatched = z;
        }

        public Attempt(String str, long j, Map<String, String> map, HatchAppEventLoggingContext hatchAppEventLoggingContext) {
            this.id = str;
            this.startedAtMs = j;
            this.metadata = map;
            this.context = hatchAppEventLoggingContext;
        }

        public /* synthetic */ Attempt(String str, long j, Map map, HatchAppEventLoggingContext hatchAppEventLoggingContext, C06H c06h) {
            this(str, j, map, hatchAppEventLoggingContext);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ClosedReason {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ ClosedReason[] $VALUES;
        public static final ClosedReason ACKNOWLEDGEMENT_UNKNOWN;
        public static final ClosedReason ACTION_IN_PROGRESS;
        public static final ClosedReason CLIPBOARD_EMPTY;
        public static final ClosedReason CLIPBOARD_READ_FAILED;
        public static final ClosedReason CLIPBOARD_WRITE_FAILED;
        public static final ClosedReason CONTENT_UNAVAILABLE;
        public static final ClosedReason CONTEXT_CHANGED;
        public static final ClosedReason CONTROLS_UNAVAILABLE;
        public static final ClosedReason COPY_COMPLETED;
        public static final ClosedReason INVALID_LOCAL_PAYLOAD;
        public static final ClosedReason INVALID_REMOTE_PAYLOAD;
        public static final ClosedReason PASTE_ACKNOWLEDGED;
        public static final ClosedReason PASTE_UNAVAILABLE;
        public static final ClosedReason TRANSPORT_NOT_READY;
        public final String value;

        static {
            ClosedReason closedReason = new ClosedReason("CONTROLS_UNAVAILABLE", 0, "controls_unavailable");
            CONTROLS_UNAVAILABLE = closedReason;
            ClosedReason closedReason2 = new ClosedReason("ACTION_IN_PROGRESS", 1, "action_in_progress");
            ACTION_IN_PROGRESS = closedReason2;
            ClosedReason closedReason3 = new ClosedReason("TRANSPORT_NOT_READY", 2, "transport_not_ready");
            TRANSPORT_NOT_READY = closedReason3;
            ClosedReason closedReason4 = new ClosedReason("INVALID_REMOTE_PAYLOAD", 3, "invalid_remote_payload");
            INVALID_REMOTE_PAYLOAD = closedReason4;
            ClosedReason closedReason5 = new ClosedReason("CONTENT_UNAVAILABLE", 4, "content_unavailable");
            CONTENT_UNAVAILABLE = closedReason5;
            ClosedReason closedReason6 = new ClosedReason("COPY_COMPLETED", 5, "copy_completed");
            COPY_COMPLETED = closedReason6;
            ClosedReason closedReason7 = new ClosedReason("CLIPBOARD_WRITE_FAILED", 6, "clipboard_write_failed");
            CLIPBOARD_WRITE_FAILED = closedReason7;
            ClosedReason closedReason8 = new ClosedReason("CLIPBOARD_EMPTY", 7, "clipboard_empty");
            CLIPBOARD_EMPTY = closedReason8;
            ClosedReason closedReason9 = new ClosedReason("INVALID_LOCAL_PAYLOAD", 8, "invalid_local_payload");
            INVALID_LOCAL_PAYLOAD = closedReason9;
            ClosedReason closedReason10 = new ClosedReason("CLIPBOARD_READ_FAILED", 9, "clipboard_read_failed");
            CLIPBOARD_READ_FAILED = closedReason10;
            ClosedReason closedReason11 = new ClosedReason("PASTE_ACKNOWLEDGED", 10, "paste_acknowledged");
            PASTE_ACKNOWLEDGED = closedReason11;
            ClosedReason closedReason12 = new ClosedReason("PASTE_UNAVAILABLE", 11, "paste_unavailable");
            PASTE_UNAVAILABLE = closedReason12;
            ClosedReason closedReason13 = new ClosedReason("ACKNOWLEDGEMENT_UNKNOWN", 12, "acknowledgement_unknown");
            ACKNOWLEDGEMENT_UNKNOWN = closedReason13;
            ClosedReason closedReason14 = new ClosedReason("CONTEXT_CHANGED", 13, "context_changed");
            CONTEXT_CHANGED = closedReason14;
            ClosedReason[] closedReasonArr = {closedReason, closedReason2, closedReason3, closedReason4, closedReason5, closedReason6, closedReason7, closedReason8, closedReason9, closedReason10, closedReason11, closedReason12, closedReason13, closedReason14};
            $VALUES = closedReasonArr;
            $ENTRIES = C3cG.A0w(closedReasonArr);
        }

        public static Ey9<ClosedReason> getEntries() {
            return $ENTRIES;
        }

        public static ClosedReason valueOf(String str) {
            return (ClosedReason) Enum.valueOf(ClosedReason.class, str);
        }

        public static ClosedReason[] values() {
            return (ClosedReason[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        public ClosedReason(String str, int i, String str2) {
            this.value = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Direction {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Direction[] $VALUES;
        public static final Direction COPY_TO_DEVICE;
        public static final Direction PASTE_FROM_DEVICE;
        public final String value;

        static {
            Direction direction = new Direction("COPY_TO_DEVICE", 0, "copy_to_device");
            COPY_TO_DEVICE = direction;
            Direction direction2 = new Direction("PASTE_FROM_DEVICE", 1, "paste_from_device");
            PASTE_FROM_DEVICE = direction2;
            Direction[] directionArr = {direction, direction2};
            $VALUES = directionArr;
            $ENTRIES = C3cG.A0w(directionArr);
        }

        public static Ey9<Direction> getEntries() {
            return $ENTRIES;
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        public Direction(String str, int i, String str2) {
            this.value = str2;
        }
    }

    public final class Episode {
        public int combinedOrdinal;
        public int copyOrdinal;
        public boolean exposureLogged;
        public final String id;
        public int pasteOrdinal;
        public final EpisodeReason reason;
        public final long startedAtMs;
        public final String taskId;

        public static /* synthetic */ Episode copy$default(Episode episode, String str, EpisodeReason episodeReason, long j, String str2, int i, int i2, int i3, boolean z, int i4, Object obj) {
            String str3 = str;
            EpisodeReason episodeReason2 = episodeReason;
            long j2 = j;
            String str4 = str2;
            int i5 = i;
            int i6 = i2;
            int i7 = i3;
            boolean z2 = z;
            if ((i4 & 1) != 0) {
                str3 = episode.id;
            }
            if ((i4 & 2) != 0) {
                episodeReason2 = episode.reason;
            }
            if ((i4 & 4) != 0) {
                j2 = episode.startedAtMs;
            }
            if ((i4 & 8) != 0) {
                str4 = episode.taskId;
            }
            if ((i4 & 16) != 0) {
                i5 = episode.combinedOrdinal;
            }
            if ((i4 & 32) != 0) {
                i6 = episode.copyOrdinal;
            }
            if ((i4 & 64) != 0) {
                i7 = episode.pasteOrdinal;
            }
            if ((i4 & 128) != 0) {
                z2 = episode.exposureLogged;
            }
            AnonymousClass005.A0y(str3, episodeReason2, str4);
            return new Episode(str3, episodeReason2, j2, str4, i5, i6, i7, z2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Episode) {
                    Episode episode = (Episode) obj;
                    if (!C7384Etj.areEqual(this.id, episode.id) || this.reason != episode.reason || this.startedAtMs != episode.startedAtMs || !C7384Etj.areEqual(this.taskId, episode.taskId) || this.combinedOrdinal != episode.combinedOrdinal || this.copyOrdinal != episode.copyOrdinal || this.pasteOrdinal != episode.pasteOrdinal || this.exposureLogged != episode.exposureLogged) {
                    }
                }
                return false;
            }
            return true;
        }

        public /* synthetic */ Episode(String str, EpisodeReason episodeReason, long j, String str2, int i, int i2, int i3, boolean z, int i4, C06H c06h) {
            this(str, episodeReason, j, str2, (i4 & 16) != 0 ? 0 : i, (i4 & 32) != 0 ? 0 : i2, (i4 & 64) != 0 ? 0 : i3, C3cH.A1N(i4, z));
        }

        public final String component1() {
            return this.id;
        }

        public final EpisodeReason component2() {
            return this.reason;
        }

        public final long component3() {
            return this.startedAtMs;
        }

        public final String component4() {
            return this.taskId;
        }

        public final int component5() {
            return this.combinedOrdinal;
        }

        public final int component6() {
            return this.copyOrdinal;
        }

        public final int component7() {
            return this.pasteOrdinal;
        }

        public final boolean component8() {
            return this.exposureLogged;
        }

        public final int getCombinedOrdinal() {
            return this.combinedOrdinal;
        }

        public final int getCopyOrdinal() {
            return this.copyOrdinal;
        }

        public final boolean getExposureLogged() {
            return this.exposureLogged;
        }

        public final String getId() {
            return this.id;
        }

        public final int getPasteOrdinal() {
            return this.pasteOrdinal;
        }

        public final EpisodeReason getReason() {
            return this.reason;
        }

        public final long getStartedAtMs() {
            return this.startedAtMs;
        }

        public final String getTaskId() {
            return this.taskId;
        }

        public int hashCode() {
            return C0KA.A00((((((AnonymousClass005.A0I(this.taskId, AnonymousClass006.A05(this.startedAtMs, AnonymousClass005.A0F(this.reason, AnonymousClass001.A0G(this.id))) * 31) + this.combinedOrdinal) * 31) + this.copyOrdinal) * 31) + this.pasteOrdinal) * 31, this.exposureLogged);
        }

        public final void setCombinedOrdinal(int i) {
            this.combinedOrdinal = i;
        }

        public final void setCopyOrdinal(int i) {
            this.copyOrdinal = i;
        }

        public final void setExposureLogged(boolean z) {
            this.exposureLogged = z;
        }

        public final void setPasteOrdinal(int i) {
            this.pasteOrdinal = i;
        }

        public String toString() {
            String str = this.id;
            EpisodeReason episodeReason = this.reason;
            long j = this.startedAtMs;
            String str2 = this.taskId;
            int i = this.combinedOrdinal;
            int i2 = this.copyOrdinal;
            int i3 = this.pasteOrdinal;
            boolean z = this.exposureLogged;
            StringBuilder sbA0x = C3cI.A0x("Episode(id=", str);
            sbA0x.append(", reason=");
            sbA0x.append(episodeReason);
            sbA0x.append(", startedAtMs=");
            sbA0x.append(j);
            sbA0x.append(", taskId=");
            sbA0x.append(str2);
            sbA0x.append(", combinedOrdinal=");
            sbA0x.append(i);
            sbA0x.append(", copyOrdinal=");
            sbA0x.append(i2);
            sbA0x.append(", pasteOrdinal=");
            sbA0x.append(i3);
            sbA0x.append(", exposureLogged=");
            sbA0x.append(z);
            return AnonymousClass001.A0v(")", sbA0x);
        }

        public final Episode copy(String str, EpisodeReason episodeReason, long j, String str2, int i, int i2, int i3, boolean z) {
            AnonymousClass005.A0y(str, episodeReason, str2);
            return new Episode(str, episodeReason, j, str2, i, i2, i3, z);
        }

        public Episode(String str, EpisodeReason episodeReason, long j, String str2, int i, int i2, int i3, boolean z) {
            AnonymousClass005.A0y(str, episodeReason, str2);
            this.id = str;
            this.reason = episodeReason;
            this.startedAtMs = j;
            this.taskId = str2;
            this.combinedOrdinal = i;
            this.copyOrdinal = i2;
            this.pasteOrdinal = i3;
            this.exposureLogged = z;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class EpisodeReason {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ EpisodeReason[] $VALUES;
        public static final EpisodeReason APP_RETURN;
        public static final EpisodeReason BROWSER_OPENED;
        public static final EpisodeReason BROWSER_REOPENED;
        public static final EpisodeReason TASK_SWITCH;
        public final String value;

        static {
            EpisodeReason episodeReason = new EpisodeReason("BROWSER_OPENED", 0, "browser_opened");
            BROWSER_OPENED = episodeReason;
            EpisodeReason episodeReason2 = new EpisodeReason("APP_RETURN", 1, "app_return");
            APP_RETURN = episodeReason2;
            EpisodeReason episodeReason3 = new EpisodeReason("BROWSER_REOPENED", 2, "browser_reopened");
            BROWSER_REOPENED = episodeReason3;
            EpisodeReason episodeReason4 = new EpisodeReason("TASK_SWITCH", 3, "task_switch");
            TASK_SWITCH = episodeReason4;
            EpisodeReason[] episodeReasonArr = {episodeReason, episodeReason2, episodeReason3, episodeReason4};
            $VALUES = episodeReasonArr;
            $ENTRIES = C3cG.A0w(episodeReasonArr);
        }

        public static Ey9<EpisodeReason> getEntries() {
            return $ENTRIES;
        }

        public static EpisodeReason valueOf(String str) {
            return (EpisodeReason) Enum.valueOf(EpisodeReason.class, str);
        }

        public static EpisodeReason[] values() {
            return (EpisodeReason[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        public EpisodeReason(String str, int i, String str2) {
            this.value = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class EventKind {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ EventKind[] $VALUES;
        public static final EventKind CONTROLS_EXPOSED;
        public static final EventKind TRANSFER_STARTED;
        public static final EventKind TRANSFER_TERMINAL;

        static {
            EventKind eventKind = new EventKind("CONTROLS_EXPOSED", 0);
            CONTROLS_EXPOSED = eventKind;
            EventKind eventKind2 = new EventKind("TRANSFER_STARTED", 1);
            TRANSFER_STARTED = eventKind2;
            EventKind eventKind3 = new EventKind("TRANSFER_TERMINAL", 2);
            TRANSFER_TERMINAL = eventKind3;
            EventKind[] eventKindArr = {eventKind, eventKind2, eventKind3};
            $VALUES = eventKindArr;
            $ENTRIES = C3cG.A0w(eventKindArr);
        }

        public static Ey9<EventKind> getEntries() {
            return $ENTRIES;
        }

        public static EventKind valueOf(String str) {
            return (EventKind) Enum.valueOf(EventKind.class, str);
        }

        public static EventKind[] values() {
            return (EventKind[]) $VALUES.clone();
        }

        public EventKind(String str, int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Outcome {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Outcome[] $VALUES;
        public static final Outcome BLOCKED;
        public static final Outcome CANCELLED;
        public static final Outcome FAILED;
        public static final Outcome OUTCOME_UNKNOWN;
        public static final Outcome SUCCESS;
        public final String value;

        static {
            Outcome outcome = new Outcome("SUCCESS", 0, "success");
            SUCCESS = outcome;
            Outcome outcome2 = new Outcome(CvmMigrationStatusJson.STAGE_FAILED, 1, "failed");
            FAILED = outcome2;
            Outcome outcome3 = new Outcome("BLOCKED", 2, "blocked");
            BLOCKED = outcome3;
            Outcome outcome4 = new Outcome("CANCELLED", 3, "cancelled");
            CANCELLED = outcome4;
            Outcome outcome5 = new Outcome("OUTCOME_UNKNOWN", 4, "outcome_unknown");
            OUTCOME_UNKNOWN = outcome5;
            Outcome[] outcomeArr = {outcome, outcome2, outcome3, outcome4, outcome5};
            $VALUES = outcomeArr;
            $ENTRIES = C3cG.A0w(outcomeArr);
        }

        public static Ey9<Outcome> getEntries() {
            return $ENTRIES;
        }

        public static Outcome valueOf(String str) {
            return (Outcome) Enum.valueOf(Outcome.class, str);
        }

        public static Outcome[] values() {
            return (Outcome[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        public Outcome(String str, int i, String str2) {
            this.value = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Stage {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Stage[] $VALUES;
        public static final Stage ACCEPTED;
        public static final Stage LOCAL_CLIPBOARD_READ;
        public static final Stage LOCAL_CLIPBOARD_WRITE;
        public static final Stage READINESS_CHECK;
        public static final Stage REMOTE_ACKNOWLEDGEMENT;
        public static final Stage REMOTE_DISPATCH;
        public static final Stage REMOTE_RESPONSE;
        public final String value;

        static {
            Stage stage = new Stage("ACCEPTED", 0, HatchReTosViewModelKt.RESULT_ACCEPTED);
            ACCEPTED = stage;
            Stage stage2 = new Stage("READINESS_CHECK", 1, "readiness_check");
            READINESS_CHECK = stage2;
            Stage stage3 = new Stage("LOCAL_CLIPBOARD_READ", 2, "local_clipboard_read");
            LOCAL_CLIPBOARD_READ = stage3;
            Stage stage4 = new Stage("REMOTE_RESPONSE", 3, "remote_response");
            REMOTE_RESPONSE = stage4;
            Stage stage5 = new Stage("REMOTE_DISPATCH", 4, "remote_dispatch");
            REMOTE_DISPATCH = stage5;
            Stage stage6 = new Stage("REMOTE_ACKNOWLEDGEMENT", 5, "remote_acknowledgement");
            REMOTE_ACKNOWLEDGEMENT = stage6;
            Stage stage7 = new Stage("LOCAL_CLIPBOARD_WRITE", 6, "local_clipboard_write");
            LOCAL_CLIPBOARD_WRITE = stage7;
            Stage[] stageArr = {stage, stage2, stage3, stage4, stage5, stage6, stage7};
            $VALUES = stageArr;
            $ENTRIES = C3cG.A0w(stageArr);
        }

        public static Ey9<Stage> getEntries() {
            return $ENTRIES;
        }

        public static Stage valueOf(String str) {
            return (Stage) Enum.valueOf(Stage.class, str);
        }

        public static Stage[] values() {
            return (Stage[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        public Stage(String str, int i, String str2) {
            this.value = str2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrowserClipboardTelemetry(boolean z, Function0<Long> function0, Function0<String> function02, final G0V<? super EventKind, ? super Map<String, String>, Unit> g0v) {
        this(function0, function02, (Function0<HatchAppEventLoggingContext>) new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserClipboardTelemetry$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return null;
            }
        }, (G0W<? super EventKind, ? super Map<String, String>, ? super HatchAppEventLoggingContext, Unit>) new G0W() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserClipboardTelemetry$$ExternalSyntheticLambda1
            @Override // X.G0W
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                G0V g0v2 = g0v;
                BrowserClipboardTelemetry.EventKind eventKind = (BrowserClipboardTelemetry.EventKind) obj;
                Map map = (Map) obj2;
                AnonymousClass003.A0x(eventKind, map);
                g0v2.invoke(eventKind, map);
                return Unit.INSTANCE;
            }
        });
        AnonymousClass005.A11(function0, function02, g0v, 1);
        this.applicationForeground = z;
    }

    public static final Unit _init_$lambda$1(EventKind eventKind, Map map, HatchAppEventLoggingContext hatchAppEventLoggingContext) {
        boolean zA1a = AnonymousClass002.A1a(eventKind, map);
        int iOrdinal = eventKind.ordinal();
        if (iOrdinal == 0) {
            HatchAppEventLogger.INSTANCE.logBrowserClipboardControlsExposed(map);
        } else if (iOrdinal == zA1a) {
            HatchAppEventLogger hatchAppEventLogger = HatchAppEventLogger.INSTANCE;
            if (hatchAppEventLoggingContext == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            hatchAppEventLogger.logBrowserClipboardTransferStarted(map, hatchAppEventLoggingContext);
        } else {
            if (iOrdinal != 2) {
                throw C3cG.A0q();
            }
            HatchAppEventLogger hatchAppEventLogger2 = HatchAppEventLogger.INSTANCE;
            if (hatchAppEventLoggingContext == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            hatchAppEventLogger2.logBrowserClipboardTransferTerminal(map, hatchAppEventLoggingContext);
        }
        return Unit.INSTANCE;
    }

    private final long elapsed(long j, long j2) {
        long j3 = j2 - j;
        if (j3 < 0) {
            return 0L;
        }
        return j3;
    }

    public final synchronized boolean finishAttempt(Attempt attempt, Outcome outcome, Stage stage, ClosedReason closedReason, BrowserClipboardReasonDetail browserClipboardReasonDetail) {
        AnonymousClass005.A11(outcome, stage, closedReason, 1);
        if (attempt == null || attempt.hasTerminal) {
            return false;
        }
        attempt.hasTerminal = true;
        Map<String, String> map = attempt.metadata;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        long jA05 = C3cG.A05(this.clock.invoke()) - attempt.startedAtMs;
        if (jA05 < 0) {
            jA05 = 0;
        }
        C3cH.A1A("gesture_duration_ms", c0924AIaA0u, jA05);
        c0924AIaA0u.put("outcome", outcome.getValue());
        c0924AIaA0u.put("transfer_stage", stage.getValue());
        c0924AIaA0u.put("closed_reason", closedReason.getValue());
        c0924AIaA0u.put("diagnostic_version", "1");
        if ((outcome == Outcome.FAILED || outcome == Outcome.BLOCKED) && browserClipboardReasonDetail != null) {
            c0924AIaA0u.put("reason_detail", browserClipboardReasonDetail.getValue());
        }
        emit(EventKind.TRANSFER_TERMINAL, AGH.A02(map, AIW.A0K(c0924AIaA0u)), attempt.context);
        return true;
    }

    public final void finishCancellation(Attempt attempt) {
        Outcome outcome;
        Stage stage;
        if (attempt == null || !attempt.remoteDispatched) {
            outcome = Outcome.CANCELLED;
            stage = Stage.ACCEPTED;
        } else {
            outcome = Outcome.OUTCOME_UNKNOWN;
            stage = Stage.REMOTE_DISPATCH;
        }
        finishAttempt(attempt, outcome, stage, ClosedReason.CONTEXT_CHANGED, null);
    }

    public final void finishUnexpectedFailure(Attempt attempt) {
        Outcome outcome;
        Stage stage;
        if (attempt == null || !attempt.remoteDispatched) {
            outcome = Outcome.FAILED;
            stage = Stage.ACCEPTED;
        } else {
            outcome = Outcome.OUTCOME_UNKNOWN;
            stage = Stage.REMOTE_DISPATCH;
        }
        finishAttempt(attempt, outcome, stage, ClosedReason.CONTEXT_CHANGED, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000e, B:17:0x0031, B:13:0x0021, B:19:0x0036, B:8:0x0017, B:10:0x001b, B:12:0x001f, B:14:0x0025, B:16:0x0029), top: B:25:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void noteApplicationForeground(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.applicationForeground     // Catch: java.lang.Throwable -> L3a
            if (r0 == r4) goto L38
            boolean r2 = r3.isEpisodeActive()     // Catch: java.lang.Throwable -> L3a
            r3.applicationForeground = r4     // Catch: java.lang.Throwable -> L3a
            r1 = 0
            if (r4 != 0) goto L17
            r0 = 1
            r3.appBackgroundedSinceEpisode = r0     // Catch: java.lang.Throwable -> L3a
            boolean r0 = r3.overlayVisible     // Catch: java.lang.Throwable -> L3a
            r3.overlayWasVisibleWhenBackgrounded = r0     // Catch: java.lang.Throwable -> L3a
            r0 = 0
            goto L31
        L17:
            boolean r0 = r3.appBackgroundedSinceEpisode     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L21
            boolean r0 = r3.overlayWasVisibleWhenBackgrounded     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L25
            r3.appBackgroundedSinceEpisode = r1     // Catch: java.lang.Throwable -> L3a
        L21:
            r3.beginEpisodeIfActivated(r2, r1)     // Catch: java.lang.Throwable -> L3a
            goto L34
        L25:
            boolean r0 = r3.overlayVisible     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L21
            kotlin.jvm.functions.Function0<java.lang.Long> r0 = r3.clock     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L3a
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L3a
        L31:
            r3.pendingAppReturnStartedAtMs = r0     // Catch: java.lang.Throwable -> L3a
            goto L21
        L34:
            if (r4 == 0) goto L38
            r3.overlayWasVisibleWhenBackgrounded = r1     // Catch: java.lang.Throwable -> L3a
        L38:
            monitor-exit(r3)
            return
        L3a:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.runtime.BrowserClipboardTelemetry.noteApplicationForeground(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031 A[Catch: all -> 0x004c, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000d, B:8:0x0015, B:11:0x001a, B:13:0x0020, B:15:0x0024, B:18:0x002c, B:22:0x0037, B:23:0x0045, B:21:0x0031), top: B:29:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void noteOverlayVisible(java.lang.String r5, java.lang.Object r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r3 = X.AnonymousClass004.A1b(r5, r6)     // Catch: java.lang.Throwable -> L4c
            boolean r0 = X.C7BY.A0j(r5)     // Catch: java.lang.Throwable -> L4c
            if (r0 != 0) goto L4a
            if (r7 != 0) goto L1a
            java.lang.String r0 = r4.currentTaskId     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r5.equals(r0)     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r4.currentOwner     // Catch: java.lang.Throwable -> L4c
            if (r0 == r6) goto L1a
            goto L4a
        L1a:
            boolean r2 = r4.isEpisodeActive()     // Catch: java.lang.Throwable -> L4c
            if (r7 == 0) goto L2b
            java.lang.String r0 = r4.currentTaskId     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L2b
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L4c
            r1 = 1
            if (r0 == 0) goto L2c
        L2b:
            r1 = 0
        L2c:
            r4.overlayVisible = r7     // Catch: java.lang.Throwable -> L4c
            if (r7 == 0) goto L31
            goto L37
        L31:
            r0 = 0
            r4.currentTaskId = r0     // Catch: java.lang.Throwable -> L4c
            r4.currentOwner = r0     // Catch: java.lang.Throwable -> L4c
            goto L45
        L37:
            r4.currentTaskId = r5     // Catch: java.lang.Throwable -> L4c
            r4.currentOwner = r6     // Catch: java.lang.Throwable -> L4c
            java.util.IdentityHashMap<java.lang.Object, java.lang.String> r0 = r4.mountedControls     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L4c
            boolean r3 = X.C7384Etj.areEqual(r0, r5)     // Catch: java.lang.Throwable -> L4c
        L45:
            r4.controlsExposed = r3     // Catch: java.lang.Throwable -> L4c
            r4.beginEpisodeIfActivated(r2, r1)     // Catch: java.lang.Throwable -> L4c
        L4a:
            monitor-exit(r4)
            return
        L4c:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.runtime.BrowserClipboardTelemetry.noteOverlayVisible(java.lang.String, java.lang.Object, boolean):void");
    }

    public final synchronized void setControlsExposed(boolean z, String str, Object obj) {
        AnonymousClass003.A0x(str, obj);
        if (!C7BY.A0j(str)) {
            IdentityHashMap<Object, String> identityHashMap = this.mountedControls;
            if (z) {
                identityHashMap.put(obj, str);
            } else if (C7384Etj.areEqual(identityHashMap.get(obj), str)) {
                this.mountedControls.remove(obj);
            }
            if (this.overlayVisible && str.equals(this.currentTaskId) && this.currentOwner == obj) {
                this.controlsExposed = z;
                if (z) {
                    logExposureIfNeeded();
                }
            }
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EventKind.values().length];
            try {
                AnonymousClass005.A0v(EventKind.CONTROLS_EXPOSED, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(EventKind.TRANSFER_STARTED, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(EventKind.TRANSFER_TERMINAL, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Direction.values().length];
            try {
                AnonymousClass005.A0v(Direction.COPY_TO_DEVICE, iArr2, 1);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(Direction.PASTE_FROM_DEVICE, iArr2, 2);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final HatchAppEventLoggingContext _init_$lambda$2() {
        return null;
    }

    private final void emit(EventKind eventKind, Map<String, String> map, HatchAppEventLoggingContext hatchAppEventLoggingContext) {
        try {
            this.eventSink.invoke(eventKind, map, hatchAppEventLoggingContext);
        } catch (Throwable th) {
            C3cG.A0s(th);
        }
    }

    public static /* synthetic */ boolean finishAttempt$default(BrowserClipboardTelemetry browserClipboardTelemetry, Attempt attempt, Outcome outcome, Stage stage, ClosedReason closedReason, BrowserClipboardReasonDetail browserClipboardReasonDetail, int i, Object obj) {
        if ((i & 16) != 0) {
            browserClipboardReasonDetail = null;
        }
        return browserClipboardTelemetry.finishAttempt(attempt, outcome, stage, closedReason, browserClipboardReasonDetail);
    }

    private final boolean isEpisodeActive() {
        return this.applicationForeground && this.overlayVisible && this.currentTaskId != null;
    }

    private final void logExposureIfNeeded() {
        Episode episode = this.episode;
        if (episode == null || !isEpisodeActive() || !C7384Etj.areEqual(episode.taskId, this.currentTaskId) || episode.exposureLogged) {
            return;
        }
        episode.exposureLogged = true;
        emit(EventKind.CONTROLS_EXPOSED, C3cH.A0n(HatchChatNotificationIds.PARAM_BROWSER_TASK_ID, episode.taskId, C3cG.A0r("metrics_version", "1"), C3cG.A0r("episode_id", episode.id), C3cG.A0r("episode_reason", episode.reason.getValue())), null);
    }

    public final synchronized Attempt beginAttempt(Direction direction, String str) {
        int i;
        boolean zA1a = AnonymousClass002.A1a(direction, str);
        Episode episode = this.episode;
        if (isEpisodeActive() && this.controlsExposed) {
            if (str.equals(episode != null ? episode.taskId : null)) {
                episode.combinedOrdinal++;
                int iOrdinal = direction.ordinal();
                if (iOrdinal == 0) {
                    i = episode.copyOrdinal + 1;
                    episode.copyOrdinal = i;
                } else {
                    if (iOrdinal != zA1a) {
                        throw C3cG.A0q();
                    }
                    i = episode.pasteOrdinal + 1;
                    episode.pasteOrdinal = i;
                }
                long jA05 = C3cG.A05(this.clock.invoke());
                HatchAppEventLoggingContext hatchAppEventLoggingContextInvoke = this.contextProvider.invoke();
                String strInvoke = this.identifier.invoke();
                HxE hxEA0r = C3cG.A0r("metrics_version", "1");
                HxE hxEA0r2 = C3cG.A0r("attempt_id", strInvoke);
                HxE hxEA0r3 = C3cG.A0r("episode_id", episode.id);
                HxE hxEA0r4 = C3cG.A0r("episode_reason", episode.reason.getValue());
                HxE hxEA0r5 = C3cG.A0r(HatchChatNotificationIds.PARAM_BROWSER_TASK_ID, episode.taskId);
                HxE hxEA0r6 = C3cG.A0r("direction", direction.getValue());
                HxE hxEA0r7 = C3cG.A0r("combined_ordinal", String.valueOf(episode.combinedOrdinal));
                HxE hxEA0r8 = C3cG.A0r("direction_ordinal", String.valueOf(i));
                long j = jA05 - episode.startedAtMs;
                if (j < 0) {
                    j = 0;
                }
                Map<String, String> mapA0D = AGH.A0D(hxEA0r, hxEA0r2, hxEA0r3, hxEA0r4, hxEA0r5, hxEA0r6, hxEA0r7, hxEA0r8, C3cG.A0r("return_to_tap_ms", String.valueOf(j)));
                AnonymousClass003.A0v(strInvoke, mapA0D);
                Attempt attempt = new Attempt(strInvoke, jA05, mapA0D, hatchAppEventLoggingContextInvoke);
                emit(EventKind.TRANSFER_STARTED, mapA0D, hatchAppEventLoggingContextInvoke);
                return attempt;
            }
        }
        return null;
    }

    public final void markRemoteDispatch(Attempt attempt) {
        if (attempt != null) {
            attempt.remoteDispatched = true;
        }
    }

    public static final Unit _init_$lambda$3(G0V g0v, EventKind eventKind, Map map, HatchAppEventLoggingContext hatchAppEventLoggingContext) {
        AnonymousClass003.A0x(eventKind, map);
        g0v.invoke(eventKind, map);
        return Unit.INSTANCE;
    }

    private final void beginEpisodeIfActivated(boolean z, boolean z2) {
        String str;
        EpisodeReason episodeReason;
        Long lInvoke;
        if (isEpisodeActive()) {
            if ((!z || z2) && (str = this.currentTaskId) != null) {
                if (this.hasOpenedBrowser) {
                    String str2 = this.previousTaskId;
                    episodeReason = (str2 == null || str2.equals(str)) ? this.appBackgroundedSinceEpisode ? EpisodeReason.APP_RETURN : EpisodeReason.BROWSER_REOPENED : EpisodeReason.TASK_SWITCH;
                } else {
                    episodeReason = EpisodeReason.BROWSER_OPENED;
                }
                String strInvoke = this.identifier.invoke();
                if (episodeReason != EpisodeReason.APP_RETURN || (lInvoke = this.pendingAppReturnStartedAtMs) == null) {
                    lInvoke = this.clock.invoke();
                }
                this.episode = new Episode(strInvoke, episodeReason, lInvoke.longValue(), str, 0, 0, 0, false);
                this.previousTaskId = str;
                this.hasOpenedBrowser = true;
                this.appBackgroundedSinceEpisode = false;
                this.pendingAppReturnStartedAtMs = null;
                if (this.controlsExposed) {
                    logExposureIfNeeded();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BrowserClipboardTelemetry(Function0<Long> function0, Function0<String> function02, Function0<HatchAppEventLoggingContext> function03, G0W<? super EventKind, ? super Map<String, String>, ? super HatchAppEventLoggingContext, Unit> g0w) {
        this.clock = function0;
        this.identifier = function02;
        this.contextProvider = function03;
        this.eventSink = g0w;
        this.mountedControls = new IdentityHashMap<>();
    }

    public BrowserClipboardTelemetry() {
        this(AnonymousClass1.INSTANCE, (Function0<String>) new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserClipboardTelemetry$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnonymousClass002.A0k();
            }
        }, new AnonymousClass3(HatchAppEventLogger.INSTANCE), (G0W<? super EventKind, ? super Map<String, String>, ? super HatchAppEventLoggingContext, Unit>) new G0W() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserClipboardTelemetry$$ExternalSyntheticLambda3
            @Override // X.G0W
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BrowserClipboardTelemetry._init_$lambda$1((BrowserClipboardTelemetry.EventKind) obj, (Map) obj2, (HatchAppEventLoggingContext) obj3);
            }
        });
    }
}
