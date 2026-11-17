package X;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Aqf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1779Aqf extends TextPaint {
    public int A00;
    public C1BO<? extends Shader> A01;
    public AWA A02;
    public C1EQ A03;
    public C1780Aqg A04;
    public BG3 A05;
    public B6A A06;
    public InterfaceC1330AhH A07;
    public C16b A08;

    private final InterfaceC1330AhH A00() {
        InterfaceC1330AhH interfaceC1330AhH = this.A07;
        if (interfaceC1330AhH != null) {
            return interfaceC1330AhH;
        }
        C1776AqX c1776AqX = new C1776AqX();
        c1776AqX.A01 = this;
        c1776AqX.A00 = 3;
        this.A07 = c1776AqX;
        return c1776AqX;
    }

    public final void A01(int i) {
        if (i != this.A00) {
            A00().Acu(i);
            this.A00 = i;
        }
    }

    public final void A02(long j) {
        B6A b6a = this.A06;
        if ((b6a == null || b6a.A00 != j) && j != 16) {
            this.A06 = new B6A(j);
            setColor(HxS.A01(j));
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
            setShader(null);
        }
    }

    public final void A03(final C1EQ c1eq, float f, final long j) {
        AWA awa;
        if (c1eq == null) {
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
            setShader(null);
            return;
        }
        if (c1eq instanceof C1326AhD) {
            A02(AbstractC1783Aqj.A00(((C1326AhD) c1eq).A00, f));
            return;
        }
        if (!(c1eq instanceof AbstractC1336AhN)) {
            throw new NoWhenBranchMatchedException();
        }
        if ((!C7384Etj.areEqual(this.A03, c1eq) || (awa = this.A02) == null || awa.A00 != j) && j != 9205357640488583168L) {
            this.A03 = c1eq;
            this.A02 = new AWA(j);
            this.A01 = new BBP(null, new Function0() { // from class: X.Aqk
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ((AbstractC1336AhN) c1eq).A08(j);
                }
            });
        }
        InterfaceC1330AhH interfaceC1330AhHA00 = A00();
        C1BO<? extends Shader> c1bo = this.A01;
        Shader value = c1bo != null ? c1bo.getValue() : null;
        C1776AqX c1776AqX = (C1776AqX) interfaceC1330AhHA00;
        c1776AqX.A02 = value;
        c1776AqX.A01.setShader(value);
        this.A06 = null;
        AbstractC1781Aqh.A00(this, f);
    }

    public final void A04(C1780Aqg c1780Aqg) {
        if (c1780Aqg == null || C7384Etj.areEqual(this.A04, c1780Aqg)) {
            return;
        }
        this.A04 = c1780Aqg;
        if (c1780Aqg.equals(C1780Aqg.A03)) {
            clearShadowLayer();
            return;
        }
        C1780Aqg c1780Aqg2 = this.A04;
        float f = c1780Aqg2.A00;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        long j = c1780Aqg2.A02;
        setShadowLayer(f, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), HxS.A01(c1780Aqg2.A01));
    }

    public final void A05(C16b c16b) {
        if (c16b == null || C7384Etj.areEqual(this.A08, c16b)) {
            return;
        }
        this.A08 = c16b;
        if (c16b.equals(C16a.A00)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(c16b instanceof AaJ)) {
            throw new NoWhenBranchMatchedException();
        }
        ((C1776AqX) A00()).A01.setStyle(Paint.Style.STROKE);
        InterfaceC1330AhH interfaceC1330AhHA00 = A00();
        AaJ aaJ = (AaJ) c16b;
        ((C1776AqX) interfaceC1330AhHA00).A01.setStrokeWidth(aaJ.A01);
        InterfaceC1330AhH interfaceC1330AhHA002 = A00();
        ((C1776AqX) interfaceC1330AhHA002).A01.setStrokeMiter(aaJ.A00);
        A00().Aeo(aaJ.A03);
        A00().Aen(aaJ.A02);
        A00().Adz(aaJ.A04);
    }

    public final void A06(BG3 bg3) {
        if (bg3 == null || C7384Etj.areEqual(this.A05, bg3)) {
            return;
        }
        this.A05 = bg3;
        int i = bg3.A00;
        setUnderlineText((i | 1) == i);
        int i2 = this.A05.A00;
        setStrikeThruText((i2 | 2) == i2);
    }
}
