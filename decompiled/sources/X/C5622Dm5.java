package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.List;
import java.util.Map;

/* renamed from: X.Dm5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5622Dm5 implements InterfaceC5638DmM {
    public final HeroPlayerSetting A00;
    public volatile InterfaceC5638DmM A01;
    public volatile InterfaceC5860Dqu A02;

    @Override // X.InterfaceC5638DmM
    public final void ASL(C5623Dm6 c5623Dm6, String str, String str2, String str3, boolean z) {
        try {
            this.A01.ASL(c5623Dm6, str, str2, str3, z);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onCompletion(isPlaying = %s) callback", e, BV4.A1Z(c5623Dm6.A0o));
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AT4(String str, String str2, String str3, String str4, String str5) {
        try {
            this.A01.AT4(str, str2, str3, str4, str5);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onError(errorCode = %s) callback", e, str2);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AUT(C5623Dm6 c5623Dm6, String str, String str2, String str3, String str4, String str5, long j, boolean z, boolean z2) {
        try {
            this.A01.AUT(c5623Dm6, str, str2, str3, str4, str5, j, z, z2);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onPaused(isPlaying = %s) callback", e, BV4.A1Z(c5623Dm6.A0o));
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AWD(C5623Dm6 c5623Dm6, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2) {
        try {
            this.A01.AWD(c5623Dm6, str, str2, str3, str4, str5, str6, str7, j, z, z2);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onStartedPlaying(isPlaying = %s) callback", e, BV4.A1Z(c5623Dm6.A0o));
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ARl(int i) {
        try {
            this.A01.ARl(i);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onAudioDataSummaryUpdated callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ARq(C5723DoI c5723DoI) {
        try {
            this.A01.ARq(c5723DoI);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send audio input format change", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ARz(String str, long j) {
        try {
            this.A01.ARz(str, j);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onBlackScreenConfirmed callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AS0(Dq8 dq8, C5623Dm6 c5623Dm6, boolean z) {
        try {
            this.A01.AS0(dq8, c5623Dm6, z);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onBufferingStarted(isPlaying = %s) callback", e, BV4.A1Z(c5623Dm6.A0o));
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AS1(C5623Dm6 c5623Dm6, boolean z) {
        try {
            this.A01.AS1(c5623Dm6, z);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onBufferingStopped(isPlaying = %s) callback", e, BV4.A1Z(c5623Dm6.A0o));
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AS8(C5623Dm6 c5623Dm6, String str, String str2, String str3, String str4, long j, boolean z) {
        try {
            this.A01.AS8(c5623Dm6, str, str2, str3, str4, j, z);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed send onCancelled() callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ASF(String str, boolean z) {
        try {
            this.A01.ASF(str, z);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send codec init start callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ASG(String str, boolean z) {
        try {
            this.A01.ASG(str, z);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send codec released callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ASV(String str, boolean z, long j) {
        try {
            this.A01.ASV(str, z, j);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send decoder initialized callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ASd(C5723DoI c5723DoI, String str, List<String> list, boolean z) {
        try {
            this.A01.ASd(c5723DoI, str, list, z);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed send onDownstreamFormatChanged() callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ASi(C5919Ds4 c5919Ds4) {
        try {
            this.A01.ASi(c5919Ds4);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onDrawnToSurface callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ASv(String str, String str2) {
        try {
            this.A01.ASv(str, str2);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed send onEncodedFrameDataReceived() callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AT6(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        try {
            this.A01.AT6(str, str2, str3, str4, str5, str6, str7);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed send onErrorRecoveryAttempt() callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ATN(DEK dek) {
        ((Dlw) this.A02).A0n = dek;
    }

    @Override // X.InterfaceC5638DmM
    public final void ATS(String str, long j) {
        this.A01.ATS(str, j);
    }

    @Override // X.InterfaceC5638DmM
    public final void ATm(String str, long j, long j2, long j3, long j4) {
        try {
            this.A01.ATm(str, j, j2, j3, j4);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onLatencyJump callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ATp(boolean z) {
        try {
            this.A01.ATp(z);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onLiveInterrupt callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ATq(byte[] bArr, String str, long j, long j2) {
        try {
            this.A01.ATq(bArr, str, j, j2);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onliveEmsg callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ATr(Dq8 dq8) {
        try {
            this.A01.ATr(dq8);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send live state update", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ATs(C5841DqX c5841DqX) {
        try {
            this.A01.ATs(c5841DqX);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onLiveTraceFrameEvent callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AUB(Object obj) {
        try {
            this.A01.AUB(obj);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onMetadataMsg callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AUI(byte[] bArr, long j) {
        try {
            this.A01.AUI(bArr, j);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onNewAudioData callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AUK(byte[] bArr) {
        try {
            this.A01.AUK(bArr);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onNewPCMBuffer callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AUU(String str, String str2) {
        this.A01.AUU(str, str2);
    }

    @Override // X.InterfaceC5638DmM
    public final void AUb() {
        try {
            this.A01.AUb();
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onPlaybackAboutToFinish callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AUd(EnumC2375BWj enumC2375BWj) {
        try {
            this.A01.AUd(enumC2375BWj);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onPlaybackPositionReached callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AUf(float f) {
        try {
            this.A01.AUf(f);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onLiveTraceFrameEvent callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AUj(C5623Dm6 c5623Dm6) {
        try {
            this.A01.AUj(c5623Dm6);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onPlayerStateUpdate(isPlaying = %s) callback", e, BV4.A1Z(c5623Dm6.A0o));
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AUw(C5623Dm6 c5623Dm6, String str) {
        try {
            this.A01.AUw(c5623Dm6, str);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onPrepared callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AVF(boolean z, boolean z2) {
        try {
            this.A01.AVF(z, z2);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onRelease(isEvicted = %s) callback", e, BV4.A1Z(z));
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AVg(long j, long j2) {
        try {
            this.A01.AVg(j, j2);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onSeekProcessed callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AVi(C5623Dm6 c5623Dm6, String str, long j) {
        try {
            this.A01.AVi(c5623Dm6, str, j);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onSeeking callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AVk(long j) {
        try {
            this.A01.AVk(j);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed send onServicePlayerListenerDetached() callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AWI() {
        this.A01.AWI();
    }

    @Override // X.InterfaceC5638DmM
    public final void AWZ(List<DwN> list) {
        try {
            this.A01.AWZ(list);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send gaps changed callback", e, BV4.A1W());
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/DoI;LX/DoI;Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
    @Override // X.InterfaceC5638DmM
    public final void AWd(C5723DoI c5723DoI, C5723DoI c5723DoI2, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        try {
            this.A01.AWd(c5723DoI, c5723DoI2, str, str2, str3, str4, str5, str6, list);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed send onTrackSelectionFallback() callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AXC(String str, String str2, String str3, String str4) {
        try {
            this.A01.AXC(str, str2, str3, str4);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onVideoIssueDetected callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AXG(int i, int i2, float f) {
        try {
            this.A01.AXG(i, i2, f);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onVideoSizeChanged(width = %d, height = %d) callback", e, BV5.A1Z(i, i2));
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AXO(String str) {
        Dlv dlv;
        HeroPlayerSetting heroPlayerSetting = this.A00;
        if (heroPlayerSetting == null || (dlv = heroPlayerSetting.gen) == null || !dlv.enable_warmup_completed_forwarding) {
            return;
        }
        try {
            this.A01.AXO(str);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onWarmupCompleted callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AXQ(String str, String str2, String str3) {
        try {
            this.A01.AXQ(str, str2, str3);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onWarn callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void onCues(List<DXC> list) {
        try {
            this.A01.onCues(list);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed send onCues(list = %s) callback", e, list);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void onImfEventEmsgReceived(byte[] bArr, String str, long j) {
        try {
            this.A01.onImfEventEmsgReceived(bArr, str, j);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onImfEventEmsgReceived callback", e, BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void onVolumeChanged(float f) {
        try {
            this.A01.onVolumeChanged(f);
        } catch (IllegalStateException e) {
            AbstractC5718DoA.A00(this.A02, "Failed to send onVolumeChanged callback", e, BV4.A1W());
        }
    }

    public C5622Dm5(InterfaceC5638DmM interfaceC5638DmM, InterfaceC5860Dqu interfaceC5860Dqu, HeroPlayerSetting heroPlayerSetting) {
        if (interfaceC5638DmM == null) {
            throw C60O.A0i("HeroServicePlayerListener cannot be null");
        }
        this.A02 = interfaceC5860Dqu;
        this.A01 = interfaceC5638DmM;
        this.A00 = heroPlayerSetting;
    }

    @Override // X.InterfaceC5638DmM
    public final /* synthetic */ void ATb(String str, Map map) {
    }
}
