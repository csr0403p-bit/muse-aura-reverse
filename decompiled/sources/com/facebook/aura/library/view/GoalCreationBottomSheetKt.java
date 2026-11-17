package com.facebook.aura.library.view;

import X.AKQ;
import X.ARD;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C07C;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C3U4;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.button.IconContext;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class GoalCreationBottomSheetKt {
    public static final String SOMETHING_ELSE_CATEGORY = "SOMETHING_ELSE";

    /* renamed from: com.facebook.aura.library.view.GoalCreationBottomSheetKt$GoalCreationBottomSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Map<String, String> $categoryMetadata;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ boolean $fromSectionHeader;
        public final /* synthetic */ GoalCategory $goalCategory;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ String $newGoalPrompt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Map<String, String> map, AuraNavigator auraNavigator, boolean z, String str, GoalCategory goalCategory, Context context) {
            super(2);
            this.$categoryMetadata = map;
            this.$navigator = auraNavigator;
            this.$fromSectionHeader = z;
            this.$newGoalPrompt = str;
            this.$goalCategory = goalCategory;
            this.$context = context;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                int iOrdinal = -1;
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a6d);
                AuraLabelButtonStyle auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
                AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
                BRg bRgA09 = C3U4.A09(C10G.A02, AuraDimensKt.SpacingMedium);
                G0W<IconContext, BFM, Integer, Unit> g0w = ComposableSingletons$GoalCreationBottomSheetKt.lambda$6388609;
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$newGoalPrompt, AnonymousClass001.A1U(bfm, this.$fromSectionHeader, AnonymousClass001.A1T(bfm, this.$navigator, bfm.A67(this.$categoryMetadata))));
                GoalCategory goalCategory = this.$goalCategory;
                if (goalCategory != null) {
                    iOrdinal = goalCategory.ordinal();
                }
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$context, bfm.A63(iOrdinal) | zA1R);
                Map<String, String> map = this.$categoryMetadata;
                AuraNavigator auraNavigator = this.$navigator;
                boolean z = this.$fromSectionHeader;
                String str = this.$newGoalPrompt;
                GoalCategory goalCategory2 = this.$goalCategory;
                Context context = this.$context;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new GoalCreationBottomSheetKt$GoalCreationBottomSheet$1$1$1(map, auraNavigator, z, str, goalCategory2, context);
                    bfm.Ai0(objAaT);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgA09, auraLabelButtonStylePrimary, auraButtonSize, g0w, false, false, false, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 1769472, 0, 0, 134201221);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalCreationBottomSheetKt$GoalCreationBottomSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ GoalCategory $goalCategory;
        public final /* synthetic */ boolean $tracking;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, GoalCategory goalCategory) {
            super(3);
            this.$tracking = z;
            this.$goalCategory = goalCategory;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            int sheetTitleRes;
            int i2;
            int i3;
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                if (this.$tracking) {
                    sheetTitleRes = R.string._name_removed__res_0x7f120a80;
                    i2 = R.string._name_removed__res_0x7f120a77;
                    i3 = R.string._name_removed__res_0x7f120a78;
                } else {
                    GoalCategory goalCategory = this.$goalCategory;
                    if (goalCategory != null) {
                        sheetTitleRes = goalCategory.getSheetTitleRes();
                    } else {
                        sheetTitleRes = R.string._name_removed__res_0x7f120a7d;
                    }
                    i2 = R.string._name_removed__res_0x7f120a75;
                    i3 = R.string._name_removed__res_0x7f120a76;
                }
                GoalCreationBottomSheetKt.GoalCreationBottomSheetBody(sheetTitleRes, i2, i3, null, bfm, 0, 8);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalCreationBottomSheetKt$GoalCreationBottomSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $category;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$category = str;
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
            GoalCreationBottomSheetKt.GoalCreationBottomSheet(this.$category, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalCreationBottomSheetKt$GoalCreationBottomSheetBody$2, reason: invalid class name and case insensitive filesystem */
    public final class C123462 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ int $refineRes;
        public final /* synthetic */ int $titleRes;
        public final /* synthetic */ int $trackRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123462(int i, int i2, int i3, BRg bRg, int i4, int i5) {
            super(2);
            this.$titleRes = i;
            this.$refineRes = i2;
            this.$trackRes = i3;
            this.$modifier = bRg;
            this.$$changed = i4;
            this.$$default = i5;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            GoalCreationBottomSheetKt.GoalCreationBottomSheetBody(this.$titleRes, this.$refineRes, this.$trackRes, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void GoalCreationBottomSheet(java.lang.String r26, X.BRg r27, X.BFM r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.GoalCreationBottomSheetKt.GoalCreationBottomSheet(java.lang.String, X.BRg, X.BFM, int, int):void");
    }

    public static final void GoalCreationBottomSheetBody(int i, int i2, int i3, BRg bRg, BFM bfm, int i4, int i5) {
        BRg bRg2 = bRg;
        bfm.AgG(809078466);
        int iA0D = (i4 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i4 : i4;
        if ((i4 & 48) == 0) {
            iA0D |= AnonymousClass004.A0E(bfm, i2);
        }
        if ((i4 & 384) == 0) {
            iA0D |= AnonymousClass004.A0F(bfm, i3);
        }
        int i6 = i5 & 8;
        if (i6 != 0) {
            iA0D |= 3072;
        } else if ((i4 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 1171, 1170), bfm, iA0D)) {
            if (i6 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA07 = C3U4.A07(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingLarge);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingSmall, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, i);
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title3Medium;
            long jA0C = C06G.A0C(bfm);
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = GoalCreationBottomSheetKt$GoalCreationBottomSheetBody$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, ARD.A01(bs0, (G0U) objAaT, false), jA0C, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i2), null, C06G.A0C(bfm), C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i3), null, C06G.A0C(bfm), C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C123462(i, i2, i3, bRg2, i4, i5);
        }
    }
}
