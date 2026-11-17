package com.facebook.aura.conversation.view.richcontent;

import X.ASR;
import X.AST;
import X.AT3;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C1DO;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchCodeBlockKt$HatchCodeBlock$2$1$1$1 extends AbstractC7559F3s implements G0U<AST, ASR> {
    public final /* synthetic */ long $borderColor;

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchCodeBlockKt$HatchCodeBlock$2$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
        public final /* synthetic */ long $borderColor;
        public final /* synthetic */ long $lineEnd;
        public final /* synthetic */ long $lineStart;
        public final /* synthetic */ float $strokeWidthPx;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AT3 at3) {
            C7384Etj.A0Y(at3, 0);
            at3.A9X(null, null, this.$strokeWidthPx, 1.0f, 0, 3, this.$borderColor, this.$lineStart, this.$lineEnd);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, long j2, long j3, float f) {
            super(1);
            this.$borderColor = j;
            this.$lineStart = j2;
            this.$lineEnd = j3;
            this.$strokeWidthPx = f;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
            invoke2(at3);
            return Unit.INSTANCE;
        }
    }

    @Override // X.G0U
    public final ASR invoke(AST ast) {
        C7384Etj.A0Y(ast, 0);
        float fAEm = 1.0f * ast.AEm();
        float fA01 = AnonymousClass001.A01(ast.A00.AKb(), 4294967295L);
        return ast.A00(new AnonymousClass1(this.$borderColor, (Float.floatToRawIntBits(fA01) & 4294967295L) | (AnonymousClass002.A0F() << 32), AnonymousClass005.A0M(C1DO.A00(ast), AnonymousClass001.A01(ast.A00.AKb(), 4294967295L)), fAEm));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCodeBlockKt$HatchCodeBlock$2$1$1$1(long j) {
        super(1);
        this.$borderColor = j;
    }
}
