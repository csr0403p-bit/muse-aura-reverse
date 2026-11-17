package com.facebook.aura.vds.compose.card;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C08R;
import X.C0zJ;
import X.C15N;
import X.C1822Arm;
import X.C3U4;
import X.C78N;
import X.C7BY;
import X.G0U;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.card.AuraCardType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraCardKt {

    /* renamed from: com.facebook.aura.vds.compose.card.AuraCardKt$AuraCardLabel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $label;
        public final /* synthetic */ C1822Arm $labelStyle;
        public final /* synthetic */ int $maxLines;
        public final /* synthetic */ AuraCardStyle $style;
        public final /* synthetic */ C08R $this_AuraCardLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C08R c08r, AuraCardStyle auraCardStyle, String str, C1822Arm c1822Arm, int i, int i2, int i3) {
            super(2);
            this.$this_AuraCardLabel = c08r;
            this.$style = auraCardStyle;
            this.$label = str;
            this.$labelStyle = c1822Arm;
            this.$maxLines = i;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraCardKt.AuraCardLabel(this.$this_AuraCardLabel, this.$style, this.$label, this.$labelStyle, this.$maxLines, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraCardLabel(X.C08R r24, com.facebook.aura.vds.compose.card.AuraCardStyle r25, java.lang.String r26, X.C1822Arm r27, int r28, X.BFM r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.card.AuraCardKt.AuraCardLabel(X.08R, com.facebook.aura.vds.compose.card.AuraCardStyle, java.lang.String, X.Arm, int, X.BFM, int, int):void");
    }

    public static final boolean hasTrailingItems(AuraCardContent auraCardContent, boolean z, AuraCardType auraCardType, boolean z2) {
        String str = auraCardContent.label;
        if ((str != null && !C7BY.A0j(str)) || z || z2) {
            return true;
        }
        return ((auraCardType instanceof AuraCardType.None) || (auraCardType instanceof AuraCardType.Clickable)) ? false : true;
    }

    public static final InteractionType toInteractionType(AuraCardType auraCardType) {
        if (auraCardType instanceof AuraCardType.None) {
            return InteractionType.NONE;
        }
        if ((auraCardType instanceof AuraCardType.Button) || (auraCardType instanceof AuraCardType.IconButton) || (auraCardType instanceof AuraCardType.Image) || (auraCardType instanceof AuraCardType.ChevronNavigation) || (auraCardType instanceof AuraCardType.ExternalNavigation) || (auraCardType instanceof AuraCardType.Clickable)) {
            return InteractionType.CLICKABLE;
        }
        if ((auraCardType instanceof AuraCardType.IconToggleButton) || (auraCardType instanceof AuraCardType.Radio) || (auraCardType instanceof AuraCardType.Checkbox) || (auraCardType instanceof AuraCardType.Toggle)) {
            return InteractionType.TOGGLEABLE;
        }
        if (auraCardType instanceof AuraCardType.TextInput) {
            return InteractionType.EDITABLE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: AuraCardAlert-RPmYEkk, reason: not valid java name */
    public static final void m2485AuraCardAlertRPmYEkk(AuraCardStyle auraCardStyle, long j, BFM bfm, int i) {
        bfm.AgG(-1549059790);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, auraCardStyle) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            String strA00 = C15N.A00(bfm, R.string._name_removed__res_0x7f121118);
            BRg bRgA0S = AnonymousClass001.A0S(C3U4.A0D(BRg.A00, auraCardStyle.trailingItemPaddingValues()));
            boolean zA65 = bfm.A65(strA00);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new AuraCardKt$AuraCardAlert$1$1(strA00);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0S, objAaT, false);
            boolean zA1N = AnonymousClass001.A1N(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA1N || objAaT2 == C78N.A00) {
                objAaT2 = new AuraCardKt$AuraCardAlert$2$1(j);
                bfm.Ai0(objAaT2);
            }
            C0zJ.A00(bRgA0Y, (G0U) objAaT2, bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraCardKt$AuraCardAlert$3(auraCardStyle, j, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f6  */
    /* renamed from: AuraCard-jQVUvHA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2484AuraCardjQVUvHA(X.BRg r44, com.facebook.aura.vds.compose.card.AuraCardStyle r45, com.facebook.aura.vds.compose.card.AuraCardContent r46, com.facebook.aura.vds.compose.card.AuraCardType r47, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r48, X.G0W<? super X.C08R, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r49, kotlin.jvm.functions.Function0<kotlin.Unit> r50, java.lang.Boolean r51, X.G0U<? super java.lang.Boolean, kotlin.Unit> r52, X.G0U<? super java.lang.String, kotlin.Unit> r53, boolean r54, boolean r55, X.InterfaceC05011Yg r56, X.C1DM r57, long r58, boolean r60, X.G0W<? super X.C07C, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r61, X.G0W<? super X.C07C, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r62, X.BFM r63, int r64, int r65, int r66) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.card.AuraCardKt.m2484AuraCardjQVUvHA(X.BRg, com.facebook.aura.vds.compose.card.AuraCardStyle, com.facebook.aura.vds.compose.card.AuraCardContent, com.facebook.aura.vds.compose.card.AuraCardType, X.G0V, X.G0W, kotlin.jvm.functions.Function0, java.lang.Boolean, X.G0U, X.G0U, boolean, boolean, X.1Yg, X.1DM, long, boolean, X.G0W, X.G0W, X.BFM, int, int, int):void");
    }
}
