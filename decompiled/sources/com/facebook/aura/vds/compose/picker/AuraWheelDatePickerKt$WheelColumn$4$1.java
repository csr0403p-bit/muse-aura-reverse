package com.facebook.aura.vds.compose.picker;

import X.AHD;
import X.Ab3;
import X.AbstractC0878AGe;
import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1BO;
import X.C2Cx;
import X.C2Cy;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC0857A6e;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraWheelDatePickerKt$WheelColumn$4$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ C1BO<G0U<Integer, Unit>> $currentOnSelected;
    public final /* synthetic */ AHD<Integer> $items;
    public final /* synthetic */ G0U<Integer, String> $label;
    public final /* synthetic */ int $selected;
    public final /* synthetic */ int $selectedIndex;

    /* renamed from: com.facebook.aura.vds.compose.picker.AuraWheelDatePickerKt$WheelColumn$4$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Float, Boolean> {
        public final /* synthetic */ C1BO<G0U<Integer, Unit>> $currentOnSelected;
        public final /* synthetic */ AHD<Integer> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AHD<Integer> ahd, C1BO<? extends G0U<? super Integer, Unit>> c1bo) {
            super(1);
            this.$items = ahd;
            this.$currentOnSelected = c1bo;
        }

        public final Boolean invoke(float f) {
            boolean z;
            Object objA0A = AbstractC0878AGe.A0A(Ab3.A01(f), this.$items);
            if (objA0A != null) {
                C1BO.A0B(this.$currentOnSelected).invoke(objA0A);
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(Float f) {
            return invoke(AnonymousClass001.A02(f));
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        AbstractC1564Ale.A08(interfaceC0857A6e, this.$contentDescription);
        AbstractC1564Ale.A09(interfaceC0857A6e, this.$label.invoke(Integer.valueOf(this.$selected)));
        C2Cx c2Cx = C2Cx.A03;
        float f = this.$selectedIndex;
        C2Cy c2Cy = new C2Cy(0.0f, AnonymousClass002.A0E(this.$items));
        int size = this.$items.size() - 2;
        if (size < 0) {
            size = 0;
        }
        AbstractC1564Ale.A01(new C2Cx(c2Cy, f, size), interfaceC0857A6e);
        AbstractC1564Ale.A0D(interfaceC0857A6e, new AnonymousClass1(this.$items, this.$currentOnSelected));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraWheelDatePickerKt$WheelColumn$4$1(String str, G0U<? super Integer, String> g0u, int i, int i2, AHD<Integer> ahd, C1BO<? extends G0U<? super Integer, Unit>> c1bo) {
        super(1);
        this.$contentDescription = str;
        this.$label = g0u;
        this.$selected = i;
        this.$selectedIndex = i2;
        this.$items = ahd;
        this.$currentOnSelected = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
