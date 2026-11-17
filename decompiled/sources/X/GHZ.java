package X;

import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public final class GHZ {
    public static final InterfaceC9392GHh A01 = new GHa();
    public final InterfaceC9392GHh A00;

    public GHZ() {
        InterfaceC9392GHh interfaceC9392GHh;
        GHU ghu = GHU.A00;
        GHP ghp = GHP.A02;
        try {
            interfaceC9392GHh = (InterfaceC9392GHh) AbstractC7610F5x.A0t("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory");
        } catch (Exception unused) {
            interfaceC9392GHh = A01;
        }
        InterfaceC9392GHh[] interfaceC9392GHhArr = {ghu, interfaceC9392GHh};
        GHY ghy = new GHY();
        ghy.A00 = interfaceC9392GHhArr;
        Charset charset = AbstractC9352GFl.A04;
        this.A00 = ghy;
    }
}
