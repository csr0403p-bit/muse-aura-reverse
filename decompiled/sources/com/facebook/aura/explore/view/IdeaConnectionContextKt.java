package com.facebook.aura.explore.view;

import X.AHD;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BOD;
import X.BRg;
import X.C06G;
import X.C0881AGi;
import X.C1BO;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.CH0;
import X.FGI;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.explore.view.IdeaConnectionNamesViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class IdeaConnectionContextKt {

    /* renamed from: com.facebook.aura.explore.view.IdeaConnectionContextKt$IdeaConnectionContext$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<String> $connectionIds;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AHD<String> ahd, BRg bRg, int i, int i2) {
            super(2);
            this.$connectionIds = ahd;
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
            IdeaConnectionContextKt.IdeaConnectionContext(this.$connectionIds, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.explore.view.IdeaConnectionContextKt$IdeaConnectionContext$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<String> $connectionIds;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AHD<String> ahd, BRg bRg, int i, int i2) {
            super(2);
            this.$connectionIds = ahd;
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
            IdeaConnectionContextKt.IdeaConnectionContext(this.$connectionIds, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void IdeaConnectionContext(AHD<String> ahd, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass3;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass1;
        int i3;
        Object[] objArr;
        String strA02;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(ahd, 0);
        bfm.AgG(-689219247);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, ahd) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (ahd.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass1 = new AnonymousClass1(ahd, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass1;
                }
                return;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            String strA0M = FGI.A0M("idea-connection-names:", ((CH0) abstractC3358CGzA0h).A01);
            IdeaConnectionNamesViewModel.Factory factory = new IdeaConnectionNamesViewModel.Factory(abstractC3358CGzA0h);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            IdeaConnectionNamesViewModel ideaConnectionNamesViewModel = (IdeaConnectionNamesViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), IdeaConnectionNamesViewModel.class, strA0M);
            boolean zA67 = bfm.A67(ideaConnectionNamesViewModel) | AnonymousClass003.A1B(iA0d);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new IdeaConnectionContextKt$IdeaConnectionContext$2$1(ideaConnectionNamesViewModel, ahd);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A19(bfm, objAaT, ideaConnectionNamesViewModel, ahd);
            List list = (List) ((Map) C1BO.A07(bfm, ideaConnectionNamesViewModel.names)).get(ahd);
            if (list == null) {
                list = C0881AGi.A00;
            }
            int size = list.size();
            if (size == 0) {
                AnonymousClass003.A0l(bfm, 1708695819);
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new IdeaConnectionContextKt$IdeaConnectionContext$text$1(ahd, bRg2, i, i2);
                    anonymousClass1 = anonymousClass3;
                    bBbAAc.A06 = anonymousClass1;
                }
                return;
            }
            if (size == 1) {
                bfm.AgE(-914711406);
                i3 = R.string._name_removed__res_0x7f120260;
                objArr = new Object[]{list.get(0)};
            } else if (size != 2) {
                bfm.AgE(-914705429);
                strA02 = AbstractC2271BQs.A00(R.plurals._name_removed__res_0x7f10000b, new Object[]{list.get(0), Integer.valueOf(list.size() - 1)}, bfm, list.size() - 1);
                AnonymousClass001.A1D(bfm);
                AuraTextKt.m2639AuraTextUY9GdpU(strA02, bRg2, C06G.A08(bfm), C06G.A0Y(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0, 16368);
            } else {
                bfm.AgE(-914708868);
                i3 = R.string._name_removed__res_0x7f120261;
                objArr = new Object[]{list.get(0), list.get(1)};
            }
            strA02 = AbstractC2271BQs.A02(bfm, objArr, i3);
            AnonymousClass001.A1D(bfm);
            AuraTextKt.m2639AuraTextUY9GdpU(strA02, bRg2, C06G.A08(bfm), C06G.A0Y(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0, 16368);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(ahd, bRg2, i, i2);
            anonymousClass1 = anonymousClass3;
            bBbAAc.A06 = anonymousClass1;
        }
    }

    public static final BO6<List<String>, AHD<String>> IdeaConnectionContext$lambda$1(C1BO<? extends BO6<List<String>, ? extends AHD<String>>> c1bo) {
        return (BO6) c1bo.getValue();
    }
}
