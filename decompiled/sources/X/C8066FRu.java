package X;

import android.content.ClipData;
import android.os.Build;

/* renamed from: X.FRu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8066FRu {
    public final Hqo A00;

    public C8066FRu(C8071FRz c8071FRz) {
        Hqo c8069FRx;
        if (Build.VERSION.SDK_INT >= 31) {
            c8069FRx = new C8069FRx(c8071FRz);
        } else {
            C8068FRw c8068FRw = new C8068FRw();
            InterfaceC8065FRt interfaceC8065FRt = c8071FRz.A00;
            c8068FRw.A02 = interfaceC8065FRt.ADj();
            c8068FRw.A01 = interfaceC8065FRt.AKn();
            c8068FRw.A00 = interfaceC8065FRt.AFl();
            c8068FRw.A03 = interfaceC8065FRt.AH6();
            c8068FRw.A04 = interfaceC8065FRt.getExtras();
            c8069FRx = c8068FRw;
        }
        this.A00 = c8069FRx;
    }

    public C8066FRu(ClipData clipData, int i) {
        Hqo c8069FRx;
        if (Build.VERSION.SDK_INT >= 31) {
            c8069FRx = new C8069FRx(clipData, i);
        } else {
            C8068FRw c8068FRw = new C8068FRw();
            c8068FRw.A02 = clipData;
            c8068FRw.A01 = i;
            c8069FRx = c8068FRw;
        }
        this.A00 = c8069FRx;
    }
}
