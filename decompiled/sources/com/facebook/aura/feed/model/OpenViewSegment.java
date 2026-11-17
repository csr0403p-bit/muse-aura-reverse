package com.facebook.aura.feed.model;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.feed.repo.FeedUnitViewportContext;

/* loaded from: classes3.dex */
public final class OpenViewSegment extends C06G {
    public final FeedUnitViewportContext context;
    public final long startElapsedMs;
    public final long startEpochMs;

    public OpenViewSegment(long j, long j2, FeedUnitViewportContext feedUnitViewportContext) {
        C7384Etj.A0Y(feedUnitViewportContext, 2);
        this.startElapsedMs = j;
        this.startEpochMs = j2;
        this.context = feedUnitViewportContext;
    }

    public final OpenViewSegment copy(long j, long j2, FeedUnitViewportContext feedUnitViewportContext) {
        C7384Etj.A0Y(feedUnitViewportContext, 2);
        return new OpenViewSegment(j, j2, feedUnitViewportContext);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OpenViewSegment) {
                OpenViewSegment openViewSegment = (OpenViewSegment) obj;
                if (this.startElapsedMs != openViewSegment.startElapsedMs || this.startEpochMs != openViewSegment.startEpochMs || !C7384Etj.areEqual(this.context, openViewSegment.context)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ OpenViewSegment copy$default(OpenViewSegment openViewSegment, long j, long j2, FeedUnitViewportContext feedUnitViewportContext, int i, Object obj) {
        if ((i & 1) != 0) {
            j = openViewSegment.startElapsedMs;
        }
        if ((i & 2) != 0) {
            j2 = openViewSegment.startEpochMs;
        }
        if ((i & 4) != 0) {
            feedUnitViewportContext = openViewSegment.context;
        }
        return openViewSegment.copy(j, j2, feedUnitViewportContext);
    }

    public final long component1() {
        return this.startElapsedMs;
    }

    public final long component2() {
        return this.startEpochMs;
    }

    public final FeedUnitViewportContext component3() {
        return this.context;
    }

    public final FeedUnitViewportContext getContext() {
        return this.context;
    }

    public final long getStartElapsedMs() {
        return this.startElapsedMs;
    }

    public final long getStartEpochMs() {
        return this.startEpochMs;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.context, AnonymousClass006.A06(this.startEpochMs, AnonymousClass005.A07(this.startElapsedMs)));
    }

    public String toString() {
        return super.toString();
    }
}
