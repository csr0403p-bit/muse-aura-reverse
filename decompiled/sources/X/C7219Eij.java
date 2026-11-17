package X;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.Eij, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7219Eij extends AbstractC7224Eio implements InterfaceC7248EjS<EfF<InterfaceC7064EfB>> {
    public static final Handler A0H = C60O.A02();
    public static final C7238Ej2 A0I;
    public int A00;
    public long A01;
    public EfF<InterfaceC7064EfB> A02;
    public InterfaceC7236Ej0<EfF<InterfaceC7064EfB>> A03;
    public Ej4 A04;
    public C7226Eiq A05;
    public C7218Eii A06;
    public Object A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final C7242EjD A0C;
    public final C7235Eiz A0D;
    public final InterfaceC7250EjU A0E;
    public final Runnable A0F;
    public final EhD A0G;

    public final synchronized long A07() {
        return this.A01;
    }

    @Override // X.AbstractC7224Eio, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        A09();
        A08();
        this.A01 = 0L;
        super.close();
        ((AbstractC7225Eip) this).A02 = 2;
        int[] iArr = super.A09;
        Arrays.fill(iArr, 0);
        iArr[0] = 255;
        int[] iArr2 = super.A08;
        Arrays.fill(iArr2, 0);
        iArr2[0] = 255;
        boolean[] zArr = super.A0A;
        Arrays.fill(zArr, false);
        zArr[0] = true;
        invalidateSelf();
        this.A0C.A01(C7254Ejd.A00);
        EfF<InterfaceC7064EfB> efF = this.A02;
        if (efF != null) {
            efF.close();
        }
        this.A02 = null;
        this.A06 = null;
        InterfaceC7236Ej0<EfF<InterfaceC7064EfB>> interfaceC7236Ej0 = this.A03;
        if (interfaceC7236Ej0 != null) {
            interfaceC7236Ej0.A6Q();
        }
        this.A03 = null;
        this.A09 = false;
        this.A05 = null;
        this.A00 = 1;
        this.A0A = false;
        this.A0B = false;
        ((AbstractC7225Eip) this).A04 = null;
        this.A04 = null;
        try {
            this.A0D.A03 = null;
        } catch (IOException unused) {
        }
    }

    @Override // X.InterfaceC7248EjS
    public final void onFailure(InterfaceC7236Ej0<EfF<InterfaceC7064EfB>> interfaceC7236Ej0) {
        C7384Etj.A0Y(interfaceC7236Ej0, 0);
        C7226Eiq c7226Eiq = this.A05;
        C7218Eii c7218Eii = this.A06;
        if (interfaceC7236Ej0 != this.A03 || c7226Eiq == null || c7218Eii == null) {
            return;
        }
        c7218Eii.A02(interfaceC7236Ej0, c7226Eiq, this);
    }

    @Override // X.InterfaceC7248EjS
    public final void onNewResult(InterfaceC7236Ej0<EfF<InterfaceC7064EfB>> interfaceC7236Ej0) {
        C7384Etj.A0Y(interfaceC7236Ej0, 0);
        C7226Eiq c7226Eiq = this.A05;
        C7218Eii c7218Eii = this.A06;
        if (interfaceC7236Ej0 != this.A03 || c7226Eiq == null || c7218Eii == null || !interfaceC7236Ej0.ANI()) {
            return;
        }
        EfF<InterfaceC7064EfB> efFAJm = interfaceC7236Ej0.AJm();
        try {
            if (EfF.A01(efFAJm)) {
                C7218Eii.A01(efFAJm, interfaceC7236Ej0, c7226Eiq, c7218Eii, this, false);
            } else {
                c7218Eii.A02(interfaceC7236Ej0, c7226Eiq, this);
            }
        } finally {
            if (efFAJm != null) {
                efFAJm.close();
            }
        }
    }

    @Override // X.InterfaceC7248EjS
    public final void onProgressUpdate(InterfaceC7236Ej0<EfF<InterfaceC7064EfB>> interfaceC7236Ej0) {
        C7384Etj.A0Y(interfaceC7236Ej0, 0);
        C7226Eiq c7226Eiq = this.A05;
        C7218Eii c7218Eii = this.A06;
        if (interfaceC7236Ej0 != this.A03 || c7226Eiq == null || c7218Eii == null || interfaceC7236Ej0.AOQ()) {
            return;
        }
        A05(interfaceC7236Ej0.getProgress());
    }

    public final void A08() {
        if (this.A08) {
            A0H.removeCallbacks(this.A0F);
            this.A08 = false;
        }
    }

    public final void A09() {
        C7238Ej2 c7238Ej2 = A0I;
        synchronized (c7238Ej2.A03) {
            c7238Ej2.A00.remove(this);
        }
    }

    static {
        C7238Ej2 c7238Ej2;
        synchronized (C7238Ej2.A06) {
            c7238Ej2 = C7238Ej2.A05;
            if (c7238Ej2 == null) {
                c7238Ej2 = new C7238Ej2();
                C7238Ej2.A05 = c7238Ej2;
            }
            C7384Etj.A0X(c7238Ej2);
        }
        A0I = c7238Ej2;
    }

    public C7219Eij(EhD ehD) {
        C7235Eiz c7235Eiz = new C7235Eiz();
        this.A0D = c7235Eiz;
        if (c7235Eiz.A01 != null) {
            throw BV4.A0a("trying to set localImagePerfStateListener without a localPerfStatePublisher");
        }
        this.A0G = ehD;
        this.A0F = new RunnableC7259Ejj(this);
        InterfaceC7005EeA<Boolean> interfaceC7005EeA = C7242EjD.A06;
        this.A0C = new C7242EjD(C7254Ejd.A00, InterfaceC8647Fhz.A01);
        this.A0E = new DVU(this);
        this.A00 = 1;
    }

    public final void A0A() {
        C7226Eiq c7226Eiq;
        A08();
        C7238Ej2 c7238Ej2 = A0I;
        if (BV5.A0s() == Thread.currentThread()) {
            synchronized (c7238Ej2.A03) {
                if (!c7238Ej2.A00.contains(this)) {
                    ArrayList<InterfaceC7295EkM> arrayList = c7238Ej2.A00;
                    arrayList.add(this);
                    boolean zA1Q = BV7.A1Q(arrayList.size());
                    if (zA1Q) {
                        c7238Ej2.A02.post(c7238Ej2.A04);
                    }
                }
            }
        } else {
            close();
        }
        if (this.A06 == null || (c7226Eiq = this.A05) == null) {
            return;
        }
        this.A0D.A03(C7218Eii.A00(null, null, c7226Eiq, this), c7226Eiq, A07());
    }

    /* JADX WARN: Incorrect return type in method signature: (Landroid/graphics/drawable/Drawable;LX/EfF<LX/EfB;>;)Landroid/graphics/drawable/Drawable; */
    public final void A0B(Drawable drawable, EfF efF) {
        A09();
        A08();
        C7242EjD c7242EjD = this.A0C;
        if (drawable != c7242EjD) {
            c7242EjD.A01(C7254Ejd.A00);
        }
        EfF<InterfaceC7064EfB> efF2 = this.A02;
        if (efF2 != null) {
            efF2.close();
        }
        this.A02 = BV5.A0G(efF);
        A02(drawable, 1);
    }

    @Override // X.Ek7, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // X.Ek7, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }
}
