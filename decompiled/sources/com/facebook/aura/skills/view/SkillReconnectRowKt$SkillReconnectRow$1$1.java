package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.ApQ;
import X.B1V;
import X.B6A;
import X.BFM;
import X.BO6;
import X.BOf;
import X.BRg;
import X.C06H;
import X.C07C;
import X.C08R;
import X.C10G;
import X.C1822Arm;
import X.C1YL;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SkillReconnectRowKt$SkillReconnectRow$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ boolean $isReconnecting;
    public final /* synthetic */ String $loginLabel;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onReconnect;

    /* renamed from: com.facebook.aura.skills.view.SkillReconnectRowKt$SkillReconnectRow$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isReconnecting;
        public final /* synthetic */ String $loginLabel;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onReconnect;

        /* renamed from: com.facebook.aura.skills.view.SkillReconnectRowKt$SkillReconnectRow$1$1$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C08R, BFM, Integer, Unit> {
            public final /* synthetic */ boolean $isReconnecting;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(boolean z) {
                super(3);
                this.$isReconnecting = z;
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Unit invoke(C08R c08r, BFM bfm, Integer num) {
                invoke(c08r, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(C08R c08r, BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                    if (this.$isReconnecting) {
                        bfm.AgE(523297539);
                        AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C10G.A07(BRg.A00, 20.0f), null, 0L, bfm, 6, 6);
                    } else {
                        bfm.AgE(523398537);
                        AnonymousClass007.A0z(bfm, BOf.A00(bfm, R.drawable.circle_info_wght400_outline_24, 0), AuraIconSize.SMALL, AnonymousClass002.A0c(bfm).errorText);
                    }
                    AnonymousClass001.A1D(bfm);
                    return;
                }
                bfm.Afo();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, String str, boolean z, Function0<Unit> function0) {
            super(3);
            this.$modifier = bRg;
            this.$loginLabel = str;
            this.$isReconnecting = z;
            this.$onReconnect = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AuraCardType.Clickable clickable = AuraCardType.Clickable.INSTANCE;
                BRg bRgA0R = AnonymousClass001.A0R(this.$modifier);
                boolean zA65 = bfm.A65(this.$loginLabel);
                String str = this.$loginLabel;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new SkillReconnectRowKt$SkillReconnectRow$1$1$1$1$1(str);
                    bfm.Ai0(objAaT);
                }
                BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0R, objAaT, false);
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass006.A0Y(bfm, R.string._name_removed__res_0x7f120f9f), AuraIconAndHeadlineStyle.BODY_REGULAR, (BO6) null, (B6A) null, (ApQ) null, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097148, (C06H) null);
                boolean z = this.$isReconnecting;
                AuraCardKt.m2484AuraCardjQVUvHA(bRgA0Y, auraCardStyleCardStyleForSettings, auraCardContent, clickable, null, B1V.A00(bfm, new AnonymousClass2(z), -1026472555), this.$onReconnect, null, null, null, !z, false, null, null, 0L, false, null, null, bfm, 199680, 0, 261008);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$modifier, this.$loginLabel, this.$isReconnecting, this.$onReconnect), 2056913928);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillReconnectRowKt$SkillReconnectRow$1$1(BRg bRg, String str, boolean z, Function0<Unit> function0) {
        super(1);
        this.$modifier = bRg;
        this.$loginLabel = str;
        this.$isReconnecting = z;
        this.$onReconnect = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
