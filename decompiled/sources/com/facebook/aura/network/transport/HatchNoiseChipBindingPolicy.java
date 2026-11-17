package com.facebook.aura.network.transport;

import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.C06H;
import com.facebook.aura.common.HatchCvmChipPinPurpose;
import java.util.List;

/* loaded from: classes5.dex */
public final class HatchNoiseChipBindingPolicy {
    public final HatchNoiseChipAuthorization authorization;
    public final HatchCvmChipPinPurpose purpose;
    public final List<String> selectedChipIds;

    public /* synthetic */ HatchNoiseChipBindingPolicy(HatchCvmChipPinPurpose hatchCvmChipPinPurpose, List list, HatchNoiseChipAuthorization hatchNoiseChipAuthorization, int i, C06H c06h) {
        this(hatchCvmChipPinPurpose, list, (i & 4) != 0 ? null : hatchNoiseChipAuthorization);
    }

    public final HatchNoiseChipAuthorization getAuthorization() {
        return this.authorization;
    }

    public final HatchCvmChipPinPurpose getPurpose() {
        return this.purpose;
    }

    public final List<String> getSelectedChipIds() {
        return this.selectedChipIds;
    }

    public HatchNoiseChipBindingPolicy(HatchCvmChipPinPurpose hatchCvmChipPinPurpose, List<String> list, HatchNoiseChipAuthorization hatchNoiseChipAuthorization) {
        AnonymousClass003.A0u(hatchCvmChipPinPurpose, list);
        this.purpose = hatchCvmChipPinPurpose;
        this.authorization = hatchNoiseChipAuthorization;
        this.selectedChipIds = AbstractC0878AGe.A0X(list);
    }
}
