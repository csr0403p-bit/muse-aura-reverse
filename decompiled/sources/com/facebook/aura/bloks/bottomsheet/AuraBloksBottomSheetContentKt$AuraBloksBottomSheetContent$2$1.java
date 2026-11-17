package com.facebook.aura.bloks.bottomsheet;

import X.AbstractC1532Ako;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C07C;
import X.C10G;
import X.C3U4;
import X.C3UX;
import X.C78N;
import X.C8j4;
import X.G0U;
import X.G0W;
import android.content.Context;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraBloksBottomSheetContentKt$AuraBloksBottomSheetContent$2$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ AuraBloksBottomSheetData $bottomSheetData;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C3UX $coroutine;
    public final /* synthetic */ Function0<Unit> $onDismissRequest;
    public final /* synthetic */ AuraSheetState $sheetState;
    public final /* synthetic */ AuraBloksBottomSheetStateHolder $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBloksBottomSheetContentKt$AuraBloksBottomSheetContent$2$1(AuraBloksBottomSheetStateHolder auraBloksBottomSheetStateHolder, C3UX c3ux, AuraSheetState auraSheetState, Function0<Unit> function0, AuraBloksBottomSheetData auraBloksBottomSheetData, Context context) {
        super(3);
        this.$viewModel = auraBloksBottomSheetStateHolder;
        this.$coroutine = c3ux;
        this.$sheetState = auraSheetState;
        this.$onDismissRequest = function0;
        this.$bottomSheetData = auraBloksBottomSheetData;
        this.$context = context;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            bfm.Afo();
            return;
        }
        boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismissRequest, AnonymousClass001.A1R(bfm, this.$sheetState, AnonymousClass001.A1T(bfm, this.$coroutine, bfm.A67(this.$viewModel))));
        AuraBloksBottomSheetStateHolder auraBloksBottomSheetStateHolder = this.$viewModel;
        C3UX c3ux = this.$coroutine;
        Function0<Unit> function0 = this.$onDismissRequest;
        AuraSheetState auraSheetState = this.$sheetState;
        Object objAaT = bfm.AaT();
        if (zA1R || objAaT == C78N.A00) {
            objAaT = new AuraBloksBottomSheetContentKt$AuraBloksBottomSheetContent$2$1$1$1(auraBloksBottomSheetStateHolder, c3ux, function0, auraSheetState);
            BBI.A0T(bfm, objAaT);
        }
        AuraBloksBottomSheetContentKt.AuraBloksBottomSheetHeader((Function0) objAaT, this.$bottomSheetData.header, bfm, AuraBloksBottomSheetHeaderData.$stable << 3);
        BRg bRgA07 = C3U4.A07(C10G.A02, C8j4.A01(bfm));
        boolean zA1T = AnonymousClass001.A1T(bfm, this.$bottomSheetData, bfm.A67(this.$context));
        Context context = this.$context;
        AuraBloksBottomSheetData auraBloksBottomSheetData = this.$bottomSheetData;
        Object objAaT2 = bfm.AaT();
        if (zA1T || objAaT2 == C78N.A00) {
            objAaT2 = new AuraBloksBottomSheetContentKt$AuraBloksBottomSheetContent$2$1$2$1(context, auraBloksBottomSheetData);
            BBI.A0T(bfm, objAaT2);
        }
        G0U g0u = (G0U) objAaT2;
        boolean zA1T2 = AnonymousClass001.A1T(bfm, this.$context, bfm.A67(this.$bottomSheetData));
        AuraBloksBottomSheetData auraBloksBottomSheetData2 = this.$bottomSheetData;
        Context context2 = this.$context;
        Object objAaT3 = bfm.AaT();
        if (zA1T2 || objAaT3 == C78N.A00) {
            objAaT3 = new AuraBloksBottomSheetContentKt$AuraBloksBottomSheetContent$2$1$3$1(auraBloksBottomSheetData2, context2);
            BBI.A0T(bfm, objAaT3);
        }
        AbstractC1532Ako.A02(bfm, bRgA07, g0u, (G0U) objAaT3, 0, 0);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
