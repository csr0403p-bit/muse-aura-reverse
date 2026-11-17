package com.facebook.aura.explore.view;

import X.AGI;
import X.AHD;
import X.AHH;
import X.AII;
import X.AIM;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.G0U;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.share.api.ShareableItem;
import com.facebook.aura.share.view.ItemShareLogContext;
import com.facebook.aura.share.view.ItemShareMenuEntries;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class IdeaContextMenuKt {
    public static final int MENU_DIVIDER = 3;
    public static final int MENU_EXECUTE = 0;
    public static final int MENU_FEEDBACK_DOWN = 2;
    public static final int MENU_FEEDBACK_UP = 1;
    public static final int MENU_SHARE = 4;

    /* renamed from: com.facebook.aura.explore.view.IdeaContextMenuKt$IdeaContextMenu$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
        public final /* synthetic */ long $iconTint;
        public final /* synthetic */ boolean $isPreparingShare;
        public final /* synthetic */ Function0<Unit> $onShare;
        public final /* synthetic */ ItemShareMenuEntries $shareEntries;
        public final /* synthetic */ boolean $showExecuteAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, long j, Function0<Unit> function0, boolean z2, ItemShareMenuEntries itemShareMenuEntries) {
            super(2);
            this.$showExecuteAction = z;
            this.$iconTint = j;
            this.$onShare = function0;
            this.$isPreparingShare = z2;
            this.$shareEntries = itemShareMenuEntries;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
            return invoke(bfm, AnonymousClass001.A0F(num));
        }

        public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
            bfm.AgE(-2073494521);
            boolean z = this.$showExecuteAction;
            long j = this.$iconTint;
            Function0<Unit> function0 = this.$onShare;
            boolean z2 = this.$isPreparingShare;
            ItemShareMenuEntries itemShareMenuEntries = this.$shareEntries;
            AII aiiA17 = AIM.A17();
            if (z) {
                bfm.AgE(283898830);
                aiiA17.add(new AuraContextMenuItem(0, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120253), null, BOf.A00(bfm, R.drawable.aura_wand, 0), new B6A(j), null, false, false, false, true, false, BRg.A00, 1, 1));
            } else {
                bfm.AgE(284238063);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            if (function0 != null) {
                bfm.AgE(284288841);
                aiiA17.add(new AuraContextMenuItem(4, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12055a), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120265), BOf.A00(bfm, R.drawable.arrow_share_wght400_outline_24, 0), new B6A(j), null, false, false, false, !z2, false, BRg.A00, 2, 1));
            } else {
                bfm.AgE(284878895);
            }
            List<AuraContextMenuItem> listM1991itemsdhasg_w = itemShareMenuEntries.m1991itemsdhasg_w(AnonymousClass006.A0P(bbi, j), bfm, 0, 0);
            aiiA17.addAll(listM1991itemsdhasg_w);
            if (z || function0 != null || !listM1991itemsdhasg_w.isEmpty()) {
                aiiA17.add(new AuraContextMenuItem(3, "", null, null, null, null, false, true, false, true, false, BRg.A00, 1, 1));
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120258);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.aura_thumbs_up, 0);
            B6A b6a = new B6A(j);
            BS0 bs0 = BRg.A00;
            aiiA17.add(new AuraContextMenuItem(1, strA01, null, aVyA00, b6a, null, false, false, false, true, false, bs0, 1, 1));
            aiiA17.add(new AuraContextMenuItem(2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120259), null, BOf.A00(bfm, R.drawable.aura_thumbs_down, 0), new B6A(j), null, false, false, false, true, false, bs0, 1, 1));
            AHH ahhA0C = AGI.A0C(AIM.A18(aiiA17));
            BBI.A0R(bbi, false);
            return ahhA0C;
        }
    }

    /* renamed from: com.facebook.aura.explore.view.IdeaContextMenuKt$IdeaContextMenu$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $expanded;
        public final /* synthetic */ boolean $forceCenterHorizontalAlignment;
        public final /* synthetic */ boolean $isPreparingShare;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<IdeaContextMenuAction, Unit> $onAction;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ Function0<Unit> $onShare;
        public final /* synthetic */ ShareableItem $shareItem;
        public final /* synthetic */ ItemShareLogContext $shareLogContext;
        public final /* synthetic */ boolean $showExecuteAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(boolean z, boolean z2, Function0<Unit> function0, G0U<? super IdeaContextMenuAction, Unit> g0u, ItemShareLogContext itemShareLogContext, BRg bRg, boolean z3, Function0<Unit> function02, boolean z4, ShareableItem shareableItem, Function0<Unit> function03, int i, int i2, int i3) {
            super(2);
            this.$expanded = z;
            this.$showExecuteAction = z2;
            this.$onDismiss = function0;
            this.$onAction = g0u;
            this.$shareLogContext = itemShareLogContext;
            this.$modifier = bRg;
            this.$forceCenterHorizontalAlignment = z3;
            this.$onShare = function02;
            this.$isPreparingShare = z4;
            this.$shareItem = shareableItem;
            this.$onDismissRequest = function03;
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
            IdeaContextMenuKt.IdeaContextMenu(this.$expanded, this.$showExecuteAction, this.$onDismiss, this.$onAction, this.$shareLogContext, this.$modifier, this.$forceCenterHorizontalAlignment, this.$onShare, this.$isPreparingShare, this.$shareItem, this.$onDismissRequest, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void IdeaContextMenu(boolean r41, boolean r42, kotlin.jvm.functions.Function0<kotlin.Unit> r43, X.G0U<? super com.facebook.aura.explore.view.IdeaContextMenuAction, kotlin.Unit> r44, com.facebook.aura.share.view.ItemShareLogContext r45, X.BRg r46, boolean r47, kotlin.jvm.functions.Function0<kotlin.Unit> r48, boolean r49, com.facebook.aura.share.api.ShareableItem r50, kotlin.jvm.functions.Function0<kotlin.Unit> r51, X.BFM r52, int r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.explore.view.IdeaContextMenuKt.IdeaContextMenu(boolean, boolean, kotlin.jvm.functions.Function0, X.G0U, com.facebook.aura.share.view.ItemShareLogContext, X.BRg, boolean, kotlin.jvm.functions.Function0, boolean, com.facebook.aura.share.api.ShareableItem, kotlin.jvm.functions.Function0, X.BFM, int, int, int):void");
    }
}
