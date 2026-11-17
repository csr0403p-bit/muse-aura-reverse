package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.ApQ;
import X.B1U;
import X.B1V;
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
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardDefaults;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSettingsScreenKt$AccountsCenterSection$3$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ MutableState<Boolean> $acWasOpened$delegate;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ int $leadingIconRes;
    public final /* synthetic */ String $subtitle;
    public final /* synthetic */ String $title;

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$AccountsCenterSection$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<Boolean> $acWasOpened$delegate;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ int $leadingIconRes;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$AccountsCenterSection$3$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03511 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ int $leadingIconRes;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03511(int i) {
                super(2);
                this.$leadingIconRes = i;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                    AnonymousClass007.A11(bfm, AuraCardDefaults.INSTANCE, this.$leadingIconRes);
                } else {
                    bfm.Afo();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, Context context, int i, MutableState<Boolean> mutableState) {
            super(3);
            this.$title = str;
            this.$subtitle = str2;
            this.$context = context;
            this.$leadingIconRes = i;
            this.$acWasOpened$delegate = mutableState;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AuraCardType.ChevronNavigation chevronNavigation = new AuraCardType.ChevronNavigation(null);
                C1062ATq c1062ATq = C10G.A02;
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
                String str = this.$title;
                C0881AGi c0881AGi = C0881AGi.A00;
                AuraCardContent auraCardContent = new AuraCardContent(new ApQ(str, c0881AGi), auraIconAndHeadlineStyle, (BO6) null, (B6A) null, new ApQ(this.$subtitle, c0881AGi), (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097132, (C06H) null);
                B1U b1uA00 = B1V.A00(bfm, new C03511(this.$leadingIconRes), -547618930);
                boolean zA67 = bfm.A67(this.$context);
                Context context = this.$context;
                MutableState<Boolean> mutableState = this.$acWasOpened$delegate;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchSettingsScreenKt$AccountsCenterSection$3$1$1$2$1(context, mutableState);
                    bfm.Ai0(objAaT);
                }
                AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, chevronNavigation, b1uA00, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 27654, 0, 262048);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$title, this.$subtitle, this.$context, this.$leadingIconRes, this.$acWasOpened$delegate), -1570062670);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSettingsScreenKt$AccountsCenterSection$3$1(String str, String str2, Context context, int i, MutableState<Boolean> mutableState) {
        super(1);
        this.$title = str;
        this.$subtitle = str2;
        this.$context = context;
        this.$leadingIconRes = i;
        this.$acWasOpened$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
