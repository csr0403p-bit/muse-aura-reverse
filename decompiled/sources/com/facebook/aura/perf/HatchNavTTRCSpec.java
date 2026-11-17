package com.facebook.aura.perf;

import X.C3cG;
import X.C60O;
import X.Ey9;
import X.F3w;
import com.facebook.aura.gateway.HatchFileOperations;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class HatchNavTTRCSpec {
    public static final HatchNavTTRCSpec INSTANCE = new HatchNavTTRCSpec();
    public static final int MARKER_ID = 734866663;

    public final class AnnotationKeys {
        public static final String ARTIFACT_COUNT = "artifact_count";
        public static final String CANCEL_REASON = "cancel_reason";
        public static final String ERROR_MESSAGE = "error_message";
        public static final String ERROR_TYPE = "error_type";
        public static final String FAILED_SOURCE = "failed_source";
        public static final String FAILURE_REASON = "failure_reason";
        public static final String FILES_COUNT = "files_count";
        public static final String GATEWAY_CONNECTED = "gateway_connected";
        public static final String GOAL_COUNT = "goal_count";
        public static final String IDEAS_COUNT = "ideas_count";
        public static final AnnotationKeys INSTANCE = new AnnotationKeys();
        public static final String IS_COLD_START = "is_cold_start";
        public static final String IS_DEEPLINK = "is_deeplink";
        public static final String LOAD_TYPE = "load_type";
        public static final String MEDIA_COUNT = "media_count";
        public static final String MESSAGE_COUNT = "message_count";
        public static final String SPACES_COUNT = "spaces_count";
        public static final String SURFACE = "surface";
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public final class CancelReason {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ CancelReason[] $VALUES;
        public static final CancelReason PUSH_NAVIGATION;
        public static final CancelReason TAB_SWITCH;
        public final String value;

        static {
            CancelReason cancelReason = new CancelReason("TAB_SWITCH", 0, "tab_switch");
            TAB_SWITCH = cancelReason;
            CancelReason cancelReason2 = new CancelReason("PUSH_NAVIGATION", 1, "push_navigation");
            PUSH_NAVIGATION = cancelReason2;
            CancelReason[] cancelReasonArr = {cancelReason, cancelReason2};
            $VALUES = cancelReasonArr;
            $ENTRIES = new F3w(cancelReasonArr);
        }

        public static Ey9<CancelReason> getEntries() {
            return $ENTRIES;
        }

        public static CancelReason valueOf(String str) {
            return (CancelReason) Enum.valueOf(CancelReason.class, str);
        }

        public static CancelReason[] values() {
            return (CancelReason[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        public CancelReason(String str, int i, String str2) {
            this.value = str2;
        }
    }

    public final class Expectations {
        public static final Expectations INSTANCE = new Expectations();
        public static final Set<String> CHAT_STEPS = Collections.singleton(Steps.VIEW_FINISHED);
        public static final Set<String> SPACES_STEPS = C60O.A19(Steps.VIEW_FINISHED, Steps.WEBVIEW_LOADED);
        public static final Set<String> LIBRARY_STEPS = Collections.singleton(Steps.VIEW_FINISHED);
        public static final Set<String> GOALS_STEPS = Collections.singleton(Steps.VIEW_FINISHED);
        public static final Set<String> IDEAS_STEPS = Collections.singleton(Steps.VIEW_FINISHED);
        public static final Set<String> CHAT_COLD_QUERIES = Collections.singleton(Queries.CHAT_DATA);
        public static final Set<String> SPACES_COLD_QUERIES = Collections.singleton(Queries.SPACES_DATA);
        public static final Set<String> LIBRARY_COLD_QUERIES = Collections.singleton(Queries.LIBRARY_DATA);
        public static final Set<String> GOALS_COLD_QUERIES = Collections.singleton(Queries.GOALS_DATA);
        public static final Set<String> IDEAS_COLD_QUERIES = Collections.singleton(Queries.IDEAS_DATA);

        public final Set<String> getCHAT_COLD_QUERIES() {
            return CHAT_COLD_QUERIES;
        }

        public final Set<String> getCHAT_STEPS() {
            return CHAT_STEPS;
        }

        public final Set<String> getGOALS_COLD_QUERIES() {
            return GOALS_COLD_QUERIES;
        }

        public final Set<String> getGOALS_STEPS() {
            return GOALS_STEPS;
        }

        public final Set<String> getIDEAS_COLD_QUERIES() {
            return IDEAS_COLD_QUERIES;
        }

        public final Set<String> getIDEAS_STEPS() {
            return IDEAS_STEPS;
        }

        public final Set<String> getLIBRARY_COLD_QUERIES() {
            return LIBRARY_COLD_QUERIES;
        }

        public final Set<String> getLIBRARY_STEPS() {
            return LIBRARY_STEPS;
        }

        public final Set<String> getSPACES_COLD_QUERIES() {
            return SPACES_COLD_QUERIES;
        }

        public final Set<String> getSPACES_STEPS() {
            return SPACES_STEPS;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class FailedSource {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ FailedSource[] $VALUES;
        public static final FailedSource ARTIFACTS;
        public static final FailedSource FILES;
        public static final FailedSource GOALS;
        public static final FailedSource IDEAS;
        public static final FailedSource MEDIA;
        public final String value;

        static {
            FailedSource failedSource = new FailedSource("GOALS", 0, "goals");
            GOALS = failedSource;
            FailedSource failedSource2 = new FailedSource("ARTIFACTS", 1, "artifacts");
            ARTIFACTS = failedSource2;
            FailedSource failedSource3 = new FailedSource("MEDIA", 2, HatchFileOperations.LibraryPreset.media);
            MEDIA = failedSource3;
            FailedSource failedSource4 = new FailedSource("FILES", 3, "files");
            FILES = failedSource4;
            FailedSource failedSource5 = new FailedSource("IDEAS", 4, "ideas");
            IDEAS = failedSource5;
            FailedSource[] failedSourceArr = {failedSource, failedSource2, failedSource3, failedSource4, failedSource5};
            $VALUES = failedSourceArr;
            $ENTRIES = C3cG.A0w(failedSourceArr);
        }

        public static Ey9<FailedSource> getEntries() {
            return $ENTRIES;
        }

        public static FailedSource valueOf(String str) {
            return (FailedSource) Enum.valueOf(FailedSource.class, str);
        }

        public static FailedSource[] values() {
            return (FailedSource[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        public FailedSource(String str, int i, String str2) {
            this.value = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class FailureReason {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ FailureReason[] $VALUES;
        public static final FailureReason DATA_FETCH_FAILED;
        public static final FailureReason GATEWAY_CONNECTION_FAILED;
        public static final FailureReason UNKNOWN;
        public final String value;

        static {
            FailureReason failureReason = new FailureReason("GATEWAY_CONNECTION_FAILED", 0, "gateway_connection_failed");
            GATEWAY_CONNECTION_FAILED = failureReason;
            FailureReason failureReason2 = new FailureReason("DATA_FETCH_FAILED", 1, "data_fetch_failed");
            DATA_FETCH_FAILED = failureReason2;
            FailureReason failureReason3 = new FailureReason("UNKNOWN", 2, "unknown");
            UNKNOWN = failureReason3;
            FailureReason[] failureReasonArr = {failureReason, failureReason2, failureReason3};
            $VALUES = failureReasonArr;
            $ENTRIES = C3cG.A0w(failureReasonArr);
        }

        public static Ey9<FailureReason> getEntries() {
            return $ENTRIES;
        }

        public static FailureReason valueOf(String str) {
            return (FailureReason) Enum.valueOf(FailureReason.class, str);
        }

        public static FailureReason[] values() {
            return (FailureReason[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        public FailureReason(String str, int i, String str2) {
            this.value = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class LoadType {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ LoadType[] $VALUES;
        public static final LoadType COLD;
        public static final LoadType WARM;
        public final String value;

        static {
            LoadType loadType = new LoadType("COLD", 0, "cold");
            COLD = loadType;
            LoadType loadType2 = new LoadType("WARM", 1, "warm");
            WARM = loadType2;
            LoadType[] loadTypeArr = {loadType, loadType2};
            $VALUES = loadTypeArr;
            $ENTRIES = C3cG.A0w(loadTypeArr);
        }

        public static Ey9<LoadType> getEntries() {
            return $ENTRIES;
        }

        public static LoadType valueOf(String str) {
            return (LoadType) Enum.valueOf(LoadType.class, str);
        }

        public static LoadType[] values() {
            return (LoadType[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        public LoadType(String str, int i, String str2) {
            this.value = str2;
        }
    }

    public final class Points {
        public static final String CHAT_GATEWAY_CONNECT_END = "chat_gateway_connect_end";
        public static final String CHAT_GATEWAY_CONNECT_START = "chat_gateway_connect_start";
        public static final String CHAT_HISTORY_FETCH_END = "chat_history_fetch_end";
        public static final String CHAT_HISTORY_FETCH_START = "chat_history_fetch_start";
        public static final String GOALS_FETCH_END = "goals_fetch_end";
        public static final String GOALS_FETCH_START = "goals_fetch_start";
        public static final String IDEAS_FETCH_END = "ideas_fetch_end";
        public static final String IDEAS_FETCH_START = "ideas_fetch_start";
        public static final Points INSTANCE = new Points();
        public static final String LIBRARY_ARTIFACTS_FETCH_END = "library_artifacts_fetch_end";
        public static final String LIBRARY_ARTIFACTS_FETCH_START = "library_artifacts_fetch_start";
        public static final String LIBRARY_FILES_FETCH_END = "library_files_fetch_end";
        public static final String LIBRARY_FILES_FETCH_START = "library_files_fetch_start";
        public static final String LIBRARY_MEDIA_FETCH_END = "library_media_fetch_end";
        public static final String LIBRARY_MEDIA_FETCH_START = "library_media_fetch_start";
        public static final String SPACES_FETCH_END = "spaces_fetch_end";
        public static final String SPACES_FETCH_START = "spaces_fetch_start";
        public static final String SPACES_WEBVIEW_LOAD_END = "spaces_webview_load_end";
        public static final String SPACES_WEBVIEW_LOAD_START = "spaces_webview_load_start";
    }

    public final class Queries {
        public static final String CHAT_DATA = "chat_data";
        public static final String GOALS_DATA = "goals_data";
        public static final String IDEAS_DATA = "ideas_data";
        public static final Queries INSTANCE = new Queries();
        public static final String LIBRARY_DATA = "library_data";
        public static final String SPACES_DATA = "spaces_data";
    }

    public final class Steps {
        public static final Steps INSTANCE = new Steps();
        public static final String VIEW_FINISHED = "view_finished";
        public static final String WEBVIEW_LOADED = "webview_loaded";
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public final class Surface {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Surface[] $VALUES;
        public static final Surface CHAT;
        public static final Surface GOALS;
        public static final Surface IDEAS;
        public static final Surface LIBRARY;
        public static final Surface SPACES;
        public final String value;

        static {
            Surface surface = new Surface("CHAT", 0, "chat");
            CHAT = surface;
            Surface surface2 = new Surface("SPACES", 1, "spaces");
            SPACES = surface2;
            Surface surface3 = new Surface("LIBRARY", 2, "library");
            LIBRARY = surface3;
            Surface surface4 = new Surface("GOALS", 3, "goals");
            GOALS = surface4;
            Surface surface5 = new Surface("IDEAS", 4, "ideas");
            IDEAS = surface5;
            Surface[] surfaceArr = {surface, surface2, surface3, surface4, surface5};
            $VALUES = surfaceArr;
            $ENTRIES = new F3w(surfaceArr);
        }

        public static Ey9<Surface> getEntries() {
            return $ENTRIES;
        }

        public static Surface valueOf(String str) {
            return (Surface) Enum.valueOf(Surface.class, str);
        }

        public static Surface[] values() {
            return (Surface[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        public Surface(String str, int i, String str2) {
            this.value = str2;
        }
    }

    public final int getMARKER_ID() {
        return MARKER_ID;
    }
}
