package com.facebook.aura.ui.adaptive;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AuraContentRole {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraContentRole[] $VALUES;
    public static final AuraContentRole Collection;
    public static final AuraContentRole Conversation;
    public static final AuraContentRole Focused;
    public static final AuraContentRole Immersive;
    public static final AuraContentRole Standard;
    public final float maxWidth;

    static {
        AuraContentRole auraContentRole = new AuraContentRole("Focused", 0, 560.0f);
        Focused = auraContentRole;
        AuraContentRole auraContentRole2 = new AuraContentRole("Standard", 1, 720.0f);
        Standard = auraContentRole2;
        AuraContentRole auraContentRole3 = new AuraContentRole("Collection", 2, 960.0f);
        Collection = auraContentRole3;
        AuraContentRole auraContentRole4 = new AuraContentRole("Conversation", 3, 840.0f);
        Conversation = auraContentRole4;
        AuraContentRole auraContentRole5 = new AuraContentRole("Immersive", 4, Float.NaN);
        Immersive = auraContentRole5;
        AuraContentRole[] auraContentRoleArr = {auraContentRole, auraContentRole2, auraContentRole3, auraContentRole4, auraContentRole5};
        $VALUES = auraContentRoleArr;
        $ENTRIES = new F3w(auraContentRoleArr);
    }

    public static Ey9<AuraContentRole> getEntries() {
        return $ENTRIES;
    }

    public static AuraContentRole valueOf(String str) {
        return (AuraContentRole) Enum.valueOf(AuraContentRole.class, str);
    }

    public static AuraContentRole[] values() {
        return (AuraContentRole[]) $VALUES.clone();
    }

    /* renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m2361getMaxWidthD9Ej5fM() {
        return this.maxWidth;
    }

    public AuraContentRole(String str, int i, float f) {
        this.maxWidth = f;
    }
}
