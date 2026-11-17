package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.secure.trustedapp.exception.CannotAttachCallerInfoException;
import java.util.Set;

/* renamed from: X.7m8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7m8 extends C7m7 {
    public boolean A01 = false;
    public C7381Etf A00 = null;
    public final Set<String> A02 = C60O.A13();

    @Override // X.C7m7
    public final Intent A03(Context context) {
        String str;
        Intent intentA03 = super.A03(context);
        if (this.A01) {
            boolean zA02 = false;
            if ((4 & super.A01) == 0 && (str = intentA03.getPackage()) != null) {
                if (str.equals(context.getPackageName())) {
                    zA02 = true;
                } else if (this.A00 != null) {
                    try {
                        zA02 = this.A00.A02(C06967mj.A03(AbstractC06987ml.A00(context, str), C60O.A13(), false), AbstractC06987ml.A02(context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (zA02) {
                try {
                    AbstractC06887mb.A02(intentA03, context, null);
                } catch (CannotAttachCallerInfoException unused2) {
                }
            }
        }
        return intentA03;
    }

    @Override // X.C7m7
    public final /* bridge */ /* synthetic */ void A04(Intent intent, ClassLoader classLoader) {
        super.A04(intent, classLoader);
    }

    @Override // X.C7m7
    public final /* bridge */ /* synthetic */ void A05(Bundle bundle, ClassLoader classLoader) {
        super.A05(bundle, classLoader);
    }

    public final void A06(Intent intent, ClassLoader classLoader) {
        super.A04(intent, classLoader);
    }
}
