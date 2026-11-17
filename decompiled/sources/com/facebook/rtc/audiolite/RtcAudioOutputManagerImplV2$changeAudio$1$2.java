package com.facebook.rtc.audiolite;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass007;
import X.C3UX;
import X.C3cG;
import X.C8j3;
import X.EnumC10460Hji;
import X.G0V;
import X.GAX;
import X.GX4;
import X.GXD;
import X.GXX;
import X.HtJ;
import X.Hwg;
import X.InterfaceC9648GXn;
import android.media.AudioDeviceInfo;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.TimeoutCancellationException;

@DebugMetadata(c = "com.facebook.rtc.audiolite.RtcAudioOutputManagerImplV2$changeAudio$1$2", f = "RtcAudioOutputManagerImplV2.kt", l = {408}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class RtcAudioOutputManagerImplV2$changeAudio$1$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AudioDeviceInfo $audioDevice;
    public final /* synthetic */ GXX $output;
    public final /* synthetic */ int $routeChangeKey;
    public Object L$0;
    public int label;
    public final /* synthetic */ GXD this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/GXD;Landroid/media/AudioDeviceInfo;LX/GXX;ILX/HtJ<-Lcom/facebook/rtc/audiolite/RtcAudioOutputManagerImplV2$changeAudio$1$2;>;)V */
    public RtcAudioOutputManagerImplV2$changeAudio$1$2(AudioDeviceInfo audioDeviceInfo, GXD gxd, GXX gxx, HtJ htJ, int i) {
        super(2, htJ);
        this.this$0 = gxd;
        this.$audioDevice = audioDeviceInfo;
        this.$output = gxx;
        this.$routeChangeKey = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new RtcAudioOutputManagerImplV2$changeAudio$1$2(this.$audioDevice, this.this$0, this.$output, htJ, this.$routeChangeKey);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objA02;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                objA02 = this.this$0.A02(this.$audioDevice);
                GXD gxd = this.this$0;
                AudioDeviceInfo audioDeviceInfo = this.$audioDevice;
                this.L$0 = objA02;
                this.label = 1;
                obj = GAX.A00(this, new RtcAudioOutputManagerImplV2$selectDevice$2(audioDeviceInfo, gxd, null), 30000L);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objA02 = this.L$0;
                Hwg.A00(obj);
            }
        } catch (TimeoutCancellationException e) {
            if (!this.this$0.A0B.enableSelectCommunicationDeviceFixes()) {
                throw e;
            }
        }
        if (AnonymousClass001.A1X(obj)) {
            InterfaceC9648GXn.A00(((GX4) this.this$0).A09, AnonymousClass007.A0a("changeAudio: done changing to ", objA02));
        } else {
            if (objA02 == GXX.A05) {
                this.this$0.A04 = false;
            }
            InterfaceC9648GXn.A00(((GX4) this.this$0).A09, AnonymousClass001.A0v(". Clearing communication device", C3cG.A0f(objA02, "changeAudio: timeout changing to ")));
            ((GX4) this.this$0).A04.clearCommunicationDevice();
        }
        this.this$0.A01 = null;
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((RtcAudioOutputManagerImplV2$changeAudio$1$2) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
