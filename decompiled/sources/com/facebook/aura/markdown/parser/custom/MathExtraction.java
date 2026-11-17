package com.facebook.aura.markdown.parser.custom;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import java.util.Map;

/* loaded from: classes4.dex */
public final class MathExtraction {
    public final Map<Integer, MathToken> table;
    public final String text;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MathExtraction) {
                MathExtraction mathExtraction = (MathExtraction) obj;
                if (!C7384Etj.areEqual(this.text, mathExtraction.text) || !C7384Etj.areEqual(this.table, mathExtraction.table)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MathExtraction copy$default(MathExtraction mathExtraction, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mathExtraction.text;
        }
        if ((i & 2) != 0) {
            map = mathExtraction.table;
        }
        AnonymousClass003.A0u(str, map);
        return new MathExtraction(str, map);
    }

    public final String component1() {
        return this.text;
    }

    public final Map<Integer, MathToken> component2() {
        return this.table;
    }

    public final Map<Integer, MathToken> getTable() {
        return this.table;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.table, AnonymousClass001.A0G(this.text));
    }

    public String toString() {
        return C3cJ.A0L(this.table, ", table=", C3cI.A0x("MathExtraction(text=", this.text));
    }

    public MathExtraction(String str, Map<Integer, MathToken> map) {
        AnonymousClass003.A0u(str, map);
        this.text = str;
        this.table = map;
    }

    public final MathExtraction copy(String str, Map<Integer, MathToken> map) {
        AnonymousClass003.A0u(str, map);
        return new MathExtraction(str, map);
    }
}
