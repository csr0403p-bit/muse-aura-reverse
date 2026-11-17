package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.EeR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7020EeR implements InterfaceC7072EfU {
    public final /* synthetic */ C7022EeT A00;

    public C7020EeR(C7022EeT c7022EeT) {
        this.A00 = c7022EeT;
    }

    @Override // X.InterfaceC7072EfU
    public final void Abs(C6988Edo c6988Edo, int i) throws IOException {
        C7481Exe c7481Exe;
        C6997Edy c6997EdyTranscode;
        int i2;
        long j;
        C6996Edx c6996Edx;
        int i3 = i;
        C7022EeT c7022EeT = this.A00;
        if (c6988Edo == null) {
            ((AbstractC7024EeV) c7022EeT).A00.AUL(null, i3);
            return;
        }
        InterfaceC7006EeD interfaceC7006EeD = c7022EeT.A03;
        C6988Edo.A03(c6988Edo);
        InterfaceC7026EeX interfaceC7026EeXCreateImageTranscoder = interfaceC7006EeD.createImageTranscoder(c6988Edo.A07, c7022EeT.A04);
        interfaceC7026EeXCreateImageTranscoder.getClass();
        InterfaceC7029Eea interfaceC7029Eea = c7022EeT.A02;
        C7185Ehv c7185Ehv = (C7185Ehv) interfaceC7029Eea;
        InterfaceC7027EeY interfaceC7027EeY = c7185Ehv.A05;
        interfaceC7027EeY.AV6(interfaceC7029Eea, "ResizeAndRotateProducer");
        C7183Eht c7183Eht = c7185Ehv.A07;
        AbstractC6525EBz abstractC6525EBz = c7022EeT.A05.A00.A01;
        C6984Edk c6984Edk = new C6984Edk(abstractC6525EBz, abstractC6525EBz.A00[0]);
        try {
            try {
                C1bk c1bk = c7183Eht.A09;
                c7481Exe = c7183Eht.A08;
                C6988Edo.A03(c6988Edo);
                c6997EdyTranscode = interfaceC7026EeXCreateImageTranscoder.transcode(c6988Edo, c6984Edk, c1bk, c7481Exe, null, 85, c6988Edo.A06);
                i2 = c6997EdyTranscode.A00;
            } finally {
                c6984Edk.close();
            }
        } catch (Exception e) {
            interfaceC7027EeY.AV2(interfaceC7029Eea, "ResizeAndRotateProducer", e, null);
            if ((i3 & 1) == 1) {
                ((AbstractC7024EeV) c7022EeT).A00.onFailure(e);
            }
        }
        if (i2 == 2) {
            throw BV4.A0c("Error while transcoding the image");
        }
        String identifier = interfaceC7026EeXCreateImageTranscoder.getIdentifier();
        if (interfaceC7027EeY.AbE(interfaceC7029Eea, "ResizeAndRotateProducer")) {
            C6988Edo.A03(c6988Edo);
            int i4 = c6988Edo.A05;
            C6988Edo.A03(c6988Edo);
            String strA07 = FGI.A07(i4, c6988Edo.A01, "x");
            String strA072 = c7481Exe != null ? FGI.A07(c7481Exe.A01, c7481Exe.A00, "x") : "Unspecified";
            HashMap mapA0u = BV4.A0u();
            C6988Edo.A03(c6988Edo);
            mapA0u.put("Image format", String.valueOf(c6988Edo.A07));
            mapA0u.put("Original size", strA07);
            mapA0u.put("Requested size", strA072);
            C7051Eex c7051Eex = c7022EeT.A01;
            synchronized (c7051Eex) {
                try {
                    j = c7051Eex.A01 - c7051Eex.A02;
                } catch (Throwable th) {
                    throw th;
                }
            }
            mapA0u.put("queueTime", String.valueOf(j));
            mapA0u.put("Transcoder id", identifier);
            mapA0u.put("Transcoding result", String.valueOf(c6997EdyTranscode));
            c6996Edx = new C6996Edx(mapA0u);
        } else {
            c6996Edx = null;
        }
        EfF efFA00 = EfF.A00(c6984Edk.A00());
        try {
            C6988Edo c6988Edo2 = new C6988Edo(efFA00);
            c6988Edo2.A07 = c6997EdyTranscode.A01;
            try {
                C6988Edo.A02(c6988Edo2);
                interfaceC7027EeY.AV4(interfaceC7029Eea, "ResizeAndRotateProducer", c6996Edx);
                if (i2 != 1) {
                    i3 |= 16;
                }
                ((AbstractC7024EeV) c7022EeT).A00.AUL(c6988Edo2, i3);
                efFA00.close();
            } finally {
                c6988Edo2.close();
            }
        } catch (Throwable th2) {
            efFA00.close();
            throw th2;
        }
    }
}
