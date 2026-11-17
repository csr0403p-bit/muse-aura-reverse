package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class AVy {
    public static final int $stable = 8;
    public C1423Ais colorFilter;
    public InterfaceC1330AhH layerPaint;
    public boolean useLayer;
    public float alpha = 1.0f;
    public EnumC1820Arj layoutDirection = EnumC1820Arj.A02;
    public final G0U<AT3, Unit> drawLambda = new BUX(this, 20);

    public boolean applyAlpha(float f) {
        return false;
    }

    public boolean applyColorFilter(C1423Ais c1423Ais) {
        return false;
    }

    public boolean applyLayoutDirection(EnumC1820Arj enumC1820Arj) {
        return false;
    }

    /* renamed from: draw-x_KDEd0, reason: not valid java name */
    public final void m10drawx_KDEd0(AT3 at3, long j, float f, C1423Ais c1423Ais) {
        configureAlpha(f);
        configureColorFilter(c1423Ais);
        configureLayoutDirection(at3.getLayoutDirection());
        long jAKb = at3.AKb();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jAKb >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float f2 = fIntBitsToFloat - fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jAKb & 4294967295L));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f3 = fIntBitsToFloat3 - fIntBitsToFloat4;
        AaI aaI = (AaI) at3.AEq();
        AT2 at2 = aaI.A01;
        at2.ANn(0.0f, 0.0f, f2, f3);
        if (f > 0.0f && fIntBitsToFloat2 > 0.0f && fIntBitsToFloat4 > 0.0f) {
            try {
                if (this.useLayer) {
                    AaC aaCA00 = C2J7.A00(0L, (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32));
                    InterfaceC1327AhE interfaceC1327AhE = aaI.A02.A02.A01;
                    try {
                        interfaceC1327AhE.Ac3(aaCA00, obtainPaint());
                        onDraw(at3);
                        interfaceC1327AhE.Abc();
                    } catch (Throwable th) {
                        interfaceC1327AhE.Abc();
                        throw th;
                    }
                } else {
                    onDraw(at3);
                }
            } finally {
                at2.ANn(-0.0f, -0.0f, -f2, -f3);
            }
        }
    }

    /* renamed from: getIntrinsicSize-NH-jbRc */
    public abstract long mo0getIntrinsicSizeNHjbRc();

    public abstract void onDraw(AT3 at3);

    private final void configureAlpha(float f) {
        boolean z;
        if (this.alpha != f) {
            if (!applyAlpha(f)) {
                if (f == 1.0f) {
                    InterfaceC1330AhH interfaceC1330AhH = this.layerPaint;
                    if (interfaceC1330AhH != null) {
                        interfaceC1330AhH.Acj(f);
                    }
                    z = false;
                } else {
                    obtainPaint().Acj(f);
                    z = true;
                }
                this.useLayer = z;
            }
            this.alpha = f;
        }
    }

    private final void configureColorFilter(C1423Ais c1423Ais) {
        boolean z;
        if (C7384Etj.areEqual(this.colorFilter, c1423Ais)) {
            return;
        }
        if (!applyColorFilter(c1423Ais)) {
            if (c1423Ais == null) {
                InterfaceC1330AhH interfaceC1330AhH = this.layerPaint;
                if (interfaceC1330AhH != null) {
                    interfaceC1330AhH.Ad6(null);
                }
                z = false;
            } else {
                obtainPaint().Ad6(c1423Ais);
                z = true;
            }
            this.useLayer = z;
        }
        this.colorFilter = c1423Ais;
    }

    private final void configureLayoutDirection(EnumC1820Arj enumC1820Arj) {
        if (this.layoutDirection != enumC1820Arj) {
            applyLayoutDirection(enumC1820Arj);
            this.layoutDirection = enumC1820Arj;
        }
    }

    /* renamed from: draw-x_KDEd0$default, reason: not valid java name */
    public static /* synthetic */ void m9drawx_KDEd0$default(AVy aVy, AT3 at3, long j, float f, C1423Ais c1423Ais, int i, Object obj) {
        if (obj != null) {
            throw C8j3.A18("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        }
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        if ((i & 4) != 0) {
            c1423Ais = null;
        }
        aVy.m10drawx_KDEd0(at3, j, f, c1423Ais);
    }

    private final InterfaceC1330AhH obtainPaint() {
        InterfaceC1330AhH interfaceC1330AhH = this.layerPaint;
        if (interfaceC1330AhH != null) {
            return interfaceC1330AhH;
        }
        C1776AqX c1776AqX = new C1776AqX();
        this.layerPaint = c1776AqX;
        return c1776AqX;
    }
}
