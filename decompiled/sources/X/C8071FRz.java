package X;

import android.view.ContentInfo;

/* renamed from: X.FRz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8071FRz {
    public final InterfaceC8065FRt A00;

    public static C8071FRz A00(ContentInfo contentInfo) {
        return new C8071FRz(new C8070FRy(contentInfo));
    }

    public final ContentInfo A01() {
        ContentInfo contentInfoAMo = this.A00.AMo();
        contentInfoAMo.getClass();
        return contentInfoAMo;
    }

    public final String toString() {
        return this.A00.toString();
    }

    public C8071FRz(InterfaceC8065FRt interfaceC8065FRt) {
        this.A00 = interfaceC8065FRt;
    }
}
