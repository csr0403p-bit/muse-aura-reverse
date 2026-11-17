package com.facebook.aura.status.api;

import X.AbstractC3358CGz;
import X.BFM;
import X.BRg;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public interface StatusTab {
    /* renamed from: Content-cmh-DWc */
    void mo735ContentcmhDWc(float f, float f2, BRg bRg, String str, Function0<Unit> function0, StatusTabEntry statusTabEntry, BFM bfm, int i);

    int getIconRes();

    String getId();

    int getLabelRes();

    boolean isEnabled(AbstractC3358CGz abstractC3358CGz);
}
