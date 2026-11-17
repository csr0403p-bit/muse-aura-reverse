package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.facebook.common.callercontext.ContextChain;

/* renamed from: X.EjB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7240EjB extends AVy implements InterfaceC1559AlZ {
    public static final Handler A0J = C60O.A02();
    public long A00;
    public InterfaceC7236Ej0<Void> A01;
    public C7226Eiq A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Resources A06;
    public final C00r A07;
    public final MutableState A08;
    public final F2N A09;
    public final Dg3 A0A;
    public final InterfaceC7300EkR A0B;
    public final Ej6 A0C;
    public final C7197Ei9 A0D;
    public final Ejq A0E;
    public final Object A0F;
    public final F0C A0G;
    public final Drawable A0H;
    public final ContextChain A0I;

    public C7240EjB(Resources resources, F2N f2n, ContextChain contextChain, Ej6 ej6, C7197Ei9 c7197Ei9, Ejq ejq, Object obj) {
        AnonymousClass002.A1B(resources, 0, c7197Ei9);
        this.A06 = resources;
        this.A0F = obj;
        this.A0E = ejq;
        this.A0D = c7197Ei9;
        this.A0I = contextChain;
        this.A0C = ej6;
        this.A09 = f2n;
        C7267Ejs.A00();
        C7219Eij c7219Eij = new C7219Eij(((C7218Eii) EjN.A00()).A01);
        this.A0B = c7219Eij;
        this.A0H = c7219Eij;
        EjN.A03();
        EjN.A03();
        this.A07 = new ParcelableSnapshotMutableIntState(0);
        long jA0A = (c7219Eij.getIntrinsicWidth() < 0 || c7219Eij.getIntrinsicHeight() < 0) ? 9205357640488583168L : AnonymousClass007.A0A(c7219Eij.getIntrinsicWidth(), c7219Eij.getIntrinsicHeight());
        this.A00 = jA0A;
        this.A08 = new ParcelableSnapshotMutableState(AGF.A01(), new AWA(jA0A));
        EjN.A03();
        C7267Ejs.A00();
        this.A02 = EjN.A02().A7p(this.A06, null, null, this.A0D, this.A0E, this.A0F);
        C7267Ejs.A00();
        InterfaceC7146EhC interfaceC7146EhCA01 = EjN.A01();
        EjN.A03();
        Integer num = C79.A00;
        C7226Eiq c7226Eiq = this.A02;
        if (c7226Eiq == null) {
            throw C3cG.A0Q("Required value was null.");
        }
        this.A01 = C7189Ei0.A00((C7189Ei0) interfaceC7146EhCA01, c7226Eiq.A05, num, obj, c7226Eiq.A06);
        EjN.A03();
        this.A0G = C5322DgG.A00(this, 6);
        this.A0A = f2n != null ? new C7247EjM(this) : null;
        long j = this.A00;
        if (j != 9205357640488583168L) {
            c7219Eij.setBounds(0, 0, (int) AnonymousClass003.A03(j), (int) AnonymousClass004.A00(j));
        }
    }

    public static final void A01(C7240EjB c7240EjB) {
        c7240EjB.A05 = false;
        C7226Eiq c7226Eiq = c7240EjB.A02;
        if (c7226Eiq != null) {
            c7240EjB.A0H.setCallback((Drawable.Callback) c7240EjB.A0G.getValue());
            EjN.A00().ABJ(null, null, null, c7240EjB.A0B, c7226Eiq, null, c7240EjB.A0C, c7240EjB.A0F);
            InterfaceC7236Ej0<Void> interfaceC7236Ej0 = c7240EjB.A01;
            if (interfaceC7236Ej0 != null) {
                interfaceC7236Ej0.A6Q();
            }
            c7240EjB.A01 = null;
        }
    }

    public static final void A02(C7240EjB c7240EjB) {
        c7240EjB.A05 = true;
        c7240EjB.A0H.setCallback(null);
        EjN.A00().AaG(c7240EjB.A0B);
        InterfaceC7236Ej0<Void> interfaceC7236Ej0 = c7240EjB.A01;
        if (interfaceC7236Ej0 != null) {
            interfaceC7236Ej0.A6Q();
        }
        c7240EjB.A01 = null;
    }

    @Override // X.AVy
    public final boolean applyLayoutDirection(EnumC1820Arj enumC1820Arj) {
        C7384Etj.A0Y(enumC1820Arj, 0);
        int i = 0;
        Drawable drawable = this.A0H;
        int iOrdinal = enumC1820Arj.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                throw C3cG.A0q();
            }
        }
        return drawable.setLayoutDirection(i);
    }

    @Override // X.AVy
    public final void onDraw(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        InterfaceC1327AhE interfaceC1327AhE = ((AaI) at3.AEq()).A02.A02.A01;
        this.A07.AGd();
        long jAKb = at3.AKb();
        if (jAKb != 9205357640488583168L) {
            this.A0H.setBounds(0, 0, Ab3.A01(AnonymousClass003.A03(jAKb)), Ab3.A01(AnonymousClass004.A00(jAKb)));
        }
        try {
            interfaceC1327AhE.Ac2();
            Drawable drawable = this.A0H;
            Canvas canvas = AbstractC1290Aga.A00;
            drawable.draw(((C1572Alm) interfaceC1327AhE).A00);
        } finally {
            interfaceC1327AhE.Abc();
        }
    }

    private final void A00() {
        Dg3 dg3 = this.A0A;
        if (dg3 == null || !this.A03) {
            return;
        }
        this.A03 = false;
        this.A04 = false;
        F2N f2n = this.A09;
        if (f2n == null) {
            throw BV4.A0U();
        }
        f2n.A05(dg3);
    }

    @Override // X.AVy
    public final boolean applyAlpha(float f) {
        Drawable drawable = this.A0H;
        int iA02 = Ab3.A02(f, 255.0f);
        if (iA02 < 0) {
            iA02 = 0;
        } else if (iA02 > 255) {
            iA02 = 255;
        }
        drawable.setAlpha(iA02);
        return true;
    }

    @Override // X.AVy
    public final boolean applyColorFilter(C1423Ais c1423Ais) {
        this.A0H.setColorFilter(c1423Ais != null ? c1423Ais.A00 : null);
        return true;
    }

    @Override // X.AVy
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo0getIntrinsicSizeNHjbRc() {
        return ((AWA) this.A08.getValue()).A00;
    }

    @Override // X.InterfaceC1559AlZ
    public final void onAbandoned() {
        A00();
        A02(this);
    }

    @Override // X.InterfaceC1559AlZ
    public final void onForgotten() {
        A00();
        EjN.A03();
        A02(this);
    }

    @Override // X.InterfaceC1559AlZ
    public final void onRemembered() {
        A01(this);
        Dg3 dg3 = this.A0A;
        if (dg3 == null || this.A03) {
            return;
        }
        this.A03 = true;
        F2N f2n = this.A09;
        if (f2n == null) {
            throw BV4.A0U();
        }
        f2n.A04(dg3);
    }
}
