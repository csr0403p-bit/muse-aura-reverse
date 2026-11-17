package com.facebook.aura.conversation.view;

import X.AKQ;
import X.AbstractC1913AtY;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C1515AkP;
import X.C7384Etj;
import X.F60;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.conversation.view.richcontent.MessageSenderSemanticsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageBubbleContentKt$HatchMessageContent$3 extends AbstractC7559F3s implements G2j<BRg, Boolean, BFM, Integer, Unit> {
    public final /* synthetic */ String $sender;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $textContent;

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageBubbleContentKt$HatchMessageContent$3$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $textContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0V<? super BFM, ? super Integer, Unit> g0v) {
            super(2);
            this.$textContent = g0v;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AnonymousClass006.A1Q(bfm, this.$textContent);
            } else {
                bfm.Afo();
            }
        }
    }

    public final void invoke(BRg bRg, boolean z, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            bfm.Afo();
            return;
        }
        BRg bRgMessageSenderSemantics = MessageSenderSemanticsKt.messageSenderSemantics(bRg, this.$sender);
        if (z) {
            bfm.AgE(-1660570963);
            AbstractC1913AtY.A01(bRgMessageSenderSemantics, B1V.A00(bfm, new AnonymousClass1(this.$textContent), 853718437), bfm, 48, 0);
        } else {
            bfm.AgE(-1660484132);
            G0V<BFM, Integer, Unit> g0v = this.$textContent;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgMessageSenderSemantics);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            AnonymousClass006.A1Q(bfm, g0v);
            BBI.A0R(bbi, true);
        }
        AnonymousClass001.A1D(bfm);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageBubbleContentKt$HatchMessageContent$3(String str, G0V<? super BFM, ? super Integer, Unit> g0v) {
        super(4);
        this.$sender = str;
        this.$textContent = g0v;
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, Boolean bool, BFM bfm, Integer num) {
        invoke(bRg, AnonymousClass001.A1X(bool), bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
