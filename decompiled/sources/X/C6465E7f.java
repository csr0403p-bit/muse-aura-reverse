package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.E7f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6465E7f extends BroadcastReceiver {
    public final E80 A00;
    public final InterfaceC6459E6s A01;
    public final /* synthetic */ C6464E7e A02;

    public C6465E7f(InterfaceC6459E6s interfaceC6459E6s, E80 e80, C6464E7e c6464E7e) {
        this.A02 = c6464E7e;
        this.A01 = interfaceC6459E6s;
        this.A00 = e80;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (BV5.A1Q(intent, "android.media.AUDIO_BECOMING_NOISY")) {
            BV6.A1C(this.A01, new Runnable() { // from class: X.E7u
                public static final String __redex_internal_original_name = "AudioBecomingNoisyManager$AudioBecomingNoisyReceiver$$ExternalSyntheticLambda0";

                @Override // java.lang.Runnable
                public final void run() {
                    C6465E7f c6465E7f = this.A00;
                    if (c6465E7f.A02.A00) {
                        c6465E7f.A00.ARk();
                    }
                }
            });
        }
    }
}
