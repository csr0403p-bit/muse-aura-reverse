package com.facebook.aura.partners.voice.intf;

import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.C7VR;
import X.Ey9;
import android.app.Activity;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchEventType;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.utils.ContextUtilsKt;
import com.facebook.aura.utils.HatchPermissionRequestStore;
import com.facebook.aura.utils.HatchPermissionUtils;

/* loaded from: classes2.dex */
public final class VoiceMicPermissionLogger {
    public static final int $stable = 0;
    public static final VoiceMicPermissionLogger INSTANCE = new VoiceMicPermissionLogger();
    public static volatile MicPrompt pending;

    public final class MicPrompt {
        public static final int $stable = 8;
        public final HatchScreen screen;
        public volatile boolean shown;
        public final HatchSubsurface subsurface;
        public final HatchSurface surface;

        public final void onLaunched(Context context) {
            C7384Etj.A0Y(context, 0);
            this.shown = AnonymousClass006.A1Z(VoiceMicPermissionLogger.INSTANCE.micStatus(context), MicStatus.PERMANENTLY_DENIED);
            HatchPermissionRequestStore.INSTANCE.markPermissionRequested("android.permission.RECORD_AUDIO");
            if (this.shown) {
                log(HatchEventType.PERMISSION_PROMPTED);
            }
        }

        private final void log(HatchEventType hatchEventType) {
            HatchInteractionLogger.INSTANCE.logPermission(hatchEventType, this.surface, this.subsurface, this.screen, HatchComponent.MIC_PERMISSION, null);
        }

        public final void onDecision(boolean z) {
            if (this.shown) {
                this.shown = false;
                log(z ? HatchEventType.PERMISSION_ACCEPTED : HatchEventType.PERMISSION_DENIED);
            }
        }

        public MicPrompt(HatchScreen hatchScreen, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface) {
            AnonymousClass003.A0u(hatchScreen, hatchSurface);
            this.screen = hatchScreen;
            this.surface = hatchSurface;
            this.subsurface = hatchSubsurface;
        }

        public /* synthetic */ MicPrompt(HatchScreen hatchScreen, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, int i, C06H c06h) {
            this(hatchScreen, (i & 2) != 0 ? HatchSurface.VOICE_MODE : hatchSurface, (i & 4) != 0 ? null : hatchSubsurface);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class MicStatus {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ MicStatus[] $VALUES;
        public static final MicStatus DENIED;
        public static final MicStatus GRANTED;
        public static final MicStatus NOT_DETERMINED;
        public static final MicStatus PERMANENTLY_DENIED;
        public final String value;

        static {
            MicStatus micStatus = new MicStatus("GRANTED", 0, "granted");
            GRANTED = micStatus;
            MicStatus micStatus2 = new MicStatus("DENIED", 1, "denied");
            DENIED = micStatus2;
            MicStatus micStatus3 = new MicStatus("PERMANENTLY_DENIED", 2, "denied");
            PERMANENTLY_DENIED = micStatus3;
            MicStatus micStatus4 = new MicStatus("NOT_DETERMINED", 3, "not_determined");
            NOT_DETERMINED = micStatus4;
            MicStatus[] micStatusArr = {micStatus, micStatus2, micStatus3, micStatus4};
            $VALUES = micStatusArr;
            $ENTRIES = C3cG.A0w(micStatusArr);
        }

        public static Ey9<MicStatus> getEntries() {
            return $ENTRIES;
        }

        public static MicStatus valueOf(String str) {
            return (MicStatus) Enum.valueOf(MicStatus.class, str);
        }

        public static MicStatus[] values() {
            return (MicStatus[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        public MicStatus(String str, int i, String str2) {
            this.value = str2;
        }
    }

    public final void logStatus(Context context) {
        C7384Etj.A0Y(context, 0);
        HatchInteractionLogger.INSTANCE.logStatusCheck(HatchSurface.VOICE_MODE, null, HatchScreen.VOICE_OVERLAY, HatchComponent.MIC_PERMISSION, AnonymousClass006.A10(HatchMetadataKey.RESULT.getValue(), micStatus(context).getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MicStatus micStatus(Context context) {
        if (HatchPermissionUtils.INSTANCE.hasPermission(context, "android.permission.RECORD_AUDIO")) {
            return MicStatus.GRANTED;
        }
        Activity activityFindActivity = ContextUtilsKt.findActivity(context);
        return (activityFindActivity == null || !C7VR.A01(activityFindActivity, "android.permission.RECORD_AUDIO")) ? HatchPermissionRequestStore.INSTANCE.isPermissionAlreadyRequested("android.permission.RECORD_AUDIO") ? MicStatus.PERMANENTLY_DENIED : MicStatus.NOT_DETERMINED : MicStatus.DENIED;
    }

    public static /* synthetic */ void onPromptLaunched$default(VoiceMicPermissionLogger voiceMicPermissionLogger, Context context, HatchScreen hatchScreen, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchScreen = HatchScreen.VOICE_OVERLAY;
        }
        voiceMicPermissionLogger.onPromptLaunched(context, hatchScreen);
    }

    public final void logDecision(boolean z) {
        MicPrompt micPrompt = pending;
        if (micPrompt != null) {
            micPrompt.onDecision(z);
        }
        pending = null;
    }

    public final void onPromptLaunched(Context context, HatchScreen hatchScreen) {
        AnonymousClass003.A0u(context, hatchScreen);
        MicPrompt micPrompt = new MicPrompt(hatchScreen, HatchSurface.VOICE_MODE, null);
        micPrompt.onLaunched(context);
        pending = micPrompt;
    }
}
