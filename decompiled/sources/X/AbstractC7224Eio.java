package X;

import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import java.io.Closeable;

/* renamed from: X.Eio, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7224Eio extends AbstractC7225Eip implements Closeable, Drawable.Callback, InterfaceC7291EkI, InterfaceC7293EkK, InterfaceC7295EkM, InterfaceC7300EkR {
    public static final ADq A01 = new ADq(0, 3);
    public Rect A00;

    public AbstractC7224Eio() {
        super(new Drawable[4]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A05(float f) {
        Animatable animatable;
        Animatable animatable2;
        Drawable drawableA01 = A01(2);
        if (drawableA01 != 0) {
            boolean z = drawableA01 instanceof Animatable;
            if (f >= 0.999f) {
                if (z && (animatable2 = (Animatable) drawableA01) != null) {
                    animatable2.stop();
                }
            } else if (z && (animatable = (Animatable) drawableA01) != null) {
                animatable.start();
            }
            drawableA01.setLevel(Math.round(f * 10000.0f));
        }
    }

    public void close() {
        Animatable animatable;
        Object objA01 = A01(0);
        if ((objA01 instanceof Animatable) && (animatable = (Animatable) objA01) != null) {
            animatable.stop();
        }
        ADq aDq = A01;
        int i = aDq.A00;
        int i2 = aDq.A01;
        if (i > i2) {
            return;
        }
        while (true) {
            A02(null, i);
            if (i == i2) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void A04() {
        ((AbstractC7225Eip) this).A01++;
        boolean[] zArr = this.A0A;
        zArr[0] = false;
        int[] iArr = this.A08;
        iArr[0] = 0;
        invalidateSelf();
        zArr[2] = false;
        iArr[2] = 0;
        invalidateSelf();
        A03(1);
        ((AbstractC7225Eip) this).A01--;
        invalidateSelf();
    }

    public final void A06(int i) {
        ((AbstractC7225Eip) this).A00 = i;
        if (((AbstractC7225Eip) this).A02 == 1) {
            ((AbstractC7225Eip) this).A02 = 0;
        }
        ((AbstractC7225Eip) this).A01++;
        ((AbstractC7225Eip) this).A02 = 0;
        boolean[] zArr = this.A0A;
        zArr[0] = false;
        invalidateSelf();
        ((AbstractC7225Eip) this).A02 = 0;
        zArr[2] = false;
        invalidateSelf();
        ((AbstractC7225Eip) this).A02 = 0;
        zArr[1] = true;
        invalidateSelf();
        ((AbstractC7225Eip) this).A01--;
        invalidateSelf();
    }
}
