package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;

/* loaded from: classes5.dex */
public final class DpL {
    public static AudioManager A00;

    public static synchronized AudioManager A00(Context context) {
        AudioManager audioManager;
        final Context applicationContext = context.getApplicationContext();
        if (null != applicationContext) {
            A00 = null;
        }
        audioManager = A00;
        if (audioManager == null) {
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null || looperMyLooper == Looper.getMainLooper()) {
                audioManager = (AudioManager) applicationContext.getSystemService("audio");
                A00 = audioManager;
            } else {
                final C5778DpK c5778DpK = new C5778DpK();
                C5341Dgk.A00().execute(new Runnable() { // from class: X.DqS
                    public static final String __redex_internal_original_name = "AudioManagerCompat$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = applicationContext;
                        C5778DpK c5778DpK2 = c5778DpK;
                        DpL.A00 = (AudioManager) context2.getSystemService("audio");
                        c5778DpK2.A02();
                    }
                });
                c5778DpK.A00();
                audioManager = A00;
            }
            audioManager.getClass();
        }
        return audioManager;
    }
}
