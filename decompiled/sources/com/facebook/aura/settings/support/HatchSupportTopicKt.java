package com.facebook.aura.settings.support;

import X.AGI;
import X.AHD;
import X.AHH;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import com.facebook.aura.R;
import com.facebook.aura.settings.support.HatchSupportTopicLabel;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class HatchSupportTopicKt {
    public static final AHD<HatchSupportTopicOption> hatchFallbackSupportTopics;

    public static final int titleRes(HatchSupportTopic hatchSupportTopic) {
        int iA0E = AnonymousClass001.A0E(hatchSupportTopic, 0);
        if (iA0E == 0) {
            return R.string._name_removed__res_0x7f120845;
        }
        if (iA0E == 1) {
            return R.string._name_removed__res_0x7f120847;
        }
        if (iA0E == 2) {
            return R.string._name_removed__res_0x7f120846;
        }
        throw new NoWhenBranchMatchedException();
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchSupportTopic.values().length];
            try {
                AnonymousClass002.A13(HatchSupportTopic.ACCOUNT_ACCESS, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchSupportTopic.TECHNICAL_PROBLEM, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchSupportTopic.SAFETY_INTEGRITY_LEGAL, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        AHH<HatchSupportTopic> ahhA0E = AGI.A0E(HatchSupportTopic.ACCOUNT_ACCESS, HatchSupportTopic.TECHNICAL_PROBLEM, HatchSupportTopic.SAFETY_INTEGRITY_LEGAL);
        ArrayList arrayListA0i = AnonymousClass003.A0i(ahhA0E);
        for (HatchSupportTopic hatchSupportTopic : ahhA0E) {
            arrayListA0i.add(new HatchSupportTopicOption(hatchSupportTopic.getWireValue(), new HatchSupportTopicLabel.Resource(titleRes(hatchSupportTopic))));
        }
        hatchFallbackSupportTopics = AGI.A07(arrayListA0i);
    }

    public static final AHD<HatchSupportTopicOption> getHatchFallbackSupportTopics() {
        return hatchFallbackSupportTopics;
    }
}
