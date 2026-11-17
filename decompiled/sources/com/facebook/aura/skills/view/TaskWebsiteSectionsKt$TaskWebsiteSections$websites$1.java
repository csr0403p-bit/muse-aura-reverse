package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import com.facebook.aura.skills.viewmodel.TaskPermissionsUiState;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class TaskWebsiteSectionsKt$TaskWebsiteSections$websites$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onRevoke;
    public final /* synthetic */ TaskPermissionsUiState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TaskWebsiteSectionsKt$TaskWebsiteSections$websites$1(TaskPermissionsUiState taskPermissionsUiState, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
        super(2);
        this.$state = taskPermissionsUiState;
        this.$onRevoke = g0u;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        TaskWebsiteSectionsKt.TaskWebsiteSections(this.$state, this.$onRevoke, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
