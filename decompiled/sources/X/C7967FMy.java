package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.Deque;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.FMy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7967FMy {
    public final Fragment A00;
    public final FOS A01;
    public final FOB A02;
    public final FNP A03;
    public final Function0<Unit> A04;

    public C7967FMy(Fragment fragment, FOS fos, Function0 function0) {
        C7384Etj.A0Y(fos, 1);
        this.A00 = fragment;
        this.A01 = fos;
        this.A04 = function0;
        this.A03 = new FNP(fos, FZO.A02(this, 8));
        FOB fob = new FOB(fragment, this);
        this.A02 = fob;
        FOF.A00.A01();
        fos.A05 = fob;
    }

    public static void A00(C7967FMy c7967FMy, HiG hiG, Runnable runnable) {
        FOS fos = c7967FMy.A01;
        if (fos.A0A.A0J instanceof FOE) {
            c7967FMy.A04.invoke();
        }
        fos.A0E = runnable;
        if (fos.A0A.A0J instanceof FOE) {
            fos.A0H = true;
            fos.A00 = 1;
            return;
        }
        FOX fox = fos.A08;
        if (fox != null) {
            fos.A0H = true;
            fos.A00 = 1;
            if (hiG == HiG.A03) {
                fox.A02();
            } else {
                fox.dismiss();
            }
        }
    }

    public static void A01(C7967FMy c7967FMy, C7964FMu c7964FMu, InterfaceC7992FOj interfaceC7992FOj, C7944FLz c7944FLz) {
        Fragment fragment = c7967FMy.A00;
        Context contextRequireContext = fragment.requireContext();
        C7384Etj.A0U(contextRequireContext);
        FOS fos = c7967FMy.A01;
        FNW fnw = FOF.A00;
        fos.A0K.size();
        fnw.A04();
        FOS.A02(contextRequireContext, fos, c7964FMu, interfaceC7992FOj, c7944FLz);
        if (AbstractC7609F5w.A1a(AbstractC5321DgF.A02(C79.A0C, new C8632Fhj(2)))) {
            A25 a25A01 = A23.A01(contextRequireContext);
            BV7.A1D(c7967FMy, a25A01.A00);
            fragment.mLifecycleRegistry.A04(new FNI(c7967FMy, a25A01));
        }
    }

    public static void A02(C7967FMy c7967FMy, C7964FMu c7964FMu, InterfaceC7992FOj interfaceC7992FOj, C7944FLz c7944FLz) {
        String str;
        FNP fnp = c7967FMy.A03;
        FOS fos = fnp.A00;
        Context contextInvoke = fnp.A01.invoke();
        C7384Etj.A0Y(contextInvoke, 0);
        FNW fnw = FOF.A00;
        Deque<FNZ> deque = fos.A0K;
        deque.size();
        fnw.A04();
        FNZ fnzPeek = deque.peek();
        if (fnzPeek == null) {
            str = "Cannot push to an empty bottom sheet. Please call open() to show new Screen content in the bottom sheet.";
        } else {
            if (!fos.A0H) {
                InterfaceC7992FOj interfaceC7992FOj2 = fnzPeek.A03;
                interfaceC7992FOj2.stop();
                interfaceC7992FOj2.ATC(false);
                FOS.A02(contextInvoke, fos, c7964FMu, interfaceC7992FOj, c7944FLz);
                return;
            }
            str = "Attempting to push to a dismissing sheet. The content will not be displayed properly";
        }
        FFI.A01(null, str, null);
        deque.size();
        String str2 = (String) C7384Etj.A0G(FNW.A00);
        if (!str2.equals("DEFAULT")) {
            throw AbstractC7610F5x.A0o(str2);
        }
    }

    public final boolean A03(String str) {
        Iterator<FNZ> it = this.A01.A0K.iterator();
        C7384Etj.A0U(it);
        while (it.hasNext()) {
            if (str.equals(it.next().A03.ACt())) {
                return true;
            }
        }
        return false;
    }
}
