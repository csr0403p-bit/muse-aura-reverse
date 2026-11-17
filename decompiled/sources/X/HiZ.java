package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes6.dex */
public final class HiZ implements Runnable {
    public static final String __redex_internal_original_name = "CDSBloksBottomSheetController$performFragmentTask$1";
    public Throwable A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Handler A02;
    public final /* synthetic */ Fragment A03;
    public final /* synthetic */ Runnable A04;

    public HiZ(Handler handler, Fragment fragment, Runnable runnable, long j) {
        this.A03 = fragment;
        this.A01 = j;
        this.A02 = handler;
        this.A04 = runnable;
        Thread threadCurrentThread = Thread.currentThread();
        this.A00 = new Throwable(FGI.A0L("Runnable instantiated on thread id: ", threadCurrentThread.getId(), ", name: ", threadCurrentThread.getName()));
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Fragment fragment = this.A03;
            if (fragment != null) {
                FragmentActivity activity = fragment.getActivity();
                if (fragment.isAdded() && !fragment.mDetached && !fragment.mRemoving && activity != null && !activity.isFinishing() && !activity.isDestroyed() && SystemClock.uptimeMillis() <= this.A01) {
                    Context context = fragment.getContext();
                    boolean z = true;
                    boolean zA1X = AnonymousClass002.A1X(fragment.mView);
                    boolean zA1Y = AnonymousClass002.A1Y(context);
                    if (!(context instanceof ContextWrapper) || ((ContextWrapper) context).getBaseContext() != null) {
                        z = false;
                    }
                    if (!zA1X || zA1Y || z) {
                        this.A02.post(this);
                        return;
                    } else {
                        this.A04.run();
                        return;
                    }
                }
            }
            FFI.A01(null, "Dropping deferred bottom-sheet task: host dead or wait budget exhausted", null);
        } catch (Throwable th) {
            Throwable th2 = this.A00;
            CFK.A06("CDSThreadTracing", "--- start debug trace");
            CFK.A0A("CDSThreadTracing", "Thread tracing stacktrace", th2);
            CFK.A06("CDSThreadTracing", "--- end debug trace");
            throw th;
        }
    }

    public static void A00(Handler handler, Fragment fragment, Runnable runnable) {
        handler.post(new HiZ(handler, fragment, runnable, 5000 + SystemClock.uptimeMillis()));
    }
}
