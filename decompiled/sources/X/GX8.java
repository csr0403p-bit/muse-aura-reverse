package X;

import android.media.AudioManager;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* loaded from: classes6.dex */
public final class GX8 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ GX6 A00;

    public GX8(GX6 gx6) {
        this.A00 = gx6;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        String str;
        InterfaceC9648GXn interfaceC9648GXn = this.A00.A04;
        switch (i) {
            case -3:
                str = "LOSS_TRANSIENT_CAN_DUCK";
                break;
            case -2:
                str = "LOSS_TRANSIENT";
                break;
            case -1:
                str = "LOSS";
                break;
            case 0:
                str = HatchPersistedMessageJson.UNSEND_STATUS_NONE;
                break;
            case 1:
                str = "GAIN";
                break;
            case 2:
                str = "GAIN_TRANSIENT";
                break;
            case 3:
                str = "GAIN_TRANSIENT_MAY_DUCK";
                break;
            case 4:
                str = "GAIN_TRANSIENT_EXCLUSIVE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        interfaceC9648GXn.A8D("onAudioFocusChange: %s", str);
    }
}
