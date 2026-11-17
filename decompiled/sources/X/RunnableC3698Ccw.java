package X;

import android.content.res.Resources;

/* renamed from: X.Ccw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC3698Ccw implements Runnable {
    public static final String __redex_internal_original_name = "zznx";
    public final /* synthetic */ EnumC10420Hbt A00;
    public final /* synthetic */ Cbz A01;
    public final /* synthetic */ C3696Ccu A02;
    public final /* synthetic */ String A03;

    public static void A00(EnumC10420Hbt enumC10420Hbt, Cbz cbz, C3696Ccu c3696Ccu) {
        CSA csa = c3696Ccu.A02;
        EnumC3664CcK.A01.execute(new RunnableC3698Ccw(enumC10420Hbt, cbz, c3696Ccu, csa.A0C() ? (String) csa.A08() : CA8.A01.A00(c3696Ccu.A06)));
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        AbstractC3815Cey c3795Cee;
        C3696Ccu c3696Ccu = this.A02;
        Cbz cbz = this.A01;
        EnumC10420Hbt enumC10420Hbt = this.A00;
        String str2 = this.A03;
        C3717CdG c3717CdG = (C3717CdG) cbz;
        C3712CdB c3712CdB = c3717CdG.A02;
        c3712CdB.A02 = enumC10420Hbt;
        C3706Cd4 c3706Cd4 = new Cd5(c3712CdB).A05;
        if (c3706Cd4 == null || (str = c3706Cd4.A09) == null || str.isEmpty()) {
            str = "NA";
        }
        C3709Cd8 c3709Cd8 = new C3709Cd8();
        c3709Cd8.A06 = "com.facebook.aura";
        c3709Cd8.A07 = c3696Ccu.A05;
        synchronized (C3696Ccu.class) {
            c3795Cee = C3696Ccu.A09;
            if (c3795Cee == null) {
                C7528Ezc c7528EzcA00 = AbstractC7547F2b.A00(Resources.getSystem().getConfiguration());
                C3710Cd9 c3710Cd9 = new C3710Cd9();
                for (int i = 0; i < c7528EzcA00.A01(); i++) {
                    c3710Cd9.A00(c7528EzcA00.A02(i).toLanguageTag());
                }
                c3710Cd9.A01 = true;
                Object[] objArr = c3710Cd9.A02;
                int i2 = c3710Cd9.A00;
                F0J f0j = AbstractC3815Cey.A00;
                c3795Cee = i2 == 0 ? C3795Cee.A02 : new C3795Cee(i2, objArr);
                C3696Ccu.A09 = c3795Cee;
            }
        }
        c3709Cd8.A00 = c3795Cee;
        c3709Cd8.A02 = AnonymousClass001.A0i();
        c3709Cd8.A09 = str;
        c3709Cd8.A08 = str2;
        CSA csa = c3696Ccu.A03;
        c3709Cd8.A0A = csa.A0C() ? (String) csa.A08() : c3696Ccu.A04.A00();
        c3709Cd8.A04 = 10;
        c3709Cd8.A05 = Integer.valueOf(c3696Ccu.A00);
        c3717CdG.A00 = c3709Cd8;
        c3696Ccu.A01.AjI(cbz);
    }

    public /* synthetic */ RunnableC3698Ccw(EnumC10420Hbt enumC10420Hbt, Cbz cbz, C3696Ccu c3696Ccu, String str) {
        this.A02 = c3696Ccu;
        this.A01 = cbz;
        this.A00 = enumC10420Hbt;
        this.A03 = str;
    }
}
