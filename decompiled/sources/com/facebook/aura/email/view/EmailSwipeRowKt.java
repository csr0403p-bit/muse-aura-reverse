package com.facebook.aura.email.view;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C06I;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C2VU;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.email.model.EmailSummary;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class EmailSwipeRowKt {

    /* renamed from: com.facebook.aura.email.view.EmailSwipeRowKt$EmailSwipeRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ EmailViewModel $model;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ EmailSummary $summary;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(EmailSummary emailSummary, EmailViewModel emailViewModel, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$summary = emailSummary;
            this.$model = emailViewModel;
            this.$modifier = bRg;
            this.$content = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            EmailSwipeRowKt.EmailSwipeRow(this.$summary, this.$model, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: EmailSwipeAction-cf5BqRc, reason: not valid java name */
    public static final void m756EmailSwipeActioncf5BqRc(int i, String str, long j, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-2119140577);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0O(bfm, j);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0D |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 1171, 1170), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA00 = C11U.A00(bRg2.then(C10G.A00));
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A02(C2VU.A04, 4.0f), bfm, C2VU.A00, 54);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, i, iA0D & 14), AuraIconSize.SMALL, null, j, null, bfm, AnonymousClass001.A0B(iA0D << 6, AnonymousClass001.A04()), 33);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, j, AnonymousClass002.A0f(bfm).caption1Emphasized, null, null, null, false, 0, 1, 1, null, null, null, bfm, AnonymousClass005.A01(iA0D >> 3) | (iA0D & 896), 6, 14834);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new EmailSwipeRowKt$EmailSwipeAction$2(i, str, j, bRg2, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void EmailSwipeRow(com.facebook.aura.email.model.EmailSummary r19, com.facebook.aura.email.viewmodel.EmailViewModel r20, X.BRg r21, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r22, X.BFM r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.view.EmailSwipeRowKt.EmailSwipeRow(com.facebook.aura.email.model.EmailSummary, com.facebook.aura.email.viewmodel.EmailViewModel, X.BRg, X.G0V, X.BFM, int, int):void");
    }
}
