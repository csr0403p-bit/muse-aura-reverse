package X;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;

/* renamed from: X.Fgl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8586Fgl implements Runnable, InterfaceExecutorC8619FhP, ViewTreeObserver.OnDrawListener {
    public static final String __redex_internal_original_name = "ComponentActivity$ReportFullyDrawnExecutorImpl";
    public Runnable A00;
    public boolean A01;
    public final long A02 = SystemClock.uptimeMillis() + 10000;
    public final /* synthetic */ ComponentActivity A03;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C7384Etj.A0Y(runnable, 0);
        this.A00 = runnable;
        View viewA0b = AbstractC7607F5u.A0b(this.A03);
        if (!this.A01) {
            viewA0b.postOnAnimation(new Runnable() { // from class: X.FhJ
                public static final String __redex_internal_original_name = "ComponentActivity$ReportFullyDrawnExecutorImpl$$ExternalSyntheticLambda0";

                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC8586Fgl runnableC8586Fgl = this.A00;
                    Runnable runnable2 = runnableC8586Fgl.A00;
                    if (runnable2 != null) {
                        runnable2.run();
                        runnableC8586Fgl.A00 = null;
                    }
                }
            });
        } else if (C3cH.A1K()) {
            viewA0b.invalidate();
        } else {
            viewA0b.postInvalidate();
        }
    }

    public RunnableC8586Fgl(ComponentActivity componentActivity) {
        this.A03 = componentActivity;
    }

    @Override // X.InterfaceExecutorC8619FhP
    public final void AiI(View view) {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        ComponentActivity componentActivity;
        boolean z;
        Runnable runnable = this.A00;
        if (runnable != null) {
            runnable.run();
            this.A00 = null;
            componentActivity = this.A03;
            C8593Fgu fullyDrawnReporter = componentActivity.getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.A01) {
                z = fullyDrawnReporter.A00;
            }
            if (!z) {
                return;
            } else {
                this.A01 = false;
            }
        } else {
            if (SystemClock.uptimeMillis() <= this.A02) {
                return;
            }
            this.A01 = false;
            componentActivity = this.A03;
        }
        AbstractC7607F5u.A0a(componentActivity).post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC7607F5u.A0a(this.A03).getViewTreeObserver().removeOnDrawListener(this);
    }
}
