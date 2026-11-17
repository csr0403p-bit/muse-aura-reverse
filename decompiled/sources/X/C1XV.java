package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.1XV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XV extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C1Wz $colors;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ boolean $nextAvailable;
    public final /* synthetic */ Function0<Unit> $onNextClicked;
    public final /* synthetic */ Function0<Unit> $onPreviousClicked;
    public final /* synthetic */ Function0<Unit> $onYearPickerButtonClicked;
    public final /* synthetic */ boolean $previousAvailable;
    public final /* synthetic */ String $yearPickerText;
    public final /* synthetic */ boolean $yearPickerVisible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/BRg;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/1Wz;I)V */
    public C1XV(C1Wz c1Wz, BRg bRg, String str, Function0 function0, Function0 function02, Function0 function03, int i, boolean z, boolean z2, boolean z3) {
        super(2);
        this.$modifier = bRg;
        this.$nextAvailable = z;
        this.$previousAvailable = z2;
        this.$yearPickerVisible = z3;
        this.$yearPickerText = str;
        this.$onNextClicked = function0;
        this.$onPreviousClicked = function02;
        this.$onYearPickerButtonClicked = function03;
        this.$colors = c1Wz;
        this.$$changed = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        BRg bRg = this.$modifier;
        boolean z = this.$nextAvailable;
        boolean z2 = this.$previousAvailable;
        boolean z3 = this.$yearPickerVisible;
        C1XA.A08(this.$colors, bfmA0P, bRg, this.$yearPickerText, this.$onNextClicked, this.$onPreviousClicked, this.$onYearPickerButtonClicked, AnonymousClass011.A00(this.$$changed), z, z2, z3);
        return Unit.INSTANCE;
    }
}
