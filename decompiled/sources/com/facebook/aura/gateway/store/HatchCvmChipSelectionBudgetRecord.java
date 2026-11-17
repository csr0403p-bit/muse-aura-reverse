package com.facebook.aura.gateway.store;

import X.AbstractC5321DgF;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.C9jH;
import X.F0C;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class HatchCvmChipSelectionBudgetRecord extends C06G {
    public final Map<String, List<HatchCvmDrawnChip>> byBucket;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {AbstractC5321DgF.A02(C79.A01, HatchCvmChipSelectionBudgetRecord$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<HatchCvmChipSelectionBudgetRecord> serializer() {
            return HatchCvmChipSelectionBudgetRecord$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final HatchCvmChipSelectionBudgetRecord copy(Map<String, ? extends List<HatchCvmDrawnChip>> map) {
        C7384Etj.A0Y(map, 0);
        return new HatchCvmChipSelectionBudgetRecord(map);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HatchCvmChipSelectionBudgetRecord) && C7384Etj.areEqual(this.byBucket, ((HatchCvmChipSelectionBudgetRecord) obj).byBucket));
    }

    public static /* synthetic */ HatchCvmChipSelectionBudgetRecord copy$default(HatchCvmChipSelectionBudgetRecord hatchCvmChipSelectionBudgetRecord, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = hatchCvmChipSelectionBudgetRecord.byBucket;
        }
        C7384Etj.A0Y(map, 0);
        return new HatchCvmChipSelectionBudgetRecord(map);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_store_store(HatchCvmChipSelectionBudgetRecord hatchCvmChipSelectionBudgetRecord, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || !C7384Etj.areEqual(hatchCvmChipSelectionBudgetRecord.byBucket, C9jH.A00)) {
            c9j5.AAQ(hatchCvmChipSelectionBudgetRecord.byBucket, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
    }

    public final Map<String, List<HatchCvmDrawnChip>> component1() {
        return this.byBucket;
    }

    public final Map<String, List<HatchCvmDrawnChip>> getByBucket() {
        return this.byBucket;
    }

    public int hashCode() {
        return this.byBucket.hashCode();
    }

    public /* synthetic */ HatchCvmChipSelectionBudgetRecord(int i, Map map, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.byBucket = C9jH.A00;
        } else {
            this.byBucket = map;
        }
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchCvmChipSelectionBudgetRecord(Map<String, ? extends List<HatchCvmDrawnChip>> map) {
        C7384Etj.A0Y(map, 0);
        this.byBucket = map;
    }

    public /* synthetic */ HatchCvmChipSelectionBudgetRecord(Map map, int i, C06H c06h) {
        this((i & 1) != 0 ? C9jH.A00 : map);
    }

    public HatchCvmChipSelectionBudgetRecord() {
        this(C9jH.A00);
    }
}
