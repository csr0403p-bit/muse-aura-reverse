package com.facebook.aura.conversation.view.richcontent;

import X.AEk;
import X.AT3;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.BRg;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class BlockQuoteDecorationKt {

    /* renamed from: com.facebook.aura.conversation.view.richcontent.BlockQuoteDecorationKt$drawBlockQuote$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
        public final /* synthetic */ BlockQuoteDecoration $decoration;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AT3 at3) {
            C7384Etj.A0Y(at3, 0);
            this.$decoration.drawAll$fbandroid_express_aura_java_com_facebook_aura_conversation_view_richcontent_richcontent(at3);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BlockQuoteDecoration blockQuoteDecoration) {
            super(1);
            this.$decoration = blockQuoteDecoration;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
            invoke2(at3);
            return Unit.INSTANCE;
        }
    }

    public static final BRg drawBlockQuote(BRg bRg, BlockQuoteDecoration blockQuoteDecoration) {
        AnonymousClass003.A0u(bRg, blockQuoteDecoration);
        return AEk.A01(bRg, new AnonymousClass1(blockQuoteDecoration));
    }
}
