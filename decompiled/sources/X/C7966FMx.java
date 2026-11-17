package X;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import com.facebook.aura.R;
import java.util.Iterator;

/* renamed from: X.FMx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7966FMx implements InterfaceC7992FOj {
    public C7968FMz A00;
    public FOu A01;
    public C8005FOz A02;
    public final Context A03;
    public final View A04;
    public final FND A05 = FND.A02;
    public final String A06;

    /* JADX WARN: Finally extract failed */
    @Override // X.InterfaceC7992FOj
    public final View AE7(Context context) {
        boolean z;
        C7384Etj.A0Y(context, 0);
        C7968FMz c7968FMz = this.A00;
        if (c7968FMz == null) {
            C7384Etj.A0b("bloksSurfaceController");
            throw F60.createAndThrow();
        }
        try {
            FN2 fn2 = c7968FMz.A07;
            FGJ fgj = new FGJ(context);
            fn2.A01 = fgj;
            C7729FCg c7729FCg = fn2.A00;
            if (c7729FCg != null) {
                z = true;
                c7729FCg.A05(fgj);
            } else {
                z = false;
                if (fn2.A09.compareAndSet(false, true)) {
                    Huk huk = fn2.A06;
                    if (huk == null) {
                        FN2.A00(fn2, 0);
                    } else {
                        FN2.A00(fn2, 1);
                        FN2.A01(fn2, (Hsv) huk, 2, 3);
                    }
                }
            }
            Pair pairCreate = Pair.create(fn2.A01, Boolean.valueOf(z));
            FNC fnc = c7968FMz.A00;
            if (fnc != null) {
                fnc.A01(fn2);
                FN9 fn9 = new FN9(c7968FMz, fn2);
                c7968FMz.A02 = fn9;
                c7968FMz.A00.A00(fn9);
            }
            Object obj = pairCreate.first;
            if (obj != null) {
                return (View) obj;
            }
            throw BV4.A0U();
        } catch (Throwable th) {
            FNC fnc2 = c7968FMz.A00;
            if (fnc2 == null) {
                throw th;
            }
            FN2 fn22 = c7968FMz.A07;
            fnc2.A01(fn22);
            FN9 fn92 = new FN9(c7968FMz, fn22);
            c7968FMz.A02 = fn92;
            c7968FMz.A00.A00(fn92);
            throw th;
        }
    }

    @Override // X.InterfaceC7992FOj
    public final View AMf(Context context) {
        C7384Etj.A0Y(context, 0);
        return AE7(context);
    }

    @Override // X.InterfaceC7992FOj
    public final void A8v() {
        FOu fOu;
        C8005FOz c8005FOz = this.A02;
        if (c8005FOz != null && (fOu = this.A01) != null) {
            c8005FOz.A0A.A00.remove(fOu);
            c8005FOz.A0B.A00.remove(fOu);
            this.A01 = null;
        }
        this.A02 = null;
        C7968FMz c7968FMz = this.A00;
        if (c7968FMz == null) {
            C7384Etj.A0b("bloksSurfaceController");
            throw F60.createAndThrow();
        }
        try {
            FOG fog = c7968FMz.A02;
            if (fog != null) {
                FNC fnc = c7968FMz.A00;
                if (fnc != null) {
                    fnc.A01(fog);
                }
                c7968FMz.A02 = null;
            }
            FNA fna = c7968FMz.A01;
            if (fna != null) {
                fna.APa("BloksSurfaceController_onDestroyView");
            }
        } finally {
        }
    }

    @Override // X.InterfaceC7992FOj
    public final void ACO() {
        if (this.A00 == null) {
            C7384Etj.A0b("bloksSurfaceController");
            throw F60.createAndThrow();
        }
    }

    @Override // X.InterfaceC7992FOj
    public final String ACt() {
        return this.A06;
    }

    @Override // X.InterfaceC7992FOj
    public final View AGB() {
        return this.A04;
    }

    @Override // X.InterfaceC7992FOj
    public final FND AIl() {
        return this.A05;
    }

    @Override // X.InterfaceC7992FOj
    public final void AT0() {
        C7968FMz c7968FMz = this.A00;
        if (c7968FMz == null) {
            C7384Etj.A0b("bloksSurfaceController");
            throw F60.createAndThrow();
        }
        Integer num = c7968FMz.A03;
        Integer num2 = C79.A01;
        if (num != num2) {
            c7968FMz.A03 = num2;
            if (c7968FMz.ACs() != null) {
                c7968FMz.A05 = true;
                FD3.A03.A04(c7968FMz);
            }
        }
    }

    @Override // X.InterfaceC7992FOj
    public final void ATC(boolean z) {
        C7968FMz c7968FMz = this.A00;
        if (c7968FMz == null) {
            C7384Etj.A0b("bloksSurfaceController");
            throw F60.createAndThrow();
        }
        if (c7968FMz.A03 == C79.A01) {
            c7968FMz.A03 = C79.A0C;
        }
    }

    @Override // X.InterfaceC7992FOj
    public final void AXK(C8005FOz c8005FOz) {
        C7968FMz c7968FMz = this.A00;
        if (c7968FMz == null) {
            C7384Etj.A0b("bloksSurfaceController");
            throw F60.createAndThrow();
        }
        FBB fbbACs = c7968FMz.ACs();
        if (fbbACs != null) {
            FOu fOu = (FOu) fbbACs.A03(R.id.bk_context_key_insets_listener_delegate);
            C7384Etj.A0U(fOu);
            if (c8005FOz != null) {
                this.A02 = c8005FOz;
                this.A01 = fOu;
                c8005FOz.A0A.A00.add(fOu);
                c8005FOz.A0B.A00.add(fOu);
            }
        }
    }

    @Override // X.InterfaceC7992FOj
    public final void AZw() {
        C7968FMz c7968FMz = this.A00;
        if (c7968FMz == null) {
            C7384Etj.A0b("bloksSurfaceController");
            throw F60.createAndThrow();
        }
        FNC fnc = c7968FMz.A00;
        if (fnc != null) {
            C7974FNp<T, Config> c7974FNp = ((C7973FNo) fnc.A01).A01;
            FOM.A00();
            try {
                C7974FNp.A02(c7974FNp, 1);
            } finally {
                FOM.A00();
            }
        }
    }

    @Override // X.InterfaceC7992FOj
    public final void destroy() {
        FDW fdw;
        int i;
        FBB fbbA02;
        F9b f9bA03;
        C7968FMz c7968FMz = this.A00;
        if (c7968FMz == null) {
            C7384Etj.A0b("bloksSurfaceController");
            throw F60.createAndThrow();
        }
        c7968FMz.A04 = true;
        Object obj = c7968FMz.A08.A05;
        if ((obj instanceof FDW) && (fdw = (FDW) obj) != null) {
            int i2 = fdw.A05;
            if (i2 != 13647) {
                i = i2 == 13784 ? 44 : 48;
            }
            HsM hsMA0D = fdw.A0D(i);
            if (hsMA0D != null) {
                C9115Fyg c9115FygA00 = C9115Fyg.A00();
                FN2 fn2 = c7968FMz.A07;
                C7729FCg c7729FCg = fn2.A00;
                Hj6 hj6A03 = C9115Fyg.A03(c9115FygA00, c7729FCg != null ? c7729FCg.A02() : null, 0);
                C7729FCg c7729FCg2 = fn2.A00;
                if (c7729FCg2 != null && (f9bA03 = FBA.A03((fbbA02 = c7729FCg2.A02()))) != null) {
                    F6D.A03(fbbA02, f9bA03.A0Q, hj6A03, hsMA0D);
                }
            }
        }
        FNC fnc = c7968FMz.A00;
        if (fnc != null) {
            fnc.A01.A02();
        }
        c7968FMz.A00 = null;
        FN2 fn22 = c7968FMz.A07;
        fn22.A0B = true;
        C7729FCg c7729FCg3 = fn22.A00;
        if (c7729FCg3 != null) {
            c7729FCg3.A03();
        }
        fn22.A00 = null;
        fn22.A0A.set(null);
        c7968FMz.A0F.set(null);
        Iterator<FDF> it = c7968FMz.A0C.iterator();
        while (it.hasNext()) {
            it.next().AVc(c7968FMz);
        }
    }

    @Override // X.InterfaceC7992FOj
    public final Context getContext() {
        return this.A03;
    }

    @Override // X.InterfaceC7992FOj
    public final void stop() {
        C7968FMz c7968FMz = this.A00;
        if (c7968FMz == null) {
            C7384Etj.A0b("bloksSurfaceController");
            throw F60.createAndThrow();
        }
        FNA fna = c7968FMz.A01;
        if (fna != null) {
            fna.APa("BloksSurfaceController_onPause");
        }
    }

    public C7966FMx(FGR fgr, String str) {
        this.A06 = str;
        this.A03 = AbstractC7608F5v.A0E(fgr);
        this.A04 = fgr;
    }

    @Override // X.InterfaceC7992FOj
    public final void ASB() {
        A8v();
    }
}
