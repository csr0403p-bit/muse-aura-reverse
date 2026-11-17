package com.facebook.common.classmarkers;

import X.FGI;
import android.util.Log;

/* loaded from: classes5.dex */
public final class ClassMarkerLoader {
    public static final ClassMarkerLoader INSTANCE = new ClassMarkerLoader();
    public static final String TAG = "ClassMarkerLoader";

    public static final void loadBackgroundUnifiedTTRCColdStartRunMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsBackgroundUnifiedTTRCColdStartRun");
    }

    private final void loadClass(String str) throws ClassNotFoundException {
        try {
            Class.forName(str);
            Log.v(TAG, FGI.A0U("Class ", str, " was loaded"));
        } catch (ClassNotFoundException e) {
            Log.e(TAG, FGI.A0U("Class ", str, " not found"), e);
        }
    }

    public static final void loadColdStartClassPreloadingStartMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.ColdStartClassPreloadingMarkerStart");
    }

    public static final void loadColdStartDDRunMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsColdStartDDRun");
    }

    public static final void loadColdStartNewsfeedRunMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsColdStartNewsfeedRun");
    }

    public static final void loadColdStartReelsTabRunMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsColdStartReelsTabRun");
    }

    public static final void loadColdStartTTIRunMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsColdStartTTIRun");
    }

    public static final void loadColdStartTTRCRunMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsColdStartTTRCRun");
    }

    public static final void loadIsAnyIGColdStartMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsAnyIGColdStart");
    }

    public static final void loadIsBackgroundColdStartRunMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsBackgroundColdStartRun");
    }

    public static final void loadIsBackgroundRestartFinishMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsBackgroundRestartFinish");
    }

    public static final void loadIsClassPreloadRunMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsClassPreloadRun");
    }

    public static final void loadIsColdStartRunMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsColdStartRun");
    }

    public static final void loadIsIGColdStartFromLauncherMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsIGColdStartFromLauncher");
    }

    public static final void loadIsIGColdStartToFeedMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsIGColdStartToFeed");
    }

    public static final void loadIsMessengerStartToInboxFinishMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsMessengerStartToInboxFinish");
    }

    public static final void loadIsMessengerStartupBeginMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsMessengerStartupBegin");
    }

    public static final void loadIsNotColdStartRunMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsNotColdStartRun");
    }

    public static final void loadIsRadlSessionMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsRadlSession");
    }

    public static final void loadLiteLoginMessageSentMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.LiteLoginMessageSent");
    }

    public static final void loadLiteSessionMessageReceived() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.LiteSessionMessageReceived");
    }

    public static final void loadMessengerStartToThreadFinishMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsMessengerStartToThreadFinish");
    }

    public static final void loadMessengerThreadListToThreadViewEndMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsMessengerThreadListToThreadViewEnd");
    }

    public static final void loadMessengerThreadListToThreadViewNotPreloadedMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsMessengerThreadListToThreadViewNotPreloaded");
    }

    public static final void loadMessengerThreadListToThreadViewPreLoadedMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsMessengerThreadListToThreadViewPreLoaded");
    }

    public static final void loadMessengerThreadListToThreadViewPreRenderedMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsMessengerThreadListToThreadViewPreRendered");
    }

    public static final void loadMessengerThreadListToThreadViewStartMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsMessengerThreadListToThreadViewStart");
    }

    public static final void loadMessengerWarmStartupBeginMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsMessengerWarmStartBegin");
    }

    public static final void loadStoriesColdStartTTIRunMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsStoriesColdStartTTIRun");
    }

    public static final void loadUnifiedTTRCColdStartRunMarker() throws ClassNotFoundException {
        INSTANCE.loadClass("com.facebook.common.classmarkers.IsUnifiedTTRCColdStartRun");
    }
}
