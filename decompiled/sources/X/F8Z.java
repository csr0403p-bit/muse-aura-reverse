package X;

import android.content.Context;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class F8Z implements InterfaceC7646F8n {
    public final Boolean A00;
    public final String A01;
    public final boolean A02;
    public final G0W<Context, FBB, Integer, Unit> A03;

    @Override // X.InterfaceC7646F8n
    public final void execute(Context context, FBB fbb, Integer num) {
        FD4 fd4;
        String str;
        C7384Etj.A0Y(context, 0);
        boolean z = false;
        if (this.A02 && (str = this.A01) != null && AnonymousClass002.A1b(this.A00, false)) {
            FD8 fd8 = FD3.A01;
            if (C7384Etj.areEqual(fd8 != null ? fd8.AK4() : null, str)) {
                z = true;
            }
        }
        this.A03.invoke(context, fbb, num);
        if (!z || (fd4 = FD3.A00) == null) {
            return;
        }
        fd4.A01();
    }

    /* JADX WARN: Incorrect types in method signature: (ZLjava/lang/String;Ljava/lang/Boolean;LX/G0W<-Landroid/content/Context;-LX/FBB;-Ljava/lang/Integer;Lkotlin/Unit;>;)V */
    public F8Z(Boolean bool, String str, G0W g0w, boolean z) {
        this.A02 = z;
        this.A01 = str;
        this.A00 = bool;
        this.A03 = g0w;
    }
}
