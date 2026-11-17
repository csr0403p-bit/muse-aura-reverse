package com.facebook.aura.library.view;

import X.AKQ;
import X.AbstractC07539Wl;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass037;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C10G;
import X.C1515AkP;
import X.C3U4;
import X.F60;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.library.repo.LoadingState;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchLibraryTabScreenKt$libraryEmptyStateItem$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public final /* synthetic */ float $gutterWidth;
    public final /* synthetic */ LoadingState $loadingState;
    public final /* synthetic */ int $subtitleRes;
    public final /* synthetic */ String $testTag;
    public final /* synthetic */ int $titleRes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLibraryTabScreenKt$libraryEmptyStateItem$1(LoadingState loadingState, int i, int i2, String str, float f) {
        super(3);
        this.$loadingState = loadingState;
        this.$titleRes = i;
        this.$subtitleRes = i2;
        this.$testTag = str;
        this.$gutterWidth = f;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            LoadingState loadingState = this.$loadingState;
            if (loadingState != LoadingState.LOADING && loadingState != LoadingState.INITIAL) {
                bfm.AgE(1241305791);
                HatchLibraryTabScreenKt.LibraryTabEmptyState(this.$titleRes, this.$subtitleRes, C3U4.A0B(C3U4.A0B(AbstractC07539Wl.A00(C10G.A02, this.$testTag), this.$gutterWidth, 0.0f), 0.0f, AuraDimensKt.SpacingMedium), bfm, 0, 0);
            } else {
                bfm.AgE(1241130610);
                BRg bRgA04 = C10G.A04(C10G.A02, 120.0f);
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA04);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
                AnonymousClass007.A0s(bfm, bbi);
            }
            AnonymousClass001.A1D(bfm);
            return;
        }
        bfm.Afo();
    }
}
