package com.facebook.aura.maps.intf;

import X.BFM;
import X.BRg;
import X.C1DM;
import X.G0U;
import X.G0W;
import com.facebook.aura.maps.model.HatchMapScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public interface NativeMapRenderer {
    void EmbeddedMap(HatchMapScene hatchMapScene, String str, String str2, String str3, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function0, BRg bRg, BFM bfm, int i);

    void FullscreenMap(HatchMapScene hatchMapScene, String str, String str2, String str3, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function0, BRg bRg, BFM bfm, int i);

    void LocalMapCard(HatchMapScene hatchMapScene, String str, String str2, String str3, G0U<? super String, Unit> g0u, C1DM c1dm, BRg bRg, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i);

    boolean isEnabled();
}
