package X;

import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* loaded from: classes5.dex */
public final class Bx2 implements Dg5 {
    public final /* synthetic */ EmojiCompatInitializer A00;
    public final /* synthetic */ F2N A01;

    public Bx2(EmojiCompatInitializer emojiCompatInitializer, F2N f2n) {
        this.A00 = emojiCompatInitializer;
        this.A01 = f2n;
    }

    @Override // X.Dg5
    public final /* synthetic */ void onCreate(C1HY c1hy) {
    }

    @Override // X.Dg5
    public final /* synthetic */ void onDestroy(C1HY c1hy) {
    }

    @Override // X.Dg5
    public final /* synthetic */ void onPause(C1HY c1hy) {
    }

    @Override // X.Dg5
    public final void onResume(C1HY c1hy) {
        Handler.createAsync(Looper.getMainLooper()).postDelayed(new RunnableC6496E9a(), 500L);
        this.A01.A05(this);
    }

    @Override // X.Dg5
    public final /* synthetic */ void onStart(C1HY c1hy) {
    }

    @Override // X.Dg5
    public final /* synthetic */ void onStop(C1HY c1hy) {
    }
}
