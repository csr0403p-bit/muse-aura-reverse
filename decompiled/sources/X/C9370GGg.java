package X;

import java.nio.charset.Charset;

/* renamed from: X.GGg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9370GGg implements GHE {
    public static final InterfaceC9381GGu A01 = new C9377GGo();
    public final InterfaceC9381GGu A00;

    public C9370GGg() {
        InterfaceC9381GGu interfaceC9381GGu;
        GGU ggu = GGU.A00;
        try {
            interfaceC9381GGu = (InterfaceC9381GGu) AbstractC7610F5x.A0t("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory");
        } catch (Exception unused) {
            interfaceC9381GGu = A01;
        }
        InterfaceC9381GGu[] interfaceC9381GGuArr = {ggu, interfaceC9381GGu};
        C9371GGh c9371GGh = new C9371GGh();
        c9371GGh.A00 = interfaceC9381GGuArr;
        Charset charset = GGV.A03;
        this.A00 = c9371GGh;
    }
}
