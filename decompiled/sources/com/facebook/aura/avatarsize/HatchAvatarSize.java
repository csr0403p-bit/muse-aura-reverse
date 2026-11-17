package com.facebook.aura.avatarsize;

import X.C06H;
import X.C7384Etj;
import X.Ey9;
import X.F3w;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchAvatarSize {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchAvatarSize[] $VALUES;
    public static final Companion Companion;
    public static final HatchAvatarSize DEFAULT;
    public static final HatchAvatarSize HIDDEN;
    public static final HatchAvatarSize LARGE;
    public static final HatchAvatarSize MEDIUM;
    public static final HatchAvatarSize SMALL;
    public static final HatchAvatarSize XLARGE;
    public final float baseSizeDp;
    public final boolean isAvatarVisible;
    public final String storedValue;

    public final class Companion {
        public final HatchAvatarSize fromStoredValue(String str) {
            HatchAvatarSize next;
            Iterator<HatchAvatarSize> it = HatchAvatarSize.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.getStoredValue(), str)) {
                    break;
                }
            }
            HatchAvatarSize hatchAvatarSize = next;
            return hatchAvatarSize == null ? HatchAvatarSize.DEFAULT : hatchAvatarSize;
        }

        public final HatchAvatarSize getDEFAULT() {
            return HatchAvatarSize.DEFAULT;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 4;
        C06H c06h = null;
        HatchAvatarSize hatchAvatarSize = new HatchAvatarSize("SMALL", 0, "small", 44.0f, 0 == true ? 1 : 0, i, c06h);
        SMALL = hatchAvatarSize;
        HatchAvatarSize hatchAvatarSize2 = new HatchAvatarSize("MEDIUM", 1, "medium", 56.0f, 0 == true ? 1 : 0, i, c06h);
        MEDIUM = hatchAvatarSize2;
        HatchAvatarSize hatchAvatarSize3 = new HatchAvatarSize("LARGE", 2, "large", 68.0f, 0 == true ? 1 : 0, i, c06h);
        LARGE = hatchAvatarSize3;
        HatchAvatarSize hatchAvatarSize4 = new HatchAvatarSize("XLARGE", 3, "xlarge", 80.0f, 0 == true ? 1 : 0, i, c06h);
        XLARGE = hatchAvatarSize4;
        HatchAvatarSize hatchAvatarSize5 = new HatchAvatarSize("HIDDEN", 4, "hidden", 44.0f, false);
        HIDDEN = hatchAvatarSize5;
        HatchAvatarSize[] hatchAvatarSizeArr = {hatchAvatarSize, hatchAvatarSize2, hatchAvatarSize3, hatchAvatarSize4, hatchAvatarSize5};
        $VALUES = hatchAvatarSizeArr;
        $ENTRIES = new F3w(hatchAvatarSizeArr);
        Companion = new Companion();
        DEFAULT = hatchAvatarSize;
    }

    public static Ey9<HatchAvatarSize> getEntries() {
        return $ENTRIES;
    }

    public static HatchAvatarSize valueOf(String str) {
        return (HatchAvatarSize) Enum.valueOf(HatchAvatarSize.class, str);
    }

    public static HatchAvatarSize[] values() {
        return (HatchAvatarSize[]) $VALUES.clone();
    }

    /* renamed from: getBaseSizeDp-D9Ej5fM, reason: not valid java name */
    public final float m278getBaseSizeDpD9Ej5fM() {
        return this.baseSizeDp;
    }

    public final String getStoredValue() {
        return this.storedValue;
    }

    public final boolean isAvatarVisible() {
        return this.isAvatarVisible;
    }

    public HatchAvatarSize(String str, int i, String str2, float f, boolean z) {
        this.storedValue = str2;
        this.baseSizeDp = f;
        this.isAvatarVisible = z;
    }

    public /* synthetic */ HatchAvatarSize(String str, int i, String str2, float f, boolean z, int i2, C06H c06h) {
        this(str, i, str2, f, (i2 & 4) != 0 ? true : z);
    }
}
