package X;

import android.graphics.Color;
import android.graphics.Paint;

/* renamed from: X.FjC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8711FjC implements InterfaceC8793FkY {
    public boolean A00 = true;
    public final AbstractC8724FjP<Integer, Integer> A01;
    public final AbstractC8724FjP<Float, Float> A02;
    public final AbstractC8724FjP<Float, Float> A03;
    public final AbstractC8724FjP<Float, Float> A04;
    public final AbstractC8724FjP<Float, Float> A05;
    public final InterfaceC8793FkY A06;

    @Override // X.InterfaceC8793FkY
    public final void AX2() {
        this.A00 = true;
        this.A06.AX2();
    }

    public final void A00(Paint paint) {
        if (this.A00) {
            this.A00 = false;
            double dA02 = AbstractC8724FjP.A02(this.A02) * 0.017453292519943295d;
            float fA02 = AbstractC8724FjP.A02(this.A03);
            float fSin = ((float) Math.sin(dA02)) * fA02;
            float fCos = ((float) Math.cos(dA02 + 3.141592653589793d)) * fA02;
            int iA0F = AnonymousClass001.A0F(this.A01.A06());
            paint.setShadowLayer(AbstractC8724FjP.A02(this.A05), fSin, fCos, Color.argb(Math.round(AbstractC8724FjP.A02(this.A04)), Color.red(iA0F), Color.green(iA0F), Color.blue(iA0F)));
        }
    }

    public C8711FjC(InterfaceC8793FkY interfaceC8793FkY, AbstractC8671FiX abstractC8671FiX, C8778FkI c8778FkI) {
        this.A06 = interfaceC8793FkY;
        C8717FjI c8717FjI = new C8717FjI(c8778FkI.A00.A00);
        this.A01 = c8717FjI;
        c8717FjI.A09(this);
        abstractC8671FiX.A07(c8717FjI);
        C8720FjL c8720FjLA01 = C8720FjL.A01(c8778FkI.A03);
        this.A04 = c8720FjLA01;
        c8720FjLA01.A09(this);
        abstractC8671FiX.A07(c8720FjLA01);
        C8720FjL c8720FjLA012 = C8720FjL.A01(c8778FkI.A01);
        this.A02 = c8720FjLA012;
        c8720FjLA012.A09(this);
        abstractC8671FiX.A07(c8720FjLA012);
        C8720FjL c8720FjLA013 = C8720FjL.A01(c8778FkI.A02);
        this.A03 = c8720FjLA013;
        c8720FjLA013.A09(this);
        abstractC8671FiX.A07(c8720FjLA013);
        C8720FjL c8720FjLA014 = C8720FjL.A01(c8778FkI.A04);
        this.A05 = c8720FjLA014;
        c8720FjLA014.A09(this);
        abstractC8671FiX.A07(c8720FjLA014);
    }
}
