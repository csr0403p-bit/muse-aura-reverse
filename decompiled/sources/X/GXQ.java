package X;

import com.facebook.rsys.audio.gen.AudioOutputRoute;

/* loaded from: classes6.dex */
public final class GXQ {
    public GXX A00;
    public final GXO A01;

    public final void A00(GXX gxx) {
        AudioOutputRoute audioOutputRoute;
        if (gxx != this.A00) {
            this.A00 = gxx;
            GXO gxo = this.A01;
            if (gxx == null) {
                audioOutputRoute = AudioOutputRoute.UNKNOWN;
            } else {
                int iOrdinal = gxx.ordinal();
                if (iOrdinal == 0) {
                    audioOutputRoute = AudioOutputRoute.EARPIECE;
                } else if (iOrdinal == 3) {
                    audioOutputRoute = AudioOutputRoute.HEADSET;
                } else if (iOrdinal == 2) {
                    audioOutputRoute = AudioOutputRoute.BLUETOOTH;
                } else {
                    if (iOrdinal != 1) {
                        throw C3cG.A0q();
                    }
                    audioOutputRoute = AudioOutputRoute.SPEAKER;
                }
            }
            if (gxo.A0F) {
                return;
            }
            InterfaceC9648GXn interfaceC9648GXn = gxo.A0C;
            if (interfaceC9648GXn != null) {
                InterfaceC9648GXn.A00(interfaceC9648GXn, FGI.A0M("product route update ", audioOutputRoute.name));
            }
            gxo.A0L = audioOutputRoute;
            GXi gXi = new GXi(audioOutputRoute, gxo);
            if (gxo.A01 != null) {
                gXi.run();
            } else {
                gxo.A0D.add(gXi);
            }
        }
    }

    public GXQ(GXO gxo) {
        this.A01 = gxo;
    }
}
