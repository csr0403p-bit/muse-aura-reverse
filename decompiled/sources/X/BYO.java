package X;

import java.io.Serializable;

/* loaded from: classes5.dex */
public final class BYO implements Serializable {
    public static final long serialVersionUID = -4973307892907888100L;
    public final String mAssetUrl;
    public final String mCacheName;
    public final String mContentType;
    public final String mEvictionReason;
    public final Boolean mIsFirstMedia;
    public final boolean mIsOffline;
    public final String mKey;
    public final long mLength;
    public final long mNewLength;
    public final long mNewPosition;
    public final BYR mOperation;
    public final long mPosition;
    public final String mPrefetchModule;
    public final String mPrefetchTag;
    public final String mRequestType;
    public final String mSourceModule;
    public final String mStreamType;
    public final String mSubOrigin;
    public final String mVideoId;
    public final long mRequestedRangeStart = 0;
    public final long mRequestedRangeEnd = 0;
    public final long mCachedRangeStart = 0;
    public final long mCachedRangeEnd = 0;
    public final long mTimestamp = System.currentTimeMillis();
    public final boolean mIsSecondPhasePrefetch = false;

    public BYO(BYR byr, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, long j, long j2, long j3, long j4, boolean z) {
        this.mOperation = byr;
        this.mCacheName = str;
        this.mSourceModule = str2;
        this.mSubOrigin = str3;
        this.mRequestType = str4;
        this.mStreamType = str5;
        this.mKey = str6;
        this.mPosition = j;
        this.mLength = j2;
        this.mNewPosition = j3;
        this.mNewLength = j4;
        this.mEvictionReason = str8;
        this.mContentType = str11;
        this.mAssetUrl = str7;
        this.mPrefetchTag = str9;
        this.mPrefetchModule = str10;
        this.mIsFirstMedia = bool;
        this.mVideoId = str12;
        this.mIsOffline = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r12 = this;
            X.BYR r5 = r12.mOperation
            int r0 = r5.ordinal()
            switch(r0) {
                case 0: goto L7c;
                case 1: goto L7c;
                case 2: goto L37;
                case 3: goto Lc;
                case 4: goto Lc;
                case 5: goto Lc;
                case 6: goto Lc;
                default: goto L9;
            }
        L9:
            java.lang.String r0 = "Unknown. Err-roar"
            return r0
        Lc:
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r6 = r12.mRequestType
            long r0 = r12.mRequestedRangeStart
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            long r0 = r12.mRequestedRangeEnd
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            android.util.Pair r3 = android.util.Pair.create(r2, r0)
            long r0 = r12.mCachedRangeStart
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            long r0 = r12.mCachedRangeEnd
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            android.util.Pair r0 = android.util.Pair.create(r2, r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r5, r3, r0}
            java.lang.String r0 = "[%s][%s] Requested %s, cached %s"
            goto L9d
        L37:
            long r2 = r12.mPosition
            long r5 = r12.mNewPosition
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L5b
            long r7 = r12.mLength
            long r9 = r12.mNewLength
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L5b
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r5 = r12.mKey
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            long r2 = r2 + r7
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r1, r0}
            java.lang.String r0 = "[SPAN HIT] - %s [%d, %d]"
            goto L9d
        L5b:
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r8 = r12.mKey
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            long r0 = r12.mLength
            long r2 = r2 + r0
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            long r0 = r12.mNewLength
            long r5 = r5 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r8, r7, r3, r2, r0}
            java.lang.String r0 = "[SPAN_TOUCHED] - %s [%d, %d],[%d,%d]"
            goto L9d
        L7c:
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r6 = r12.mSourceModule
            java.lang.String r7 = r12.mRequestType
            java.lang.String r8 = r5.name()
            java.lang.String r9 = r12.mPrefetchTag
            java.lang.String r10 = r12.mKey
            long r0 = r12.mPosition
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
            long r2 = r12.mLength
            long r0 = r0 + r2
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r7, r8, r9, r10, r11, r12}
            java.lang.String r0 = "[%s][%s][%s][%s] - %s [%d, %d] - [%s]"
        L9d:
            java.lang.String r0 = java.lang.String.format(r4, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BYO.toString():java.lang.String");
    }
}
