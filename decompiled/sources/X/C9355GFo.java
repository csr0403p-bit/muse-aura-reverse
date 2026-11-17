package X;

import java.nio.charset.Charset;

/* renamed from: X.GFo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9355GFo implements InterfaceC9358GFr {
    public static final InterfaceC9357GFq A01 = new C9354GFn();
    public final InterfaceC9357GFq A00;

    public C9355GFo() {
        InterfaceC9357GFq interfaceC9357GFq;
        C9353GFm c9353GFm = C9353GFm.A00;
        C9359GFs c9359GFs = C9359GFs.A02;
        try {
            interfaceC9357GFq = (InterfaceC9357GFq) AbstractC7610F5x.A0t("androidx.glance.appwidget.protobuf.DescriptorMessageInfoFactory");
        } catch (Exception unused) {
            interfaceC9357GFq = A01;
        }
        InterfaceC9357GFq[] interfaceC9357GFqArr = {c9353GFm, interfaceC9357GFq};
        C9356GFp c9356GFp = new C9356GFp();
        c9356GFp.A00 = interfaceC9357GFqArr;
        Charset charset = AbstractC9351GFk.A04;
        this.A00 = c9356GFp;
    }
}
