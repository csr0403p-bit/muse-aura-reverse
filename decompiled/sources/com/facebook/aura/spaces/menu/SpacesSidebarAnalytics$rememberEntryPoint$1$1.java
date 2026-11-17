package com.facebook.aura.spaces.menu;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchSpaceEntryPoint;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpacesSidebarAnalytics$rememberEntryPoint$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ SpaceOpenOrigins $openOrigins;
    public final /* synthetic */ HatchSpaceEntryPoint $recorded;
    public final /* synthetic */ String $slug;
    public final /* synthetic */ MutableState<HatchSpaceEntryPoint> $taken$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpacesSidebarAnalytics$rememberEntryPoint$1$1(HatchSpaceEntryPoint hatchSpaceEntryPoint, SpaceOpenOrigins spaceOpenOrigins, String str, MutableState<HatchSpaceEntryPoint> mutableState) {
        super(0);
        this.$recorded = hatchSpaceEntryPoint;
        this.$openOrigins = spaceOpenOrigins;
        this.$slug = str;
        this.$taken$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchSpaceEntryPoint hatchSpaceEntryPoint = this.$recorded;
        if (hatchSpaceEntryPoint != null) {
            this.$taken$delegate.Af8(hatchSpaceEntryPoint);
            this.$openOrigins.take(this.$slug, this.$recorded);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
