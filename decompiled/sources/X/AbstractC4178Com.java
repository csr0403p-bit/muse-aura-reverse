package X;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.Com, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4178Com {
    public final int A00;
    public final Context A01;
    public final Looper A02;
    public final InterfaceC3786CeU A03;
    public final C4240CrC A04;
    public final AbstractC4272Cry A05;
    public final C4247CrJ A06;
    public final C4163CoN A07;
    public final InterfaceC4457CwZ A08;
    public final String A09;

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/CrC<TO;>;TO;LX/Cs4;)V */
    public AbstractC4178Com(Context context, InterfaceC3786CeU interfaceC3786CeU, C4240CrC c4240CrC, C4276Cs4 c4276Cs4) {
        CRy.A04(context, "Null context is not permitted.");
        CRy.A04(c4240CrC, "Api must not be null.");
        CRy.A04(c4276Cs4, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        CRy.A04(applicationContext, "The provided context did not have an application context.");
        this.A01 = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.A09 = attributionTag;
        this.A04 = c4240CrC;
        this.A03 = interfaceC3786CeU;
        this.A02 = c4276Cs4.A00;
        this.A06 = new C4247CrJ(interfaceC3786CeU, c4240CrC, attributionTag);
        this.A05 = new C4365CuK(this);
        C4163CoN c4163CoNA01 = C4163CoN.A01(applicationContext);
        this.A07 = c4163CoNA01;
        this.A00 = c4163CoNA01.A0A.getAndIncrement();
        this.A08 = c4276Cs4.A01;
        BV4.A1D(c4163CoNA01.A05, this, 7);
    }

    public static CSC A01(AbstractC4178Com abstractC4178Com, C4231Cqf c4231Cqf, int i, int i2) {
        c4231Cqf.A00 = i;
        return A02(abstractC4178Com, c4231Cqf.A00(), i2);
    }

    public static final CSC A02(AbstractC4178Com abstractC4178Com, C4232Cqg c4232Cqg, int i) {
        CSE cse = new CSE();
        InterfaceC4457CwZ interfaceC4457CwZ = abstractC4178Com.A08;
        C4163CoN c4163CoN = abstractC4178Com.A07;
        C4163CoN.A05(abstractC4178Com, c4163CoN, cse, c4232Cqg.A00);
        BV4.A1D(c4163CoN.A05, new C4284CsJ(abstractC4178Com, new C4177Col(interfaceC4457CwZ, c4232Cqg, cse, i), c4163CoN.A0B.get()), 4);
        return cse.A00;
    }

    public static final void A03(AbstractC4178Com abstractC4178Com, AbstractC4185Cov abstractC4185Cov, int i) {
        boolean z = true;
        if (!abstractC4185Cov.A02 && !AnonymousClass001.A1X(BasePendingResult.A0B.get())) {
            z = false;
        }
        abstractC4185Cov.A02 = z;
        C4163CoN c4163CoN = abstractC4178Com.A07;
        BV4.A1D(c4163CoN.A05, new C4284CsJ(abstractC4178Com, new C4180Coq(abstractC4185Cov, i), c4163CoN.A0B.get()), 4);
    }

    public final CSA<Boolean> A04(C4248CrK<?> c4248CrK, int i) {
        C4163CoN c4163CoN = this.A07;
        CSE cse = new CSE();
        C4163CoN.A05(this, c4163CoN, cse, i);
        BV4.A1D(c4163CoN.A05, new C4284CsJ(this, new CpT(c4248CrK, cse), c4163CoN.A0B.get()), 13);
        return cse.A00;
    }
}
