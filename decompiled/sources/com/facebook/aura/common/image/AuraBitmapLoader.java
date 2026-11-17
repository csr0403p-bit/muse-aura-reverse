package com.facebook.aura.common.image;

import X.AbstractC7204EiM;
import X.C7109EgN;
import X.C7184Ehu;
import X.C7384Etj;
import X.C7481Exe;
import X.C7Bm;
import X.CFK;
import X.EfF;
import X.F0C;
import X.GBL;
import X.HtJ;
import X.InterfaceC7064EfB;
import X.InterfaceC7236Ej0;
import android.graphics.Bitmap;
import android.net.Uri;

/* loaded from: classes5.dex */
public final class AuraBitmapLoader {
    public static final AuraBitmapLoader INSTANCE = new AuraBitmapLoader();
    public static final String TAG = "AuraBitmapLoader";

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap copyOrNull(Bitmap bitmap, Bitmap.Config config, String str) {
        Object[] objArr;
        String str2;
        if (config == null) {
            try {
                config = bitmap.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
            } catch (OutOfMemoryError e) {
                e = e;
                objArr = new Object[]{str};
                str2 = "%s: ran out of memory copying the decoded bitmap";
                CFK.A0D(TAG, str2, e, objArr);
                return null;
            } catch (RuntimeException e2) {
                e = e2;
                objArr = new Object[]{str};
                str2 = "%s: failed to copy the decoded bitmap";
                CFK.A0D(TAG, str2, e, objArr);
                return null;
            }
        }
        return bitmap.copy(config, false);
    }

    public static /* synthetic */ Object load$default(AuraBitmapLoader auraBitmapLoader, Uri uri, String str, Integer num, Bitmap.Config config, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            config = null;
        }
        return auraBitmapLoader.load(uri, str, num, config, htJ);
    }

    public final Object load(Uri uri, final String str, Integer num, final Bitmap.Config config, HtJ<? super Bitmap> htJ) {
        final GBL gblA03 = C7Bm.A03(htJ);
        C7184Ehu c7184Ehu = new C7184Ehu();
        uri.getClass();
        c7184Ehu.A02 = uri;
        if (num != null) {
            int iIntValue = num.intValue();
            c7184Ehu.A06 = new C7481Exe(iIntValue, iIntValue);
        }
        final InterfaceC7236Ej0<EfF<InterfaceC7064EfB>> interfaceC7236Ej0A03 = C7109EgN.A03().A06().A03(c7184Ehu.A01(), str);
        interfaceC7236Ej0A03.Agc(new AbstractC7204EiM() { // from class: com.facebook.aura.common.image.AuraBitmapLoader$load$2$1
            @Override // X.AbstractC7209EiU
            public void onFailureImpl(InterfaceC7236Ej0<EfF<InterfaceC7064EfB>> interfaceC7236Ej0) {
                C7384Etj.A0Y(interfaceC7236Ej0, 0);
                CFK.A0D(AuraBitmapLoader.TAG, "%s: image fetch failed", interfaceC7236Ej0.AFW(), str);
                if (gblA03.isActive()) {
                    gblA03.resumeWith(null);
                }
                interfaceC7236Ej0.A6Q();
            }

            @Override // X.AbstractC7204EiM
            public void onNewResultImpl(Bitmap bitmap) {
                Bitmap bitmapCopyOrNull;
                if (bitmap != null) {
                    bitmapCopyOrNull = AuraBitmapLoader.INSTANCE.copyOrNull(bitmap, config, str);
                } else {
                    bitmapCopyOrNull = null;
                }
                if (gblA03.isActive()) {
                    gblA03.Abe(bitmapCopyOrNull, AuraBitmapLoader$load$2$1$onNewResultImpl$1.INSTANCE);
                } else if (bitmapCopyOrNull != null) {
                    bitmapCopyOrNull.recycle();
                }
                interfaceC7236Ej0A03.A6Q();
            }
        }, F0C.A05());
        gblA03.AO2(new AuraBitmapLoader$load$2$2(interfaceC7236Ej0A03));
        return gblA03.A0F();
    }
}
