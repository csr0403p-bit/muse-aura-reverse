package com.facebook.aura.email.view;

import X.AEk;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C1062ATq;
import X.C10G;
import X.C1822Arm;
import X.C3U4;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.email.model.EmailBodyPart;
import com.facebook.aura.ui.HatchMarkdownTextKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailMessageBodyKt$EmailPlainTextBody$1$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ EmailBodyPart $part;
    public final /* synthetic */ long $quoteColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailMessageBodyKt$EmailPlainTextBody$1$1$1(EmailBodyPart emailBodyPart, long j) {
        super(2);
        this.$part = emailBodyPart;
        this.$quoteColor = j;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(BFM bfm, int i) {
        BRg bRgA0C;
        int iA1V;
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            String str = this.$part.text;
            C1822Arm c1822ArmA0Z = C06G.A0Z(bfm);
            if (!this.$part.isQuote) {
                boolean zA1P = AnonymousClass004.A1P(bfm, -572207004);
                bRgA0C = C10G.A02;
                iA1V = zA1P;
            } else {
                bfm.AgE(-572193236);
                C1062ATq c1062ATq = C10G.A02;
                boolean zA64 = bfm.A64(this.$quoteColor);
                long j = this.$quoteColor;
                Object objAaT = bfm.AaT();
                if (zA64 || objAaT == C78N.A00) {
                    objAaT = new EmailMessageBodyKt$EmailPlainTextBody$1$1$1$1$1(j);
                    bfm.Ai0(objAaT);
                }
                bRgA0C = C3U4.A0C(AEk.A01(c1062ATq, (G0U) objAaT), 12.0f, 0.0f, 0.0f, 0.0f);
                iA1V = AnonymousClass001.A1V(bfm);
            }
            HatchMarkdownTextKt.m2319HatchMarkdownTextT042LqI(str, bRgA0C, 0L, c1822ArmA0Z, null, bfm, iA1V, 20);
            return;
        }
        bfm.Afo();
    }
}
