package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.ImeAction;
import kotlin.Unit;

/* renamed from: X.AtH, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1897AtH {
    public long A00;
    public C1922Atj A01;
    public InterfaceC1497Ak4 A02;
    public ApQ A03;
    public AuB A04;
    public G0U<? super C1805ArO, Unit> A05;
    public boolean A06;
    public final C1665Ano A07;
    public final MutableState A08;
    public final MutableState A09;
    public final MutableState A0A;
    public final MutableState A0B;
    public final MutableState A0C;
    public final MutableState A0D;
    public final MutableState<C1924Atl> A0E;
    public final MutableState A0F;
    public final MutableState A0G;
    public final MutableState A0H;
    public final MutableState A0I;
    public final MutableState A0J;
    public final MutableState A0K;
    public final ApJ A0L;
    public final InterfaceC1330AhH A0M;
    public final C1C3 A0N;
    public final C1905AtQ A0O = new C1905AtQ();
    public final G0U<ImeAction, Unit> A0P;
    public final G0U<ImeAction, Boolean> A0Q;
    public final G0U<C1805ArO, Unit> A0R;

    public static C1924Atl A00(C1897AtH c1897AtH) {
        return c1897AtH.A0E.getValue();
    }

    public final InterfaceC1497Ak4 A01() {
        InterfaceC1497Ak4 interfaceC1497Ak4 = this.A02;
        if (interfaceC1497Ak4 == null || !interfaceC1497Ak4.isAttached()) {
            return null;
        }
        return interfaceC1497Ak4;
    }

    public C1897AtH(C1922Atj c1922Atj, ApJ apJ, C1C3 c1c3) {
        this.A01 = c1922Atj;
        this.A0L = apJ;
        this.A0N = c1c3;
        Boolean boolA0h = AnonymousClass001.A0h();
        AGE age = AGE.A00;
        this.A0B = C3cG.A08(age, boolA0h);
        this.A0F = C3cG.A08(age, C1DG.A03());
        this.A0E = C3cG.A08(age, null);
        this.A0A = C3cG.A08(age, Au8.A03);
        this.A0I = C3cG.A08(age, boolA0h);
        this.A0K = C3cG.A08(age, boolA0h);
        this.A0J = C3cG.A08(age, boolA0h);
        this.A0H = C3cG.A08(age, boolA0h);
        this.A06 = true;
        this.A0C = C3cG.A08(age, true);
        this.A07 = new C1665Ano(c1c3);
        this.A08 = C3cG.A08(age, boolA0h);
        this.A0D = C3cG.A08(age, boolA0h);
        this.A05 = new C2279BSf(11);
        this.A0R = C2294BSu.A00(this, 6);
        this.A0P = C2294BSu.A00(this, 7);
        this.A0Q = C2294BSu.A00(this, 8);
        this.A0M = new C1776AqX();
        this.A00 = B6A.A07;
        long j = Au3.A01;
        this.A0G = C3cG.A08(age, C8j3.A0j(j));
        this.A09 = C3cG.A08(age, C8j3.A0j(j));
    }
}
