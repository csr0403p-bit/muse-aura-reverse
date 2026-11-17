package com.facebook.aura.survey;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.model.ReplyAttributionSerializer;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchSurveyKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchSurveyKind[] $VALUES;
    public static final Companion Companion;
    public static final HatchSurveyKind MESSAGE;
    public static final HatchSurveyKind NUMERIC_FIELD;
    public static final HatchSurveyKind RADIO;
    public static final HatchSurveyKind TEXT;
    public static final HatchSurveyKind UNKNOWN;
    public final String wireValue;

    static {
        HatchSurveyKind hatchSurveyKind = new HatchSurveyKind("RADIO", 0, "radio");
        RADIO = hatchSurveyKind;
        HatchSurveyKind hatchSurveyKind2 = new HatchSurveyKind("NUMERIC_FIELD", 1, "numeric_field");
        NUMERIC_FIELD = hatchSurveyKind2;
        HatchSurveyKind hatchSurveyKind3 = new HatchSurveyKind("TEXT", 2, "text");
        TEXT = hatchSurveyKind3;
        HatchSurveyKind hatchSurveyKind4 = new HatchSurveyKind("MESSAGE", 3, ReplyAttributionSerializer.TYPE_MESSAGE);
        MESSAGE = hatchSurveyKind4;
        HatchSurveyKind hatchSurveyKind5 = new HatchSurveyKind("UNKNOWN", 4, "");
        UNKNOWN = hatchSurveyKind5;
        HatchSurveyKind[] hatchSurveyKindArr = {hatchSurveyKind, hatchSurveyKind2, hatchSurveyKind3, hatchSurveyKind4, hatchSurveyKind5};
        $VALUES = hatchSurveyKindArr;
        $ENTRIES = C3cG.A0w(hatchSurveyKindArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final HatchSurveyKind fromWire(String str) {
            HatchSurveyKind next;
            Iterator<HatchSurveyKind> it = HatchSurveyKind.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                HatchSurveyKind hatchSurveyKind = next;
                if (hatchSurveyKind != HatchSurveyKind.UNKNOWN && C7384Etj.areEqual(hatchSurveyKind.getWireValue(), str)) {
                    break;
                }
            }
            HatchSurveyKind hatchSurveyKind2 = next;
            return hatchSurveyKind2 == null ? HatchSurveyKind.UNKNOWN : hatchSurveyKind2;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<HatchSurveyKind> getEntries() {
        return $ENTRIES;
    }

    public static HatchSurveyKind valueOf(String str) {
        return (HatchSurveyKind) Enum.valueOf(HatchSurveyKind.class, str);
    }

    public static HatchSurveyKind[] values() {
        return (HatchSurveyKind[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public HatchSurveyKind(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
