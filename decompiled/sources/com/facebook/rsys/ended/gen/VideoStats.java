package com.facebook.rsys.ended.gen;

import X.AbstractC7608F5v;
import X.AnonymousClass006;
import X.BV8;
import X.C3cH;
import X.C60O;
import X.C8925Fth;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class VideoStats {
    public static G50<VideoStats> CONVERTER = C8925Fth.A00(27);
    public static long sMcfTypeId;
    public final Long total1080phdDurationMs;
    public final Long total720phdDurationMs;
    public final Long totalDurationMs;

    public static native VideoStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VideoStats) {
                VideoStats videoStats = (VideoStats) obj;
                Long l = this.totalDurationMs;
                Long l2 = videoStats.totalDurationMs;
                if (l != null ? l.equals(l2) : l2 == null) {
                    Long l3 = this.total720phdDurationMs;
                    Long l4 = videoStats.total720phdDurationMs;
                    if (l3 == null) {
                        if (l4 != null) {
                            return false;
                        }
                    } else if (l3.equals(l4)) {
                    }
                    Long l5 = this.total1080phdDurationMs;
                    Long l6 = videoStats.total1080phdDurationMs;
                    if (l5 == null) {
                        if (l6 != null) {
                            return false;
                        }
                    } else if (l5.equals(l6)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AbstractC7608F5v.A02(AnonymousClass006.A0D(this.totalDurationMs)) + AnonymousClass006.A0D(this.total720phdDurationMs)) * 31) + C3cH.A02(this.total1080phdDurationMs);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("VideoStats{totalDurationMs=");
        sbA0x.append(this.totalDurationMs);
        sbA0x.append(",total720phdDurationMs=");
        sbA0x.append(this.total720phdDurationMs);
        sbA0x.append(",total1080phdDurationMs=");
        return BV8.A0v(this.total1080phdDurationMs, sbA0x);
    }

    public VideoStats(Long l, Long l2, Long l3) {
        this.totalDurationMs = l;
        this.total720phdDurationMs = l2;
        this.total1080phdDurationMs = l3;
    }
}
