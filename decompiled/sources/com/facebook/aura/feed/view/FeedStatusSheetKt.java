package com.facebook.aura.feed.view;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C07C;
import X.C1515AkP;
import X.C1BO;
import X.C2CK;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.icu.text.DateFormat;
import com.facebook.aura.R;
import com.facebook.aura.feed.model.FeedViewModel;
import com.facebook.aura.feed.repo.FeedStatus;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class FeedStatusSheetKt {
    public static final float StatusRowGap = 8.0f;
    public static final float StatusRowsGap = 10.0f;
    public static final float TitleBodyGap = 10.0f;

    /* renamed from: com.facebook.aura.feed.view.FeedStatusSheetKt$FeedStatusSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $generateErrorMessage;
        public final /* synthetic */ boolean $isGenerating;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ FeedStatus $status;
        public final /* synthetic */ FeedViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FeedStatus feedStatus, boolean z, FeedViewModel feedViewModel, AuraNavigator auraNavigator, Context context, String str) {
            super(3);
            this.$status = feedStatus;
            this.$isGenerating = z;
            this.$viewModel = feedViewModel;
            this.$navigator = auraNavigator;
            this.$context = context;
            this.$generateErrorMessage = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0100 A[PHI: r12
  0x0100: PHI (r12v6 java.lang.Long) = (r12v3 java.lang.Long), (r12v7 java.lang.Long) binds: [B:44:0x026a, B:13:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x010c A[PHI: r12
  0x010c: PHI (r12v4 java.lang.Long) = (r12v3 java.lang.Long), (r12v6 java.lang.Long), (r12v6 java.lang.Long) binds: [B:44:0x026a, B:15:0x0102, B:17:0x010a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0147  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.C07C r52, X.BFM r53, int r54) {
            /*
                Method dump skipped, instructions count: 626
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.view.FeedStatusSheetKt.AnonymousClass2.invoke(X.07C, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedStatusSheetKt$FeedStatusSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FeedViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(FeedViewModel feedViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = feedViewModel;
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
            FeedStatusSheetKt.FeedStatusSheet(this.$viewModel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: FeedStatusRow-sW7UJKQ, reason: not valid java name */
    public static final void m825FeedStatusRowsW7UJKQ(int i, long j, String str, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-51388852);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0N(bfm, j);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, str);
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
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0L = AnonymousClass007.A0L(bfm, StatusRowGap);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0L, akqA04, bRgA01, iA0J);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, i, iA0D & 14), AuraIconSize.TINY, null, j, null, bfm, AnonymousClass001.A0B(iA0D << 9, AnonymousClass001.A04()), 33);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A08(bfm), C06G.A0Z(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0D >> 6) & 14, 0, 16370);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new FeedStatusSheetKt$FeedStatusRow$2(i, j, str, bRg2, i2, i3);
        }
    }

    public static final void FeedStatusSheet(FeedViewModel feedViewModel, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(feedViewModel, 0);
        bfm.AgG(-1066975512);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(feedViewModel, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean z = true;
            C1BO c1boA02 = C2CK.A02(bfm, feedViewModel.uiState);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            FeedStatus feedStatus = ((FeedViewModel.FeedUiState) c1boA02.getValue()).status;
            if (!((FeedViewModel.FeedUiState) c1boA02.getValue()).isRegenerating && (feedStatus == null || !feedStatus.refreshInProgress)) {
                z = false;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b19);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new FeedStatusSheetKt$FeedStatusSheet$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(null, bRg2, null, null, null, null, (Function0) objAaT, false, false, false, null, B1V.A00(bfm, new AnonymousClass2(feedStatus, z, feedViewModel, auraNavigatorA0b, contextA0H, strA01), -64747035), bfm, iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 48, 1981);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(feedViewModel, bRg2, i, i2);
        }
    }

    public static final String formatFeedStatusTime(long j) {
        String str = DateFormat.getInstanceForSkeleton("jmm", Locale.getDefault()).format(new Date(j));
        C7384Etj.A0U(str);
        return str;
    }
}
