package com.facebook.aura.analytics.hatch;

import X.AIW;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0924AIa;
import X.C7384Etj;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class HatchCitationAnalytics extends C06G {
    public static final int $stable = 0;
    public final String messageId;
    public final List<String> resourceUris;

    public HatchCitationAnalytics(String str, List<String> list) {
        C7384Etj.A0Y(list, 1);
        this.messageId = str;
        this.resourceUris = list;
    }

    public final HatchCitationAnalytics copy(String str, List<String> list) {
        C7384Etj.A0Y(list, 1);
        return new HatchCitationAnalytics(str, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCitationAnalytics) {
                HatchCitationAnalytics hatchCitationAnalytics = (HatchCitationAnalytics) obj;
                if (!C7384Etj.areEqual(this.messageId, hatchCitationAnalytics.messageId) || !C7384Etj.areEqual(this.resourceUris, hatchCitationAnalytics.resourceUris)) {
                }
            }
            return false;
        }
        return true;
    }

    public final Map<String, String> linkMetadata(String str) {
        String strValueOf;
        C7384Etj.A0Y(str, 0);
        C0924AIa c0924AIa = new C0924AIa();
        putMessageId(c0924AIa);
        Integer numIndexOf = indexOf(str);
        String value = HatchMetadataKey.CITATION_MATCH.getValue();
        if (numIndexOf == null) {
            strValueOf = HatchCitationMatch.NONE.getValue();
        } else {
            c0924AIa.put(value, HatchCitationMatch.RESOURCE.getValue());
            c0924AIa.put(HatchMetadataKey.CITATION_INDEX.getValue(), String.valueOf(numIndexOf.intValue()));
            value = HatchMetadataKey.CITATION_COUNT.getValue();
            strValueOf = String.valueOf(this.resourceUris.size());
        }
        c0924AIa.put(value, strValueOf);
        return AIW.A0K(c0924AIa);
    }

    public final Map<String, String> sourceRowMetadata(String str, Integer num) {
        C7384Etj.A0Y(str, 0);
        C0924AIa c0924AIa = new C0924AIa();
        putMessageId(c0924AIa);
        c0924AIa.put(HatchMetadataKey.CITATION_COUNT.getValue(), String.valueOf(this.resourceUris.size()));
        Integer numIndexOf = indexOf(str);
        if (numIndexOf != null) {
            AnonymousClass006.A1B(HatchMetadataKey.CITATION_INDEX, c0924AIa, numIndexOf.intValue());
        }
        if (num != null) {
            AnonymousClass006.A1B(HatchMetadataKey.ABSOLUTE_POSITION, c0924AIa, num.intValue());
        }
        return AIW.A0K(c0924AIa);
    }

    public static /* synthetic */ HatchCitationAnalytics copy$default(HatchCitationAnalytics hatchCitationAnalytics, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchCitationAnalytics.messageId;
        }
        if ((i & 2) != 0) {
            list = hatchCitationAnalytics.resourceUris;
        }
        C7384Etj.A0Y(list, 1);
        return new HatchCitationAnalytics(str, list);
    }

    private final Integer indexOf(String str) {
        Integer numValueOf = Integer.valueOf(this.resourceUris.indexOf(str));
        if (numValueOf.intValue() < 0) {
            return null;
        }
        return numValueOf;
    }

    private final void putMessageId(Map<String, String> map) {
        String str = this.messageId;
        if (str != null) {
            map.put(HatchMetadataKey.MESSAGE_ID.getValue(), str);
        }
    }

    public static /* synthetic */ Map sourceRowMetadata$default(HatchCitationAnalytics hatchCitationAnalytics, String str, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return hatchCitationAnalytics.sourceRowMetadata(str, num);
    }

    public final String component1() {
        return this.messageId;
    }

    public final List<String> component2() {
        return this.resourceUris;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final List<String> getResourceUris() {
        return this.resourceUris;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.resourceUris, AnonymousClass006.A0G(this.messageId) * 31);
    }

    public final Map<String, String> sourcesMetadata() {
        C0924AIa c0924AIa = new C0924AIa();
        putMessageId(c0924AIa);
        c0924AIa.put(HatchMetadataKey.CITATION_COUNT.getValue(), String.valueOf(this.resourceUris.size()));
        return AIW.A0K(c0924AIa);
    }

    public String toString() {
        return super.toString();
    }
}
