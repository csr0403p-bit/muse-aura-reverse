package X;

import android.content.Context;
import android.view.ViewManager;
import android.view.WindowManager;
import android.view.animation.PathInterpolator;
import com.facebook.aura.R;
import com.instagram.common.bloks.BloksParseResult;

/* renamed from: X.FQq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8039FQq implements InterfaceC7646F8n {
    public final /* synthetic */ FBB A00;
    public final /* synthetic */ F6D A01;
    public final /* synthetic */ BloksParseResult A02;
    public final /* synthetic */ FDW A03;

    public C8039FQq(FBB fbb, F6D f6d, BloksParseResult bloksParseResult, FDW fdw) {
        this.A02 = bloksParseResult;
        this.A03 = fdw;
        this.A00 = fbb;
        this.A01 = f6d;
    }

    public static PathInterpolator A00(FDW fdw) {
        return fdw == null ? new PathInterpolator(0.0f, 0.0f, 1.0f, 1.0f) : new PathInterpolator(fdw.A06(35, 0.0f), fdw.A06(38, 0.0f), fdw.A06(36, 1.0f), fdw.A06(40, 1.0f));
    }

    @Override // X.InterfaceC7646F8n
    public final void execute(Context context, FBB fbb, Integer num) {
        int i;
        int iHashCode;
        FBB fbb2 = fbb;
        C7384Etj.A0Y(context, 0);
        BloksParseResult bloksParseResult = this.A02;
        FDW fdw = this.A03;
        if (fbb == null) {
            fbb2 = this.A00;
        }
        FBD fbd = fbb2.A02;
        final F6D f6d = this.A01;
        int iA07 = fdw.A07(35, 5000);
        int iA072 = fdw.A07(42, 100);
        int iA073 = fdw.A07(36, 100);
        PathInterpolator pathInterpolatorA00 = A00(fdw.A0C(43));
        PathInterpolator pathInterpolatorA002 = A00(fdw.A0C(38));
        final HsM hsMA0D = fdw.A0D(41);
        FR1 fr1 = new FR1() { // from class: X.FPs
            @Override // X.FR1
            public final void AVr() {
                HsM hsM = hsMA0D;
                F6D f6d2 = f6d;
                if (hsM != null) {
                    AbstractC7691FAk.A00(f6d2, Hj6.A02, hsM);
                }
            }
        };
        final HsM hsMA0D2 = fdw.A0D(40);
        FR2 fr2 = new FR2() { // from class: X.FPt
            @Override // X.FR2
            public final void ASZ() {
                HsM hsM = hsMA0D2;
                F6D f6d2 = f6d;
                if (hsM != null) {
                    AbstractC7691FAk.A00(f6d2, Hj6.A02, hsM);
                }
            }
        };
        boolean zA0L = fdw.A0L(54, false);
        String strA0E = bloksParseResult.A02.A0E();
        boolean zEquals = "mini".equals(fdw.A0F(44));
        String strA0F = fdw.A0F(48);
        Integer num2 = (strA0F == null || (iHashCode = strA0F.hashCode()) == -1383228885 || iHashCode != 115029 || !strA0F.equals("top")) ? C79.A01 : C79.A00;
        if (iA07 == -1) {
            throw C60O.A0i("Auto-dismiss duration must be >= 0ms");
        }
        C8042FQt c8042FQt = new C8042FQt(context, pathInterpolatorA00, pathInterpolatorA002, fr2, fr1, bloksParseResult, fbd, num2, strA0E, iA07, iA072, iA073, zA0L, zEquals);
        Context context2 = c8042FQt.A03;
        boolean z = c8042FQt.A0C;
        Integer num3 = c8042FQt.A0A;
        C8040FQr c8040FQr = new C8040FQr(context2, num3, z);
        c8040FQr.setBloksContentViewFromParseResult(context2, c8042FQt.A09, c8042FQt.A08);
        c8040FQr.A00 = c8042FQt.A00;
        c8040FQr.A02 = c8042FQt.A02;
        c8040FQr.A01 = c8042FQt.A01;
        c8040FQr.A04 = c8042FQt.A05;
        c8040FQr.A03 = c8042FQt.A04;
        c8040FQr.A06 = new FR0(c8042FQt);
        c8040FQr.A05 = new C8041FQs(c8040FQr, c8042FQt);
        c8040FQr.A0A = c8042FQt.A0D;
        c8040FQr.setTag(R.id.foa_toast_tag_server_id, c8042FQt.A0B);
        C8040FQr c8040FQr2 = AbstractC8043FQu.A00.get();
        if (c8040FQr2 != null) {
            c8040FQr2.A03(c8040FQr2.A01);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(z ? -2 : -1, -2, 99, 8, -3);
        if (z) {
            i = 17;
        } else {
            i = 80;
            if (num3.equals(C79.A00)) {
                i = 48;
            }
        }
        layoutParams.gravity = i;
        try {
            ViewManager viewManager = (ViewManager) context2.getSystemService("window");
            if (viewManager == null) {
                throw C3cG.A0Q("Window manager required but not found.");
            }
            viewManager.addView(c8040FQr, layoutParams);
            AbstractC8043FQu.A00 = BV4.A0q(c8040FQr);
            c8040FQr.A02();
        } catch (WindowManager.BadTokenException unused) {
        }
    }
}
