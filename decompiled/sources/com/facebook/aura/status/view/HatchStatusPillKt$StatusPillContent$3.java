package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DG;
import X.G0V;
import com.facebook.aura.status.viewmodel.HatchStatusPillUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusPillKt$StatusPillContent$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $avatarOverlap;
    public final /* synthetic */ Function0<Float> $avatarPresence;
    public final /* synthetic */ boolean $canReportBounds;
    public final /* synthetic */ Function0<C1DG> $chromeTopInWindow;
    public final /* synthetic */ float $chromeTopPadding;
    public final /* synthetic */ boolean $isAvatarVisible;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ HatchStatusPillUiState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillKt$StatusPillContent$3(HatchStatusPillUiState hatchStatusPillUiState, Function0<Unit> function0, Function0<C1DG> function02, float f, float f2, boolean z, boolean z2, Function0<Float> function03, BRg bRg, int i, int i2) {
        super(2);
        this.$state = hatchStatusPillUiState;
        this.$onClick = function0;
        this.$chromeTopInWindow = function02;
        this.$chromeTopPadding = f;
        this.$avatarOverlap = f2;
        this.$isAvatarVisible = z;
        this.$canReportBounds = z2;
        this.$avatarPresence = function03;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchStatusPillKt.m2234StatusPillContentikN4xI4(this.$state, this.$onClick, this.$chromeTopInWindow, this.$chromeTopPadding, this.$avatarOverlap, this.$isAvatarVisible, this.$canReportBounds, this.$avatarPresence, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
