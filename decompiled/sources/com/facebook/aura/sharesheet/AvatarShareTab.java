package com.facebook.aura.sharesheet;

import X.Ey9;
import X.F3w;
import com.facebook.aura.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AvatarShareTab {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AvatarShareTab[] $VALUES;
    public static final AvatarShareTab Dances;
    public static final AvatarShareTab Intros;
    public final int labelRes;

    static {
        AvatarShareTab avatarShareTab = new AvatarShareTab("Dances", 0, R.string._name_removed__res_0x7f1205ba);
        Dances = avatarShareTab;
        AvatarShareTab avatarShareTab2 = new AvatarShareTab("Intros", 1, R.string._name_removed__res_0x7f1205bb);
        Intros = avatarShareTab2;
        AvatarShareTab[] avatarShareTabArr = {avatarShareTab, avatarShareTab2};
        $VALUES = avatarShareTabArr;
        $ENTRIES = new F3w(avatarShareTabArr);
    }

    public static Ey9<AvatarShareTab> getEntries() {
        return $ENTRIES;
    }

    public static AvatarShareTab valueOf(String str) {
        return (AvatarShareTab) Enum.valueOf(AvatarShareTab.class, str);
    }

    public static AvatarShareTab[] values() {
        return (AvatarShareTab[]) $VALUES.clone();
    }

    public final int getLabelRes() {
        return this.labelRes;
    }

    public AvatarShareTab(String str, int i, int i2) {
        this.labelRes = i2;
    }
}
