package com.facebook.aura.gateway;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchlingVmType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchlingVmType[] $VALUES;
    public static final Companion Companion;
    public static final HatchlingVmType HATCH_CVM;
    public static final HatchlingVmType HATCH_VM;
    public final String responseWire;
    public final int wire;

    public final class Companion {
        public final HatchlingVmType fromResponseWire(String str) {
            HatchlingVmType next;
            Iterator<HatchlingVmType> it = HatchlingVmType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.getResponseWire(), str)) {
                    break;
                }
            }
            return next;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        HatchlingVmType hatchlingVmType = new HatchlingVmType("HATCH_VM", 0, 1, "hatch_vm");
        HATCH_VM = hatchlingVmType;
        HatchlingVmType hatchlingVmType2 = new HatchlingVmType("HATCH_CVM", 1, 2, "hatch_cvm");
        HATCH_CVM = hatchlingVmType2;
        HatchlingVmType[] hatchlingVmTypeArr = {hatchlingVmType, hatchlingVmType2};
        $VALUES = hatchlingVmTypeArr;
        $ENTRIES = C3cG.A0w(hatchlingVmTypeArr);
        Companion = new Companion();
    }

    public static Ey9<HatchlingVmType> getEntries() {
        return $ENTRIES;
    }

    public static HatchlingVmType valueOf(String str) {
        return (HatchlingVmType) Enum.valueOf(HatchlingVmType.class, str);
    }

    public static HatchlingVmType[] values() {
        return (HatchlingVmType[]) $VALUES.clone();
    }

    public final String getResponseWire() {
        return this.responseWire;
    }

    public final int getWire() {
        return this.wire;
    }

    public HatchlingVmType(String str, int i, int i2, String str2) {
        this.wire = i2;
        this.responseWire = str2;
    }
}
