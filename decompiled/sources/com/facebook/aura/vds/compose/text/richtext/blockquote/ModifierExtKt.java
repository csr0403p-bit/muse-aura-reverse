package com.facebook.aura.vds.compose.text.richtext.blockquote;

import X.AEk;
import X.AT3;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.BRg;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class ModifierExtKt {

    /* renamed from: com.facebook.aura.vds.compose.text.richtext.blockquote.ModifierExtKt$draw$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
        public final /* synthetic */ AuraBlockQuoteDecoration $decoration;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AT3 at3) {
            C7384Etj.A0Y(at3, 0);
            this.$decoration.drawAll$fbandroid_express_aura_java_com_facebook_aura_vds_compose_text_richtext_blockquote_blockquote(at3);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraBlockQuoteDecoration auraBlockQuoteDecoration) {
            super(1);
            this.$decoration = auraBlockQuoteDecoration;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
            invoke2(at3);
            return Unit.INSTANCE;
        }
    }

    public static final BRg draw(BRg bRg, AuraBlockQuoteDecoration auraBlockQuoteDecoration) {
        AnonymousClass003.A0u(bRg, auraBlockQuoteDecoration);
        return AEk.A01(bRg, new AnonymousClass1(auraBlockQuoteDecoration));
    }
}
