package X;

import X.EIN;
import android.app.ActivityManager;
import android.content.Context;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class EEk<T extends EIN> {
    public InterfaceC6553EEo A00;
    public Executor A02;
    public Executor A03;
    public boolean A04;
    public boolean A05;
    public final Context A07;
    public final String A09;
    public final C9uG<T> A0E;
    public final List<AbstractC6555EEr> A0B = C3cG.A0h();
    public final List<Object> A0C = C3cG.A0h();
    public final EEj A08 = new EEj();
    public Set<Integer> A01 = C3cG.A0k();
    public final Set<Integer> A0D = C3cG.A0k();
    public final List<EN5> A0A = C3cG.A0h();
    public boolean A06 = true;

    public EEk(Context context, Class<T> cls, String str) {
        this.A0E = new C0861A6i(cls);
        this.A07 = context;
        this.A09 = str;
    }

    /* JADX WARN: Incorrect return type in method signature: ([LX/EEq;)LX/EEk<TT;>; */
    public final void A01(AbstractC6554EEq... abstractC6554EEqArr) {
        int length = abstractC6554EEqArr.length;
        for (AbstractC6554EEq abstractC6554EEq : abstractC6554EEqArr) {
            Set<Integer> set = this.A0D;
            set.add(Integer.valueOf(abstractC6554EEq.startVersion));
            set.add(Integer.valueOf(abstractC6554EEq.endVersion));
        }
        EEj eEj = this.A08;
        AbstractC6554EEq[] abstractC6554EEqArr2 = (AbstractC6554EEq[]) Arrays.copyOf(abstractC6554EEqArr, length);
        C7384Etj.A0Y(abstractC6554EEqArr2, 0);
        for (AbstractC6554EEq abstractC6554EEq2 : abstractC6554EEqArr2) {
            eEj.A00(abstractC6554EEq2);
        }
    }

    public final T A00() throws ClassNotFoundException {
        String name;
        String strA0O;
        ActivityManager activityManager;
        Executor executor = this.A02;
        Executor executor2 = this.A03;
        if (executor == null) {
            if (executor2 == null) {
                executor2 = Dg0.A02;
                this.A03 = executor2;
            }
            this.A02 = executor2;
        } else if (executor2 == null) {
            this.A03 = executor;
        }
        Set<Integer> set = this.A0D;
        Set<Integer> set2 = this.A01;
        if (!set.isEmpty()) {
            Iterator<Integer> it = set.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (set2.contains(Integer.valueOf(iIntValue))) {
                    throw BV5.A0Q("Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ", iIntValue);
                }
            }
        }
        InterfaceC6553EEo c6550EEl = this.A00;
        if (c6550EEl == null) {
            c6550EEl = new C6550EEl();
        }
        Context context = this.A07;
        String str = this.A09;
        EEj eEj = this.A08;
        List<AbstractC6555EEr> list = this.A0B;
        Object systemService = context.getSystemService("activity");
        Integer num = (!(systemService instanceof ActivityManager) || (activityManager = (ActivityManager) systemService) == null || activityManager.isLowRamDevice()) ? C79.A01 : C79.A0C;
        Executor executor3 = this.A02;
        if (executor3 == null) {
            throw C60O.A0i("Required value was null.");
        }
        Executor executor4 = this.A03;
        if (executor4 == null) {
            throw C60O.A0i("Required value was null.");
        }
        EIQ eiq = new EIQ(context, null, eEj, null, c6550EEl, null, num, str, null, list, this.A0C, this.A0A, set2, null, executor3, executor4, null, false, this.A06, this.A05, this.A04);
        eiq.A01 = true;
        Class clsA01 = C9uT.A01(this.A0E);
        Package r0 = clsA01.getPackage();
        if (r0 == null || (name = r0.getName()) == null) {
            name = "";
        }
        String canonicalName = clsA01.getCanonicalName();
        C7384Etj.A0X(canonicalName);
        int length = name.length();
        if (length != 0) {
            canonicalName = BV4.A0g(length, canonicalName);
        }
        String strA0M = FGI.A0M(canonicalName.replace('.', '_'), "_Impl");
        if (length == 0) {
            strA0O = strA0M;
        } else {
            try {
                strA0O = FGI.A0O(name, strA0M, '.');
            } catch (ClassNotFoundException e) {
                throw BV4.A0d(FGI.A0h("Cannot find implementation for ", clsA01.getCanonicalName(), ". ", strA0M, " does not exist. Is Room annotation processor correctly configured?"), e);
            } catch (IllegalAccessException e2) {
                throw BV4.A0d(FGI.A0M("Cannot access the constructor ", clsA01.getCanonicalName()), e2);
            } catch (InstantiationException e3) {
                throw BV4.A0d(FGI.A0M("Failed to create an instance of ", clsA01.getCanonicalName()), e3);
            }
        }
        Class<?> cls = Class.forName(strA0O, true, clsA01.getClassLoader());
        C7384Etj.A0Z(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>");
        T t = (T) BV5.A0b(cls);
        t.init(eiq);
        return t;
    }
}
