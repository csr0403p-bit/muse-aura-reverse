package com.facebook.aura.tabs;

import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AvW;
import X.C00q;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.tabs.AuraSidePanelTabsKt$AuraSidePanelTabs$1$1", f = "AuraSidePanelTabs.kt", l = {180}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AuraSidePanelTabsKt$AuraSidePanelTabs$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C00q $dragOffsetY$delegate;
    public final /* synthetic */ boolean $orderCommitted;
    public final /* synthetic */ MutableState<String> $pendingDraggedItemId$delegate;
    public final /* synthetic */ MutableState<AHD<String>> $preDropOrder$delegate;
    public final /* synthetic */ MutableState<Integer> $preDropTabCount$delegate;
    public int label;

    /* renamed from: com.facebook.aura.tabs.AuraSidePanelTabsKt$AuraSidePanelTabs$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Long, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            return AnonymousClass001.A0x(l);
        }

        public final void invoke(long j) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSidePanelTabsKt$AuraSidePanelTabs$1$1(boolean z, C00q c00q, MutableState<AHD<String>> mutableState, MutableState<Integer> mutableState2, MutableState<String> mutableState3, HtJ<? super AuraSidePanelTabsKt$AuraSidePanelTabs$1$1> htJ) {
        super(2, htJ);
        this.$orderCommitted = z;
        this.$dragOffsetY$delegate = c00q;
        this.$preDropOrder$delegate = mutableState;
        this.$preDropTabCount$delegate = mutableState2;
        this.$pendingDraggedItemId$delegate = mutableState3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraSidePanelTabsKt$AuraSidePanelTabs$1$1(this.$orderCommitted, this.$dragOffsetY$delegate, this.$preDropOrder$delegate, this.$preDropTabCount$delegate, this.$pendingDraggedItemId$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$orderCommitted) {
                AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
                this.label = 1;
                if (AvW.A01(anonymousClass1, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.$dragOffsetY$delegate.AdS(0.0f);
        this.$preDropOrder$delegate.Af8(null);
        this.$preDropTabCount$delegate.Af8(null);
        this.$pendingDraggedItemId$delegate.Af8(null);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AuraSidePanelTabsKt$AuraSidePanelTabs$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
