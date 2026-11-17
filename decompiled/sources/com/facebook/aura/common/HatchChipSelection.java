package com.facebook.aura.common;

import X.AbstractC0878AGe;
import X.C06827l3;
import X.C0881AGi;
import X.C3cG;
import X.C7384Etj;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class HatchChipSelection {
    public static final HatchChipSelection INSTANCE = new HatchChipSelection();
    public static final SecureRandom secureRandom = new SecureRandom();
    public static final C06827l3 canonicalChipId = C06827l3.A02("(?:[0-9A-F]{16}|[0-9A-F]{128})");

    public final List<String> draw(List<String> list, int i) {
        C7384Etj.A0Y(list, 0);
        if (i <= 0) {
            return C0881AGi.A00;
        }
        List listA0m = C3cG.A0m(list);
        SecureRandom secureRandom2 = secureRandom;
        C7384Etj.A0Y(listA0m, 0);
        C7384Etj.A0Y(secureRandom2, 1);
        List listA0Y = AbstractC0878AGe.A0Y(listA0m);
        Collections.shuffle(listA0Y, secureRandom2);
        return AbstractC0878AGe.A0a(listA0Y, i);
    }

    public final boolean isCanonical(String str) {
        C7384Etj.A0Y(str, 0);
        return canonicalChipId.A08(str);
    }
}
