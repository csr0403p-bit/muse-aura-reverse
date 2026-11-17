package com.facebook.aura.vds.compose.bottomsheet.wrapper;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BA3;
import X.BFM;
import X.BRg;
import X.C07C;
import X.G0V;
import X.G0W;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraModalBottomSheetWrapperKt$AuraModalBottomSheetWrapper$5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $containerColor;
    public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
    public final /* synthetic */ boolean $hideScrim;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onDismissRequest;
    public final /* synthetic */ boolean $preventKeyboardResize;
    public final /* synthetic */ BA3 $properties;
    public final /* synthetic */ AuraSheetState $sheetState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraModalBottomSheetWrapperKt$AuraModalBottomSheetWrapper$5(BRg bRg, Function0<Unit> function0, BA3 ba3, AuraSheetState auraSheetState, long j, boolean z, boolean z2, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
        super(2);
        this.$modifier = bRg;
        this.$onDismissRequest = function0;
        this.$properties = ba3;
        this.$sheetState = auraSheetState;
        this.$containerColor = j;
        this.$hideScrim = z;
        this.$preventKeyboardResize = z2;
        this.$content = g0w;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraModalBottomSheetWrapperKt.m2406AuraModalBottomSheetWrapperNpZTi58(this.$modifier, this.$onDismissRequest, this.$properties, this.$sheetState, this.$containerColor, this.$hideScrim, this.$preventKeyboardResize, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
