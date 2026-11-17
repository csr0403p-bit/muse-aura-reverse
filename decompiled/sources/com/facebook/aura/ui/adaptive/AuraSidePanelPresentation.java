package com.facebook.aura.ui.adaptive;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AuraSidePanelPresentation {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraSidePanelPresentation[] $VALUES;
    public static final AuraSidePanelPresentation Docked;
    public static final AuraSidePanelPresentation Floating;
    public static final AuraSidePanelPresentation PushAside;
    public final boolean docksBesidePages;
    public final boolean floatsOverScreen;
    public final boolean movesScreen;

    static {
        AuraSidePanelPresentation auraSidePanelPresentation = new AuraSidePanelPresentation("PushAside", 0, true, false, false);
        PushAside = auraSidePanelPresentation;
        AuraSidePanelPresentation auraSidePanelPresentation2 = new AuraSidePanelPresentation("Floating", 1, false, true, false);
        Floating = auraSidePanelPresentation2;
        AuraSidePanelPresentation auraSidePanelPresentation3 = new AuraSidePanelPresentation("Docked", 2, false, false, true);
        Docked = auraSidePanelPresentation3;
        AuraSidePanelPresentation[] auraSidePanelPresentationArr = {auraSidePanelPresentation, auraSidePanelPresentation2, auraSidePanelPresentation3};
        $VALUES = auraSidePanelPresentationArr;
        $ENTRIES = new F3w(auraSidePanelPresentationArr);
    }

    public static Ey9<AuraSidePanelPresentation> getEntries() {
        return $ENTRIES;
    }

    public static AuraSidePanelPresentation valueOf(String str) {
        return (AuraSidePanelPresentation) Enum.valueOf(AuraSidePanelPresentation.class, str);
    }

    public static AuraSidePanelPresentation[] values() {
        return (AuraSidePanelPresentation[]) $VALUES.clone();
    }

    public final boolean getDocksBesidePages() {
        return this.docksBesidePages;
    }

    public final boolean getFloatsOverScreen() {
        return this.floatsOverScreen;
    }

    public final boolean getMovesScreen() {
        return this.movesScreen;
    }

    public AuraSidePanelPresentation(String str, int i, boolean z, boolean z2, boolean z3) {
        this.movesScreen = z;
        this.floatsOverScreen = z2;
        this.docksBesidePages = z3;
    }
}
