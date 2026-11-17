package com.facebook.aura.ccv.nativeflow.ui;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3cG;
import com.facebook.aura.ccv.nativeflow.HatchLinkableAccountType;
import com.facebook.aura.user.provider.AgeCheckMethod;

/* loaded from: classes2.dex */
public abstract class HatchAgeLinkingKt {
    public static final AgeCheckMethod getAgeCheckMethod(HatchLinkableAccountType hatchLinkableAccountType) {
        int iA0E = AnonymousClass001.A0E(hatchLinkableAccountType, 0);
        if (iA0E == 1) {
            return AgeCheckMethod.FACEBOOK;
        }
        if (iA0E == 0) {
            return AgeCheckMethod.INSTAGRAM;
        }
        throw C3cG.A0q();
    }

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchLinkableAccountType.values().length];
            try {
                AnonymousClass002.A13(HatchLinkableAccountType.FACEBOOK, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchLinkableAccountType.INSTAGRAM, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
