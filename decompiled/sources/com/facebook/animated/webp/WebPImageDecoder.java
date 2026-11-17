package com.facebook.animated.webp;

import X.AbstractC7046Ees;
import X.AbstractC7149EhJ;
import X.AbstractC7151EhM;
import X.AbstractC7531Ezs;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BV5;
import X.C6986Edm;
import X.C6988Edo;
import X.C7198EiA;
import X.C7384Etj;
import X.CVn;
import X.ETo;
import X.EfF;
import X.InterfaceC7034Eeg;
import X.InterfaceC7064EfB;
import X.InterfaceC7068EfO;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class WebPImageDecoder extends AbstractC7149EhJ implements InterfaceC7068EfO {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebPImageDecoder(AbstractC7151EhM abstractC7151EhM, boolean z, boolean z2, boolean z3) {
        super(abstractC7151EhM, z2, z, z3);
        C7384Etj.A0Y(abstractC7151EhM, 0);
    }

    @Override // X.InterfaceC7068EfO
    public final InterfaceC7064EfB decode(C6988Edo c6988Edo, int i, InterfaceC7034Eeg interfaceC7034Eeg, C7198EiA c7198EiA) {
        ByteBuffer byteBuffer;
        long nativePtr;
        WebPImage webPImageNativeCreateFromNativeMemory;
        Bitmap.Config config;
        AnonymousClass003.A0w(c6988Edo, c7198EiA);
        EfF efFA0G = BV5.A0G(c6988Edo.A0C);
        C7384Etj.A0U(efFA0G);
        try {
            Object objA04 = efFA0G.A04();
            C6986Edm c6986Edm = (C6986Edm) objA04;
            synchronized (objA04) {
                try {
                    byteBuffer = C6986Edm.A00(c6986Edm).getByteBuffer();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (byteBuffer != null) {
                ETo.A00();
                byteBuffer.rewind();
                webPImageNativeCreateFromNativeMemory = WebPImage.nativeCreateFromDirectByteBuffer(byteBuffer);
                config = c7198EiA.A00;
                webPImageNativeCreateFromNativeMemory.mDecodeBitmapConfig = config;
            } else {
                synchronized (objA04) {
                    try {
                        C6986Edm.A01(c6986Edm);
                        nativePtr = C6986Edm.A00(c6986Edm).getNativePtr();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                int iA03 = c6986Edm.A03();
                ETo.A00();
                CVn.A02(AnonymousClass002.A1L((nativePtr > 0L ? 1 : (nativePtr == 0L ? 0 : -1))));
                webPImageNativeCreateFromNativeMemory = WebPImage.nativeCreateFromNativeMemory(nativePtr, iA03);
                config = c7198EiA.A00;
                webPImageNativeCreateFromNativeMemory.mDecodeBitmapConfig = config;
            }
            AbstractC7046Ees abstractC7046EesA01 = A01(config, webPImageNativeCreateFromNativeMemory, c7198EiA, c6988Edo.A09);
            efFA0G.close();
            return abstractC7046EesA01;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC7531Ezs.A00(efFA0G, th3);
                throw th4;
            }
        }
    }
}
