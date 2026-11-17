package com.facebook.aura.nodes.datasource;

/* loaded from: classes6.dex */
public abstract class DataSourcePublishPipelineKt {
    public static final long CHUNK_COOLDOWN_MS = 500;
    public static final long DATA_SOURCE_WIRE_FIXED_OVERHEAD_BYTES = 8192;
    public static final long DAY_MS = 86400000;
    public static final int MAX_CHUNKS_GUARDRAIL = 256;
    public static final int MAX_CHUNK_BYTES = 1048576;
    public static final long MAX_DATA_SOURCE_WIRE_BYTES = 4194304;
    public static final int MAX_PAGES_GUARDRAIL = 1000;
    public static final long MAX_TOTAL_BYTES_GUARDRAIL = 67108864;
    public static final long MIN_CHUNK_MS = 1800000;
    public static final String TAG = "DataSourcePublishPipeline";

    public static final long dataSourceWireSizeUpperBound(String str, String str2, String str3, String str4, String str5, String str6) {
        return jsonQuotedUtf8SizeUpperBound(str) + 8192 + jsonQuotedUtf8SizeUpperBound(str2) + jsonQuotedUtf8SizeUpperBound(str3) + jsonQuotedUtf8SizeUpperBound(str4) + jsonQuotedUtf8SizeUpperBound(str5) + (str6 != null ? jsonQuotedUtf8SizeUpperBound(str6) : 0L);
    }

    public static /* synthetic */ long dataSourceWireSizeUpperBound$default(String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 32) != 0) {
            str6 = null;
        }
        return dataSourceWireSizeUpperBound(str, str2, str3, str4, str5, str6);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long jsonQuotedUtf8SizeUpperBound(java.lang.String r7) {
        /*
            r5 = 2
            r3 = 0
        L3:
            int r4 = r7.length()
            if (r3 >= r4) goto L60
            char r1 = r7.charAt(r3)
            r0 = 12
            if (r1 == r0) goto L5d
            r0 = 13
            if (r1 == r0) goto L5d
            r0 = 34
            if (r1 == r0) goto L5d
            r0 = 92
            if (r1 == r0) goto L5d
            switch(r1) {
                case 8: goto L5d;
                case 9: goto L5d;
                case 10: goto L5d;
                default: goto L20;
            }
        L20:
            r0 = 32
            if (r1 < r0) goto L5a
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 > r0) goto L2e
            r0 = 1
        L2a:
            long r5 = r5 + r0
        L2b:
            int r3 = r3 + 1
            goto L3
        L2e:
            r0 = 2047(0x7ff, float:2.868E-42)
            if (r1 <= r0) goto L5d
            boolean r0 = java.lang.Character.isHighSurrogate(r1)
            if (r0 == 0) goto L4b
            int r2 = r3 + 1
            if (r2 >= r4) goto L4b
            char r0 = r7.charAt(r2)
            boolean r0 = java.lang.Character.isLowSurrogate(r0)
            if (r0 == 0) goto L4b
            r0 = 4
            long r5 = r5 + r0
            r3 = r2
            goto L2b
        L4b:
            boolean r0 = java.lang.Character.isHighSurrogate(r1)
            if (r0 != 0) goto L5a
            boolean r0 = java.lang.Character.isLowSurrogate(r1)
            if (r0 != 0) goto L5a
            r0 = 3
            goto L2a
        L5a:
            r0 = 6
            goto L2a
        L5d:
            r0 = 2
            goto L2a
        L60:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.datasource.DataSourcePublishPipelineKt.jsonQuotedUtf8SizeUpperBound(java.lang.String):long");
    }

    public static final long utf8Size(String str) {
        int i;
        int i2;
        long j = 0;
        int i3 = 0;
        while (true) {
            int length = str.length();
            if (i3 >= length) {
                return j;
            }
            char cCharAt = str.charAt(i3);
            long j2 = 1;
            if (cCharAt <= '\u007f') {
                j += j2;
            } else {
                if (cCharAt > '\u07ff') {
                    if (Character.isHighSurrogate(cCharAt) && (i = i3 + 1) < length && Character.isLowSurrogate(str.charAt(i))) {
                        j += 4;
                        i3 = i;
                    } else {
                        i2 = (Character.isHighSurrogate(cCharAt) || Character.isLowSurrogate(cCharAt)) ? 2 : 3;
                        j += j2;
                    }
                }
                j2 = i2;
                j += j2;
            }
            i3++;
        }
    }
}
