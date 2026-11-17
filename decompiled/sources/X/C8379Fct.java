package X;

import android.content.DialogInterface;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.Fct, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8379Fct extends AEs {
    public int A00 = 0;
    public DialogInterface.OnClickListener A01;
    public C8389Fd4 A02;
    public AbstractC8390Fd5 A03;
    public EX8 A04;
    public C8328Fbu A05;
    public C8392Fd8 A06;
    public C2934BpC<C8381Fcw> A07;
    public C2934BpC<CharSequence> A08;
    public C2934BpC<C8391Fd6> A09;
    public C2934BpC<CharSequence> A0A;
    public C2934BpC<Integer> A0B;
    public C2934BpC<Boolean> A0C;
    public C2934BpC<Boolean> A0D;
    public C2934BpC<Boolean> A0E;
    public Executor A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;

    public final void A04(boolean z) {
        C2934BpC<Boolean> c2934BpC = this.A0E;
        if (c2934BpC == null) {
            c2934BpC = new C2934BpC<>();
            this.A0E = c2934BpC;
        }
        A03(c2934BpC, Boolean.valueOf(z));
    }

    public static <T> void A03(C2934BpC<T> c2934BpC, T t) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            c2934BpC.A0A(t);
        } else {
            c2934BpC.A09(t);
        }
    }
}
