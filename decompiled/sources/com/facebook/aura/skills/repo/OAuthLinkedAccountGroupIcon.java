package com.facebook.aura.skills.repo;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class OAuthLinkedAccountGroupIcon {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ OAuthLinkedAccountGroupIcon[] $VALUES;
    public static final OAuthLinkedAccountGroupIcon BUSINESS;
    public static final OAuthLinkedAccountGroupIcon FACEBOOK;
    public static final OAuthLinkedAccountGroupIcon INSTAGRAM;
    public static final OAuthLinkedAccountGroupIcon META;
    public static final OAuthLinkedAccountGroupIcon UNSPECIFIED;

    static {
        OAuthLinkedAccountGroupIcon oAuthLinkedAccountGroupIcon = new OAuthLinkedAccountGroupIcon("UNSPECIFIED", 0);
        UNSPECIFIED = oAuthLinkedAccountGroupIcon;
        OAuthLinkedAccountGroupIcon oAuthLinkedAccountGroupIcon2 = new OAuthLinkedAccountGroupIcon("FACEBOOK", 1);
        FACEBOOK = oAuthLinkedAccountGroupIcon2;
        OAuthLinkedAccountGroupIcon oAuthLinkedAccountGroupIcon3 = new OAuthLinkedAccountGroupIcon("INSTAGRAM", 2);
        INSTAGRAM = oAuthLinkedAccountGroupIcon3;
        OAuthLinkedAccountGroupIcon oAuthLinkedAccountGroupIcon4 = new OAuthLinkedAccountGroupIcon("BUSINESS", 3);
        BUSINESS = oAuthLinkedAccountGroupIcon4;
        OAuthLinkedAccountGroupIcon oAuthLinkedAccountGroupIcon5 = new OAuthLinkedAccountGroupIcon("META", 4);
        META = oAuthLinkedAccountGroupIcon5;
        OAuthLinkedAccountGroupIcon[] oAuthLinkedAccountGroupIconArr = {oAuthLinkedAccountGroupIcon, oAuthLinkedAccountGroupIcon2, oAuthLinkedAccountGroupIcon3, oAuthLinkedAccountGroupIcon4, oAuthLinkedAccountGroupIcon5};
        $VALUES = oAuthLinkedAccountGroupIconArr;
        $ENTRIES = C3cG.A0w(oAuthLinkedAccountGroupIconArr);
    }

    public static Ey9<OAuthLinkedAccountGroupIcon> getEntries() {
        return $ENTRIES;
    }

    public static OAuthLinkedAccountGroupIcon valueOf(String str) {
        return (OAuthLinkedAccountGroupIcon) Enum.valueOf(OAuthLinkedAccountGroupIcon.class, str);
    }

    public static OAuthLinkedAccountGroupIcon[] values() {
        return (OAuthLinkedAccountGroupIcon[]) $VALUES.clone();
    }

    public OAuthLinkedAccountGroupIcon(String str, int i) {
    }
}
