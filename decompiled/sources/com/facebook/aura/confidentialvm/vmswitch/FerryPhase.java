package com.facebook.aura.confidentialvm.vmswitch;

import X.AnonymousClass001;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class FerryPhase {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FerryPhase[] $VALUES;
    public static final FerryPhase AWAITING_DEST;
    public static final FerryPhase AWAITING_SOURCE;
    public static final FerryPhase CANCELLED;
    public static final Companion Companion;
    public static final FerryPhase DONE;
    public static final FerryPhase EXPORTING;
    public static final FerryPhase FAILED;
    public static final FerryPhase HELD;
    public static final FerryPhase IMPORTING;
    public static final FerryPhase PINNING;
    public static final FerryPhase PREPARING;
    public static final FerryPhase RECOVERING;
    public static final FerryPhase SKIPPED;
    public static final FerryPhase STRANDED;
    public static final FerryPhase WAKING_SOURCE;
    public final boolean isFailed;
    public final String wireValue;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 2;
        C06H c06h = null;
        String str = "HELD";
        FerryPhase ferryPhase = new FerryPhase(str, 0, str, 0 == true ? 1 : 0, i, c06h);
        HELD = ferryPhase;
        String str2 = "WAKING_SOURCE";
        FerryPhase ferryPhase2 = new FerryPhase(str2, 1, str2, 0 == true ? 1 : 0, i, c06h);
        WAKING_SOURCE = ferryPhase2;
        String str3 = "PINNING";
        boolean z = false;
        FerryPhase ferryPhase3 = new FerryPhase(str3, i, str3, 0 == true ? 1 : 0, i, c06h);
        PINNING = ferryPhase3;
        String str4 = "AWAITING_DEST";
        FerryPhase ferryPhase4 = new FerryPhase(str4, 3, str4, z, i, c06h);
        AWAITING_DEST = ferryPhase4;
        String str5 = "PREPARING";
        FerryPhase ferryPhase5 = new FerryPhase(str5, 4, str5, z, i, c06h);
        PREPARING = ferryPhase5;
        String str6 = "AWAITING_SOURCE";
        FerryPhase ferryPhase6 = new FerryPhase(str6, 5, str6, z, i, c06h);
        AWAITING_SOURCE = ferryPhase6;
        String str7 = "EXPORTING";
        FerryPhase ferryPhase7 = new FerryPhase(str7, 6, str7, 0 == true ? 1 : 0, i, c06h);
        EXPORTING = ferryPhase7;
        String str8 = "IMPORTING";
        FerryPhase ferryPhase8 = new FerryPhase(str8, 7, str8, 0 == true ? 1 : 0, i, c06h);
        IMPORTING = ferryPhase8;
        String str9 = "RECOVERING";
        FerryPhase ferryPhase9 = new FerryPhase(str9, 8, str9, 0 == true ? 1 : 0, i, c06h);
        RECOVERING = ferryPhase9;
        String str10 = "DONE";
        FerryPhase ferryPhase10 = new FerryPhase(str10, 9, str10, 0 == true ? 1 : 0, i, c06h);
        DONE = ferryPhase10;
        FerryPhase ferryPhase11 = new FerryPhase("SKIPPED", 10, "SKIPPED", true);
        SKIPPED = ferryPhase11;
        FerryPhase ferryPhase12 = new FerryPhase(CvmMigrationStatusJson.STAGE_FAILED, 11, CvmMigrationStatusJson.STAGE_FAILED, true);
        FAILED = ferryPhase12;
        FerryPhase ferryPhase13 = new FerryPhase("CANCELLED", 12, "CANCELLED", true);
        CANCELLED = ferryPhase13;
        FerryPhase ferryPhase14 = new FerryPhase(CvmMigrationStatusJson.STAGE_STRANDED, 13, CvmMigrationStatusJson.STAGE_STRANDED, true);
        STRANDED = ferryPhase14;
        FerryPhase[] ferryPhaseArr = {ferryPhase, ferryPhase2, ferryPhase3, ferryPhase4, ferryPhase5, ferryPhase6, ferryPhase7, ferryPhase8, ferryPhase9, ferryPhase10, ferryPhase11, ferryPhase12, ferryPhase13, ferryPhase14};
        $VALUES = ferryPhaseArr;
        $ENTRIES = C3cG.A0w(ferryPhaseArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final FerryPhase fromWire(String str) {
            FerryPhase next;
            Iterator<FerryPhase> it = FerryPhase.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.getWireValue(), str)) {
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

    public static Ey9<FerryPhase> getEntries() {
        return $ENTRIES;
    }

    public static FerryPhase valueOf(String str) {
        return (FerryPhase) Enum.valueOf(FerryPhase.class, str);
    }

    public static FerryPhase[] values() {
        return (FerryPhase[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public final boolean isFailed() {
        return this.isFailed;
    }

    public FerryPhase(String str, int i, String str2, boolean z) {
        this.wireValue = str2;
        this.isFailed = z;
    }

    public /* synthetic */ FerryPhase(String str, int i, String str2, boolean z, int i2, C06H c06h) {
        this(str, i, str2, AnonymousClass001.A1Q(i2, z));
    }
}
