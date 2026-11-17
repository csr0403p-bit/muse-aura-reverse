package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.B1V;
import X.BFM;
import X.BRg;
import X.C1DG;
import X.C3U4;
import X.G2j;
import com.facebook.aura.email.viewmodel.EmailError;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;

/* renamed from: com.facebook.aura.email.view.ComposableSingletons$EmailThreadScreenKt$lambda$-1785584697$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$EmailThreadScreenKt$lambda$1785584697$1 extends AbstractC7559F3s implements G2j<EmailError, BRg, BFM, Integer, Unit> {
    public static final ComposableSingletons$EmailThreadScreenKt$lambda$1785584697$1 INSTANCE = new ComposableSingletons$EmailThreadScreenKt$lambda$1785584697$1();

    /* renamed from: com.facebook.aura.email.view.ComposableSingletons$EmailThreadScreenKt$lambda$-1785584697$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ EmailError $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(EmailError emailError) {
            super(4);
            this.$error = emailError;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m744invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m744invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            if ((i & 6) == 0) {
                i |= AnonymousClass004.A04(bfm, f);
            }
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 131, 130), bfm, i)) {
                EmailComponentsKt.EmailErrorMessage(this.$error, C3U4.A09(C3U4.A04(BRg.A00, f), 24.0f), bfm, 0, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    public ComposableSingletons$EmailThreadScreenKt$lambda$1785584697$1() {
        super(4);
    }

    public final void invoke(EmailError emailError, BRg bRg, BFM bfm, int i) {
        boolean zA1b = AnonymousClass004.A1b(emailError, bRg);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, emailError) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA08), bfm, iA08)) {
            EmailThreadScreenKt.EmailThreadPage("", bRg, B1V.A00(bfm, new AnonymousClass1(emailError), -1208080347), bfm, (iA08 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 390, zA1b ? 1 : 0);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(EmailError emailError, BRg bRg, BFM bfm, Integer num) {
        invoke(emailError, bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
