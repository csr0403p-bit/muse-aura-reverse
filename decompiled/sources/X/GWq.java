package X;

import android.content.Context;
import com.facebook.rsys.audio.gen.AudioInputRoute;
import com.facebook.rsys.audio.gen.AudioOutputRoute;
import com.facebook.rsys.audiodevicestate.gen.AudioDeviceContext;
import com.facebook.rsys.audiodevicestate.manager.gen.AudioDeviceStateManager;
import com.facebook.rsys.audiodevicestate.managerfactory.gen.AudioDeviceStateManagerFactory;
import com.facebook.rsys.execution.simplethread.gen.SimpleThreadTaskExecutor;

/* loaded from: classes6.dex */
public final class GWq {
    public AudioDeviceStateManager A00;
    public final F0C A01 = FZP.A00(C79.A00, this, 18);

    public GWq(Context context) {
        GWs.A00 = AnonymousClass001.A0I(context);
        this.A00 = AudioDeviceStateManagerFactory.CProxy.createManager(SimpleThreadTaskExecutor.CProxy.createTaskExecutor("RtcAudioDeviceStateManager"), new AudioDeviceContext(true, 0, AudioOutputRoute.EARPIECE, AudioInputRoute.DEFAULT));
    }
}
