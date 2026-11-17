package com.facebook.aura.conversation.view.typewritertext;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.ApQ;
import X.B0A;
import X.BFM;
import X.BO6;
import X.BRg;
import X.C0Hi;
import X.C14P;
import X.C1736ApY;
import X.C1810ArU;
import X.C1822Arm;
import X.C1958Aux;
import X.C1JY;
import X.C1YL;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$textContent$1 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
    public final /* synthetic */ ApQ $animatedText;
    public final /* synthetic */ boolean $enableSelection;
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ B0A $fontStyle;
    public final /* synthetic */ C1736ApY $fontWeight;
    public final /* synthetic */ BO6<String, C14P> $inlineContent;
    public final /* synthetic */ long $lineHeight;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ G0U<Integer, Unit> $onClick;
    public final /* synthetic */ G0U<Integer, Unit> $onDoubleClick;
    public final /* synthetic */ G0U<Integer, Unit> $onLongClick;
    public final /* synthetic */ G0U<C1958Aux, Unit> $onTextLayout;
    public final /* synthetic */ int $overflow;
    public final /* synthetic */ boolean $softWrap;
    public final /* synthetic */ int $textAlign;
    public final /* synthetic */ long $textColor;
    public final /* synthetic */ C1810ArU $textIndent;
    public final /* synthetic */ C1822Arm $textStyle;
    public final /* synthetic */ C1JY $textToolbar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$textContent$1(ApQ apQ, C1JY c1jy, C0Hi c0Hi, G0U<? super Integer, Unit> g0u, boolean z, G0U<? super Integer, Unit> g0u2, G0U<? super Integer, Unit> g0u3, long j, C1822Arm c1822Arm, B0A b0a, C1736ApY c1736ApY, int i, long j2, boolean z2, int i2, int i3, G0U<? super C1958Aux, Unit> g0u4, C1810ArU c1810ArU, BO6<String, C14P> bo6) {
        super(3);
        this.$animatedText = apQ;
        this.$textToolbar = c1jy;
        this.$focusManager = c0Hi;
        this.$onClick = g0u;
        this.$enableSelection = z;
        this.$onLongClick = g0u2;
        this.$onDoubleClick = g0u3;
        this.$textColor = j;
        this.$textStyle = c1822Arm;
        this.$fontStyle = b0a;
        this.$fontWeight = c1736ApY;
        this.$textAlign = i;
        this.$lineHeight = j2;
        this.$softWrap = z2;
        this.$maxLines = i2;
        this.$overflow = i3;
        this.$onTextLayout = g0u4;
        this.$textIndent = c1810ArU;
        this.$inlineContent = bo6;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
        invoke(bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BRg bRg, BFM bfm, int i) {
        G0U g0u;
        int iA0d = i;
        C7384Etj.A0Y(bRg, 0);
        if ((i & 6) == 0) {
            iA0d = i | AnonymousClass004.A0d(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            ApQ apQ = this.$animatedText;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$onClick, AnonymousClass001.A1T(bfm, this.$focusManager, bfm.A67(this.$textToolbar)));
            C1JY c1jy = this.$textToolbar;
            C0Hi c0Hi = this.$focusManager;
            G0U<Integer, Unit> g0u2 = this.$onClick;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$textContent$1$1$1(c1jy, c0Hi, g0u2);
                bfm.Ai0(objAaT);
            }
            G0U g0u3 = (G0U) objAaT;
            boolean zA1R2 = AnonymousClass001.A1R(bfm, this.$onLongClick, AnonymousClass001.A1T(bfm, this.$focusManager, AnonymousClass001.A1T(bfm, this.$textToolbar, bfm.A66(this.$enableSelection))));
            boolean z = this.$enableSelection;
            C1JY c1jy2 = this.$textToolbar;
            C0Hi c0Hi2 = this.$focusManager;
            G0U<Integer, Unit> g0u4 = this.$onLongClick;
            Object objAaT2 = bfm.AaT();
            if (zA1R2 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$textContent$1$2$1(z, c1jy2, c0Hi2, g0u4);
                bfm.Ai0(objAaT2);
            }
            G0U g0u5 = (G0U) objAaT2;
            if (this.$onDoubleClick != null) {
                bfm.AgE(803551500);
                boolean zA1R3 = AnonymousClass001.A1R(bfm, this.$onDoubleClick, AnonymousClass001.A1T(bfm, this.$focusManager, bfm.A67(this.$textToolbar)));
                C1JY c1jy3 = this.$textToolbar;
                C0Hi c0Hi3 = this.$focusManager;
                G0U<Integer, Unit> g0u6 = this.$onDoubleClick;
                Object objAaT3 = bfm.AaT();
                if (zA1R3 || objAaT3 == C78N.A00) {
                    objAaT3 = new HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$textContent$1$3$1(c1jy3, c0Hi3, g0u6);
                    bfm.Ai0(objAaT3);
                }
                g0u = (G0U) objAaT3;
                AnonymousClass001.A1D(bfm);
            } else {
                AnonymousClass003.A0l(bfm, 803742087);
                g0u = null;
            }
            AuraTextKt.m2638AuraClickableTextZsD2BWI(apQ, bRg, g0u3, null, g0u5, g0u, false, this.$textColor, this.$textStyle, this.$fontStyle, this.$fontWeight, new C1YL(this.$textAlign), this.$lineHeight, this.$softWrap, this.$maxLines, 0, this.$overflow, this.$onTextLayout, this.$textIndent, this.$inlineContent, bfm, (iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0, 32840);
            return;
        }
        bfm.Afo();
    }
}
