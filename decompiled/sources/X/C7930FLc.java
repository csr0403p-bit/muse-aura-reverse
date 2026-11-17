package X;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.aura.R;

/* renamed from: X.FLc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7930FLc implements C1HY, InterfaceC7992FOj {
    public FOu A00;
    public C8005FOz A01;
    public final Context A02;
    public final C5303Dfm A03;
    public final FLZ A04;
    public final FGE A05;
    public final FND A06;
    public final String A07;
    public final String A08;

    public C7930FLc(Context context, C7933FLf c7933FLf, FBD fbd) {
        C7384Etj.A0Y(c7933FLf, 1);
        this.A02 = context;
        this.A03 = new C5303Dfm(this, true);
        this.A05 = new FGE(this.A02);
        String str = c7933FLf.A08;
        this.A08 = str;
        this.A07 = c7933FLf.A06;
        this.A06 = FND.A02;
        Context context2 = this.A02;
        Integer num = C79.A00;
        if (context2 instanceof Activity) {
            AbstractC7607F5u.A0a((Activity) context2).setTag(R.id.testing_id_view_tag_key, "app_root_window");
        }
        SparseArray<Object> sparseArray = c7933FLf.A01;
        SparseArray<Object> sparseArray2 = (sparseArray == null || (sparseArray2 = sparseArray.clone()) == null) ? new SparseArray<>(3) : sparseArray2;
        FHL fhl = c7933FLf.A02;
        Integer numValueOf = fhl != null ? Integer.valueOf(fhl.AK5()) : null;
        String str2 = c7933FLf.A07;
        int i = c7933FLf.A00;
        Integer num2 = c7933FLf.A05;
        C7384Etj.A0Y(str, 3);
        sparseArray2.put(R.id.bk_context_key_app_id, str2);
        sparseArray2.put(R.id.bk_screen_container, this);
        sparseArray2.put(R.id.bk_screen_container_type, numValueOf);
        sparseArray2.put(R.id.bk_screen_container_id, str);
        if (num2 != null) {
            sparseArray2.put(R.id.bk_context_key_initial_render_status_provider, new DMV(i, num2.intValue()));
        }
        FLZ flz = new FLZ(context2, sparseArray2, c7933FLf, fbd, num);
        this.A03.A04(flz);
        this.A04 = flz;
        this.A03.A07(EnumC10573Huf.A02);
    }

    @Override // X.InterfaceC7992FOj
    public final View AMf(Context context) {
        C7384Etj.A0Y(context, 0);
        return AE7(context);
    }

    @Override // X.InterfaceC7992FOj
    public final void ACO() {
    }

    @Override // X.InterfaceC7992FOj
    public final String ACt() {
        return this.A08;
    }

    @Override // X.InterfaceC7992FOj
    public final View AE7(Context context) {
        FLZ flz = this.A04;
        Context context2 = flz.A04;
        C7729FCg c7729FCg = flz.A05;
        FGJ fgj = new FGJ(context2);
        fgj.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        c7729FCg.A05(fgj);
        return fgj;
    }

    @Override // X.InterfaceC7992FOj
    public final /* bridge */ /* synthetic */ View AGB() {
        return this.A05;
    }

    @Override // X.InterfaceC7992FOj
    public final FND AIl() {
        return this.A06;
    }

    @Override // X.InterfaceC7992FOj
    public final void ASB() {
    }

    @Override // X.InterfaceC7992FOj
    public final void AT0() {
        this.A04.A00();
    }

    @Override // X.InterfaceC7992FOj
    public final void ATC(boolean z) {
        HsM hsM;
        FLZ flz = this.A04;
        Hky hky = z ? Hky.A02 : Hky.A03;
        if (flz.A03 == C79.A01) {
            flz.A03 = C79.A0C;
            C7928FLa c7928FLa = flz.A02;
            if (c7928FLa == null || (hsM = c7928FLa.A03) == null) {
                return;
            }
            FDW fdw = c7928FLa.A01;
            FBB fbb = c7928FLa.A00;
            String str = hky == Hky.A03 ? "forward" : "back";
            C9115Fyg c9115FygA02 = C9115Fyg.A02(fbb);
            c9115FygA02.A06(str, 1);
            F9J.A02(fbb, fdw, c9115FygA02, hsM);
        }
    }

    @Override // X.InterfaceC7992FOj
    public final void AXK(C8005FOz c8005FOz) {
        this.A03.A07(EnumC10573Huf.A05);
        FOu fOu = (FOu) this.A04.ACs().A03(R.id.bk_context_key_insets_listener_delegate);
        C7384Etj.A0U(fOu);
        if (c8005FOz != null) {
            this.A01 = c8005FOz;
            this.A00 = fOu;
            c8005FOz.A0A.A00.add(fOu);
            c8005FOz.A0B.A00.add(fOu);
        }
    }

    @Override // X.InterfaceC7992FOj
    public final void AZw() {
    }

    @Override // X.InterfaceC7992FOj
    public final void destroy() {
        this.A03.A07(EnumC10573Huf.A03);
    }

    @Override // X.InterfaceC7992FOj
    public final Context getContext() {
        return this.A02;
    }

    @Override // X.C1HY
    public final /* bridge */ /* synthetic */ F2N getLifecycle() {
        return this.A03;
    }

    @Override // X.InterfaceC7992FOj
    public final void stop() {
        this.A03.A07(EnumC10573Huf.A02);
    }

    @Override // X.InterfaceC7992FOj
    public final void A8v() {
        FOu fOu;
        stop();
        this.A04.A05.A04();
        C8005FOz c8005FOz = this.A01;
        if (c8005FOz != null && (fOu = this.A00) != null) {
            c8005FOz.A0A.A00.remove(fOu);
            c8005FOz.A0B.A00.remove(fOu);
            this.A00 = null;
        }
        this.A01 = null;
    }
}
