package com.facebook.aura.feed.repo;

/* loaded from: classes.dex */
public abstract class FeedApiJsonKt {
    public static final FeedIdeaActionState toIdeaActionState(String str) {
        return "built".equals(str) ? FeedIdeaActionState.BUILT : FeedIdeaActionState.AVAILABLE;
    }

    public static final FeedReaction toReaction(String str) {
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == 3321751) {
            if (str.equals("like")) {
                return FeedReaction.LIKE;
            }
            return null;
        }
        if (iHashCode == 3327858) {
            if (str.equals("love")) {
                return FeedReaction.LOVE;
            }
            return null;
        }
        if (iHashCode == 1671642405 && str.equals("dislike")) {
            return FeedReaction.DISLIKE;
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final FeedUnitOrigin toOrigin(String str) {
        switch (str.hashCode()) {
            case 3227383:
                if (str.equals("idea")) {
                    return FeedUnitOrigin.IDEA;
                }
                break;
            case 92750597:
                if (str.equals("agent")) {
                    return FeedUnitOrigin.AGENT;
                }
                break;
            case 198267395:
                if (str.equals("ingested")) {
                    return FeedUnitOrigin.INGESTED;
                }
                break;
            case 286955919:
                if (str.equals("generated")) {
                    return FeedUnitOrigin.GENERATED;
                }
                break;
        }
        return FeedUnitOrigin.UNKNOWN;
    }
}
