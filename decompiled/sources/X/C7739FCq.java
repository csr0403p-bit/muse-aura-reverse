package X;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.FCq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7739FCq {
    public boolean A00;
    public boolean A01;
    public final Choreographer.FrameCallback A02;
    public final Runnable A03;
    public final Function0<Unit> A06;
    public final F0C A05 = C5322DgG.A01((Function0) new C6724EXi(48));
    public final ArrayList<RunnableC7742FCt> A04 = C3cG.A0h();

    public C7739FCq() {
        ChoreographerFrameCallbackC10645I0p choreographerFrameCallbackC10645I0p = new ChoreographerFrameCallbackC10645I0p(this, 3);
        this.A02 = choreographerFrameCallbackC10645I0p;
        if (AbstractC8162FXe.A03()) {
            Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC10645I0p);
        } else {
            ((Handler) this.A05.getValue()).postAtTime(new RunnableC7741FCs(this), SystemClock.uptimeMillis());
        }
        this.A06 = new FZP(this, 21);
        this.A03 = new RunnableC7740FCr(this);
    }
}
