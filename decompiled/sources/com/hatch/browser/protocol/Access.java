package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Access {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ Access[] $VALUES;
    public static final Companion Companion;
    public static final Access MUTATE;
    public static final Access OBSERVE;
    public static final Access PUBLISH;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        Access access = new Access("OBSERVE", 0);
        OBSERVE = access;
        Access access2 = new Access("MUTATE", 1);
        MUTATE = access2;
        Access access3 = new Access("PUBLISH", 2);
        PUBLISH = access3;
        Access[] accessArr = {access, access2, access3};
        $VALUES = accessArr;
        $ENTRIES = C3cG.A0w(accessArr);
        Companion = new Companion();
    }

    public static Ey9<Access> getEntries() {
        return $ENTRIES;
    }

    public static Access valueOf(String str) {
        return (Access) Enum.valueOf(Access.class, str);
    }

    public static Access[] values() {
        return (Access[]) $VALUES.clone();
    }

    public Access(String str, int i) {
    }
}
