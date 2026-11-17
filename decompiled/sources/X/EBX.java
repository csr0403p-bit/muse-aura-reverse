package X;

import android.app.ActivityManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class EBX {
    public final Context A01;
    public final AudioManager A02;
    public final C10538Hql A04;
    public final InterfaceC9648GXn A05;
    public final ExecutorService A07;
    public final Handler A03 = C60O.A02();
    public final Runnable A06 = new EBZ(this);
    public AudioManager.AudioRecordingCallback A00 = new EBY(this);

    public static final JSONObject A00() throws JSONException {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        JSONObject jSONObjectA18 = BV4.A18();
        try {
            jSONObjectA18.put("importance", runningAppProcessInfo.importance);
            jSONObjectA18.put("lastTrimLevel", runningAppProcessInfo.lastTrimLevel);
            return jSONObjectA18;
        } catch (JSONException e) {
            BzX.A01("AudioRecordMonitor", e, "Failed to add process info to JSON object");
            return jSONObjectA18;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/util/List<Landroid/media/AudioRecordingConfiguration;>;)V */
    public static final void A02(EBX ebx, List list) {
        ExecutorService executorService;
        if (ebx.A04.A00 == null || (executorService = ebx.A07) == null) {
            return;
        }
        executorService.execute(new EBW(ebx, list));
    }

    public EBX(Context context, AudioManager audioManager, C10538Hql c10538Hql, InterfaceC9648GXn interfaceC9648GXn, ExecutorService executorService) {
        this.A01 = context;
        this.A07 = executorService;
        this.A02 = audioManager;
        this.A05 = interfaceC9648GXn;
        this.A04 = new C10538Hql(c10538Hql);
    }

    public static final void A01(EBX ebx) throws JSONException {
        try {
            JSONObject jSONObjectA00 = A00();
            JSONObject jSONObjectA18 = BV4.A18();
            jSONObjectA18.put("process", jSONObjectA00);
            jSONObjectA18.put("mic_permission", AnonymousClass002.A1M(AbstractC4104Cme.A00(ebx.A01, "android.permission.RECORD_AUDIO")));
            jSONObjectA18.toString();
        } catch (JSONException e) {
            ebx.A05.AAr("AudioRecordMonitor", "Failed to create system info config json", e, BV4.A1W());
        }
    }
}
