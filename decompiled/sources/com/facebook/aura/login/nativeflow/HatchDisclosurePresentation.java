package com.facebook.aura.login.nativeflow;

import X.BFI;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import java.util.Iterator;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchDisclosurePresentation {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchDisclosurePresentation[] $VALUES;
    public static final String BIRTHDAY_ITEMIZED_CONSENT_SCREEN = "birthday_itemized_consent_screen";
    public static final Companion Companion;
    public static final HatchDisclosurePresentation DEDICATED_PROSE_SCREEN;
    public static final Set<HatchDisclosurePresentation> DRAWN;
    public static final HatchDisclosurePresentation INLINE;
    public static final HatchDisclosurePresentation ITEMIZED_CONSENT_SCREEN;
    public static final HatchDisclosurePresentation KEY_POINTS_SCREEN;
    public final String wireValue;

    public final class Companion {
        public final HatchDisclosurePresentation fromWire(String str) {
            HatchDisclosurePresentation next;
            C7384Etj.A0Y(str, 0);
            Iterator<HatchDisclosurePresentation> it = HatchDisclosurePresentation.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (str.equals(next.getWireValue())) {
                    break;
                }
            }
            HatchDisclosurePresentation hatchDisclosurePresentation = next;
            return hatchDisclosurePresentation == null ? HatchDisclosurePresentation.INLINE : hatchDisclosurePresentation;
        }

        public final Set<HatchDisclosurePresentation> getDRAWN() {
            return HatchDisclosurePresentation.DRAWN;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        HatchDisclosurePresentation hatchDisclosurePresentation = new HatchDisclosurePresentation("INLINE", 0, "inline");
        INLINE = hatchDisclosurePresentation;
        HatchDisclosurePresentation hatchDisclosurePresentation2 = new HatchDisclosurePresentation("DEDICATED_PROSE_SCREEN", 1, "dedicated_prose_screen");
        DEDICATED_PROSE_SCREEN = hatchDisclosurePresentation2;
        HatchDisclosurePresentation hatchDisclosurePresentation3 = new HatchDisclosurePresentation("ITEMIZED_CONSENT_SCREEN", 2, "itemized_consent_screen");
        ITEMIZED_CONSENT_SCREEN = hatchDisclosurePresentation3;
        HatchDisclosurePresentation hatchDisclosurePresentation4 = new HatchDisclosurePresentation("KEY_POINTS_SCREEN", 3, "key_points_screen");
        KEY_POINTS_SCREEN = hatchDisclosurePresentation4;
        HatchDisclosurePresentation[] hatchDisclosurePresentationArr = {hatchDisclosurePresentation, hatchDisclosurePresentation2, hatchDisclosurePresentation3, hatchDisclosurePresentation4};
        $VALUES = hatchDisclosurePresentationArr;
        $ENTRIES = C3cG.A0w(hatchDisclosurePresentationArr);
        Companion = new Companion();
        DRAWN = BFI.A0H(new HatchDisclosurePresentation[]{hatchDisclosurePresentation2, hatchDisclosurePresentation3});
    }

    public static Ey9<HatchDisclosurePresentation> getEntries() {
        return $ENTRIES;
    }

    public static HatchDisclosurePresentation valueOf(String str) {
        return (HatchDisclosurePresentation) Enum.valueOf(HatchDisclosurePresentation.class, str);
    }

    public static HatchDisclosurePresentation[] values() {
        return (HatchDisclosurePresentation[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public final boolean isDrawnOnItsOwnScreen() {
        return DRAWN.contains(this);
    }

    public HatchDisclosurePresentation(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
