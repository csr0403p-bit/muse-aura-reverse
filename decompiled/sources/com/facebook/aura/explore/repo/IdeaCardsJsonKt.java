package com.facebook.aura.explore.repo;

import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.AnonymousClass007;
import X.C0881AGi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class IdeaCardsJsonKt {
    public static final AHD<String> toConnectionIds(List<String> list) {
        if (list == null) {
            list = C0881AGi.A00;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass007.A19(arrayList, it);
        }
        return AGI.A07(AbstractC0878AGe.A0X(AbstractC0878AGe.A0f(arrayList)));
    }
}
