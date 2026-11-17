package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.BRg;
import X.C0Ig;
import X.C10G;
import X.C1BO;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import android.content.Context;
import com.facebook.aura.email.model.EmailRestrictionNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailScreenKt$EmailSetupPrompt$1 extends AbstractC7559F3s implements G0W<C0Ig, BFM, Integer, Unit> {
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C1BO<String> $name$delegate;
    public final /* synthetic */ Function0<Unit> $onCreate;
    public final /* synthetic */ EmailRestrictionNotice $takenDownNotice;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailScreenKt$EmailSetupPrompt$1(EmailRestrictionNotice emailRestrictionNotice, Function0<Unit> function0, Context context, float f, float f2, C1BO<String> c1bo) {
        super(3);
        this.$takenDownNotice = emailRestrictionNotice;
        this.$onCreate = function0;
        this.$context = context;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$name$delegate = c1bo;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C0Ig c0Ig, BFM bfm, Integer num) {
        invoke(c0Ig, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C0Ig c0Ig, BFM bfm, int i) {
        C7384Etj.A0Y(c0Ig, 0);
        if ((i & 6) == 0) {
            i |= AnonymousClass004.A0d(bfm, c0Ig);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 19, 18), bfm, i)) {
            String strA08 = C1BO.A08(this.$name$delegate);
            EmailRestrictionNotice emailRestrictionNotice = this.$takenDownNotice;
            Function0<Unit> function0 = this.$onCreate;
            if (function0 == null) {
                bfm.AgE(-135599561);
                boolean zA67 = bfm.A67(this.$context);
                Context context = this.$context;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new EmailScreenKt$EmailSetupPrompt$1$1$1(context);
                    bfm.Ai0(objAaT);
                }
                function0 = (Function0) objAaT;
            } else {
                bfm.AgE(-1666943033);
            }
            AnonymousClass001.A1D(bfm);
            BRg bRgA0U = AnonymousClass001.A0U(AnonymousClass005.A0T(bfm, C10G.A02), c0Ig.AHP());
            float f = this.$topPadding;
            EmailScreenKt.EmailSetupPromptContent(strA08, emailRestrictionNotice, function0, C3U4.A0C(bRgA0U, 32.0f, f + 16.0f, 32.0f, this.$bottomPadding + f + 16.0f), bfm, 0, 0);
            return;
        }
        bfm.Afo();
    }
}
