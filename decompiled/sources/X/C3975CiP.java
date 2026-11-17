package X;

import android.content.Context;
import com.facebook.pushlite.model.PushInfraMetaData;
import com.facebook.zstd.ZstdInputStream;
import java.io.IOException;

/* renamed from: X.CiP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3975CiP implements InterfaceC3984CiY {
    public static final C3975CiP A00 = new C3975CiP();

    @Override // X.InterfaceC3984CiY
    public final Object AYX(C3979CiT c3979CiT) throws IOException {
        ZstdInputStream zstdInputStream;
        C7384Etj.A0Y(c3979CiT, 0);
        InterfaceC3985Cia c3980CiU = c3979CiT.A0A;
        InterfaceC3985Cia c3980CiU2 = c3979CiT.A09;
        if (c3980CiU instanceof C3970CiI) {
            return C3cG.A0s(C60O.A0i("decompression failed, plugin expects type \"ByteArray\" not \"String\""));
        }
        if (c3980CiU instanceof C3980CiU) {
            ZstdInputStream zstdInputStream2 = ZstdInputStream.$redex_init_class;
            zstdInputStream = new ZstdInputStream(BV4.A0E(((C3980CiU) c3980CiU).A00), 4096);
            try {
                byte[] bArrA01 = F0H.A01(zstdInputStream);
                zstdInputStream.close();
                c3980CiU = new C3980CiU(bArrA01);
            } finally {
            }
        }
        if (c3980CiU2 instanceof C3970CiI) {
            return C3cG.A0s(C60O.A0i("decompression failed, plugin expects type \"ByteArray\" not \"String\""));
        }
        if (c3980CiU2 instanceof C3980CiU) {
            ZstdInputStream zstdInputStream3 = ZstdInputStream.$redex_init_class;
            zstdInputStream = new ZstdInputStream(BV4.A0E(((C3980CiU) c3980CiU2).A00), 4096);
            byte[] bArrA012 = F0H.A01(zstdInputStream);
            zstdInputStream.close();
            c3980CiU2 = new C3980CiU(bArrA012);
        }
        Context context = c3979CiT.A06;
        PushInfraMetaData pushInfraMetaData = c3979CiT.A08;
        String str = c3979CiT.A0F;
        Integer num = c3979CiT.A00;
        boolean z = c3979CiT.A03;
        String str2 = c3979CiT.A0E;
        String str3 = c3979CiT.A0D;
        String str4 = c3979CiT.A0C;
        boolean z2 = c3979CiT.A01;
        int i = c3979CiT.A05;
        int i2 = c3979CiT.A04;
        C3972CiK c3972CiK = c3979CiT.A07;
        Integer num2 = c3979CiT.A0B;
        AnonymousClass005.A12(context, pushInfraMetaData, str, 0);
        C7384Etj.A0Y(c3972CiK, 14);
        return new C3979CiT(context, c3972CiK, pushInfraMetaData, c3980CiU, c3980CiU2, num, num2, str, str2, str3, str4, i, i2, z, true, z2);
    }

    @Override // X.InterfaceC3984CiY
    public final boolean AfW(C3979CiT c3979CiT) {
        C7384Etj.A0Y(c3979CiT, 0);
        return "zstd".equals(c3979CiT.A08.A06);
    }

    @Override // X.InterfaceC3984CiY
    public final String AIp() {
        return "zstd_notif_decompression";
    }
}
