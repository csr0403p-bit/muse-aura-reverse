package X;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* renamed from: X.B0l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2172B0l extends AVy {
    public float A00;
    public C1423Ais A01;
    public final MutableState A02;
    public final MutableState A03;
    public final MutableState A04;
    public final C2170B0j A05;

    @Override // X.AVy
    public final boolean applyAlpha(float f) {
        this.A00 = f;
        return true;
    }

    @Override // X.AVy
    public final boolean applyColorFilter(C1423Ais c1423Ais) {
        this.A01 = c1423Ais;
        return true;
    }

    @Override // X.AVy
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo0getIntrinsicSizeNHjbRc() {
        return AWA.A03(this.A04);
    }

    @Override // X.AVy
    public final void onDraw(AT3 at3) {
        C2170B0j c2170B0j = this.A05;
        C1423Ais c1423Ais = this.A01;
        if (c1423Ais == null) {
            c1423Ais = (C1423Ais) c2170B0j.A07.getValue();
        }
        if (MutableState.A0A(this.A02) && at3.getLayoutDirection() == EnumC1820Arj.A03) {
            long jADU = at3.ADU();
            InterfaceC1279AgP interfaceC1279AgPAEq = at3.AEq();
            AaI aaI = (AaI) interfaceC1279AgPAEq;
            AW9 aw9 = aaI.A02.A02;
            long jA00 = AW9.A00(aw9);
            try {
                aaI.A01.Ac6(-1.0f, 1.0f, jADU);
                c2170B0j.A05(c1423Ais, at3, this.A00);
            } finally {
                AW9.A02(aw9, interfaceC1279AgPAEq, jA00);
            }
        } else {
            c2170B0j.A05(c1423Ais, at3, this.A00);
        }
        this.A03.getValue();
    }

    public C2172B0l(C2171B0k c2171B0k) {
        AWA awa = new AWA(0L);
        AGE age = AGE.A00;
        this.A04 = C3cG.A08(age, awa);
        this.A02 = C3cG.A08(age, AnonymousClass001.A0h());
        C2170B0j c2170B0j = new C2170B0j(c2171B0k);
        c2170B0j.A03 = C2328BUc.A00(this, 10);
        this.A05 = c2170B0j;
        this.A03 = C3cG.A08(AGG.A00, Unit.INSTANCE);
        this.A00 = 1.0f;
    }

    public C2172B0l() {
        this(new C2171B0k());
    }
}
