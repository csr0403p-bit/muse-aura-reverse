package com.facebook.rsys.metaaivoicestate.gen;

import X.AnonymousClass006;
import X.C8922Fte;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class ShapeOfFeedCommandData {
    public static G50<ShapeOfFeedCommandData> CONVERTER = C8922Fte.A00(1);
    public static long sMcfTypeId;
    public final String feedRankingQuery;

    public static native ShapeOfFeedCommandData createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShapeOfFeedCommandData) {
                String str = this.feedRankingQuery;
                String str2 = ((ShapeOfFeedCommandData) obj).feedRankingQuery;
                if (str != null ? !str.equals(str2) : str2 != null) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 527 + AnonymousClass006.A0G(this.feedRankingQuery);
    }

    public String toString() {
        return FGI.A0U("ShapeOfFeedCommandData{feedRankingQuery=", this.feedRankingQuery, "}");
    }

    public ShapeOfFeedCommandData(String str) {
        this.feedRankingQuery = str;
    }
}
