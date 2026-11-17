package X;

import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioRecordingConfiguration;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.analytics.timespent.navigation.NavigationLoggerImpl;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class EBW implements Runnable {
    public static final String __redex_internal_original_name = "AudioRecordMonitor$logRecordingConfigsAsync$1";
    public final /* synthetic */ EBX A00;
    public final /* synthetic */ List<AudioRecordingConfiguration> A01;

    public EBW(EBX ebx, List list) {
        this.A00 = ebx;
        this.A01 = list;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        EBX ebx = this.A00;
        List<AudioRecordingConfiguration> activeRecordingConfigurations = this.A01;
        if (activeRecordingConfigurations == null) {
            activeRecordingConfigurations = ebx.A02.getActiveRecordingConfigurations();
            C7384Etj.A0U(activeRecordingConfigurations);
        }
        JSONArray jSONArray = new JSONArray();
        for (AudioRecordingConfiguration audioRecordingConfiguration : activeRecordingConfigurations) {
            JSONObject jSONObjectA18 = BV4.A18();
            AudioFormat format = audioRecordingConfiguration.getFormat();
            AudioFormat clientFormat = audioRecordingConfiguration.getClientFormat();
            AudioDeviceInfo audioDevice = audioRecordingConfiguration.getAudioDevice();
            try {
                jSONObjectA18.put(PhotosSearchHandlerKt.PARAM_SOURCE, audioRecordingConfiguration.getClientAudioSource()).put("session_id", audioRecordingConfiguration.getClientAudioSessionId()).put("is_silenced", String.valueOf(audioRecordingConfiguration.isClientSilenced()));
                if (format != null) {
                    jSONObjectA18.put(ErrorReportingConstants.SOFT_ERROR_OCCURRENCE_COUNT, format.getSampleRate());
                }
                if (clientFormat != null) {
                    jSONObjectA18.put("client_sample_rate", clientFormat.getSampleRate());
                }
                if (audioDevice != null) {
                    jSONObjectA18.put("product_name", audioDevice.getProductName()).put(NavigationLoggerImpl.DEVICE_TYPE_KEY, audioDevice.getType()).put("device_id", audioDevice.getId());
                }
                if (audioRecordingConfiguration.isClientSilenced()) {
                    jSONObjectA18.put("process", EBX.A00());
                    jSONObjectA18.put("mic_permission", AnonymousClass002.A1M(AbstractC4104Cme.A00(ebx.A01, "android.permission.RECORD_AUDIO")));
                }
            } catch (JSONException e) {
                ebx.A05.AAr("AudioRecordMonitor", "Failed to create record config json", e, BV4.A1W());
            }
            jSONArray.put(jSONObjectA18);
        }
        jSONArray.toString();
    }
}
