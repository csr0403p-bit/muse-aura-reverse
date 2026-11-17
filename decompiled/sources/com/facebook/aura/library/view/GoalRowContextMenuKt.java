package com.facebook.aura.library.view;

import X.AGI;
import X.AHD;
import X.AII;
import X.AIM;
import X.AKH;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AbstractC8407FdO;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C06G;
import X.C78N;
import X.G0V;
import android.content.res.Resources;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class GoalRowContextMenuKt {
    public static final int GOAL_ROW_MENU_ID_COMPLETE = 1;
    public static final int GOAL_ROW_MENU_ID_DELETE = 3;
    public static final int GOAL_ROW_MENU_ID_DISCUSS = 6;
    public static final int GOAL_ROW_MENU_ID_DIVIDER = -1;
    public static final int GOAL_ROW_MENU_ID_PROMOTE = 5;
    public static final int GOAL_ROW_MENU_ID_RENAME = 2;
    public static final int GOAL_ROW_MENU_ID_SUBGOAL = 4;

    /* renamed from: com.facebook.aura.library.view.GoalRowContextMenuKt$GoalRowContextMenu$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
        public final /* synthetic */ boolean $completionEnabled;
        public final /* synthetic */ boolean $isCompleted;
        public final /* synthetic */ Function0<Unit> $onPromoteToGoal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, boolean z2, Function0<Unit> function0) {
            super(2);
            this.$isCompleted = z;
            this.$completionEnabled = z2;
            this.$onPromoteToGoal = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
            return invoke(bfm, AnonymousClass001.A0F(num));
        }

        public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
            String strA01;
            BBI bbi;
            int i2;
            bfm.AgE(-470332679);
            bfm.AgE(-1018134767);
            boolean z = this.$isCompleted;
            boolean z2 = this.$completionEnabled;
            Function0<Unit> function0 = this.$onPromoteToGoal;
            AII aiiA17 = AIM.A17();
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a59);
            AVy aVyA00 = AbstractC8407FdO.A00(bfm, R.drawable.speech_bubble_wght400_outline_24);
            BS0 bs0 = BRg.A00;
            aiiA17.add(new AuraContextMenuItem(6, strA012, null, aVyA00, null, null, false, false, false, true, false, bs0, 1, 1));
            if (z) {
                bfm.AgE(-785867691);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a5a);
                bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                i2 = R.drawable.square_outline_24_wght400;
            } else {
                bfm.AgE(-785761609);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a57);
                bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                i2 = R.drawable.squarecheck_outline_24_wght400;
            }
            aiiA17.add(new AuraContextMenuItem(1, strA01, null, AbstractC8407FdO.A00(bfm, i2), null, null, false, false, false, z2, false, bs0, 1, 1));
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a5d);
            AVy aVyA002 = AbstractC8407FdO.A00(bfm, R.drawable.meta_brand_design_system_icons_vector_plus_square_outline_24);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            aiiA17.add(new AuraContextMenuItem(4, strA013, null, aVyA002, new B6A(C06G.A0L(bfm, akh)), null, false, false, false, true, false, bs0, 1, 1));
            if (function0 != null) {
                bfm.AgE(-784729805);
                aiiA17.add(new AuraContextMenuItem(5, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a5b), null, AbstractC8407FdO.A00(bfm, R.drawable.listplay_outline_24_wght400), new B6A(C06G.A0L(bfm, akh)), null, false, false, false, true, false, bs0, 1, 1));
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-784354054);
                BBI.A0R(bbi, false);
            }
            aiiA17.add(new AuraContextMenuItem(2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a5c), null, AbstractC8407FdO.A00(bfm, R.drawable.pencil_outline_24_wght400), null, null, false, false, false, true, false, bs0, 1, 1));
            aiiA17.add(new AuraContextMenuItem(-1, "", null, null, null, null, false, true, false, true, false, bs0, 1, 1));
            aiiA17.add(new AuraContextMenuItem(3, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a58), null, AbstractC8407FdO.A00(bfm, R.drawable.trash_wght400_outline_24), null, null, false, false, false, true, true, bs0, 1, 1));
            AII aiiA18 = AIM.A18(aiiA17);
            BBI.A0R(bbi, false);
            boolean zA65 = bfm.A65(aiiA18);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AGI.A0C(aiiA18);
                bfm.Ai0(objAaT);
            }
            AHD<AuraContextMenuItem> ahd = (AHD) objAaT;
            BBI.A0R(bbi, false);
            return ahd;
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalRowContextMenuKt$GoalRowContextMenu$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $completionEnabled;
        public final /* synthetic */ boolean $expanded;
        public final /* synthetic */ boolean $isCompleted;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onAddSubgoal;
        public final /* synthetic */ Function0<Unit> $onComplete;
        public final /* synthetic */ Function0<Unit> $onDelete;
        public final /* synthetic */ Function0<Unit> $onDiscuss;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onPromoteToGoal;
        public final /* synthetic */ Function0<Unit> $onRename;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, BRg bRg, boolean z3, Function0<Unit> function07, int i, int i2, int i3) {
            super(2);
            this.$expanded = z;
            this.$isCompleted = z2;
            this.$onDismiss = function0;
            this.$onComplete = function02;
            this.$onDiscuss = function03;
            this.$onAddSubgoal = function04;
            this.$onRename = function05;
            this.$onDelete = function06;
            this.$modifier = bRg;
            this.$completionEnabled = z3;
            this.$onPromoteToGoal = function07;
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
            GoalRowContextMenuKt.GoalRowContextMenu(this.$expanded, this.$isCompleted, this.$onDismiss, this.$onComplete, this.$onDiscuss, this.$onAddSubgoal, this.$onRename, this.$onDelete, this.$modifier, this.$completionEnabled, this.$onPromoteToGoal, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void GoalRowContextMenu(boolean r28, boolean r29, kotlin.jvm.functions.Function0<kotlin.Unit> r30, kotlin.jvm.functions.Function0<kotlin.Unit> r31, kotlin.jvm.functions.Function0<kotlin.Unit> r32, kotlin.jvm.functions.Function0<kotlin.Unit> r33, kotlin.jvm.functions.Function0<kotlin.Unit> r34, kotlin.jvm.functions.Function0<kotlin.Unit> r35, X.BRg r36, boolean r37, kotlin.jvm.functions.Function0<kotlin.Unit> r38, X.BFM r39, int r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.GoalRowContextMenuKt.GoalRowContextMenu(boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, boolean, kotlin.jvm.functions.Function0, X.BFM, int, int, int):void");
    }
}
