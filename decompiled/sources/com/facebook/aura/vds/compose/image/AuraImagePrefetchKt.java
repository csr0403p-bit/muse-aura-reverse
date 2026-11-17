package com.facebook.aura.vds.compose.image;

import X.AbstractC7209EiU;
import X.AnonymousClass001;
import X.C2952Bpp;
import X.C7189Ei0;
import X.C7197Ei9;
import X.C7384Etj;
import X.C79;
import X.C7Bm;
import X.EjN;
import X.GBL;
import X.HtJ;
import X.InterfaceC7236Ej0;
import X.InterfaceC7258Eji;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: classes5.dex */
public abstract class AuraImagePrefetchKt {
    public static final Object auraPrefetchToBitmapCache(Uri uri, C7197Ei9 c7197Ei9, CallerContext callerContext, String str, HtJ<? super Boolean> htJ) {
        final GBL gblA03 = C7Bm.A03(htJ);
        C7189Ei0 c7189Ei0 = (C7189Ei0) EjN.A01();
        C7384Etj.A0Y(uri, 0);
        InterfaceC7258Eji interfaceC7258Eji = c7189Ei0.A00;
        if (c7197Ei9 == null) {
            c7197Ei9 = C7197Ei9.A0P;
        }
        InterfaceC7236Ej0 interfaceC7236Ej0A00 = C7189Ei0.A00(c7189Ei0, interfaceC7258Eji.A5V(uri, c7197Ei9), C79.A00, callerContext, null);
        gblA03.AO2(new AuraImagePrefetchKt$auraPrefetchToBitmapCache$2$1(interfaceC7236Ej0A00));
        interfaceC7236Ej0A00.Agc(new AbstractC7209EiU<Void>() { // from class: com.facebook.aura.vds.compose.image.AuraImagePrefetchKt$auraPrefetchToBitmapCache$2$2
            @Override // X.AbstractC7209EiU
            public void onFailureImpl(InterfaceC7236Ej0<Void> interfaceC7236Ej0) {
                if (gblA03.isActive()) {
                    gblA03.resumeWith(AnonymousClass001.A0h());
                }
            }

            @Override // X.AbstractC7209EiU
            public void onNewResultImpl(InterfaceC7236Ej0<Void> interfaceC7236Ej0) {
                if (gblA03.isActive()) {
                    gblA03.resumeWith(AnonymousClass001.A0i());
                }
            }
        }, C2952Bpp.A00);
        return gblA03.A0F();
    }
}
