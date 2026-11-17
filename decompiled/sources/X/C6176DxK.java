package X;

import android.media.MediaCodec;
import android.util.Log;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.DxK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6176DxK {
    public boolean A00 = false;
    public final ConcurrentLinkedQueue<C6230DyQ> A01 = new ConcurrentLinkedQueue<>();
    public final /* synthetic */ DxJ A02;

    public C6176DxK(DxJ dxJ) {
        this.A02 = dxJ;
    }

    public static InterfaceC6181DxP A00(String str, boolean z, boolean z2) {
        if (z) {
            DxJ dxJ = DxJ.A0B;
            if (str.equals("meta.dav1d.av1.decoder")) {
                try {
                    return (InterfaceC6181DxP) BV8.A0q("exoplayer2.av1.src.Dav1dMediaCodecAdapter");
                } catch (Exception e) {
                    Log.w("MediaCodecPoolOptimized", String.format("Exception when trying to instantiate %s: %s", "exoplayer2.av1.src.Dav1dMediaCodecAdapter", e.getMessage()));
                }
            }
        }
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        if (z2 && mediaCodecCreateByCodecName == null) {
            throw BV5.A0M("MediaCodec.createByCodecName returned null for ", str);
        }
        return new C2981Bqq(mediaCodecCreateByCodecName);
    }

    public static void A01(C6175DxI c6175DxI, Boolean bool, InterfaceC6181DxP interfaceC6181DxP, C6176DxK c6176DxK) {
        try {
            if (!c6175DxI.A0g || (!bool.booleanValue() && !c6175DxI.A0f)) {
                interfaceC6181DxP.stop();
            }
        } finally {
            DxJ dxJ = c6176DxK.A02;
            DxJ dxJ2 = DxJ.A0B;
            AbstractC6211Dxx abstractC6211Dxx = dxJ.A01;
            if (abstractC6211Dxx == null) {
                abstractC6211Dxx = C6266DzJ.A00;
            }
            InterfaceC6185DxT.A00(abstractC6211Dxx, interfaceC6181DxP, dxJ).A01(interfaceC6181DxP.hashCode());
        }
    }

    public static void A02(String str, InterfaceC6181DxP interfaceC6181DxP, C6176DxK c6176DxK) {
        Set setA10;
        DxJ dxJ = c6176DxK.A02;
        synchronized (dxJ.A07) {
            setA10 = BV4.A10(str, dxJ.A07);
        }
        if (setA10 != null) {
            synchronized (setA10) {
                if (setA10.remove(interfaceC6181DxP)) {
                    dxJ.A00--;
                }
            }
        }
    }
}
