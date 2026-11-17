package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;

/* renamed from: X.E7e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6464E7e {
    public boolean A00;
    public final Context A01;
    public final C6465E7f A02;
    public final InterfaceC6459E6s A03;

    public final void A00(boolean z) {
        boolean z2;
        if (z != this.A00) {
            InterfaceC6459E6s interfaceC6459E6s = this.A03;
            if (z) {
                BV6.A1C(interfaceC6459E6s, new Runnable() { // from class: X.E7s
                    public static final String __redex_internal_original_name = "AudioBecomingNoisyManager$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C6464E7e c6464E7e = this.A00;
                        c6464E7e.A01.registerReceiver(c6464E7e.A02, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                    }
                });
                z2 = true;
            } else {
                BV6.A1C(interfaceC6459E6s, new Runnable() { // from class: X.E7t
                    public static final String __redex_internal_original_name = "AudioBecomingNoisyManager$$ExternalSyntheticLambda1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C6464E7e c6464E7e = this.A00;
                        c6464E7e.A01.unregisterReceiver(c6464E7e.A02);
                    }
                });
                z2 = false;
            }
            this.A00 = z2;
        }
    }

    public C6464E7e(Context context, Looper looper, Looper looper2, E7C e7c, E80 e80) {
        this.A01 = context.getApplicationContext();
        this.A03 = e7c.A7o(null, looper);
        this.A02 = new C6465E7f(e7c.A7o(null, looper2), e80, this);
    }
}
