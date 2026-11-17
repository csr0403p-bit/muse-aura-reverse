package X;

import android.graphics.Paint;
import android.graphics.Shader;

/* renamed from: X.AqX, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1776AqX implements InterfaceC1330AhH {
    public Shader A02;
    public C1423Ais A03;
    public C0zF A04;
    public Paint A01 = new Paint(7);
    public int A00 = 3;

    @Override // X.InterfaceC1330AhH
    public final int ALB() {
        int i;
        Paint.Cap strokeCap = this.A01.getStrokeCap();
        if (strokeCap != null && (i = AbstractC1777AqY.A00[strokeCap.ordinal()]) != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return 2;
            }
        }
        return 0;
    }

    @Override // X.InterfaceC1330AhH
    public final int ALC() {
        int i;
        Paint.Join strokeJoin = this.A01.getStrokeJoin();
        if (strokeJoin != null && (i = AbstractC1777AqY.A01[strokeJoin.ordinal()]) != 1) {
            if (i == 2) {
                return 2;
            }
            if (i == 3) {
                return 1;
            }
        }
        return 0;
    }

    @Override // X.InterfaceC1330AhH
    public final void Acj(float f) {
        this.A01.setAlpha((int) Math.rint(f * 255.0f));
    }

    @Override // X.InterfaceC1330AhH
    public final void Acu(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            this.A01.setBlendMode(AbstractC8721FjM.A00(i));
        }
    }

    @Override // X.InterfaceC1330AhH
    public final void Ad4(long j) {
        this.A01.setColor(HxS.A01(j));
    }

    @Override // X.InterfaceC1330AhH
    public final void Ad6(C1423Ais c1423Ais) {
        this.A03 = c1423Ais;
        this.A01.setColorFilter(c1423Ais != null ? c1423Ais.A00 : null);
    }

    @Override // X.InterfaceC1330AhH
    public final void Adz(C0zF c0zF) {
        C1778Aqa c1778Aqa = (C1778Aqa) c0zF;
        this.A01.setPathEffect(c1778Aqa != null ? c1778Aqa.A00 : null);
        this.A04 = c0zF;
    }

    @Override // X.InterfaceC1330AhH
    public final void Aen(int i) {
        this.A01.setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : Paint.Cap.BUTT);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0014  */
    @Override // X.InterfaceC1330AhH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Aeo(int r2) {
        /*
            r1 = this;
            android.graphics.Paint r1 = r1.A01
            r0 = 0
            if (r2 == r0) goto L14
            r0 = 2
            if (r2 != r0) goto Le
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.BEVEL
        La:
            r1.setStrokeJoin(r0)
            return
        Le:
            r0 = 1
            if (r2 != r0) goto L14
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            goto La
        L14:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1776AqX.Aeo(int):void");
    }
}
