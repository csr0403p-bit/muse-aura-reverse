package com.facebook.aura.library.view;

import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C06G;
import X.C1822Arm;
import X.C19f;
import X.C1AC;
import X.C1BO;
import X.C3TQ;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class GoalListItemRowKt {

    /* renamed from: com.facebook.aura.library.view.GoalListItemRowKt$GoalListItemRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C3TQ $contentPadding;
        public final /* synthetic */ boolean $isCompleted;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $leading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $showSubtitle;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingContent;
        public final /* synthetic */ C1AC $verticalAlignment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, BRg bRg, String str2, boolean z, boolean z2, C3TQ c3tq, C1AC c1ac, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, int i, int i2) {
            super(2);
            this.$title = str;
            this.$modifier = bRg;
            this.$subtitle = str2;
            this.$showSubtitle = z;
            this.$isCompleted = z2;
            this.$contentPadding = c3tq;
            this.$verticalAlignment = c1ac;
            this.$leading = g0v;
            this.$trailingContent = g0v2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            GoalListItemRowKt.GoalListItemRow(this.$title, this.$modifier, this.$subtitle, this.$showSubtitle, this.$isCompleted, this.$contentPadding, this.$verticalAlignment, this.$leading, this.$trailingContent, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalListItemRowKt$GoalRowLeadingIcon$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, int i, int i2) {
            super(2);
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
            GoalListItemRowKt.GoalRowLeadingIcon(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalListItemRowKt$GoalRowTitle$1, reason: invalid class name and case insensitive filesystem */
    public final class C123611 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isCompleted;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $showSubtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123611(String str, boolean z, boolean z2, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$isCompleted = z;
            this.$showSubtitle = z2;
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
            GoalListItemRowKt.GoalRowTitle(this.$title, this.$isCompleted, this.$showSubtitle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void GoalRowLeadingIcon(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1432980135);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraIconKt.m2567AuraIconFHprtrg(bRg2, BOf.A00(bfm, R.drawable.square_outline_24_wght600, 0), AuraIconSize.SMALL, null, C06G.A09(bfm), null, bfm, (iA0d & 14) | 3456 | (AVy.$stable << 3), 32);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void GoalListItemRow(java.lang.String r37, X.BRg r38, java.lang.String r39, boolean r40, boolean r41, X.C3TQ r42, X.C1AC r43, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r44, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r45, X.BFM r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.GoalListItemRowKt.GoalListItemRow(java.lang.String, X.BRg, java.lang.String, boolean, boolean, X.3TQ, X.1AC, X.G0V, X.G0V, X.BFM, int, int):void");
    }

    public static final void GoalRowTitle(String str, boolean z, boolean z2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2040681471);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            long j = z ? AnonymousClass003.A0c(bfm, -1320160308).tertiaryText : AnonymousClass003.A0c(bfm, -1320099827).primaryText;
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            C1BO c1boA00 = C19f.A00(null, bfm, 384, 10, j);
            C1822Arm c1822Arm = z2 ? AnonymousClass006.A0k(bfm, -1705145911).bodyMedium : AnonymousClass006.A0k(bfm, -1705144726).bodyRegular;
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRg2, C1BO.A03(c1boA00), c1822Arm, null, null, null, false, 0, 2, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d) | ((iA0d >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 6, 14832);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C123611(str, z, z2, bRg2, i, i2);
        }
    }
}
