package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3cG;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.ccv.nativeflow.HatchLinkableAccountType;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$21$1 extends AbstractC7559F3s implements G0U<HatchLinkableAccountType, Unit> {
    public final /* synthetic */ HatchAgeLinkingViewModel $linking;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchLinkableAccountType hatchLinkableAccountType) {
        HatchComponent hatchComponent;
        int iA0E = AnonymousClass001.A0E(hatchLinkableAccountType, 0);
        if (iA0E == 0) {
            hatchComponent = HatchComponent.CONTINUE_WITH_INSTAGRAM;
        } else {
            if (iA0E != 1) {
                throw C3cG.A0q();
            }
            hatchComponent = HatchComponent.CONTINUE_WITH_FACEBOOK;
        }
        HatchCcvCardEntryHostKt.logCcvClick(hatchComponent);
        this.$linking.start(hatchLinkableAccountType, false);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchLinkableAccountType.values().length];
            try {
                AnonymousClass002.A13(HatchLinkableAccountType.INSTAGRAM, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchLinkableAccountType.FACEBOOK, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$21$1(HatchAgeLinkingViewModel hatchAgeLinkingViewModel) {
        super(1);
        this.$linking = hatchAgeLinkingViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchLinkableAccountType hatchLinkableAccountType) {
        invoke2(hatchLinkableAccountType);
        return Unit.INSTANCE;
    }
}
