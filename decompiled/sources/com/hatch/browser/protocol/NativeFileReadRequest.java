package com.hatch.browser.protocol;

import X.AnonymousClass001;
import X.BV4;
import X.C06H;
import X.C60R;
import X.C7384Etj;
import X.FGI;
import X.HwO;

/* loaded from: classes6.dex */
public final class NativeFileReadRequest {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public int index;
    public int length;
    public long offset;
    public String stageId;

    public NativeFileReadRequest(String str, int i, long j, int i2) {
        C7384Etj.A0Y(str, 0);
        this.stageId = str;
        this.index = i;
        this.offset = j;
        this.length = i2;
    }

    /* renamed from: copy-I4yLPiA$default, reason: not valid java name */
    public static /* synthetic */ NativeFileReadRequest m3610copyI4yLPiA$default(NativeFileReadRequest nativeFileReadRequest, String str, int i, long j, int i2, int i3, Object obj) {
        String str2 = str;
        int i4 = i;
        long j2 = j;
        int i5 = i2;
        if ((i3 & 1) != 0) {
            str2 = nativeFileReadRequest.stageId;
        }
        if ((i3 & 2) != 0) {
            i4 = nativeFileReadRequest.index;
        }
        if ((i3 & 4) != 0) {
            j2 = nativeFileReadRequest.offset;
        }
        if ((i3 & 8) != 0) {
            i5 = nativeFileReadRequest.length;
        }
        C7384Etj.A0Y(str2, 0);
        return new NativeFileReadRequest(str2, i4, j2, i5);
    }

    /* renamed from: copy-I4yLPiA, reason: not valid java name */
    public final NativeFileReadRequest m3614copyI4yLPiA(String str, int i, long j, int i2) {
        C7384Etj.A0Y(str, 0);
        return new NativeFileReadRequest(str, i, j, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativeFileReadRequest) {
                NativeFileReadRequest nativeFileReadRequest = (NativeFileReadRequest) obj;
                if (!C7384Etj.areEqual(this.stageId, nativeFileReadRequest.stageId) || this.index != nativeFileReadRequest.index || this.offset != nativeFileReadRequest.offset || this.length != nativeFileReadRequest.length) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setStageId(String str) {
        C7384Etj.A0Y(str, 0);
        this.stageId = str;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public final String component1() {
        return this.stageId;
    }

    /* renamed from: component2-pVg5ArA, reason: not valid java name */
    public final int m3611component2pVg5ArA() {
        return this.index;
    }

    /* renamed from: component3-s-VKNKU, reason: not valid java name */
    public final long m3612component3sVKNKU() {
        return this.offset;
    }

    /* renamed from: component4-pVg5ArA, reason: not valid java name */
    public final int m3613component4pVg5ArA() {
        return this.length;
    }

    /* renamed from: getIndex-pVg5ArA, reason: not valid java name */
    public final int m3615getIndexpVg5ArA() {
        return this.index;
    }

    /* renamed from: getLength-pVg5ArA, reason: not valid java name */
    public final int m3616getLengthpVg5ArA() {
        return this.length;
    }

    /* renamed from: getOffset-s-VKNKU, reason: not valid java name */
    public final long m3617getOffsetsVKNKU() {
        return this.offset;
    }

    public final String getStageId() {
        return this.stageId;
    }

    public int hashCode() {
        return C60R.A00(this.offset, (AnonymousClass001.A0G(this.stageId) + this.index) * 31) + this.length;
    }

    /* renamed from: setIndex-WZ4Q5Ns, reason: not valid java name */
    public final void m3618setIndexWZ4Q5Ns(int i) {
        this.index = i;
    }

    /* renamed from: setLength-WZ4Q5Ns, reason: not valid java name */
    public final void m3619setLengthWZ4Q5Ns(int i) {
        this.length = i;
    }

    /* renamed from: setOffset-VKZWuLQ, reason: not valid java name */
    public final void m3620setOffsetVKZWuLQ(long j) {
        this.offset = j;
    }

    public String toString() {
        return FGI.A0m("NativeFileReadRequest(stageId=", this.stageId, ", index=", String.valueOf(BV4.A03(this.index)), ", offset=", HwO.A00(this.offset), ", length=", String.valueOf(BV4.A03(this.length)), ")");
    }

    public /* synthetic */ NativeFileReadRequest(String str, int i, long j, int i2, C06H c06h) {
        this(str, i, j, i2);
    }
}
