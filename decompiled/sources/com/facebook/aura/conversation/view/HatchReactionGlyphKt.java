package com.facebook.aura.conversation.view;

import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C0dm;
import X.C1804ArN;
import X.C1822Arm;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class HatchReactionGlyphKt {
    public static final float ARTWORK_TO_GLYPH_RATIO = 0.9375f;
    public static final float GLYPH_TO_TEXT_RATIO = 1.174f;
    public static final float ReactionGlyphFallbackSize = 20.0f;
    public static final C1804ArN ReactionGlyphLineHeightStyle = new C1804ArN(0, 0.5f, 0);

    /* renamed from: com.facebook.aura.conversation.view.HatchReactionGlyphKt$HatchReactionGlyph$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C1822Arm $textStyle;
        public final /* synthetic */ String $token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, BRg bRg, C1822Arm c1822Arm, int i, int i2) {
            super(2);
            this.$token = str;
            this.$modifier = bRg;
            this.$textStyle = c1822Arm;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchReactionGlyphKt.HatchReactionGlyph(this.$token, this.$modifier, this.$textStyle, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final String reactionAccessibilityText(List<String> list, BFM bfm, int i) {
        C7384Etj.A0Y(list, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        bfm.AgE(-146341020);
        for (HatchCustomReaction hatchCustomReaction : HatchCustomReaction.getEntries()) {
            linkedHashMap.put(hatchCustomReaction.getWireValue(), AbstractC2271BQs.A01(bfm, hatchCustomReaction.getLabelRes()));
        }
        AnonymousClass001.A1D(bfm);
        boolean zA67 = bfm.A67(linkedHashMap);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new HatchReactionGlyphKt$reactionAccessibilityText$1$1(linkedHashMap);
            bfm.Ai0(objAaT);
        }
        return AbstractC0878AGe.A0L(InviteCodeScratcherKt.CODE_SEPARATOR, "", "", list, (G0U) objAaT);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchReactionGlyph(java.lang.String r30, X.BRg r31, X.C1822Arm r32, X.BFM r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchReactionGlyphKt.HatchReactionGlyph(java.lang.String, X.BRg, X.Arm, X.BFM, int, int):void");
    }

    /* renamed from: reactionTextSizeFor-8Feqmps, reason: not valid java name */
    public static final long m660reactionTextSizeFor8Feqmps(float f, BFM bfm, int i) {
        return ((C0dm) bfm.A6v(Am0.A04)).Ah7(f / 1.100625f);
    }
}
