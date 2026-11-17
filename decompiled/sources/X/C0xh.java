package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.0xh, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0xh extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ boolean $nextAvailable;
    public final /* synthetic */ Function0<Unit> $onNextClicked;
    public final /* synthetic */ Function0<Unit> $onPreviousClicked;
    public final /* synthetic */ Function0<Unit> $onYearPickerButtonClicked;
    public final /* synthetic */ boolean $previousAvailable;
    public final /* synthetic */ String $yearPickerText;
    public final /* synthetic */ boolean $yearPickerVisible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;ZLjava/lang/String;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;ZLkotlin/jvm/functions/Function0<Lkotlin/Unit;>;Z)V */
    public C0xh(String str, Function0 function0, Function0 function02, Function0 function03, boolean z, boolean z2, boolean z3) {
        super(2);
        this.$onYearPickerButtonClicked = function0;
        this.$yearPickerVisible = z;
        this.$yearPickerText = str;
        this.$onPreviousClicked = function02;
        this.$previousAvailable = z2;
        this.$onNextClicked = function03;
        this.$nextAvailable = z3;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfm2 = bfm;
        if (AnonymousClass005.A0D(num) == 2 && bfm2.AKh()) {
            bfm2.Afo();
        } else {
            C1XA.A0C(this.$onYearPickerButtonClicked, null, this.$yearPickerVisible, B1V.A00(bfm2, new C3UU(this.$yearPickerText, 1), 1377272806), bfm2, 3072, 4);
            if (!this.$yearPickerVisible) {
                Function0<Unit> function0 = this.$onPreviousClicked;
                boolean z = this.$previousAvailable;
                Function0<Unit> function02 = this.$onNextClicked;
                boolean z2 = this.$nextAvailable;
                BS0 bs0 = BRg.A00;
                InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm2, C2VU.A05, 0);
                BBI bbi = (BBI) bfm2;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm2, bs0);
                Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm2, bbi, function03);
                AnonymousClass003.A0o(bfm2, interfaceC1380AiAA00, akqA04);
                G0V<InterfaceC1516AkQ, Integer, Unit> g0v = C1515AkP.A03;
                if (bbi.A0M || !AnonymousClass007.A1K(bfm2, iA0J)) {
                    AnonymousClass006.A1U(g0v, bfm2, iA0J);
                }
                AnonymousClass001.A16(bfm2, bRgA01);
                C0xj.A00(null, null, bfm2, null, function0, AbstractC04761Xe.A02, 196608, 26, z);
                C0xj.A00(null, null, bfm2, null, function02, AbstractC04761Xe.A03, 196608, 26, z2);
                BBI.A0R(bbi, true);
            }
        }
        return Unit.INSTANCE;
    }
}
