package com.facebook.aura.vds.compose.typegroup;

import X.BFM;
import X.C06G;
import com.facebook.aura.vds.compose.typegroup.AuraIllustrationType;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

@Deprecated(message = "AuraIllustrationTypes is deprecated. Use AuraIcon for icon-sized illustrations (SIZE_24, SIZE_32, SIZE_44, SIZE_56) or AuraImage for larger sizes.", replaceWith = @ReplaceWith(expression = "AuraIcon or AuraImage", imports = {}))
/* loaded from: classes.dex */
public final class AuraIllustrationTypes {
    public static final int $stable = 0;
    public static final AuraIllustrationTypes INSTANCE = new AuraIllustrationTypes();

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof AuraIllustrationTypes);
    }

    /* renamed from: icon-Iv8Zu3U, reason: not valid java name */
    public final AuraIllustrationType m3106iconIv8Zu3U(long j, BFM bfm, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = C06G.A06(bfm);
        }
        return new AuraIllustrationType.Icon(j);
    }

    public String toString() {
        return "AuraIllustrationTypes";
    }

    public final AuraIllustrationType image(BFM bfm, int i) {
        return AuraIllustrationType.Image.INSTANCE;
    }

    public int hashCode() {
        return -771174840;
    }
}
