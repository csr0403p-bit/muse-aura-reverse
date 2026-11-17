package X;

import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public final class GFO implements InterfaceC9347GFg {
    public static final GFU A01 = new GFR();
    public final GFU A00;

    public GFO() {
        GFU gfu;
        GFK gfk = GFK.A00;
        GFJ gfj = GFJ.A02;
        try {
            gfu = (GFU) AbstractC7610F5x.A0t("androidx.health.platform.client.proto.DescriptorMessageInfoFactory");
        } catch (Exception unused) {
            gfu = A01;
        }
        GFU[] gfuArr = {gfk, gfu};
        GFP gfp = new GFP();
        gfp.A00 = gfuArr;
        Charset charset = AbstractC9349GFi.A04;
        this.A00 = gfp;
    }
}
