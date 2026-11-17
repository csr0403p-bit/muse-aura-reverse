package X;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.display.DisplayManager;
import android.util.Rational;
import android.util.Size;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class BoY extends FrameLayout {
    public static final Ev4 A0G = Ev4.PERFORMANCE;
    public InterfaceC2544BdV A00;
    public AbstractC2922Bon A01;
    public Ev4 A02;
    public InterfaceC2924Bop A03;
    public AbstractC2908BoZ A04;
    public BlM A05;
    public Executor A06;
    public boolean A07;
    public final View.OnLayoutChangeListener A08;
    public final BgO A09;
    public final C2907BoX A0A;
    public final C2913Boe A0B;
    public final C2919Bok A0C;
    public final FR3 A0D;
    public final C2934BpC<EvM> A0E;
    public final AtomicReference<C2820Blx> A0F;

    public BoY(Context context) {
        super(context, null, 0, 0);
        Ev4 ev4 = A0G;
        this.A02 = ev4;
        C2907BoX c2907BoX = new C2907BoX();
        this.A0A = c2907BoX;
        this.A07 = true;
        this.A0E = new C2934BpC<>(EvM.IDLE);
        this.A0F = BV4.A15();
        this.A05 = new BlM(c2907BoX);
        this.A0B = new C2913Boe(this);
        this.A08 = new View.OnLayoutChangeListener() { // from class: X.Bog
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BoY boY = this.A00;
                if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
                    return;
                }
                boY.A01();
                BoT.A00();
                boY.getViewPort();
            }
        };
        this.A09 = new C2906BoV(this);
        BoT.A00();
        Resources.Theme theme = context.getTheme();
        int[] iArr = AbstractC2920Bol.A00;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(null, iArr, 0, 0);
        saveAttributeDataForStyleable(context, iArr, null, typedArrayObtainStyledAttributes, 0, 0);
        try {
            int integer = typedArrayObtainStyledAttributes.getInteger(1, c2907BoX.A05.mId);
            for (EnumC2911Boc enumC2911Boc : EnumC2911Boc.values()) {
                if (enumC2911Boc.mId == integer) {
                    setScaleType(enumC2911Boc);
                    int integer2 = typedArrayObtainStyledAttributes.getInteger(0, ev4.mId);
                    for (Ev4 ev42 : Ev4.values()) {
                        if (ev42.mId == integer2) {
                            setImplementationMode(ev42);
                            typedArrayObtainStyledAttributes.recycle();
                            this.A0D = new FR3(context, new InterfaceC2923Boo() { // from class: X.Boi
                            });
                            if (getBackground() == null) {
                                setBackgroundColor(getContext().getColor(R.color.black));
                            }
                            C2919Bok c2919Bok = new C2919Bok(context, null, 0, 0);
                            c2919Bok.setBackgroundColor(-1);
                            c2919Bok.setAlpha(0.0f);
                            c2919Bok.setElevation(Float.MAX_VALUE);
                            this.A0C = c2919Bok;
                            c2919Bok.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw BV5.A0Q("Unknown implementation mode id ", integer2);
                }
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A00(X.BmM r4, X.Ev4 r5) {
        /*
            X.Bfb r0 = r4.A06
            X.BdV r0 = r0.ADJ()
            java.lang.String r1 = r0.AGN()
            java.lang.String r0 = "androidx.camera.camera2.legacy"
            boolean r4 = r1.equals(r0)
            java.lang.Class<androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk> r1 = androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk.class
            X.Bch r0 = X.AbstractC2397BaA.A00
            X.BX1 r0 = r0.A01(r1)
            r3 = 0
            r2 = 1
            if (r0 != 0) goto L27
            java.lang.Class<androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk> r1 = androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk.class
            X.Bch r0 = X.AbstractC2397BaA.A00
            X.BX1 r1 = r0.A01(r1)
            r0 = 0
            if (r1 == 0) goto L28
        L27:
            r0 = 1
        L28:
            if (r4 != 0) goto L3c
            if (r0 != 0) goto L3c
            int r0 = r5.ordinal()
            if (r0 == 0) goto L3b
            if (r0 == r2) goto L3c
            java.lang.String r0 = "Invalid implementation mode: "
            java.lang.IllegalArgumentException r0 = X.BV5.A0O(r5, r0)
            throw r0
        L3b:
            return r3
        L3c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BoY.A00(X.BmM, X.Ev4):boolean");
    }

    private InterfaceC2787BlA getScreenFlashInternal() {
        return this.A0C.A01;
    }

    private void setScreenFlashUiInfo(InterfaceC2787BlA interfaceC2787BlA) {
        AbstractC2875Bni.A01("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public AbstractC5306Dfp<EvM> getPreviewStreamState() {
        return this.A0E;
    }

    public InterfaceC2787BlA getScreenFlash() {
        return this.A0C.A01;
    }

    public void setFrameUpdateListener(Executor executor, InterfaceC2924Bop interfaceC2924Bop) {
        if (this.A02 == Ev4.PERFORMANCE) {
            throw C60O.A0i("PERFORMANCE mode doesn't support frame update listener");
        }
        this.A03 = interfaceC2924Bop;
        this.A06 = executor;
        AbstractC2908BoZ abstractC2908BoZ = this.A04;
        if (abstractC2908BoZ != null) {
            if (!(abstractC2908BoZ instanceof C2910Bob)) {
                throw C60O.A0i("SurfaceView doesn't support frame update listener");
            }
            C2910Bob c2910Bob = (C2910Bob) abstractC2908BoZ;
            c2910Bob.A04 = interfaceC2924Bop;
            c2910Bob.A07 = executor;
        }
    }

    public void setScreenFlashOverlayColor(int i) {
        this.A0C.setBackgroundColor(i);
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private int getViewPortScaleType() {
        BoT.A00();
        C2907BoX c2907BoX = this.A0A;
        int iOrdinal = c2907BoX.A05.ordinal();
        int i = 0;
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                i = 2;
                if (iOrdinal != 2) {
                    i = 3;
                    if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                        StringBuilder sbA0x = C60O.A0x("Unexpected scale type: ");
                        BoT.A00();
                        throw C3cG.A0Q(C8j3.A14(c2907BoX.A05, sbA0x));
                    }
                }
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            r8 = this;
            X.BoT.A00()
            X.BoZ r0 = r8.A04
            if (r0 == 0) goto L30
            boolean r0 = r8.A07
            if (r0 == 0) goto L2b
            android.view.Display r4 = r8.getDisplay()
            if (r4 == 0) goto L2b
            X.BdV r1 = r8.A00
            if (r1 == 0) goto L2b
            X.BoX r3 = r8.A0A
            int r0 = r4.getRotation()
            int r2 = r1.AKO(r0)
            int r1 = r4.getRotation()
            boolean r0 = r3.A06
            if (r0 == 0) goto L2b
            r3.A00 = r2
            r3.A01 = r1
        L2b:
            X.BoZ r0 = r8.A04
            r0.A00()
        L30:
            X.BlM r5 = r8.A05
            android.util.Size r7 = X.BV8.A0b(r8)
            int r4 = r8.getLayoutDirection()
            X.BoT.A00()
            monitor-enter(r5)
            int r0 = r7.getWidth()     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L62
            int r0 = r7.getHeight()     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L62
            android.graphics.Rect r3 = r5.A01     // Catch: java.lang.Throwable -> L9c
            if (r3 == 0) goto L62
            X.BoX r2 = r5.A02     // Catch: java.lang.Throwable -> L9c
            boolean r0 = X.C2907BoX.A01(r2)     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L62
            android.graphics.Matrix r6 = X.BV4.A08()     // Catch: java.lang.Throwable -> L9c
            boolean r0 = X.C2907BoX.A01(r2)     // Catch: java.lang.Throwable -> L9c
            if (r0 != 0) goto L64
            r1 = 0
            goto L72
        L62:
            r6 = 0
            goto L98
        L64:
            android.graphics.Matrix r0 = r2.A02     // Catch: java.lang.Throwable -> L9c
            android.graphics.Matrix r1 = new android.graphics.Matrix     // Catch: java.lang.Throwable -> L9c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L9c
            android.graphics.Matrix r0 = r2.A02(r7, r4)     // Catch: java.lang.Throwable -> L9c
            r1.postConcat(r0)     // Catch: java.lang.Throwable -> L9c
        L72:
            r1.invert(r6)     // Catch: java.lang.Throwable -> L9c
            android.graphics.Matrix r4 = X.BV4.A08()     // Catch: java.lang.Throwable -> L9c
            int r0 = r3.width()     // Catch: java.lang.Throwable -> L9c
            float r1 = (float) r0     // Catch: java.lang.Throwable -> L9c
            int r0 = r3.height()     // Catch: java.lang.Throwable -> L9c
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L9c
            r3 = 0
            android.graphics.RectF r2 = new android.graphics.RectF     // Catch: java.lang.Throwable -> L9c
            r2.<init>(r3, r3, r1, r0)     // Catch: java.lang.Throwable -> L9c
            r0 = 1065353216(0x3f800000, float:1.0)
            android.graphics.RectF r1 = new android.graphics.RectF     // Catch: java.lang.Throwable -> L9c
            r1.<init>(r3, r3, r0, r0)     // Catch: java.lang.Throwable -> L9c
            android.graphics.Matrix$ScaleToFit r0 = android.graphics.Matrix.ScaleToFit.FILL     // Catch: java.lang.Throwable -> L9c
            r4.setRectToRect(r2, r1, r0)     // Catch: java.lang.Throwable -> L9c
            r6.postConcat(r4)     // Catch: java.lang.Throwable -> L9c
        L98:
            r5.A00 = r6     // Catch: java.lang.Throwable -> L9c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9c
            return
        L9c:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BoY.A01():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap getBitmap() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BoY.getBitmap():android.graphics.Bitmap");
    }

    public AbstractC2922Bon getController() {
        BoT.A00();
        return null;
    }

    public Ev4 getImplementationMode() {
        BoT.A00();
        return this.A02;
    }

    public AbstractC2791BlL getMeteringPointFactory() {
        BoT.A00();
        return this.A05;
    }

    public C2918Boj getOutputTransform() {
        Matrix matrixA02;
        BoT.A00();
        try {
            matrixA02 = this.A0A.A02(BV8.A0b(this), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixA02 = null;
        }
        Rect rect = this.A0A.A03;
        if (matrixA02 == null || rect == null) {
            AbstractC2875Bni.A01("PreviewView", "Transform info is not ready");
            return null;
        }
        RectF rectF = BfO.A00;
        RectF rectF2 = new RectF(rect);
        Matrix matrixA08 = BV4.A08();
        matrixA08.setRectToRect(BfO.A00, rectF2, Matrix.ScaleToFit.FILL);
        matrixA02.preConcat(matrixA08);
        boolean z = this.A04 instanceof C2910Bob;
        Matrix matrix = getMatrix();
        if (z) {
            matrixA02.postConcat(matrix);
        } else if (!matrix.isIdentity()) {
            AbstractC2875Bni.A03("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        return new C2918Boj(matrixA02, BV8.A0Z(rect));
    }

    public EnumC2911Boc getScaleType() {
        BoT.A00();
        return this.A0A.A05;
    }

    public Matrix getSensorToViewTransform() {
        BoT.A00();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        C2907BoX c2907BoX = this.A0A;
        Size sizeA0b = BV8.A0b(this);
        int layoutDirection = getLayoutDirection();
        if (!C2907BoX.A01(c2907BoX)) {
            return null;
        }
        Matrix matrix = new Matrix(c2907BoX.A02);
        matrix.postConcat(c2907BoX.A02(sizeA0b, layoutDirection));
        return matrix;
    }

    public BgO getSurfaceProvider() {
        BoT.A00();
        return this.A09;
    }

    public Bg6 getViewPort() {
        BoT.A00();
        if (getDisplay() == null) {
            return null;
        }
        int rotation = getDisplay().getRotation();
        BoT.A00();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Rational rational = new Rational(getWidth(), getHeight());
        int viewPortScaleType = getViewPortScaleType();
        int layoutDirection = getLayoutDirection();
        Bg6 bg6 = new Bg6();
        bg6.A02 = viewPortScaleType;
        bg6.A03 = rational;
        bg6.A01 = rotation;
        bg6.A00 = layoutDirection;
        return bg6;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.A0B, C60O.A02());
        }
        addOnLayoutChangeListener(this.A08);
        AbstractC2908BoZ abstractC2908BoZ = this.A04;
        if (abstractC2908BoZ != null && (abstractC2908BoZ instanceof C2910Bob)) {
            C2910Bob c2910Bob = (C2910Bob) abstractC2908BoZ;
            if (c2910Bob.A09 && c2910Bob.A00 != null) {
                SurfaceTexture surfaceTexture = c2910Bob.A02.getSurfaceTexture();
                SurfaceTexture surfaceTexture2 = c2910Bob.A00;
                if (surfaceTexture != surfaceTexture2) {
                    c2910Bob.A02.setSurfaceTexture(surfaceTexture2);
                    c2910Bob.A00 = null;
                    c2910Bob.A09 = false;
                }
            }
        }
        BoT.A00();
        getViewPort();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.A08);
        AbstractC2908BoZ abstractC2908BoZ = this.A04;
        if (abstractC2908BoZ != null && (abstractC2908BoZ instanceof C2910Bob)) {
            ((C2910Bob) abstractC2908BoZ).A09 = true;
        }
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.A0B);
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }

    public void setController(AbstractC2922Bon abstractC2922Bon) {
        BoT.A00();
        this.A01 = abstractC2922Bon;
        BoT.A00();
        getViewPort();
        setScreenFlashUiInfo(this.A0C.A01);
    }

    public void setImplementationMode(Ev4 ev4) {
        BoT.A00();
        this.A02 = ev4;
    }

    public void setScaleType(EnumC2911Boc enumC2911Boc) {
        BoT.A00();
        this.A0A.A05 = enumC2911Boc;
        A01();
        BoT.A00();
        getViewPort();
    }

    public void setScreenFlashWindow(Window window) {
        BoT.A00();
        C2919Bok c2919Bok = this.A0C;
        c2919Bok.setScreenFlashWindow(window);
        setScreenFlashUiInfo(c2919Bok.A01);
    }
}
