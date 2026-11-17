package X;

import android.content.Context;
import android.graphics.Rect;
import android.widget.ImageView;
import com.facebook.common.callercontext.ContextChain;

/* renamed from: X.EjG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7245EjG extends FGT<ImageView> implements InterfaceC7830FGl<ImageView> {
    public Rect A00;
    public C7226Eiq A01;
    public final ContextChain A02;
    public final InterfaceC7298EkP A03;
    public final Ej6 A04;
    public final C7197Ei9 A05;
    public final Ejq A06;
    public final Object A07;
    public final boolean A08;
    public final long A09;
    public final InterfaceC7830FGl<ImageView> A0A;
    public final Integer A0B;
    public static final C7244EjF A0E = new C7244EjF();
    public static final C7241EjC A0C = new C7241EjC();
    public static final C7246EjI A0D = new C7246EjI();

    /* JADX WARN: Illegal instructions before constructor call */
    public C7245EjG(ContextChain contextChain, InterfaceC7298EkP interfaceC7298EkP, Ej6 ej6, C7197Ei9 c7197Ei9, Ejq ejq, Object obj, long j, boolean z) {
        C0881AGi c0881AGi = C0881AGi.A00;
        super(null, c0881AGi, c0881AGi);
        this.A09 = j;
        this.A06 = ejq;
        this.A04 = ej6;
        this.A03 = interfaceC7298EkP;
        this.A05 = c7197Ei9;
        this.A08 = z;
        this.A07 = obj;
        this.A02 = contextChain;
        this.A0B = C79.A01;
        A0U(new C7834FGp(A0D, this));
        A0U(new C7834FGp(A0E, this));
        A0T(new C7834FGp(A0C, this));
        this.A0A = this;
    }

    @Override // X.InterfaceC7830FGl
    public final /* bridge */ /* synthetic */ ImageView A7d(Context context) {
        C7384Etj.A0Y(context, 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(new C7219Eij(((C7218Eii) EjN.A00()).A01));
        return imageView;
    }

    public static final boolean A01(C7245EjG c7245EjG, C7245EjG c7245EjG2) {
        return (C7384Etj.areEqual(c7245EjG.A06, c7245EjG2.A06) && C7384Etj.areEqual(c7245EjG.A05, c7245EjG2.A05) && c7245EjG.A08 == c7245EjG2.A08 && C7384Etj.areEqual(c7245EjG.A04, c7245EjG2.A04) && C7384Etj.areEqual(c7245EjG.A03, c7245EjG2.A03)) ? false : true;
    }

    @Override // X.FGT
    public final long A0J() {
        return this.A09;
    }

    @Override // X.FGT
    public final InterfaceC7830FGl<ImageView> A0K() {
        return this.A0A;
    }

    @Override // X.InterfaceC7830FGl
    public final /* bridge */ FEZ AIs() {
        return Hnn.A00;
    }

    @Override // X.FGT, X.InterfaceC7830FGl
    public final Integer AJX() {
        return this.A0B;
    }

    @Override // X.InterfaceC7830FGl
    public final /* bridge */ int AY3() {
        return 3;
    }

    public static final InterfaceC7300EkR A00(ImageView imageView) {
        Object drawable = imageView.getDrawable();
        if (drawable != null) {
            return (InterfaceC7300EkR) drawable;
        }
        throw C3cG.A0Q("imageView.drawable is null");
    }

    @Override // X.InterfaceC7830FGl
    public final /* bridge */ Class AIr() {
        return getClass();
    }
}
