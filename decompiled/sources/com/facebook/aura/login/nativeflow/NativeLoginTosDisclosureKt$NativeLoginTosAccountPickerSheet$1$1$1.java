package com.facebook.aura.login.nativeflow;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class NativeLoginTosDisclosureKt$NativeLoginTosAccountPickerSheet$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ AHD<NativeLoginAccountUiModel> $accounts;
    public final /* synthetic */ G0U<NativeLoginAccountUiModel, Unit> $onSelect;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AHD<NativeLoginAccountUiModel> ahd = this.$accounts;
        G0U<NativeLoginAccountUiModel, Unit> g0u = this.$onSelect;
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            AnonymousClass006.A1E(hatchSectionScope, new NativeLoginTosDisclosureKt$NativeLoginTosAccountPickerSheet$1$1$1$1$1((NativeLoginAccountUiModel) it.next(), g0u), 347939950);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginTosDisclosureKt$NativeLoginTosAccountPickerSheet$1$1$1(AHD<NativeLoginAccountUiModel> ahd, G0U<? super NativeLoginAccountUiModel, Unit> g0u) {
        super(1);
        this.$accounts = ahd;
        this.$onSelect = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
