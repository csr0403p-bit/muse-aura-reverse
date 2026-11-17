package com.facebook.aura.tabs;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.spaces.repo.PinnedItemsRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.tabs.AuraSidePanelTabsKt$AuraSidePanelTabs$moveSpaceToLibrary$1", f = "AuraSidePanelTabs.kt", l = {275}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AuraSidePanelTabsKt$AuraSidePanelTabs$moveSpaceToLibrary$1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
    public final /* synthetic */ PinnedItemsRepository $pinnedItemsRepository;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSidePanelTabsKt$AuraSidePanelTabs$moveSpaceToLibrary$1(PinnedItemsRepository pinnedItemsRepository, HtJ<? super AuraSidePanelTabsKt$AuraSidePanelTabs$moveSpaceToLibrary$1> htJ) {
        super(1, htJ);
        this.$pinnedItemsRepository = pinnedItemsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new AuraSidePanelTabsKt$AuraSidePanelTabs$moveSpaceToLibrary$1(this.$pinnedItemsRepository, htJ);
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super Unit> htJ) {
        return new AuraSidePanelTabsKt$AuraSidePanelTabs$moveSpaceToLibrary$1(this.$pinnedItemsRepository, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            PinnedItemsRepository pinnedItemsRepository = this.$pinnedItemsRepository;
            this.label = 1;
            if (pinnedItemsRepository.m2183refreshNavigationOrderIoAF18A(this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }
}
