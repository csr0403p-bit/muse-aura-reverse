package com.facebook.rtc.audiolite;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C7Bm;
import X.C8j3;
import X.C9641GXc;
import X.C9643GXe;
import X.EnumC10460Hji;
import X.ExecutorC9652GXy;
import X.G0V;
import X.GBL;
import X.GX4;
import X.GXD;
import X.HtJ;
import X.Hwg;
import X.InterfaceC9648GXn;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;

@DebugMetadata(c = "com.facebook.rtc.audiolite.RtcAudioOutputManagerImplV2$selectDevice$2", f = "RtcAudioOutputManagerImplV2.kt", l = {656}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class RtcAudioOutputManagerImplV2$selectDevice$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ AudioDeviceInfo $deviceInfo;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ GXD this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/GXD;Landroid/media/AudioDeviceInfo;LX/HtJ<-Lcom/facebook/rtc/audiolite/RtcAudioOutputManagerImplV2$selectDevice$2;>;)V */
    public RtcAudioOutputManagerImplV2$selectDevice$2(AudioDeviceInfo audioDeviceInfo, GXD gxd, HtJ htJ) {
        super(2, htJ);
        this.this$0 = gxd;
        this.$deviceInfo = audioDeviceInfo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new RtcAudioOutputManagerImplV2$selectDevice$2(this.$deviceInfo, this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws DispatchException {
        AudioDeviceInfo communicationDevice;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        boolean zBooleanValue = false;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                GXD gxd = this.this$0;
                AudioDeviceInfo audioDeviceInfo = this.$deviceInfo;
                this.L$0 = gxd;
                this.L$1 = audioDeviceInfo;
                this.label = 1;
                GBL gblA04 = C7Bm.A04(this);
                if (gxd.A0B.enableSelectCommunicationDeviceFixes() && (communicationDevice = ((GX4) gxd).A04.getCommunicationDevice()) != null && communicationDevice.getId() == audioDeviceInfo.getId()) {
                    gblA04.resumeWith(Boolean.valueOf(GXD.A0J(audioDeviceInfo, gxd)));
                } else {
                    C9641GXc c9641GXc = new C9641GXc(audioDeviceInfo, gxd, gblA04);
                    AudioManager audioManager = ((GX4) gxd).A04;
                    C9641GXc c9641GXc2 = c9641GXc;
                    audioManager.addOnCommunicationDeviceChangedListener(ExecutorC9652GXy.A00, c9641GXc2);
                    if (!GXD.A0I(audioDeviceInfo, gxd)) {
                        audioManager.removeOnCommunicationDeviceChangedListener(c9641GXc2);
                        gblA04.resumeWith(false);
                    }
                    gblA04.AO2(new C9643GXe(c9641GXc, gxd));
                }
                obj = gblA04.A0F();
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
        } catch (CancellationException e) {
            if ((e instanceof TimeoutCancellationException) && this.this$0.A0B.enableSelectCommunicationDeviceFixes()) {
                throw e;
            }
            GXD gxd2 = this.this$0;
            InterfaceC9648GXn.A00(((GX4) gxd2).A09, AnonymousClass001.A0v(" cancelled. Clearing communication device", C3cG.A0f(gxd2.A02(this.$deviceInfo), "selectDevice: change to ")));
            ((GX4) this.this$0).A04.clearCommunicationDevice();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return ((RtcAudioOutputManagerImplV2$selectDevice$2) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
