package com.facebook.aura.spaces.menu;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchSpaceEntryPoint;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpacesSidebarAnalytics$rememberEntryPoint$taken$2$1 extends AbstractC7559F3s implements Function0<MutableState<HatchSpaceEntryPoint>> {
    public final /* synthetic */ boolean $fromNavigation;
    public final /* synthetic */ boolean $isTab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpacesSidebarAnalytics$rememberEntryPoint$taken$2$1(boolean z, boolean z2) {
        super(0);
        this.$isTab = z;
        this.$fromNavigation = z2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final MutableState<HatchSpaceEntryPoint> invoke() {
        return AnonymousClass002.A0P(this.$isTab ? HatchSpaceEntryPoint.TAB : this.$fromNavigation ? HatchSpaceEntryPoint.SIDEBAR : HatchSpaceEntryPoint.OTHER);
    }
}
