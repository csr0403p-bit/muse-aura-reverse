package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import com.facebook.aura.pairs.PairsHistoryUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class PairsHistoryScreenKt$PairsHistoryList$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onLoadOlder;
    public final /* synthetic */ Function0<Unit> $onRetryOlder;
    public final /* synthetic */ G0U<String, ConnectionsSharedLinkTarget> $sharedLinkTarget;
    public final /* synthetic */ PairsHistoryUiState.Ready $state;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PairsHistoryScreenKt$PairsHistoryList$2(PairsHistoryUiState.Ready ready, float f, float f2, ConnectionsLogContext connectionsLogContext, Function0<Unit> function0, Function0<Unit> function02, G0U<? super String, ConnectionsSharedLinkTarget> g0u, BRg bRg, int i, int i2) {
        super(2);
        this.$state = ready;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$log = connectionsLogContext;
        this.$onLoadOlder = function0;
        this.$onRetryOlder = function02;
        this.$sharedLinkTarget = g0u;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        PairsHistoryScreenKt.m1669PairsHistoryListeWuZFaY(this.$state, this.$topPadding, this.$bottomPadding, this.$log, this.$onLoadOlder, this.$onRetryOlder, this.$sharedLinkTarget, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
