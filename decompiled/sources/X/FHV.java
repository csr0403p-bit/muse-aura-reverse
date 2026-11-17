package X;

import android.content.Context;
import android.graphics.Rect;
import java.util.List;

/* loaded from: classes6.dex */
public final class FHV extends FGT<FS4> implements InterfaceC7830FGl<FS4> {
    public int A01;
    public int A03;
    public Rect A04;
    public FTP A05;
    public FSF A06;
    public C7848FHg A07;
    public List<AbstractC8109FTy> A08;
    public List<FS5> A09;
    public final long A0E;
    public final AbstractC7847FHf A0F;
    public final FFL A0G;
    public static final InterfaceC7833FGo<FHV, FS4, Void> A0H = new FHW();
    public static final InterfaceC7833FGo<FHV, FS4, Void> A0P = new C7843FHb();
    public static final InterfaceC7833FGo<FHV, FS4, Void> A0U = new FFZ();
    public static final InterfaceC7833FGo<FHV, FS4, Void> A0V = new FHZ();
    public static final InterfaceC7833FGo<FHV, FS4, Void> A0N = new FHY();
    public static final InterfaceC7833FGo<FHV, FS4, Void> A0M = new FHa();
    public static final InterfaceC7833FGo<FHV, FS4, Void> A0O = new FFY();
    public static final InterfaceC7833FGo<FHV, FS4, Void> A0I = new C7846FHe();
    public static final InterfaceC7833FGo<FHV, FS4, Void> A0R = new C7797FFd();
    public static final InterfaceC7833FGo<FHV, FS4, Void> A0K = new C7844FHc();
    public static final InterfaceC7833FGo<FHV, FS4, Void> A0S = new FHX();
    public static final InterfaceC7833FGo<FHV, FS4, Void> A0J = new C7845FHd();
    public static final InterfaceC7833FGo<FHV, FS4, Void> A0L = new C7799FFf();
    public static final InterfaceC7833FGo<FHV, FS4, Void> A0Q = new C7796FFc();
    public static final InterfaceC7833FGo<FHV, FS4, Void> A0T = new FHR();
    public int A00 = 0;
    public int A02 = 0;
    public boolean A0A = true;
    public boolean A0C = true;
    public boolean A0B = true;
    public boolean A0D = true;

    public final void A0V(FS5 fs5) {
        List listA11 = this.A09;
        if (listA11 == null) {
            listA11 = C60O.A11(4);
            this.A09 = listA11;
        }
        listA11.add(fs5);
    }

    @Override // X.InterfaceC7830FGl
    public final /* bridge */ /* synthetic */ FS4 A7d(Context context) {
        return new FS4(context);
    }

    @Override // X.InterfaceC7830FGl
    public final /* synthetic */ FEZ AIs() {
        return Hnn.A00;
    }

    @Override // X.InterfaceC7830FGl
    public final /* synthetic */ int AY3() {
        return 3;
    }

    public FHV(AbstractC7847FHf abstractC7847FHf, FFL ffl, long j, boolean z) {
        this.A0E = j;
        this.A0G = ffl;
        this.A0F = abstractC7847FHf;
        C7834FGp[] c7834FGpArr = {new C7834FGp(A0P, this), new C7834FGp(A0H, this), new C7834FGp(A0U, this), new C7834FGp(A0V, this), new C7834FGp(A0N, this), new C7834FGp(A0M, this)};
        int i = 0;
        do {
            A0U(c7834FGpArr[i]);
            i++;
        } while (i < 6);
        if (!z) {
            C7834FGp.A00(A0O, this);
        }
        C7834FGp[] c7834FGpArr2 = {new C7834FGp(A0I, this), new C7834FGp(A0R, this), new C7834FGp(A0K, this), new C7834FGp(A0S, this), new C7834FGp(A0J, this), new C7834FGp(A0L, this), new C7834FGp(A0Q, this), new C7834FGp(A0T, this)};
        int i2 = 0;
        do {
            A0U(c7834FGpArr2[i2]);
            i2++;
        } while (i2 < 8);
    }

    @Override // X.InterfaceC7830FGl
    public final /* synthetic */ Class AIr() {
        return getClass();
    }
}
