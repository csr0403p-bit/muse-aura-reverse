package X;

import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* renamed from: X.FeH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8453FeH implements InterfaceC8470FeZ {
    public final AbstractC8466FeU A0A;
    public float A00 = 0.0f;
    public float A03 = Float.MAX_VALUE;
    public boolean A09 = false;
    public boolean A08 = false;
    public float A01 = Float.MAX_VALUE;
    public float A02 = -3.4028235E38f;
    public long A06 = 0;
    public final ArrayList<InterfaceC8468FeX> A0B = C3cG.A0h();
    public final ArrayList<InterfaceC8464FeS> A0C = C3cG.A0h();
    public float A04 = 1.0f;
    public C8456FeK A07 = null;
    public float A05 = Float.MAX_VALUE;

    public static final void A00(C8453FeH c8453FeH, float f) {
        ArrayList<InterfaceC8464FeS> arrayList;
        ((C8459FeN) c8453FeH.A0A).A00.A00 = f;
        int i = 0;
        while (true) {
            arrayList = c8453FeH.A0C;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                arrayList.get(i).ARi(c8453FeH.A03);
            }
            i++;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void A01(float f) {
        if (this.A08) {
            this.A05 = f;
            return;
        }
        C8456FeK c8456FeK = this.A07;
        if (c8456FeK == null) {
            c8456FeK = new C8456FeK(f);
            this.A07 = c8456FeK;
        }
        double d = f;
        c8456FeK.A02 = d;
        double d2 = (float) d;
        if (d2 > this.A01) {
            throw C8j3.A18("Final position of the spring cannot be greater than the max value.");
        }
        if (d2 < this.A02) {
            throw C8j3.A18("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.A04 * 0.75f);
        c8456FeK.A06 = dAbs;
        c8456FeK.A07 = dAbs * 62.5d;
        if (Thread.currentThread() != ((C8458FeM) C8454FeI.A00().A02).A00.getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.A08) {
            return;
        }
        this.A08 = true;
        if (!this.A09) {
            this.A03 = ((C8459FeN) this.A0A).A00.A00;
        }
        float f2 = this.A03;
        if (f2 > this.A01 || f2 < this.A02) {
            throw C60O.A0i("Starting value need to be in between min value and max value");
        }
        C8454FeI.A00().A02(this);
    }

    public C8453FeH(C8452FeG c8452FeG) {
        this.A0A = new C8459FeN(c8452FeG, this);
    }
}
