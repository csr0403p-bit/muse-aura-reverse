package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Looper;
import android.util.Log;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.BfM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2605BfM extends BfD {
    public static final C2605BfM $redex_init_class = null;
    public Rational A00;
    public Bi5 A01;
    public Bi1 A02;
    public BgX A03;
    public C2625Bfs A04;
    public C2766Bkc A05;
    public final int A06;
    public final int A07;
    public final AtomicReference<Integer> A08;
    public final InterfaceC2795BlW A09;

    static {
        C2601Bez c2601Bez = Bf4.A02;
    }

    public static final int A00(C2605BfM c2605BfM) {
        int iA07;
        synchronized (c2605BfM.A08) {
            Bf6 bf6 = (Bf6) ((BfD) c2605BfM).A05;
            iA07 = BV6.A07(bf6.A00.Abl(Bf6.A03, 2));
        }
        return iA07;
    }

    public static void A02(C2605BfM c2605BfM) {
        AtomicReference<Integer> atomicReference = c2605BfM.A08;
        synchronized (atomicReference) {
            if (atomicReference.get() == null) {
                c2605BfM.A0A().AdR(A00(c2605BfM));
            }
        }
    }

    public final String toString() {
        return FGI.A0M("ImageCapture:", A0I());
    }

    public C2605BfM(Bf6 bf6) {
        super(bf6);
        this.A08 = BV4.A16(null);
        this.A00 = null;
        this.A09 = new C2621Bfn(this);
        Bf6 bf62 = (Bf6) super.A05;
        AbstractC2531BdI<Integer> abstractC2531BdI = Bf6.A05;
        this.A06 = bf62.A00.A74(abstractC2531BdI) ? AnonymousClass001.A0F(bf62.A00.Abk(abstractC2531BdI)) : 1;
        AbstractC2531BdI<Integer> abstractC2531BdI2 = Bf6.A04;
        C2584Beg c2584Beg = bf62.A00;
        this.A07 = AnonymousClass001.A0F(c2584Beg.Abl(abstractC2531BdI2, 0));
        this.A05 = new C2766Bkc((InterfaceC2787BlA) c2584Beg.Abl(Bf6.A0C, null));
    }

    public static BgX A01(C2605BfM c2605BfM, Bf6 bf6, AbstractC2481Bc8 abstractC2481Bc8, String str) {
        BoT.A00();
        Log.d("ImageCapture", String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, abstractC2481Bc8));
        C2492BcJ c2492BcJ = (C2492BcJ) abstractC2481Bc8;
        Size size = c2492BcJ.A01;
        InterfaceC2610Bfb interfaceC2610BfbA0B = c2605BfM.A0B();
        interfaceC2610BfbA0B.getClass();
        boolean z = !interfaceC2610BfbA0B.AG8();
        Bi5 bi5 = c2605BfM.A01;
        if (bi5 != null) {
            BeS.A07(z, null);
            bi5.A00();
        }
        if (AnonymousClass001.A1X(((BfD) c2605BfM).A05.Abl(Bf6.A0A, false))) {
            c2605BfM.A0B().AFS().Abl(InterfaceC2562Bdq.A03, null);
        }
        c2605BfM.A01 = new Bi5(size, bf6, z);
        Bi1 bi1 = c2605BfM.A02;
        if (bi1 == null) {
            bi1 = new Bi1(c2605BfM.A09);
            c2605BfM.A02 = bi1;
        }
        Bi5 bi52 = c2605BfM.A01;
        BoT.A00();
        bi1.A00 = bi52;
        BoT.A00();
        Bi6 bi6 = bi52.A01;
        BoT.A00();
        C2863BnN c2863BnN = bi6.A00;
        BeS.A07(AnonymousClass002.A1X(c2863BnN), "The ImageReader is not initialized.");
        synchronized (c2863BnN.A05) {
            c2863BnN.A01 = bi1;
        }
        Bi5 bi53 = c2605BfM.A01;
        BgX bgXA00 = BgX.A00(size, bi53.A03);
        BjC bjC = bi53.A00.A01;
        bjC.getClass();
        bgXA00.A02(C2507Bcd.A07, bjC);
        if (c2605BfM.A06 == 2 && !c2492BcJ.A04) {
            c2605BfM.A0A().A43(bgXA00);
        }
        InterfaceC2585Beh interfaceC2585Beh = c2492BcJ.A03;
        if (interfaceC2585Beh != null) {
            bgXA00.A04.A02(interfaceC2585Beh);
        }
        C2625Bfs c2625Bfs = c2605BfM.A04;
        if (c2625Bfs != null) {
            c2625Bfs.A00.set(true);
        }
        C2625Bfs c2625Bfs2 = new C2625Bfs(new C7582F4v(c2605BfM, 2));
        c2605BfM.A04 = c2625Bfs2;
        bgXA00.A02 = c2625Bfs2;
        return bgXA00;
    }

    public final void A0X(final BiW biW, final C2771Bkn c2771Bkn, final Executor executor) {
        int iA0F;
        int i;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            BoS.A00().execute(new Runnable() { // from class: X.Bfq
                public static final String __redex_internal_original_name = "ImageCapture$$ExternalSyntheticLambda3";

                @Override // java.lang.Runnable
                public final void run() {
                    this.A0X(biW, c2771Bkn, executor);
                }
            });
            return;
        }
        BoT.A00();
        if (A00(this) == 3 && this.A05.A02 == null) {
            throw C60O.A0i("ScreenFlash not set for FLASH_MODE_SCREEN");
        }
        Log.d("ImageCapture", "takePictureInternal");
        InterfaceC2610Bfb interfaceC2610BfbA0B = A0B();
        if (interfaceC2610BfbA0B == null) {
            ImageCaptureException imageCaptureException = new ImageCaptureException(4, BV8.A0u(this, C60O.A0x("Not bound to a valid Camera [")), null);
            if (biW == null) {
                throw C60O.A0i("Must have either in-memory or on-disk callback.");
            }
            biW.onError(imageCaptureException);
            return;
        }
        Bi1 bi1 = this.A02;
        bi1.getClass();
        Rect rectA08 = super.A01;
        AbstractC2481Bc8 abstractC2481Bc8 = super.A04;
        Size size = abstractC2481Bc8 != null ? ((C2492BcJ) abstractC2481Bc8).A01 : null;
        size.getClass();
        if (rectA08 == null) {
            Rational rational = this.A00;
            if (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) {
                rectA08 = BfD.A08(size);
            } else {
                InterfaceC2610Bfb interfaceC2610BfbA0B2 = A0B();
                interfaceC2610BfbA0B2.getClass();
                int iA09 = A09(interfaceC2610BfbA0B2, false);
                Rational rational2 = new Rational(this.A00.getDenominator(), this.A00.getNumerator());
                if ((BfO.A03(iA09) || (rational2 = this.A00) != null) && rational2.floatValue() > 0.0f && !rational2.isNaN()) {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    float f = width;
                    float f2 = height;
                    float f3 = f / f2;
                    int numerator = rational2.getNumerator();
                    int denominator = rational2.getDenominator();
                    int i2 = 0;
                    if (rational2.floatValue() > f3) {
                        int iRound = Math.round((f / numerator) * denominator);
                        i = (height - iRound) / 2;
                        height = iRound;
                    } else {
                        int iRound2 = Math.round((f2 / denominator) * numerator);
                        i2 = (width - iRound2) / 2;
                        width = iRound2;
                        i = 0;
                    }
                    rectA08 = new Rect(i2, i, width + i2, height + i);
                } else {
                    AbstractC2875Bni.A03("ImageUtil", "Invalid view ratio.");
                    rectA08 = null;
                }
                rectA08.getClass();
            }
        }
        Matrix matrix = super.A00;
        int iA092 = A09(interfaceC2610BfbA0B, false);
        Bf6 bf6 = (Bf6) super.A05;
        AbstractC2531BdI<Integer> abstractC2531BdI = Bf6.A07;
        if (bf6.A00.A74(abstractC2531BdI)) {
            iA0F = AnonymousClass001.A0F(bf6.A00.Abk(abstractC2531BdI));
        } else {
            int i3 = this.A06;
            if (i3 == 0) {
                iA0F = 100;
            } else {
                if (i3 != 1 && i3 != 2) {
                    throw C3cG.A0Q(FGI.A0I("CaptureMode ", i3, " is invalid"));
                }
                iA0F = 95;
            }
        }
        int i4 = this.A06;
        List listUnmodifiableList = Collections.unmodifiableList(this.A03.A07);
        BeS.A06(AnonymousClass002.A1Y(biW) == AnonymousClass002.A1Y(c2771Bkn), "onDiskCallback and outputFileOptions should be both null or both non-null.");
        BeS.A06(!AnonymousClass002.A1Y(biW), "One and only one on-disk or in-memory callback should be present.");
        C2699Bi3 c2699Bi3 = new C2699Bi3(matrix, rectA08, biW, c2771Bkn, listUnmodifiableList, executor, iA092, iA0F, i4);
        BoT.A00();
        bi1.A04.offer(c2699Bi3);
        bi1.A01();
    }
}
