package com.facebook.aura.settings;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.ApQ;
import X.B6A;
import X.BFM;
import X.BO6;
import X.C06H;
import X.C07C;
import X.C0881AGi;
import X.C1062ATq;
import X.C10G;
import X.C1822Arm;
import X.C1YL;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchNodeDebugScreenKt$UnpairSection$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ Function0<Unit> $onUnpair;

    /* renamed from: com.facebook.aura.settings.HatchNodeDebugScreenKt$UnpairSection$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onUnpair;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0) {
            super(3);
            this.$onUnpair = function0;
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
                C1062ATq c1062ATq = C10G.A02;
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d1c);
                C0881AGi c0881AGi = C0881AGi.A00;
                AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, new AuraCardContent(new ApQ(strA01, c0881AGi), (AuraIconAndHeadlineStyle) null, (BO6) null, (B6A) null, AnonymousClass006.A0Z(bfm, c0881AGi, R.string._name_removed__res_0x7f120d1b), (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097134, (C06H) null), clickable, null, null, this.$onUnpair, null, null, null, false, false, null, null, 0L, true, null, null, bfm, 3078, 196608, 229296);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$onUnpair), -1358909448);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNodeDebugScreenKt$UnpairSection$1$1(Function0<Unit> function0) {
        super(1);
        this.$onUnpair = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
