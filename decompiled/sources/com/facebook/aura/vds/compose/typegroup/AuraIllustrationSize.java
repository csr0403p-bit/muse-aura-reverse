package com.facebook.aura.vds.compose.typegroup;

import X.Ey9;
import X.F3w;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Deprecated(message = "AuraIllustrationSize is deprecated. Use AuraIconSize for icon-sized illustrations (SIZE_24, SIZE_32, SIZE_44, SIZE_56) or AuraImage for larger sizes (SIZE_80, SIZE_186).", replaceWith = @ReplaceWith(expression = "AuraIconSize", imports = {}))
/* loaded from: classes.dex */
public final class AuraIllustrationSize {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraIllustrationSize[] $VALUES;

    @Deprecated(message = "SIZE_186 is deprecated. Use AuraImage instead for larger illustrations.", replaceWith = @ReplaceWith(expression = "AuraImage", imports = {}))
    public static final AuraIllustrationSize SIZE_186;
    public static final AuraIllustrationSize SIZE_24;
    public static final AuraIllustrationSize SIZE_32;
    public static final AuraIllustrationSize SIZE_44;
    public static final AuraIllustrationSize SIZE_56;

    @Deprecated(message = "SIZE_80 is deprecated. Use AuraImage instead for larger illustrations.", replaceWith = @ReplaceWith(expression = "AuraImage", imports = {}))
    public static final AuraIllustrationSize SIZE_80;
    public final float size;

    static {
        AuraIllustrationSize auraIllustrationSize = new AuraIllustrationSize("SIZE_24", 0, 24.0f);
        SIZE_24 = auraIllustrationSize;
        AuraIllustrationSize auraIllustrationSize2 = new AuraIllustrationSize("SIZE_32", 1, 32.0f);
        SIZE_32 = auraIllustrationSize2;
        AuraIllustrationSize auraIllustrationSize3 = new AuraIllustrationSize("SIZE_44", 2, 44.0f);
        SIZE_44 = auraIllustrationSize3;
        AuraIllustrationSize auraIllustrationSize4 = new AuraIllustrationSize("SIZE_56", 3, 56.0f);
        SIZE_56 = auraIllustrationSize4;
        AuraIllustrationSize auraIllustrationSize5 = new AuraIllustrationSize("SIZE_80", 4, 80.0f);
        SIZE_80 = auraIllustrationSize5;
        AuraIllustrationSize auraIllustrationSize6 = new AuraIllustrationSize("SIZE_186", 5, 186.0f);
        SIZE_186 = auraIllustrationSize6;
        AuraIllustrationSize[] auraIllustrationSizeArr = {auraIllustrationSize, auraIllustrationSize2, auraIllustrationSize3, auraIllustrationSize4, auraIllustrationSize5, auraIllustrationSize6};
        $VALUES = auraIllustrationSizeArr;
        $ENTRIES = new F3w(auraIllustrationSizeArr);
    }

    public static Ey9<AuraIllustrationSize> getEntries() {
        return $ENTRIES;
    }

    public static AuraIllustrationSize valueOf(String str) {
        return (AuraIllustrationSize) Enum.valueOf(AuraIllustrationSize.class, str);
    }

    public static AuraIllustrationSize[] values() {
        return (AuraIllustrationSize[]) $VALUES.clone();
    }

    /* renamed from: getSize-D9Ej5fM, reason: not valid java name */
    public final float m3101getSizeD9Ej5fM() {
        return this.size;
    }

    public AuraIllustrationSize(String str, int i, float f) {
        this.size = f;
    }
}
