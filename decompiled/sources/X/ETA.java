package X;

import com.crossapp.tigonhttp.noise.TigonNoiseGatewayListener;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class ETA {
    public static void $default$onCloseWithOutcomeNative(TigonNoiseGatewayListener tigonNoiseGatewayListener, int i, String str) {
        C7384Etj.A0Y(str, 2);
        tigonNoiseGatewayListener.onCloseWithOutcome(i != 3 ? i != 4 ? ET9.A06 : ET9.A03 : ET9.A02, str);
    }

    public static void $default$onReadyWithOutcomeNative(TigonNoiseGatewayListener tigonNoiseGatewayListener, int i) {
        ET9 et9;
        if (i == 1) {
            et9 = ET9.A04;
        } else {
            if (i != 2) {
                tigonNoiseGatewayListener.onCloseWithOutcome(ET9.A06, "noise.handshake.private_auth.invalid_ready_outcome");
                return;
            }
            et9 = ET9.A05;
        }
        tigonNoiseGatewayListener.onReadyWithOutcome(et9);
    }
}
