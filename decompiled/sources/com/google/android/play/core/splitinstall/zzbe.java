package com.google.android.play.core.splitinstall;

import X.C60Q;
import X.CJN;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzbe extends zzbh {
    @Override // com.google.android.play.core.splitinstall.zzbh, com.google.android.play.core.splitinstall.internal.zzbq
    public final void Ajm(List list) {
        super.Ajm(list);
        ArrayList arrayListA0t = C60Q.A0t(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayListA0t.add(CJN.A00((Bundle) it.next()));
        }
        this.A00.A00.A0H(arrayListA0t);
    }
}
