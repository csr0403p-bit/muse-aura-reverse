package com.facebook.aura.conversation.view;

import X.C7384Etj;
import X.FGI;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class SequenceKeyFactory {
    public final Map<String, Integer> occurrences = new LinkedHashMap();

    public final String next(String str) {
        C7384Etj.A0Y(str, 0);
        Integer num = this.occurrences.get(str);
        int iIntValue = num != null ? num.intValue() : 0;
        this.occurrences.put(str, Integer.valueOf(iIntValue + 1));
        return iIntValue != 0 ? FGI.A0S(str, "#", iIntValue) : str;
    }
}
