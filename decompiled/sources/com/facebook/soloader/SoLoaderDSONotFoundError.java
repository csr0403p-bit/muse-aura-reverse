package com.facebook.soloader;

import X.C3cI;
import X.C3g;
import android.content.Context;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.pairs.PairsDiscretionDocument;

/* loaded from: classes5.dex */
public class SoLoaderDSONotFoundError extends SoLoaderULError {
    public static SoLoaderDSONotFoundError create(String str, Context context, C3g[] c3gArr) {
        StringBuilder sbA0x = C3cI.A0x("couldn't find DSO to load: ", str);
        sbA0x.append("\n\texisting SO sources: ");
        for (int i = 0; i < c3gArr.length; i++) {
            sbA0x.append("\n\t\tSoSource ");
            sbA0x.append(i);
            sbA0x.append(": ");
            C3g c3g = c3gArr[i];
            sbA0x.append(c3g != null ? c3g.toString() : HatchCcvLoggingKt.NO_POSTAL_FIELD);
        }
        if (context != null) {
            sbA0x.append("\n\tNative lib dir: ");
            sbA0x.append(context.getApplicationInfo().nativeLibraryDir);
            sbA0x.append(PairsDiscretionDocument.TERMINATOR);
        }
        return new SoLoaderDSONotFoundError(str, sbA0x.toString());
    }

    public SoLoaderDSONotFoundError(String str) {
        super(str);
    }

    public SoLoaderDSONotFoundError(String str, String str2) {
        super(str, str2);
    }
}
