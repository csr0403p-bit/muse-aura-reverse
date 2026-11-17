package X;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.Fgi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8583Fgi {
    public final Map<Integer, String> A04 = C3cG.A0j();
    public final Map<String, Integer> A02 = C3cG.A0j();
    public final Map<String, Fh7> A05 = C3cG.A0j();
    public final List<String> A01 = C3cG.A0h();
    public final transient Map<String, C8602Fh6<?>> A06 = C3cG.A0j();
    public final Map<String, Object> A03 = C3cG.A0j();
    public final Bundle A00 = BV6.A0N();

    /* JADX WARN: Incorrect types in method signature: <I:Ljava/lang/Object;O:Ljava/lang/Object;>(Ljava/lang/String;LX/1HY;LX/Hx6<TI;TO;>;LX/FT4<TO;>;)LX/HwU<TI;>; */
    public final C8587Fgm A01(final FT4 ft4, final Hx6 hx6, C1HY c1hy, final String str) {
        AnonymousClass005.A11(str, hx6, ft4, 0);
        F2N lifecycle = c1hy.getLifecycle();
        C5303Dfm c5303Dfm = (C5303Dfm) lifecycle;
        if (c5303Dfm.A01.A00(EnumC10573Huf.A06)) {
            StringBuilder sbA0f = C3cG.A0f(c1hy, "LifecycleOwner ");
            sbA0f.append(" is attempting to register while current state is ");
            sbA0f.append(c5303Dfm.A01);
            throw BV8.A0m(". LifecycleOwners must call register before they are STARTED.", sbA0f);
        }
        A00(str);
        Map<String, Fh7> map = this.A05;
        Fh7 fh7 = map.get(str);
        if (fh7 == null) {
            fh7 = new Fh7(lifecycle);
        }
        Dg3 dg3 = new Dg3() { // from class: X.Fgk
            @Override // X.Dg3
            public final void onStateChanged(C1HY c1hy2, EnumC3085Bxl enumC3085Bxl) {
                AbstractC8583Fgi abstractC8583Fgi = this;
                String str2 = str;
                FT4 ft42 = ft4;
                Hx6 hx62 = hx6;
                C7384Etj.A0Y(enumC3085Bxl, 5);
                if (EnumC3085Bxl.ON_START != enumC3085Bxl) {
                    if (EnumC3085Bxl.ON_STOP == enumC3085Bxl) {
                        abstractC8583Fgi.A06.remove(str2);
                        return;
                    } else {
                        if (EnumC3085Bxl.ON_DESTROY == enumC3085Bxl) {
                            abstractC8583Fgi.A03(str2);
                            return;
                        }
                        return;
                    }
                }
                abstractC8583Fgi.A06.put(str2, new C8602Fh6<>(ft42, hx62));
                Map<String, Object> map2 = abstractC8583Fgi.A03;
                if (map2.containsKey(str2)) {
                    Object obj = map2.get(str2);
                    map2.remove(str2);
                    ft42.onActivityResult(obj);
                }
                Bundle bundle = abstractC8583Fgi.A00;
                ActivityResult activityResult = (ActivityResult) A5o.A00(bundle, ActivityResult.class, str2);
                if (activityResult != null) {
                    bundle.remove(str2);
                    ft42.onActivityResult(hx62.parseResult(activityResult.A00, activityResult.A01));
                }
            }
        };
        fh7.A00.A04(dg3);
        fh7.A01.add(dg3);
        map.put(str, fh7);
        return new C8587Fgm(this, hx6, str);
    }

    /* JADX WARN: Incorrect types in method signature: <I:Ljava/lang/Object;O:Ljava/lang/Object;>(Ljava/lang/String;LX/Hx6<TI;TO;>;LX/FT4<TO;>;)LX/HwU<TI;>; */
    /* JADX WARN: Multi-variable type inference failed */
    public final C8588Fgn A02(FT4 ft4, Hx6 hx6, String str) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(hx6, 1);
        A00(str);
        this.A06.put(str, new C8602Fh6<>(ft4, hx6));
        Map<String, Object> map = this.A03;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            ft4.onActivityResult(obj);
        }
        Bundle bundle = this.A00;
        ActivityResult activityResult = (ActivityResult) A5o.A00(bundle, ActivityResult.class, str);
        if (activityResult != null) {
            bundle.remove(str);
            ft4.onActivityResult(hx6.parseResult(activityResult.A00, activityResult.A01));
        }
        return new C8588Fgn(this, hx6, str);
    }

    private final void A00(String str) {
        Map<String, Integer> map = this.A02;
        if (map.get(str) == null) {
            C7587F5a c7587F5a = new C7587F5a(0);
            Iterator it = new C8154FWw(new C79x(c7587F5a, new C7590F5d(c7587F5a, 11))).iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                int iIntValue = number.intValue();
                Map<Integer, String> map2 = this.A04;
                if (!map2.containsKey(Integer.valueOf(iIntValue))) {
                    Integer numValueOf = Integer.valueOf(number.intValue());
                    map2.put(numValueOf, str);
                    map.put(str, numValueOf);
                    return;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    }

    public final void A03(String str) {
        Integer numRemove;
        if (!this.A01.contains(str) && (numRemove = this.A02.remove(str)) != null) {
            this.A04.remove(numRemove);
        }
        this.A06.remove(str);
        Map<String, Object> map = this.A03;
        if (map.containsKey(str)) {
            StringBuilder sbA0x = C3cI.A0x("Dropping pending result for request ", str);
            sbA0x.append(": ");
            Log.w("ActivityResultRegistry", C8j3.A14(map.get(str), sbA0x));
            map.remove(str);
        }
        Bundle bundle = this.A00;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", AnonymousClass006.A0y(A5o.A00(bundle, ActivityResult.class, str), ": ", C3cI.A0x("Dropping pending result for request ", str)));
            bundle.remove(str);
        }
        Map<String, Fh7> map2 = this.A05;
        Fh7 fh7 = map2.get(str);
        if (fh7 != null) {
            List<Dg3> list = fh7.A01;
            Iterator<Dg3> it = list.iterator();
            while (it.hasNext()) {
                fh7.A00.A05(it.next());
            }
            list.clear();
            map2.remove(str);
        }
    }

    public final boolean A04(Intent intent, int i, int i2) {
        String str = (String) BV5.A0f(this.A04, i);
        if (str == null) {
            return false;
        }
        C8602Fh6<?> c8602Fh6 = this.A06.get(str);
        if (c8602Fh6 != null) {
            FT4<?> ft4 = c8602Fh6.A00;
            List<String> list = this.A01;
            if (list.contains(str)) {
                ft4.onActivityResult(c8602Fh6.A01.parseResult(i2, intent));
                list.remove(str);
                return true;
            }
        }
        this.A03.remove(str);
        this.A00.putParcelable(str, new ActivityResult(i2, intent));
        return true;
    }
}
