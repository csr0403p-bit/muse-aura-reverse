package com.facebook.aura.commands.photos;

import X.AbstractC0878AGe;
import X.C0881AGi;
import X.C7384Etj;
import X.C7BY;
import java.util.List;

/* loaded from: classes.dex */
public abstract class PhotoLabelCacheKt {
    public static final String LABEL_SEPARATOR = "\u001f";

    public static final List<String> decodeLabels(String str) {
        C7384Etj.A0Y(str, 0);
        return str.length() == 0 ? C0881AGi.A00 : C7BY.A0i(str, new String[]{"\u001f"}, 0);
    }

    public static final String encodeLabels(List<String> list) {
        C7384Etj.A0Y(list, 0);
        return AbstractC0878AGe.A0L("\u001f", "", "", list, null);
    }
}
