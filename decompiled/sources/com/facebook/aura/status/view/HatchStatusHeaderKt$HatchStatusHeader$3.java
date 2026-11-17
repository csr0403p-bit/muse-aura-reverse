package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.status.viewmodel.HatchStatusPillUiState;
import com.facebook.aura.status.viewmodel.OutOfCreditsCta;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchStatusHeaderKt$HatchStatusHeader$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $avatarSize;
    public final /* synthetic */ String $botName;
    public final /* synthetic */ HatchStatusPillUiState $headerUIState;
    public final /* synthetic */ boolean $isAvatarVisible;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ OutOfCreditsCta $outOfCreditsCta;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusHeaderKt$HatchStatusHeader$3(BRg bRg, String str, float f, boolean z, HatchStatusPillUiState hatchStatusPillUiState, OutOfCreditsCta outOfCreditsCta, int i, int i2) {
        super(2);
        this.$modifier = bRg;
        this.$botName = str;
        this.$avatarSize = f;
        this.$isAvatarVisible = z;
        this.$headerUIState = hatchStatusPillUiState;
        this.$outOfCreditsCta = outOfCreditsCta;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchStatusHeaderKt.m2227HatchStatusHeaderosbwsH8(this.$modifier, this.$botName, this.$avatarSize, this.$isAvatarVisible, this.$headerUIState, this.$outOfCreditsCta, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
