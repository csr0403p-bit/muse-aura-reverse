package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* renamed from: X.Alm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1572Alm implements InterfaceC1327AhE {
    public Canvas A00 = AbstractC1290Aga.A00;
    public Rect A01;
    public Rect A02;

    @Override // X.InterfaceC1327AhE
    public final void A6M(InterfaceC1068ATy interfaceC1068ATy, int i) {
        Canvas canvas = this.A00;
        if (!(interfaceC1068ATy instanceof C1710Aot)) {
            throw C8j3.A18("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((C1710Aot) interfaceC1068ATy).A03, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // X.InterfaceC1327AhE
    public final void A6N(float f, float f2, float f3, float f4, int i) {
        this.A00.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // X.InterfaceC1327AhE
    public final /* synthetic */ void A6O(AaC aaC, int i) {
        A6N(aaC.A01, aaC.A03, aaC.A02, aaC.A00, i);
    }

    @Override // X.InterfaceC1327AhE
    public final void A93() {
        this.A00.disableZ();
    }

    @Override // X.InterfaceC1327AhE
    public final void A9J(InterfaceC1330AhH interfaceC1330AhH, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        this.A00.drawArc(f, f2, f3, f4, f5, f6, z, AZ5.A00(interfaceC1330AhH));
    }

    @Override // X.InterfaceC1327AhE
    public final void A9L(InterfaceC1330AhH interfaceC1330AhH, float f, long j) {
        this.A00.drawCircle(AnonymousClass003.A03(j), AnonymousClass004.A00(j), f, AZ5.A00(interfaceC1330AhH));
    }

    @Override // X.InterfaceC1327AhE
    public final void A9R(InterfaceC2178B0w interfaceC2178B0w, InterfaceC1330AhH interfaceC1330AhH, long j) {
        this.A00.drawBitmap(B10.A00(interfaceC2178B0w), AnonymousClass003.A03(j), AnonymousClass004.A00(j), AZ5.A00(interfaceC1330AhH));
    }

    @Override // X.InterfaceC1327AhE
    public final void A9T(InterfaceC2178B0w interfaceC2178B0w, InterfaceC1330AhH interfaceC1330AhH, long j, long j2, long j3, long j4) {
        if (this.A02 == null) {
            this.A02 = new Rect();
            this.A01 = new Rect();
        }
        Canvas canvas = this.A00;
        Bitmap bitmapA00 = B10.A00(interfaceC2178B0w);
        Rect rect = this.A02;
        C7384Etj.A0X(rect);
        int i = (int) (j >> 32);
        rect.left = i;
        int iA09 = AnonymousClass002.A09(j);
        rect.top = iA09;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = iA09 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.A01;
        C7384Etj.A0X(rect2);
        int i2 = (int) (j3 >> 32);
        rect2.left = i2;
        int iA092 = AnonymousClass002.A09(j3);
        rect2.top = iA092;
        rect2.right = i2 + ((int) (j4 >> 32));
        rect2.bottom = iA092 + ((int) (j4 & 4294967295L));
        canvas.drawBitmap(bitmapA00, rect, rect2, AZ5.A00(interfaceC1330AhH));
    }

    @Override // X.InterfaceC1327AhE
    public final void A9Y(InterfaceC1330AhH interfaceC1330AhH, long j, long j2) {
        this.A00.drawLine(AnonymousClass001.A00(j), AnonymousClass001.A01(j, 4294967295L), AnonymousClass001.A00(j2), AnonymousClass001.A01(j2, 4294967295L), AZ5.A00(interfaceC1330AhH));
    }

    @Override // X.InterfaceC1327AhE
    public final void A9Z(InterfaceC1330AhH interfaceC1330AhH, float f, float f2, float f3, float f4) {
        this.A00.drawOval(f, f2, f3, f4, AZ5.A00(interfaceC1330AhH));
    }

    @Override // X.InterfaceC1327AhE
    public final void A9b(InterfaceC1330AhH interfaceC1330AhH, InterfaceC1068ATy interfaceC1068ATy) {
        Canvas canvas = this.A00;
        if (!(interfaceC1068ATy instanceof C1710Aot)) {
            throw C8j3.A18("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((C1710Aot) interfaceC1068ATy).A03, AZ5.A00(interfaceC1330AhH));
    }

    @Override // X.InterfaceC1327AhE
    public final void A9e(InterfaceC1330AhH interfaceC1330AhH, float f, float f2, float f3, float f4) {
        this.A00.drawRect(f, f2, f3, f4, AZ5.A00(interfaceC1330AhH));
    }

    @Override // X.InterfaceC1327AhE
    public final void A9h(InterfaceC1330AhH interfaceC1330AhH, float f, float f2, float f3, float f4, float f5, float f6) {
        this.A00.drawRoundRect(f, f2, f3, f4, f5, f6, AZ5.A00(interfaceC1330AhH));
    }

    @Override // X.InterfaceC1327AhE
    public final void AA1() {
        this.A00.enableZ();
    }

    @Override // X.InterfaceC1327AhE
    public final void Abc() {
        this.A00.restore();
    }

    @Override // X.InterfaceC1327AhE
    public final void Abp(float f) {
        this.A00.rotate(f);
    }

    @Override // X.InterfaceC1327AhE
    public final void Ac2() {
        this.A00.save();
    }

    @Override // X.InterfaceC1327AhE
    public final void Ac3(AaC aaC, InterfaceC1330AhH interfaceC1330AhH) {
        this.A00.saveLayer(aaC.A01, aaC.A03, aaC.A02, aaC.A00, AZ5.A00(interfaceC1330AhH), 31);
    }

    @Override // X.InterfaceC1327AhE
    public final void Ac5(float f, float f2) {
        this.A00.scale(f, f2);
    }

    @Override // X.InterfaceC1327AhE
    public final void AhL(float f, float f2) {
        this.A00.translate(f, f2);
    }

    @Override // X.InterfaceC1327AhE
    public final void A6m(float[] fArr) {
        if (AbstractC1409Aie.A00(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        AbstractC2126Ays.A00(matrix, fArr);
        this.A00.concat(matrix);
    }
}
