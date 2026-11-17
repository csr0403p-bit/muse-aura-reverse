package X;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* renamed from: X.GPi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9574GPi {
    public final Context A00;
    public final C9699Ge6 A01;
    public final InterfaceC10505Hno A02;
    public final C78U A03;
    public final Object A04;
    public final Function0<Boolean> A05;
    public volatile HuC A06;
    public volatile Hwq A07;

    public final HuC A00() {
        HuC huCABw;
        HuC huC = this.A06;
        if (huC != null) {
            return huC;
        }
        synchronized (this) {
            huCABw = this.A06;
            if (huCABw == null) {
                huCABw = this.A02.ABw(new C9575GPj(this.A00, this.A01, this.A07, this.A03, this.A04, AnonymousClass003.A1Y(this.A05)));
                this.A06 = huCABw;
            }
        }
        return huCABw;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/78U;Ljava/lang/Object;LX/Ge6;LX/Hno;Lkotlin/jvm/functions/Function0<Ljava/lang/Boolean;>;)V */
    public C9574GPi(Context context, C9699Ge6 c9699Ge6, InterfaceC10505Hno interfaceC10505Hno, C78U c78u, Object obj, Function0 function0) {
        AnonymousClass003.A0u(context, c78u);
        C7384Etj.A0Y(interfaceC10505Hno, 4);
        this.A00 = context;
        this.A03 = c78u;
        this.A04 = obj;
        this.A01 = c9699Ge6;
        this.A02 = interfaceC10505Hno;
        this.A05 = function0;
        this.A07 = GPU.A00;
    }
}
