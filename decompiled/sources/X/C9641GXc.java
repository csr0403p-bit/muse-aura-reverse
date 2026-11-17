package X;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* renamed from: X.GXc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9641GXc implements AudioManager.OnCommunicationDeviceChangedListener {
    public final /* synthetic */ AudioDeviceInfo A00;
    public final /* synthetic */ GXD A01;
    public final /* synthetic */ Hm1<Boolean> A02;

    /* JADX WARN: Multi-variable type inference failed */
    public C9641GXc(AudioDeviceInfo audioDeviceInfo, GXD gxd, Hm1<? super Boolean> hm1) {
        this.A00 = audioDeviceInfo;
        this.A01 = gxd;
        this.A02 = hm1;
    }

    @Override // android.media.AudioManager.OnCommunicationDeviceChangedListener
    public final void onCommunicationDeviceChanged(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo == null || audioDeviceInfo.getId() != this.A00.getId()) {
            return;
        }
        ((GX4) this.A01).A04.removeOnCommunicationDeviceChangedListener(this);
        this.A02.resumeWith(AnonymousClass001.A0i());
    }
}
