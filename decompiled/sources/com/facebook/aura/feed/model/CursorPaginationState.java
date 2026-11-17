package com.facebook.aura.feed.model;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class CursorPaginationState extends C06G {
    public final String nextCursor;
    public final boolean pendingLiveFeedReset;
    public final String previousCursor;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CursorPaginationState) {
                CursorPaginationState cursorPaginationState = (CursorPaginationState) obj;
                if (!C7384Etj.areEqual(this.nextCursor, cursorPaginationState.nextCursor) || !C7384Etj.areEqual(this.previousCursor, cursorPaginationState.previousCursor) || this.pendingLiveFeedReset != cursorPaginationState.pendingLiveFeedReset) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CursorPaginationState copy$default(CursorPaginationState cursorPaginationState, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cursorPaginationState.nextCursor;
        }
        if ((i & 2) != 0) {
            str2 = cursorPaginationState.previousCursor;
        }
        if ((i & 4) != 0) {
            z = cursorPaginationState.pendingLiveFeedReset;
        }
        return new CursorPaginationState(str, str2, z);
    }

    public final String component1() {
        return this.nextCursor;
    }

    public final String component2() {
        return this.previousCursor;
    }

    public final boolean component3() {
        return this.pendingLiveFeedReset;
    }

    public final CursorPaginationState copy(String str, String str2, boolean z) {
        return new CursorPaginationState(str, str2, z);
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final boolean getPendingLiveFeedReset() {
        return this.pendingLiveFeedReset;
    }

    public final String getPreviousCursor() {
        return this.previousCursor;
    }

    public int hashCode() {
        return C0KA.A00(((AnonymousClass006.A0G(this.nextCursor) * 31) + AnonymousClass005.A0H(this.previousCursor)) * 31, this.pendingLiveFeedReset);
    }

    public CursorPaginationState(String str, String str2, boolean z) {
        this.nextCursor = str;
        this.previousCursor = str2;
        this.pendingLiveFeedReset = z;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CursorPaginationState(String str, String str2, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, AnonymousClass005.A1O(i, z));
    }

    public CursorPaginationState() {
        this(null, null, false);
    }
}
