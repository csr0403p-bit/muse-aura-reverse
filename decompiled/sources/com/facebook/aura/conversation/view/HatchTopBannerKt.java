package com.facebook.aura.conversation.view;

import X.ANR;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.conversation.widget.api.ConversationComposerStatusContext;
import com.facebook.aura.conversation.widget.api.ConversationTimelineSurface;
import com.facebook.aura.conversation.widget.api.ConversationTopBanner;
import com.facebook.aura.conversation.widget.api.ConversationTopBanners;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class HatchTopBannerKt {

    /* renamed from: com.facebook.aura.conversation.view.HatchTopBannerKt$HatchTopBanner$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $conversationId;
        public final /* synthetic */ boolean $isSuppressed;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$conversationId = str;
            this.$isSuppressed = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchTopBannerKt.HatchTopBanner(this.$conversationId, this.$isSuppressed, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchTopBanner(String str, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(546229620);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h) | AnonymousClass001.A1M(iA0d);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new ConversationComposerStatusContext(abstractC3358CGzA0h, str, str.equals("primary_session_id"), ConversationTimelineSurface.MAIN_CHAT);
                bfm.Ai0(objAaT);
            }
            ConversationComposerStatusContext conversationComposerStatusContext = (ConversationComposerStatusContext) objAaT;
            Object objA0p = AnonymousClass001.A0p(bfm, 940672604);
            Object obj = C78N.A00;
            if (objA0p == obj) {
                objA0p = ConversationTopBanners.INSTANCE.banners();
                bfm.Ai0(objA0p);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (List) objA0p) {
                if (((ConversationTopBanner) obj2).rememberIsVisible(conversationComposerStatusContext, bfm, ConversationComposerStatusContext.$stable)) {
                    arrayList.add(obj2);
                }
            }
            AnonymousClass001.A1D(bfm);
            Object objA0G = AbstractC0878AGe.A0G(arrayList);
            if (objA0G == null || z) {
                objA0G = null;
            }
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = HatchTopBannerKt$HatchTopBanner$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            G0U g0u = (G0U) objAaT2;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = HatchTopBannerKt$HatchTopBanner$3$1.INSTANCE;
                bfm.Ai0(objAaT3);
            }
            ANR.A02(bfm, null, bRg2, objA0G, "top_banner", g0u, (G0U) objAaT3, ComposableSingletons$HatchTopBannerKt.lambda$1612865435, ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 1794432, 8);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(str, z, bRg2, i, i2);
        }
    }
}
