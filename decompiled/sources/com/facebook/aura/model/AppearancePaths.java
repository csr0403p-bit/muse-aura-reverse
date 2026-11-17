package com.facebook.aura.model;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C3cI;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class AppearancePaths extends C06G {
    public static final int $stable = 0;
    public final List<String> dark;
    public final List<String> light;

    public AppearancePaths(List<String> list, List<String> list2) {
        C7384Etj.A0Y(list, 0);
        C7384Etj.A0Y(list2, 1);
        this.dark = list;
        this.light = list2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AppearancePaths) {
                AppearancePaths appearancePaths = (AppearancePaths) obj;
                if (!C7384Etj.areEqual(this.dark, appearancePaths.dark) || !C7384Etj.areEqual(this.light, appearancePaths.light)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AppearancePaths copy$default(AppearancePaths appearancePaths, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = appearancePaths.dark;
        }
        if ((i & 2) != 0) {
            list2 = appearancePaths.light;
        }
        AnonymousClass003.A0u(list, list2);
        return new AppearancePaths(list, list2);
    }

    public final List<String> component1() {
        return this.dark;
    }

    public final List<String> component2() {
        return this.light;
    }

    public final List<String> getDark() {
        return this.dark;
    }

    public final List<String> getLight() {
        return this.light;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.light, AnonymousClass005.A0E(this.dark));
    }

    public final boolean isEmpty() {
        return this.dark.isEmpty() && this.light.isEmpty();
    }

    public final AppearancePaths copy(List<String> list, List<String> list2) {
        AnonymousClass003.A0u(list, list2);
        return new AppearancePaths(list, list2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AppearancePaths(List list, List list2, int i, C06H c06h) {
        this(C3cI.A10(list, i), C3cI.A11(list2, i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppearancePaths() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(c0881AGi, c0881AGi);
    }
}
