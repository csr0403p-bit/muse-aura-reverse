package com.facebook.aura.header.api;

import X.AnonymousClass005;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C06H;
import X.G0U;
import X.G0W;
import X.G2j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HeaderAction {
    public static final int $stable = 0;
    public final HeaderActionIcon icon;
    public final G2j<B6A, BRg, BFM, Integer, Unit> iconContent;
    public final Object key;
    public final BRg modifier;
    public final Function0<Unit> onClick;
    public final G0U<HeaderActionPill, Unit> onPillChanged;
    public final G0W<BRg, BFM, Integer, BRg> pillEntrance;
    public final String testTag;
    public final boolean tracksChromeObstacle;

    public /* synthetic */ HeaderAction(Object obj, HeaderActionIcon headerActionIcon, String str, Function0 function0, BRg bRg, boolean z, G0W g0w, G2j g2j, G0U g0u, int i, C06H c06h) {
        this(obj, headerActionIcon, str, function0, (i & 16) != 0 ? BRg.A00 : bRg, (i & 32) != 0 ? true : z, (i & 64) != 0 ? null : g0w, (i & 128) != 0 ? null : g2j, (i & 256) != 0 ? null : g0u);
    }

    public final HeaderActionIcon getIcon() {
        return this.icon;
    }

    public final G2j<B6A, BRg, BFM, Integer, Unit> getIconContent() {
        return this.iconContent;
    }

    public final Object getKey() {
        return this.key;
    }

    public final BRg getModifier() {
        return this.modifier;
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    public final G0U<HeaderActionPill, Unit> getOnPillChanged() {
        return this.onPillChanged;
    }

    public final G0W<BRg, BFM, Integer, BRg> getPillEntrance() {
        return this.pillEntrance;
    }

    public final String getTestTag() {
        return this.testTag;
    }

    public final boolean getTracksChromeObstacle() {
        return this.tracksChromeObstacle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HeaderAction(Object obj, HeaderActionIcon headerActionIcon, String str, Function0<Unit> function0, BRg bRg, boolean z, G0W<? super BRg, ? super BFM, ? super Integer, ? extends BRg> g0w, G2j<? super B6A, ? super BRg, ? super BFM, ? super Integer, Unit> g2j, G0U<? super HeaderActionPill, Unit> g0u) {
        AnonymousClass005.A17(obj, headerActionIcon, str, function0, bRg);
        this.key = obj;
        this.icon = headerActionIcon;
        this.testTag = str;
        this.onClick = function0;
        this.modifier = bRg;
        this.tracksChromeObstacle = z;
        this.pillEntrance = g0w;
        this.iconContent = g2j;
        this.onPillChanged = g0u;
    }
}
