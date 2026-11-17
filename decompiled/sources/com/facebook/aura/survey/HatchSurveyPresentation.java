package com.facebook.aura.survey;

import X.AnonymousClass002;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchSurveyPresentation {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchSurveyPresentation[] $VALUES;
    public static final HatchSurveyPresentation DISPLAY_ONLY;
    public static final HatchSurveyPresentation FREE_TEXT;
    public static final HatchSurveyPresentation NUMERIC;
    public static final HatchSurveyPresentation SINGLE_SELECT;
    public static final HatchSurveyPresentation UNSUPPORTED;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchSurveyPresentation.values().length];
            try {
                AnonymousClass002.A13(HatchSurveyPresentation.SINGLE_SELECT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchSurveyPresentation.NUMERIC, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchSurveyPresentation.FREE_TEXT, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchSurveyPresentation.DISPLAY_ONLY, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchSurveyPresentation.UNSUPPORTED, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        HatchSurveyPresentation hatchSurveyPresentation = new HatchSurveyPresentation("SINGLE_SELECT", 0);
        SINGLE_SELECT = hatchSurveyPresentation;
        HatchSurveyPresentation hatchSurveyPresentation2 = new HatchSurveyPresentation("NUMERIC", 1);
        NUMERIC = hatchSurveyPresentation2;
        HatchSurveyPresentation hatchSurveyPresentation3 = new HatchSurveyPresentation("FREE_TEXT", 2);
        FREE_TEXT = hatchSurveyPresentation3;
        HatchSurveyPresentation hatchSurveyPresentation4 = new HatchSurveyPresentation("DISPLAY_ONLY", 3);
        DISPLAY_ONLY = hatchSurveyPresentation4;
        HatchSurveyPresentation hatchSurveyPresentation5 = new HatchSurveyPresentation("UNSUPPORTED", 4);
        UNSUPPORTED = hatchSurveyPresentation5;
        HatchSurveyPresentation[] hatchSurveyPresentationArr = {hatchSurveyPresentation, hatchSurveyPresentation2, hatchSurveyPresentation3, hatchSurveyPresentation4, hatchSurveyPresentation5};
        $VALUES = hatchSurveyPresentationArr;
        $ENTRIES = C3cG.A0w(hatchSurveyPresentationArr);
    }

    public static Ey9<HatchSurveyPresentation> getEntries() {
        return $ENTRIES;
    }

    public static HatchSurveyPresentation valueOf(String str) {
        return (HatchSurveyPresentation) Enum.valueOf(HatchSurveyPresentation.class, str);
    }

    public static HatchSurveyPresentation[] values() {
        return (HatchSurveyPresentation[]) $VALUES.clone();
    }

    public final boolean getRequiresAnswer() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return false;
        }
        throw C3cG.A0q();
    }

    public HatchSurveyPresentation(String str, int i) {
    }
}
