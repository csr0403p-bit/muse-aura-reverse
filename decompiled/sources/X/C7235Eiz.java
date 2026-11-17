package X;

import android.graphics.drawable.Drawable;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.Eiz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7235Eiz {
    public InterfaceC7265Ejp<C2eL> A00 = C7255Eje.A00;
    public C7263Ejn A01;
    public C7235Eiz A02;
    public Ej6 A03;

    public final void A00(Drawable drawable, Ej4 ej4, C7226Eiq c7226Eiq, C2eL c2eL, int i, long j) {
        C7235Eiz c7235Eiz = this.A02;
        if (c7235Eiz != null) {
            c7235Eiz.A00(drawable, ej4, c7226Eiq, c2eL, i, j);
        }
        Ej6 ej6 = this.A03;
        if (ej6 != null) {
            ej6.onFinalImageSet(j, i, c2eL, drawable);
        }
        AtomicLong atomicLong = AbstractC7261Ejl.A00;
    }

    public final void A01(Drawable drawable, Ej4 ej4, C7226Eiq c7226Eiq, Throwable th, long j) {
        C7235Eiz c7235Eiz = this.A02;
        if (c7235Eiz != null) {
            c7235Eiz.A01(drawable, ej4, c7226Eiq, th, j);
        }
        Ej6 ej6 = this.A03;
        if (ej6 != null) {
            ej6.onFailure(j, drawable, th);
        }
        AtomicLong atomicLong = AbstractC7261Ejl.A00;
    }

    public final void A02(Drawable drawable, C7226Eiq c7226Eiq, long j) {
        C7235Eiz c7235Eiz = this.A02;
        if (c7235Eiz != null) {
            c7235Eiz.A02(drawable, c7226Eiq, j);
        }
        Ej6 ej6 = this.A03;
        if (ej6 != null) {
            ej6.onPlaceholderSet(j, drawable);
        }
    }

    public final void A03(Ej4 ej4, C7226Eiq c7226Eiq, long j) {
        C7235Eiz c7235Eiz = this.A02;
        if (c7235Eiz != null) {
            c7235Eiz.A03(ej4, c7226Eiq, j);
        }
        Ej6 ej6 = this.A03;
        if (ej6 != null) {
            ej6.onRelease(j);
        }
        AtomicLong atomicLong = AbstractC7261Ejl.A00;
    }

    public final void A04(Ej4 ej4, C7226Eiq c7226Eiq, Object obj, long j) {
        C7235Eiz c7235Eiz = this.A02;
        if (c7235Eiz != null) {
            c7235Eiz.A04(ej4, c7226Eiq, obj, j);
        }
        Ej6 ej6 = this.A03;
        if (ej6 != null) {
            ej6.onSubmit(j, obj);
        }
        AtomicLong atomicLong = AbstractC7261Ejl.A00;
    }

    public final void A05(C7226Eiq c7226Eiq, C2eL c2eL, long j) {
        C7235Eiz c7235Eiz = this.A02;
        if (c7235Eiz != null) {
            c7235Eiz.A05(c7226Eiq, c2eL, j);
        }
        Ej6 ej6 = this.A03;
        if (ej6 != null) {
            ej6.onIntermediateImageSet(j, c2eL);
        }
        AtomicLong atomicLong = AbstractC7261Ejl.A00;
    }

    public final void A06(C7226Eiq c7226Eiq, Throwable th, long j) {
        C7235Eiz c7235Eiz = this.A02;
        if (c7235Eiz != null) {
            c7235Eiz.A06(c7226Eiq, th, j);
        }
        Ej6 ej6 = this.A03;
        if (ej6 != null) {
            ej6.onIntermediateImageFailed(j, th);
        }
        AtomicLong atomicLong = AbstractC7261Ejl.A00;
    }
}
