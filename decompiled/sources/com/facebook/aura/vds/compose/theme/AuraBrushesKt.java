package com.facebook.aura.vds.compose.theme;

import X.AGO;
import X.AKH;
import X.AnonymousClass004;
import X.B6A;
import X.C1335AhM;
import X.C1EQ;

/* loaded from: classes.dex */
public abstract class AuraBrushesKt {
    public static final AKH<AuraBrushes> LocalAuraBrushes = new AGO(AuraBrushesKt$LocalAuraBrushes$1.INSTANCE);
    public static final AuraBrushes auraBrushesDark;
    public static final AuraBrushes auraBrushesLight;
    public static final C1EQ planSelectedBorderBrush;

    static {
        C1335AhM c1335AhM = new C1335AhM(AnonymousClass004.A17(new B6A(BaseColors.MAGENTA_550), BaseColors.BLUE_600), null, 0, 0L, 9187343241974906880L);
        planSelectedBorderBrush = c1335AhM;
        auraBrushesLight = new AuraBrushes(c1335AhM);
        auraBrushesDark = new AuraBrushes(c1335AhM);
    }

    public static final AuraBrushes getAuraBrushesDark() {
        return auraBrushesDark;
    }

    public static final AuraBrushes getAuraBrushesLight() {
        return auraBrushesLight;
    }

    public static final AKH<AuraBrushes> getLocalAuraBrushes() {
        return LocalAuraBrushes;
    }
}
