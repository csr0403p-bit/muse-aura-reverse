package com.facebook.aura.pairs;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.identity.provider.HatchChatThemeHelperKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PairsImageKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PairsImageKind[] $VALUES;
    public static final PairsImageKind AVATAR;
    public static final PairsImageKind INVITE_PHOTO;
    public static final PairsImageKind PHOTO;
    public final int maxBytes;
    public final String pathSegment;

    static {
        PairsImageKind pairsImageKind = new PairsImageKind("PHOTO", 0, "photo", 32768);
        PHOTO = pairsImageKind;
        PairsImageKind pairsImageKind2 = new PairsImageKind("AVATAR", 1, HatchChatThemeHelperKt.HATCH_AVATAR_THEME_ID, 131072);
        AVATAR = pairsImageKind2;
        PairsImageKind pairsImageKind3 = new PairsImageKind("INVITE_PHOTO", 2, "invite-photo", 32768);
        INVITE_PHOTO = pairsImageKind3;
        PairsImageKind[] pairsImageKindArr = {pairsImageKind, pairsImageKind2, pairsImageKind3};
        $VALUES = pairsImageKindArr;
        $ENTRIES = C3cG.A0w(pairsImageKindArr);
    }

    public static Ey9<PairsImageKind> getEntries() {
        return $ENTRIES;
    }

    public static PairsImageKind valueOf(String str) {
        return (PairsImageKind) Enum.valueOf(PairsImageKind.class, str);
    }

    public static PairsImageKind[] values() {
        return (PairsImageKind[]) $VALUES.clone();
    }

    public final int getMaxBytes() {
        return this.maxBytes;
    }

    public final String getPathSegment() {
        return this.pathSegment;
    }

    public PairsImageKind(String str, int i, String str2, int i2) {
        this.pathSegment = str2;
        this.maxBytes = i2;
    }
}
