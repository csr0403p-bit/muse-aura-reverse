package X;

import android.content.res.Resources;

/* renamed from: X.Ccv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC3697Ccv implements Runnable {
    public static final String __redex_internal_original_name = "zznl";
    public final /* synthetic */ EnumC10421Hbu A00;
    public final /* synthetic */ InterfaceC3592CWb A01;
    public final /* synthetic */ C3695Cct A02;
    public final /* synthetic */ String A03;

    public static void A00(EnumC10421Hbu enumC10421Hbu, InterfaceC3592CWb interfaceC3592CWb, C3695Cct c3695Cct) {
        CSA csa = c3695Cct.A02;
        EnumC3664CcK.A01.execute(new RunnableC3697Ccv(enumC10421Hbu, interfaceC3592CWb, c3695Cct, csa.A0C() ? (String) csa.A08() : CA8.A01.A00(c3695Cct.A06)));
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        AbstractC3820Cf8 c3796Cef;
        C3695Cct c3695Cct = this.A02;
        InterfaceC3592CWb interfaceC3592CWb = this.A01;
        EnumC10421Hbu enumC10421Hbu = this.A00;
        String str2 = this.A03;
        C3716CdF c3716CdF = (C3716CdF) interfaceC3592CWb;
        C3713CdC c3713CdC = c3716CdF.A02;
        c3713CdC.A02 = enumC10421Hbu;
        C3705Cd3 c3705Cd3 = new C3707Cd6(c3713CdC).A05;
        if (c3705Cd3 == null || (str = c3705Cd3.A09) == null || str.isEmpty()) {
            str = "NA";
        }
        C3708Cd7 c3708Cd7 = new C3708Cd7();
        c3708Cd7.A06 = "com.facebook.aura";
        c3708Cd7.A07 = c3695Cct.A05;
        synchronized (C3695Cct.class) {
            c3796Cef = C3695Cct.A09;
            if (c3796Cef == null) {
                C7528Ezc c7528EzcA00 = AbstractC7547F2b.A00(Resources.getSystem().getConfiguration());
                C3711CdA c3711CdA = new C3711CdA();
                for (int i = 0; i < c7528EzcA00.A01(); i++) {
                    c3711CdA.A00(c7528EzcA00.A02(i).toLanguageTag());
                }
                c3711CdA.A01 = true;
                Object[] objArr = c3711CdA.A02;
                int i2 = c3711CdA.A00;
                F0I f0i = AbstractC3820Cf8.A00;
                c3796Cef = i2 == 0 ? C3796Cef.A02 : new C3796Cef(i2, objArr);
                C3695Cct.A09 = c3796Cef;
            }
        }
        c3708Cd7.A00 = c3796Cef;
        c3708Cd7.A02 = AnonymousClass001.A0i();
        c3708Cd7.A09 = str;
        c3708Cd7.A08 = str2;
        CSA csa = c3695Cct.A03;
        c3708Cd7.A0A = csa.A0C() ? (String) csa.A08() : c3695Cct.A04.A00();
        c3708Cd7.A04 = 10;
        c3708Cd7.A05 = Integer.valueOf(c3695Cct.A00);
        c3716CdF.A00 = c3708Cd7;
        c3695Cct.A01.AjK(interfaceC3592CWb);
    }

    public /* synthetic */ RunnableC3697Ccv(EnumC10421Hbu enumC10421Hbu, InterfaceC3592CWb interfaceC3592CWb, C3695Cct c3695Cct, String str) {
        this.A02 = c3695Cct;
        this.A01 = interfaceC3592CWb;
        this.A00 = enumC10421Hbu;
        this.A03 = str;
    }
}
