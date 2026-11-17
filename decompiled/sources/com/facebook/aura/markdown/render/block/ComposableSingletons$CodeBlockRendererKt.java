package com.facebook.aura.markdown.render.block;

import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.B1V;
import X.BFM;
import X.BOf;
import X.C06G;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.button.IconContext;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$CodeBlockRendererKt {
    public static final ComposableSingletons$CodeBlockRendererKt INSTANCE = new ComposableSingletons$CodeBlockRendererKt();

    /* renamed from: lambda$-749320894, reason: not valid java name */
    public static G0W<IconContext, BFM, Integer, Unit> f82lambda$749320894 = B1V.A01(new G0W() { // from class: com.facebook.aura.markdown.render.block.ComposableSingletons$CodeBlockRendererKt$$ExternalSyntheticLambda0
        @Override // X.G0W
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CodeBlockRendererKt.lambda__749320894$lambda$0((IconContext) obj, (BFM) obj2, AnonymousClass001.A0F(obj3));
        }
    }, -749320894, false);

    public static final Unit lambda__749320894$lambda$0(IconContext iconContext, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.copy_wght400_outline_24, 0), AuraIconSize.X_SMALL, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ac3), C06G.A06(bfm), null, bfm, AnonymousClass001.A03(), 33);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: getLambda$-749320894$fbandroid_express_aura_java_com_facebook_aura_markdown_render_render, reason: not valid java name */
    public final G0W<IconContext, BFM, Integer, Unit> m1421xa4626438() {
        return f82lambda$749320894;
    }
}
