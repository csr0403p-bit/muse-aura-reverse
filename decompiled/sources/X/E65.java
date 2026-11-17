package X;

import android.os.Looper;
import java.util.List;

/* loaded from: classes5.dex */
public interface E65 extends E76, Du7, InterfaceC6021DuE, GYb {
    void A3d(InterfaceC6481E7w interfaceC6481E7w);

    void ARR();

    void ARm();

    void ARn();

    void ARr();

    void ARs();

    void ASq(int i);

    void AVI(Object obj);

    void AVK(int i, boolean z);

    void AX5();

    void AX6();

    void AXA();

    void Ae5(Looper looper, Dn6 dn6);

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/Dy6;>;LX/Dy6;)V */
    void Ahx(Dy6 dy6, List list);

    void onAudioCodecError(Exception exc);

    void onAudioDisabled(C6173DxG c6173DxG);

    void onAudioEnabled(C6173DxG c6173DxG);

    void onAudioInputFormatChanged(C6154Dwx c6154Dwx, C2461Bbo c2461Bbo);

    void onAudioSinkError(Exception exc);

    void onAudioTrackInitialized(C6518EAw c6518EAw);

    void onAudioTrackReleased(C6518EAw c6518EAw);

    void onVideoCodecError(Exception exc);

    void onVideoDisabled(C6173DxG c6173DxG);

    void onVideoEnabled(C6173DxG c6173DxG);

    void onVideoInputFormatChanged(C6154Dwx c6154Dwx, C2461Bbo c2461Bbo);

    void release();
}
