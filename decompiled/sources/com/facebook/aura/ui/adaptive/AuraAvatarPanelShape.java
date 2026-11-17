package com.facebook.aura.ui.adaptive;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AuraAvatarPanelShape {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraAvatarPanelShape[] $VALUES;
    public static final AuraAvatarPanelShape FullWidth;
    public static final AuraAvatarPanelShape Square;
    public final boolean coversHeader;
    public final boolean displacesContent;

    static {
        AuraAvatarPanelShape auraAvatarPanelShape = new AuraAvatarPanelShape("FullWidth", 0, true, true);
        FullWidth = auraAvatarPanelShape;
        AuraAvatarPanelShape auraAvatarPanelShape2 = new AuraAvatarPanelShape("Square", 1, false, false);
        Square = auraAvatarPanelShape2;
        AuraAvatarPanelShape[] auraAvatarPanelShapeArr = {auraAvatarPanelShape, auraAvatarPanelShape2};
        $VALUES = auraAvatarPanelShapeArr;
        $ENTRIES = new F3w(auraAvatarPanelShapeArr);
    }

    public static Ey9<AuraAvatarPanelShape> getEntries() {
        return $ENTRIES;
    }

    public static AuraAvatarPanelShape valueOf(String str) {
        return (AuraAvatarPanelShape) Enum.valueOf(AuraAvatarPanelShape.class, str);
    }

    public static AuraAvatarPanelShape[] values() {
        return (AuraAvatarPanelShape[]) $VALUES.clone();
    }

    public final boolean getCoversHeader() {
        return this.coversHeader;
    }

    public final boolean getDisplacesContent() {
        return this.displacesContent;
    }

    public AuraAvatarPanelShape(String str, int i, boolean z, boolean z2) {
        this.displacesContent = z;
        this.coversHeader = z2;
    }
}
