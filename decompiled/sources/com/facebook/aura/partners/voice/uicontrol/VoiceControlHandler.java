package com.facebook.aura.partners.voice.uicontrol;

import X.C3cG;
import X.Ey9;
import X.HtJ;

/* loaded from: classes2.dex */
public interface VoiceControlHandler {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Result {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Result[] $VALUES;
        public static final Result CALL_TRANSITIONING;
        public static final Result NO_ACTIVE_CALL;
        public static final Result PERFORMED;
        public static final Result STALE_CALL;
        public static final Result UNSUPPORTED;

        static {
            Result result = new Result("PERFORMED", 0);
            PERFORMED = result;
            Result result2 = new Result("NO_ACTIVE_CALL", 1);
            NO_ACTIVE_CALL = result2;
            Result result3 = new Result("CALL_TRANSITIONING", 2);
            CALL_TRANSITIONING = result3;
            Result result4 = new Result("STALE_CALL", 3);
            STALE_CALL = result4;
            Result result5 = new Result("UNSUPPORTED", 4);
            UNSUPPORTED = result5;
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

        public Result(String str, int i) {
        }
    }

    Object applyCallAvatarUpdate(CallAvatarUpdate callAvatarUpdate, HtJ<? super Result> htJ);

    Object endCall(EndVoiceCallRequest endVoiceCallRequest, HtJ<? super Result> htJ);

    Object mute(HtJ<? super Result> htJ);

    Object reconnectCall(ReconnectVoiceCallRequest reconnectVoiceCallRequest, HtJ<? super Result> htJ);

    Object setLiveAvatar(boolean z, HtJ<? super Result> htJ);
}
