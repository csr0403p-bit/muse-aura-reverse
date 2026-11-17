package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.ApQ;
import X.B6A;
import X.BFM;
import X.BO6;
import X.C06H;
import X.C07C;
import X.C10G;
import X.C1822Arm;
import X.C1YL;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSettingsScreenKt$HatchPauseSettingsSection$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ boolean $isPaused;
    public final /* synthetic */ Function0<Unit> $onPauseClick;
    public final /* synthetic */ Function0<Unit> $onUnpauseClick;

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$HatchPauseSettingsSection$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isPaused;
        public final /* synthetic */ Function0<Unit> $onPauseClick;
        public final /* synthetic */ Function0<Unit> $onUnpauseClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, Function0<Unit> function0, Function0<Unit> function02) {
            super(3);
            this.$isPaused = z;
            this.$onUnpauseClick = function0;
            this.$onPauseClick = function02;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                if (this.$isPaused) {
                    bfm.AgE(1125670614);
                    AuraCardType.Clickable clickable = AuraCardType.Clickable.INSTANCE;
                    AuraCardKt.m2484AuraCardjQVUvHA(C10G.A02, SettingsKt.cardStyleForSettings(null, bfm, 0, 1), new AuraCardContent(AnonymousClass005.A0X(AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f120f66)), AuraIconAndHeadlineStyle.BODY_REGULAR, (BO6) null, (B6A) null, (ApQ) null, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097148, (C06H) null), clickable, null, null, this.$onUnpauseClick, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 3078, 196608, 229296);
                } else {
                    bfm.AgE(1126360891);
                    AuraCardType.Clickable clickable2 = AuraCardType.Clickable.INSTANCE;
                    AuraCardKt.m2484AuraCardjQVUvHA(C10G.A02, SettingsKt.cardStyleForSettings(null, bfm, 0, 1), new AuraCardContent(AnonymousClass005.A0X(AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f120f34)), AuraIconAndHeadlineStyle.BODY_REGULAR, (BO6) null, (B6A) null, (ApQ) null, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097148, (C06H) null), clickable2, null, null, this.$onPauseClick, null, null, null, false, false, null, null, 0L, true, null, null, bfm, 3078, 196608, 229296);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$isPaused, this.$onUnpauseClick, this.$onPauseClick), 577438476);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSettingsScreenKt$HatchPauseSettingsSection$1$1(boolean z, Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$isPaused = z;
        this.$onUnpauseClick = function0;
        this.$onPauseClick = function02;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
