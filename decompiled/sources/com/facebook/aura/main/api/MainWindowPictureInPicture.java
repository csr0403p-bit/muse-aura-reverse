package com.facebook.aura.main.api;

import X.BFM;
import X.BRg;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public interface MainWindowPictureInPicture {
    void Content(Function0<Unit> function0, BRg bRg, BFM bfm, int i);

    MainWindowPipRequest request(BFM bfm, int i);
}
