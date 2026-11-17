package com.facebook.aura.library.view;

import X.AGI;
import X.AHD;
import X.AII;
import X.AIM;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AbstractC8407FdO;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass011;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C78N;
import X.G0V;
import android.content.res.Resources;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.share.view.ItemShareMenuEntries;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.theme.AuraColors;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class GoalContextMenuKt {
    public static final int GOAL_MENU_ID_COMPLETE = 1;
    public static final int GOAL_MENU_ID_DELETE = 3;
    public static final int GOAL_MENU_ID_DISCUSS = 5;
    public static final int GOAL_MENU_ID_DIVIDER = -1;
    public static final int GOAL_MENU_ID_RENAME = 4;
    public static final int GOAL_MENU_ID_SUBGOAL = 2;

    /* renamed from: com.facebook.aura.library.view.GoalContextMenuKt$GoalContextMenu$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
        public final /* synthetic */ AuraColors $colors;
        public final /* synthetic */ boolean $completionPending;
        public final /* synthetic */ boolean $isCompleted;
        public final /* synthetic */ Function0<Boolean> $onComplete;
        public final /* synthetic */ Function0<Unit> $onRename;
        public final /* synthetic */ ItemShareMenuEntries $shareEntries;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ItemShareMenuEntries itemShareMenuEntries, AuraColors auraColors, Function0<Boolean> function0, boolean z, boolean z2, Function0<Unit> function02) {
            super(2);
            this.$shareEntries = itemShareMenuEntries;
            this.$colors = auraColors;
            this.$onComplete = function0;
            this.$isCompleted = z;
            this.$completionPending = z2;
            this.$onRename = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
            return invoke(bfm, AnonymousClass001.A0F(num));
        }

        public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
            BBI bbiA0M;
            String strA01;
            int i2;
            bfm.AgE(1500297132);
            bfm.AgE(-1323463997);
            ItemShareMenuEntries itemShareMenuEntries = this.$shareEntries;
            AuraColors auraColors = this.$colors;
            Function0<Boolean> function0 = this.$onComplete;
            boolean z = this.$isCompleted;
            boolean z2 = this.$completionPending;
            Function0<Unit> function02 = this.$onRename;
            AII aiiA17 = AIM.A17();
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a59);
            AVy aVyA00 = AbstractC8407FdO.A00(bfm, R.drawable.speech_bubble_wght400_outline_24);
            BS0 bs0 = BRg.A00;
            aiiA17.add(new AuraContextMenuItem(5, strA012, null, aVyA00, null, null, false, false, false, true, false, bs0, 1, 1));
            aiiA17.addAll(itemShareMenuEntries.m1991itemsdhasg_w(new B6A(auraColors.primaryText), bfm, 0, 0));
            if (function0 != null) {
                bfm.AgE(613992703);
                if (z) {
                    bfm.AgE(614139612);
                    strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a5a);
                    bbiA0M = (BBI) bfm;
                    BBI.A0R(bbiA0M, false);
                    i2 = R.drawable.square_outline_24_wght400;
                } else {
                    bfm.AgE(614249662);
                    strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a57);
                    bbiA0M = (BBI) bfm;
                    BBI.A0R(bbiA0M, false);
                    i2 = R.drawable.squarecheck_outline_24_wght400;
                }
                aiiA17.add(new AuraContextMenuItem(1, strA01, null, AbstractC8407FdO.A00(bfm, i2), new B6A(auraColors.primaryText), null, false, false, false, !z2, false, bs0, 1, 1));
                BBI.A0R(bbiA0M, false);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, 614859525);
            }
            aiiA17.add(new AuraContextMenuItem(2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a5d), null, AbstractC8407FdO.A00(bfm, R.drawable.meta_brand_design_system_icons_vector_plus_square_outline_24), new B6A(auraColors.primaryText), null, false, false, false, true, false, bs0, 1, 1));
            if (function02 != null) {
                bfm.AgE(615354192);
                aiiA17.add(new AuraContextMenuItem(4, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a5c), null, AbstractC8407FdO.A00(bfm, R.drawable.pencil_outline_24_wght400), new B6A(auraColors.primaryText), null, false, false, false, true, false, bs0, 1, 1));
                BBI.A0R(bbiA0M, false);
            } else {
                bfm.AgE(615712645);
                BBI.A0R(bbiA0M, false);
            }
            if (function0 != null || function02 != null) {
                aiiA17.add(new AuraContextMenuItem(-1, "", null, null, null, null, false, true, false, true, false, bs0, 1, 1));
            }
            aiiA17.add(new AuraContextMenuItem(3, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a58), null, AbstractC8407FdO.A00(bfm, R.drawable.trash_wght400_outline_24), null, null, false, false, false, true, true, bs0, 1, 1));
            AII aiiA18 = AIM.A18(aiiA17);
            BBI.A0R(bbiA0M, false);
            boolean zA65 = bfm.A65(aiiA18);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AGI.A0C(aiiA18);
                bfm.Ai0(objAaT);
            }
            AHD<AuraContextMenuItem> ahd = (AHD) objAaT;
            BBI.A0R(bbiA0M, false);
            return ahd;
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalContextMenuKt$GoalContextMenu$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $completionPending;
        public final /* synthetic */ boolean $expanded;
        public final /* synthetic */ String $goalId;
        public final /* synthetic */ boolean $hasSubGoals;
        public final /* synthetic */ boolean $isCompleted;
        public final /* synthetic */ boolean $isSubGoal;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onAddSubgoal;
        public final /* synthetic */ Function0<Boolean> $onComplete;
        public final /* synthetic */ Function0<Unit> $onDelete;
        public final /* synthetic */ Function0<Unit> $onDiscuss;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onRename;
        public final /* synthetic */ HatchScreen $screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, HatchScreen hatchScreen, String str, BRg bRg, boolean z2, boolean z3, boolean z4, Function0<Boolean> function05, Function0<Unit> function06, boolean z5, int i, int i2, int i3) {
            super(2);
            this.$expanded = z;
            this.$onDismiss = function0;
            this.$onAddSubgoal = function02;
            this.$onDelete = function03;
            this.$onDiscuss = function04;
            this.$screen = hatchScreen;
            this.$goalId = str;
            this.$modifier = bRg;
            this.$isSubGoal = z2;
            this.$hasSubGoals = z3;
            this.$isCompleted = z4;
            this.$onComplete = function05;
            this.$onRename = function06;
            this.$completionPending = z5;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            GoalContextMenuKt.GoalContextMenu(this.$expanded, this.$onDismiss, this.$onAddSubgoal, this.$onDelete, this.$onDiscuss, this.$screen, this.$goalId, this.$modifier, this.$isSubGoal, this.$hasSubGoals, this.$isCompleted, this.$onComplete, this.$onRename, this.$completionPending, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void GoalContextMenu(boolean r39, kotlin.jvm.functions.Function0<kotlin.Unit> r40, kotlin.jvm.functions.Function0<kotlin.Unit> r41, kotlin.jvm.functions.Function0<kotlin.Unit> r42, kotlin.jvm.functions.Function0<kotlin.Unit> r43, com.facebook.aura.analytics.hatch.HatchScreen r44, java.lang.String r45, X.BRg r46, boolean r47, boolean r48, boolean r49, kotlin.jvm.functions.Function0<java.lang.Boolean> r50, kotlin.jvm.functions.Function0<kotlin.Unit> r51, boolean r52, X.BFM r53, int r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.GoalContextMenuKt.GoalContextMenu(boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.facebook.aura.analytics.hatch.HatchScreen, java.lang.String, X.BRg, boolean, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, X.BFM, int, int, int):void");
    }
}
