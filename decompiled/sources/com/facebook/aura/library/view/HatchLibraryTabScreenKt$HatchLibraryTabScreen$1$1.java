package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.library.model.HatchPendingLibrarySegment;
import com.facebook.aura.library.model.LibrarySegment;

/* loaded from: classes.dex */
public final class HatchLibraryTabScreenKt$HatchLibraryTabScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<LibrarySegment> $pendingSegment$delegate;
    public final /* synthetic */ MutableState<Integer> $selectedTab$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchLibraryTabScreenKt$HatchLibraryTabScreen$1$1(C1BO<? extends LibrarySegment> c1bo, MutableState<Integer> mutableState) {
        super(1);
        this.$pendingSegment$delegate = c1bo;
        this.$selectedTab$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        C1BO<LibrarySegment> c1bo = this.$pendingSegment$delegate;
        int i = HatchLibraryTabScreenKt.ARTIFACTS_TAB_INDEX;
        LibrarySegment value = c1bo.getValue();
        if (value != null) {
            MutableState.A07(AnonymousClass002.A1Z(value, LibrarySegment.MEDIA) ? 1 : 0, this.$selectedTab$delegate);
            HatchPendingLibrarySegment.INSTANCE.consume();
        }
        return new C78g() { // from class: com.facebook.aura.library.view.HatchLibraryTabScreenKt$HatchLibraryTabScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
