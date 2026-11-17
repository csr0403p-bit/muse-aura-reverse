package X;

import android.os.Trace;
import java.io.File;

/* renamed from: X.C4z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C3242C4z implements InterfaceC3236C4t {
    public final /* synthetic */ C3241C4y A00;
    public final /* synthetic */ boolean A01;

    @Override // X.InterfaceC3236C4t
    public final void AUN(EnumC3223C4g enumC3223C4g, InterfaceC3235C4s interfaceC3235C4s) {
        C3241C4y c3241C4y = this.A00;
        boolean z = this.A01;
        if (enumC3223C4g == null) {
            CFK.A06(C9Y.TAG, "category is null, cannot assemble report");
            return;
        }
        C4Z c4zA00 = F18.A00(c3241C4y);
        String str = c3241C4y.A03().A07;
        AbstractC3191C2p.A00(FGI.A0d("processCurrentSession.", enumC3223C4g.name(), ".", str));
        try {
            synchronized (C4Z.A06) {
                File[] fileArrA02 = c4zA00.A00.A02(str);
                int length = fileArrA02.length;
                int i = length - 1;
                if (i >= 0) {
                    C4Z.A00(enumC3223C4g, c4zA00, fileArrA02[i], i > 0 ? fileArrA02[length - 2] : null, false, true);
                }
            }
            if (z) {
                c3241C4y.A0T.AMN().A04(enumC3223C4g, null);
            }
        } finally {
            Trace.endSection();
        }
    }

    public /* synthetic */ C3242C4z(C3241C4y c3241C4y, boolean z) {
        this.A00 = c3241C4y;
        this.A01 = z;
    }
}
