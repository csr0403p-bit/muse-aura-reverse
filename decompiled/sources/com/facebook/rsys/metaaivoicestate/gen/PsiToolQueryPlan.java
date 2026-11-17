package com.facebook.rsys.metaaivoicestate.gen;

import X.AbstractC7609F5w;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class PsiToolQueryPlan {
    public static G50<PsiToolQueryPlan> CONVERTER = C8921Ftd.A00(46);
    public static long sMcfTypeId;
    public final Integer contextWindowAbove;
    public final Integer contextWindowBelow;
    public final ArrayList<String> conversations;
    public final Integer distanceThreshold;
    public final Integer includeLastNMessages;
    public final Integer maxRelevant;
    public final Integer maxRelevantPerQuery;
    public final Integer maxTotal;
    public final Integer minRelevantPerQuery;
    public final ArrayList<String> queries;
    public final String queryType;
    public final ArrayList<String> threadIdsToExclude;
    public final Long timeEnd;
    public final Long timeStart;

    public static native PsiToolQueryPlan createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PsiToolQueryPlan) {
                PsiToolQueryPlan psiToolQueryPlan = (PsiToolQueryPlan) obj;
                if (this.conversations.equals(psiToolQueryPlan.conversations) && this.queries.equals(psiToolQueryPlan.queries)) {
                    Long l = this.timeStart;
                    Long l2 = psiToolQueryPlan.timeStart;
                    if (l != null ? l.equals(l2) : l2 == null) {
                        Long l3 = this.timeEnd;
                        Long l4 = psiToolQueryPlan.timeEnd;
                        if (l3 == null) {
                            if (l4 != null) {
                                return false;
                            }
                        } else if (l3.equals(l4)) {
                        }
                        Integer num = this.maxRelevant;
                        Integer num2 = psiToolQueryPlan.maxRelevant;
                        if (num == null) {
                            if (num2 != null) {
                                return false;
                            }
                        } else if (num.equals(num2)) {
                        }
                        Integer num3 = this.maxRelevantPerQuery;
                        Integer num4 = psiToolQueryPlan.maxRelevantPerQuery;
                        if (num3 == null) {
                            if (num4 != null) {
                                return false;
                            }
                        } else if (num3.equals(num4)) {
                        }
                        Integer num5 = this.minRelevantPerQuery;
                        Integer num6 = psiToolQueryPlan.minRelevantPerQuery;
                        if (num5 == null) {
                            if (num6 != null) {
                                return false;
                            }
                        } else if (num5.equals(num6)) {
                        }
                        Integer num7 = this.distanceThreshold;
                        Integer num8 = psiToolQueryPlan.distanceThreshold;
                        if (num7 == null) {
                            if (num8 != null) {
                                return false;
                            }
                        } else if (num7.equals(num8)) {
                        }
                        Integer num9 = this.contextWindowAbove;
                        Integer num10 = psiToolQueryPlan.contextWindowAbove;
                        if (num9 == null) {
                            if (num10 != null) {
                                return false;
                            }
                        } else if (num9.equals(num10)) {
                        }
                        Integer num11 = this.contextWindowBelow;
                        Integer num12 = psiToolQueryPlan.contextWindowBelow;
                        if (num11 == null) {
                            if (num12 != null) {
                                return false;
                            }
                        } else if (num11.equals(num12)) {
                        }
                        Integer num13 = this.includeLastNMessages;
                        Integer num14 = psiToolQueryPlan.includeLastNMessages;
                        if (num13 == null) {
                            if (num14 != null) {
                                return false;
                            }
                        } else if (num13.equals(num14)) {
                        }
                        Integer num15 = this.maxTotal;
                        Integer num16 = psiToolQueryPlan.maxTotal;
                        if (num15 == null) {
                            if (num16 != null) {
                                return false;
                            }
                        } else if (num15.equals(num16)) {
                        }
                        String str = this.queryType;
                        String str2 = psiToolQueryPlan.queryType;
                        if (str == null) {
                            if (str2 != null) {
                                return false;
                            }
                        } else if (str.equals(str2)) {
                        }
                        if (this.threadIdsToExclude.equals(psiToolQueryPlan.threadIdsToExclude)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.threadIdsToExclude, (((((((((((((((((((((AnonymousClass005.A0F(this.queries, BV8.A09(this.conversations)) + AnonymousClass006.A0D(this.timeStart)) * 31) + AnonymousClass006.A0D(this.timeEnd)) * 31) + AnonymousClass006.A0D(this.maxRelevant)) * 31) + AnonymousClass006.A0D(this.maxRelevantPerQuery)) * 31) + AnonymousClass006.A0D(this.minRelevantPerQuery)) * 31) + AnonymousClass006.A0D(this.distanceThreshold)) * 31) + AnonymousClass006.A0D(this.contextWindowAbove)) * 31) + AnonymousClass006.A0D(this.contextWindowBelow)) * 31) + AnonymousClass006.A0D(this.includeLastNMessages)) * 31) + AnonymousClass006.A0D(this.maxTotal)) * 31) + AnonymousClass005.A0H(this.queryType)) * 31);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("PsiToolQueryPlan{conversations=");
        sbA0x.append(this.conversations);
        sbA0x.append(",queries=");
        sbA0x.append(this.queries);
        sbA0x.append(",timeStart=");
        sbA0x.append(this.timeStart);
        sbA0x.append(",timeEnd=");
        sbA0x.append(this.timeEnd);
        sbA0x.append(",maxRelevant=");
        sbA0x.append(this.maxRelevant);
        sbA0x.append(",maxRelevantPerQuery=");
        sbA0x.append(this.maxRelevantPerQuery);
        sbA0x.append(",minRelevantPerQuery=");
        sbA0x.append(this.minRelevantPerQuery);
        sbA0x.append(",distanceThreshold=");
        sbA0x.append(this.distanceThreshold);
        sbA0x.append(",contextWindowAbove=");
        sbA0x.append(this.contextWindowAbove);
        sbA0x.append(",contextWindowBelow=");
        sbA0x.append(this.contextWindowBelow);
        sbA0x.append(",includeLastNMessages=");
        sbA0x.append(this.includeLastNMessages);
        sbA0x.append(",maxTotal=");
        sbA0x.append(this.maxTotal);
        sbA0x.append(",queryType=");
        sbA0x.append(this.queryType);
        sbA0x.append(",threadIdsToExclude=");
        return BV8.A0v(this.threadIdsToExclude, sbA0x);
    }

    public PsiToolQueryPlan(ArrayList<String> arrayList, ArrayList<String> arrayList2, Long l, Long l2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, String str, ArrayList<String> arrayList3) {
        AbstractC7609F5w.A1H(arrayList, arrayList2, arrayList3);
        this.conversations = arrayList;
        this.queries = arrayList2;
        this.timeStart = l;
        this.timeEnd = l2;
        this.maxRelevant = num;
        this.maxRelevantPerQuery = num2;
        this.minRelevantPerQuery = num3;
        this.distanceThreshold = num4;
        this.contextWindowAbove = num5;
        this.contextWindowBelow = num6;
        this.includeLastNMessages = num7;
        this.maxTotal = num8;
        this.queryType = str;
        this.threadIdsToExclude = arrayList3;
    }
}
